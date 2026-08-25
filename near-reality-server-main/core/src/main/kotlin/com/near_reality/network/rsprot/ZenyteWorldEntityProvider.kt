package com.near_reality.network.rsprot

import net.rsprot.protocol.api.suppliers.WorldEntityInfoSupplier
import net.rsprot.protocol.game.outgoing.info.worldentityinfo.WorldEntityAvatarExceptionHandler

/**
 * Provides the WorldEntity info supplier for RSProt.
 *
 * NR doesn't use world entities (sailing ships, etc.) yet,
 * so this is a no-op exception handler — same as OpenRune's.
 *
 * Drop-in path: core/src/main/kotlin/com/near_reality/network/rsprot/
 */
object ZenyteWorldEntityProvider {

    fun provide(): WorldEntityInfoSupplier = WorldEntityInfoSupplier(ExceptionHandler)

    private object ExceptionHandler : WorldEntityAvatarExceptionHandler {
        override fun exceptionCaught(index: Int, exception: Exception) {
            /* no-op */
        }
    }
}
