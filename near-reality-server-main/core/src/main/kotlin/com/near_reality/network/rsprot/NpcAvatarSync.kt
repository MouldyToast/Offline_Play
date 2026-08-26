package com.near_reality.network.rsprot

import com.zenyte.game.util.Utils
import com.zenyte.game.world.entity.masks.UpdateFlag
import com.zenyte.game.world.entity.npc.NPC
import net.rsprot.protocol.game.outgoing.info.npcinfo.NpcAvatar

/**
 * Per-tick bridge: reads NR's NPC state (movement, update flags, mask data)
 * and pushes it into the RSProt [NpcAvatar] so that `infoProtocols.update()`
 * can build the correct NPC_INFO packet for every observing player.
 *
 * Called from WorldThread, after all NPCs have processed (`processNPCs`) and
 * before `RspService.updateInfoProtocols()`.
 *
 * Direction deltas: NR movement directions use indices 0-7 which map to
 * `Utils.DIRECTION_DELTA_X` / `Utils.DIRECTION_DELTA_Y`:
 *   0=SW(-1,-1), 1=S(0,-1), 2=SE(1,-1), 3=W(-1,0),
 *   4=E(1,0), 5=NW(-1,1), 6=N(0,1), 7=NE(1,1)
 */
object NpcAvatarSync {

    @JvmStatic
    fun sync(npc: NPC, avatar: NpcAvatar) {
        syncMovement(npc, avatar)
        syncExtendedInfo(npc, avatar)
    }

    private fun syncMovement(npc: NPC, avatar: NpcAvatar) {
        when {
            npc.isTeleported -> {
                avatar.teleport(npc.plane, npc.x, npc.y, true)
            }
            npc.crawlDirection != -1 -> {
                val dir = npc.crawlDirection
                if (dir in 0..7) {
                    avatar.crawl(
                        Utils.DIRECTION_DELTA_X[dir].toInt(),
                        Utils.DIRECTION_DELTA_Y[dir].toInt(),
                    )
                }
            }
            npc.walkDirection != -1 -> {
                val walkDir = npc.walkDirection
                if (walkDir in 0..7) {
                    avatar.walk(
                        Utils.DIRECTION_DELTA_X[walkDir].toInt(),
                        Utils.DIRECTION_DELTA_Y[walkDir].toInt(),
                    )
                }
                val runDir = npc.runDirection
                if (runDir in 0..7) {
                    avatar.walk(
                        Utils.DIRECTION_DELTA_X[runDir].toInt(),
                        Utils.DIRECTION_DELTA_Y[runDir].toInt(),
                    )
                }
            }
        }
    }

    private fun syncExtendedInfo(npc: NPC, avatar: NpcAvatar) {
        val flags = npc.updateFlags
        val info = avatar.extendedInfo

        // -- Animation --
        if (flags.get(UpdateFlag.ANIMATION)) {
            val anim = npc.animation
            if (anim != null) {
                info.setSequence(anim.id, anim.delay)
            } else {
                info.setSequence(-1, 0)
            }
        }

        // -- Graphics / spot anim --
        if (flags.get(UpdateFlag.GRAPHICS)) {
            val gfx = npc.graphics
            if (gfx != null) {
                info.setSpotAnim(0, gfx.id, gfx.delay, gfx.height)
            }
        }

        // -- Face entity --
        // NR faceEntity: -1 = none, 0..32767 = NPC index, 32768+ = player (index + 32768).
        if (flags.get(UpdateFlag.FACE_ENTITY)) {
            val fe = npc.faceEntity
            when {
                fe == -1   -> info.resetFacing()
                fe < 32768 -> info.setFaceNpc(fe, false, 0, 0)
                else       -> info.setFacePlayer(fe - 32768, false, 0, 0)
            }
        }

        // -- Face coordinate --
        // NR computes `direction` (0-2047 face angle) alongside faceLocation. Pass directly.
        if (flags.get(UpdateFlag.FACE_COORDINATE)) {
            info.setFaceAngle(npc.direction, false)
        }

        // -- Forced chat --
        if (flags.get(UpdateFlag.FORCED_CHAT)) {
            val ft = npc.forceTalk
            if (ft != null) {
                info.setSay(ft.text)
            }
        }

        // -- Hits + headbars --
        if (flags.get(UpdateFlag.HIT)) {
            for (hit in npc.nextHits) {
                val splat = hit.appliedSplat
                // NPC addHitMark has no selfType parameter (differs from player).
                info.addHitMark(
                    /* sourceIndex */ -1,
                    /* sourceType */  splat.id,
                    /* otherType */   splat.dynamicId,
                    /* value */       hit.damage,
                    /* delay */       hit.delay,
                )
            }
            for (bar in npc.hitBars) {
                info.addHeadBar(
                    /* sourceIndex */ -1,
                    /* sourceType */  bar.type,
                    /* otherType */   bar.type,
                    /* startFill */   bar.percentage,
                    /* endFill */     bar.interpolatePercentage(),
                    /* startTime */   0,
                    /* endTime */     bar.interpolateTime(),
                )
            }
        }

        // -- Force movement (exact move) --
        if (flags.get(UpdateFlag.FORCE_MOVEMENT)) {
            val fm = npc.forceMovement
            if (fm != null) {
                val first = fm.toFirstTile
                val second = fm.toSecondTile
                val nx = npc.x
                val ny = npc.y
                info.setExactMove(
                    /* deltaX1 */ if (first != null) first.x - nx else 0,
                    /* deltaZ1 */ if (first != null) first.y - ny else 0,
                    /* delay1 */  fm.firstTileTicketDelay,
                    /* deltaX2 */ if (second != null) second.x - nx else 0,
                    /* deltaZ2 */ if (second != null) second.y - ny else 0,
                    /* delay2 */  fm.secondTileTicketDelay,
                    /* angle */   fm.direction,
                )
            }
        }

        // -- Transformation (NPC transmog) --
        if (flags.get(UpdateFlag.TRANSFORMATION)) {
            avatar.setId(npc.id)
            info.setTransmogrification(npc.id)
        }

        // -- Tinting --
        if (flags.get(UpdateFlag.TINTING)) {
            val tint = npc.tinting
            if (tint != null) {
                info.setTinting(
                    tint.delay,
                    tint.duration,
                    tint.hue,
                    tint.saturation,
                    tint.luminance,
                    tint.opacity,
                )
            }
        }
    }
}