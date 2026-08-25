package com.near_reality.network.rsprot

import com.zenyte.game.world.World
import com.zenyte.game.world.entity.masks.UpdateFlag
import com.zenyte.game.world.entity.player.Player
import com.zenyte.game.world.entity.player.PlayerSkulls
import com.zenyte.game.world.entity.player.container.impl.equipment.EquipmentType
import com.zenyte.game.world.region.DynamicRegion
import com.zenyte.net.Session
import com.zenyte.net.game.ServerEvent
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
import mgi.types.config.items.ItemDefinitions
import net.rsprot.protocol.api.NetworkService
import net.rsprot.protocol.api.util.ZonePartialEnclosedCacheBuffer
import net.rsprot.protocol.common.client.OldSchoolClientType
import net.rsprot.protocol.api.Session as RspSession
import net.rsprot.protocol.game.outgoing.info.Infos
import net.rsprot.protocol.game.outgoing.info.npcinfo.NpcInfoPacket
import net.rsprot.protocol.game.outgoing.info.playerinfo.PlayerAvatarExtendedInfo
import net.rsprot.protocol.game.outgoing.info.util.PacketResult
import net.rsprot.protocol.game.outgoing.info.util.getOrThrow
import net.rsprot.protocol.game.outgoing.info.util.isEmpty
import net.rsprot.protocol.game.outgoing.info.util.safeReleaseOrThrow
import net.rsprot.protocol.game.outgoing.map.RebuildLoginV2
import net.rsprot.protocol.game.outgoing.map.RebuildNormalV2
import net.rsprot.protocol.game.outgoing.map.RebuildRegionV2
import net.rsprot.protocol.game.outgoing.map.util.RebuildRegionZone
import net.rsprot.protocol.game.outgoing.zone.header.UpdateZonePartialEnclosed
import net.rsprot.protocol.message.OutgoingGameMessage
import net.rsprot.protocol.message.ZoneProt
import org.slf4j.LoggerFactory

/**
 * Bridges RSProt's [RspSession] to NR's [Session] interface, and owns the per-player
 * RSProt state that NR's old PlayerInfo/NPCInfo/zoneFollowPackets used to own.
 *
 * Per-tick contract (driven by WorldThread.processPlayerEntityUpdate):
 *
 *   1. [preUpdate]  — push coords + appearance into RSProt's avatar   (every player)
 *   2. RspService.updateInfoProtocols()                                (once, globally)
 *   3. Player.processEntityUpdate()  → [flushInfo] + [flushZones]      (every player)
 *   4. [flush]                                                         (every player)
 *
 * Session 11c replaces the 11a/11b no-op `send()` path: PacketDispatcher now calls
 * [queue] with RSProt messages directly, so `send(ServerEvent)` is only ever reached by
 * stray legacy `player.send(new XxxEncoder())` call sites, which are logged and dropped.
 *
 * Drop-in path: core/src/main/kotlin/com/near_reality/network/rsprot/ZenyteRspClient.kt
 */
