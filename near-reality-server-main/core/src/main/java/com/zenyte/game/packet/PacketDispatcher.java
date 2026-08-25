package com.zenyte.game.packet;

import com.near_reality.network.rsprot.ZenyteJs5GroupProvider;
import com.near_reality.network.rsprot.ZenyteRspClient;
import com.zenyte.game.GameInterface;
import com.zenyte.game.content.grandexchange.ExchangeOffer;
import com.zenyte.game.item.Item;
import com.zenyte.game.model.CameraShakeType;
import com.zenyte.game.model.HintArrow;
import com.zenyte.game.model.HintArrowPosition;
import com.zenyte.game.model.LineSpacingType;
import com.zenyte.game.model.MinimapState;
import com.zenyte.game.model.ui.PaneType;
import com.zenyte.game.packet.out.MapProjAnim;
import com.zenyte.game.util.AccessMask;
import com.zenyte.game.util.MaskBuilder;
import com.zenyte.game.util.RSColour;
import com.zenyte.game.world.GraphicsObjectRS;
import com.zenyte.game.world.Position;
import com.zenyte.game.world.Projectile;
import com.zenyte.game.world.entity.Entity;
import com.zenyte.game.world.entity.Location;
import com.zenyte.game.world.entity.SoundEffect;
import com.zenyte.game.world.entity.masks.Graphics;
import com.zenyte.game.world.entity.player.MessageType;
import com.zenyte.game.world.entity.player.Player;
import com.zenyte.game.world.entity.player.container.Container;
import com.zenyte.game.world.entity.player.container.ItemContainer;
import com.zenyte.game.world.entity.player.container.impl.ContainerType;
import com.zenyte.game.world.flooritem.FloorItem;
import com.zenyte.net.Session;
import mgi.types.component.ComponentDefinitions;
import net.rsprot.protocol.common.game.outgoing.inv.InventoryObject;
import net.rsprot.protocol.game.outgoing.camera.CamLookAtV1;
import net.rsprot.protocol.game.outgoing.camera.CamMoveToV1;
import net.rsprot.protocol.game.outgoing.camera.CamReset;
import net.rsprot.protocol.game.outgoing.camera.CamShake;
import net.rsprot.protocol.game.outgoing.interfaces.IfClearInv;
import net.rsprot.protocol.game.outgoing.interfaces.IfCloseSub;
import net.rsprot.protocol.game.outgoing.interfaces.IfMoveSub;
import net.rsprot.protocol.game.outgoing.interfaces.IfOpenSub;
import net.rsprot.protocol.game.outgoing.interfaces.IfOpenTop;
import net.rsprot.protocol.game.outgoing.interfaces.IfSetAnim;
import net.rsprot.protocol.game.outgoing.interfaces.IfSetColour;
import net.rsprot.protocol.game.outgoing.interfaces.IfSetEventsV2;
import net.rsprot.protocol.game.outgoing.interfaces.IfSetHide;
import net.rsprot.protocol.game.outgoing.interfaces.IfSetModelV2;
import net.rsprot.protocol.game.outgoing.interfaces.IfSetNpcHead;
import net.rsprot.protocol.game.outgoing.interfaces.IfSetObject;
import net.rsprot.protocol.game.outgoing.interfaces.IfSetPlayerHead;
import net.rsprot.protocol.game.outgoing.interfaces.IfSetText;
import net.rsprot.protocol.game.outgoing.inv.UpdateInvFull;
import net.rsprot.protocol.game.outgoing.inv.UpdateInvPartial;
import net.rsprot.protocol.game.outgoing.logout.Logout;
import net.rsprot.protocol.game.outgoing.misc.client.MinimapToggle;
import net.rsprot.protocol.game.outgoing.misc.client.UrlOpen;
import net.rsprot.protocol.game.outgoing.misc.player.MessageGame;
import net.rsprot.protocol.game.outgoing.misc.player.RunClientScript;
import net.rsprot.protocol.game.outgoing.misc.player.SetMapFlagV2;
import net.rsprot.protocol.game.outgoing.misc.player.SetPlayerOp;
import net.rsprot.protocol.game.outgoing.misc.player.UpdateRunEnergy;
import net.rsprot.protocol.game.outgoing.misc.player.UpdateRunWeight;
import net.rsprot.protocol.game.outgoing.misc.player.UpdateStatV2;
import net.rsprot.protocol.game.outgoing.misc.player.UpdateStockMarketSlot;
import net.rsprot.protocol.game.outgoing.social.FriendListLoaded;
import net.rsprot.protocol.game.outgoing.social.UpdateFriendList;
import net.rsprot.protocol.game.outgoing.social.UpdateIgnoreList;
import net.rsprot.protocol.game.outgoing.sound.MidiJingle;
import net.rsprot.protocol.game.outgoing.sound.MidiSongV2;
import net.rsprot.protocol.game.outgoing.sound.SynthSound;
import net.rsprot.protocol.game.outgoing.varp.VarpLarge;
import net.rsprot.protocol.game.outgoing.varp.VarpSmall;
import net.rsprot.protocol.message.OutgoingGameMessage;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * A utility class for sending packets.
 *
 * Session 11c: every method body now queues an RSProt rev-239 outgoing message
 * through {@link ZenyteRspClient#queue(OutgoingGameMessage)} instead of building
 * an NR {@code GamePacketEncoder}. All public method signatures are unchanged.
 *
 * Zone payloads (ObjAdd/ObjDel/ObjCount/MapAnim/SoundArea) are built via
 * {@link ZoneProts} and queued per-chunk through {@link Player#sendZoneUpdate};
 * {@link ZenyteRspClient#flushZones(Player)} emits them under an
 * {@code UpdateZonePartialFollows} header at the end of the tick.
 *
 * @author Graham Edgecombe
 * @author Tom - modifications and additions.
 */
public class PacketDispatcher {

	private static final Logger log = LoggerFactory.getLogger(PacketDispatcher.class);

	/**
	 * The private player object used for creating the constructor.
	 */
	private final Player player;

	/**
	 * Creates an action sender for the specified player.
	 *
	 * @param player
	 *            The player to create the action sender for.
	 */
	public PacketDispatcher(final Player player) {
		this.player = player;
	}

	// ------------------------------------------------------------------
	// Internal helpers
	// ------------------------------------------------------------------

	private ZenyteRspClient rsp() {
		final Session session = player.getSession();
		return session instanceof ZenyteRspClient ? (ZenyteRspClient) session : null;
	}

	private void queue(final OutgoingGameMessage message) {
		final ZenyteRspClient client = rsp();
		if (client == null) {
			return;
		}
		client.queue(message);
	}

	private static int combined(final int interfaceId, final int componentId) {
		return (interfaceId << 16) | componentId;
	}

	/**
	 * The client loads the REAL OSRS cache (served by ZenyteJs5GroupProvider), while
	 * ComponentDefinitions is loaded from NR's cache which contains NR-custom interfaces
	 * (noticeboard 1701, loyalty, etc). The rev-239 client hard-crashes on an interface id
	 * outside its table, so every interface-addressed packet is filtered here.
	 */
	private static boolean clientHasInterface(final int interfaceId) {
		final int count = ZenyteJs5GroupProvider.getClientInterfaceCount();
		if (count <= 0) {
			return true; // count unknown (provider not loaded) — don't block
		}
		if (interfaceId >= 0 && interfaceId < count) {
			return true;
		}
		if (log.isDebugEnabled()) {
			log.debug("Skipping NR-custom interface {} (client cache has {})", interfaceId, count);
		}
		return false;
	}

	/** Same idea for clientscripts (archive 12). NR-custom script ids would crash the client. */
	private static boolean clientHasScript(final int scriptId) {
		final int count = ZenyteJs5GroupProvider.getClientScriptCount();
		if (count <= 0) {
			return true;
		}
		if (scriptId >= 0 && scriptId < count) {
			return true;
		}
		if (log.isDebugEnabled()) {
			log.debug("Skipping NR-custom clientscript {} (client cache has {})", scriptId, count);
		}
		return false;
	}

	// ------------------------------------------------------------------
	// Session / misc
	// ------------------------------------------------------------------

	public void sendLogout() {
		queue(Logout.INSTANCE);
	}

	public void sendURL(final String link) {
		queue(new UrlOpen(link));
	}

	public void sendPane(final PaneType pane) {
		if (!(clientHasInterface(pane.getId()))) {
			return;
		}
		queue(new IfOpenTop(pane.getId()));
		player.getInterfaceHandler().setPane(pane);
	}

	public void sendProjectile(final Position sender, final Position receiver, final Projectile projectile, final int speed, final int offset) {
		// MapProjAnim is kept as the carrier object; it implements ZoneProtConvertible and
		// is converted to MapProjAnimV2 when Player.processEntityUpdate() drains tempList.
		player.addProj(sender.getPosition(), new MapProjAnim(player, sender, receiver, projectile, speed, offset));
	}

	// ------------------------------------------------------------------
	// Interfaces
	// ------------------------------------------------------------------

	public void sendInterface(final int interfaceId, final int targetChild, final PaneType pane, final boolean walkable) {
		if (!(clientHasInterface(interfaceId) && clientHasInterface(pane.getId()))) {
			return;
		}
		// RSProt: (destinationInterfaceId, destinationComponentId, interfaceId, type) — type 0 = modal, 1 = overlay.
		queue(new IfOpenSub(pane.getId(), targetChild, interfaceId, walkable ? 1 : 0));
	}

	public void sendMoveInterface(final int fromPane, final int fromChild, final int toPane, final int toChild) {
		if (!(clientHasInterface(fromPane) && clientHasInterface(toPane))) {
			return;
		}
		queue(new IfMoveSub(fromPane, fromChild, toPane, toChild));
	}

	public void closeInterface(final int hash) {
		if (!(clientHasInterface(hash >>> 16))) {
			return;
		}
		queue(new IfCloseSub(hash));
	}

	public void sendLineSpacing(@NotNull final LineSpacingType horizontalType, @NotNull final LineSpacingType verticalType, final int interfaceId, final int componentId) {
		sendLineSpacing(horizontalType, verticalType, 0, interfaceId, componentId);
	}

	public void sendLineSpacing(@NotNull final LineSpacingType horizontalType, @NotNull final LineSpacingType verticalType, final int lineSpacing, final int interfaceId, final int componentId) {
		sendClientScript(600, horizontalType.ordinal(), verticalType.ordinal(), lineSpacing, combined(interfaceId, componentId));
	}

	public void sendComponentVisibility(final int interfaceId, final int componentId, final boolean hidden) {
		if (!(clientHasInterface(interfaceId))) {
			return;
		}
		queue(new IfSetHide(interfaceId, componentId, hidden));
	}

	public void sendComponentVisibility(final GameInterface inter, final int componentId, final boolean hidden) {
		sendComponentVisibility(inter.getId(), componentId, hidden);
	}

	public void sendComponentSettings(final int interfaceId, final int componentId, final int start, final int end, final int set) {
		if (!(clientHasInterface(interfaceId))) {
			return;
		}
		// NR AccessMask layout: bit 0 = CONTINUE, bits 1..10 = CLICK_OP1..10, bits 11+ = use-on/drag/etc.
		// IfSetEventsV2: events1 = legacy bitpack (op bits 1..10 ignored), events2 = one bit per button (bit 0 = op1).
		final int events2 = (set >>> 1) & 0x3FF;
		queue(new IfSetEventsV2(interfaceId, componentId, start, end, set, events2));
	}

	public void sendComponentSettings(final int interfaceId, final int componentId, final int start, final int end, final AccessMask... masks) {
		sendComponentSettings(interfaceId, componentId, start, end, MaskBuilder.getValue(masks));
	}

	public void sendComponentSettings(GameInterface gameInterface, final int componentId, final int start, final int end, final AccessMask... masks) {
		sendComponentSettings(gameInterface.getId(), componentId, start, end, MaskBuilder.getValue(masks));
	}

	public void sendComponentSettings(final int interfaceId, final int componentId, final int start, final int end, final MaskBuilder builder) {
		sendComponentSettings(interfaceId, componentId, start, end, builder.getValue());
	}

	public void sendComponentText(final int interfaceId, final int componentId, final Object text) {
		if (!ComponentDefinitions.containsInterface(interfaceId) || !clientHasInterface(interfaceId)) {
			return;
		}
		queue(new IfSetText(interfaceId, componentId, text == null ? "null" : text.toString()));
	}

	public void sendComponentText(final GameInterface gameInterface, final int componentId, final Object text) {
		sendComponentText(gameInterface.getId(), componentId, text);
	}

	public void sendComponentItem(GameInterface gameInterface, final int componentId, final int itemId, final int zoom) {
		sendComponentItem(gameInterface.getId(), componentId, itemId, zoom);
	}

	public void sendComponentItem(final int interfaceId, final int componentId, final int itemId, final int zoom) {
		if (!(clientHasInterface(interfaceId))) {
			return;
		}
		// NR "zoom" is the same wire field RSProt calls "count".
		queue(new IfSetObject(interfaceId, componentId, itemId, zoom));
	}

	public void sendComponentPlayerHead(final int interfaceId, final int componentId) {
		if (!(clientHasInterface(interfaceId))) {
			return;
		}
		queue(new IfSetPlayerHead(interfaceId, componentId));
	}

	public void sendComponentNPCHead(final int interfaceId, final int componentId, final int npcId) {
		if (!(clientHasInterface(interfaceId))) {
			return;
		}
		queue(new IfSetNpcHead(interfaceId, componentId, npcId));
	}

	public void sendComponentModel(final GameInterface inter, final int componentId, final int modelId) {
		sendComponentModel(inter.getId(), componentId, modelId);
	}

	public void sendComponentModel(final int interfaceId, final int componentId, final int modelId) {
		if (!(clientHasInterface(interfaceId))) {
			return;
		}
		queue(new IfSetModelV2(interfaceId, componentId, modelId));
	}

	public void sendComponentAnimation(final int interfaceId, final int componentId, final int animationId) {
		if (!(clientHasInterface(interfaceId))) {
			return;
		}
		queue(new IfSetAnim(interfaceId, componentId, animationId));
	}

	public void sendComponentAnimation(final GameInterface inter, final int componentId, final int animationId) {
		sendComponentAnimation(inter.getId(), componentId, animationId);
	}

	public void sendComponentSpriteColour(final int interfaceId, final int componentId, final RSColour colour) {
		if (!ComponentDefinitions.containsInterface(interfaceId) || !clientHasInterface(interfaceId)) {
			return;
		}
		// RSColour.getRGB() is already a 15-bit packed colour (5/5/5).
		queue(new IfSetColour(combined(interfaceId, componentId), colour.getRGB()));
	}

	public void sendClearItemContainer(final int interfaceId, final int componentId) {
		if (!(clientHasInterface(interfaceId))) {
			return;
		}
		queue(new IfClearInv(interfaceId, componentId));
	}

	// ------------------------------------------------------------------
	// Client scripts
	// ------------------------------------------------------------------

	public void sendClientScript(final int scriptId, final Object... arguments) {
		if (!(clientHasScript(scriptId))) {
			return;
		}
		final List<Object> values = new ArrayList<>(arguments.length);
		for (final Object argument : arguments) {
			if (argument instanceof String) {
				values.add(argument);
			} else if (argument instanceof Integer) {
				values.add(argument);
			} else if (argument instanceof Number) {
				values.add(((Number) argument).intValue());
			} else if (argument instanceof Boolean) {
				values.add(((Boolean) argument) ? 1 : 0);
			} else if (argument == null) {
				values.add(-1);
			} else {
				values.add(argument.toString());
			}
		}
		queue(new RunClientScript(scriptId, values));
	}

	public void sendClientScript(final int scriptId) {
		if (!(clientHasScript(scriptId))) {
			return;
		}
		queue(new RunClientScript(scriptId, new ArrayList<>(0)));
	}

	// ------------------------------------------------------------------
	// Messages
	// ------------------------------------------------------------------

	public void sendMessage(final String message, final MessageType type, final String extension) {
		if (message == null || message.isEmpty()) {
			return;
		}
		if (extension != null) {
			queue(new MessageGame(type.getType(), extension, message));
		} else {
			queue(new MessageGame(type.getType(), message));
		}
	}

	public void sendGameMessage(final String message, final MessageType type) {
		sendMessage(message, type, null);
	}

	public void sendGameMessage(final String message, final boolean filterable) {
		sendMessage(message, filterable ? MessageType.FILTERABLE : MessageType.UNFILTERABLE, null);
	}

	public void sendGameMessage(final String message, final boolean filterable, final Object... params) {
		sendMessage(params.length > 0 ? String.format(message, params) : message, filterable ? MessageType.FILTERABLE : MessageType.UNFILTERABLE, null);
	}

	public void sendTradeRequest(final String message, final String user) {
		sendMessage(message, MessageType.TRADE_REQUEST, user);
	}

	public void sendChallengeRequest(final String message, final String user) {
		sendMessage(message, MessageType.CHALLENGE_REQUEST, user);
	}

	public void sendGlobalBroadcast(final String message) {
		sendMessage(message, MessageType.GLOBAL_BROADCAST, null);
	}

	// ------------------------------------------------------------------
	// Player state
	// ------------------------------------------------------------------

	public void sendRunEnergy() {
		queue(new UpdateRunEnergy((int) player.getVariables().getRunEnergy()));
	}

	public void sendWeight() {
		queue(new UpdateRunWeight((int) (player.getInventory().getWeight() + player.getEquipment().getWeight())));
	}

	public void sendSkillUpdate(final int skill) {
		sendSkillUpdateForce(skill, player.getSkills().getLevel(skill));
	}

	public void sendSkillUpdateForce(final int skill, int level) {
		// UpdateStatV2(stat, currentLevel, invisibleBoostedLevel, experience). NR has no invisible boosts.
		queue(new UpdateStatV2(skill, level, level, (int) player.getSkills().getExperience(skill)));
	}

	public void sendConfig(final int config, final int value) {
		queue(value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE ? new VarpSmall(config, value) : new VarpLarge(config, value));
	}

	public void sendPlayerOption(final int index, final String option, final boolean top) {
		queue(new SetPlayerOp(index, top, option == null ? "null" : option));
	}

	public void sendHintArrow(final HintArrow arrow) {
		queue(new net.rsprot.protocol.game.outgoing.misc.client.HintArrow(toRspHintArrow(arrow)));
		player.getTemporaryAttributes().put("last hint arrow", arrow);
	}

	public void resetHintArrow() {
		queue(new net.rsprot.protocol.game.outgoing.misc.client.HintArrow(
				net.rsprot.protocol.game.outgoing.misc.client.HintArrow.ResetHintArrow.INSTANCE));
		player.getTemporaryAttributes().remove("last hint arrow");
	}

	private static net.rsprot.protocol.game.outgoing.misc.client.HintArrow.HintArrowType toRspHintArrow(final HintArrow arrow) {
		if (arrow == null) {
			return net.rsprot.protocol.game.outgoing.misc.client.HintArrow.ResetHintArrow.INSTANCE;
		}
		if (arrow.getPosition() == HintArrowPosition.ENTITY) {
			final Entity target = arrow.getTarget();
			if (target == null) {
				return net.rsprot.protocol.game.outgoing.misc.client.HintArrow.ResetHintArrow.INSTANCE;
			}
			if (target.getEntityType() == Entity.EntityType.NPC) {
				return new net.rsprot.protocol.game.outgoing.misc.client.HintArrow.NpcHintArrow(target.getIndex());
			}
			return new net.rsprot.protocol.game.outgoing.misc.client.HintArrow.PlayerHintArrow(target.getIndex());
		}
		// NR HintArrowPosition ids (CENTER=2, WEST=3, EAST=4, SOUTH=5, NORTH=6) match RSProt HintArrowTilePosition ids.
		return new net.rsprot.protocol.game.outgoing.misc.client.HintArrow.TileHintArrow(
				arrow.getX(), arrow.getY(), arrow.getHeight() & 0xFF, arrow.getPosition().getPositionHash());
	}

	public void sendMinimapState(final MinimapState state) {
		queue(new MinimapToggle(state.getState()));
	}

	public void sendMapFlag(final int x, final int y) {
		// Callers pass build-area-local coords (Player.getXInScene / getYInScene).
		// V2 requires absolute world coords, so convert using the player's scene base.
		final int baseChunkId = player.getSceneBaseChunkId();
		final int baseX = (baseChunkId & 2047) << 3;
		final int baseZ = ((baseChunkId >> 11) & 2047) << 3;
		queue(new SetMapFlagV2(x + baseX, y + baseZ));
	}

	public void resetMapFlag() {
		queue(new SetMapFlagV2());
	}

	// ------------------------------------------------------------------
	// Social
	// ------------------------------------------------------------------

	public void initFriendsList() {
		final List<String> friends = player.getSocialManager().getFriends();
		final List<UpdateFriendList.Friend> list = new ArrayList<>(friends.size());
		for (final String friend : friends) {
			// Offline entry: (added, name, previousName, rank, properties, notes). Online status is
			// pushed later by the social system (Session 11e).
			list.add(new UpdateFriendList.OfflineFriend(true, friend, null, 0, 0, ""));
		}
		queue(new UpdateFriendList(list));
	}

	public void initIgnoreList() {
		final List<String> ignores = player.getSocialManager().getIgnores();
		final List<UpdateIgnoreList.IgnoredPlayer> list = new ArrayList<>(ignores.size());
		for (final String ignore : ignores) {
			list.add(new UpdateIgnoreList.AddedIgnoredEntry(ignore, null, "", true));
		}
		queue(new UpdateIgnoreList(list));
	}

	public void sendFriendServer() {
		queue(FriendListLoaded.INSTANCE);
	}

	// ------------------------------------------------------------------
	// Map / region
	// ------------------------------------------------------------------

	public void sendStaticMapRegion() {
		final ZenyteRspClient client = rsp();
		if (client == null) {
			return;
		}
		player.getForceReloadMap().set(false);
		client.rebuildNormal(player);
	}

	public void sendDynamicMapRegion() {
		final ZenyteRspClient client = rsp();
		if (client == null) {
			return;
		}
		final boolean reload = player.getForceReloadMap().getAndSet(false);
		client.rebuildRegion(player, reload);
	}

	// ------------------------------------------------------------------
	// Grand exchange
	// ------------------------------------------------------------------

	public void sendGrandExchangeOffer(final ExchangeOffer offer) {
		// UpdateStockMarketSlot(slot, update) with the 6-arg update ctor:
		// (status, obj, price, count, completedCount, completedGold).
		final UpdateStockMarketSlot.StockMarketUpdateType update = new UpdateStockMarketSlot.SetStockMarketSlot(
				offer.getStage(),
				offer.getItem().getId(),
				offer.getPrice(),
				offer.getItem().getAmount(),
				offer.getAmount(),
				offer.getTotalPrice());
		queue(new UpdateStockMarketSlot(offer.getSlot(), update));
	}

	// ------------------------------------------------------------------
	// Inventories
	// ------------------------------------------------------------------

	public void sendUpdateItemContainer(final Container container) {
		sendUpdateItemContainer(container, null);
	}

	public void sendUpdateItemContainer(final Container container, final ContainerType type) {
		final ContainerType resolved = type == null ? container.getType() : type;
		if (resolved.getInterfaceId() >= 0 && !clientHasInterface(resolved.getInterfaceId())) {
			return;
		}
		final int combinedId = combined(resolved.getInterfaceId(), resolved.getComponentId());
		final int size = container.getContainerSize();
		queue(new UpdateInvFull(combinedId, resolved.getId(), size, slot -> {
			final Item item = container.get(slot);
			if (item == null) {
				return InventoryObject.NULL;
			}
			return InventoryObject.pack(slot, item.getId(), item.getAmount());
		}));
		Container.AWAITING_RESET_CONTAINERS.add(container);
	}

	public void sendUpdateItemsPartial(final Container container) {
		final ContainerType type = container.getType();
		if (type.getInterfaceId() >= 0 && !clientHasInterface(type.getInterfaceId())) {
			return;
		}
		final int combinedId = combined(type.getInterfaceId(), type.getComponentId());
		final List<Integer> slots = new ArrayList<>(container.getModifiedSlots());
		queue(new UpdateInvPartial(combinedId, type.getId(), new UpdateInvPartial.IndexedObjectProvider(slots.iterator()) {
			@Override
			public long provide(final int slot) {
				final Item item = container.get(slot);
				if (item == null) {
					return InventoryObject.pack(slot, -1, -1);
				}
				return InventoryObject.pack(slot, item.getId(), item.getAmount());
			}
		}));
		Container.AWAITING_RESET_CONTAINERS.add(container);
	}

	public void sendUpdateItemContainer(final int key, final ItemContainer items) {
		sendUpdateItemContainer(key, -1, 0, items);
	}

	public void sendUpdateItemContainer(final int key, final int interfaceId, final int componentId, final ItemContainer items) {
		if (!(interfaceId < 0 || clientHasInterface(interfaceId))) {
			return;
		}
		final Item[] array = items.getItems();
		queue(new UpdateInvFull(combined(interfaceId, componentId), key, array.length, slot -> {
			final Item item = slot < array.length ? array[slot] : null;
			if (item == null) {
				return InventoryObject.NULL;
			}
			return InventoryObject.pack(slot, item.getId(), item.getAmount());
		}));
	}

	public void sendUpdateItemContainer(final int key, final int interfaceId, final int componentId, final Container items) {
		if (!(interfaceId < 0 || clientHasInterface(interfaceId))) {
			return;
		}
		final int size = items.getContainerSize();
		queue(new UpdateInvFull(combined(interfaceId, componentId), key, size, slot -> {
			final Item item = items.get(slot);
			if (item == null) {
				return InventoryObject.NULL;
			}
			return InventoryObject.pack(slot, item.getId(), item.getAmount());
		}));
	}

	public void sendUpdateItemsInSlot(final int key, final int interfaceId, final int componentId, final ItemContainer items, final int... slots) {
		if (!(interfaceId < 0 || clientHasInterface(interfaceId))) {
			return;
		}
		final Item[] array = items.getItems();
		final List<Integer> valid = new ArrayList<>(slots.length);
		for (final int slot : slots) {
			if (slot >= 0 && slot < array.length) {
				valid.add(slot);
			}
		}
		queue(new UpdateInvPartial(combined(interfaceId, componentId), key, new UpdateInvPartial.IndexedObjectProvider(valid.iterator()) {
			@Override
			public long provide(final int slot) {
				final Item item = array[slot];
				if (item == null) {
					return InventoryObject.pack(slot, -1, -1);
				}
				return InventoryObject.pack(slot, item.getId(), item.getAmount());
			}
		}));
	}

	// ------------------------------------------------------------------
	// Zone payloads (queued per chunk, flushed by ZenyteRspClient.flushZones)
	// ------------------------------------------------------------------

	public void sendObjAdd(final FloorItem item, final Location tile) {
		player.sendZoneUpdate(tile.getX(), tile.getY(), ZoneProts.objAdd(item));
	}

	public void sendObjDel(final FloorItem item, final Location tile) {
		player.sendZoneUpdate(tile.getX(), tile.getY(), ZoneProts.objDel(item));
	}

	public void sendObjUpdate(final FloorItem item, final int oldQuantity, final Location tile) {
		player.sendZoneUpdate(tile.getX(), tile.getY(), ZoneProts.objCount(item, oldQuantity));
	}

	public void sendGraphics(final Graphics graphics, final Location location) {
		player.sendZoneUpdate(location.getX(), location.getY(), ZoneProts.mapAnim(location, graphics));
	}

	public void sendGraphicsObject(final GraphicsObjectRS object) {
		// NR-custom GRAPHICSOBJECT_SPAWN; MapAnim carries the same information for the client.
		final Location location = object.getLocation();
		player.sendZoneUpdate(location.getX(), location.getY(), ZoneProts.mapAnim(location, object.getId(), object.getDelay(), 0));
	}

	public void sendAreaSoundEffect(final Location tile, final SoundEffect sound) {
		player.sendZoneUpdate(tile.getX(), tile.getY(), ZoneProts.soundArea(tile, sound));
	}

	// ------------------------------------------------------------------
	// Sound / music
	// ------------------------------------------------------------------

	public void sendSoundEffect(final SoundEffect sound) {
		queue(new SynthSound(sound.getId(), sound.getRepetitions(), sound.getDelay()));
	}

	public void sendMusic(final int song) {
		// MidiSongV2(id, fadeOutDelay, fadeOutSpeed, fadeInDelay, fadeInSpeed) — OSRS default fade values.
		queue(new MidiSongV2(song, 0, 60, 0, 60));
	}

	public void playJingle(final int song) {
		queue(new MidiJingle(song));
	}

	// ------------------------------------------------------------------
	// Camera
	// ------------------------------------------------------------------

	public void sendCameraLook(final int viewLocalX, final int viewLocalY, final int cameraHeight, final int speed, final int acceleration) {
		queue(new CamLookAtV1(viewLocalX, viewLocalY, cameraHeight, speed, acceleration));
	}

	public void sendCameraPosition(final int viewLocalX, final int viewLocalY, final int cameraHeight, final int speed, final int acceleration) {
		queue(new CamMoveToV1(viewLocalX, viewLocalY, cameraHeight, speed, acceleration));
	}

	public void sendCameraShake(final CameraShakeType type, final int shakeIntensity, final int movementIntensity, final int speed) {
		player.getTemporaryAttributes().put("cameraShake", true);
		// CamShake(axis, random, amplitude, rate) <- NR (type, shakeIntensity, movementIntensity, speed): same wire order.
		queue(new CamShake(type.getType(), shakeIntensity, movementIntensity, speed));
	}

	public void resetCamera() {
		player.getTemporaryAttributes().remove("cameraShake");
		queue(CamReset.INSTANCE);
	}
}
