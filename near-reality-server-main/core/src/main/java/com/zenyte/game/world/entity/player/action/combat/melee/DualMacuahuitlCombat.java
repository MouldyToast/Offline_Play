package com.zenyte.game.world.entity.player.action.combat.melee;

import com.zenyte.game.util.Utils;
import com.zenyte.game.world.entity.Entity;
import com.zenyte.game.world.entity.masks.Hit;
import com.zenyte.game.world.entity.masks.HitType;
import com.zenyte.game.world.entity.npc.combatdefs.AttackType;
import com.zenyte.game.world.entity.player.Player;
import com.zenyte.game.world.entity.player.action.combat.CombatUtilities;
import com.zenyte.game.world.entity.player.action.combat.MeleeCombat;

/**
 * Dual macuahuitl: hits twice per attack, max hit halved per hitsplat.
 * Second hit only rolls if first hit lands (sequential accuracy).
 * Bloodrager set effect (33% faster attack with full blood moon) is not
 * implemented — requires armor set detection that doesn't exist yet.
 */
public class DualMacuahuitlCombat extends MeleeCombat {

    public DualMacuahuitlCombat(Entity target) {
        super(target);
    }

    @Override
    public int getRandomHit(Player player, Entity target, int maxhit, double modifier, AttackType attackType) {
        if (CombatUtilities.isAlwaysTakeMaxHit(target, HitType.MELEE)) {
            return maxhit;
        }
        // First hit: halved max, normal accuracy roll
        int halfMax = maxhit / 2;
        final int accuracy = getAccuracy(player, target, modifier);
        final int targetRoll = getTargetDefenceRoll(player, target, attackType);
        sendDebug(accuracy, targetRoll, maxhit);

        int accRoll = Utils.random(accuracy);
        int defRoll = Utils.random(targetRoll);
        if (accRoll <= defRoll) {
            return 0; // first hit missed — both miss
        }
        int hit1 = Utils.random(halfMax);

        // Second hit: sequential — only rolls if first hit landed
        int secondHalfMax = maxhit - halfMax; // handles odd max hits (round up)
        accRoll = Utils.random(accuracy);
        defRoll = Utils.random(targetRoll);
        int hit2 = (accRoll > defRoll) ? Utils.random(secondHalfMax) : 0;

        // Schedule second hitsplat 1 tick after first
        final int finalHit2 = hit2;
        if (finalHit2 > 0) {
            delayHit(target, 1, new Hit(player, finalHit2, HitType.MELEE));
        } else {
            delayHit(target, 1, new Hit(player, 0, HitType.MELEE));
        }
        return hit1;
    }
}