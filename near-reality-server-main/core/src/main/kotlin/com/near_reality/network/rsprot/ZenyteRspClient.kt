package com.near_reality.network.rsprot

import com.zenyte.game.world.entity.player.Player
import com.zenyte.net.Session
import com.zenyte.net.game.ServerEvent
import net.rsprot.protocol.api.NetworkService
import net.rsprot.protocol.api.Session as RspSession
import net.rsprot.protocol.game.outgoing.info.Infos
import net.rsprot.protocol.message.OutgoingGameMessage
import org.slf4j.LoggerFactory

/**
 * Bridges RSProt's [RspSession] to NR's [Session] interface.
 *
 * This is what [Player.getSession] returns after RSProt login.
 * All 900+ call sites that use `player.session.send(...)` go through here.
 *
 * In Session 11a (foundation), `send(ServerEvent)` is a no-op because the old
 * [com.zenyte.game.packet.GamePacketEncoder] objects can't be sent through RSProt.
 * Session 11c replaces PacketDispatcher internals to queue RSProt [OutgoingGameMessage]
 * objects instead, at which point `send()` is never called with old encoder objects.
 *
 * The [queue] method is the RSProt-native path used by the rewritten PacketDispatcher.
 *
 * Drop-in path: core/src/main/kotlin/com/near_reality/network/rsprot/
 */
@OptIn(ExperimentalUnsignedTypes::class)
class ZenyteRspClient(
    val rspSession: RspSession<Player>,
    val infos: Infos,
) : Session {

    private val logger = LoggerFactory.getLogger(ZenyteRspClient::class.java)

    // --- NR Session interface ---

    override fun getHostAddress(): String {
        return rspSession.inetAddress ?: "0.0.0.0"
    }

    /**
     * Drains incoming packets from RSProt and dispatches them to the player.
     * Called once per tick from WorldThread -> WorldSubHandler.process() equivalent.
     *
     * In Session 11a this returns true (no incoming packets wired yet — that's 11b).
     * In Session 11b, this calls rspSession.processIncomingPackets(player).
     */
    override fun process(): Boolean {
        // Session 11b will add: rspSession.processIncomingPackets(player)
        return true
    }

    /**
     * Legacy send path for old [GamePacketEncoder] objects.
     *
     * In Session 11a/11b this is a no-op — old encoders can't produce RSProt messages.
     * In Session 11c, PacketDispatcher is rewritten to call [queue] instead,
     * so this method is never reached for real packets.
     */
    override fun send(event: ServerEvent): Boolean {
        // Old encoder path — not usable with RSProt.
        // Will be removed once PacketDispatcher is rewritten (Session 11c).
        return true
    }

    override fun flush() {
        rspSession.flush()
    }

    override fun close() {
        rspSession.requestClose()
    }

    override fun isActive(): Boolean {
        return rspSession.ctx.channel().isActive
    }

    override fun isExpired(): Boolean {
        return !isActive()
    }

    // --- RSProt-native methods (used by rewritten PacketDispatcher in 11c) ---

    /**
     * Queue an outgoing RSProt message. This is the path PacketDispatcher
     * will use after Session 11c rewrites its internals.
     */
    fun queue(message: OutgoingGameMessage) {
        rspSession.queue(message)
    }

    /**
     * Deallocate info protocols when the player logs out.
     */
    fun unregister(service: NetworkService<Player>) {
        service.infoProtocols.dealloc(infos)
    }
}