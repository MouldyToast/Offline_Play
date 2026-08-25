package com.near_reality.network.rsprot

import io.netty.channel.ChannelHandlerContext
import net.rsprot.protocol.api.ChannelExceptionHandler
import net.rsprot.protocol.api.IncomingGameMessageConsumerExceptionHandler
import net.rsprot.protocol.api.Session
import net.rsprot.protocol.api.handlers.ExceptionHandlers
import net.rsprot.protocol.message.IncomingGameMessage
import com.zenyte.game.world.entity.player.Player
import org.slf4j.LoggerFactory

/**
 * RSProt exception handlers for channel and message consumer errors.
 *
 * Drop-in path: core/src/main/kotlin/com/near_reality/network/rsprot/
 */
object ZenyteExceptionHandlers {

    private val logger = LoggerFactory.getLogger(ZenyteExceptionHandlers::class.java)

    fun provide(): ExceptionHandlers<Player> {
        val channelHandler = ChannelExceptionHandler { _: ChannelHandlerContext, cause: Throwable ->
            logger.error("RSProt channel exception", cause)
        }
        val messageHandler = IncomingGameMessageConsumerExceptionHandler {
            _: Session<Player>, message: IncomingGameMessage, throwable: Throwable ->
            logger.error("RSProt message consumer exception for ${message::class.simpleName}", throwable)
        }
        return ExceptionHandlers(channelHandler, messageHandler)
    }
}
