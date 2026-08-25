package com.zenyte.game.packet;

import com.zenyte.game.world.entity.player.Player;
import net.rsprot.protocol.message.ZoneProt;
import org.jetbrains.annotations.NotNull;

/**
 * Session 11c compatibility bridge for NR's legacy zone-update encoders.
 *
 * Game logic still constructs {@code new LocAdd(object)}, {@code new ObjAdd(item)}, etc. and
 * hands them to {@link Player#sendZoneUpdate(int, int, GamePacketEncoder)}. Those encoder
 * classes now also implement this interface so the old object can be converted into the
 * RSProt zone payload at queue time — no call sites change.
 *
 * Drop-in path: core/src/main/java/com/zenyte/game/packet/ZoneProtConvertible.java
 */
public interface ZoneProtConvertible {

	/**
	 * @param player the observing player (needed for projectile index resolution etc.)
	 * @return the RSProt zone payload equivalent of this legacy encoder, or {@code null}
	 *         if it cannot be represented (the update is then silently dropped).
	 */
	ZoneProt toZoneProt(@NotNull Player player);
}
