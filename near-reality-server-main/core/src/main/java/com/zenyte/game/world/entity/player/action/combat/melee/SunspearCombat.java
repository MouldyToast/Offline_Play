package com.zenyte.game.world.entity.player.action.combat.melee;

import com.zenyte.game.world.entity.Entity;
import com.zenyte.game.world.entity.masks.Hit;
import com.zenyte.game.world.entity.npc.NPC;
import com.zenyte.game.world.entity.player.Player;
import com.zenyte.game.world.entity.player.action.combat.CombatUtilities;
import com.zenyte.game.world.entity.player.action.combat.MeleeCombat;

/**
 * Sunspear: silver weapon with +25% accuracy and +50% damage vs vampyres.
 * Full damage to all vampyre tiers. Also Corpbane (full damage to Corp on stab).
 */
public class SunspearCombat extends MeleeCombat {

    public SunspearCombat(Entity target) {
        super(target);
    }

    private boolean isVampyre() {
        return CombatUtilities.isVampyric(target);
    }

    @Override
    public int getAccuracy(Player player, Entity target, double resultModifier) {
        if (isVampyre()) {
            resultModifier *= 1.25; // +25% accuracy vs vampyres
        }
        return super.getAccuracy(player, target, resultModifier);
    }

    @Override
    public int getMaxHit(Player player, double passiveModifier, double activeModifier, boolean ignorePrayers) {
        if (isVampyre()) {
            passiveModifier *= 1.50; // +50% damage vs vampyres
        }
        return super.getMaxHit(player, passiveModifier, activeModifier, ignorePrayers);
    }
}