package com.near_reality.network.rsprot

import com.near_reality.game.util.HuffmanManager
import com.zenyte.game.packet.`in`.event.*
import com.zenyte.game.world.entity.masks.ChatMessage
import com.zenyte.game.world.entity.player.Player
import net.rsprot.protocol.game.incoming.buttons.If1Button
import net.rsprot.protocol.game.incoming.buttons.If3Button
import net.rsprot.protocol.game.incoming.buttons.IfButtonD
import net.rsprot.protocol.game.incoming.buttons.IfButtonT
import net.rsprot.protocol.game.incoming.buttons.IfSubOp
import net.rsprot.protocol.game.incoming.locs.OpLoc6
import net.rsprot.protocol.game.incoming.locs.OpLocT
import net.rsprot.protocol.game.incoming.locs.OpLocV2
import net.rsprot.protocol.game.incoming.messaging.MessagePrivate
import net.rsprot.protocol.game.incoming.messaging.MessagePublic
import net.rsprot.protocol.game.incoming.misc.client.Idle
import net.rsprot.protocol.game.incoming.misc.client.MapBuildComplete
import net.rsprot.protocol.game.incoming.misc.client.NoTimeout
import net.rsprot.protocol.game.incoming.misc.client.WindowStatus
import net.rsprot.protocol.game.incoming.misc.user.ClickWorldMap
import net.rsprot.protocol.game.incoming.misc.user.ClientCheat
import net.rsprot.protocol.game.incoming.misc.user.CloseModal
import net.rsprot.protocol.game.incoming.misc.user.MoveGameClick
import net.rsprot.protocol.game.incoming.misc.user.MoveMinimapClick
import net.rsprot.protocol.game.incoming.misc.user.SetChatFilterSettings
import net.rsprot.protocol.game.incoming.npcs.OpNpc6
import net.rsprot.protocol.game.incoming.npcs.OpNpcT
import net.rsprot.protocol.game.incoming.npcs.OpNpcV2
import net.rsprot.protocol.game.incoming.objs.OpObj6
import net.rsprot.protocol.game.incoming.objs.OpObjT
import net.rsprot.protocol.game.incoming.objs.OpObjV2
import net.rsprot.protocol.game.incoming.players.OpPlayer
import net.rsprot.protocol.game.incoming.players.OpPlayerT
import net.rsprot.protocol.game.incoming.resumed.ResumePCountDialog
import net.rsprot.protocol.game.incoming.resumed.ResumePNameDialog
import net.rsprot.protocol.game.incoming.resumed.ResumePObjDialog
import net.rsprot.protocol.game.incoming.resumed.ResumePStringDialog
import net.rsprot.protocol.game.incoming.resumed.ResumePauseButton
import net.rsprot.protocol.game.incoming.social.FriendListAdd
import net.rsprot.protocol.game.incoming.social.FriendListDel
import net.rsprot.protocol.game.incoming.social.IgnoreListAdd
import net.rsprot.protocol.game.incoming.social.IgnoreListDel
import net.rsprot.protocol.message.codec.incoming.GameMessageConsumerRepositoryBuilder
import net.rsprot.protocol.message.codec.incoming.provider.DefaultGameMessageConsumerRepositoryProvider
import net.rsprot.protocol.message.codec.incoming.provider.GameMessageConsumerRepositoryProvider
import org.slf4j.LoggerFactory

/**
 * Registers incoming message consumers with RSProt rev-239.
 *
 * Each consumer receives a typed RSProt model object (already decoded from
 * bytes) and creates the matching NR event, then calls event.handle(player).
 * All game logic stays in the NR event classes — this is just the adapter.
 *
 * NR has a T/U split for "use item/spell on entity" packets:
 *   - T = spell on entity (from spellbook interface 218)
 *   - U = item on entity (from inventory interface 149)
 * RSProt unifies these into a single OpXxxT class. The consumer checks
 * selectedInterfaceId to dispatch to the correct NR event.
 *
 * Drop-in path: core/src/main/kotlin/com/near_reality/network/rsprot/
 */
class ZenyteMessageConsumers {

