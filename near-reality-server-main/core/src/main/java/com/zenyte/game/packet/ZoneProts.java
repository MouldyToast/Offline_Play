package com.zenyte.game.packet;

import com.zenyte.game.world.Position;
import com.zenyte.game.world.Projectile;
import com.zenyte.game.world.entity.Location;
import com.zenyte.game.world.entity.SoundEffect;
import com.zenyte.game.world.entity.masks.Graphics;
import com.zenyte.game.world.entity.npc.NPC;
import com.zenyte.game.world.entity.player.Player;
import com.zenyte.game.world.flooritem.FloorItem;
import com.zenyte.game.world.object.WorldObject;
import net.rsprot.protocol.game.outgoing.zone.payload.LocAddChangeV2;
import net.rsprot.protocol.game.outgoing.zone.payload.LocAnim;
import net.rsprot.protocol.game.outgoing.zone.payload.LocDel;
import net.rsprot.protocol.game.outgoing.zone.payload.MapAnim;
import net.rsprot.protocol.game.outgoing.zone.payload.MapProjAnimV2;
import net.rsprot.protocol.game.outgoing.zone.payload.ObjAdd;
import net.rsprot.protocol.game.outgoing.zone.payload.ObjCount;
import net.rsprot.protocol.game.outgoing.zone.payload.ObjDel;
import net.rsprot.protocol.game.outgoing.zone.payload.SoundArea;
import net.rsprot.protocol.message.ZoneProt;

/**
 * Static factories that build RSProt rev-239 zone payloads from NR model objects.
 *
 * Coordinates are "in zone" (0..7) — RSProt takes the tile offset within the 8x8 zone
 * and the zone itself is identified by the {@code UpdateZonePartialFollows} header that
 * {@code ZenyteRspClient.flushZones} emits.
 *
 * NR's old ObjAdd/LocAdd encoders wrote op flags {@code 31} (all five options enabled);
 * that is preserved here.
 *
 * Drop-in path: core/src/main/java/com/zenyte/game/packet/ZoneProts.java
 */
public final class ZoneProts {

	/** All five right-click options enabled — matches NR's hard-coded op flags byte. */
	private static final byte ALL_OPS = 31;

	private ZoneProts() {
	}

	private static int inZone(final int coord) {
		return coord & 7;
	}

	public static ZoneProt objAdd(final FloorItem item) {
		final Location tile = item.getLocation();
		return new ObjAdd(item.getId(), item.getAmount(), inZone(tile.getX()), inZone(tile.getY()), ALL_OPS);
	}

	public static ZoneProt objDel(final FloorItem item) {
		final Location tile = item.getLocation();
		return new ObjDel(item.getId(), item.getAmount(), inZone(tile.getX()), inZone(tile.getY()));
	}

	public static ZoneProt objCount(final FloorItem item, final int oldQuantity) {
		final Location tile = item.getLocation();
		return new ObjCount(item.getId(), oldQuantity, item.getAmount(), inZone(tile.getX()), inZone(tile.getY()));
	}

	public static ZoneProt mapAnim(final Location location, final Graphics graphics) {
		return mapAnim(location, graphics.getId(), graphics.getDelay(), graphics.getHeight());
	}

	public static ZoneProt mapAnim(final Location location, final int id, final int delay, final int height) {
		return new MapAnim(id, delay, height, inZone(location.getX()), inZone(location.getY()));
	}

	public static ZoneProt soundArea(final Location tile, final SoundEffect sound) {
		// SoundArea(id, delay, loops, radius, size, xInZone, zInZone). NR has no "size" concept -> 0.
		return new SoundArea(sound.getId(), sound.getDelay(), sound.getRepetitions(), sound.getRadius(), 0,
				inZone(tile.getX()), inZone(tile.getY()));
	}

	public static ZoneProt locAdd(final WorldObject object) {
		return new LocAddChangeV2(object.getId(), inZone(object.getX()), inZone(object.getY()),
				object.getType(), object.getRotation(), ALL_OPS);
	}

	public static ZoneProt locDel(final WorldObject object) {
		return new LocDel(inZone(object.getX()), inZone(object.getY()), object.getType(), object.getRotation());
	}

	public static ZoneProt locAnim(final int animationId, final int x, final int y, final int type, final int rotation) {
		return new LocAnim(animationId, inZone(x), inZone(y), type, rotation);
	}

	/**
	 * @param duration NR passes {@code Integer.MIN_VALUE} to mean "compute from projectile + distance".
	 */
	public static ZoneProt mapProjAnim(final Position sender, final Position receiver, final Projectile projectile,
									   final int duration, final int offset) {
		final Location from = sender.getPosition();
		final Location to = receiver.getPosition();
		final int endTime = duration != Integer.MIN_VALUE ? duration : projectile.getProjectileDuration(from, receiver);
		final int targetIndex = receiver instanceof Player ? -(((Player) receiver).getIndex() + 1)
				: receiver instanceof NPC ? (((NPC) receiver).getIndex() + 1) : 0;
		final int sourceIndex = sender instanceof Player ? -(((Player) sender).getIndex() + 1)
				: sender instanceof NPC ? (((NPC) sender).getIndex() + 1) : 0;
		// MapProjAnimV2(id, startHeight, endHeight, startTime, endTime, angle, progress,
		//               sourceIndex, targetIndex, xInZone, zInZone, endX, endZ, endLevel)
		// Rev-239 heights no longer carry the client-side *4 multiplier the rev-211 client applied,
		// so scale NR's values to keep the same arc.
		return new MapProjAnimV2(projectile.getGraphicsId(), projectile.getStartHeight() * 4, projectile.getEndHeight() * 4,
				projectile.getDelay(), endTime, projectile.getAngle(), offset,
				sourceIndex, targetIndex, inZone(from.getX()), inZone(from.getY()),
				to.getX(), to.getY(), to.getPlane());
	}
}
