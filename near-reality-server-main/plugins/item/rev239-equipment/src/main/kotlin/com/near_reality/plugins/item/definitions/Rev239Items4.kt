package com.near_reality.plugins.item.definitions

import com.near_reality.scripts.item.definitions.ItemDefinitionsScript
import com.zenyte.game.world.entity.player.Bonuses
import com.zenyte.game.world.entity.player.Bonuses.Bonus.*
import com.zenyte.game.world.entity.player.container.impl.equipment.EquipmentSlot

class Rev239Items4 : ItemDefinitionsScript() {
    init {
        // Crystal shield 4/10 (i) (id: 11766)
        11766 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Crystal shield 3/10 (i) (id: 11767)
        11767 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Crystal shield 2/10 (i) (id: 11768)
        11768 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Crystal shield 1/10 (i) (id: 11769)
        11769 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Seers ring (i) (id: 11770)
        11770 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_MAGIC(12)
                    DEF_MAGIC(12)
                    MAGIC_DAMAGE(0)
                }
            }
        }

        // Archers ring (i) (id: 11771)
        11771 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_RANGED(8)
                    DEF_RANGE(8)
                }
            }
        }

        // Warrior ring (i) (id: 11772)
        11772 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_SLASH(8)
                    DEF_SLASH(8)
                }
            }
        }

        // Berserker ring (i) (id: 11773)
        11773 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    DEF_CRUSH(8)
                    Bonuses.Bonus.STRENGTH(8)
                }
            }
        }

        // Black mask (10) (i) (id: 11774)
        11774 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(10)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                }
            }
        }

        // Black mask (9) (i) (id: 11775)
        11775 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(10)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                }
            }
        }

        // Black mask (8) (i) (id: 11776)
        11776 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(10)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                }
            }
        }

        // Black mask (7) (i) (id: 11777)
        11777 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(10)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                }
            }
        }

        // Black mask (6) (i) (id: 11778)
        11778 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(10)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                }
            }
        }

        // Black mask (5) (i) (id: 11779)
        11779 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(10)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                }
            }
        }

        // Black mask (4) (i) (id: 11780)
        11780 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(10)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                }
            }
        }

        // Black mask (3) (i) (id: 11781)
        11781 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(10)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                }
            }
        }

        // Black mask (2) (i) (id: 11782)
        11782 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(10)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                }
            }
        }

        // Black mask (1) (i) (id: 11783)
        11783 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(10)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                }
            }
        }

        // Black mask (i) (id: 11784)
        11784 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(10)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                }
            }
        }

        // Armadyl crossbow (id: 11785)
        11785 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                    normalAttackDistance = 8
                    longAttackDistance = 10
                }
                bonuses {
                    ATT_RANGED(100)
                    PRAYER(1)
                }
            }
        }

        // Steam battlestaff (id: 11787)
        11787 {
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

        // Mystic steam staff (id: 11789)
        11789 {
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

        // Staff of the dead (id: 11791)
        11791 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    ATT_STAB(55)
                    ATT_SLASH(70)
                    ATT_MAGIC(17)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(17)
                    Bonuses.Bonus.STRENGTH(72)
                    MAGIC_DAMAGE(15)
                }
            }
        }

        // Armadyl godsword (id: 11802)
        11802 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                }
                bonuses {
                    ATT_SLASH(132)
                    ATT_CRUSH(80)
                    Bonuses.Bonus.STRENGTH(132)
                    PRAYER(8)
                }
            }
        }

        // Bandos godsword (id: 11804)
        11804 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                }
                bonuses {
                    ATT_SLASH(132)
                    ATT_CRUSH(80)
                    Bonuses.Bonus.STRENGTH(132)
                    PRAYER(8)
                }
            }
        }

        // Saradomin godsword (id: 11806)
        11806 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                }
                bonuses {
                    ATT_SLASH(132)
                    ATT_CRUSH(80)
                    Bonuses.Bonus.STRENGTH(132)
                    PRAYER(8)
                }
            }
        }

        // Zamorak godsword (id: 11808)
        11808 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                }
                bonuses {
                    ATT_SLASH(132)
                    ATT_CRUSH(80)
                    Bonuses.Bonus.STRENGTH(132)
                    PRAYER(8)
                }
            }
        }

        // Zamorakian spear (id: 11824)
        11824 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(85)
                    ATT_SLASH(65)
                    ATT_CRUSH(65)
                    DEF_STAB(13)
                    DEF_SLASH(13)
                    DEF_CRUSH(12)
                    DEF_RANGE(13)
                    Bonuses.Bonus.STRENGTH(75)
                    PRAYER(2)
                }
            }
        }

        // Armadyl helmet (id: 11826)
        11826 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(-5)
                    ATT_SLASH(-5)
                    ATT_CRUSH(-5)
                    ATT_MAGIC(-5)
                    ATT_RANGED(10)
                    DEF_STAB(6)
                    DEF_SLASH(8)
                    DEF_CRUSH(10)
                    DEF_MAGIC(10)
                    DEF_RANGE(8)
                    PRAYER(1)
                }
            }
        }

        // Armadyl chestplate (id: 11828)
        11828 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_STAB(-7)
                    ATT_SLASH(-7)
                    ATT_CRUSH(-7)
                    ATT_MAGIC(-15)
                    ATT_RANGED(33)
                    DEF_STAB(56)
                    DEF_SLASH(48)
                    DEF_CRUSH(61)
                    DEF_MAGIC(70)
                    DEF_RANGE(57)
                    PRAYER(1)
                }
            }
        }

        // Armadyl chainskirt (id: 11830)
        11830 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_STAB(-6)
                    ATT_SLASH(-6)
                    ATT_CRUSH(-6)
                    ATT_MAGIC(-10)
                    ATT_RANGED(20)
                    DEF_STAB(32)
                    DEF_SLASH(26)
                    DEF_CRUSH(34)
                    DEF_MAGIC(40)
                    DEF_RANGE(33)
                    PRAYER(1)
                }
            }
        }

        // Bandos chestplate (id: 11832)
        11832 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(-10)
                    DEF_STAB(98)
                    DEF_SLASH(93)
                    DEF_CRUSH(105)
                    DEF_MAGIC(-6)
                    DEF_RANGE(133)
                    Bonuses.Bonus.STRENGTH(4)
                    PRAYER(1)
                }
            }
        }

        // Bandos tassets (id: 11834)
        11834 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-7)
                    DEF_STAB(71)
                    DEF_SLASH(63)
                    DEF_CRUSH(66)
                    DEF_MAGIC(-4)
                    DEF_RANGE(93)
                    Bonuses.Bonus.STRENGTH(2)
                    PRAYER(1)
                }
            }
        }

        // Bandos boots (id: 11836)
        11836 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-5)
                    ATT_RANGED(-3)
                    DEF_STAB(17)
                    DEF_SLASH(18)
                    DEF_CRUSH(19)
                    DEF_RANGE(15)
                    PRAYER(1)
                }
            }
        }

        // Saradomin sword (id: 11838)
        11838 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_SLASH(82)
                    ATT_CRUSH(60)
                    Bonuses.Bonus.STRENGTH(82)
                    PRAYER(2)
                }
            }
        }

        // Dragon boots (id: 11840)
        11840 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(16)
                    DEF_SLASH(17)
                    DEF_CRUSH(18)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Graceful cape (id: 11852)
        11852 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful cape (id: 11853)
        11853 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful top (id: 11854)
        11854 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful top (id: 11855)
        11855 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful legs (id: 11856)
        11856 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful legs (id: 11857)
        11857 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful gloves (id: 11858)
        11858 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful gloves (id: 11859)
        11859 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful boots (id: 11860)
        11860 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Graceful boots (id: 11861)
        11861 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Slayer helmet (id: 11864)
        11864 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(30)
                    DEF_SLASH(32)
                    DEF_CRUSH(27)
                    DEF_MAGIC(-1)
                    DEF_RANGE(30)
                }
            }
        }

        // Slayer helmet (i) (id: 11865)
        11865 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(3)
                    DEF_STAB(30)
                    DEF_SLASH(32)
                    DEF_CRUSH(27)
                    DEF_MAGIC(10)
                    DEF_RANGE(30)
                }
            }
        }

        // Slayer ring (8) (id: 11866)
        11866 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Slayer ring (7) (id: 11867)
        11867 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Slayer ring (6) (id: 11868)
        11868 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Slayer ring (5) (id: 11869)
        11869 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Slayer ring (4) (id: 11870)
        11870 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Slayer ring (3) (id: 11871)
        11871 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Slayer ring (2) (id: 11872)
        11872 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Slayer ring (1) (id: 11873)
        11873 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Broad bolts (id: 11875)
        11875 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(100)
                }
            }
        }

        // Zamorakian hasta (id: 11889)
        11889 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(85)
                    ATT_SLASH(65)
                    ATT_CRUSH(65)
                    DEF_STAB(13)
                    DEF_SLASH(13)
                    DEF_CRUSH(12)
                    DEF_RANGE(13)
                    Bonuses.Bonus.STRENGTH(75)
                    PRAYER(2)
                }
            }
        }

        // Saradomin banner (id: 11891)
        11891 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Zamorak banner (id: 11892)
        11892 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Decorative armour (id: 11893)
        11893 {
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

        // Decorative armour (id: 11894)
        11894 {
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

        // Decorative armour (id: 11895)
        11895 {
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

        // Decorative armour (id: 11896)
        11896 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_STAB(20)
                    DEF_SLASH(20)
                    DEF_CRUSH(20)
                    DEF_MAGIC(20)
                    DEF_RANGE(20)
                }
            }
        }

        // Decorative armour (id: 11897)
        11897 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_STAB(15)
                    DEF_SLASH(15)
                    DEF_CRUSH(15)
                    DEF_MAGIC(15)
                    DEF_RANGE(15)
                }
            }
        }

        // Decorative armour (id: 11898)
        11898 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(4)
                    DEF_SLASH(4)
                    DEF_CRUSH(4)
                    DEF_MAGIC(4)
                    DEF_RANGE(4)
                }
            }
        }

        // Decorative armour (id: 11899)
        11899 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_STAB(20)
                    DEF_SLASH(20)
                    DEF_CRUSH(20)
                    DEF_MAGIC(20)
                    DEF_RANGE(20)
                }
            }
        }

        // Decorative armour (id: 11900)
        11900 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_STAB(15)
                    DEF_SLASH(15)
                    DEF_CRUSH(15)
                    DEF_MAGIC(15)
                    DEF_RANGE(15)
                }
            }
        }

        // Decorative armour (id: 11901)
        11901 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_STAB(4)
                    DEF_SLASH(4)
                    DEF_CRUSH(4)
                    DEF_MAGIC(4)
                    DEF_RANGE(4)
                }
            }
        }

        // Leaf-bladed sword (id: 11902)
        11902 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(67)
                    ATT_SLASH(62)
                    Bonuses.Bonus.STRENGTH(50)
                }
            }
        }

        // Trident of the seas (full) (id: 11905)
        11905 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_MAGIC(15)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(15)
                }
            }
        }

        // Trident of the seas (id: 11907)
        11907 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_MAGIC(15)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(15)
                }
            }
        }

        // Uncharged trident (id: 11908)
        11908 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_MAGIC(15)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(15)
                }
            }
        }

        // Dragon pickaxe (id: 11920)
        11920 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(38)
                    ATT_SLASH(-2)
                    ATT_CRUSH(32)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(42)
                }
            }
        }

        // Broken pickaxe (id: 11923)
        11923 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Malediction ward (id: 11924)
        11924 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-8)
                    ATT_SLASH(-8)
                    ATT_CRUSH(-8)
                    ATT_MAGIC(12)
                    ATT_RANGED(-12)
                    DEF_STAB(50)
                    DEF_SLASH(52)
                    DEF_CRUSH(48)
                    DEF_MAGIC(15)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Odium ward (id: 11926)
        11926 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-12)
                    ATT_SLASH(-12)
                    ATT_CRUSH(-12)
                    ATT_MAGIC(-8)
                    ATT_RANGED(12)
                    DEF_MAGIC(24)
                    DEF_RANGE(52)
                }
            }
        }

        // Black chinchompa (id: 11959)
        11959 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 9
                    longAttackDistance = 11
                }
                bonuses {
                    ATT_RANGED(80)
                    RANGE_STRENGTH(30)
                }
            }
        }

        // Amulet of glory (t6) (id: 11964)
        11964 {
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

        // Amulet of glory (t5) (id: 11966)
        11966 {
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

        // Skills necklace(6) (id: 11968)
        11968 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Skills necklace(5) (id: 11970)
        11970 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Combat bracelet(6) (id: 11972)
        11972 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(7)
                    ATT_CRUSH(7)
                    ATT_MAGIC(3)
                    ATT_RANGED(7)
                    DEF_STAB(5)
                    DEF_SLASH(5)
                    DEF_CRUSH(5)
                    DEF_MAGIC(3)
                    DEF_RANGE(5)
                    Bonuses.Bonus.STRENGTH(6)
                }
            }
        }

        // Combat bracelet(5) (id: 11974)
        11974 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(7)
                    ATT_CRUSH(7)
                    ATT_MAGIC(3)
                    ATT_RANGED(7)
                    DEF_STAB(5)
                    DEF_SLASH(5)
                    DEF_CRUSH(5)
                    DEF_MAGIC(3)
                    DEF_RANGE(5)
                    Bonuses.Bonus.STRENGTH(6)
                }
            }
        }

        // Amulet of glory(5) (id: 11976)
        11976 {
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

        // Amulet of glory(6) (id: 11978)
        11978 {
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

        // Ring of wealth (5) (id: 11980)
        11980 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of wealth (4) (id: 11982)
        11982 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of wealth (3) (id: 11984)
        11984 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of wealth (2) (id: 11986)
        11986 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of wealth (1) (id: 11988)
        11988 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Smoke battlestaff (id: 11998)
        11998 {
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

        // Mystic smoke staff (id: 12000)
        12000 {
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

        // Occult necklace (id: 12002)
        12002 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_MAGIC(12)
                    PRAYER(2)
                    MAGIC_DAMAGE(5)
                }
            }
        }

        // Abyssal tentacle (id: 12006)
        12006 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_SLASH(90)
                    Bonuses.Bonus.STRENGTH(86)
                }
            }
        }

        // Prospector jacket (id: 12014)
        12014 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Prospector legs (id: 12015)
        12015 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Prospector boots (id: 12016)
        12016 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Salve amulet(i) (id: 12017)
        12017 {
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

        // Salve amulet(ei) (id: 12018)
        12018 {
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

        // Ancient robe top (id: 12193)
        12193 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                    PRAYER(6)
                }
            }
        }

        // Ancient robe legs (id: 12195)
        12195 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                    PRAYER(5)
                }
            }
        }

        // Ancient cloak (id: 12197)
        12197 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_MAGIC(1)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(3)
                    DEF_RANGE(3)
                    PRAYER(3)
                }
            }
        }

        // Ancient crozier (id: 12199)
        12199 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(-1)
                    ATT_CRUSH(25)
                    ATT_MAGIC(10)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(10)
                    Bonuses.Bonus.STRENGTH(32)
                    PRAYER(6)
                }
            }
        }

        // Ancient stole (id: 12201)
        12201 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_MAGIC(2)
                    DEF_MAGIC(2)
                    PRAYER(10)
                }
            }
        }

        // Ancient mitre (id: 12203)
        12203 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                    PRAYER(5)
                }
            }
        }

        // Bronze platebody (g) (id: 12205)
        12205 {
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

        // Bronze platelegs (g) (id: 12207)
        12207 {
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

        // Bronze plateskirt (g) (id: 12209)
        12209 {
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

        // Bronze full helm (g) (id: 12211)
        12211 {
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

        // Bronze kiteshield (g) (id: 12213)
        12213 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(5)
                    DEF_SLASH(7)
                    DEF_CRUSH(6)
                    DEF_MAGIC(-1)
                    DEF_RANGE(6)
                }
            }
        }

        // Bronze platebody (t) (id: 12215)
        12215 {
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

        // Bronze platelegs (t) (id: 12217)
        12217 {
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

        // Bronze plateskirt (t) (id: 12219)
        12219 {
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

        // Bronze full helm (t) (id: 12221)
        12221 {
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

        // Bronze kiteshield (t) (id: 12223)
        12223 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(5)
                    DEF_SLASH(7)
                    DEF_CRUSH(6)
                    DEF_MAGIC(-1)
                    DEF_RANGE(6)
                }
            }
        }

        // Iron platebody (t) (id: 12225)
        12225 {
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

        // Iron platelegs (t) (id: 12227)
        12227 {
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

        // Iron plateskirt (t) (id: 12229)
        12229 {
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

        // Iron full helm (t) (id: 12231)
        12231 {
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

        // Iron kiteshield (t) (id: 12233)
        12233 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(8)
                    DEF_SLASH(10)
                    DEF_CRUSH(9)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                }
            }
        }

        // Iron platebody (g) (id: 12235)
        12235 {
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

        // Iron platelegs (g) (id: 12237)
        12237 {
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

        // Iron plateskirt (g) (id: 12239)
        12239 {
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

        // Iron full helm (g) (id: 12241)
        12241 {
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

        // Iron kiteshield (g) (id: 12243)
        12243 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(8)
                    DEF_SLASH(10)
                    DEF_CRUSH(9)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                }
            }
        }

        // Armadyl robe top (id: 12253)
        12253 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                    PRAYER(6)
                }
            }
        }

        // Armadyl robe legs (id: 12255)
        12255 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                    PRAYER(5)
                }
            }
        }

        // Armadyl stole (id: 12257)
        12257 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_MAGIC(2)
                    DEF_MAGIC(2)
                    PRAYER(10)
                }
            }
        }

        // Armadyl mitre (id: 12259)
        12259 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                    PRAYER(5)
                }
            }
        }

        // Armadyl cloak (id: 12261)
        12261 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_MAGIC(1)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(3)
                    DEF_RANGE(3)
                    PRAYER(3)
                }
            }
        }

        // Armadyl crozier (id: 12263)
        12263 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(-1)
                    ATT_CRUSH(25)
                    ATT_MAGIC(10)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(10)
                    Bonuses.Bonus.STRENGTH(32)
                    PRAYER(6)
                }
            }
        }

        // Bandos robe top (id: 12265)
        12265 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                    PRAYER(6)
                }
            }
        }

        // Bandos robe legs (id: 12267)
        12267 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                    PRAYER(5)
                }
            }
        }

        // Bandos stole (id: 12269)
        12269 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_MAGIC(2)
                    DEF_MAGIC(2)
                    PRAYER(10)
                }
            }
        }

        // Bandos mitre (id: 12271)
        12271 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                    PRAYER(5)
                }
            }
        }

        // Bandos cloak (id: 12273)
        12273 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_MAGIC(1)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(3)
                    DEF_RANGE(3)
                    PRAYER(3)
                }
            }
        }

        // Bandos crozier (id: 12275)
        12275 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(-1)
                    ATT_CRUSH(25)
                    ATT_MAGIC(10)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(10)
                    Bonuses.Bonus.STRENGTH(32)
                    PRAYER(6)
                }
            }
        }

        // Mithril platebody (g) (id: 12277)
        12277 {
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

        // Mithril platelegs (g) (id: 12279)
        12279 {
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

        // Mithril kiteshield (g) (id: 12281)
        12281 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(18)
                    DEF_SLASH(22)
                    DEF_CRUSH(20)
                    DEF_MAGIC(-1)
                    DEF_RANGE(20)
                }
            }
        }

        // Mithril full helm (g) (id: 12283)
        12283 {
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

        // Mithril plateskirt (g) (id: 12285)
        12285 {
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

        // Mithril platebody (t) (id: 12287)
        12287 {
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

        // Mithril platelegs (t) (id: 12289)
        12289 {
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

        // Mithril kiteshield (t) (id: 12291)
        12291 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(18)
                    DEF_SLASH(22)
                    DEF_CRUSH(20)
                    DEF_MAGIC(-1)
                    DEF_RANGE(20)
                }
            }
        }

        // Mithril full helm (t) (id: 12293)
        12293 {
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

        // Mithril plateskirt (t) (id: 12295)
        12295 {
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

        // Black pickaxe (id: 12297)
        12297 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(-2)
                    ATT_CRUSH(8)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(11)
                }
            }
        }

        // Pink elegant shirt (id: 12315)
        12315 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Pink elegant legs (id: 12317)
        12317 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Red d'hide body (g) (id: 12327)
        12327 {
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

        // Red d'hide chaps (g) (id: 12329)
        12329 {
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

        // Red d'hide body (t) (id: 12331)
        12331 {
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

        // Red d'hide chaps (t) (id: 12333)
        12333 {
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

        // Briefcase (id: 12335)
        12335 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Pink elegant blouse (id: 12339)
        12339 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Pink elegant skirt (id: 12341)
        12341 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Gold elegant blouse (id: 12343)
        12343 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Gold elegant skirt (id: 12345)
        12345 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Gold elegant shirt (id: 12347)
        12347 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Gold elegant legs (id: 12349)
        12349 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Katana (id: 12357)
        12357 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(45)
                    DEF_STAB(3)
                    DEF_SLASH(7)
                    DEF_CRUSH(7)
                    DEF_RANGE(-3)
                    Bonuses.Bonus.STRENGTH(40)
                }
            }
        }

        // Dragon cane (id: 12373)
        12373 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
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

        // Black cane (id: 12375)
        12375 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
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

        // Adamant cane (id: 12377)
        12377 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
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

        // Rune cane (id: 12379)
        12379 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
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

        // Black d'hide body (g) (id: 12381)
        12381 {
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

        // Black d'hide chaps (g) (id: 12383)
        12383 {
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

        // Black d'hide body (t) (id: 12385)
        12385 {
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

        // Black d'hide chaps (t) (id: 12387)
        12387 {
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

        // Gilded scimitar (id: 12389)
        12389 {
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

        // Gilded boots (id: 12391)
        12391 {
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

        // Royal gown top (id: 12393)
        12393 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Royal gown bottom (id: 12395)
        12395 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dragon chainbody (g) (id: 12414)
        12414 {
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

        // Dragon platelegs (g) (id: 12415)
        12415 {
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

        // Dragon plateskirt (g) (id: 12416)
        12416 {
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

        // Dragon full helm (g) (id: 12417)
        12417 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(45)
                    DEF_SLASH(48)
                    DEF_CRUSH(41)
                    DEF_MAGIC(-1)
                    DEF_RANGE(46)
                }
            }
        }

        // Dragon sq shield (g) (id: 12418)
        12418 {
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

        // Light infinity hat (id: 12419)
        12419 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(6)
                    DEF_MAGIC(6)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Light infinity top (id: 12420)
        12420 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(22)
                    DEF_MAGIC(22)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Light infinity bottoms (id: 12421)
        12421 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(17)
                    DEF_MAGIC(17)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // 3rd age wand (id: 12422)
        12422 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    ATT_MAGIC(20)
                    DEF_MAGIC(20)
                }
            }
        }

        // 3rd age bow (id: 12424)
        12424 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 9
                    longAttackDistance = 11
                }
                bonuses {
                    ATT_RANGED(80)
                }
            }
        }

        // 3rd age longsword (id: 12426)
        12426 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_SLASH(72)
                    ATT_CRUSH(60)
                    DEF_SLASH(3)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(75)
                }
            }
        }

        // Amulet of fury (or) (id: 12436)
        12436 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(10)
                    ATT_CRUSH(10)
                    ATT_MAGIC(10)
                    ATT_RANGED(10)
                    DEF_STAB(15)
                    DEF_SLASH(15)
                    DEF_CRUSH(15)
                    DEF_MAGIC(15)
                    DEF_RANGE(15)
                    Bonuses.Bonus.STRENGTH(8)
                    PRAYER(5)
                }
            }
        }

        // 3rd age cloak (id: 12437)
        12437 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(9)
                    DEF_CRUSH(9)
                    DEF_MAGIC(9)
                    DEF_RANGE(9)
                    PRAYER(5)
                }
            }
        }

        // Royal sceptre (id: 12439)
        12439 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Musketeer tabard (id: 12441)
        12441 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Musketeer pants (id: 12443)
        12443 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Black skirt (g) (id: 12445)
        12445 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Black skirt (t) (id: 12447)
        12447 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Black wizard robe (g) (id: 12449)
        12449 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Black wizard robe (t) (id: 12451)
        12451 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Black wizard hat (g) (id: 12453)
        12453 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(2)
                    DEF_MAGIC(2)
                }
            }
        }

        // Black wizard hat (t) (id: 12455)
        12455 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(2)
                    DEF_MAGIC(2)
                }
            }
        }

        // Dark infinity hat (id: 12457)
        12457 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(6)
                    DEF_MAGIC(6)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Dark infinity top (id: 12458)
        12458 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(22)
                    DEF_MAGIC(22)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Dark infinity bottoms (id: 12459)
        12459 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(17)
                    DEF_MAGIC(17)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Ancient platebody (id: 12460)
        12460 {
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

        // Ancient platelegs (id: 12462)
        12462 {
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

        // Ancient plateskirt (id: 12464)
        12464 {
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

        // Ancient full helm (id: 12466)
        12466 {
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

        // Ancient kiteshield (id: 12468)
        12468 {
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

        // Armadyl platebody (id: 12470)
        12470 {
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

        // Armadyl platelegs (id: 12472)
        12472 {
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

        // Armadyl plateskirt (id: 12474)
        12474 {
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

        // Armadyl full helm (id: 12476)
        12476 {
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

        // Armadyl kiteshield (id: 12478)
        12478 {
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

        // Bandos platebody (id: 12480)
        12480 {
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

        // Bandos platelegs (id: 12482)
        12482 {
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

        // Bandos plateskirt (id: 12484)
        12484 {
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

        // Bandos full helm (id: 12486)
        12486 {
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

        // Bandos kiteshield (id: 12488)
        12488 {
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

        // Ancient bracers (id: 12490)
        12490 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(11)
                    DEF_STAB(6)
                    DEF_SLASH(5)
                    DEF_CRUSH(7)
                    DEF_MAGIC(8)
                    PRAYER(1)
                }
            }
        }

        // Ancient d'hide body (id: 12492)
        12492 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(30)
                    DEF_STAB(55)
                    DEF_SLASH(47)
                    DEF_CRUSH(60)
                    DEF_MAGIC(50)
                    DEF_RANGE(55)
                    PRAYER(1)
                }
            }
        }

        // Ancient chaps (id: 12494)
        12494 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(17)
                    DEF_STAB(31)
                    DEF_SLASH(25)
                    DEF_CRUSH(33)
                    DEF_MAGIC(28)
                    DEF_RANGE(31)
                    PRAYER(1)
                }
            }
        }

        // Ancient coif (id: 12496)
        12496 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-1)
                    ATT_RANGED(7)
                    DEF_STAB(4)
                    DEF_SLASH(7)
                    DEF_CRUSH(10)
                    DEF_MAGIC(4)
                    DEF_RANGE(8)
                    PRAYER(1)
                }
            }
        }

        // Bandos bracers (id: 12498)
        12498 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(11)
                    DEF_STAB(6)
                    DEF_SLASH(5)
                    DEF_CRUSH(7)
                    DEF_MAGIC(8)
                    PRAYER(1)
                }
            }
        }

        // Bandos d'hide body (id: 12500)
        12500 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(30)
                    DEF_STAB(55)
                    DEF_SLASH(47)
                    DEF_CRUSH(60)
                    DEF_MAGIC(50)
                    DEF_RANGE(55)
                    PRAYER(1)
                }
            }
        }

        // Bandos chaps (id: 12502)
        12502 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(17)
                    DEF_STAB(31)
                    DEF_SLASH(25)
                    DEF_CRUSH(33)
                    DEF_MAGIC(28)
                    DEF_RANGE(31)
                    PRAYER(1)
                }
            }
        }

        // Bandos coif (id: 12504)
        12504 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-1)
                    ATT_RANGED(7)
                    DEF_STAB(4)
                    DEF_SLASH(7)
                    DEF_CRUSH(10)
                    DEF_MAGIC(4)
                    DEF_RANGE(8)
                    PRAYER(1)
                }
            }
        }

        // Armadyl bracers (id: 12506)
        12506 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(11)
                    DEF_STAB(6)
                    DEF_SLASH(5)
                    DEF_CRUSH(7)
                    DEF_MAGIC(8)
                    PRAYER(1)
                }
            }
        }

        // Armadyl d'hide body (id: 12508)
        12508 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(30)
                    DEF_STAB(55)
                    DEF_SLASH(47)
                    DEF_CRUSH(60)
                    DEF_MAGIC(50)
                    DEF_RANGE(55)
                    PRAYER(1)
                }
            }
        }

        // Armadyl chaps (id: 12510)
        12510 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(17)
                    DEF_STAB(31)
                    DEF_SLASH(25)
                    DEF_CRUSH(33)
                    DEF_MAGIC(28)
                    DEF_RANGE(31)
                    PRAYER(1)
                }
            }
        }

        // Armadyl coif (id: 12512)
        12512 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-1)
                    ATT_RANGED(7)
                    DEF_STAB(4)
                    DEF_SLASH(7)
                    DEF_CRUSH(10)
                    DEF_MAGIC(4)
                    DEF_RANGE(8)
                    PRAYER(1)
                }
            }
        }

        // Explorer backpack (id: 12514)
        12514 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Broken pickaxe (id: 12594)
        12594 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Rangers' tunic (id: 12596)
        12596 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(15)
                    DEF_STAB(6)
                    DEF_SLASH(9)
                    DEF_CRUSH(12)
                    DEF_MAGIC(6)
                    DEF_RANGE(6)
                }
            }
        }

        // Holy sandals (id: 12598)
        12598 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    PRAYER(3)
                }
            }
        }

        // Ring of the gods (id: 12601)
        12601 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_MAGIC(1)
                    DEF_RANGE(1)
                    PRAYER(4)
                }
            }
        }

        // Tyrannical ring (id: 12603)
        12603 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_CRUSH(4)
                    DEF_CRUSH(4)
                }
            }
        }

        // Treasonous ring (id: 12605)
        12605 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_STAB(4)
                    DEF_STAB(4)
                }
            }
        }

        // Damaged book (id: 12607)
        12607 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    PRAYER(5)
                }
            }
        }

        // Book of war (id: 12608)
        12608 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    Bonuses.Bonus.STRENGTH(2)
                    PRAYER(5)
                }
            }
        }

        // Damaged book (id: 12609)
        12609 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    PRAYER(5)
                }
            }
        }

        // Book of law (id: 12610)
        12610 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_RANGED(10)
                    PRAYER(5)
                }
            }
        }

        // Damaged book (id: 12611)
        12611 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    PRAYER(5)
                }
            }
        }

        // Book of darkness (id: 12612)
        12612 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(10)
                    PRAYER(5)
                }
            }
        }

        // Saradomin halo (id: 12637)
        12637 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(11)
                    DEF_SLASH(12)
                    DEF_CRUSH(10)
                    DEF_MAGIC(11)
                    DEF_RANGE(-1)
                    PRAYER(3)
                }
            }
        }

        // Zamorak halo (id: 12638)
        12638 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(11)
                    DEF_SLASH(12)
                    DEF_CRUSH(10)
                    DEF_MAGIC(11)
                    DEF_RANGE(-1)
                    PRAYER(3)
                }
            }
        }

        // Guthix halo (id: 12639)
        12639 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(11)
                    DEF_SLASH(12)
                    DEF_CRUSH(10)
                    DEF_MAGIC(11)
                    DEF_RANGE(-1)
                    PRAYER(3)
                }
            }
        }

        // Iban's staff (u) (id: 12658)
        12658 {
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

        // Clan wars cape (id: 12659)
        12659 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12660)
        12660 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12661)
        12661 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12662)
        12662 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12663)
        12663 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12664)
        12664 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12665)
        12665 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12666)
        12666 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12667)
        12667 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12668)
        12668 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12669)
        12669 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12670)
        12670 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12671)
        12671 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12672)
        12672 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12673)
        12673 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12674)
        12674 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12675)
        12675 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12676)
        12676 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12677)
        12677 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12678)
        12678 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12679)
        12679 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12680)
        12680 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12681)
        12681 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12682)
        12682 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12683)
        12683 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12684)
        12684 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12685)
        12685 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12686)
        12686 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12687)
        12687 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12688)
        12688 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12689)
        12689 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 12690)
        12690 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Tyrannical ring (i) (id: 12691)
        12691 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_CRUSH(8)
                    DEF_CRUSH(8)
                }
            }
        }

        // Treasonous ring (i) (id: 12692)
        12692 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_STAB(8)
                    DEF_STAB(8)
                }
            }
        }

        // Goblin paint cannon (id: 12727)
        12727 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 3
                }
            }
        }

        // Dark bow (id: 12765)
        12765 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 9
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(95)
                }
            }
        }

        // Dark bow (id: 12766)
        12766 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 9
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(95)
                }
            }
        }

        // Dark bow (id: 12767)
        12767 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 9
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(95)
                }
            }
        }

        // Dark bow (id: 12768)
        12768 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 9
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(95)
                }
            }
        }

        // Volcanic abyssal whip (id: 12773)
        12773 {
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

        // Frozen abyssal whip (id: 12774)
        12774 {
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

        // Ring of wealth (i) (id: 12785)
        12785 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Magic shortbow (i) (id: 12788)
        12788 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_RANGED(75)
                }
            }
        }

        // Steam battlestaff (id: 12795)
        12795 {
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

        // Mystic steam staff (id: 12796)
        12796 {
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

        // Dragon pickaxe (id: 12797)
        12797 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(38)
                    ATT_SLASH(-2)
                    ATT_CRUSH(32)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(42)
                }
            }
        }

        // Malediction ward (id: 12806)
        12806 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-8)
                    ATT_SLASH(-8)
                    ATT_CRUSH(-8)
                    ATT_MAGIC(12)
                    ATT_RANGED(-12)
                    DEF_STAB(50)
                    DEF_SLASH(52)
                    DEF_CRUSH(48)
                    DEF_MAGIC(15)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Odium ward (id: 12807)
        12807 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-12)
                    ATT_SLASH(-12)
                    ATT_CRUSH(-12)
                    ATT_MAGIC(-8)
                    ATT_RANGED(12)
                    DEF_MAGIC(24)
                    DEF_RANGE(52)
                }
            }
        }

        // Sara's blessed sword (full) (id: 12808)
        12808 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_SLASH(100)
                    ATT_CRUSH(60)
                    Bonuses.Bonus.STRENGTH(88)
                    PRAYER(2)
                }
            }
        }

        // Saradomin's blessed sword (id: 12809)
        12809 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_SLASH(100)
                    ATT_CRUSH(60)
                    Bonuses.Bonus.STRENGTH(88)
                    PRAYER(2)
                }
            }
        }

        // Ironman helm (id: 12810)
        12810 {
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

        // Ironman platebody (id: 12811)
        12811 {
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

        // Ironman platelegs (id: 12812)
        12812 {
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

        // Ultimate ironman helm (id: 12813)
        12813 {
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

        // Ultimate ironman platebody (id: 12814)
        12814 {
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

        // Ultimate ironman platelegs (id: 12815)
        12815 {
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

        // Elysian spirit shield (id: 12817)
        12817 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    DEF_STAB(63)
                    DEF_SLASH(65)
                    DEF_CRUSH(75)
                    DEF_MAGIC(2)
                    DEF_RANGE(57)
                    PRAYER(3)
                }
            }
        }

        // Spectral spirit shield (id: 12821)
        12821 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    DEF_STAB(53)
                    DEF_SLASH(55)
                    DEF_CRUSH(73)
                    DEF_MAGIC(30)
                    DEF_RANGE(52)
                    PRAYER(3)
                }
            }
        }

        // Arcane spirit shield (id: 12825)
        12825 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(20)
                    DEF_STAB(53)
                    DEF_SLASH(55)
                    DEF_CRUSH(73)
                    DEF_MAGIC(2)
                    DEF_RANGE(52)
                    PRAYER(3)
                    MAGIC_DAMAGE(3)
                }
            }
        }

        // Spirit shield (id: 12829)
        12829 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    DEF_STAB(39)
                    DEF_SLASH(41)
                    DEF_CRUSH(50)
                    DEF_MAGIC(1)
                    DEF_RANGE(45)
                    PRAYER(1)
                }
            }
        }

        // Blessed spirit shield (id: 12831)
        12831 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    DEF_STAB(53)
                    DEF_SLASH(55)
                    DEF_CRUSH(73)
                    DEF_MAGIC(2)
                    DEF_RANGE(52)
                    PRAYER(3)
                }
            }
        }

        // Granite maul (id: 12848)
        12848 {
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

        // Amulet of the damned (full) (id: 12851)
        12851 {
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

        // Amulet of the damned (id: 12853)
        12853 {
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

        // Santa jacket (id: 12888)
        12888 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Santa pantaloons (id: 12889)
        12889 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Santa gloves (id: 12890)
        12890 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Santa boots (id: 12891)
        12891 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Antisanta jacket (id: 12893)
        12893 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Antisanta pantaloons (id: 12894)
        12894 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Antisanta gloves (id: 12895)
        12895 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Antisanta boots (id: 12896)
        12896 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Trident of the swamp (id: 12899)
        12899 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_MAGIC(25)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(15)
                }
            }
        }

        // Uncharged toxic trident (id: 12900)
        12900 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_MAGIC(25)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(15)
                }
            }
        }

        // Toxic staff (uncharged) (id: 12902)
        12902 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    ATT_STAB(55)
                    ATT_SLASH(70)
                    ATT_MAGIC(17)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(17)
                    Bonuses.Bonus.STRENGTH(72)
                    MAGIC_DAMAGE(15)
                }
            }
        }

        // Toxic staff of the dead (id: 12904)
        12904 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    ATT_STAB(55)
                    ATT_SLASH(70)
                    ATT_MAGIC(25)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(17)
                    Bonuses.Bonus.STRENGTH(72)
                    MAGIC_DAMAGE(15)
                }
            }
        }

        // Toxic blowpipe (empty) (id: 12924)
        12924 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 3
                    normalAttackDistance = 5
                    longAttackDistance = 7
                }
                bonuses {
                    ATT_RANGED(30)
                    RANGE_STRENGTH(20)
                }
            }
        }

        // Toxic blowpipe (id: 12926)
        12926 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 3
                    normalAttackDistance = 5
                    longAttackDistance = 7
                }
                bonuses {
                    ATT_RANGED(30)
                    RANGE_STRENGTH(20)
                }
            }
        }

        // Serpentine helm (uncharged) (id: 12929)
        12929 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-5)
                    ATT_RANGED(-5)
                }
            }
        }

        // Serpentine helm (id: 12931)
        12931 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-5)
                    ATT_RANGED(-5)
                    DEF_STAB(52)
                    DEF_SLASH(55)
                    DEF_CRUSH(58)
                    DEF_RANGE(50)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Dragon defender (id: 12954)
        12954 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(25)
                    ATT_SLASH(24)
                    ATT_CRUSH(23)
                    ATT_MAGIC(-3)
                    ATT_RANGED(-2)
                    DEF_STAB(25)
                    DEF_SLASH(24)
                    DEF_CRUSH(23)
                    DEF_MAGIC(-3)
                    DEF_RANGE(-2)
                    Bonuses.Bonus.STRENGTH(6)
                }
            }
        }

        // Cow top (id: 12956)
        12956 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Cow trousers (id: 12957)
        12957 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Cow gloves (id: 12958)
        12958 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Cow shoes (id: 12959)
        12959 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Quest point cape (t) (id: 13068)
        13068 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(9)
                    DEF_CRUSH(9)
                    DEF_MAGIC(9)
                    DEF_RANGE(9)
                    PRAYER(4)
                }
            }
        }

        // Achievement diary cape (t) (id: 13069)
        13069 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(9)
                    DEF_CRUSH(9)
                    DEF_MAGIC(9)
                    DEF_RANGE(9)
                    PRAYER(4)
                }
            }
        }

        // Elite void top (id: 13072)
        13072 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_STAB(45)
                    DEF_SLASH(45)
                    DEF_CRUSH(45)
                    DEF_MAGIC(45)
                    DEF_RANGE(45)
                    PRAYER(3)
                }
            }
        }

        // Elite void robe (id: 13073)
        13073 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_STAB(30)
                    DEF_SLASH(30)
                    DEF_CRUSH(30)
                    DEF_MAGIC(30)
                    DEF_RANGE(30)
                    PRAYER(3)
                }
            }
        }

        // Pharaoh's sceptre (id: 13074)
        13074 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Pharaoh's sceptre (id: 13075)
        13075 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Pharaoh's sceptre (id: 13076)
        13076 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Pharaoh's sceptre (id: 13077)
        13077 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Pharaoh's sceptre (id: 13078)
        13078 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Enchanted lyre(5) (id: 13079)
        13079 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // New crystal halberd full (i) (id: 13080)
        13080 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd full (i) (id: 13081)
        13081 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd 9/10 (i) (id: 13082)
        13082 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd 8/10 (i) (id: 13083)
        13083 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd 7/10 (i) (id: 13084)
        13084 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd 6/10 (i) (id: 13085)
        13085 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd 5/10 (i) (id: 13086)
        13086 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd 4/10 (i) (id: 13087)
        13087 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd 3/10 (i) (id: 13088)
        13088 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd 2/10 (i) (id: 13089)
        13089 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd 1/10 (i) (id: 13090)
        13090 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // New crystal halberd full (id: 13091)
        13091 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd full (id: 13092)
        13092 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd 9/10 (id: 13093)
        13093 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd 8/10 (id: 13094)
        13094 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd 7/10 (id: 13095)
        13095 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd 6/10 (id: 13096)
        13096 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd 5/10 (id: 13097)
        13097 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd 4/10 (id: 13098)
        13098 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd 3/10 (id: 13099)
        13099 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd 2/10 (id: 13100)
        13100 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal halberd 1/10 (id: 13101)
        13101 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Karamja gloves 4 (id: 13103)
        13103 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
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
                }
            }
        }

        // Varrock armour 1 (id: 13104)
        13104 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-10)
                    DEF_STAB(32)
                    DEF_SLASH(31)
                    DEF_CRUSH(24)
                    DEF_MAGIC(-6)
                    DEF_RANGE(31)
                }
            }
        }

        // Varrock armour 2 (id: 13105)
        13105 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-10)
                    DEF_STAB(41)
                    DEF_SLASH(40)
                    DEF_CRUSH(30)
                    DEF_MAGIC(-6)
                    DEF_RANGE(40)
                }
            }
        }

        // Varrock armour 3 (id: 13106)
        13106 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-10)
                    DEF_STAB(46)
                    DEF_SLASH(44)
                    DEF_CRUSH(38)
                    DEF_MAGIC(-6)
                    DEF_RANGE(44)
                }
            }
        }

        // Varrock armour 4 (id: 13107)
        13107 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-10)
                    DEF_STAB(65)
                    DEF_SLASH(63)
                    DEF_CRUSH(55)
                    DEF_MAGIC(-6)
                    DEF_RANGE(63)
                }
            }
        }

        // Wilderness sword 1 (id: 13108)
        13108 {
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

        // Wilderness sword 2 (id: 13109)
        13109 {
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

        // Wilderness sword 3 (id: 13110)
        13110 {
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

        // Wilderness sword 4 (id: 13111)
        13111 {
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

        // Morytania legs 1 (id: 13112)
        13112 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-7)
                    DEF_STAB(11)
                    DEF_SLASH(10)
                    DEF_CRUSH(10)
                    DEF_MAGIC(-4)
                    DEF_RANGE(10)
                }
            }
        }

        // Morytania legs 2 (id: 13113)
        13113 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-7)
                    DEF_STAB(17)
                    DEF_SLASH(16)
                    DEF_CRUSH(15)
                    DEF_MAGIC(-4)
                    DEF_RANGE(16)
                }
            }
        }

        // Morytania legs 3 (id: 13114)
        13114 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-7)
                    DEF_STAB(24)
                    DEF_SLASH(22)
                    DEF_CRUSH(20)
                    DEF_MAGIC(-4)
                    DEF_RANGE(22)
                }
            }
        }

        // Morytania legs 4 (id: 13115)
        13115 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-7)
                    DEF_STAB(33)
                    DEF_SLASH(31)
                    DEF_CRUSH(29)
                    DEF_MAGIC(-4)
                    DEF_RANGE(31)
                }
            }
        }

        // Falador shield 1 (id: 13117)
        13117 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(8)
                    DEF_SLASH(10)
                    DEF_CRUSH(9)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                    PRAYER(1)
                }
            }
        }

        // Falador shield 2 (id: 13118)
        13118 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(13)
                    DEF_SLASH(15)
                    DEF_CRUSH(14)
                    DEF_MAGIC(-1)
                    DEF_RANGE(14)
                    PRAYER(3)
                }
            }
        }

        // Falador shield 3 (id: 13119)
        13119 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(18)
                    DEF_SLASH(22)
                    DEF_CRUSH(20)
                    DEF_MAGIC(-1)
                    DEF_RANGE(20)
                    PRAYER(4)
                }
            }
        }

        // Falador shield 4 (id: 13120)
        13120 {
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
                    PRAYER(5)
                }
            }
        }

        // Ardougne cloak 1 (id: 13121)
        13121 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(2)
                    ATT_MAGIC(2)
                    DEF_STAB(2)
                    DEF_MAGIC(2)
                    PRAYER(2)
                }
            }
        }

        // Ardougne cloak 2 (id: 13122)
        13122 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_MAGIC(4)
                    DEF_STAB(4)
                    DEF_MAGIC(4)
                    PRAYER(4)
                }
            }
        }

        // Ardougne cloak 3 (id: 13123)
        13123 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(5)
                    ATT_MAGIC(5)
                    DEF_STAB(5)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Ardougne cloak 4 (id: 13124)
        13124 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(6)
                    ATT_MAGIC(6)
                    DEF_STAB(6)
                    DEF_MAGIC(6)
                    PRAYER(6)
                }
            }
        }

        // Explorer's ring 1 (id: 13125)
        13125 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    PRAYER(1)
                }
            }
        }

        // Explorer's ring 2 (id: 13126)
        13126 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    PRAYER(1)
                }
            }
        }

        // Explorer's ring 3 (id: 13127)
        13127 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    PRAYER(1)
                }
            }
        }

        // Explorer's ring 4 (id: 13128)
        13128 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    PRAYER(1)
                }
            }
        }

        // Fremennik sea boots 1 (id: 13129)
        13129 {
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

        // Fremennik sea boots 2 (id: 13130)
        13130 {
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

        // Fremennik sea boots 3 (id: 13131)
        13131 {
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

        // Fremennik sea boots 4 (id: 13132)
        13132 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(1)
                    ATT_RANGED(1)
                    DEF_STAB(10)
                    DEF_SLASH(11)
                    DEF_CRUSH(12)
                    Bonuses.Bonus.STRENGTH(1)
                }
            }
        }

        // Desert amulet 1 (id: 13133)
        13133 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Desert amulet 2 (id: 13134)
        13134 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Desert amulet 3 (id: 13135)
        13135 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Desert amulet 4 (id: 13136)
        13136 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Kandarin headgear 1 (id: 13137)
        13137 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(4)
                    DEF_SLASH(5)
                    DEF_CRUSH(3)
                    DEF_MAGIC(-1)
                    DEF_RANGE(4)
                }
            }
        }

        // Kandarin headgear 2 (id: 13138)
        13138 {
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

        // Kandarin headgear 3 (id: 13139)
        13139 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(9)
                    DEF_SLASH(10)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                }
            }
        }

        // Kandarin headgear 4 (id: 13140)
        13140 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(10)
                    DEF_SLASH(11)
                    DEF_CRUSH(9)
                    DEF_MAGIC(-1)
                    DEF_RANGE(10)
                }
            }
        }

        // Western banner 1 (id: 13141)
        13141 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
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

        // Western banner 2 (id: 13142)
        13142 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(15)
                    ATT_SLASH(15)
                    ATT_CRUSH(15)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(16)
                }
            }
        }

        // Western banner 3 (id: 13143)
        13143 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
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

        // Western banner 4 (id: 13144)
        13144 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
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

        // Bunny feet (id: 13182)
        13182 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Oddskull (id: 13195)
        13195 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Tanzanite helm (uncharged) (id: 13196)
        13196 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-5)
                    ATT_RANGED(-5)
                }
            }
        }

        // Tanzanite helm (id: 13197)
        13197 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-5)
                    ATT_RANGED(-5)
                    DEF_STAB(52)
                    DEF_SLASH(55)
                    DEF_CRUSH(58)
                    DEF_RANGE(50)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Magma helm (uncharged) (id: 13198)
        13198 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-5)
                    ATT_RANGED(-5)
                }
            }
        }

        // Magma helm (id: 13199)
        13199 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-5)
                    ATT_RANGED(-5)
                    DEF_STAB(52)
                    DEF_SLASH(55)
                    DEF_CRUSH(58)
                    DEF_RANGE(50)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Ring of the gods (i) (id: 13202)
        13202 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_MAGIC(1)
                    DEF_RANGE(1)
                    PRAYER(8)
                }
            }
        }

        // Music cape (id: 13221)
        13221 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(9)
                    DEF_CRUSH(9)
                    DEF_MAGIC(9)
                    DEF_RANGE(9)
                }
            }
        }

        // Music cape(t) (id: 13222)
        13222 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(9)
                    DEF_CRUSH(9)
                    DEF_MAGIC(9)
                    DEF_RANGE(9)
                    PRAYER(4)
                }
            }
        }

        // Eternal boots (id: 13235)
        13235 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(8)
                    DEF_STAB(5)
                    DEF_SLASH(5)
                    DEF_CRUSH(5)
                    DEF_MAGIC(8)
                    DEF_RANGE(5)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Pegasian boots (id: 13237)
        13237 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-12)
                    ATT_RANGED(12)
                    DEF_STAB(5)
                    DEF_SLASH(5)
                    DEF_CRUSH(5)
                    DEF_MAGIC(5)
                    DEF_RANGE(5)
                }
            }
        }

        // Primordial boots (id: 13239)
        13239 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_STAB(2)
                    ATT_SLASH(2)
                    ATT_CRUSH(2)
                    ATT_MAGIC(-4)
                    ATT_RANGED(-1)
                    DEF_STAB(22)
                    DEF_SLASH(22)
                    DEF_CRUSH(22)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Infernal axe (id: 13241)
        13241 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(38)
                    ATT_CRUSH(32)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(42)
                }
            }
        }

        // Infernal axe (uncharged) (id: 13242)
        13242 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(38)
                    ATT_CRUSH(32)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(42)
                }
            }
        }

        // Infernal pickaxe (id: 13243)
        13243 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(38)
                    ATT_SLASH(-2)
                    ATT_CRUSH(32)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(42)
                }
            }
        }

        // Infernal pickaxe (uncharged) (id: 13244)
        13244 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(38)
                    ATT_SLASH(-2)
                    ATT_CRUSH(32)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(42)
                }
            }
        }

        // Angler top (id: 13259)
        13259 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Angler waders (id: 13260)
        13260 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Angler boots (id: 13261)
        13261 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Abyssal bludgeon (id: 13263)
        13263 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_CRUSH(102)
                    Bonuses.Bonus.STRENGTH(85)
                }
            }
        }

        // Abyssal dagger (id: 13265)
        13265 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(75)
                    ATT_SLASH(40)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(75)
                }
            }
        }

        // Abyssal dagger (p) (id: 13267)
        13267 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(75)
                    ATT_SLASH(40)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(75)
                }
            }
        }

        // Abyssal dagger (p+) (id: 13269)
        13269 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(75)
                    ATT_SLASH(40)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(75)
                }
            }
        }

        // Abyssal dagger (p++) (id: 13271)
        13271 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(75)
                    ATT_SLASH(40)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(75)
                }
            }
        }

        // Max cape (id: 13280)
        13280 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(9)
                    DEF_CRUSH(9)
                    DEF_MAGIC(9)
                    DEF_RANGE(9)
                    PRAYER(4)
                }
            }
        }

        // Gravedigger top (id: 13284)
        13284 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Gravedigger leggings (id: 13285)
        13285 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Gravedigger boots (id: 13286)
        13286 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Gravedigger gloves (id: 13287)
        13287 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Anti-panties (id: 13288)
        13288 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Deadman's chest (id: 13317)
        13317 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_STAB(21)
                    DEF_SLASH(20)
                    DEF_CRUSH(12)
                    DEF_MAGIC(3)
                    DEF_RANGE(20)
                }
            }
        }

        // Deadman's legs (id: 13318)
        13318 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_STAB(11)
                    DEF_SLASH(10)
                    DEF_CRUSH(10)
                    DEF_MAGIC(2)
                    DEF_RANGE(10)
                }
            }
        }

        // Deadman's cape (id: 13319)
        13319 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Green banner (id: 13328)
        13328 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Fire max cape (id: 13329)
        13329 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(1)
                    ATT_SLASH(1)
                    ATT_CRUSH(1)
                    ATT_MAGIC(1)
                    ATT_RANGED(1)
                    DEF_STAB(11)
                    DEF_SLASH(11)
                    DEF_CRUSH(11)
                    DEF_MAGIC(11)
                    DEF_RANGE(11)
                    Bonuses.Bonus.STRENGTH(4)
                    PRAYER(2)
                }
            }
        }

        // Saradomin max cape (id: 13331)
        13331 {
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

        // Zamorak max cape (id: 13333)
        13333 {
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

        // Guthix max cape (id: 13335)
        13335 {
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

        // Accumulator max cape (id: 13337)
        13337 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_RANGED(4)
                    DEF_SLASH(1)
                    DEF_MAGIC(4)
                }
            }
        }

        // Agility cape (id: 13340)
        13340 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(9)
                    DEF_CRUSH(9)
                    DEF_MAGIC(9)
                    DEF_RANGE(9)
                }
            }
        }

        // Agility cape(t) (id: 13341)
        13341 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(9)
                    DEF_CRUSH(9)
                    DEF_MAGIC(9)
                    DEF_RANGE(9)
                    PRAYER(4)
                }
            }
        }

        // Max cape (id: 13342)
        13342 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(9)
                    DEF_CRUSH(9)
                    DEF_MAGIC(9)
                    DEF_RANGE(9)
                    PRAYER(4)
                }
            }
        }

        // Shayzien gloves (1) (id: 13357)
        13357 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(-1)
                    DEF_CRUSH(1)
                    DEF_MAGIC(-1)
                }
            }
        }

        // Shayzien boots (1) (id: 13358)
        13358 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-2)
                    ATT_RANGED(-1)
                    DEF_STAB(1)
                    DEF_SLASH(2)
                    DEF_CRUSH(3)
                }
            }
        }

        // Shayzien helm (1) (id: 13359)
        13359 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-5)
                    ATT_RANGED(-2)
                    DEF_STAB(3)
                    DEF_SLASH(5)
                    DEF_CRUSH(4)
                    DEF_MAGIC(-1)
                    DEF_RANGE(5)
                }
            }
        }

        // Shayzien greaves (1) (id: 13360)
        13360 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(-2)
                    DEF_STAB(10)
                    DEF_SLASH(9)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-2)
                    DEF_RANGE(10)
                }
            }
        }

        // Shayzien platebody (1) (id: 13361)
        13361 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-5)
                    DEF_STAB(16)
                    DEF_SLASH(20)
                    DEF_CRUSH(22)
                    DEF_MAGIC(-2)
                    DEF_RANGE(16)
                }
            }
        }

        // Shayzien gloves (2) (id: 13362)
        13362 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_CRUSH(1)
                    ATT_MAGIC(-1)
                    DEF_CRUSH(1)
                    DEF_MAGIC(-1)
                    Bonuses.Bonus.STRENGTH(1)
                }
            }
        }

        // Shayzien boots (2) (id: 13363)
        13363 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-2)
                    ATT_RANGED(-1)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(4)
                }
            }
        }

        // Shayzien helm (2) (id: 13364)
        13364 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-5)
                    ATT_RANGED(-2)
                    DEF_STAB(5)
                    DEF_SLASH(8)
                    DEF_CRUSH(6)
                    DEF_MAGIC(-1)
                    DEF_RANGE(7)
                }
            }
        }

        // Shayzien greaves (2) (id: 13365)
        13365 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-14)
                    ATT_RANGED(-3)
                    DEF_STAB(14)
                    DEF_SLASH(13)
                    DEF_CRUSH(12)
                    DEF_MAGIC(-3)
                    DEF_RANGE(14)
                }
            }
        }

        // Shayzien platebody (2) (id: 13366)
        13366 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-7)
                    DEF_STAB(20)
                    DEF_SLASH(25)
                    DEF_CRUSH(30)
                    DEF_MAGIC(-3)
                    DEF_RANGE(20)
                }
            }
        }

        // Shayzien gloves (3) (id: 13367)
        13367 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_CRUSH(2)
                    ATT_MAGIC(-1)
                    DEF_CRUSH(1)
                    DEF_MAGIC(-1)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Shayzien boots (3) (id: 13368)
        13368 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-2)
                    ATT_RANGED(-1)
                    DEF_STAB(4)
                    DEF_SLASH(5)
                    DEF_CRUSH(6)
                }
            }
        }

        // Shayzien helm (3) (id: 13369)
        13369 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(7)
                    DEF_SLASH(10)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-2)
                    DEF_RANGE(9)
                }
            }
        }

        // Shayzien greaves (3) (id: 13370)
        13370 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-17)
                    ATT_RANGED(-4)
                    DEF_STAB(17)
                    DEF_SLASH(16)
                    DEF_CRUSH(15)
                    DEF_MAGIC(-3)
                    DEF_RANGE(17)
                }
            }
        }

        // Shayzien platebody (3) (id: 13371)
        13371 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-8)
                    DEF_STAB(25)
                    DEF_SLASH(32)
                    DEF_CRUSH(35)
                    DEF_MAGIC(-3)
                    DEF_RANGE(22)
                }
            }
        }

        // Shayzien gloves (4) (id: 13372)
        13372 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_CRUSH(2)
                    ATT_MAGIC(-1)
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                    DEF_MAGIC(-1)
                    DEF_RANGE(1)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Shayzien boots (4) (id: 13373)
        13373 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-2)
                    ATT_RANGED(-1)
                    DEF_STAB(5)
                    DEF_SLASH(6)
                    DEF_CRUSH(7)
                }
            }
        }

        // Shayzien helm (4) (id: 13374)
        13374 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(8)
                    DEF_SLASH(12)
                    DEF_CRUSH(10)
                    DEF_MAGIC(-2)
                    DEF_RANGE(11)
                }
            }
        }

        // Shayzien greaves (4) (id: 13375)
        13375 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-20)
                    ATT_RANGED(-5)
                    DEF_STAB(20)
                    DEF_SLASH(19)
                    DEF_CRUSH(18)
                    DEF_MAGIC(-4)
                    DEF_RANGE(20)
                }
            }
        }

        // Shayzien platebody (4) (id: 13376)
        13376 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-9)
                    DEF_STAB(28)
                    DEF_SLASH(35)
                    DEF_CRUSH(37)
                    DEF_MAGIC(-4)
                    DEF_RANGE(25)
                }
            }
        }

        // Shayzien gloves (5) (id: 13377)
        13377 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_CRUSH(2)
                    ATT_MAGIC(-1)
                    ATT_RANGED(6)
                    DEF_SLASH(2)
                    DEF_CRUSH(3)
                    DEF_MAGIC(-1)
                    DEF_RANGE(2)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Shayzien boots (5) (id: 13378)
        13378 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-2)
                    ATT_RANGED(4)
                    DEF_STAB(5)
                    DEF_SLASH(7)
                    DEF_CRUSH(8)
                }
            }
        }

        // Shayzien helm (5) (id: 13379)
        13379 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(4)
                    DEF_STAB(10)
                    DEF_SLASH(14)
                    DEF_CRUSH(12)
                    DEF_MAGIC(-2)
                    DEF_RANGE(13)
                }
            }
        }

        // Shayzien greaves (5) (id: 13380)
        13380 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-20)
                    ATT_RANGED(6)
                    DEF_STAB(23)
                    DEF_SLASH(22)
                    DEF_CRUSH(21)
                    DEF_MAGIC(-4)
                    DEF_RANGE(23)
                }
            }
        }

        // Shayzien body (5) (id: 13381)
        13381 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(10)
                    DEF_STAB(20)
                    DEF_SLASH(24)
                    DEF_CRUSH(28)
                    DEF_MAGIC(-4)
                    DEF_RANGE(27)
                }
            }
        }

        // Xerician hat (id: 13385)
        13385 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Xerician top (id: 13387)
        13387 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(6)
                    DEF_MAGIC(10)
                }
            }
        }

        // Xerician robe (id: 13389)
        13389 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(7)
                }
            }
        }

        // Xeric's talisman (inert) (id: 13392)
        13392 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_MAGIC(2)
                }
            }
        }

        // Xeric's talisman (id: 13393)
        13393 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(1)
                }
            }
        }

        // Dragon warhammer (id: 13576)
        13576 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(95)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(85)
                }
            }
        }

        // Graceful cape (id: 13581)
        13581 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful cape (id: 13582)
        13582 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful top (id: 13583)
        13583 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful top (id: 13584)
        13584 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful legs (id: 13585)
        13585 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful legs (id: 13586)
        13586 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful gloves (id: 13587)
        13587 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful gloves (id: 13588)
        13588 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful boots (id: 13589)
        13589 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Graceful boots (id: 13590)
        13590 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Graceful cape (id: 13593)
        13593 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful cape (id: 13594)
        13594 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful top (id: 13595)
        13595 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful top (id: 13596)
        13596 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful legs (id: 13597)
        13597 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful legs (id: 13598)
        13598 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful gloves (id: 13599)
        13599 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful gloves (id: 13600)
        13600 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful boots (id: 13601)
        13601 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Graceful boots (id: 13602)
        13602 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Graceful cape (id: 13605)
        13605 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful cape (id: 13606)
        13606 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful top (id: 13607)
        13607 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful top (id: 13608)
        13608 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful legs (id: 13609)
        13609 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful legs (id: 13610)
        13610 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful gloves (id: 13611)
        13611 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful gloves (id: 13612)
        13612 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful boots (id: 13613)
        13613 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Graceful boots (id: 13614)
        13614 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Graceful cape (id: 13617)
        13617 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful cape (id: 13618)
        13618 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful top (id: 13619)
        13619 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful top (id: 13620)
        13620 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful legs (id: 13621)
        13621 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful legs (id: 13622)
        13622 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful gloves (id: 13623)
        13623 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful gloves (id: 13624)
        13624 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful boots (id: 13625)
        13625 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Graceful boots (id: 13626)
        13626 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Graceful cape (id: 13629)
        13629 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful cape (id: 13630)
        13630 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful top (id: 13631)
        13631 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful top (id: 13632)
        13632 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful legs (id: 13633)
        13633 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful legs (id: 13634)
        13634 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful gloves (id: 13635)
        13635 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful gloves (id: 13636)
        13636 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful boots (id: 13637)
        13637 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Graceful boots (id: 13638)
        13638 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Farmer's boro trousers (id: 13640)
        13640 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Farmer's boro trousers (id: 13641)
        13641 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Farmer's jacket (id: 13642)
        13642 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Farmer's shirt (id: 13643)
        13643 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Farmer's boots (id: 13644)
        13644 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Farmer's boots (id: 13645)
        13645 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Dragon claws (id: 13652)
        13652 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(41)
                    ATT_SLASH(57)
                    ATT_CRUSH(-4)
                    DEF_STAB(13)
                    DEF_SLASH(26)
                    DEF_CRUSH(7)
                    Bonuses.Bonus.STRENGTH(56)
                }
            }
        }

        // Chronicle (id: 13660)
        13660 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Bunny top (id: 13663)
        13663 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Bunny legs (id: 13664)
        13664 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Bunny paws (id: 13665)
        13665 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful cape (id: 13669)
        13669 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful cape (id: 13670)
        13670 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful top (id: 13671)
        13671 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful top (id: 13672)
        13672 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful legs (id: 13673)
        13673 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful legs (id: 13674)
        13674 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful gloves (id: 13675)
        13675 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful gloves (id: 13676)
        13676 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful boots (id: 13677)
        13677 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Graceful boots (id: 13678)
        13678 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Cabbage cape (id: 13679)
        13679 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Cruciferous codex (id: 13681)
        13681 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Pharaoh's sceptre (id: 16176)
        16176 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // New crystal bow (id: 16888)
        16888 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // New crystal bow (i) (id: 16889)
        16889 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // New crystal shield (id: 16890)
        16890 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // New crystal shield (i) (id: 16891)
        16891 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // New crystal halberd full (i) (id: 16892)
        16892 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // New crystal halberd full (id: 16893)
        16893 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Achievement diary cape (id: 19476)
        19476 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(9)
                    DEF_CRUSH(9)
                    DEF_MAGIC(9)
                    DEF_RANGE(9)
                    PRAYER(4)
                }
            }
        }

        // Light ballista (id: 19478)
        19478 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                    normalAttackDistance = 9
                    longAttackDistance = 11
                }
                bonuses {
                    ATT_RANGED(110)
                }
            }
        }

        // Heavy ballista (id: 19481)
        19481 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                    normalAttackDistance = 9
                    longAttackDistance = 11
                }
                bonuses {
                    ATT_RANGED(125)
                }
            }
        }

        // Dragon javelin (id: 19484)
        19484 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(150)
                }
            }
        }

        // Dragon javelin(p) (id: 19486)
        19486 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(150)
                }
            }
        }

        // Dragon javelin(p+) (id: 19488)
        19488 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(150)
                }
            }
        }

        // Dragon javelin(p++) (id: 19490)
        19490 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(150)
                }
            }
        }

        // Zenyte bracelet (id: 19492)
        19492 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Kruk monkey greegree (id: 19525)
        19525 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Zenyte bracelet (id: 19532)
        19532 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Zenyte necklace (id: 19535)
        19535 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Zenyte ring (id: 19538)
        19538 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Zenyte amulet (id: 19541)
        19541 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Tormented bracelet (id: 19544)
        19544 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(10)
                    PRAYER(2)
                    MAGIC_DAMAGE(5)
                }
            }
        }

        // Necklace of anguish (id: 19547)
        19547 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_RANGED(15)
                    PRAYER(2)
                }
            }
        }

        // Ring of suffering (id: 19550)
        19550 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(10)
                    DEF_MAGIC(10)
                    DEF_RANGE(10)
                    PRAYER(2)
                }
            }
        }

        // Amulet of torture (id: 19553)
        19553 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(15)
                    ATT_SLASH(15)
                    ATT_CRUSH(15)
                    Bonuses.Bonus.STRENGTH(10)
                    PRAYER(2)
                }
            }
        }

        // Monkey (id: 19556)
        19556 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Black slayer helmet (id: 19639)
        19639 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(30)
                    DEF_SLASH(32)
                    DEF_CRUSH(27)
                    DEF_MAGIC(-1)
                    DEF_RANGE(30)
                }
            }
        }

        // Black slayer helmet (i) (id: 19641)
        19641 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(3)
                    DEF_STAB(30)
                    DEF_SLASH(32)
                    DEF_CRUSH(27)
                    DEF_MAGIC(10)
                    DEF_RANGE(30)
                }
            }
        }

        // Green slayer helmet (id: 19643)
        19643 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(30)
                    DEF_SLASH(32)
                    DEF_CRUSH(27)
                    DEF_MAGIC(-1)
                    DEF_RANGE(30)
                }
            }
        }

        // Green slayer helmet (i) (id: 19645)
        19645 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(3)
                    DEF_STAB(30)
                    DEF_SLASH(32)
                    DEF_CRUSH(27)
                    DEF_MAGIC(10)
                    DEF_RANGE(30)
                }
            }
        }

        // Red slayer helmet (id: 19647)
        19647 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(30)
                    DEF_SLASH(32)
                    DEF_CRUSH(27)
                    DEF_MAGIC(-1)
                    DEF_RANGE(30)
                }
            }
        }

        // Red slayer helmet (i) (id: 19649)
        19649 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(3)
                    DEF_STAB(30)
                    DEF_SLASH(32)
                    DEF_CRUSH(27)
                    DEF_MAGIC(10)
                    DEF_RANGE(30)
                }
            }
        }

        // Arclight (id: 19675)
        19675 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(38)
                    DEF_SLASH(3)
                    DEF_CRUSH(2)
                    DEF_MAGIC(2)
                    Bonuses.Bonus.STRENGTH(8)
                }
            }
        }

        // Helm of raedwald (id: 19687)
        19687 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(6)
                    DEF_SLASH(7)
                    DEF_CRUSH(5)
                    DEF_MAGIC(-1)
                    DEF_RANGE(6)
                }
            }
        }

        // Clue hunter garb (id: 19689)
        19689 {
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

        // Clue hunter gloves (id: 19691)
        19691 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                }
            }
        }

        // Clue hunter trousers (id: 19693)
        19693 {
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

        // Clue hunter boots (id: 19695)
        19695 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Clue hunter cloak (id: 19697)
        19697 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Amulet of eternal glory (id: 19707)
        19707 {
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

        // Ring of suffering (i) (id: 19710)
        19710 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    DEF_STAB(20)
                    DEF_SLASH(20)
                    DEF_CRUSH(20)
                    DEF_MAGIC(20)
                    DEF_RANGE(20)
                    PRAYER(4)
                }
            }
        }

        // Occult necklace (or) (id: 19720)
        19720 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_MAGIC(12)
                    PRAYER(2)
                    MAGIC_DAMAGE(5)
                }
            }
        }

        // Dragon defender (t) (id: 19722)
        19722 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(25)
                    ATT_SLASH(24)
                    ATT_CRUSH(23)
                    ATT_MAGIC(-3)
                    ATT_RANGED(-2)
                    DEF_STAB(25)
                    DEF_SLASH(24)
                    DEF_CRUSH(23)
                    DEF_MAGIC(-3)
                    DEF_RANGE(-2)
                    Bonuses.Bonus.STRENGTH(6)
                }
            }
        }

        // Zombie head (id: 19912)
        19912 {
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

        // Nunchaku (id: 19918)
        19918 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(11)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(14)
                }
            }
        }

        // Ancient d'hide boots (id: 19921)
        19921 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(7)
                    DEF_STAB(4)
                    DEF_SLASH(4)
                    DEF_CRUSH(4)
                    DEF_MAGIC(4)
                    DEF_RANGE(4)
                    PRAYER(1)
                }
            }
        }

        // Bandos d'hide boots (id: 19924)
        19924 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(7)
                    DEF_STAB(4)
                    DEF_SLASH(4)
                    DEF_CRUSH(4)
                    DEF_MAGIC(4)
                    DEF_RANGE(4)
                    PRAYER(1)
                }
            }
        }

        // Guthix d'hide boots (id: 19927)
        19927 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(7)
                    DEF_STAB(4)
                    DEF_SLASH(4)
                    DEF_CRUSH(4)
                    DEF_MAGIC(4)
                    DEF_RANGE(4)
                    PRAYER(1)
                }
            }
        }

        // Armadyl d'hide boots (id: 19930)
        19930 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(7)
                    DEF_STAB(4)
                    DEF_SLASH(4)
                    DEF_CRUSH(4)
                    DEF_MAGIC(4)
                    DEF_RANGE(4)
                    PRAYER(1)
                }
            }
        }

        // Saradomin d'hide boots (id: 19933)
        19933 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(7)
                    DEF_STAB(4)
                    DEF_SLASH(4)
                    DEF_CRUSH(4)
                    DEF_MAGIC(4)
                    DEF_RANGE(4)
                    PRAYER(1)
                }
            }
        }

        // Zamorak d'hide boots (id: 19936)
        19936 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(7)
                    DEF_STAB(4)
                    DEF_SLASH(4)
                    DEF_CRUSH(4)
                    DEF_MAGIC(4)
                    DEF_RANGE(4)
                    PRAYER(1)
                }
            }
        }

        // Heavy casket (id: 19941)
        19941 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(11)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(9)
                }
            }
        }

        // Arceuus scarf (id: 19943)
        19943 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Hosidius scarf (id: 19946)
        19946 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Lovakengj scarf (id: 19949)
        19949 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Piscarilius scarf (id: 19952)
        19952 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Shayzien scarf (id: 19955)
        19955 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Dark tuxedo jacket (id: 19958)
        19958 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dark tuxedo cuffs (id: 19961)
        19961 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Dark trousers (id: 19964)
        19964 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dark tuxedo shoes (id: 19967)
        19967 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Dark bow tie (id: 19970)
        19970 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Light tuxedo jacket (id: 19973)
        19973 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Light tuxedo cuffs (id: 19976)
        19976 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Light trousers (id: 19979)
        19979 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Light tuxedo shoes (id: 19982)
        19982 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Light bow tie (id: 19985)
        19985 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Blacksmith's helm (id: 19988)
        19988 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(6)
                    DEF_SLASH(7)
                    DEF_CRUSH(5)
                    DEF_MAGIC(-1)
                    DEF_RANGE(6)
                }
            }
        }

        // Ranger gloves (id: 19994)
        19994 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(11)
                    DEF_STAB(1)
                    DEF_SLASH(2)
                    DEF_CRUSH(1)
                    DEF_MAGIC(2)
                }
            }
        }

        // Holy wraps (id: 19997)
        19997 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    PRAYER(3)
                }
            }
        }

        // Dragon scimitar (or) (id: 20000)
        20000 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(67)
                    ATT_CRUSH(-2)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(66)
                }
            }
        }

        // Ring of nature (id: 20005)
        20005 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // 3rd age axe (id: 20011)
        20011 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(38)
                    ATT_CRUSH(32)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(42)
                }
            }
        }

        // 3rd age pickaxe (id: 20014)
        20014 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(38)
                    ATT_SLASH(-2)
                    ATT_CRUSH(32)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(42)
                }
            }
        }

        // Ring of coins (id: 20017)
        20017 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Samurai kasa (id: 20035)
        20035 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(16)
                    DEF_SLASH(17)
                    DEF_CRUSH(15)
                    DEF_MAGIC(4)
                    DEF_RANGE(16)
                }
            }
        }

        // Samurai shirt (id: 20038)
        20038 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_STAB(69)
                    DEF_SLASH(67)
                    DEF_CRUSH(59)
                    DEF_MAGIC(10)
                    DEF_RANGE(67)
                }
            }
        }

        // Samurai gloves (id: 20041)
        20041 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(2)
                    ATT_SLASH(2)
                    ATT_CRUSH(2)
                    ATT_MAGIC(2)
                    ATT_RANGED(2)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(3)
                    DEF_RANGE(3)
                }
            }
        }

        // Samurai greaves (id: 20044)
        20044 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_STAB(42)
                    DEF_SLASH(40)
                    DEF_CRUSH(38)
                    DEF_MAGIC(3)
                    DEF_RANGE(40)
                }
            }
        }

        // Samurai boots (id: 20047)
        20047 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_STAB(11)
                    DEF_SLASH(12)
                    DEF_CRUSH(13)
                    DEF_MAGIC(1)
                }
            }
        }

        // Obsidian cape (r) (id: 20050)
        20050 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_STAB(9)
                    DEF_SLASH(9)
                    DEF_CRUSH(9)
                    DEF_MAGIC(9)
                    DEF_RANGE(9)
                }
            }
        }

        // Ale of the gods (id: 20056)
        20056 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Mummy's body (id: 20083)
        20083 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Mummy's hands (id: 20086)
        20086 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Mummy's legs (id: 20089)
        20089 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Mummy's feet (id: 20092)
        20092 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Ankou top (id: 20098)
        20098 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Ankou gloves (id: 20101)
        20101 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Ankou's leggings (id: 20104)
        20104 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Ankou socks (id: 20107)
        20107 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Hood of darkness (id: 20128)
        20128 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                }
            }
        }

        // Robe top of darkness (id: 20131)
        20131 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(20)
                    DEF_MAGIC(20)
                }
            }
        }

        // Gloves of darkness (id: 20134)
        20134 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Robe bottom of darkness (id: 20137)
        20137 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_MAGIC(15)
                }
            }
        }

        // Boots of darkness (id: 20140)
        20140 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Gilded med helm (id: 20146)
        20146 {
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

        // Gilded chainbody (id: 20149)
        20149 {
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

        // Gilded sq shield (id: 20152)
        20152 {
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

        // Gilded 2h sword (id: 20155)
        20155 {
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

        // Gilded spear (id: 20158)
        20158 {
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

        // Gilded hasta (id: 20161)
        20161 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(36)
                    ATT_SLASH(36)
                    ATT_CRUSH(36)
                    DEF_STAB(-10)
                    DEF_SLASH(-10)
                    DEF_CRUSH(-9)
                    DEF_RANGE(-10)
                    Bonuses.Bonus.STRENGTH(42)
                }
            }
        }

        // Large spade (id: 20164)
        20164 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
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

        // Wooden shield (g) (id: 20166)
        20166 {
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

        // Steel platebody (g) (id: 20169)
        20169 {
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

        // Steel platelegs (g) (id: 20172)
        20172 {
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

        // Steel plateskirt (g) (id: 20175)
        20175 {
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

        // Steel full helm (g) (id: 20178)
        20178 {
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

        // Steel kiteshield (g) (id: 20181)
        20181 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(13)
                    DEF_SLASH(15)
                    DEF_CRUSH(14)
                    DEF_MAGIC(-1)
                    DEF_RANGE(14)
                }
            }
        }

        // Steel platebody (t) (id: 20184)
        20184 {
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

        // Steel platelegs (t) (id: 20187)
        20187 {
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

        // Steel plateskirt (t) (id: 20190)
        20190 {
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

        // Steel full helm (t) (id: 20193)
        20193 {
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

        // Steel kiteshield (t) (id: 20196)
        20196 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(13)
                    DEF_SLASH(15)
                    DEF_CRUSH(14)
                    DEF_MAGIC(-1)
                    DEF_RANGE(14)
                }
            }
        }

        // Monk's robe top (g) (id: 20199)
        20199 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    PRAYER(6)
                }
            }
        }

        // Monk's robe (g) (id: 20202)
        20202 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    PRAYER(5)
                }
            }
        }

        // Golden apron (id: 20208)
        20208 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Team cape zero (id: 20211)
        20211 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team cape x (id: 20214)
        20214 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team cape i (id: 20217)
        20217 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Holy blessing (id: 20220)
        20220 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    PRAYER(1)
                }
            }
        }

        // Unholy blessing (id: 20223)
        20223 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    PRAYER(1)
                }
            }
        }

        // Peaceful blessing (id: 20226)
        20226 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    PRAYER(1)
                }
            }
        }

        // Honourable blessing (id: 20229)
        20229 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    PRAYER(1)
                }
            }
        }

        // War blessing (id: 20232)
        20232 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    PRAYER(1)
                }
            }
        }

        // Ancient blessing (id: 20235)
        20235 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    PRAYER(1)
                }
            }
        }

        // Crier coat (id: 20240)
        20240 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Crier bell (id: 20243)
        20243 {
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

        // Clueless scroll (id: 20249)
        20249 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
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

        // Arceuus banner (id: 20251)
        20251 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
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

        // Hosidius banner (id: 20254)
        20254 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
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

        // Lovakengj banner (id: 20257)
        20257 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
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

        // Piscarilius banner (id: 20260)
        20260 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
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

        // Shayzien banner (id: 20263)
        20263 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
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

        // Cabbage round shield (id: 20272)
        20272 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(24)
                    DEF_SLASH(26)
                    DEF_CRUSH(22)
                    DEF_RANGE(24)
                }
            }
        }

        // Amulet of torture (or) (id: 20366)
        20366 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(15)
                    ATT_SLASH(15)
                    ATT_CRUSH(15)
                    Bonuses.Bonus.STRENGTH(10)
                    PRAYER(2)
                }
            }
        }

        // Armadyl godsword (or) (id: 20368)
        20368 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                }
                bonuses {
                    ATT_SLASH(132)
                    ATT_CRUSH(80)
                    Bonuses.Bonus.STRENGTH(132)
                    PRAYER(8)
                }
            }
        }

        // Bandos godsword (or) (id: 20370)
        20370 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                }
                bonuses {
                    ATT_SLASH(132)
                    ATT_CRUSH(80)
                    Bonuses.Bonus.STRENGTH(132)
                    PRAYER(8)
                }
            }
        }

        // Saradomin godsword (or) (id: 20372)
        20372 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                }
                bonuses {
                    ATT_SLASH(132)
                    ATT_CRUSH(80)
                    Bonuses.Bonus.STRENGTH(132)
                    PRAYER(8)
                }
            }
        }

        // Zamorak godsword (or) (id: 20374)
        20374 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                }
                bonuses {
                    ATT_SLASH(132)
                    ATT_CRUSH(80)
                    Bonuses.Bonus.STRENGTH(132)
                    PRAYER(8)
                }
            }
        }

        // Adamant arrow (id: 20388)
        20388 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(31)
                }
            }
        }

        // Dragon arrow (id: 20389)
        20389 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(60)
                }
            }
        }

        // Spear (id: 20397)
        20397 {
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
                    ATT_SLASH(18)
                    ATT_MAGIC(-4)
                    DEF_STAB(-1)
                    DEF_SLASH(2)
                    DEF_CRUSH(4)
                    Bonuses.Bonus.STRENGTH(20)
                }
            }
        }

        // Yew shortbow (id: 20401)
        20401 {
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

        // Rune scimitar (id: 20402)
        20402 {
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

        // Maple shortbow (id: 20403)
        20403 {
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

        // Abyssal whip (id: 20405)
        20405 {
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

        // Dragon scimitar (id: 20406)
        20406 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(67)
                    ATT_CRUSH(-2)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(66)
                }
            }
        }

        // Dragon dagger (id: 20407)
        20407 {
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

        // Dark bow (id: 20408)
        20408 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 9
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(95)
                }
            }
        }

        // Adamant platebody (id: 20415)
        20415 {
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

        // Adamant platelegs (id: 20416)
        20416 {
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

        // Blue d'hide body (id: 20417)
        20417 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(20)
                    DEF_STAB(45)
                    DEF_SLASH(37)
                    DEF_CRUSH(50)
                    DEF_MAGIC(30)
                    DEF_RANGE(45)
                }
            }
        }

        // Blue d'hide chaps (id: 20418)
        20418 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(11)
                    DEF_STAB(25)
                    DEF_SLASH(19)
                    DEF_CRUSH(27)
                    DEF_MAGIC(14)
                    DEF_RANGE(25)
                }
            }
        }

        // Rune platebody (id: 20421)
        20421 {
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

        // Rune platelegs (id: 20422)
        20422 {
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

        // Black d'hide body (id: 20423)
        20423 {
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

        // Black d'hide chaps (id: 20424)
        20424 {
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

        // Mystic robe top (id: 20425)
        20425 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(20)
                    DEF_MAGIC(20)
                }
            }
        }

        // Mystic robe bottom (id: 20426)
        20426 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_MAGIC(15)
                }
            }
        }

        // Dragon chainbody (id: 20428)
        20428 {
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

    }
}