    private val logger = LoggerFactory.getLogger(ZenyteMessageConsumers::class.java)

    fun get(): GameMessageConsumerRepositoryProvider<Player> {
        val builder = GameMessageConsumerRepositoryBuilder<Player>()

        // ───────────────────────────────────────────────────────────────
        // NPC interactions
        // ───────────────────────────────────────────────────────────────

        builder.addListener(OpNpcV2::class.java) { player, msg ->
            OpNpcEvent(msg.index, msg.op, msg.controlKey).handle(player)
        }

        builder.addListener(OpNpc6::class.java) { player, msg ->
            // Examine NPC — OpNpc6 carries the NPC definition id
            OpNpcExamineEvent(msg.id).handle(player)
        }

        builder.addListener(OpNpcT::class.java) { player, msg ->
            // RSProt unifies T/U: check selectedInterfaceId to pick the right NR event
            if (msg.selectedInterfaceId == 149) {
                // Item on NPC (from inventory)
                OpNpcUEvent(
                    msg.selectedInterfaceId,
                    msg.selectedComponentId,
                    msg.selectedSub,     // slot
                    msg.selectedObj,     // itemId
                    msg.index,
                    msg.controlKey,
                ).handle(player)
            } else {
                // Spell on NPC (from spellbook or other interface)
                OpNpcTEvent(
                    msg.selectedInterfaceId,
                    msg.selectedComponentId,
                    msg.index,
                    msg.controlKey,
                    msg.selectedObj,     // itemId (unused for spells, -1)
                    msg.selectedSub,     // slot (unused for spells, -1)
                ).handle(player)
            }
        }

        // ───────────────────────────────────────────────────────────────
        // Loc (object) interactions
        // ───────────────────────────────────────────────────────────────

        builder.addListener(OpLocV2::class.java) { player, msg ->
            OpLocEvent(msg.id, msg.x, msg.z, msg.op, msg.controlKey).handle(player)
        }

        builder.addListener(OpLoc6::class.java) { player, msg ->
            OpLocExamineEvent(msg.id).handle(player)
        }

        builder.addListener(OpLocT::class.java) { player, msg ->
            if (msg.selectedInterfaceId == 149) {
                // Item on object
                OpLocUEvent(
                    msg.selectedInterfaceId,
                    msg.selectedComponentId,
                    msg.selectedSub,     // slot
                    msg.selectedObj,     // itemId
                    msg.id,
                    msg.x,
                    msg.z,
                    msg.controlKey,
                ).handle(player)
            } else {
                // Spell on object
                OpLocTEvent(
                    msg.selectedInterfaceId,
                    msg.selectedComponentId,
                    msg.selectedSub,     // slot
                    msg.id,
                    msg.x,
                    msg.z,
                    msg.controlKey,
                ).handle(player)
            }
        }

        // ───────────────────────────────────────────────────────────────
        // Obj (ground item) interactions
        // ───────────────────────────────────────────────────────────────

        builder.addListener(OpObjV2::class.java) { player, msg ->
            OpObjEvent(msg.id, msg.x, msg.z, msg.op, msg.controlKey).handle(player)
        }

        builder.addListener(OpObj6::class.java) { _, _ ->
            // Ground item examine — NR doesn't have a handler for this.
            // Examine text is looked up client-side from the cache.
        }

        builder.addListener(OpObjT::class.java) { player, msg ->
            if (msg.selectedInterfaceId == 149) {
                // Item on ground item
                OpObjUEvent(
                    msg.selectedInterfaceId,
                    msg.selectedComponentId,
                    msg.selectedSub,     // slot
                    msg.selectedObj,     // itemId
                    msg.id,              // floorItemId
                    msg.x,
                    msg.z,
                    msg.controlKey,
                ).handle(player)
            } else {
                // Spell on ground item — NR uses InterfaceOnFloorItemEvent
                InterfaceOnFloorItemEvent(
                    msg.selectedInterfaceId,
                    msg.selectedComponentId,
                    msg.id,              // floorItemId
                    msg.x,
                    msg.z,
                ).handle(player)
            }
        }

        // ───────────────────────────────────────────────────────────────
        // Player interactions
        // ───────────────────────────────────────────────────────────────

        builder.addListener(OpPlayer::class.java) { player, msg ->
            OpPlayerEvent(msg.index, msg.op, msg.controlKey).handle(player)
        }

        builder.addListener(OpPlayerT::class.java) { player, msg ->
            if (msg.selectedInterfaceId == 149) {
                // Item on player
                OpPlayerUEvent(
                    msg.index,
                    msg.selectedSub,     // slot
                    msg.selectedObj,     // itemId
                    msg.selectedInterfaceId,
                    if (msg.controlKey) 1 else 0,
                ).handle(player)
            } else {
                // Spell on player
                OpPlayerTEvent(
                    msg.selectedInterfaceId,
                    msg.selectedComponentId,
                    msg.index,
                    msg.controlKey,
                    msg.selectedObj,     // itemId (unused for spells)
                    msg.selectedSub,     // componentIndex / slot
                ).handle(player)
            }
        }

        // ───────────────────────────────────────────────────────────────
        // Interface buttons
        // ───────────────────────────────────────────────────────────────

        builder.addListener(If3Button::class.java) { player, msg ->
            If3ButtonEvent(
                msg.interfaceId,
                msg.componentId,
                msg.sub,
                msg.obj,
                msg.op,
            ).handle(player)
        }

        builder.addListener(If1Button::class.java) { player, msg ->
            // Legacy if1 buttons — NR dispatches these the same as if3
            // with op=1 (If1 only has one option in the OSRS protocol)
            If1ButtonEvent(
                msg.interfaceId,
                msg.componentId,
                -1,   // slot — If1Button doesn't carry sub/obj
                -1,   // itemId
                1,    // op (If1 is always option 1)
            ).handle(player)
        }

        builder.addListener(IfSubOp::class.java) { player, msg ->
            // Rev 239: right-click menu ops on if3 components arrive as IF_SUBOP
            // (ops 2+ with sub/obj/op/subop). Route through the same If3ButtonEvent path.
            If3ButtonEvent(
                msg.interfaceId,
                msg.componentId,
                msg.sub,
                msg.obj,
                msg.op,
            ).handle(player)
        }

        builder.addListener(IfButtonD::class.java) { player, msg ->
            // Check if both sides are the same interface (inventory drag)
            if (msg.selectedInterfaceId == msg.targetInterfaceId
                && msg.selectedInterfaceId == 149
            ) {
                // Inventory item swap (OpHeldD equivalent)
                OpHeldDEvent(
                    msg.selectedInterfaceId,
                    msg.selectedComponentId,
                    msg.selectedSub,     // fromSlot
                    msg.targetSub,       // toSlot
                ).handle(player)
            } else {
                // Cross-interface drag
                IfButtonDEvent(
                    msg.selectedInterfaceId,
                    msg.selectedComponentId,
                    msg.targetInterfaceId,
                    msg.targetComponentId,
                    msg.selectedSub,     // fromSlot
                    msg.targetSub,       // toSlot
                ).handle(player)
            }
        }

        builder.addListener(IfButtonT::class.java) { player, msg ->
            // Use component on component (item on item, spell on item)
            IfButtonTEvent(
                msg.selectedInterfaceId,
                msg.selectedComponentId,
                msg.targetInterfaceId,
                msg.targetComponentId,
                msg.selectedSub,     // fromSlot
                msg.targetSub,       // toSlot
                msg.selectedObj,     // fromItemId
                msg.targetObj,       // toItemId
            ).handle(player)
        }

        // ───────────────────────────────────────────────────────────────
        // Movement
        // ───────────────────────────────────────────────────────────────

        builder.addListener(MoveGameClick::class.java) { player, msg ->
            // keyCombination: 0=normal, 1=ctrl(run), 2=ctrl+shift(admin teleport)
            MoveGameClickEvent(msg.keyCombination, msg.x, msg.z).handle(player)
        }

        builder.addListener(MoveMinimapClick::class.java) { player, msg ->
            MoveMinimapClickEvent(msg.keyCombination, msg.x, msg.z).handle(player)
        }

        // ───────────────────────────────────────────────────────────────
        // Commands + Chat
        // ───────────────────────────────────────────────────────────────

        builder.addListener(ClientCheat::class.java) { player, msg ->
            CommandEvent(msg.command).handle(player)
        }

        builder.addListener(MessagePublic::class.java) { player, msg ->
            MessagePublicEvent(
                msg.type,
                msg.colour,
                msg.effect,
                msg.message,
                msg.clanType,
            ).handle(player)
        }

        builder.addListener(MessagePrivate::class.java) { player, msg ->
            // NR wraps private messages in a ChatMessage that holds the
            // huffman-encoded bytes. RSProt already decoded the text, so
            // we re-encode it for NR's ChatMessage constructor.
            val huffmanBuf = HuffmanManager.encodeHuffmanBuf(msg.message)
            val chatMessage = ChatMessage(huffmanBuf, msg.message, 0, false)
            MessagePrivateEvent(msg.name, chatMessage).handle(player)
        }

        builder.addListener(SetChatFilterSettings::class.java) { player, msg ->
            ChatSetModeEvent(
                msg.publicChatFilter,
                msg.privateChatFilter,
                msg.tradeChatFilter,
            ).handle(player)
        }

        // ───────────────────────────────────────────────────────────────
        // Dialog resume
        // ───────────────────────────────────────────────────────────────

        builder.addListener(ResumePauseButton::class.java) { player, msg ->
            ResumePauseButtonEvent(
                msg.interfaceId,
                msg.componentId,
                msg.sub,
            ).handle(player)
        }

        builder.addListener(ResumePCountDialog::class.java) { player, msg ->
            ResumePCountDialogEvent(msg.count).handle(player)
        }

        builder.addListener(ResumePStringDialog::class.java) { player, msg ->
            ResumePStringDialogEvent(msg.string).handle(player)
        }

        builder.addListener(ResumePObjDialog::class.java) { player, msg ->
            ResumePObjDialogEvent(msg.obj).handle(player)
        }

        builder.addListener(ResumePNameDialog::class.java) { player, msg ->
            ResumePNameDialogEvent(msg.name).handle(player)
        }

        // ───────────────────────────────────────────────────────────────
        // Social
        // ───────────────────────────────────────────────────────────────

        builder.addListener(FriendListAdd::class.java) { player, msg ->
            FriendListAddEvent(msg.name).handle(player)
        }

        builder.addListener(FriendListDel::class.java) { player, msg ->
            FriendListDelEvent(msg.name).handle(player)
        }

        builder.addListener(IgnoreListAdd::class.java) { player, msg ->
            IgnoreListAddEvent(msg.name).handle(player)
        }

        builder.addListener(IgnoreListDel::class.java) { player, msg ->
            IgnoreListDelEvent(msg.name).handle(player)
        }

        // NR's FriendChatJoinLeave, ClanKick, FriendSetRank use different
        // RSProt classes (FriendChatJoinLeave, ClanChannelKickUser,
        // FriendChatSetRank). Wire those if clan/friend chat is needed.
        // For offline play these are a no-op.

        // ───────────────────────────────────────────────────────────────
        // Client state
        // ───────────────────────────────────────────────────────────────

        builder.addListener(MapBuildComplete::class.java) { player, _ ->
            MapBuildCompleteEvent().handle(player)
        }

        builder.addListener(WindowStatus::class.java) { player, msg ->
            WindowStatusEvent(msg.windowMode, msg.frameWidth, msg.frameHeight).handle(player)
        }

        builder.addListener(CloseModal::class.java) { player, _ ->
            CloseModalEvent().handle(player)
        }

        builder.addListener(NoTimeout::class.java) { player, _ ->
            NoTimeOutEvent().handle(player)
        }

        builder.addListener(Idle::class.java) { player, _ ->
            EventMouseIdleEvent().handle(player)
        }

        builder.addListener(ClickWorldMap::class.java) { player, msg ->
            ClickWorldMapEvent(msg.x, msg.z, msg.level).handle(player)
        }

        return DefaultGameMessageConsumerRepositoryProvider(builder.build())
    }
}
