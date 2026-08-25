package com.near_reality.network.rsprot

import com.zenyte.game.world.entity.player.Player
import net.rsprot.protocol.api.NetworkService

/**
 * Process-wide handle to the RSProt [NetworkService] built in Main.kt.
 *
 * WorldThread needs it once per tick to run `infoProtocols.update()`, and logout
 * needs it to dealloc a player's [net.rsprot.protocol.game.outgoing.info.Infos].
 *
 * Drop-in path: core/src/main/kotlin/com/near_reality/network/rsprot/RspService.kt
 */
object RspService {

    @JvmStatic
    lateinit var service: NetworkService<Player>

    @JvmStatic
    fun isReady(): Boolean = ::service.isInitialized

    /**
     * Runs the RSProt info protocol computation for every allocated player.
     * MUST be called exactly once per game tick on the World Thread, after every
     * player's coords/appearance have been pushed via [ZenyteRspClient.preUpdate]
     * and before any [ZenyteRspClient.flushInfo] call.
     */
    @JvmStatic
    fun updateInfoProtocols() {
        if (!isReady()) return
        service.infoProtocols.update()
    }
}
