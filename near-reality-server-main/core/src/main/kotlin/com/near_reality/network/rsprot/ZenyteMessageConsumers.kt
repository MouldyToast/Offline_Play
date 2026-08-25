package com.near_reality.network.rsprot

import com.zenyte.game.world.entity.player.Player
import net.rsprot.protocol.game.incoming.misc.client.MapBuildComplete
import net.rsprot.protocol.game.incoming.misc.client.WindowStatus
import net.rsprot.protocol.message.codec.incoming.GameMessageConsumerRepositoryBuilder
import net.rsprot.protocol.message.codec.incoming.provider.DefaultGameMessageConsumerRepositoryProvider
import net.rsprot.protocol.message.codec.incoming.provider.GameMessageConsumerRepositoryProvider
import org.slf4j.LoggerFactory

/**
 * Registers incoming message consumers with RSProt.
 *
 * Session 11a: Minimal registration — just enough to not crash on
 * packets the client sends during login (MapBuildComplete, WindowStatus).
 *
 * Session 11b fills this out with all ~35 handlers (OpNpc, OpLoc,
 * If3Button, movement, commands, etc.).
 *
 * Drop-in path: core/src/main/kotlin/com/near_reality/network/rsprot/
 */
class ZenyteMessageConsumers {

    private val logger = LoggerFactory.getLogger(ZenyteMessageConsumers::class.java)

    fun get(): GameMessageConsumerRepositoryProvider<Player> {
        val builder = GameMessageConsumerRepositoryBuilder<Player>()

        // Minimal handlers for login flow — client sends these immediately
        builder.addListener(MapBuildComplete::class.java) { _: Player, _: MapBuildComplete ->
            // Client finished loading the map. In Session 11b this
            // dispatches MapBuildComplete to NR's existing handler.
        }

        builder.addListener(WindowStatus::class.java) { _: Player, _: WindowStatus ->
            // Client reports window size/mode. No-op for now.
        }

        return DefaultGameMessageConsumerRepositoryProvider(builder.build())
    }
}
