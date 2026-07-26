package com.zenyte.game.world.entity.player.action.combat.melee;

import com.zenyte.game.world.entity.Entity;
import com.zenyte.game.world.entity.masks.Hit;
import com.zenyte.game.world.entity.masks.HitType;
import com.zenyte.game.world.entity.player.Player;
import com.zenyte.game.world.entity.player.action.combat.MeleeCombat;

/**
 * Soulreaper axe passive: each hit adds a Soul Stack (max 5), costs 8 HP.
 * Each stack provides +6% Strength level boost to max hit (up to +30%).
 * Stacks are consumed by the BEHEAD special attack (in SpecialAttack.java).
 */
public class SoulreaperAxeCombat extends MeleeCombat {

    public static final String STACKS_KEY = "soulreaper_stacks";

    public SoulreaperAxeCombat(Entity target) {
        super(target);
    }

    public static int getStacks(Player player) {
        return player.getNumericTemporaryAttribute(STACKS_KEY).intValue();
    }

    @Override
    public int getMaxHit(Player player, double passiveModifier, double activeModifier, boolean ignorePrayers) {
        int stacks = getStacks(player);
        // +6% max hit per stack, applied as a passive multiplier
        double soulBoost = 1.0 + (stacks * 0.06);
        return super.getMaxHit(player, passiveModifier * soulBoost, activeModifier, ignorePrayers);
    }

    @Override
    protected void extra(Hit hit) {
        super.extra(hit);
        if (hit.getDamage() > 0) {
            // Add a soul stack (stack is added AFTER damage calc per wiki)
            int stacks = getStacks(player);
            if (stacks < 5) {
                stacks++;
                player.addTemporaryAttribute(STACKS_KEY, stacks);
            }
            // Self-damage: 8 HP per attack while building stacks
            player.applyHit(new Hit(8, HitType.REGULAR));
        }
    }
}