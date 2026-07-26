package com.zenyte.plugins.item;

import com.zenyte.game.item.Item;
import com.zenyte.game.item.ItemId;
import com.zenyte.game.model.item.pluginextensions.ChargeExtension;
import com.zenyte.game.model.item.pluginextensions.ItemPlugin;
import com.zenyte.game.util.Utils;
import com.zenyte.game.world.entity.player.Player;
import com.zenyte.game.world.entity.player.container.ContainerWrapper;
import com.zenyte.game.world.entity.player.container.impl.equipment.EquipmentSlot;
import com.zenyte.game.world.entity.player.dialogue.Dialogue;

/**
 * Eye of Ayak powered staff — charge with 2 death + 1 chaos per cast, or 1 demon tear.
 * Max 50,000 charges. Uncharged variant: 31115. Charged: 31113.
 */
public class EyeOfAyakPlugin extends ItemPlugin implements ChargeExtension {

    private static final int MAX_CHARGES = 50000;
    private static final int DEATH_RUNE = 560;
    private static final int CHAOS_RUNE = 562;

    @Override
    public void handle() {
        bind("Charge", (player, item, container, slotId) -> {
            final int charges = item.getCharges();
            if (charges >= MAX_CHARGES) {
                player.sendMessage("Your Eye of Ayak is already fully charged.");
                return;
            }
            // Each charge = 2 death + 1 chaos
            final int deathAvail = player.getInventory().getAmountOf(DEATH_RUNE) / 2;
            final int chaosAvail = player.getInventory().getAmountOf(CHAOS_RUNE);
            final int chargesFromRunes = Math.min(deathAvail, chaosAvail);
            if (chargesFromRunes < 1) {
                player.sendMessage("You need at least 2 death runes and 1 chaos rune per charge.");
                return;
            }
            final int maxCanAdd = Math.min(MAX_CHARGES - charges, chargesFromRunes);
            player.sendInputInt("How many charges do you wish to add? (Up to " + Utils.format(maxCanAdd) + ")", val -> {
                final int toAdd = Math.min(maxCanAdd, val);
                if (toAdd < 1) return;
                final int deathCost = toAdd * 2;
                final int chaosCost = toAdd;
                if (!player.getInventory().containsItem(DEATH_RUNE, deathCost) ||
                    !player.getInventory().containsItem(CHAOS_RUNE, chaosCost)) {
                    return;
                }
                player.getInventory().deleteItem(new Item(DEATH_RUNE, deathCost));
                player.getInventory().deleteItem(new Item(CHAOS_RUNE, chaosCost));
                item.setCharges(charges + toAdd);
                if (item.getId() == ItemId.EYE_OF_AYAK_UNCHARGED) {
                    item.setId(ItemId.EYE_OF_AYAK);
                }
                container.refresh(slotId);
                player.sendMessage("You add " + Utils.format(toAdd) + " charges to your Eye of Ayak. It now has " + Utils.format(item.getCharges()) + " charges.");
            });
        });

        bind("Uncharge", (player, item, container, slotId) -> {
            player.getDialogueManager().start(new Dialogue(player) {
                @Override
                public void buildDialogue() {
                    options("Uncharge the Eye of Ayak and recover your runes?",
                        new DialogueOption("Yes.", () -> {
                            final int charges = item.getCharges();
                            if (charges > 0) {
                                player.getInventory().addOrDrop(new Item(DEATH_RUNE, charges * 2));
                                player.getInventory().addOrDrop(new Item(CHAOS_RUNE, charges));
                                player.sendMessage("You recover " + Utils.format(charges * 2) + " death runes and " + Utils.format(charges) + " chaos runes.");
                            }
                            item.setCharges(0);
                            if (item.getId() == ItemId.EYE_OF_AYAK) {
                                item.setId(ItemId.EYE_OF_AYAK_UNCHARGED);
                            }
                            container.refresh(slotId);
                        }),
                        new DialogueOption("No."));
                }
            });
        });
    }

    @Override
    public int[] getItems() {
        return new int[] { ItemId.EYE_OF_AYAK, ItemId.EYE_OF_AYAK_UNCHARGED };
    }

    @Override
    public void removeCharges(Player player, Item item, ContainerWrapper wrapper, int slotId, int amount) {
        item.setCharges(Math.max(0, item.getCharges() - 1));
        if (item.getCharges() <= 0) {
            item.setId(ItemId.EYE_OF_AYAK_UNCHARGED);
            player.getEquipment().refresh(EquipmentSlot.WEAPON.getSlot());
            player.sendMessage("<col=ef1020>Your Eye of Ayak has run out of charges.</col>");
        }
    }

    @Override
    public void checkCharges(Player player, Item item) {
        player.sendMessage("Your Eye of Ayak has " + Utils.format(item.getCharges()) + " charge" + (item.getCharges() == 1 ? "" : "s") + " remaining.");
    }
}