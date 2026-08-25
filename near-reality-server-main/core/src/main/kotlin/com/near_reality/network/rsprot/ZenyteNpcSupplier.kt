package com.near_reality.network.rsprot

import net.rsprot.protocol.api.suppliers.NpcInfoSupplier
import net.rsprot.protocol.game.outgoing.info.npcinfo.NpcAvatarExceptionHandler
import org.slf4j.LoggerFactory

/**
 * Provides the NPC info supplier for RSProt's NpcInfo protocol.
 *
 * Drop-in path: core/src/main/kotlin/com/near_reality/network/rsprot/
 */
object ZenyteNpcSupplier {

    private val logger = LoggerFactory.getLogger(ZenyteNpcSupplier::class.java)

    fun provide(): NpcInfoSupplier = NpcInfoSupplier(ExceptionHandler)

    private object ExceptionHandler : NpcAvatarExceptionHandler {
        override fun exceptionCaught(index: Int, exception: Exception) {
            logger.error("NPC avatar exception at index $index", exception)
        }
    }
}
