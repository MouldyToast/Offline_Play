package com.near_reality.network.rsprot

import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
import mgi.tools.jagcached.cache.Cache
import net.rsprot.protocol.api.js5.Js5GroupProvider
import org.slf4j.LoggerFactory
import kotlin.math.min

/**
 * JS5 group provider for RSProt rev-239.
 *
 * Serves the REAL OSRS rev-239 cache to the client. Uses the 8-byte
 * header format that rev-239 clients expect:
 *   [archive:1][group:2][compression:1][compressedSize:4] = 8 bytes
 * followed by payload split into 512-byte blocks with 0xFF separators.
 *
 * This matches the working Python rsprox-py server's encode_js5_response.
 *
 * Set [OSRS_CACHE_PATH] to the real OSRS rev-239 cache directory
 * (the folder containing main_file_cache.dat2 and .idx files).
 * Override at runtime with -Dosrs.cache.path=...
 *
 * Drop-in path: core/src/main/kotlin/com/near_reality/network/rsprot/
 */
class ZenyteJs5GroupProvider : Js5GroupProvider {

    private val logger = LoggerFactory.getLogger(ZenyteJs5GroupProvider::class.java)
    private val groups = Int2ObjectOpenHashMap<ByteBuf>(131_072)

    init {
        load()
    }

    override fun provide(archive: Int, group: Int): ByteBuf? {
        return groups[bitpack(archive, group)]
    }

    private fun load() {
        val path = System.getProperty("osrs.cache.path", OSRS_CACHE_PATH)
        logger.info("Loading real OSRS cache for JS5 from: {}", path)

        val cache = Cache.openCache(path, true)
        val archiveCount = cache.archiveCount

        // Encode regular groups for each archive that exists
        for (archiveId in 0 until archiveCount) {
            val index = cache.getIndex(archiveId) ?: continue
            val archive = cache.getArchive(archiveId) ?: continue
            for (groupId in 0..index.groupCount()) {
                val rawData = index.get(groupId)?.buffer ?: continue
                groups[bitpack(archiveId, groupId)] = encodeGroup(archiveId, groupId, rawData)
            }
        }

        // Encode archive reference tables (255, archiveId) — the per-archive metadata
        val masterIndex = cache.masterIndex ?: cache.getIndex(255)
        if (masterIndex != null) {
            for (archiveId in 0 until archiveCount) {
                if (cache.getArchive(archiveId) == null) continue
                val refData = masterIndex.get(archiveId)?.buffer ?: continue
                groups[bitpack(255, archiveId)] = encodeGroup(255, archiveId, refData)
            }
        }

        // Build master index (255, 255) — list of CRC + version for each archive
        // We build this ourselves to handle null archives gracefully
        // (NR's Cache.generateInformationStoreDescriptor crashes on null archives)
        val masterBuf = buildMasterIndex(cache, archiveCount)
        if (masterBuf != null) {
            groups[bitpack(255, 255)] = Unpooled.unreleasableBuffer(masterBuf)
        }

        logger.info("Loaded {} JS5 responses from real OSRS cache ({} archives)", groups.size, archiveCount)
    }

    companion object {
        private const val OSRS_CACHE_PATH = "cache/data/cache-239/cache"

        // Rev-239: 8-byte header [archive:1][group:2][compression:1][compressedSize:4]
        private const val HEADER_SIZE = 8

        /**
         * Build the master index (255,255) without crashing on null archives.
         * Format: for each archive, [crc:4][version:4]. Then wrapped as a
         * cache container (compression type 0, no compression).
         */
        private fun buildMasterIndex(cache: Cache, archiveCount: Int): ByteBuf? {
            // Collect CRC and version for each archive
            val entryData = ByteArray(archiveCount * 8)
            for (i in 0 until archiveCount) {
                val archive = cache.getArchive(i)
                val crc = archive?.getCRC32() ?: 0
                val version = archive?.getVersion() ?: 0
                // Big-endian int writes
                entryData[i * 8 + 0] = (crc ushr 24).toByte()
                entryData[i * 8 + 1] = (crc ushr 16).toByte()
                entryData[i * 8 + 2] = (crc ushr 8).toByte()
                entryData[i * 8 + 3] = crc.toByte()
                entryData[i * 8 + 4] = (version ushr 24).toByte()
                entryData[i * 8 + 5] = (version ushr 16).toByte()
                entryData[i * 8 + 6] = (version ushr 8).toByte()
                entryData[i * 8 + 7] = version.toByte()
            }

            // Wrap as uncompressed container: [compression=0:1][size:4][data...]
            val container = ByteArray(5 + entryData.size)
            container[0] = 0 // no compression
            val size = entryData.size
            container[1] = (size ushr 24).toByte()
            container[2] = (size ushr 16).toByte()
            container[3] = (size ushr 8).toByte()
            container[4] = size.toByte()
            System.arraycopy(entryData, 0, container, 5, entryData.size)

            return encodeGroup(255, 255, container)?.let {
                // encodeGroup already wraps in unreleasableBuffer via the return
                // but we handle it in the caller
                it
            }
        }

        private fun encodeGroup(archive: Int, group: Int, data: ByteArray): ByteBuf {
            if (data.size < 5) return Unpooled.unreleasableBuffer(Unpooled.EMPTY_BUFFER)

            // First 5 bytes of raw cache data: [compression:1][compressedSize:4]
            val compression = data[0].toInt() and 0xFF
            val compressedSize = ((data[1].toInt() and 0xFF) shl 24) or
                    ((data[2].toInt() and 0xFF) shl 16) or
                    ((data[3].toInt() and 0xFF) shl 8) or
                    (data[4].toInt() and 0xFF)

            // Payload is everything after the 5-byte cache container header
            val payload = data.copyOfRange(5, data.size)
            val payloadLen = payload.size

            // Calculate block separators needed
            val firstChunk = min(payloadLen, 512 - HEADER_SIZE)
            val remaining = payloadLen - firstChunk
            val extraBlocks = if (remaining > 0) (remaining + 510) / 511 else 0
            val totalSize = HEADER_SIZE + payloadLen + extraBlocks

            val response = Unpooled.buffer(totalSize)

            // 8-byte header (rev-239 format)
            response.writeByte(archive)
            response.writeShort(group)
            response.writeByte(compression)
            response.writeInt(compressedSize)

            // Write payload in 512-byte blocks with 0xFF separators
            var bytesInBlock = HEADER_SIZE
            for (b in payload) {
                if (bytesInBlock == 512) {
                    response.writeByte(0xFF)
                    bytesInBlock = 1
                }
                response.writeByte(b.toInt() and 0xFF)
                bytesInBlock++
            }

            return Unpooled.unreleasableBuffer(response)
        }

        private fun bitpack(archive: Int, group: Int): Int {
            return ((archive and 0xFF) shl 16) or (group and 0xFFFF)
        }
    }
}