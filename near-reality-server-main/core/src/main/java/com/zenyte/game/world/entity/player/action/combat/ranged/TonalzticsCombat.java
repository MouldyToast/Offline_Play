package com.zenyte.game.world.entity.player.action.combat.ranged;

import com.near_reality.game.world.entity.player.action.combat.AmmunitionDefinition;
import com.zenyte.game.item.Item;
import com.zenyte.game.item.ItemId;
import com.zenyte.game.util.Utils;
import com.zenyte.game.world.entity.Entity;
import com.zenyte.game.world.entity.masks.Hit;
import com.zenyte.game.world.entity.masks.HitType;
import com.zenyte.game.world.entity.player.Player;
import com.zenyte.game.world.entity.player.action.combat.RangedCombat;
import com.zenyte.game.world.entity.player.action.combat.SpecialType;
import com.zenyte.game.world.entity.player.container.impl.equipment.EquipmentSlot;
import com.zenyte.game.world.region.RegionArea;
import com.zenyte.game.world.region.area.plugins.PlayerCombatPlugin;

/**
 * Tonalztics of ralos combat.
 * Uncharged (28919): single hit capped at 75% of max ranged hit.
 * Charged (28922): two hits (double projectile, double hitsplat).
 * No ammo consumption — weapon is its own ammo.
 */
public class TonalzticsCombat extends RangedCombat {

    public TonalzticsCombat(Entity target, AmmunitionDefinition defs) {
        super(target, defs);
    }

    private boolean isCharged() {
        final Item weapon = player.getEquipment().getItem(EquipmentSlot.WEAPON);
        return weapon != null && weapon.getId() == ItemId.TONALZTICS_OF_RALOS;
    }

    @Override
    public int processAfterMovement() {
        if (!isWithinAttackDistance()) {
            return 0;
        }
        if (!canAttack()) {
            return -1;
        }
        final RegionArea area = player.getArea();
        if (area instanceof PlayerCombatPlugin) {
            ((PlayerCombatPlugin) area).onAttack(player, target, "Ranged", null, false);
        }
        addAttackedByDelay(player, target);
        if (player.getCombatDefinitions().isUsingSpecial()) {
            final int delay = useSpecial(player, SpecialType.RANGED);
            if (delay != -1) {
                return delay;
            }
        }
        final int ticks = this.fireProjectile();
        animate();
        resetFlag();

        if (isCharged()) {
            // Charged: two hitsplats
            final Hit hit1 = getHit(player, target, 1, 1, 1, false);
            final Hit hit2 = getHit(player, target, 1, 1, 1, false);
            delayHit(ticks, hit1);
            delayHit(ticks + 1, hit2);
            if (hit1.getDamage() > 0 || hit2.getDamage() > 0) {
                addPoisonTask(ticks);
            }
        } else {
            // Uncharged: single hit capped at 75% of max
            final Hit hit = getHit(player, target, 1, 1, 1, false);
            int maxHit = getMaxHit(player, 1, 1, false);
            int cap = (int) (maxHit * 0.75);
            if (hit.getDamage() > cap) {
                hit.setDamage(cap);
            }
            delayHit(ticks, hit);
            if (hit.getDamage() > 0) {
                addPoisonTask(ticks);
            }
        }

        drawback();
        checkIfShouldTerminate(HitType.RANGED);
        return getWeaponSpeed();
    }

    @Override
    protected void dropAmmunition(final int delay, final boolean destroy) {
        // No ammo consumption — weapon is self-ammo
    }
}