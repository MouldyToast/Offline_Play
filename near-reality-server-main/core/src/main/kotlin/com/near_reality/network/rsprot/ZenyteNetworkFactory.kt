package com.near_reality.network.rsprot

import com.near_reality.crypto.Rsa
import com.near_reality.game.util.Huffman
import com.near_reality.game.util.HuffmanManager
import com.near_reality.network.js5.JS5Responses
import com.zenyte.CacheManager
import com.zenyte.game.GameConstants
import com.zenyte.game.world.World
import com.zenyte.game.world.entity.player.Player
import io.netty.buffer.Unpooled
import net.rsprot.compression.HuffmanCodec
import net.rsprot.compression.provider.DefaultHuffmanCodecProvider
import net.rsprot.compression.provider.HuffmanCodecProvider
import net.rsprot.crypto.rsa.RsaKeyPair
import net.rsprot.protocol.api.AbstractNetworkServiceFactory
import net.rsprot.protocol.api.GameConnectionHandler
import net.rsprot.protocol.api.bootstrap.BootstrapBuilder
import net.rsprot.protocol.api.handlers.ExceptionHandlers
import net.rsprot.protocol.api.js5.Js5GroupProvider
import net.rsprot.protocol.api.suppliers.NpcInfoSupplier
import net.rsprot.protocol.api.suppliers.WorldEntityInfoSupplier
import net.rsprot.protocol.common.client.OldSchoolClientType
import net.rsprot.protocol.message.codec.incoming.provider.GameMessageConsumerRepositoryProvider

/**
 * RSProt network factory for the NR server.
 *
 * Mirrors OpenRune's `NetworkFactory.kt` but adapted for NR's
 * traditional (non-Guice) architecture and existing subsystems:
 *   - RSA exponent/modulus from Rsa.kt (hardcoded BigInteger, no PEM)
 *   - Huffman data from HuffmanManager (loaded from cache during GameLoader.load())
 *   - JS5 responses from JS5Responses (pre-encoded cache data)
 *   - No OpenRune Central, no DB auth
 *
 * Drop-in path: core/src/main/kotlin/com/near_reality/network/rsprot/
 */
@OptIn(ExperimentalUnsignedTypes::class)
class ZenyteNetworkFactory(
    private val connectionHandler: ZenyteConnectionHandler,
    private val messageConsumerProvider: ZenyteMessageConsumers,
) : AbstractNetworkServiceFactory<Player>() {

    private val port = GameConstants.WORLD_PROFILE.port
    private val worldID = GameConstants.WORLD_PROFILE.number

    override val ports: List<Int> = listOf(
        port,
        443,
        40000 + worldID,
        50000 + worldID,
    )

    override val supportedClientTypes: List<OldSchoolClientType> =
        listOf(OldSchoolClientType.DESKTOP)

    override fun getRsaKeyPair(): RsaKeyPair {
        // NR hardcodes exponent + modulus in com.near_reality.crypto.Rsa
        return RsaKeyPair(Rsa.EXPONENT, Rsa.MODULUS)
    }

    override fun getHuffmanCodecProvider(): HuffmanCodecProvider {
        val cache = CacheManager.getCache()
        val archive = cache.getArchive(mgi.tools.jagcached.ArchiveType.BINARY)
        val group = archive.findGroupByName("huffman")
        val frequencies = group.findFileByID(0).data.buffer
        val codec = HuffmanCodec.create(Unpooled.wrappedBuffer(frequencies))
        return DefaultHuffmanCodecProvider(codec)
    }

    override fun getJs5GroupProvider(): Js5GroupProvider {
        return ZenyteJs5GroupProvider()
    }

    override fun getNpcInfoSupplier(): NpcInfoSupplier {
        return ZenyteNpcSupplier.provide()
    }

    override fun getWorldEntityInfoSupplier(): WorldEntityInfoSupplier {
        return ZenyteWorldEntityProvider.provide()
    }

    override fun getExceptionHandlers(): ExceptionHandlers<Player> {
        return ZenyteExceptionHandlers.provide()
    }

    override fun getGameConnectionHandler(): GameConnectionHandler<Player> {
        return connectionHandler
    }

    override fun getGameMessageConsumerRepositoryProvider():
        GameMessageConsumerRepositoryProvider<Player> {
        return messageConsumerProvider.get()
    }

    // Use NIO only — matches OpenRune sailing branch approach
    override fun getBootstrapBuilder(): BootstrapBuilder =
        BootstrapBuilder().eventLoopGroupTypes(BootstrapBuilder.EventLoopGroupType.NIO)
}