@OptIn(ExperimentalUnsignedTypes::class)
class ZenyteRspClient(
    val rspSession: RspSession<Player>,
    val infos: Infos,
) : Session {

    /** Set by ZenyteConnectionHandler after login completes. */
    lateinit var player: Player

    private val logger = LoggerFactory.getLogger(ZenyteRspClient::class.java)

    private val enclosedCache: ZonePartialEnclosedCacheBuffer
        get() = sharedEnclosedCache

    /** Pending zone payloads keyed by NR chunk hash: `chunkX | chunkY << 11`. */
    private val zoneQueue = Int2ObjectOpenHashMap<MutableList<ZoneProt>>()

    private var appearanceSynced = false

    private val extendedInfo: PlayerAvatarExtendedInfo
        get() = infos.playerInfo.avatar.extendedInfo

    // ------------------------------------------------------------------
    // NR Session interface
    // ------------------------------------------------------------------

    override fun getHostAddress(): String = rspSession.inetAddress ?: "0.0.0.0"

    /**
     * Drains incoming packets from RSProt and dispatches them to the player.
     * Called once per tick from WorldThread.processPlayerSessions().
     */
    override fun process(): Boolean {
        rspSession.processIncomingPackets(player)
        return true
    }

    /**
     * Legacy encoder path. PacketDispatcher no longer uses it; anything that still
     * arrives here is a direct `player.send(new OldEncoder())` call site that needs
     * migrating (see handoff "Known remaining legacy send() call sites").
     */
    override fun send(event: ServerEvent): Boolean {
        logger.debug("Dropped legacy encoder {} for {}", event.javaClass.simpleName, getHostAddress())
        return true
    }

    override fun flush() = rspSession.flush()

    override fun close() {
        rspSession.requestClose()
    }

    override fun isActive(): Boolean = rspSession.ctx.channel().isActive

    override fun isExpired(): Boolean = !isActive()

    // ------------------------------------------------------------------
    // Outgoing
    // ------------------------------------------------------------------

    /** Queue an outgoing RSProt message. This is the path PacketDispatcher uses. */
    fun queue(message: OutgoingGameMessage) = rspSession.queue(message)

    /**
     * Queue a zone payload for the chunk containing ([tileX], [tileY]).
     * Flushed by [flushZones] inside an `UpdateZonePartialEnclosed` payload buffer.
     */
    fun queueZone(tileX: Int, tileY: Int, prot: ZoneProt) {
        val hash = (tileX shr 3) or ((tileY shr 3) shl 11)
        zoneQueue.getOrPut(hash) { ArrayList(4) }.add(prot)
    }

    fun clearZones() = zoneQueue.clear()

    /**
     * Emits every pending zone payload. Zone headers are relative to the build-area
     * base (last loaded map region tile, chunk - 6), in tiles, exactly as OpenRune's
     * PlayerZoneUpdateProcessor computes `deltaX = zoneBase.x - buildArea.x`.
     */
    fun flushZones(player: Player) {
        if (zoneQueue.isEmpty()) return
        val base = player.lastLoadedMapRegionTile
        if (base == null) {
            zoneQueue.clear()
            return
        }
        val baseX = (base.chunkX - 6) shl 3
        val baseY = (base.chunkY - 6) shl 3
        val level = player.plane
        for (entry in zoneQueue.int2ObjectEntrySet()) {
            val key = entry.intKey
            val dx = ((key and 2047) shl 3) - baseX
            val dz = (((key shr 11) and 2047) shl 3) - baseY
            // Zone must sit inside the 104x104 build area.
            if (dx < 0 || dx > 96 || dz < 0 || dz > 96) continue
            val prots = entry.value
            if (prots.isEmpty()) continue
            // RSProt 239 rejects raw zone payloads queued to the session — they must be encoded
            // into an UpdateZonePartialEnclosed payload buffer first. computeZoneForClient builds
            // that ByteBuf; enclosedCache.releaseBuffers() frees it at end of tick (releaseTick()).
            val buffer = enclosedCache.computeZoneForClient(OldSchoolClientType.DESKTOP, prots)
            rspSession.queue(UpdateZonePartialEnclosed(dx, dz, level, buffer))
        }
        zoneQueue.clear()
    }

    // ------------------------------------------------------------------
    // Map rebuilds
    // ------------------------------------------------------------------

    private fun syncBuildArea(player: Player) {
        val tile = player.lastLoadedMapRegionTile ?: return
        infos.updateRootBuildArea(
            (tile.chunkX - 6).coerceAtLeast(0),
            (tile.chunkY - 6).coerceAtLeast(0),
        )
    }

    /**
     * Login rebuild. Replaces the `RebuildNormal(player, init = true)` block that NR's
     * LoginRequest used to embed in the login response. Must be called on the World
     * Thread after `player.loadMapRegions(true)`.
     */
    fun rebuildLogin(player: Player) {
        infos.updateRootCoord(player.plane, player.x, player.y)
        syncBuildArea(player)
        rspSession.queue(RebuildLoginV2(player.x shr 3, player.y shr 3, WORLD_AREA, infos.playerInfo))
    }

    /** Static map rebuild (PacketDispatcher.sendStaticMapRegion). */
    fun rebuildNormal(player: Player) {
        syncBuildArea(player)
        rspSession.queue(RebuildNormalV2(player.x shr 3, player.y shr 3, WORLD_AREA))
    }

    /** Dynamic/instance rebuild (PacketDispatcher.sendDynamicMapRegion). */
    fun rebuildRegion(player: Player, reload: Boolean) {
        syncBuildArea(player)
        rspSession.queue(RebuildRegionV2(player.x shr 3, player.y shr 3, reload, regionZoneProvider))
    }

    /** Mirrors the old RebuildRegion encoder's per-chunk lookup, minus XTEAs (gone in rev 239). */
    private val regionZoneProvider = RebuildRegionV2.RebuildRegionZoneProvider { zoneX, zoneZ, level ->
        val regionId = ((zoneX shr 3) shl 8) + (zoneZ shr 3)
        val region = World.getRegions()[regionId]
        if (region != null && DynamicRegion.isDynamicRegion(region)) {
            val hash = (region as DynamicRegion).getLocationHash(zoneX and 7, zoneZ and 7, level)
            val dx = hash and 2047
            val dz = (hash shr 11) and 2047
            if (dx == 0 && dz == 0) {
                null
            } else {
                RebuildRegionZone(dx, dz, (hash shr 22) and 3, (hash shr 24) and 3)
            }
        } else {
            RebuildRegionZone(zoneX, zoneZ, level, 0)
        }
    }

    // ------------------------------------------------------------------
    // Info protocol cycle
    // ------------------------------------------------------------------

    /**
     * Step 1 of the tick: push this player's current state into RSProt's avatar.
     * Must run for every player BEFORE RspService.updateInfoProtocols().
     */
    fun preUpdate(player: Player) {
        infos.updateRootCoord(player.plane, player.x, player.y)
        if (!appearanceSynced || player.updateFlags.get(UpdateFlag.APPEARANCE)) {
            syncAppearance(player)
            appearanceSynced = true
        }
        // Session 11d: animation, spotanim, chat, face-entity, hits, force-movement masks go here.
    }

    /**
     * Step 3 of the tick: queue the computed info packets. Order mirrors OpenRune's RspCycle.flush.
     */
    fun flushInfo() {
        val packets = infos.getPackets()
        val root = packets.rootWorldInfoPackets
        rspSession.queue(root.activeWorld)
        rspSession.queue(root.npcUpdateOrigin)
        rspSession.queue(root.worldEntityInfo.getOrThrow())
        rspSession.queue(root.playerInfo.getOrThrow())
        queueNpcInfo(root.npcInfo)
        for (world in packets.activeWorlds) {
            // NR has no world entities; loop kept for protocol correctness if one ever appears.
            rspSession.queue(world.activeWorld)
            rspSession.queue(world.npcUpdateOrigin)
            queueNpcInfo(world.npcInfo)
        }
        rspSession.queue(root.activeWorld)
    }

    /**
     * Release this tick's info buffers without sending them. Used for players that were
     * skipped (logging out / not initialised) so RSProt's pooled buffers don't leak.
     */
    fun releaseInfo() {
        val packets = infos.getPackets()
        val root = packets.rootWorldInfoPackets
        root.worldEntityInfo.getOrThrow().safeRelease()
        root.playerInfo.getOrThrow().safeRelease()
        releaseNpcInfo(root.npcInfo)
        for (world in packets.activeWorlds) {
            releaseNpcInfo(world.npcInfo)
        }
    }

    private fun queueNpcInfo(result: PacketResult<NpcInfoPacket>) {
        if (result.isEmpty()) {
            result.safeReleaseOrThrow()
            return
        }
        rspSession.queue(result.getOrThrow())
    }

    private fun releaseNpcInfo(result: PacketResult<NpcInfoPacket>) {
        if (result.isEmpty()) {
            result.safeReleaseOrThrow()
            return
        }
        result.getOrThrow().safeRelease()
    }

    /** Deallocate info protocols when the player logs out. */
    fun unregister(service: NetworkService<Player>) {
        service.infoProtocols.dealloc(infos)
    }

    // ------------------------------------------------------------------
    // Appearance (port of Appearance.writeAppearanceData)
    // ------------------------------------------------------------------

    private fun syncAppearance(player: Player) {
        val app = player.appearance
        val info = extendedInfo

        info.setName(player.name)
        info.setCombatLevel(player.skills.combatLevel)
        info.setSkullIcon(PlayerSkulls.getSkull(player))
        info.setOverheadIcon(app.headIcon.toInt())
        info.setMale(app.isMale)
        info.setHidden(app.isInvisible)

        val npcId = app.npcId
        if (npcId != -1) {
            info.setTransmogrification(npcId)
        } else {
            info.setTransmogrification(-1)
            syncBody(player)
        }

        val colours = app.colours
        for (i in colours.indices) {
            info.setColour(i, colours[i].toInt() and 0xFF)
        }

        // NR RenderAnimation -> RSProt base animation set (ready, turn, walk, back, left, right, run).
        val anim = app.renderAnimation
        info.setBaseAnimationSet(
            anim.stand, anim.standTurn, anim.walk,
            anim.rotate180, anim.rotate90, anim.rotate270, anim.run,
        )
    }

    /**
     * Worn objects + ident kit. NR's appearance[] indices (0 hair, 1 beard, 2 body, 3 arms,
     * 4 gloves, 5 legs, 6 boots) map 1:1 onto RSProt ident kit slots. Worn-obj wearpos2/3
     * reproduce NR's "full helm hides hair / full mask hides beard / full body hides arms /
     * full legs hides boots" rules by naming the ident-kit wearpos the item covers.
     */
    private fun syncBody(player: Player) {
        val app = player.appearance
        val info = extendedInfo

        if (app.isInvisible || app.isHideEquipment) {
            for (wearpos in 0 until 12) info.setWornObj(wearpos, -1, -1, -1)
            for (slot in 0 until 7) info.setIdentKit(slot, -1)
            return
        }

        val kit = app.appearance
        for (slot in 0 until 7) {
            info.setIdentKit(slot, kit[slot].toInt())
        }

        // Simple slots: 1 cape, 2 amulet, 3 weapon, 5 shield.
        for (wearpos in intArrayOf(WEARPOS_CAPE, WEARPOS_AMULET, WEARPOS_WEAPON, WEARPOS_SHIELD)) {
            info.setWornObj(wearpos, app.getId(wearpos), -1, -1)
        }

        val helm = app.getId(WEARPOS_HEAD)
        val helmType = equipmentType(helm)
        info.setWornObj(
            WEARPOS_HEAD, helm,
            if (helm != -1 && helmType != EquipmentType.DEFAULT) WEARPOS_HAIR else -1,
            if (helm != -1 && helmType == EquipmentType.FULL_MASK) WEARPOS_BEARD else -1,
        )

        val body = app.getId(WEARPOS_BODY)
        info.setWornObj(
            WEARPOS_BODY, body,
            if (body != -1 && equipmentType(body) == EquipmentType.FULL_BODY) WEARPOS_ARMS else -1,
            -1,
        )

        val legs = app.getId(WEARPOS_LEGS)
        info.setWornObj(
            WEARPOS_LEGS, legs,
            if (legs != -1 && equipmentType(legs) == EquipmentType.FULL_LEGS) WEARPOS_FEET else -1,
            -1,
        )

        info.setWornObj(WEARPOS_HANDS, app.getId(WEARPOS_HANDS), -1, -1)
        info.setWornObj(WEARPOS_FEET, app.getId(WEARPOS_FEET), -1, -1)
    }

    private fun equipmentType(itemId: Int): EquipmentType? =
        if (itemId == -1) null else ItemDefinitions.get(itemId)?.equipmentType

    companion object {
        /**
         * Shared UpdateZonePartialEnclosed payload builder. RSProt reuses these buffers across
         * players within a tick and frees them all at once via [releaseTick]. Only ever touched
         * on the World Thread, so a single process-wide instance is safe.
         */
        private val sharedEnclosedCache = ZonePartialEnclosedCacheBuffer()

        /**
         * Release every enclosed zone buffer computed this tick. MUST be called once per tick on
         * the World Thread, AFTER every player has flushed (WorldThread.processPlayerEntityUpdate).
         */
        @JvmStatic
        fun releaseTick() {
            sharedEnclosedCache.releaseBuffers()
        }

        /** OpenRune passes -1 for the root world. */
        private const val WORLD_AREA = -1

        // OSRS wearpos ids.
        private const val WEARPOS_HEAD = 0
        private const val WEARPOS_CAPE = 1
        private const val WEARPOS_AMULET = 2
        private const val WEARPOS_WEAPON = 3
        private const val WEARPOS_BODY = 4
        private const val WEARPOS_SHIELD = 5
        private const val WEARPOS_ARMS = 6
        private const val WEARPOS_LEGS = 7
        private const val WEARPOS_HAIR = 8
        private const val WEARPOS_HANDS = 9
        private const val WEARPOS_FEET = 10
        private const val WEARPOS_BEARD = 11
    }
}
