package com.zenyte.game.world.entity.player.action.combat.melee;

import com.zenyte.game.task.WorldTasksManager;
import com.zenyte.game.util.Utils;
import com.zenyte.game.world.entity.Entity;
import com.zenyte.game.world.entity.Toxins.ToxinType;
import com.zenyte.game.world.entity.masks.Hit;
import com.zenyte.game.world.entity.player.action.combat.CombatUtilities;
import com.zenyte.game.world.entity.player.action.combat.MeleeCombat;

/**
 * Noxious halberd passive: 33% chance to envenom on hit (50% with serp helm).
 * Halberd 2-tile range is handled automatically by isExtendedMeleeDistance
 * via weaponName.contains("halberd").
 */
public class NoxiousHalberdCombat extends MeleeCombat {

    public NoxiousHalberdCombat(Entity target) {
        super(target);
    }

    @Override
    protected void extra(Hit hit) {
        super.extra(hit);
        if (hit.getDamage() > 0) {
            // 33% venom chance, 50% with serpentine helm
            int chance = CombatUtilities.isWearingSerpentineHelmet(player) ? 2 : 3;
            if (Utils.random(chance - 1) == 0) {
                WorldTasksManager.schedule(() ->
                    target.getToxins().applyToxin(ToxinType.VENOM, 6, player));
            }
        }
    }
}