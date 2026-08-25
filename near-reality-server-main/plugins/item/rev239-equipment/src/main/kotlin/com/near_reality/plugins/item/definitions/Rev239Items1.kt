package com.near_reality.plugins.item.definitions

import com.near_reality.scripts.item.definitions.ItemDefinitionsScript
import com.zenyte.game.world.entity.player.Bonuses
import com.zenyte.game.world.entity.player.Bonuses.Bonus.*
import com.zenyte.game.world.entity.player.container.impl.equipment.EquipmentSlot

class Rev239Items1 : ItemDefinitionsScript() {
    init {

        // Excalibur (id: 35)
        35 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(20)
                    ATT_SLASH(29)
                    ATT_CRUSH(-2)
                    DEF_SLASH(3)
                    DEF_CRUSH(2)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(25)
                }
            }
        }

        // Khazard helmet (id: 74)
        74 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(4)
                    DEF_SLASH(5)
                    DEF_CRUSH(3)
                }
            }
        }

        // Khazard armour (id: 75)
        75 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(11)
                    DEF_CRUSH(10)
                }
            }
        }

        // Ice arrows (id: 78)
        78 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(16)
                }
            }
        }

        // Staff of armadyl (id: 84)
        84 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Pendant of lucien (id: 86)
        86 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Armadyl pendant (id: 87)
        87 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Boots of lightness (id: 88)
        88 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Boots of lightness (id: 89)
        89 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Fish food (id: 272)
        272 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Cattleprod (id: 278)
        278 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(2)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Plague jacket (id: 284)
        284 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Plague trousers (id: 285)
        285 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Orange goblin mail (id: 286)
        286 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Blue goblin mail (id: 287)
        287 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Goblin mail (id: 288)
        288 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Glarial's amulet (id: 295)
        295 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Oyster pearl (id: 411)
        411 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Oyster pearls (id: 413)
        413 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Lathas' amulet (id: 421)
        421 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Priest gown (id: 426)
        426 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    PRAYER(3)
                }
            }
        }

        // Priest gown (id: 428)
        428 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    PRAYER(3)
                }
            }
        }

        // Medical gown (id: 430)
        430 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Pickaxe handle (id: 466)
        466 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Broken pickaxe (id: 468)
        468 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Broken pickaxe (id: 470)
        470 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Broken pickaxe (id: 472)
        472 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Broken pickaxe (id: 474)
        474 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Broken pickaxe (id: 476)
        476 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Broken pickaxe (id: 478)
        478 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Axe handle (id: 492)
        492 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Broken axe (id: 494)
        494 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(2)
                    ATT_CRUSH(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Broken axe (id: 496)
        496 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(2)
                    ATT_CRUSH(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Broken axe (id: 498)
        498 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(4)
                    ATT_CRUSH(2)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Broken axe (id: 500)
        500 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(5)
                    ATT_CRUSH(2)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(7)
                }
            }
        }

        // Broken axe (id: 502)
        502 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(6)
                    ATT_CRUSH(3)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(8)
                }
            }
        }

        // Broken axe (id: 504)
        504 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(8)
                    ATT_CRUSH(4)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(11)
                }
            }
        }

        // Broken axe (id: 506)
        506 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(13)
                    ATT_CRUSH(6)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(18)
                }
            }
        }

        // Druid's robe (id: 538)
        538 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    PRAYER(4)
                }
            }
        }

        // Druid's robe top (id: 540)
        540 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    PRAYER(4)
                }
            }
        }

        // Monk's robe (id: 542)
        542 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    PRAYER(5)
                }
            }
        }

        // Monk's robe top (id: 544)
        544 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    PRAYER(6)
                }
            }
        }

        // Shade robe top (id: 546)
        546 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    PRAYER(5)
                }
            }
        }

        // Shade robe (id: 548)
        548 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    PRAYER(4)
                }
            }
        }

        // Ghostspeak amulet (id: 552)
        552 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Blue wizard robe (id: 577)
        577 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Blue wizard hat (id: 579)
        579 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(2)
                    DEF_MAGIC(2)
                }
            }
        }

        // Black robe (id: 581)
        581 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Gnome amulet (id: 589)
        589 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    DEF_STAB(13)
                    DEF_SLASH(13)
                    DEF_CRUSH(13)
                }
            }
        }

        // Bronze fire arrow (id: 598)
        598 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(7)
                }
            }
        }

        // Beads of the dead (id: 616)
        616 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(1)
                    ATT_SLASH(1)
                    ATT_CRUSH(1)
                    ATT_MAGIC(1)
                    ATT_RANGED(1)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_MAGIC(1)
                    DEF_RANGE(1)
                    Bonuses.Bonus.STRENGTH(1)
                    PRAYER(1)
                }
            }
        }

        // Pink boots (id: 626)
        626 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Green boots (id: 628)
        628 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Blue boots (id: 630)
        630 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Cream boots (id: 632)
        632 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Turquoise boots (id: 634)
        634 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Pink robe top (id: 636)
        636 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Green robe top (id: 638)
        638 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Blue robe top (id: 640)
        640 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Cream robe top (id: 642)
        642 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Turquoise robe top (id: 644)
        644 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Pink robe bottoms (id: 646)
        646 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Green robe bottoms (id: 648)
        648 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Blue robe bottoms (id: 650)
        650 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Cream robe bottoms (id: 652)
        652 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Turquoise robe bottoms (id: 654)
        654 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Pink hat (id: 656)
        656 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Green hat (id: 658)
        658 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Blue hat (id: 660)
        660 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Cream hat (id: 662)
        662 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Turquoise hat (id: 664)
        664 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Blurite sword (id: 667)
        667 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(9)
                    ATT_SLASH(14)
                    ATT_CRUSH(-2)
                    DEF_SLASH(3)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(10)
                }
            }
        }

        // Rock pick (id: 675)
        675 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Holy water (id: 732)
        732 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(6)
                    RANGE_STRENGTH(12)
                }
            }
        }

        // Blue hat (id: 740)
        740 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(2)
                    DEF_MAGIC(2)
                }
            }
        }

        // Dark dagger (id: 746)
        746 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(3)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                }
            }
        }

        // Glowing dagger (id: 747)
        747 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(3)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                }
            }
        }

        // Gnomeball (id: 751)
        751 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Phoenix crossbow (id: 767)
        767 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                    normalAttackDistance = 5
                    longAttackDistance = 7
                }
                bonuses {
                    ATT_RANGED(6)
                }
            }
        }

        // Dramen staff (id: 772)
        772 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(-1)
                    ATT_SLASH(-1)
                    ATT_CRUSH(10)
                    ATT_MAGIC(10)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(10)
                    Bonuses.Bonus.STRENGTH(10)
                }
            }
        }

        // 'perfect' ring (id: 773)
        773 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // 'perfect' necklace (id: 774)
        774 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Cooking gauntlets (id: 775)
        775 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(2)
                    ATT_SLASH(2)
                    ATT_CRUSH(2)
                    DEF_STAB(8)
                    DEF_SLASH(9)
                    DEF_CRUSH(7)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Goldsmith gauntlets (id: 776)
        776 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(2)
                    ATT_SLASH(2)
                    ATT_CRUSH(2)
                    DEF_STAB(8)
                    DEF_SLASH(9)
                    DEF_CRUSH(7)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Chaos gauntlets (id: 777)
        777 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(2)
                    ATT_SLASH(2)
                    ATT_CRUSH(2)
                    DEF_STAB(8)
                    DEF_SLASH(9)
                    DEF_CRUSH(7)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Steel gauntlets (id: 778)
        778 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(2)
                    ATT_SLASH(2)
                    ATT_CRUSH(2)
                    DEF_STAB(8)
                    DEF_SLASH(9)
                    DEF_CRUSH(7)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Bronze thrownaxe (id: 800)
        800 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(4)
                    RANGE_STRENGTH(5)
                }
            }
        }

        // Iron thrownaxe (id: 801)
        801 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(5)
                    RANGE_STRENGTH(7)
                }
            }
        }

        // Steel thrownaxe (id: 802)
        802 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(8)
                    RANGE_STRENGTH(11)
                }
            }
        }

        // Mithril thrownaxe (id: 803)
        803 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(12)
                    RANGE_STRENGTH(16)
                }
            }
        }

        // Adamant thrownaxe (id: 804)
        804 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(17)
                    RANGE_STRENGTH(23)
                }
            }
        }

        // Rune thrownaxe (id: 805)
        805 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(26)
                    RANGE_STRENGTH(36)
                }
            }
        }

        // Bronze dart (id: 806)
        806 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 3
                    longAttackDistance = 5
                }
                bonuses {
                    RANGE_STRENGTH(1)
                }
            }
        }

        // Iron dart (id: 807)
        807 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 3
                    longAttackDistance = 5
                }
                bonuses {
                    RANGE_STRENGTH(2)
                }
            }
        }

        // Steel dart (id: 808)
        808 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 3
                    longAttackDistance = 5
                }
                bonuses {
                    RANGE_STRENGTH(3)
                }
            }
        }

        // Mithril dart (id: 809)
        809 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 3
                    longAttackDistance = 5
                }
                bonuses {
                    RANGE_STRENGTH(9)
                }
            }
        }

        // Adamant dart (id: 810)
        810 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 3
                    longAttackDistance = 5
                }
                bonuses {
                    RANGE_STRENGTH(17)
                }
            }
        }

        // Rune dart (id: 811)
        811 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 3
                    longAttackDistance = 5
                }
                bonuses {
                    RANGE_STRENGTH(26)
                }
            }
        }

        // Bronze dart(p) (id: 812)
        812 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 3
                    longAttackDistance = 5
                }
                bonuses {
                    RANGE_STRENGTH(1)
                }
            }
        }

        // Iron dart (p) (id: 813)
        813 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 3
                    longAttackDistance = 5
                }
                bonuses {
                    RANGE_STRENGTH(2)
                }
            }
        }

        // Steel dart(p) (id: 814)
        814 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 3
                    longAttackDistance = 5
                }
                bonuses {
                    RANGE_STRENGTH(3)
                }
            }
        }

        // Mithril dart(p) (id: 815)
        815 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 3
                    longAttackDistance = 5
                }
                bonuses {
                    RANGE_STRENGTH(9)
                }
            }
        }

        // Adamant dart(p) (id: 816)
        816 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 3
                    longAttackDistance = 5
                }
                bonuses {
                    RANGE_STRENGTH(17)
                }
            }
        }

        // Rune dart(p) (id: 817)
        817 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 3
                    longAttackDistance = 5
                }
                bonuses {
                    RANGE_STRENGTH(26)
                }
            }
        }

        // Poisoned dart(p) (id: 818)
        818 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Bronze javelin (id: 825)
        825 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(25)
                }
            }
        }

        // Iron javelin (id: 826)
        826 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(42)
                }
            }
        }

        // Steel javelin (id: 827)
        827 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(64)
                }
            }
        }

        // Mithril javelin (id: 828)
        828 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(85)
                }
            }
        }

        // Adamant javelin (id: 829)
        829 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(102)
                }
            }
        }

        // Rune javelin (id: 830)
        830 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(124)
                }
            }
        }

        // Bronze javelin(p) (id: 831)
        831 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(25)
                }
            }
        }

        // Iron javelin(p) (id: 832)
        832 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(42)
                }
            }
        }

        // Steel javelin(p) (id: 833)
        833 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(64)
                }
            }
        }

        // Mithril javelin(p) (id: 834)
        834 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(85)
                }
            }
        }

        // Adamant javelin(p) (id: 835)
        835 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(102)
                }
            }
        }

        // Rune javelin(p) (id: 836)
        836 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(124)
                }
            }
        }

        // Crossbow (id: 837)
        837 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(6)
                }
            }
        }

        // Longbow (id: 839)
        839 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(8)
                }
            }
        }

        // Shortbow (id: 841)
        841 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_RANGED(8)
                }
            }
        }

        // Oak shortbow (id: 843)
        843 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_RANGED(14)
                }
            }
        }

        // Oak longbow (id: 845)
        845 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(14)
                }
            }
        }

        // Willow longbow (id: 847)
        847 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(20)
                }
            }
        }

        // Willow shortbow (id: 849)
        849 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_RANGED(20)
                }
            }
        }

        // Maple longbow (id: 851)
        851 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(29)
                }
            }
        }

        // Maple shortbow (id: 853)
        853 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_RANGED(29)
                }
            }
        }

        // Yew longbow (id: 855)
        855 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(47)
                }
            }
        }

        // Yew shortbow (id: 857)
        857 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_RANGED(47)
                }
            }
        }

        // Magic longbow (id: 859)
        859 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(69)
                }
            }
        }

        // Magic shortbow (id: 861)
        861 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_RANGED(69)
                }
            }
        }

        // Iron knife (id: 863)
        863 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(5)
                    RANGE_STRENGTH(4)
                }
            }
        }

        // Bronze knife (id: 864)
        864 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(4)
                    RANGE_STRENGTH(3)
                }
            }
        }

        // Steel knife (id: 865)
        865 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(8)
                    RANGE_STRENGTH(7)
                }
            }
        }

        // Mithril knife (id: 866)
        866 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(11)
                    RANGE_STRENGTH(10)
                }
            }
        }

        // Adamant knife (id: 867)
        867 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(15)
                    RANGE_STRENGTH(14)
                }
            }
        }

        // Rune knife (id: 868)
        868 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(25)
                    RANGE_STRENGTH(24)
                }
            }
        }

        // Black knife (id: 869)
        869 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(10)
                    RANGE_STRENGTH(8)
                }
            }
        }

        // Bronze knife(p) (id: 870)
        870 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(4)
                    RANGE_STRENGTH(3)
                }
            }
        }

        // Iron knife(p) (id: 871)
        871 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(5)
                    RANGE_STRENGTH(4)
                }
            }
        }

        // Steel knife(p) (id: 872)
        872 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(8)
                    RANGE_STRENGTH(7)
                }
            }
        }

        // Mithril knife(p) (id: 873)
        873 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(11)
                    RANGE_STRENGTH(10)
                }
            }
        }

        // Black knife(p) (id: 874)
        874 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(10)
                    RANGE_STRENGTH(8)
                }
            }
        }

        // Adamant knife(p) (id: 875)
        875 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(15)
                    RANGE_STRENGTH(14)
                }
            }
        }

        // Rune knife(p) (id: 876)
        876 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(25)
                    RANGE_STRENGTH(24)
                }
            }
        }

        // Bronze bolts (id: 877)
        877 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(10)
                }
            }
        }

        // Bronze bolts (p) (id: 878)
        878 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(10)
                }
            }
        }

        // Opal bolts (id: 879)
        879 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(14)
                }
            }
        }

        // Pearl bolts (id: 880)
        880 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(48)
                }
            }
        }

        // Barbed bolts (id: 881)
        881 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(12)
                }
            }
        }

        // Bronze arrow (id: 882)
        882 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(7)
                }
            }
        }

        // Bronze arrow(p) (id: 883)
        883 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(7)
                }
            }
        }

        // Iron arrow (id: 884)
        884 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(10)
                }
            }
        }

        // Iron arrow(p) (id: 885)
        885 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(10)
                }
            }
        }

        // Steel arrow (id: 886)
        886 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(16)
                }
            }
        }

        // Steel arrow(p) (id: 887)
        887 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(16)
                }
            }
        }

        // Mithril arrow (id: 888)
        888 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(22)
                }
            }
        }

        // Mithril arrow(p) (id: 889)
        889 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(22)
                }
            }
        }

        // Adamant arrow (id: 890)
        890 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(31)
                }
            }
        }

        // Adamant arrow(p) (id: 891)
        891 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(31)
                }
            }
        }

        // Rune arrow (id: 892)
        892 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(49)
                }
            }
        }

        // Rune arrow(p) (id: 893)
        893 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(49)
                }
            }
        }

        // Bronze fire arrow (lit) (id: 942)
        942 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(7)
                }
            }
        }

        // Throwing rope (id: 945)
        945 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Machete (id: 975)
        975 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_SLASH(6)
                    ATT_CRUSH(-2)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // White apron (id: 1005)
        1005 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Red cape (id: 1007)
        1007 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Brass necklace (id: 1009)
        1009 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Blue skirt (id: 1011)
        1011 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Pink skirt (id: 1013)
        1013 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Black skirt (id: 1015)
        1015 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Wizard hat (id: 1017)
        1017 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(2)
                    DEF_MAGIC(2)
                }
            }
        }

        // Black cape (id: 1019)
        1019 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Blue cape (id: 1021)
        1021 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Yellow cape (id: 1023)
        1023 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Green cape (id: 1027)
        1027 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Purple cape (id: 1029)
        1029 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Orange cape (id: 1031)
        1031 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Zamorak monk bottom (id: 1033)
        1033 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(2)
                    DEF_MAGIC(3)
                    PRAYER(3)
                }
            }
        }

        // Zamorak monk top (id: 1035)
        1035 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(2)
                    DEF_MAGIC(3)
                    PRAYER(3)
                }
            }
        }

        // Cape of legends (id: 1052)
        1052 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_STAB(7)
                    DEF_SLASH(7)
                    DEF_CRUSH(7)
                    DEF_MAGIC(7)
                    DEF_RANGE(7)
                }
            }
        }

        // Leather gloves (id: 1059)
        1059 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                }
            }
        }

        // Leather boots (id: 1061)
        1061 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Leather vambraces (id: 1063)
        1063 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_RANGED(4)
                    DEF_STAB(2)
                    DEF_SLASH(2)
                    DEF_CRUSH(1)
                }
            }
        }

        // Green d'hide vambraces (id: 1065)
        1065 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(8)
                    DEF_STAB(1)
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                    DEF_MAGIC(2)
                }
            }
        }

        // Iron platelegs (id: 1067)
        1067 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(11)
                    DEF_SLASH(10)
                    DEF_CRUSH(10)
                    DEF_MAGIC(-4)
                    DEF_RANGE(10)
                }
            }
        }

        // Steel platelegs (id: 1069)
        1069 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(17)
                    DEF_SLASH(16)
                    DEF_CRUSH(15)
                    DEF_MAGIC(-4)
                    DEF_RANGE(16)
                }
            }
        }

        // Mithril platelegs (id: 1071)
        1071 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(24)
                    DEF_SLASH(22)
                    DEF_CRUSH(20)
                    DEF_MAGIC(-4)
                    DEF_RANGE(22)
                }
            }
        }

        // Adamant platelegs (id: 1073)
        1073 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(33)
                    DEF_SLASH(31)
                    DEF_CRUSH(29)
                    DEF_MAGIC(-4)
                    DEF_RANGE(31)
                }
            }
        }

        // Bronze platelegs (id: 1075)
        1075 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(8)
                    DEF_SLASH(7)
                    DEF_CRUSH(6)
                    DEF_MAGIC(-4)
                    DEF_RANGE(7)
                }
            }
        }

        // Black platelegs (id: 1077)
        1077 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(21)
                    DEF_SLASH(20)
                    DEF_CRUSH(19)
                    DEF_MAGIC(-4)
                    DEF_RANGE(20)
                }
            }
        }

        // Rune platelegs (id: 1079)
        1079 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(51)
                    DEF_SLASH(49)
                    DEF_CRUSH(47)
                    DEF_MAGIC(-4)
                    DEF_RANGE(49)
                }
            }
        }

        // Iron plateskirt (id: 1081)
        1081 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(11)
                    DEF_SLASH(10)
                    DEF_CRUSH(10)
                    DEF_MAGIC(-4)
                    DEF_RANGE(10)
                }
            }
        }

        // Steel plateskirt (id: 1083)
        1083 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(17)
                    DEF_SLASH(16)
                    DEF_CRUSH(15)
                    DEF_MAGIC(-4)
                    DEF_RANGE(16)
                }
            }
        }

        // Mithril plateskirt (id: 1085)
        1085 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(24)
                    DEF_SLASH(22)
                    DEF_CRUSH(20)
                    DEF_MAGIC(-4)
                    DEF_RANGE(22)
                }
            }
        }

        // Bronze plateskirt (id: 1087)
        1087 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(8)
                    DEF_SLASH(7)
                    DEF_CRUSH(6)
                    DEF_MAGIC(-4)
                    DEF_RANGE(7)
                }
            }
        }

        // Black plateskirt (id: 1089)
        1089 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(21)
                    DEF_SLASH(20)
                    DEF_CRUSH(19)
                    DEF_MAGIC(-4)
                    DEF_RANGE(20)
                }
            }
        }

        // Adamant plateskirt (id: 1091)
        1091 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(33)
                    DEF_SLASH(31)
                    DEF_CRUSH(29)
                    DEF_MAGIC(-4)
                    DEF_RANGE(31)
                }
            }
        }

        // Rune plateskirt (id: 1093)
        1093 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(51)
                    DEF_SLASH(49)
                    DEF_CRUSH(47)
                    DEF_MAGIC(-4)
                    DEF_RANGE(49)
                }
            }
        }

        // Leather chaps (id: 1095)
        1095 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_RANGED(4)
                    DEF_STAB(2)
                    DEF_SLASH(2)
                    DEF_CRUSH(1)
                }
            }
        }

        // Studded chaps (id: 1097)
        1097 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-5)
                    ATT_RANGED(6)
                    DEF_STAB(15)
                    DEF_SLASH(16)
                    DEF_CRUSH(17)
                    DEF_MAGIC(6)
                    DEF_RANGE(16)
                }
            }
        }

        // Green d'hide chaps (id: 1099)
        1099 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(8)
                    DEF_STAB(12)
                    DEF_SLASH(15)
                    DEF_CRUSH(18)
                    DEF_MAGIC(8)
                    DEF_RANGE(17)
                }
            }
        }

        // Iron chainbody (id: 1101)
        1101 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    DEF_STAB(10)
                    DEF_SLASH(15)
                    DEF_CRUSH(19)
                    DEF_MAGIC(-3)
                    DEF_RANGE(12)
                }
            }
        }

        // Bronze chainbody (id: 1103)
        1103 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    DEF_STAB(7)
                    DEF_SLASH(11)
                    DEF_CRUSH(13)
                    DEF_MAGIC(-3)
                    DEF_RANGE(9)
                }
            }
        }

        // Steel chainbody (id: 1105)
        1105 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    DEF_STAB(17)
                    DEF_SLASH(25)
                    DEF_CRUSH(30)
                    DEF_MAGIC(-3)
                    DEF_RANGE(19)
                }
            }
        }

        // Black chainbody (id: 1107)
        1107 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    DEF_STAB(22)
                    DEF_SLASH(32)
                    DEF_CRUSH(39)
                    DEF_MAGIC(-3)
                    DEF_RANGE(24)
                }
            }
        }

        // Mithril chainbody (id: 1109)
        1109 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    DEF_STAB(25)
                    DEF_SLASH(35)
                    DEF_CRUSH(42)
                    DEF_MAGIC(-3)
                    DEF_RANGE(27)
                }
            }
        }

        // Adamant chainbody (id: 1111)
        1111 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    DEF_STAB(36)
                    DEF_SLASH(50)
                    DEF_CRUSH(61)
                    DEF_MAGIC(-3)
                    DEF_RANGE(38)
                }
            }
        }

        // Rune chainbody (id: 1113)
        1113 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    DEF_STAB(63)
                    DEF_SLASH(72)
                    DEF_CRUSH(78)
                    DEF_MAGIC(-3)
                    DEF_RANGE(65)
                }
            }
        }

        // Iron platebody (id: 1115)
        1115 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(21)
                    DEF_SLASH(20)
                    DEF_CRUSH(12)
                    DEF_MAGIC(-6)
                    DEF_RANGE(20)
                }
            }
        }

        // Bronze platebody (id: 1117)
        1117 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(15)
                    DEF_SLASH(14)
                    DEF_CRUSH(9)
                    DEF_MAGIC(-6)
                    DEF_RANGE(14)
                }
            }
        }

        // Steel platebody (id: 1119)
        1119 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(32)
                    DEF_SLASH(31)
                    DEF_CRUSH(24)
                    DEF_MAGIC(-6)
                    DEF_RANGE(31)
                }
            }
        }

        // Mithril platebody (id: 1121)
        1121 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(46)
                    DEF_SLASH(44)
                    DEF_CRUSH(38)
                    DEF_MAGIC(-6)
                    DEF_RANGE(44)
                }
            }
        }

        // Adamant platebody (id: 1123)
        1123 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(65)
                    DEF_SLASH(63)
                    DEF_CRUSH(55)
                    DEF_MAGIC(-6)
                    DEF_RANGE(63)
                }
            }
        }

        // Black platebody (id: 1125)
        1125 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(41)
                    DEF_SLASH(40)
                    DEF_CRUSH(30)
                    DEF_MAGIC(-6)
                    DEF_RANGE(40)
                }
            }
        }

        // Rune platebody (id: 1127)
        1127 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(82)
                    DEF_SLASH(80)
                    DEF_CRUSH(72)
                    DEF_MAGIC(-6)
                    DEF_RANGE(80)
                }
            }
        }

        // Leather body (id: 1129)
        1129 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-2)
                    ATT_RANGED(2)
                    DEF_STAB(8)
                    DEF_SLASH(9)
                    DEF_CRUSH(10)
                    DEF_MAGIC(4)
                    DEF_RANGE(9)
                }
            }
        }

        // Hardleather body (id: 1131)
        1131 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-4)
                    ATT_RANGED(8)
                    DEF_STAB(12)
                    DEF_SLASH(15)
                    DEF_CRUSH(18)
                    DEF_MAGIC(6)
                    DEF_RANGE(15)
                }
            }
        }

        // Studded body (id: 1133)
        1133 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-4)
                    ATT_RANGED(8)
                    DEF_STAB(18)
                    DEF_SLASH(25)
                    DEF_CRUSH(22)
                    DEF_MAGIC(8)
                    DEF_RANGE(25)
                }
            }
        }

        // Green d'hide body (id: 1135)
        1135 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(15)
                    DEF_STAB(18)
                    DEF_SLASH(27)
                    DEF_CRUSH(24)
                    DEF_MAGIC(20)
                    DEF_RANGE(35)
                }
            }
        }

        // Iron med helm (id: 1137)
        1137 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    DEF_STAB(4)
                    DEF_SLASH(5)
                    DEF_CRUSH(3)
                    DEF_MAGIC(-1)
                    DEF_RANGE(4)
                }
            }
        }

        // Bronze med helm (id: 1139)
        1139 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    DEF_STAB(3)
                    DEF_SLASH(4)
                    DEF_CRUSH(2)
                    DEF_MAGIC(-1)
                    DEF_RANGE(3)
                }
            }
        }

        // Steel med helm (id: 1141)
        1141 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    DEF_STAB(7)
                    DEF_SLASH(8)
                    DEF_CRUSH(6)
                    DEF_MAGIC(-1)
                    DEF_RANGE(7)
                }
            }
        }

        // Mithril med helm (id: 1143)
        1143 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    DEF_STAB(10)
                    DEF_SLASH(11)
                    DEF_CRUSH(9)
                    DEF_MAGIC(-1)
                    DEF_RANGE(10)
                }
            }
        }

        // Adamant med helm (id: 1145)
        1145 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    DEF_STAB(14)
                    DEF_SLASH(15)
                    DEF_CRUSH(13)
                    DEF_MAGIC(-1)
                    DEF_RANGE(14)
                }
            }
        }

        // Rune med helm (id: 1147)
        1147 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    DEF_STAB(22)
                    DEF_SLASH(23)
                    DEF_CRUSH(21)
                    DEF_MAGIC(-1)
                    DEF_RANGE(22)
                }
            }
        }

        // Dragon med helm (id: 1149)
        1149 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    DEF_STAB(33)
                    DEF_SLASH(35)
                    DEF_CRUSH(32)
                    DEF_MAGIC(-1)
                    DEF_RANGE(34)
                }
            }
        }

        // Black med helm (id: 1151)
        1151 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    DEF_STAB(9)
                    DEF_SLASH(10)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                }
            }
        }

        // Iron full helm (id: 1153)
        1153 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(6)
                    DEF_SLASH(7)
                    DEF_CRUSH(5)
                    DEF_MAGIC(-1)
                    DEF_RANGE(6)
                }
            }
        }

        // Bronze full helm (id: 1155)
        1155 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(4)
                    DEF_SLASH(5)
                    DEF_CRUSH(3)
                    DEF_MAGIC(-1)
                    DEF_RANGE(4)
                }
            }
        }

        // Steel full helm (id: 1157)
        1157 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(9)
                    DEF_SLASH(10)
                    DEF_CRUSH(7)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                }
            }
        }

        // Mithril full helm (id: 1159)
        1159 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(13)
                    DEF_SLASH(14)
                    DEF_CRUSH(11)
                    DEF_MAGIC(-1)
                    DEF_RANGE(13)
                }
            }
        }

        // Adamant full helm (id: 1161)
        1161 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(19)
                    DEF_SLASH(21)
                    DEF_CRUSH(16)
                    DEF_MAGIC(-1)
                    DEF_RANGE(19)
                }
            }
        }

        // Rune full helm (id: 1163)
        1163 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(30)
                    DEF_SLASH(32)
                    DEF_CRUSH(27)
                    DEF_MAGIC(-1)
                    DEF_RANGE(30)
                }
            }
        }

        // Black full helm (id: 1165)
        1165 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(12)
                    DEF_SLASH(13)
                    DEF_CRUSH(10)
                    DEF_MAGIC(-1)
                    DEF_RANGE(12)
                }
            }
        }

        // Leather cowl (id: 1167)
        1167 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_RANGED(1)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(4)
                    DEF_MAGIC(2)
                    DEF_RANGE(3)
                }
            }
        }

        // Coif (id: 1169)
        1169 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-1)
                    ATT_RANGED(2)
                    DEF_STAB(4)
                    DEF_SLASH(6)
                    DEF_CRUSH(8)
                    DEF_MAGIC(4)
                    DEF_RANGE(4)
                }
            }
        }

        // Wooden shield (id: 1171)
        1171 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    DEF_STAB(4)
                    DEF_SLASH(5)
                    DEF_CRUSH(3)
                    DEF_MAGIC(1)
                    DEF_RANGE(4)
                }
            }
        }

        // Bronze sq shield (id: 1173)
        1173 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-6)
                    DEF_STAB(5)
                    DEF_SLASH(6)
                    DEF_CRUSH(4)
                    DEF_RANGE(5)
                }
            }
        }

        // Iron sq shield (id: 1175)
        1175 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-6)
                    DEF_STAB(8)
                    DEF_SLASH(9)
                    DEF_CRUSH(7)
                    DEF_RANGE(8)
                }
            }
        }

        // Steel sq shield (id: 1177)
        1177 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-6)
                    DEF_STAB(12)
                    DEF_SLASH(13)
                    DEF_CRUSH(11)
                    DEF_RANGE(12)
                }
            }
        }

        // Black sq shield (id: 1179)
        1179 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-6)
                    DEF_STAB(15)
                    DEF_SLASH(16)
                    DEF_CRUSH(14)
                    DEF_RANGE(15)
                }
            }
        }

        // Mithril sq shield (id: 1181)
        1181 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-6)
                    DEF_STAB(17)
                    DEF_SLASH(19)
                    DEF_CRUSH(15)
                    DEF_RANGE(17)
                }
            }
        }

        // Adamant sq shield (id: 1183)
        1183 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-6)
                    DEF_STAB(24)
                    DEF_SLASH(26)
                    DEF_CRUSH(22)
                    DEF_RANGE(24)
                }
            }
        }

        // Rune sq shield (id: 1185)
        1185 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-6)
                    DEF_STAB(38)
                    DEF_SLASH(40)
                    DEF_CRUSH(36)
                    DEF_RANGE(38)
                }
            }
        }

        // Dragon sq shield (id: 1187)
        1187 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-6)
                    DEF_STAB(50)
                    DEF_SLASH(52)
                    DEF_CRUSH(48)
                    DEF_RANGE(50)
                }
            }
        }

        // Bronze kiteshield (id: 1189)
        1189 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-3)
                    DEF_STAB(5)
                    DEF_SLASH(7)
                    DEF_CRUSH(6)
                    DEF_MAGIC(-1)
                    DEF_RANGE(6)
                }
            }
        }

        // Iron kiteshield (id: 1191)
        1191 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-3)
                    DEF_STAB(8)
                    DEF_SLASH(10)
                    DEF_CRUSH(9)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                }
            }
        }

        // Steel kiteshield (id: 1193)
        1193 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-3)
                    DEF_STAB(13)
                    DEF_SLASH(15)
                    DEF_CRUSH(14)
                    DEF_MAGIC(-1)
                    DEF_RANGE(14)
                }
            }
        }

        // Black kiteshield (id: 1195)
        1195 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-3)
                    DEF_STAB(17)
                    DEF_SLASH(19)
                    DEF_CRUSH(18)
                    DEF_MAGIC(-1)
                    DEF_RANGE(18)
                }
            }
        }

        // Mithril kiteshield (id: 1197)
        1197 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-3)
                    DEF_STAB(18)
                    DEF_SLASH(22)
                    DEF_CRUSH(20)
                    DEF_MAGIC(-1)
                    DEF_RANGE(20)
                }
            }
        }

        // Adamant kiteshield (id: 1199)
        1199 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-3)
                    DEF_STAB(27)
                    DEF_SLASH(31)
                    DEF_CRUSH(29)
                    DEF_MAGIC(-1)
                    DEF_RANGE(29)
                }
            }
        }

        // Rune kiteshield (id: 1201)
        1201 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-3)
                    DEF_STAB(44)
                    DEF_SLASH(48)
                    DEF_CRUSH(46)
                    DEF_MAGIC(-1)
                    DEF_RANGE(46)
                }
            }
        }

        // Iron dagger (id: 1203)
        1203 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(3)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Bronze dagger (id: 1205)
        1205 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(2)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Steel dagger (id: 1207)
        1207 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(4)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(7)
                }
            }
        }

        // Mithril dagger (id: 1209)
        1209 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(11)
                    ATT_SLASH(5)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(10)
                }
            }
        }

        // Adamant dagger (id: 1211)
        1211 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(15)
                    ATT_SLASH(8)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(14)
                }
            }
        }

        // Rune dagger (id: 1213)
        1213 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(25)
                    ATT_SLASH(12)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(24)
                }
            }
        }

        // Dragon dagger (id: 1215)
        1215 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(40)
                    ATT_SLASH(25)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(40)
                }
            }
        }

        // Black dagger (id: 1217)
        1217 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(5)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(7)
                }
            }
        }

        // Iron dagger(p) (id: 1219)
        1219 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(3)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Bronze dagger(p) (id: 1221)
        1221 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(2)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Steel dagger(p) (id: 1223)
        1223 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(4)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(7)
                }
            }
        }

        // Mithril dagger(p) (id: 1225)
        1225 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(11)
                    ATT_SLASH(5)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(10)
                }
            }
        }

        // Adamant dagger(p) (id: 1227)
        1227 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(15)
                    ATT_SLASH(8)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(14)
                }
            }
        }

        // Rune dagger(p) (id: 1229)
        1229 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(25)
                    ATT_SLASH(12)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(24)
                }
            }
        }

        // Dragon dagger(p) (id: 1231)
        1231 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(40)
                    ATT_SLASH(25)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(40)
                }
            }
        }

        // Black dagger(p) (id: 1233)
        1233 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(5)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(7)
                }
            }
        }

        // Poisoned dagger(p) (id: 1235)
        1235 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(5)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(7)
                }
            }
        }

        // Bronze spear (id: 1237)
        1237 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(5)
                    ATT_CRUSH(5)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(6)
                }
            }
        }

        // Iron spear (id: 1239)
        1239 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(8)
                    ATT_CRUSH(8)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(10)
                }
            }
        }

        // Steel spear (id: 1241)
        1241 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(12)
                    ATT_SLASH(12)
                    ATT_CRUSH(12)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(12)
                }
            }
        }

        // Mithril spear (id: 1243)
        1243 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(17)
                    ATT_SLASH(17)
                    ATT_CRUSH(17)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(18)
                }
            }
        }

        // Adamant spear (id: 1245)
        1245 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(24)
                    ATT_SLASH(24)
                    ATT_CRUSH(24)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(28)
                }
            }
        }

        // Rune spear (id: 1247)
        1247 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(36)
                    ATT_SLASH(36)
                    ATT_CRUSH(36)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(42)
                }
            }
        }

        // Dragon spear (id: 1249)
        1249 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(55)
                    ATT_SLASH(55)
                    ATT_CRUSH(55)
                    DEF_STAB(5)
                    DEF_SLASH(5)
                    DEF_CRUSH(5)
                    DEF_MAGIC(5)
                    DEF_RANGE(5)
                    Bonuses.Bonus.STRENGTH(60)
                }
            }
        }

        // Bronze spear(p) (id: 1251)
        1251 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(5)
                    ATT_CRUSH(5)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(6)
                }
            }
        }

        // Iron spear(p) (id: 1253)
        1253 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(8)
                    ATT_CRUSH(8)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(10)
                }
            }
        }

        // Steel spear(p) (id: 1255)
        1255 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(12)
                    ATT_SLASH(12)
                    ATT_CRUSH(12)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(12)
                }
            }
        }

        // Mithril spear(p) (id: 1257)
        1257 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(17)
                    ATT_SLASH(17)
                    ATT_CRUSH(17)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(18)
                }
            }
        }

        // Adamant spear(p) (id: 1259)
        1259 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(24)
                    ATT_SLASH(24)
                    ATT_CRUSH(24)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(28)
                }
            }
        }

        // Rune spear(p) (id: 1261)
        1261 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(36)
                    ATT_SLASH(36)
                    ATT_CRUSH(36)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(42)
                }
            }
        }

        // Dragon spear(p) (id: 1263)
        1263 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(55)
                    ATT_SLASH(55)
                    ATT_CRUSH(55)
                    DEF_STAB(5)
                    DEF_SLASH(5)
                    DEF_CRUSH(5)
                    DEF_MAGIC(5)
                    DEF_RANGE(5)
                    Bonuses.Bonus.STRENGTH(60)
                }
            }
        }

        // Bronze pickaxe (id: 1265)
        1265 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(-2)
                    ATT_CRUSH(2)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Iron pickaxe (id: 1267)
        1267 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(-2)
                    ATT_CRUSH(3)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(7)
                }
            }
        }

        // Steel pickaxe (id: 1269)
        1269 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(-2)
                    ATT_CRUSH(6)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(9)
                }
            }
        }

        // Adamant pickaxe (id: 1271)
        1271 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(17)
                    ATT_SLASH(-2)
                    ATT_CRUSH(15)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(19)
                }
            }
        }

        // Mithril pickaxe (id: 1273)
        1273 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(12)
                    ATT_SLASH(-2)
                    ATT_CRUSH(10)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(13)
                }
            }
        }

        // Rune pickaxe (id: 1275)
        1275 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(26)
                    ATT_SLASH(-2)
                    ATT_CRUSH(24)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(29)
                }
            }
        }

        // Bronze sword (id: 1277)
        1277 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(3)
                    ATT_CRUSH(-2)
                    DEF_SLASH(2)
                    DEF_CRUSH(1)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Iron sword (id: 1279)
        1279 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(6)
                    ATT_SLASH(4)
                    ATT_CRUSH(-2)
                    DEF_SLASH(2)
                    DEF_CRUSH(1)
                    Bonuses.Bonus.STRENGTH(7)
                }
            }
        }

        // Steel sword (id: 1281)
        1281 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(11)
                    ATT_SLASH(8)
                    ATT_CRUSH(-2)
                    DEF_SLASH(2)
                    DEF_CRUSH(1)
                    Bonuses.Bonus.STRENGTH(12)
                }
            }
        }

        // Black sword (id: 1283)
        1283 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(14)
                    ATT_SLASH(10)
                    ATT_CRUSH(-2)
                    DEF_SLASH(2)
                    DEF_CRUSH(1)
                    Bonuses.Bonus.STRENGTH(12)
                }
            }
        }

        // Mithril sword (id: 1285)
        1285 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(16)
                    ATT_SLASH(11)
                    ATT_CRUSH(-2)
                    DEF_SLASH(2)
                    DEF_CRUSH(1)
                    Bonuses.Bonus.STRENGTH(17)
                }
            }
        }

        // Adamant sword (id: 1287)
        1287 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(23)
                    ATT_SLASH(18)
                    ATT_CRUSH(-2)
                    DEF_SLASH(2)
                    DEF_CRUSH(1)
                    Bonuses.Bonus.STRENGTH(24)
                }
            }
        }

        // Rune sword (id: 1289)
        1289 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(38)
                    ATT_SLASH(26)
                    ATT_CRUSH(-2)
                    DEF_SLASH(2)
                    DEF_CRUSH(1)
                    Bonuses.Bonus.STRENGTH(39)
                }
            }
        }

        // Bronze longsword (id: 1291)
        1291 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(5)
                    ATT_CRUSH(-2)
                    DEF_SLASH(3)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(7)
                }
            }
        }

        // Iron longsword (id: 1293)
        1293 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(6)
                    ATT_SLASH(8)
                    ATT_CRUSH(-2)
                    DEF_SLASH(3)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(10)
                }
            }
        }

        // Steel longsword (id: 1295)
        1295 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(9)
                    ATT_SLASH(14)
                    ATT_CRUSH(-2)
                    DEF_SLASH(3)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(16)
                }
            }
        }

        // Black longsword (id: 1297)
        1297 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(13)
                    ATT_SLASH(18)
                    ATT_CRUSH(-2)
                    DEF_SLASH(3)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(16)
                }
            }
        }

        // Mithril longsword (id: 1299)
        1299 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(15)
                    ATT_SLASH(20)
                    ATT_CRUSH(-2)
                    DEF_SLASH(3)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(22)
                }
            }
        }

        // Adamant longsword (id: 1301)
        1301 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(20)
                    ATT_SLASH(29)
                    ATT_CRUSH(-2)
                    DEF_SLASH(3)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(31)
                }
            }
        }

        // Rune longsword (id: 1303)
        1303 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(38)
                    ATT_SLASH(47)
                    ATT_CRUSH(-2)
                    DEF_SLASH(3)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(49)
                }
            }
        }

        // Dragon longsword (id: 1305)
        1305 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(58)
                    ATT_SLASH(69)
                    ATT_CRUSH(-2)
                    DEF_SLASH(3)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(71)
                }
            }
        }

        // Bronze 2h sword (id: 1307)
        1307 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(9)
                    ATT_CRUSH(8)
                    ATT_MAGIC(-4)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(10)
                }
            }
        }

        // Iron 2h sword (id: 1309)
        1309 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(13)
                    ATT_CRUSH(10)
                    ATT_MAGIC(-4)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(14)
                }
            }
        }

        // Steel 2h sword (id: 1311)
        1311 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(21)
                    ATT_CRUSH(16)
                    ATT_MAGIC(-4)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(22)
                }
            }
        }

        // Black 2h sword (id: 1313)
        1313 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(27)
                    ATT_CRUSH(21)
                    ATT_MAGIC(-4)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(26)
                }
            }
        }

        // Mithril 2h sword (id: 1315)
        1315 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(30)
                    ATT_CRUSH(24)
                    ATT_MAGIC(-4)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(31)
                }
            }
        }

        // Adamant 2h sword (id: 1317)
        1317 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(43)
                    ATT_CRUSH(30)
                    ATT_MAGIC(-4)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(44)
                }
            }
        }

        // Rune 2h sword (id: 1319)
        1319 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(69)
                    ATT_CRUSH(50)
                    ATT_MAGIC(-4)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(70)
                }
            }
        }

        // Bronze scimitar (id: 1321)
        1321 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(1)
                    ATT_SLASH(7)
                    ATT_CRUSH(-2)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(6)
                }
            }
        }

        // Iron scimitar (id: 1323)
        1323 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(2)
                    ATT_SLASH(10)
                    ATT_CRUSH(-2)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(9)
                }
            }
        }

        // Steel scimitar (id: 1325)
        1325 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(3)
                    ATT_SLASH(15)
                    ATT_CRUSH(-2)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(14)
                }
            }
        }

        // Black scimitar (id: 1327)
        1327 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(19)
                    ATT_CRUSH(-2)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(14)
                }
            }
        }

        // Mithril scimitar (id: 1329)
        1329 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(21)
                    ATT_CRUSH(-2)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(20)
                }
            }
        }

        // Adamant scimitar (id: 1331)
        1331 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(6)
                    ATT_SLASH(29)
                    ATT_CRUSH(-2)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(28)
                }
            }
        }

        // Rune scimitar (id: 1333)
        1333 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(45)
                    ATT_CRUSH(-2)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(44)
                }
            }
        }

        // Iron warhammer (id: 1335)
        1335 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(11)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(11)
                }
            }
        }

        // Bronze warhammer (id: 1337)
        1337 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(10)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(8)
                }
            }
        }

        // Steel warhammer (id: 1339)
        1339 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(18)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(18)
                }
            }
        }

        // Black warhammer (id: 1341)
        1341 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(22)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(22)
                }
            }
        }

        // Mithril warhammer (id: 1343)
        1343 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(25)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(27)
                }
            }
        }

        // Adamant warhammer (id: 1345)
        1345 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(35)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(39)
                }
            }
        }

        // Rune warhammer (id: 1347)
        1347 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(53)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(62)
                }
            }
        }

        // Iron axe (id: 1349)
        1349 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(5)
                    ATT_CRUSH(3)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(7)
                }
            }
        }

        // Bronze axe (id: 1351)
        1351 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(4)
                    ATT_CRUSH(2)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Steel axe (id: 1353)
        1353 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(8)
                    ATT_CRUSH(6)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(9)
                }
            }
        }

        // Mithril axe (id: 1355)
        1355 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(12)
                    ATT_CRUSH(10)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(13)
                }
            }
        }

        // Adamant axe (id: 1357)
        1357 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(17)
                    ATT_CRUSH(15)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(19)
                }
            }
        }

        // Rune axe (id: 1359)
        1359 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(26)
                    ATT_CRUSH(24)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(29)
                }
            }
        }

        // Black axe (id: 1361)
        1361 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(10)
                    ATT_CRUSH(8)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(12)
                }
            }
        }

        // Iron battleaxe (id: 1363)
        1363 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(8)
                    ATT_CRUSH(5)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(13)
                }
            }
        }

        // Steel battleaxe (id: 1365)
        1365 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(16)
                    ATT_CRUSH(11)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(20)
                }
            }
        }

        // Black battleaxe (id: 1367)
        1367 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(20)
                    ATT_CRUSH(15)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(24)
                }
            }
        }

        // Mithril battleaxe (id: 1369)
        1369 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(22)
                    ATT_CRUSH(17)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(29)
                }
            }
        }

        // Adamant battleaxe (id: 1371)
        1371 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(31)
                    ATT_CRUSH(26)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(41)
                }
            }
        }

        // Rune battleaxe (id: 1373)
        1373 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(48)
                    ATT_CRUSH(43)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(64)
                }
            }
        }

        // Bronze battleaxe (id: 1375)
        1375 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(6)
                    ATT_CRUSH(3)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(9)
                }
            }
        }

        // Dragon battleaxe (id: 1377)
        1377 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(70)
                    ATT_CRUSH(65)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(85)
                }
            }
        }

        // Staff (id: 1379)
        1379 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_SLASH(-1)
                    ATT_CRUSH(7)
                    ATT_MAGIC(4)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(4)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Staff of air (id: 1381)
        1381 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_SLASH(-1)
                    ATT_CRUSH(7)
                    ATT_MAGIC(10)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(10)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Staff of water (id: 1383)
        1383 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_SLASH(-1)
                    ATT_CRUSH(7)
                    ATT_MAGIC(10)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(10)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Staff of earth (id: 1385)
        1385 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(1)
                    ATT_SLASH(-1)
                    ATT_CRUSH(9)
                    ATT_MAGIC(10)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(10)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Staff of fire (id: 1387)
        1387 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(3)
                    ATT_SLASH(-1)
                    ATT_CRUSH(9)
                    ATT_MAGIC(10)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(10)
                    Bonuses.Bonus.STRENGTH(6)
                }
            }
        }

        // Magic staff (id: 1389)
        1389 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(2)
                    ATT_SLASH(-1)
                    ATT_CRUSH(10)
                    ATT_MAGIC(10)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(10)
                    Bonuses.Bonus.STRENGTH(7)
                }
            }
        }

        // Battlestaff (id: 1391)
        1391 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(-1)
                    ATT_CRUSH(25)
                    ATT_MAGIC(12)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(12)
                    Bonuses.Bonus.STRENGTH(32)
                }
            }
        }

        // Fire battlestaff (id: 1393)
        1393 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(-1)
                    ATT_CRUSH(28)
                    ATT_MAGIC(12)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(12)
                    Bonuses.Bonus.STRENGTH(35)
                }
            }
        }

        // Water battlestaff (id: 1395)
        1395 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(-1)
                    ATT_CRUSH(28)
                    ATT_MAGIC(12)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(12)
                    Bonuses.Bonus.STRENGTH(35)
                }
            }
        }

        // Air battlestaff (id: 1397)
        1397 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(-1)
                    ATT_CRUSH(28)
                    ATT_MAGIC(12)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(12)
                    Bonuses.Bonus.STRENGTH(35)
                }
            }
        }

        // Earth battlestaff (id: 1399)
        1399 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(-1)
                    ATT_CRUSH(28)
                    ATT_MAGIC(12)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(12)
                    Bonuses.Bonus.STRENGTH(35)
                }
            }
        }

        // Mystic fire staff (id: 1401)
        1401 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(-1)
                    ATT_CRUSH(40)
                    ATT_MAGIC(14)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(14)
                    Bonuses.Bonus.STRENGTH(50)
                }
            }
        }

        // Mystic water staff (id: 1403)
        1403 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(-1)
                    ATT_CRUSH(40)
                    ATT_MAGIC(14)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(14)
                    Bonuses.Bonus.STRENGTH(50)
                }
            }
        }

        // Mystic air staff (id: 1405)
        1405 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(-1)
                    ATT_CRUSH(40)
                    ATT_MAGIC(14)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(14)
                    Bonuses.Bonus.STRENGTH(50)
                }
            }
        }

        // Mystic earth staff (id: 1407)
        1407 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(-1)
                    ATT_CRUSH(40)
                    ATT_MAGIC(14)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(14)
                    Bonuses.Bonus.STRENGTH(50)
                }
            }
        }

        // Iban's staff (id: 1409)
        1409 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(-1)
                    ATT_CRUSH(40)
                    ATT_MAGIC(10)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(10)
                    Bonuses.Bonus.STRENGTH(50)
                }
            }
        }

        // Farmer's fork (id: 1411)
        1411 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(3)
                    DEF_SLASH(4)
                    DEF_CRUSH(4)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Scythe (id: 1419)
        1419 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(3)
                    ATT_SLASH(8)
                    ATT_CRUSH(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    Bonuses.Bonus.STRENGTH(10)
                }
            }
        }

        // Iron mace (id: 1420)
        1420 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(-2)
                    ATT_CRUSH(9)
                    Bonuses.Bonus.STRENGTH(7)
                    PRAYER(1)
                }
            }
        }

        // Bronze mace (id: 1422)
        1422 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(1)
                    ATT_SLASH(-2)
                    ATT_CRUSH(6)
                    Bonuses.Bonus.STRENGTH(5)
                    PRAYER(1)
                }
            }
        }

        // Steel mace (id: 1424)
        1424 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(-2)
                    ATT_CRUSH(13)
                    Bonuses.Bonus.STRENGTH(11)
                    PRAYER(2)
                }
            }
        }

        // Black mace (id: 1426)
        1426 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(-2)
                    ATT_CRUSH(16)
                    Bonuses.Bonus.STRENGTH(13)
                    PRAYER(2)
                }
            }
        }

        // Mithril mace (id: 1428)
        1428 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(11)
                    ATT_SLASH(-2)
                    ATT_CRUSH(18)
                    Bonuses.Bonus.STRENGTH(16)
                    PRAYER(3)
                }
            }
        }

        // Adamant mace (id: 1430)
        1430 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(13)
                    ATT_SLASH(-2)
                    ATT_CRUSH(25)
                    Bonuses.Bonus.STRENGTH(23)
                    PRAYER(3)
                }
            }
        }

        // Rune mace (id: 1432)
        1432 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(20)
                    ATT_SLASH(-2)
                    ATT_CRUSH(39)
                    Bonuses.Bonus.STRENGTH(36)
                    PRAYER(4)
                }
            }
        }

        // Dragon mace (id: 1434)
        1434 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(40)
                    ATT_SLASH(-2)
                    ATT_CRUSH(60)
                    Bonuses.Bonus.STRENGTH(55)
                    PRAYER(5)
                }
            }
        }

        // Amulet of accuracy (id: 1478)
        1478 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(4)
                    ATT_RANGED(4)
                }
            }
        }

        // Klank's gauntlets (id: 1495)
        1495 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(2)
                    ATT_SLASH(2)
                    ATT_CRUSH(2)
                    DEF_STAB(8)
                    DEF_SLASH(9)
                    DEF_CRUSH(7)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Anti-dragon shield (id: 1540)
        1540 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    DEF_STAB(7)
                    DEF_SLASH(9)
                    DEF_CRUSH(8)
                    DEF_MAGIC(2)
                    DEF_RANGE(8)
                }
            }
        }

        // Cat training medal (id: 1575)
        1575 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Ice gloves (id: 1580)
        1580 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_SLASH(3)
                    DEF_CRUSH(4)
                    DEF_RANGE(2)
                }
            }
        }

        // Gold ring (id: 1635)
        1635 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Sapphire ring (id: 1637)
        1637 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Emerald ring (id: 1639)
        1639 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ruby ring (id: 1641)
        1641 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Diamond ring (id: 1643)
        1643 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Dragonstone ring (id: 1645)
        1645 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Gold necklace (id: 1654)
        1654 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Sapphire necklace (id: 1656)
        1656 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Emerald necklace (id: 1658)
        1658 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Ruby necklace (id: 1660)
        1660 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Diamond necklace (id: 1662)
        1662 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Dragon necklace (id: 1664)
        1664 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Gold amulet (id: 1692)
        1692 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Sapphire amulet (id: 1694)
        1694 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Emerald amulet (id: 1696)
        1696 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Ruby amulet (id: 1698)
        1698 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Diamond amulet (id: 1700)
        1700 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Dragonstone amulet (id: 1702)
        1702 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Amulet of glory (id: 1704)
        1704 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(10)
                    ATT_CRUSH(10)
                    ATT_MAGIC(10)
                    ATT_RANGED(10)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(3)
                    DEF_RANGE(3)
                    Bonuses.Bonus.STRENGTH(6)
                    PRAYER(3)
                }
            }
        }

        // Amulet of glory(1) (id: 1706)
        1706 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(10)
                    ATT_CRUSH(10)
                    ATT_MAGIC(10)
                    ATT_RANGED(10)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(3)
                    DEF_RANGE(3)
                    Bonuses.Bonus.STRENGTH(6)
                    PRAYER(3)
                }
            }
        }

        // Amulet of glory(2) (id: 1708)
        1708 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(10)
                    ATT_CRUSH(10)
                    ATT_MAGIC(10)
                    ATT_RANGED(10)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(3)
                    DEF_RANGE(3)
                    Bonuses.Bonus.STRENGTH(6)
                    PRAYER(3)
                }
            }
        }

        // Amulet of glory(3) (id: 1710)
        1710 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(10)
                    ATT_CRUSH(10)
                    ATT_MAGIC(10)
                    ATT_RANGED(10)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(3)
                    DEF_RANGE(3)
                    Bonuses.Bonus.STRENGTH(6)
                    PRAYER(3)
                }
            }
        }

        // Amulet of glory(4) (id: 1712)
        1712 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(10)
                    ATT_CRUSH(10)
                    ATT_MAGIC(10)
                    ATT_RANGED(10)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(3)
                    DEF_RANGE(3)
                    Bonuses.Bonus.STRENGTH(6)
                    PRAYER(3)
                }
            }
        }

        // Unblessed symbol (id: 1716)
        1716 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Holy symbol (id: 1718)
        1718 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    DEF_STAB(2)
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                    DEF_MAGIC(2)
                    DEF_RANGE(2)
                    PRAYER(8)
                }
            }
        }

        // Unpowered symbol (id: 1722)
        1722 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Unholy symbol (id: 1724)
        1724 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(2)
                    ATT_SLASH(2)
                    ATT_CRUSH(2)
                    ATT_MAGIC(2)
                    ATT_RANGED(2)
                    PRAYER(8)
                }
            }
        }

        // Amulet of strength (id: 1725)
        1725 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    Bonuses.Bonus.STRENGTH(10)
                }
            }
        }

        // Amulet of magic (id: 1727)
        1727 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_MAGIC(10)
                }
            }
        }

        // Amulet of defence (id: 1729)
        1729 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    DEF_STAB(7)
                    DEF_SLASH(7)
                    DEF_CRUSH(7)
                    DEF_MAGIC(7)
                    DEF_RANGE(7)
                }
            }
        }

        // Amulet of power (id: 1731)
        1731 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(6)
                    ATT_SLASH(6)
                    ATT_CRUSH(6)
                    ATT_MAGIC(6)
                    ATT_RANGED(6)
                    DEF_STAB(6)
                    DEF_SLASH(6)
                    DEF_CRUSH(6)
                    DEF_MAGIC(6)
                    DEF_RANGE(6)
                    Bonuses.Bonus.STRENGTH(6)
                    PRAYER(1)
                }
            }
        }

        // Brown apron (id: 1757)
        1757 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Silver necklace (id: 1796)
        1796 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Silver necklace (id: 1797)
        1797 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Desert shirt (id: 1833)
        1833 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Desert robe (id: 1835)
        1835 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Desert boots (id: 1837)
        1837 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Slave shirt (id: 1844)
        1844 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Slave robe (id: 1845)
        1845 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Slave boots (id: 1846)
        1846 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Beer (id: 1917)
        1917 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Banana (id: 1963)
        1963 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Chocolate bar (id: 1973)
        1973 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Magic ogre potion (id: 2395)
        2395 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Silverlight (id: 2402)
        2402 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(9)
                    ATT_SLASH(14)
                    ATT_CRUSH(-2)
                    DEF_SLASH(3)
                    DEF_CRUSH(2)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(12)
                }
            }
        }

        // Carnillean armour (id: 2405)
        2405 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_STAB(20)
                    DEF_SLASH(14)
                    DEF_CRUSH(8)
                }
            }
        }

        // Hazeel's mark (id: 2406)
        2406 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Saradomin cape (id: 2412)
        2412 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_MAGIC(10)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                    DEF_MAGIC(10)
                }
            }
        }

        // Guthix cape (id: 2413)
        2413 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_MAGIC(10)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                    DEF_MAGIC(10)
                }
            }
        }

        // Zamorak cape (id: 2414)
        2414 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_MAGIC(10)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                    DEF_MAGIC(10)
                }
            }
        }

        // Saradomin staff (id: 2415)
        2415 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(-1)
                    ATT_SLASH(-1)
                    ATT_CRUSH(6)
                    ATT_MAGIC(6)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(6)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Guthix staff (id: 2416)
        2416 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(-1)
                    ATT_SLASH(-1)
                    ATT_CRUSH(6)
                    ATT_MAGIC(6)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(6)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Zamorak staff (id: 2417)
        2417 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(-1)
                    ATT_SLASH(-1)
                    ATT_CRUSH(6)
                    ATT_MAGIC(6)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(6)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Assorted flowers (id: 2460)
        2460 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-50)
                    Bonuses.Bonus.STRENGTH(-10)
                }
            }
        }

        // Red flowers (id: 2462)
        2462 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-50)
                    Bonuses.Bonus.STRENGTH(-10)
                }
            }
        }

        // Blue flowers (id: 2464)
        2464 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-50)
                    Bonuses.Bonus.STRENGTH(-10)
                }
            }
        }

        // Yellow flowers (id: 2466)
        2466 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-50)
                    Bonuses.Bonus.STRENGTH(-10)
                }
            }
        }

        // Purple flowers (id: 2468)
        2468 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-50)
                    Bonuses.Bonus.STRENGTH(-10)
                }
            }
        }

        // Orange flowers (id: 2470)
        2470 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-50)
                    Bonuses.Bonus.STRENGTH(-10)
                }
            }
        }

        // Mixed flowers (id: 2472)
        2472 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-50)
                    Bonuses.Bonus.STRENGTH(-10)
                }
            }
        }

        // White flowers (id: 2474)
        2474 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-50)
                    Bonuses.Bonus.STRENGTH(-10)
                }
            }
        }

        // Black flowers (id: 2476)
        2476 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-50)
                    Bonuses.Bonus.STRENGTH(-10)
                }
            }
        }

        // Blue d'hide vambraces (id: 2487)
        2487 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(9)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(4)
                }
            }
        }

        // Red d'hide vambraces (id: 2489)
        2489 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(10)
                    DEF_STAB(3)
                    DEF_SLASH(4)
                    DEF_CRUSH(4)
                    DEF_MAGIC(6)
                }
            }
        }

        // Black d'hide vambraces (id: 2491)
        2491 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(11)
                    DEF_STAB(4)
                    DEF_SLASH(5)
                    DEF_CRUSH(5)
                    DEF_MAGIC(8)
                }
            }
        }

        // Blue d'hide chaps (id: 2493)
        2493 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(11)
                    DEF_STAB(13)
                    DEF_SLASH(16)
                    DEF_CRUSH(20)
                    DEF_MAGIC(14)
                    DEF_RANGE(20)
                }
            }
        }

        // Red d'hide chaps (id: 2495)
        2495 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(14)
                    DEF_STAB(15)
                    DEF_SLASH(18)
                    DEF_CRUSH(22)
                    DEF_MAGIC(18)
                    DEF_RANGE(20)
                }
            }
        }

        // Black d'hide chaps (id: 2497)
        2497 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(17)
                    DEF_STAB(18)
                    DEF_SLASH(20)
                    DEF_CRUSH(26)
                    DEF_MAGIC(23)
                    DEF_RANGE(26)
                }
            }
        }

        // Blue d'hide body (id: 2499)
        2499 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(20)
                    DEF_STAB(23)
                    DEF_SLASH(30)
                    DEF_CRUSH(30)
                    DEF_MAGIC(28)
                    DEF_RANGE(40)
                }
            }
        }

        // Red d'hide body (id: 2501)
        2501 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(25)
                    DEF_STAB(26)
                    DEF_SLASH(34)
                    DEF_CRUSH(36)
                    DEF_MAGIC(36)
                    DEF_RANGE(45)
                }
            }
        }

        // Black d'hide body (id: 2503)
        2503 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(30)
                    DEF_STAB(30)
                    DEF_SLASH(38)
                    DEF_CRUSH(45)
                    DEF_MAGIC(45)
                    DEF_RANGE(50)
                }
            }
        }

        // Iron fire arrow (id: 2532)
        2532 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(10)
                }
            }
        }

        // Iron fire arrow (lit) (id: 2533)
        2533 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(10)
                }
            }
        }

        // Steel fire arrow (id: 2534)
        2534 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(16)
                }
            }
        }

        // Steel fire arrow (lit) (id: 2535)
        2535 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(16)
                }
            }
        }

        // Mithril fire arrow (id: 2536)
        2536 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(22)
                }
            }
        }

        // Mithril fire arrow (lit) (id: 2537)
        2537 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(22)
                }
            }
        }

        // Adamant fire arrow (id: 2538)
        2538 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(31)
                }
            }
        }

        // Adamant fire arrow (lit) (id: 2539)
        2539 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(31)
                }
            }
        }

        // Rune fire arrow (id: 2540)
        2540 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(49)
                }
            }
        }

        // Rune fire arrow (lit) (id: 2541)
        2541 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(49)
                }
            }
        }

        // Ring of recoil (id: 2550)
        2550 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of dueling(8) (id: 2552)
        2552 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of dueling(7) (id: 2554)
        2554 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of dueling(6) (id: 2556)
        2556 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of dueling(5) (id: 2558)
        2558 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of dueling(4) (id: 2560)
        2560 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of dueling(3) (id: 2562)
        2562 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of dueling(2) (id: 2564)
        2564 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of dueling(1) (id: 2566)
        2566 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of forging (id: 2568)
        2568 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of life (id: 2570)
        2570 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of wealth (id: 2572)
        2572 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ranger boots (id: 2577)
        2577 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(8)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(4)
                    DEF_MAGIC(2)
                }
            }
        }

        // Wizard boots (id: 2579)
        2579 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                }
            }
        }

        // Robin hood hat (id: 2581)
        2581 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(8)
                    DEF_STAB(4)
                    DEF_SLASH(6)
                    DEF_CRUSH(8)
                    DEF_MAGIC(4)
                    DEF_RANGE(4)
                }
            }
        }

        // Black platebody (t) (id: 2583)
        2583 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(41)
                    DEF_SLASH(40)
                    DEF_CRUSH(30)
                    DEF_MAGIC(-6)
                    DEF_RANGE(40)
                }
            }
        }

        // Black platelegs (t) (id: 2585)
        2585 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(21)
                    DEF_SLASH(20)
                    DEF_CRUSH(19)
                    DEF_MAGIC(-4)
                    DEF_RANGE(20)
                }
            }
        }

        // Black full helm (t) (id: 2587)
        2587 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(12)
                    DEF_SLASH(13)
                    DEF_CRUSH(10)
                    DEF_MAGIC(-1)
                    DEF_RANGE(12)
                }
            }
        }

        // Black kiteshield (t) (id: 2589)
        2589 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(17)
                    DEF_SLASH(19)
                    DEF_CRUSH(18)
                    DEF_MAGIC(-1)
                    DEF_RANGE(18)
                }
            }
        }

        // Black platebody (g) (id: 2591)
        2591 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(41)
                    DEF_SLASH(40)
                    DEF_CRUSH(30)
                    DEF_MAGIC(-6)
                    DEF_RANGE(40)
                }
            }
        }

        // Black platelegs (g) (id: 2593)
        2593 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(21)
                    DEF_SLASH(20)
                    DEF_CRUSH(19)
                    DEF_MAGIC(-4)
                    DEF_RANGE(20)
                }
            }
        }

        // Black full helm (g) (id: 2595)
        2595 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(12)
                    DEF_SLASH(13)
                    DEF_CRUSH(10)
                    DEF_MAGIC(-1)
                    DEF_RANGE(12)
                }
            }
        }

        // Black kiteshield (g) (id: 2597)
        2597 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(17)
                    DEF_SLASH(19)
                    DEF_CRUSH(18)
                    DEF_MAGIC(-1)
                    DEF_RANGE(18)
                }
            }
        }

        // Adamant platebody (t) (id: 2599)
        2599 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(65)
                    DEF_SLASH(63)
                    DEF_CRUSH(55)
                    DEF_MAGIC(-6)
                    DEF_RANGE(63)
                }
            }
        }

        // Adamant platelegs (t) (id: 2601)
        2601 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(33)
                    DEF_SLASH(31)
                    DEF_CRUSH(29)
                    DEF_MAGIC(-4)
                    DEF_RANGE(31)
                }
            }
        }

        // Adamant kiteshield (t) (id: 2603)
        2603 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(27)
                    DEF_SLASH(31)
                    DEF_CRUSH(29)
                    DEF_MAGIC(-1)
                    DEF_RANGE(29)
                }
            }
        }

        // Adamant full helm (t) (id: 2605)
        2605 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(19)
                    DEF_SLASH(21)
                    DEF_CRUSH(16)
                    DEF_MAGIC(-1)
                    DEF_RANGE(19)
                }
            }
        }

        // Adamant platebody (g) (id: 2607)
        2607 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(65)
                    DEF_SLASH(63)
                    DEF_CRUSH(55)
                    DEF_MAGIC(-6)
                    DEF_RANGE(63)
                }
            }
        }

        // Adamant platelegs (g) (id: 2609)
        2609 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(33)
                    DEF_SLASH(31)
                    DEF_CRUSH(29)
                    DEF_MAGIC(-4)
                    DEF_RANGE(31)
                }
            }
        }

        // Adamant kiteshield (g) (id: 2611)
        2611 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(27)
                    DEF_SLASH(31)
                    DEF_CRUSH(29)
                    DEF_MAGIC(-1)
                    DEF_RANGE(29)
                }
            }
        }

        // Adamant full helm (g) (id: 2613)
        2613 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(19)
                    DEF_SLASH(21)
                    DEF_CRUSH(16)
                    DEF_MAGIC(-1)
                    DEF_RANGE(19)
                }
            }
        }

        // Rune platebody (g) (id: 2615)
        2615 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(82)
                    DEF_SLASH(80)
                    DEF_CRUSH(72)
                    DEF_MAGIC(-6)
                    DEF_RANGE(80)
                }
            }
        }

        // Rune platelegs (g) (id: 2617)
        2617 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(51)
                    DEF_SLASH(49)
                    DEF_CRUSH(47)
                    DEF_MAGIC(-4)
                    DEF_RANGE(49)
                }
            }
        }

        // Rune full helm (g) (id: 2619)
        2619 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(30)
                    DEF_SLASH(32)
                    DEF_CRUSH(27)
                    DEF_MAGIC(-1)
                    DEF_RANGE(30)
                }
            }
        }

        // Rune kiteshield (g) (id: 2621)
        2621 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(44)
                    DEF_SLASH(48)
                    DEF_CRUSH(46)
                    DEF_MAGIC(-1)
                    DEF_RANGE(46)
                }
            }
        }

        // Rune platebody (t) (id: 2623)
        2623 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(82)
                    DEF_SLASH(80)
                    DEF_CRUSH(72)
                    DEF_MAGIC(-6)
                    DEF_RANGE(80)
                }
            }
        }

        // Rune platelegs (t) (id: 2625)
        2625 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(51)
                    DEF_SLASH(49)
                    DEF_CRUSH(47)
                    DEF_MAGIC(-4)
                    DEF_RANGE(49)
                }
            }
        }

        // Rune full helm (t) (id: 2627)
        2627 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(30)
                    DEF_SLASH(32)
                    DEF_CRUSH(27)
                    DEF_MAGIC(-1)
                    DEF_RANGE(30)
                }
            }
        }

        // Rune kiteshield (t) (id: 2629)
        2629 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(44)
                    DEF_SLASH(48)
                    DEF_CRUSH(46)
                    DEF_MAGIC(-1)
                    DEF_RANGE(46)
                }
            }
        }

        // Zamorak platebody (id: 2653)
        2653 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(82)
                    DEF_SLASH(80)
                    DEF_CRUSH(72)
                    DEF_MAGIC(-6)
                    DEF_RANGE(80)
                    PRAYER(1)
                }
            }
        }

        // Zamorak platelegs (id: 2655)
        2655 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(51)
                    DEF_SLASH(49)
                    DEF_CRUSH(47)
                    DEF_MAGIC(-4)
                    DEF_RANGE(49)
                    PRAYER(1)
                }
            }
        }

        // Zamorak full helm (id: 2657)
        2657 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(30)
                    DEF_SLASH(32)
                    DEF_CRUSH(27)
                    DEF_MAGIC(-1)
                    DEF_RANGE(30)
                    PRAYER(1)
                }
            }
        }

        // Zamorak kiteshield (id: 2659)
        2659 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(44)
                    DEF_SLASH(48)
                    DEF_CRUSH(46)
                    DEF_MAGIC(-1)
                    DEF_RANGE(46)
                    PRAYER(1)
                }
            }
        }

        // Saradomin platebody (id: 2661)
        2661 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(82)
                    DEF_SLASH(80)
                    DEF_CRUSH(72)
                    DEF_MAGIC(-6)
                    DEF_RANGE(80)
                    PRAYER(1)
                }
            }
        }

        // Saradomin platelegs (id: 2663)
        2663 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(51)
                    DEF_SLASH(49)
                    DEF_CRUSH(47)
                    DEF_MAGIC(-4)
                    DEF_RANGE(49)
                    PRAYER(1)
                }
            }
        }

        // Saradomin full helm (id: 2665)
        2665 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(30)
                    DEF_SLASH(32)
                    DEF_CRUSH(27)
                    DEF_MAGIC(-1)
                    DEF_RANGE(30)
                    PRAYER(1)
                }
            }
        }

        // Saradomin kiteshield (id: 2667)
        2667 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(44)
                    DEF_SLASH(48)
                    DEF_CRUSH(46)
                    DEF_MAGIC(-1)
                    DEF_RANGE(46)
                    PRAYER(1)
                }
            }
        }

        // Guthix platebody (id: 2669)
        2669 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(82)
                    DEF_SLASH(80)
                    DEF_CRUSH(72)
                    DEF_MAGIC(-6)
                    DEF_RANGE(80)
                    PRAYER(1)
                }
            }
        }

        // Guthix platelegs (id: 2671)
        2671 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(51)
                    DEF_SLASH(49)
                    DEF_CRUSH(47)
                    DEF_MAGIC(-4)
                    DEF_RANGE(49)
                    PRAYER(1)
                }
            }
        }

        // Guthix full helm (id: 2673)
        2673 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(30)
                    DEF_SLASH(32)
                    DEF_CRUSH(27)
                    DEF_MAGIC(-1)
                    DEF_RANGE(30)
                    PRAYER(1)
                }
            }
        }

        // Guthix kiteshield (id: 2675)
        2675 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(44)
                    DEF_SLASH(48)
                    DEF_CRUSH(46)
                    DEF_MAGIC(-1)
                    DEF_RANGE(46)
                    PRAYER(1)
                }
            }
        }

        // Ogre arrow (id: 2866)
        2866 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(22)
                }
            }
        }

        // Ogre bow (id: 2883)
        2883 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 8
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(38)
                }
            }
        }

        // A stone bowl (id: 2888)
        2888 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // A stone bowl (id: 2889)
        2889 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Elemental shield (id: 2890)
        2890 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    DEF_MAGIC(6)
                }
            }
        }

        // Grey boots (id: 2894)
        2894 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Grey robe top (id: 2896)
        2896 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Grey robe bottoms (id: 2898)
        2898 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Grey hat (id: 2900)
        2900 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Grey gloves (id: 2902)
        2902 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                }
            }
        }

        // Red boots (id: 2904)
        2904 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Red robe top (id: 2906)
        2906 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Red robe bottoms (id: 2908)
        2908 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Red hat (id: 2910)
        2910 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Red gloves (id: 2912)
        2912 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                }
            }
        }

        // Yellow boots (id: 2914)
        2914 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Yellow robe top (id: 2916)
        2916 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Yellow robe bottoms (id: 2918)
        2918 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Yellow hat (id: 2920)
        2920 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Yellow gloves (id: 2922)
        2922 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                }
            }
        }

        // Teal boots (id: 2924)
        2924 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Teal robe top (id: 2926)
        2926 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Teal robe bottoms (id: 2928)
        2928 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Teal hat (id: 2930)
        2930 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Teal gloves (id: 2932)
        2932 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                }
            }
        }

        // Purple boots (id: 2934)
        2934 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Purple robe top (id: 2936)
        2936 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Purple robe bottoms (id: 2938)
        2938 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Purple hat (id: 2940)
        2940 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Purple gloves (id: 2942)
        2942 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                }
            }
        }

        // Wolfbane (id: 2952)
        2952 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(11)
                    ATT_SLASH(5)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(10)
                    PRAYER(5)
                }
            }
        }

        // Silver sickle (id: 2961)
        2961 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_MAGIC(1)
                    DEF_RANGE(1)
                    Bonuses.Bonus.STRENGTH(1)
                }
            }
        }

        // Silver sickle (b) (id: 2963)
        2963 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_MAGIC(1)
                    DEF_RANGE(1)
                    Bonuses.Bonus.STRENGTH(1)
                    PRAYER(5)
                }
            }
        }

        // Pirate's hook (id: 2997)
        2997 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_STAB(1)
                    DEF_SLASH(5)
                    DEF_CRUSH(3)
                }
            }
        }

        // Lava battlestaff (id: 3053)
        3053 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(-1)
                    ATT_CRUSH(28)
                    ATT_MAGIC(12)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(12)
                    Bonuses.Bonus.STRENGTH(35)
                }
            }
        }

        // Mystic lava staff (id: 3054)
        3054 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(-1)
                    ATT_CRUSH(40)
                    ATT_MAGIC(14)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(14)
                    Bonuses.Bonus.STRENGTH(50)
                }
            }
        }

        // Mime top (id: 3058)
        3058 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Mime legs (id: 3059)
        3059 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Mime gloves (id: 3060)
        3060 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Mime boots (id: 3061)
        3061 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Black dart (id: 3093)
        3093 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 3
                    longAttackDistance = 5
                }
                bonuses {
                    RANGE_STRENGTH(6)
                }
            }
        }

        // Black dart(p) (id: 3094)
        3094 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 3
                    longAttackDistance = 5
                }
                bonuses {
                    RANGE_STRENGTH(6)
                }
            }
        }

        // Bronze claws (id: 3095)
        3095 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(3)
                    ATT_SLASH(4)
                    ATT_CRUSH(-4)
                    DEF_STAB(1)
                    DEF_SLASH(2)
                    DEF_CRUSH(1)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Iron claws (id: 3096)
        3096 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(6)
                    ATT_CRUSH(-4)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    Bonuses.Bonus.STRENGTH(7)
                }
            }
        }

        // Steel claws (id: 3097)
        3097 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(11)
                    ATT_CRUSH(-4)
                    DEF_STAB(3)
                    DEF_SLASH(6)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(12)
                }
            }
        }

        // Black claws (id: 3098)
        3098 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(14)
                    ATT_CRUSH(-4)
                    DEF_STAB(4)
                    DEF_SLASH(7)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(14)
                }
            }
        }

        // Mithril claws (id: 3099)
        3099 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(11)
                    ATT_SLASH(16)
                    ATT_CRUSH(-4)
                    DEF_STAB(4)
                    DEF_SLASH(8)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(17)
                }
            }
        }

        // Adamant claws (id: 3100)
        3100 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(18)
                    ATT_SLASH(23)
                    ATT_CRUSH(-4)
                    DEF_STAB(6)
                    DEF_SLASH(12)
                    DEF_CRUSH(3)
                    Bonuses.Bonus.STRENGTH(24)
                }
            }
        }

        // Rune claws (id: 3101)
        3101 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(26)
                    ATT_SLASH(38)
                    ATT_CRUSH(-4)
                    DEF_STAB(10)
                    DEF_SLASH(19)
                    DEF_CRUSH(5)
                    Bonuses.Bonus.STRENGTH(39)
                }
            }
        }

        // Climbing boots (id: 3105)
        3105 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Spiked boots (id: 3107)
        3107 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Granite shield (id: 3122)
        3122 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-12)
                    ATT_RANGED(-8)
                    DEF_STAB(40)
                    DEF_SLASH(42)
                    DEF_CRUSH(38)
                    DEF_RANGE(65)
                }
            }
        }

        // Dragon chainbody (id: 3140)
        3140 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    DEF_STAB(81)
                    DEF_SLASH(93)
                    DEF_CRUSH(98)
                    DEF_MAGIC(-3)
                    DEF_RANGE(82)
                }
            }
        }

        // Karambwan vessel (id: 3157)
        3157 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Bronze spear(kp) (id: 3170)
        3170 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(5)
                    ATT_CRUSH(5)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(6)
                }
            }
        }

        // Iron spear(kp) (id: 3171)
        3171 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(8)
                    ATT_CRUSH(8)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(10)
                }
            }
        }

        // Steel spear(kp) (id: 3172)
        3172 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(12)
                    ATT_SLASH(12)
                    ATT_CRUSH(12)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(12)
                }
            }
        }

        // Mithril spear(kp) (id: 3173)
        3173 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(17)
                    ATT_SLASH(17)
                    ATT_CRUSH(17)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(18)
                }
            }
        }

        // Adamant spear(kp) (id: 3174)
        3174 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(24)
                    ATT_SLASH(24)
                    ATT_CRUSH(24)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(28)
                }
            }
        }

        // Rune spear(kp) (id: 3175)
        3175 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(36)
                    ATT_SLASH(36)
                    ATT_CRUSH(36)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(42)
                }
            }
        }

        // Dragon spear(kp) (id: 3176)
        3176 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(55)
                    ATT_SLASH(55)
                    ATT_CRUSH(55)
                    DEF_STAB(5)
                    DEF_SLASH(5)
                    DEF_CRUSH(5)
                    DEF_MAGIC(5)
                    DEF_RANGE(5)
                    Bonuses.Bonus.STRENGTH(60)
                }
            }
        }

        // Left-handed banana (id: 3177)
        3177 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Bronze halberd (id: 3190)
        3190 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                    normalAttackDistance = 2
                    longAttackDistance = 4
                }
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(8)
                    ATT_MAGIC(-4)
                    DEF_STAB(-1)
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(8)
                }
            }
        }

        // Iron halberd (id: 3192)
        3192 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                    normalAttackDistance = 2
                    longAttackDistance = 4
                }
                bonuses {
                    ATT_STAB(9)
                    ATT_SLASH(12)
                    ATT_MAGIC(-4)
                    DEF_STAB(-1)
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(12)
                }
            }
        }

        // Steel halberd (id: 3194)
        3194 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                    normalAttackDistance = 2
                    longAttackDistance = 4
                }
                bonuses {
                    ATT_STAB(14)
                    ATT_SLASH(19)
                    ATT_MAGIC(-4)
                    DEF_STAB(-1)
                    DEF_SLASH(2)
                    DEF_CRUSH(3)
                    Bonuses.Bonus.STRENGTH(20)
                }
            }
        }

        // Black halberd (id: 3196)
        3196 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                    normalAttackDistance = 2
                    longAttackDistance = 4
                }
                bonuses {
                    ATT_STAB(19)
                    ATT_SLASH(25)
                    ATT_MAGIC(-4)
                    DEF_STAB(-1)
                    DEF_SLASH(2)
                    DEF_CRUSH(3)
                    Bonuses.Bonus.STRENGTH(20)
                }
            }
        }

        // Mithril halberd (id: 3198)
        3198 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                    normalAttackDistance = 2
                    longAttackDistance = 4
                }
                bonuses {
                    ATT_STAB(22)
                    ATT_SLASH(28)
                    ATT_MAGIC(-4)
                    DEF_STAB(-1)
                    DEF_SLASH(2)
                    DEF_CRUSH(4)
                    Bonuses.Bonus.STRENGTH(29)
                }
            }
        }

        // Adamant halberd (id: 3200)
        3200 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                    normalAttackDistance = 2
                    longAttackDistance = 4
                }
                bonuses {
                    ATT_STAB(28)
                    ATT_SLASH(41)
                    ATT_MAGIC(-4)
                    DEF_STAB(-1)
                    DEF_SLASH(3)
                    DEF_CRUSH(4)
                    Bonuses.Bonus.STRENGTH(42)
                }
            }
        }

        // Rune halberd (id: 3202)
        3202 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                    normalAttackDistance = 2
                    longAttackDistance = 4
                }
                bonuses {
                    ATT_STAB(48)
                    ATT_SLASH(67)
                    ATT_MAGIC(-4)
                    DEF_STAB(-1)
                    DEF_SLASH(4)
                    DEF_CRUSH(5)
                    Bonuses.Bonus.STRENGTH(68)
                }
            }
        }

        // Dragon halberd (id: 3204)
        3204 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                    normalAttackDistance = 2
                    longAttackDistance = 4
                }
                bonuses {
                    ATT_STAB(70)
                    ATT_SLASH(95)
                    ATT_MAGIC(-4)
                    DEF_STAB(-1)
                    DEF_SLASH(4)
                    DEF_CRUSH(5)
                    Bonuses.Bonus.STRENGTH(89)
                }
            }
        }

        // Crystal pendant (id: 3208)
        3208 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Myre snelm (id: 3327)
        3327 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(7)
                    DEF_SLASH(8)
                    DEF_CRUSH(6)
                    DEF_MAGIC(-1)
                    DEF_RANGE(7)
                }
            }
        }

        // Blood'n'tar snelm (id: 3329)
        3329 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(7)
                    DEF_SLASH(8)
                    DEF_CRUSH(6)
                    DEF_MAGIC(-1)
                    DEF_RANGE(7)
                }
            }
        }

        // Ochre snelm (id: 3331)
        3331 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(7)
                    DEF_SLASH(8)
                    DEF_CRUSH(6)
                    DEF_MAGIC(-1)
                    DEF_RANGE(7)
                }
            }
        }

        // Bruise blue snelm (id: 3333)
        3333 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(7)
                    DEF_SLASH(8)
                    DEF_CRUSH(6)
                    DEF_MAGIC(-1)
                    DEF_RANGE(7)
                }
            }
        }

        // Broken bark snelm (id: 3335)
        3335 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(7)
                    DEF_SLASH(8)
                    DEF_CRUSH(6)
                    DEF_MAGIC(-1)
                    DEF_RANGE(7)
                }
            }
        }

        // Pointed myre snelm (id: 3337)
        3337 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(7)
                    DEF_SLASH(8)
                    DEF_CRUSH(6)
                    DEF_MAGIC(-1)
                    DEF_RANGE(7)
                }
            }
        }

        // Pointed blood'n'tar snelm (id: 3339)
        3339 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(7)
                    DEF_SLASH(8)
                    DEF_CRUSH(6)
                    DEF_MAGIC(-1)
                    DEF_RANGE(7)
                }
            }
        }

        // Pointed ochre snelm (id: 3341)
        3341 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(7)
                    DEF_SLASH(8)
                    DEF_CRUSH(6)
                    DEF_MAGIC(-1)
                    DEF_RANGE(7)
                }
            }
        }

        // Pointed bruise blue snelm (id: 3343)
        3343 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(7)
                    DEF_SLASH(8)
                    DEF_CRUSH(6)
                    DEF_MAGIC(-1)
                    DEF_RANGE(7)
                }
            }
        }

        // Splitbark helm (id: 3385)
        3385 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-2)
                    DEF_STAB(10)
                    DEF_SLASH(9)
                    DEF_CRUSH(11)
                    DEF_MAGIC(3)
                }
            }
        }

        // Splitbark body (id: 3387)
        3387 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(10)
                    ATT_RANGED(-10)
                    DEF_STAB(36)
                    DEF_SLASH(26)
                    DEF_CRUSH(42)
                    DEF_MAGIC(15)
                }
            }
        }

        // Splitbark legs (id: 3389)
        3389 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(7)
                    ATT_RANGED(-7)
                    DEF_STAB(22)
                    DEF_SLASH(20)
                    DEF_CRUSH(25)
                    DEF_MAGIC(10)
                }
            }
        }

        // Splitbark gauntlets (id: 3391)
        3391 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(2)
                    ATT_RANGED(-1)
                    DEF_STAB(3)
                    DEF_SLASH(2)
                    DEF_CRUSH(4)
                    DEF_MAGIC(2)
                }
            }
        }

        // Splitbark boots (id: 3393)
        3393 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(2)
                    ATT_RANGED(-1)
                    DEF_STAB(3)
                    DEF_SLASH(2)
                    DEF_CRUSH(4)
                    DEF_MAGIC(2)
                }
            }
        }

        // Black plateskirt (t) (id: 3472)
        3472 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(21)
                    DEF_SLASH(20)
                    DEF_CRUSH(19)
                    DEF_MAGIC(-4)
                    DEF_RANGE(20)
                }
            }
        }

        // Black plateskirt (g) (id: 3473)
        3473 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(21)
                    DEF_SLASH(20)
                    DEF_CRUSH(19)
                    DEF_MAGIC(-4)
                    DEF_RANGE(20)
                }
            }
        }

        // Adamant plateskirt (t) (id: 3474)
        3474 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(33)
                    DEF_SLASH(31)
                    DEF_CRUSH(29)
                    DEF_MAGIC(-4)
                    DEF_RANGE(31)
                }
            }
        }

        // Adamant plateskirt (g) (id: 3475)
        3475 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(33)
                    DEF_SLASH(31)
                    DEF_CRUSH(29)
                    DEF_MAGIC(-4)
                    DEF_RANGE(31)
                }
            }
        }

        // Rune plateskirt (g) (id: 3476)
        3476 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(51)
                    DEF_SLASH(49)
                    DEF_CRUSH(47)
                    DEF_MAGIC(-4)
                    DEF_RANGE(49)
                }
            }
        }

        // Rune plateskirt (t) (id: 3477)
        3477 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(51)
                    DEF_SLASH(49)
                    DEF_CRUSH(47)
                    DEF_MAGIC(-4)
                    DEF_RANGE(49)
                }
            }
        }

        // Zamorak plateskirt (id: 3478)
        3478 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(51)
                    DEF_SLASH(49)
                    DEF_CRUSH(47)
                    DEF_MAGIC(-4)
                    DEF_RANGE(49)
                    PRAYER(1)
                }
            }
        }

        // Saradomin plateskirt (id: 3479)
        3479 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(51)
                    DEF_SLASH(49)
                    DEF_CRUSH(47)
                    DEF_MAGIC(-4)
                    DEF_RANGE(49)
                    PRAYER(1)
                }
            }
        }

        // Guthix plateskirt (id: 3480)
        3480 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(51)
                    DEF_SLASH(49)
                    DEF_CRUSH(47)
                    DEF_MAGIC(-4)
                    DEF_RANGE(49)
                    PRAYER(1)
                }
            }
        }

        // Gilded platebody (id: 3481)
        3481 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(82)
                    DEF_SLASH(80)
                    DEF_CRUSH(72)
                    DEF_MAGIC(-6)
                    DEF_RANGE(80)
                }
            }
        }

        // Gilded platelegs (id: 3483)
        3483 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(51)
                    DEF_SLASH(49)
                    DEF_CRUSH(47)
                    DEF_MAGIC(-4)
                    DEF_RANGE(49)
                }
            }
        }

        // Gilded plateskirt (id: 3485)
        3485 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(51)
                    DEF_SLASH(49)
                    DEF_CRUSH(47)
                    DEF_MAGIC(-4)
                    DEF_RANGE(49)
                }
            }
        }

        // Gilded full helm (id: 3486)
        3486 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(30)
                    DEF_SLASH(32)
                    DEF_CRUSH(27)
                    DEF_MAGIC(-1)
                    DEF_RANGE(30)
                }
            }
        }

        // Gilded kiteshield (id: 3488)
        3488 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-3)
                    DEF_STAB(44)
                    DEF_SLASH(48)
                    DEF_CRUSH(46)
                    DEF_MAGIC(-1)
                    DEF_RANGE(46)
                }
            }
        }

        // Unstrung lyre (id: 3688)
        3688 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Lyre (id: 3689)
        3689 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Enchanted lyre (id: 3690)
        3690 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Enchanted lyre(1) (id: 3691)
        3691 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Pet rock (id: 3695)
        3695 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Fremennik helm (id: 3748)
        3748 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(19)
                    DEF_SLASH(21)
                    DEF_CRUSH(16)
                    DEF_MAGIC(-1)
                    DEF_RANGE(19)
                }
            }
        }

        // Archer helm (id: 3749)
        3749 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(-5)
                    ATT_SLASH(-5)
                    ATT_CRUSH(-5)
                    ATT_MAGIC(-5)
                    ATT_RANGED(6)
                    DEF_STAB(6)
                    DEF_SLASH(8)
                    DEF_CRUSH(10)
                    DEF_MAGIC(6)
                    DEF_RANGE(6)
                }
            }
        }

        // Berserker helm (id: 3751)
        3751 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-5)
                    ATT_RANGED(-5)
                    DEF_STAB(31)
                    DEF_SLASH(29)
                    DEF_CRUSH(33)
                    DEF_RANGE(30)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Warrior helm (id: 3753)
        3753 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_SLASH(5)
                    ATT_MAGIC(-5)
                    ATT_RANGED(-5)
                    DEF_STAB(31)
                    DEF_SLASH(33)
                    DEF_CRUSH(29)
                    DEF_RANGE(30)
                }
            }
        }

        // Farseer helm (id: 3755)
        3755 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(-5)
                    ATT_SLASH(-5)
                    ATT_CRUSH(-5)
                    ATT_MAGIC(6)
                    ATT_RANGED(-5)
                    DEF_STAB(8)
                    DEF_SLASH(10)
                    DEF_CRUSH(12)
                    DEF_MAGIC(6)
                }
            }
        }

        // Fremennik blade (id: 3757)
        3757 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(6)
                    ATT_SLASH(29)
                    ATT_CRUSH(-2)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(28)
                }
            }
        }

        // Fremennik shield (id: 3758)
        3758 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(27)
                    DEF_SLASH(31)
                    DEF_CRUSH(29)
                    DEF_MAGIC(-1)
                    DEF_RANGE(29)
                }
            }
        }

        // Fremennik cyan cloak (id: 3759)
        3759 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Fremennik brown cloak (id: 3761)
        3761 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Fremennik blue cloak (id: 3763)
        3763 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Fremennik green cloak (id: 3765)
        3765 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Fremennik brown shirt (id: 3767)
        3767 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Fremennik grey shirt (id: 3769)
        3769 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Fremennik beige shirt (id: 3771)
        3771 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Fremennik red shirt (id: 3773)
        3773 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Fremennik blue shirt (id: 3775)
        3775 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Fremennik red cloak (id: 3777)
        3777 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Fremennik grey cloak (id: 3779)
        3779 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Fremennik yellow cloak (id: 3781)
        3781 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Fremennik teal cloak (id: 3783)
        3783 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Fremennik purple cloak (id: 3785)
        3785 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Fremennik pink cloak (id: 3787)
        3787 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Fremennik black cloak (id: 3789)
        3789 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Fremennik boots (id: 3791)
        3791 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Fremennik robe (id: 3793)
        3793 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Fremennik skirt (id: 3795)
        3795 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Fremennik hat (id: 3797)
        3797 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Fremennik gloves (id: 3799)
        3799 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                }
            }
        }

        // Damaged book (id: 3839)
        3839 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    PRAYER(5)
                }
            }
        }

        // Holy book (id: 3840)
        3840 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    DEF_STAB(8)
                    DEF_SLASH(8)
                    DEF_CRUSH(8)
                    DEF_MAGIC(8)
                    DEF_RANGE(8)
                    PRAYER(5)
                }
            }
        }

        // Damaged book (id: 3841)
        3841 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    PRAYER(5)
                }
            }
        }

        // Unholy book (id: 3842)
        3842 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(8)
                    ATT_CRUSH(8)
                    ATT_MAGIC(8)
                    ATT_RANGED(8)
                    PRAYER(5)
                }
            }
        }

        // Damaged book (id: 3843)
        3843 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    PRAYER(5)
                }
            }
        }

        // Book of balance (id: 3844)
        3844 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(4)
                    ATT_RANGED(4)
                    DEF_STAB(4)
                    DEF_SLASH(4)
                    DEF_CRUSH(4)
                    DEF_MAGIC(4)
                    DEF_RANGE(4)
                    PRAYER(5)
                }
            }
        }

        // Games necklace(8) (id: 3853)
        3853 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Games necklace(7) (id: 3855)
        3855 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Games necklace(6) (id: 3857)
        3857 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Games necklace(5) (id: 3859)
        3859 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Games necklace(4) (id: 3861)
        3861 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Games necklace(3) (id: 3863)
        3863 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Games necklace(2) (id: 3865)
        3865 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Games necklace(1) (id: 3867)
        3867 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Stool (id: 3893)
        3893 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Iron sickle (id: 3899)
        3899 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_MAGIC(1)
                    DEF_RANGE(1)
                    Bonuses.Bonus.STRENGTH(1)
                }
            }
        }

        // M'speak amulet (id: 4021)
        4021 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Monkey talisman (id: 4023)
        4023 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Ninja monkey greegree (id: 4024)
        4024 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Ninja monkey greegree (id: 4025)
        4025 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Gorilla greegree (id: 4026)
        4026 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Bearded gorilla greegree (id: 4027)
        4027 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Ancient gorilla greegree (id: 4028)
        4028 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Zombie monkey greegree (id: 4029)
        4029 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Zombie monkey greegree (id: 4030)
        4030 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Karamjan monkey greegree (id: 4031)
        4031 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // 10th squad sigil (id: 4035)
        4035 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Saradomin banner (id: 4037)
        4037 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Zamorak banner (id: 4039)
        4039 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Saradomin cloak (id: 4041)
        4041 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Zamorak cloak (id: 4042)
        4042 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Decorative sword (id: 4068)
        4068 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(13)
                    ATT_SLASH(18)
                    ATT_CRUSH(-2)
                    DEF_SLASH(3)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(16)
                }
            }
        }

        // Decorative armour (id: 4069)
        4069 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(32)
                    DEF_SLASH(31)
                    DEF_CRUSH(24)
                    DEF_MAGIC(-6)
                    DEF_RANGE(31)
                }
            }
        }

        // Decorative armour (id: 4070)
        4070 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(17)
                    DEF_SLASH(16)
                    DEF_CRUSH(15)
                    DEF_MAGIC(-4)
                    DEF_RANGE(16)
                }
            }
        }

        // Decorative helm (id: 4071)
        4071 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    DEF_STAB(7)
                    DEF_SLASH(8)
                    DEF_CRUSH(6)
                    DEF_MAGIC(-1)
                    DEF_RANGE(7)
                }
            }
        }

        // Decorative shield (id: 4072)
        4072 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-3)
                    DEF_STAB(13)
                    DEF_SLASH(15)
                    DEF_CRUSH(14)
                    DEF_MAGIC(-1)
                    DEF_RANGE(14)
                }
            }
        }

        // Salve amulet (id: 4081)
        4081 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    PRAYER(3)
                }
            }
        }

        // Sled (id: 4083)
        4083 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Sled (id: 4084)
        4084 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Wax (id: 4085)
        4085 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Trollweiss (id: 4086)
        4086 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-50)
                    Bonuses.Bonus.STRENGTH(-10)
                }
            }
        }

        // Dragon platelegs (id: 4087)
        4087 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(68)
                    DEF_SLASH(66)
                    DEF_CRUSH(63)
                    DEF_MAGIC(-4)
                    DEF_RANGE(65)
                }
            }
        }

        // Mystic hat (id: 4089)
        4089 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                }
            }
        }

        // Mystic robe top (id: 4091)
        4091 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(20)
                    DEF_MAGIC(20)
                }
            }
        }

        // Mystic robe bottom (id: 4093)
        4093 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_MAGIC(15)
                }
            }
        }

        // Mystic gloves (id: 4095)
        4095 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Mystic boots (id: 4097)
        4097 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Mystic hat (dark) (id: 4099)
        4099 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                }
            }
        }

        // Mystic robe top (dark) (id: 4101)
        4101 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(20)
                    DEF_MAGIC(20)
                }
            }
        }

        // Mystic robe bottom (dark) (id: 4103)
        4103 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_MAGIC(15)
                }
            }
        }

        // Mystic gloves (dark) (id: 4105)
        4105 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Mystic boots (dark) (id: 4107)
        4107 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Mystic hat (light) (id: 4109)
        4109 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                }
            }
        }

        // Mystic robe top (light) (id: 4111)
        4111 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(20)
                    DEF_MAGIC(20)
                }
            }
        }

        // Mystic robe bottom (light) (id: 4113)
        4113 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_MAGIC(15)
                }
            }
        }

        // Mystic gloves (light) (id: 4115)
        4115 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Mystic boots (light) (id: 4117)
        4117 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Bronze boots (id: 4119)
        4119 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(1)
                    DEF_SLASH(2)
                    DEF_CRUSH(3)
                }
            }
        }

        // Iron boots (id: 4121)
        4121 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(4)
                }
            }
        }

        // Steel boots (id: 4123)
        4123 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(5)
                    DEF_SLASH(6)
                    DEF_CRUSH(7)
                }
            }
        }

        // Black boots (id: 4125)
        4125 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(7)
                    DEF_SLASH(8)
                    DEF_CRUSH(9)
                }
            }
        }

        // Mithril boots (id: 4127)
        4127 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(8)
                    DEF_SLASH(9)
                    DEF_CRUSH(10)
                }
            }
        }

        // Adamant boots (id: 4129)
        4129 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(10)
                    DEF_SLASH(11)
                    DEF_CRUSH(12)
                    Bonuses.Bonus.STRENGTH(1)
                }
            }
        }

        // Rune boots (id: 4131)
        4131 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(12)
                    DEF_SLASH(13)
                    DEF_CRUSH(14)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Abyssal whip (id: 4151)
        4151 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_SLASH(82)
                    Bonuses.Bonus.STRENGTH(82)
                }
            }
        }

        // Granite maul (id: 4153)
        4153 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_CRUSH(81)
                    Bonuses.Bonus.STRENGTH(79)
                }
            }
        }

        // Mirror shield (id: 4156)
        4156 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    DEF_STAB(10)
                    DEF_SLASH(15)
                    DEF_CRUSH(5)
                    DEF_MAGIC(5)
                    DEF_RANGE(10)
                }
            }
        }

        // Leaf-bladed spear (id: 4158)
        4158 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(47)
                    ATT_SLASH(42)
                    ATT_CRUSH(36)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(50)
                }
            }
        }

        // Leaf-bladed spear (id: 4159)
        4159 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(47)
                    ATT_SLASH(42)
                    ATT_CRUSH(36)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(50)
                }
            }
        }

        // Broad arrows (id: 4160)
        4160 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(28)
                }
            }
        }

        // Rock hammer (id: 4162)
        4162 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

    }
}
