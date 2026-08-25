package com.near_reality.network.rsprot

import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
import it.unimi.dsi.fastutil.ints.IntOpenHashSet
import mgi.tools.jagcached.Helper
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

    /** Name hashes of every group in archive 5, or empty if the cache lib could not read them. */
    private var mapGroupNames: IntOpenHashSet = IntOpenHashSet()

    init {
        load()
        instance = this
    }

    override fun provide(archive: Int, group: Int): ByteBuf? {
        return groups[bitpack(archive, group)]
    }

    private fun load() {
        val path = System.getProperty("osrs.cache.path", OSRS_CACHE_PATH)
        logger.info("Loading real OSRS cache for JS5 from: {}", path)

        val cache = Cache.openCache(path, true)
        val archiveCount = cache.archiveCount
        mapGroupNames = readMapGroupNames(cache)
        if (mapGroupNames.isEmpty()) {
            logger.warn(
                "Archive {} carries no group name hashes — hasMapSquare() will fail open and " +
                    "no login relocation will occur.",
                ARCHIVE_MAPS,
            )
        }

        // Encode regular groups for each archive that exists
        for (archiveId in 0 until archiveCount) {
            val index = cache.getIndex(archiveId) ?: continue
            val archive = cache.getArchive(archiveId) ?: continue
            var highestGroup = -1
            for (groupId in 0..index.groupCount()) {
                val rawData = index.get(groupId)?.buffer ?: continue
                groups[bitpack(archiveId, groupId)] =
                    encodeGroup(archiveId, groupId, rawData, stripVersion = true)
                highestGroup = groupId
            }
            // The client sizes its interface / clientscript tables from these archives.
            // PacketDispatcher uses the counts to skip NR-custom ids the client cannot load.
            when (archiveId) {
                ARCHIVE_INTERFACES -> clientInterfaceCount = highestGroup + 1
                ARCHIVE_CLIENTSCRIPTS -> clientScriptCount = highestGroup + 1
            }
        }

        // Encode archive reference tables (255, archiveId) — the per-archive metadata
        val masterIndex = cache.masterIndex ?: cache.getIndex(255)
        if (masterIndex != null) {
            for (archiveId in 0 until archiveCount) {
                if (cache.getArchive(archiveId) == null) continue
                val refData = masterIndex.get(archiveId)?.buffer ?: continue
                groups[bitpack(255, archiveId)] =
                    encodeGroup(255, archiveId, refData, stripVersion = false)
            }
        }

        // Build master index (255, 255) — list of CRC + version for each archive
        // We build this ourselves to handle null archives gracefully
        // (NR's Cache.generateInformationStoreDescriptor crashes on null archives)
        val masterBuf = buildMasterIndex(cache, archiveCount)
        if (masterBuf != null) {
            groups[bitpack(255, 255)] = Unpooled.unreleasableBuffer(masterBuf)
        }

        logger.info("Loaded {} JS5 responses from real OSRS cache ({} archives, {} interfaces, {} clientscripts)",
            groups.size, archiveCount, clientInterfaceCount, clientScriptCount)
    }

    companion object {
        private const val OSRS_CACHE_PATH = "cache/data/cache-239/cache"

        private const val ARCHIVE_INTERFACES = 3
        private const val ARCHIVE_MAPS = 5
        private const val ARCHIVE_CLIENTSCRIPTS = 12

        @Volatile
        private var instance: ZenyteJs5GroupProvider? = null

        /**
         * True if the cache the CLIENT loads contains terrain for [regionId]
         * (`m{x}_{y}` in archive 5). Fail-open when the provider isn't loaded yet.
         * NR-custom regions (instance space, custom home) return false — the client
         * would hang on "Loading - please wait" if sent there.
         */
        @JvmStatic
        fun hasMapSquare(regionId: Int): Boolean {
            val names = instance?.mapGroupNames ?: return true
            // Fail open: an empty set means we cannot answer, not that the region is absent.
            if (names.isEmpty()) return true
            val x = regionId shr 8
            val y = regionId and 0xFF
            return names.contains(Helper.strToI("m${x}_$y"))
        }

        /**
         * Collects archive 5's group name hashes. Returns empty (fail-open) when the archive is
         * missing or its reference table carries no names — Archive.load only records a name
         * when `groupName >= 0`, so an unset/misread `useNames` flag yields -1 for every group.
         * Never treat empty as "this cache has no maps".
         */
        private fun readMapGroupNames(cache: Cache): IntOpenHashSet {
            val names = IntOpenHashSet(2048)
            val archive = cache.getArchive(ARCHIVE_MAPS) ?: return names
            val groups = archive.groups ?: return names
            for (group in groups) {
                if (group == null) continue
                val name = group.name
                if (name != -1) names.add(name)
            }
            return names
        }

        /** Number of interfaces in the cache the CLIENT loads (0 = unknown). */
        @JvmStatic
        @Volatile
        var clientInterfaceCount: Int = 0
            private set

        /** Number of clientscripts in the cache the CLIENT loads (0 = unknown). */
        @JvmStatic
        @Volatile
        var clientScriptCount: Int = 0
            private set

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

            return encodeGroup(255, 255, container, stripVersion = false)
        }

        /**
         * @param stripVersion drop the trailing 2-byte version that Helper.encodeContainer
         * appends when `isFITContainer` is false. TRUE for every regular group (written via
         * Helper.encodeFilesContainer); FALSE for (255,255) and the (255, archiveId) reference
         * tables (written via Helper.encodeFITContainer, which omits it). Matches OpenRune's
         * CacheJs5GroupProvider.encodeGroupBuffer and RSProt's Js5Service.prepareJs5Buffer
         * ("input byte buffer from the cache, with version information stripped off").
         * Leaving the trailer on desynchronises the client's JS5 stream after the first group.
         */
        private fun encodeGroup(
            archive: Int,
            group: Int,
            data: ByteArray,
            stripVersion: Boolean,
        ): ByteBuf {
            val storedLen = if (stripVersion && data.size >= 2) data.size - 2 else data.size
            if (storedLen < 5) return Unpooled.unreleasableBuffer(Unpooled.EMPTY_BUFFER)

            // First 5 bytes of raw cache data: [compression:1][compressedSize:4]
            val compression = data[0].toInt() and 0xFF
            val compressedSize = ((data[1].toInt() and 0xFF) shl 24) or
                    ((data[2].toInt() and 0xFF) shl 16) or
                    ((data[3].toInt() and 0xFF) shl 8) or
                    (data[4].toInt() and 0xFF)

            // Payload is everything after the 5-byte container header, minus the version trailer
            val payload = data.copyOfRange(5, storedLen)
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
