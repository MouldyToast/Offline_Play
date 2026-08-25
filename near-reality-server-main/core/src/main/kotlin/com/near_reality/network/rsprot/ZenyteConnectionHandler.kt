package com.near_reality.network.rsprot

import com.zenyte.cores.CoresManager
import com.zenyte.game.task.WorldTasksManager
import com.zenyte.game.GameConstants
import com.zenyte.game.world.World
import com.zenyte.game.world.entity.player.Player
import com.zenyte.game.world.entity.player.PlayerInformation
import net.rsprot.crypto.xtea.XteaKey
import net.rsprot.protocol.api.GameConnectionHandler
import net.rsprot.protocol.api.NetworkService
import net.rsprot.protocol.api.login.GameLoginResponseHandler
import net.rsprot.protocol.common.client.OldSchoolClientType
import net.rsprot.protocol.loginprot.incoming.util.AuthenticationType
import net.rsprot.protocol.loginprot.incoming.util.LoginBlock
import net.rsprot.protocol.loginprot.outgoing.LoginResponse
import net.rsprot.protocol.loginprot.outgoing.util.AuthenticatorResponse
import org.slf4j.LoggerFactory

/**
 * RSProt login handler for NR.
 *
 * RSProt handles the full handshake, RSA decryption, XTEA negotiation, and
 * login packet decoding. This handler receives a fully decoded [LoginBlock]
 * and is responsible for:
 *   1. Validating credentials (using NR's existing LoginManager)
 *   2. Creating the [Player] object
 *   3. Calling [GameLoginResponseHandler.writeSuccessfulResponse] with the
 *      [LoginResponse.Ok] and [LoginBlock] to get back a [Session]
 *
 * NR's existing login flow (proof-of-work, MasterHandler pipeline swap)
 * is bypassed entirely — RSProt provides its own pipeline. The file-based
 * player loading still goes through [CoresManager.getLoginManager().load()].
 *
 * Drop-in path: core/src/main/kotlin/com/near_reality/network/rsprot/
 */
@OptIn(ExperimentalUnsignedTypes::class)
class ZenyteConnectionHandler(
    private val networkServiceProvider: () -> NetworkService<Player>,
) : GameConnectionHandler<Player> {

    private val logger = LoggerFactory.getLogger(ZenyteConnectionHandler::class.java)

    override fun onLogin(
        responseHandler: GameLoginResponseHandler<Player>,
        block: LoginBlock<AuthenticationType>,
    ) {
        val username = block.username
        val world = GameConstants.WORLD_PROFILE

        // --- Basic validation ---
        if (username.isNullOrBlank() || username.length > 12) {
            responseHandler.writeFailedResponse(LoginResponse.InvalidUsernameOrPassword)
            return
        }

        if (World.containsPlayer(username)) {
            responseHandler.writeFailedResponse(LoginResponse.Duplicate)
            return
        }

        if (World.isFull()) {
            responseHandler.writeFailedResponse(LoginResponse.ServerFull)
            return
        }

        // Extract password from auth block
        val password = when (val auth = block.authentication) {
            is AuthenticationType.PasswordAuthentication -> auth.password.toString()
            is AuthenticationType.TokenAuthentication -> {
                logger.warn("Token authentication not supported, rejecting: {}", username)
                responseHandler.writeFailedResponse(LoginResponse.InvalidLoginPacket)
                return
            }
            else -> {
                responseHandler.writeFailedResponse(LoginResponse.InvalidLoginPacket)
                return
            }
        }

        // --- Load player via NR's existing LoginManager ---
        val info = PlayerInformation(
            username,
            password,
            1, // display mode (resizable)
            ByteArray(0), // UUID byte[] — empty, not null (PlayerUUID.isEmpty requires non-null)
            null, // HardwareInfo — not available from RSProt login block
        )

        val startTime = System.currentTimeMillis()

        CoresManager.getLoginManager().load(startTime, info) { player ->
            if (player == null) {
                responseHandler.writeFailedResponse(LoginResponse.LoginServerLoadError)
                return@load
            }

            // Password validation for file-based saves
            if (world.verifyPasswords) {
                val savedPassword = player.playerInformation?.plainPassword
                if (savedPassword != null && savedPassword.isNotEmpty() && savedPassword != password) {
                    responseHandler.writeFailedResponse(LoginResponse.InvalidUsernameOrPassword)
                    return@load
                }
            }

            // Whitelist check
            if (world.useWhitelist && !world.whitelistedUsernames.contains(username)) {
                responseHandler.writeFailedResponse(LoginResponse.ClosedBeta)
                return@load
            }

            // Defer to World Thread — RSProt's InfoProtocols.alloc() and
            // World.addPlayer() must run on the communication thread.
            // This mirrors NR's original LoginRequest.postLogin() pattern.
            WorldTasksManager.schedule {
                try {
                    completeLogin(responseHandler, player, block)
                } catch (e: Exception) {
                    logger.error("Failed to complete login for {}", username, e)
                    responseHandler.writeFailedResponse(LoginResponse.LoginServerLoadError)
                }
            }
        }
    }

    private fun completeLogin(
        responseHandler: GameLoginResponseHandler<Player>,
        player: Player,
        block: LoginBlock<AuthenticationType>,
    ) {
        val service = networkServiceProvider()

        // Add player to world — assigns player.index
        val added = World.addPlayer(player)
        if (!added) {
            responseHandler.writeFailedResponse(LoginResponse.ServerFull)
            return
        }

        // Allocate RSProt info protocols for this player slot
        val infos = service.infoProtocols.alloc(player.index, OldSchoolClientType.DESKTOP)

        // Build the login response (matches OSRS login response fields)
        val privilege = player.privilege
        val response = LoginResponse.Ok(
            authenticatorResponse = AuthenticatorResponse.NoAuthenticator,
            staffModLevel = privilege.loginCode,
            playerMod = privilege.isPMod,
            index = player.index,
            member = true,
            accountHash = 0L,
            userId = 0L,
            userHash = 0L,
        )

        // writeSuccessfulResponse sends the login response to the client
        // and returns the RSProt Session<Player> synchronously
        val session = responseHandler.writeSuccessfulResponse(response, block)

        // Create our Session adapter and set it on the player
        val rspClient = ZenyteRspClient(session, infos)
        rspClient.player = player
        player.session = rspClient

        player.createLogger()
        player.loadMapRegions(true)
        player.afterLoadMapRegions()
        player.isInitialized = true

        player.onLogin()

        logger.info("Player '{}' logged in via RSProt (index={})", player.username, player.index)
    }

    override fun onReconnect(
        responseHandler: GameLoginResponseHandler<Player>,
        block: LoginBlock<XteaKey>,
    ) {
        // Reconnect not supported yet
        responseHandler.writeFailedResponse(LoginResponse.ConnectFail)
    }
}
