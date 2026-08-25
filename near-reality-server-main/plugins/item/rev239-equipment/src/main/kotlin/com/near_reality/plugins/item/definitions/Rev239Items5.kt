package com.near_reality.plugins.item.definitions

import com.near_reality.scripts.item.definitions.ItemDefinitionsScript
import com.zenyte.game.world.entity.player.Bonuses
import com.zenyte.game.world.entity.player.Bonuses.Bonus.*
import com.zenyte.game.world.entity.player.container.impl.equipment.EquipmentSlot

class Rev239Items5 : ItemDefinitionsScript() {
    init {
        // Dragon platelegs (id: 20429)
        20429 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-7)
                    DEF_STAB(68)
                    DEF_SLASH(66)
                    DEF_CRUSH(63)
                    DEF_MAGIC(-4)
                    DEF_RANGE(65)
                }
            }
        }

        // Ancient staff (id: 20431)
        20431 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(-1)
                    ATT_CRUSH(40)
                    ATT_MAGIC(15)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(15)
                    Bonuses.Bonus.STRENGTH(50)
                    PRAYER(-1)
                }
            }
        }

        // Evil chicken feet (id: 20433)
        20433 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Evil chicken wings (id: 20436)
        20436 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Evil chicken legs (id: 20442)
        20442 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Elder chaos top (id: 20517)
        20517 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(10)
                    DEF_MAGIC(8)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Elder chaos robe (id: 20520)
        20520 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(6)
                    DEF_MAGIC(6)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Rune battleaxe (id: 20552)
        20552 {
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

        // Beginner wand (id: 20553)
        20553 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    ATT_MAGIC(5)
                    DEF_MAGIC(5)
                }
            }
        }

        // Toktz-xil-ak (id: 20554)
        20554 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(47)
                    ATT_SLASH(38)
                    ATT_CRUSH(-2)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    Bonuses.Bonus.STRENGTH(49)
                }
            }
        }

        // Rune 2h sword (id: 20555)
        20555 {
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

        // Apprentice wand (id: 20556)
        20556 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    ATT_MAGIC(10)
                    DEF_MAGIC(10)
                }
            }
        }

        // Granite maul (id: 20557)
        20557 {
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

        // Magic shortbow (id: 20558)
        20558 {
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

        // Dragon 2h sword (id: 20559)
        20559 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(92)
                    ATT_CRUSH(80)
                    ATT_MAGIC(-4)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(93)
                }
            }
        }

        // Master wand (id: 20560)
        20560 {
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

        // Adamant full helm (id: 20561)
        20561 {
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

        // Mystic hat (id: 20562)
        20562 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                }
            }
        }

        // Proselyte sallet (id: 20563)
        20563 {
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
                    PRAYER(4)
                }
            }
        }

        // Proselyte hauberk (id: 20564)
        20564 {
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
                    PRAYER(8)
                }
            }
        }

        // Proselyte cuisse (id: 20565)
        20565 {
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
                    PRAYER(6)
                }
            }
        }

        // Red d'hide body (id: 20566)
        20566 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(25)
                    DEF_STAB(50)
                    DEF_SLASH(42)
                    DEF_CRUSH(55)
                    DEF_MAGIC(40)
                    DEF_RANGE(50)
                }
            }
        }

        // Red d'hide chaps (id: 20567)
        20567 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(14)
                    DEF_STAB(28)
                    DEF_SLASH(22)
                    DEF_CRUSH(30)
                    DEF_MAGIC(20)
                    DEF_RANGE(28)
                }
            }
        }

        // Splitbark helm (id: 20568)
        20568 {
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

        // Warrior helm (id: 20571)
        20571 {
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

        // Archer helm (id: 20572)
        20572 {
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

        // Farseer helm (id: 20573)
        20573 {
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

        // Infinity top (id: 20574)
        20574 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(22)
                    DEF_MAGIC(22)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Infinity bottoms (id: 20575)
        20575 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(17)
                    DEF_MAGIC(17)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // 3rd age robe top (id: 20576)
        20576 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(24)
                    DEF_MAGIC(24)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // 3rd age robe (id: 20577)
        20577 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(19)
                    DEF_MAGIC(19)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Climbing boots (id: 20578)
        20578 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Mystic boots (id: 20579)
        20579 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Snakeskin boots (id: 20580)
        20580 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(3)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                    DEF_MAGIC(1)
                }
            }
        }

        // Mithril gloves (id: 20581)
        20581 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(6)
                    ATT_SLASH(6)
                    ATT_CRUSH(6)
                    ATT_MAGIC(3)
                    ATT_RANGED(6)
                    DEF_STAB(6)
                    DEF_SLASH(6)
                    DEF_CRUSH(6)
                    DEF_MAGIC(3)
                    DEF_RANGE(6)
                    Bonuses.Bonus.STRENGTH(6)
                }
            }
        }

        // Adamant gloves (id: 20582)
        20582 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(7)
                    ATT_CRUSH(7)
                    ATT_MAGIC(4)
                    ATT_RANGED(7)
                    DEF_STAB(7)
                    DEF_SLASH(7)
                    DEF_CRUSH(7)
                    DEF_MAGIC(4)
                    DEF_RANGE(7)
                    Bonuses.Bonus.STRENGTH(7)
                }
            }
        }

        // Rune gloves (id: 20583)
        20583 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(8)
                    ATT_CRUSH(8)
                    ATT_MAGIC(4)
                    ATT_RANGED(8)
                    DEF_STAB(8)
                    DEF_SLASH(8)
                    DEF_CRUSH(8)
                    DEF_MAGIC(4)
                    DEF_RANGE(8)
                    Bonuses.Bonus.STRENGTH(8)
                }
            }
        }

        // Amulet of accuracy (id: 20584)
        20584 {
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

        // Amulet of power (id: 20585)
        20585 {
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

        // Amulet of glory (id: 20586)
        20586 {
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

        // Stale baguette (id: 20590)
        20590 {
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

        // Armadyl godsword (id: 20593)
        20593 {
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

        // Elder chaos hood (id: 20595)
        20595 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(5)
                    DEF_MAGIC(4)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Ahrim's robetop (id: 20598)
        20598 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(30)
                    ATT_RANGED(-10)
                    DEF_STAB(52)
                    DEF_SLASH(37)
                    DEF_CRUSH(63)
                    DEF_MAGIC(30)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Ahrim's robeskirt (id: 20599)
        20599 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(22)
                    ATT_RANGED(-7)
                    DEF_STAB(33)
                    DEF_SLASH(30)
                    DEF_CRUSH(36)
                    DEF_MAGIC(22)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Rune arrow (id: 20600)
        20600 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(49)
                }
            }
        }

        // Ring of suffering (r) (id: 20655)
        20655 {
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

        // Ring of suffering (ri) (id: 20657)
        20657 {
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

        // Pyromancer garb (id: 20704)
        20704 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Pyromancer robe (id: 20706)
        20706 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Pyromancer boots (id: 20710)
        20710 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Warm gloves (id: 20712)
        20712 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Tome of fire (id: 20714)
        20714 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(8)
                    DEF_MAGIC(8)
                }
            }
        }

        // Tome of fire (empty) (id: 20716)
        20716 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(8)
                    DEF_MAGIC(8)
                }
            }
        }

        // Bruma torch (id: 20720)
        20720 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Imbued heart (id: 20724)
        20724 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Leaf-bladed battleaxe (id: 20727)
        20727 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(72)
                    ATT_CRUSH(72)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(92)
                }
            }
        }

        // Mist battlestaff (id: 20730)
        20730 {
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

        // Mystic mist staff (id: 20733)
        20733 {
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

        // Dust battlestaff (id: 20736)
        20736 {
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

        // Mystic dust staff (id: 20739)
        20739 {
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

        // Hill giant club (id: 20756)
        20756 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(50)
                    ATT_CRUSH(65)
                    ATT_MAGIC(-4)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(70)
                }
            }
        }

        // Ardougne max cape (id: 20760)
        20760 {
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

        // Banshee top (id: 20775)
        20775 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Banshee robe (id: 20777)
        20777 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Hunting knife (id: 20779)
        20779 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-100)
                    Bonuses.Bonus.STRENGTH(-100)
                }
            }
        }

        // Killer's knife (id: 20781)
        20781 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
            }
        }

        // Dragon claws (id: 20784)
        20784 {
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

        // Dragon warhammer (id: 20785)
        20785 {
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

        // Ring of wealth (i5) (id: 20786)
        20786 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of wealth (i4) (id: 20787)
        20787 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of wealth (i3) (id: 20788)
        20788 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of wealth (i2) (id: 20789)
        20789 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of wealth (i1) (id: 20790)
        20790 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Hardcore ironman helm (id: 20792)
        20792 {
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

        // Hardcore ironman platebody (id: 20794)
        20794 {
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

        // Hardcore ironman platelegs (id: 20796)
        20796 {
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

        // Healer icon (id: 20802)
        20802 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Sack of presents (id: 20834)
        20834 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Giant present (id: 20836)
        20836 {
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

        // Corrupted helm (id: 20838)
        20838 {
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

        // Corrupted platebody (id: 20840)
        20840 {
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

        // Corrupted platelegs (id: 20842)
        20842 {
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

        // Corrupted plateskirt (id: 20844)
        20844 {
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

        // Corrupted kiteshield (id: 20846)
        20846 {
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

        // Dragon thrownaxe (id: 20849)
        20849 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(36)
                    RANGE_STRENGTH(47)
                }
            }
        }

        // Twisted bow (id: 20997)
        20997 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(70)
                }
            }
        }

        // Twisted buckler (id: 21000)
        21000 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-7)
                    ATT_SLASH(-8)
                    ATT_CRUSH(-7)
                    ATT_MAGIC(-10)
                    ATT_RANGED(18)
                    DEF_STAB(22)
                    DEF_SLASH(24)
                    DEF_CRUSH(22)
                    DEF_MAGIC(26)
                    DEF_RANGE(58)
                }
            }
        }

        // Elder maul (id: 21003)
        21003 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                }
                bonuses {
                    ATT_CRUSH(135)
                    Bonuses.Bonus.STRENGTH(147)
                }
            }
        }

        // Kodai wand (id: 21006)
        21006 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    ATT_MAGIC(28)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(20)
                    MAGIC_DAMAGE(15)
                }
            }
        }

        // Dragon sword (id: 21009)
        21009 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(65)
                    ATT_SLASH(55)
                    ATT_CRUSH(-2)
                    DEF_SLASH(2)
                    DEF_CRUSH(1)
                    Bonuses.Bonus.STRENGTH(63)
                }
            }
        }

        // Dragon hunter crossbow (id: 21012)
        21012 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_RANGED(95)
                }
            }
        }

        // Dinh's bulwark (id: 21015)
        21015 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_CRUSH(124)
                    DEF_STAB(106)
                    DEF_SLASH(109)
                    DEF_CRUSH(109)
                    DEF_MAGIC(-10)
                    DEF_RANGE(148)
                    Bonuses.Bonus.STRENGTH(38)
                }
            }
        }

        // Ancestral hat (id: 21018)
        21018 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(8)
                    ATT_RANGED(-2)
                    DEF_STAB(12)
                    DEF_SLASH(11)
                    DEF_CRUSH(13)
                    DEF_MAGIC(5)
                    MAGIC_DAMAGE(3)
                }
            }
        }

        // Ancestral robe top (id: 21021)
        21021 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(35)
                    ATT_RANGED(-8)
                    DEF_STAB(42)
                    DEF_SLASH(31)
                    DEF_CRUSH(51)
                    DEF_MAGIC(28)
                    MAGIC_DAMAGE(3)
                }
            }
        }

        // Ancestral robe bottom (id: 21024)
        21024 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(26)
                    ATT_RANGED(-7)
                    DEF_STAB(27)
                    DEF_SLASH(24)
                    DEF_CRUSH(30)
                    DEF_MAGIC(20)
                    MAGIC_DAMAGE(3)
                }
            }
        }

        // Dragon harpoon (id: 21028)
        21028 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(38)
                    ATT_SLASH(32)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(42)
                }
            }
        }

        // Infernal harpoon (id: 21031)
        21031 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(38)
                    ATT_SLASH(32)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(42)
                }
            }
        }

        // Infernal harpoon (uncharged) (id: 21033)
        21033 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(38)
                    ATT_SLASH(32)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(42)
                }
            }
        }

        // Killer's knife (id: 21059)
        21059 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
            }
        }

        // Graceful cape (id: 21064)
        21064 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful cape (id: 21066)
        21066 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful top (id: 21067)
        21067 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful top (id: 21069)
        21069 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful legs (id: 21070)
        21070 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful legs (id: 21072)
        21072 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful gloves (id: 21073)
        21073 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful gloves (id: 21075)
        21075 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful boots (id: 21076)
        21076 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Graceful boots (id: 21078)
        21078 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Opal ring (id: 21081)
        21081 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Jade ring (id: 21084)
        21084 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Topaz ring (id: 21087)
        21087 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Opal necklace (id: 21090)
        21090 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Jade necklace (id: 21093)
        21093 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Topaz necklace (id: 21096)
        21096 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Opal amulet (id: 21108)
        21108 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Jade amulet (id: 21111)
        21111 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Topaz amulet (id: 21114)
        21114 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Opal bracelet (id: 21117)
        21117 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Jade bracelet (id: 21120)
        21120 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Topaz bracelet (id: 21123)
        21123 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Ring of pursuit (id: 21126)
        21126 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of returning(5) (id: 21129)
        21129 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of returning(4) (id: 21132)
        21132 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of returning(3) (id: 21134)
        21134 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of returning(2) (id: 21136)
        21136 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of returning(1) (id: 21138)
        21138 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Efaritay's aid (id: 21140)
        21140 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Dodgy necklace (id: 21143)
        21143 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Necklace of passage(5) (id: 21146)
        21146 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Necklace of passage(4) (id: 21149)
        21149 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Necklace of passage(3) (id: 21151)
        21151 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Necklace of passage(2) (id: 21153)
        21153 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Necklace of passage(1) (id: 21155)
        21155 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Necklace of faith (id: 21157)
        21157 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Amulet of bounty (id: 21160)
        21160 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Amulet of chemistry (id: 21163)
        21163 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Burning amulet(5) (id: 21166)
        21166 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Burning amulet(4) (id: 21169)
        21169 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Burning amulet(3) (id: 21171)
        21171 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Burning amulet(2) (id: 21173)
        21173 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Burning amulet(1) (id: 21175)
        21175 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Expeditious bracelet (id: 21177)
        21177 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Flamtaer bracelet (id: 21180)
        21180 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Bracelet of slaughter (id: 21183)
        21183 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Fire max cape (id: 21186)
        21186 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Lava battlestaff (id: 21198)
        21198 {
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

        // Mystic lava staff (id: 21200)
        21200 {
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

        // Elder maul (id: 21205)
        21205 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                }
                bonuses {
                    ATT_CRUSH(135)
                    Bonuses.Bonus.STRENGTH(147)
                }
            }
        }

        // Dragon sword (id: 21206)
        21206 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(65)
                    ATT_SLASH(55)
                    ATT_CRUSH(-2)
                    DEF_SLASH(2)
                    DEF_CRUSH(1)
                    Bonuses.Bonus.STRENGTH(63)
                }
            }
        }

        // Dragon thrownaxe (id: 21207)
        21207 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(36)
                    RANGE_STRENGTH(47)
                }
            }
        }

        // Birthday balloons (id: 21209)
        21209 {
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

        // Slayer's staff (e) (id: 21255)
        21255 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(-1)
                    ATT_CRUSH(25)
                    ATT_MAGIC(12)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(10)
                    Bonuses.Bonus.STRENGTH(35)
                }
            }
        }

        // Purple slayer helmet (id: 21264)
        21264 {
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

        // Purple slayer helmet (i) (id: 21266)
        21266 {
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

        // Slayer ring (eternal) (id: 21268)
        21268 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Skull sceptre (i) (id: 21276)
        21276 {
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
                    DEF_MAGIC(4)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Infernal max cape (id: 21284)
        21284 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Infernal max cape (id: 21285)
        21285 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(1)
                    ATT_RANGED(1)
                    DEF_STAB(12)
                    DEF_SLASH(12)
                    DEF_CRUSH(12)
                    DEF_MAGIC(12)
                    DEF_RANGE(12)
                    Bonuses.Bonus.STRENGTH(8)
                    PRAYER(2)
                }
            }
        }

        // Infernal cape (id: 21295)
        21295 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(1)
                    ATT_RANGED(1)
                    DEF_STAB(12)
                    DEF_SLASH(12)
                    DEF_CRUSH(12)
                    DEF_MAGIC(12)
                    DEF_RANGE(12)
                    Bonuses.Bonus.STRENGTH(8)
                    PRAYER(2)
                }
            }
        }

        // Infernal cape (id: 21297)
        21297 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Obsidian helmet (id: 21298)
        21298 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(25)
                    DEF_SLASH(23)
                    DEF_CRUSH(26)
                    DEF_RANGE(24)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Obsidian platebody (id: 21301)
        21301 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_STAB(55)
                    DEF_SLASH(78)
                    DEF_CRUSH(56)
                    DEF_MAGIC(-15)
                    DEF_RANGE(60)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Obsidian platelegs (id: 21304)
        21304 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_STAB(46)
                    DEF_SLASH(43)
                    DEF_CRUSH(41)
                    DEF_MAGIC(-10)
                    DEF_RANGE(40)
                    Bonuses.Bonus.STRENGTH(1)
                }
            }
        }

        // Rainbow scarf (id: 21314)
        21314 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Amethyst broad bolts (id: 21316)
        21316 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(115)
                }
            }
        }

        // Amethyst javelin (id: 21318)
        21318 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(135)
                }
            }
        }

        // Amethyst javelin(p) (id: 21320)
        21320 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(135)
                }
            }
        }

        // Amethyst javelin(p+) (id: 21322)
        21322 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(135)
                }
            }
        }

        // Amethyst javelin(p++) (id: 21324)
        21324 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(135)
                }
            }
        }

        // Amethyst arrow (id: 21326)
        21326 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(55)
                }
            }
        }

        // Amethyst fire arrow (id: 21328)
        21328 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(55)
                }
            }
        }

        // Amethyst fire arrow (lit) (id: 21330)
        21330 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(55)
                }
            }
        }

        // Amethyst arrow(p) (id: 21332)
        21332 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(55)
                }
            }
        }

        // Amethyst arrow(p+) (id: 21334)
        21334 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(55)
                }
            }
        }

        // Amethyst arrow(p++) (id: 21336)
        21336 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(55)
                }
            }
        }

        // Mining gloves (id: 21343)
        21343 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Superior mining gloves (id: 21345)
        21345 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Hand fan (id: 21354)
        21354 {
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

        // Expert mining gloves (id: 21392)
        21392 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Clan wars cape (id: 21396)
        21396 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21397)
        21397 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21398)
        21398 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21399)
        21399 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21400)
        21400 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21401)
        21401 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21402)
        21402 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21403)
        21403 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21404)
        21404 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21405)
        21405 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21406)
        21406 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21407)
        21407 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21408)
        21408 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21409)
        21409 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21410)
        21410 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21411)
        21411 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21412)
        21412 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21413)
        21413 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21414)
        21414 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21415)
        21415 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21416)
        21416 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21417)
        21417 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21418)
        21418 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21419)
        21419 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21420)
        21420 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21421)
        21421 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21422)
        21422 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21423)
        21423 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21424)
        21424 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21425)
        21425 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21426)
        21426 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan wars cape (id: 21427)
        21427 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Wilderness cape (id: 21428)
        21428 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(4)
                    ATT_RANGED(4)
                }
            }
        }

        // Wilderness cape (id: 21429)
        21429 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(4)
                    ATT_RANGED(4)
                }
            }
        }

        // Wilderness cape (id: 21430)
        21430 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(4)
                    ATT_RANGED(4)
                }
            }
        }

        // Wilderness cape (id: 21431)
        21431 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(4)
                    ATT_RANGED(4)
                }
            }
        }

        // Wilderness cape (id: 21432)
        21432 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(4)
                    ATT_RANGED(4)
                }
            }
        }

        // Wilderness champion amulet (id: 21433)
        21433 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(100)
                    ATT_SLASH(100)
                    ATT_CRUSH(100)
                    ATT_MAGIC(100)
                    ATT_RANGED(100)
                    DEF_STAB(100)
                    DEF_SLASH(100)
                    DEF_CRUSH(100)
                    DEF_MAGIC(100)
                    DEF_RANGE(100)
                    Bonuses.Bonus.STRENGTH(50)
                    PRAYER(50)
                }
            }
        }

        // Wilderness cape (id: 21434)
        21434 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(10)
                    ATT_CRUSH(10)
                    ATT_MAGIC(10)
                    ATT_RANGED(10)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(10)
                    DEF_MAGIC(10)
                    DEF_RANGE(10)
                }
            }
        }

        // Wilderness cape (id: 21435)
        21435 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(4)
                    ATT_RANGED(4)
                }
            }
        }

        // Wilderness cape (id: 21436)
        21436 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(4)
                    ATT_RANGED(4)
                }
            }
        }

        // Wilderness cape (id: 21437)
        21437 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(4)
                    ATT_RANGED(4)
                }
            }
        }

        // Wilderness cape (id: 21438)
        21438 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(4)
                    ATT_RANGED(4)
                }
            }
        }

        // Champion's cape (id: 21439)
        21439 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Pharaoh's sceptre (id: 21445)
        21445 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Pharaoh's sceptre (id: 21446)
        21446 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Heat-proof vessel (id: 21539)
        21539 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Ancient wyvern shield (id: 21633)
        21633 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-10)
                    ATT_SLASH(-10)
                    ATT_CRUSH(-10)
                    ATT_MAGIC(15)
                    ATT_RANGED(-10)
                    DEF_STAB(22)
                    DEF_SLASH(30)
                    DEF_CRUSH(25)
                    DEF_MAGIC(15)
                    DEF_RANGE(-55)
                    Bonuses.Bonus.STRENGTH(-2)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Ancient wyvern shield (id: 21634)
        21634 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-10)
                    ATT_SLASH(-10)
                    ATT_CRUSH(-10)
                    ATT_MAGIC(15)
                    ATT_RANGED(-10)
                    DEF_STAB(22)
                    DEF_SLASH(30)
                    DEF_CRUSH(25)
                    DEF_MAGIC(15)
                    DEF_RANGE(-55)
                    Bonuses.Bonus.STRENGTH(-2)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Granite boots (id: 21643)
        21643 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(15)
                    DEF_SLASH(16)
                    DEF_CRUSH(17)
                    DEF_RANGE(8)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Granite longsword (id: 21646)
        21646 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(56)
                    ATT_SLASH(65)
                    ATT_CRUSH(-2)
                    DEF_SLASH(3)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(62)
                }
            }
        }

        // Merfolk trident (id: 21649)
        21649 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(8)
                    ATT_CRUSH(8)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Runefest shield (id: 21695)
        21695 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Diving apparatus (id: 21723)
        21723 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Guardian boots (id: 21733)
        21733 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(32)
                    DEF_SLASH(32)
                    DEF_CRUSH(32)
                    DEF_MAGIC(-3)
                    DEF_RANGE(24)
                    Bonuses.Bonus.STRENGTH(3)
                    PRAYER(2)
                }
            }
        }

        // Granite gloves (id: 21736)
        21736 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(5)
                    ATT_CRUSH(9)
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(8)
                    DEF_SLASH(8)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-3)
                    DEF_RANGE(5)
                    Bonuses.Bonus.STRENGTH(7)
                }
            }
        }

        // Granite ring (id: 21739)
        21739 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    DEF_STAB(2)
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                    DEF_MAGIC(-2)
                    DEF_RANGE(12)
                }
            }
        }

        // Granite hammer (id: 21742)
        21742 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_CRUSH(57)
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    Bonuses.Bonus.STRENGTH(56)
                }
            }
        }

        // Granite ring (i) (id: 21752)
        21752 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    DEF_STAB(4)
                    DEF_SLASH(4)
                    DEF_CRUSH(4)
                    DEF_MAGIC(-4)
                    DEF_RANGE(24)
                }
            }
        }

        // Kharedst's memoirs (id: 21760)
        21760 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    PRAYER(1)
                }
            }
        }

        // Imbued saradomin max cape (id: 21776)
        21776 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(15)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Imbued zamorak max cape (id: 21780)
        21780 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(15)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Imbued guthix max cape (id: 21784)
        21784 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(15)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Imbued saradomin cape (id: 21791)
        21791 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(15)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Imbued guthix cape (id: 21793)
        21793 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(15)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Imbued zamorak cape (id: 21795)
        21795 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(15)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Bracelet of ethereum (id: 21816)
        21816 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Bracelet of ethereum (uncharged) (id: 21817)
        21817 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Shaman mask (id: 21838)
        21838 {
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

        // Snow imp costume body (id: 21849)
        21849 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Snow imp costume legs (id: 21851)
        21851 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Snow imp costume tail (id: 21853)
        21853 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Snow imp costume gloves (id: 21855)
        21855 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Snow imp costume feet (id: 21857)
        21857 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Turquoise slayer helmet (id: 21888)
        21888 {
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

        // Turquoise slayer helmet (i) (id: 21890)
        21890 {
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

        // Dragon platebody (id: 21892)
        21892 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(109)
                    DEF_SLASH(107)
                    DEF_CRUSH(97)
                    DEF_MAGIC(-6)
                    DEF_RANGE(106)
                }
            }
        }

        // Dragon kiteshield (id: 21895)
        21895 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-3)
                    DEF_STAB(56)
                    DEF_SLASH(60)
                    DEF_CRUSH(58)
                    DEF_MAGIC(-1)
                    DEF_RANGE(58)
                }
            }
        }

        // Assembler max cape (id: 21898)
        21898 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_RANGED(8)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_MAGIC(8)
                    DEF_RANGE(2)
                }
            }
        }

        // Dragon crossbow (id: 21902)
        21902 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_RANGED(94)
                }
            }
        }

        // Dragon bolts (id: 21905)
        21905 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Dragon limbs (id: 21918)
        21918 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Dragon bolts (p) (id: 21924)
        21924 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Dragon bolts (p+) (id: 21926)
        21926 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Dragon bolts (p++) (id: 21928)
        21928 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Opal dragon bolts (e) (id: 21932)
        21932 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Jade dragon bolts (e) (id: 21934)
        21934 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Pearl dragon bolts (e) (id: 21936)
        21936 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Topaz dragon bolts (e) (id: 21938)
        21938 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Sapphire dragon bolts (e) (id: 21940)
        21940 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Emerald dragon bolts (e) (id: 21942)
        21942 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Ruby dragon bolts (e) (id: 21944)
        21944 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Diamond dragon bolts (e) (id: 21946)
        21946 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Dragonstone dragon bolts (e) (id: 21948)
        21948 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Onyx dragon bolts (e) (id: 21950)
        21950 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Magic stock (id: 21952)
        21952 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Opal dragon bolts (id: 21955)
        21955 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Jade dragon bolts (id: 21957)
        21957 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Pearl dragon bolts (id: 21959)
        21959 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Topaz dragon bolts (id: 21961)
        21961 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Sapphire dragon bolts (id: 21963)
        21963 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Emerald dragon bolts (id: 21965)
        21965 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Ruby dragon bolts (id: 21967)
        21967 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Diamond dragon bolts (id: 21969)
        21969 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Dragonstone dragon bolts (id: 21971)
        21971 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Onyx dragon bolts (id: 21973)
        21973 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Dragonfire ward (id: 22002)
        22002 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-10)
                    ATT_SLASH(-10)
                    ATT_CRUSH(-10)
                    ATT_MAGIC(-10)
                    ATT_RANGED(15)
                    DEF_STAB(-25)
                    DEF_SLASH(-20)
                    DEF_CRUSH(-22)
                    DEF_MAGIC(28)
                    DEF_RANGE(18)
                    Bonuses.Bonus.STRENGTH(-2)
                }
            }
        }

        // Dragonfire ward (id: 22003)
        22003 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-10)
                    ATT_SLASH(-10)
                    ATT_CRUSH(-10)
                    ATT_MAGIC(-10)
                    ATT_RANGED(15)
                    DEF_STAB(-25)
                    DEF_SLASH(-20)
                    DEF_CRUSH(-22)
                    DEF_MAGIC(28)
                    DEF_RANGE(18)
                    Bonuses.Bonus.STRENGTH(-2)
                }
            }
        }

        // Ava's assembler (id: 22109)
        22109 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_RANGED(8)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_MAGIC(8)
                    DEF_RANGE(2)
                }
            }
        }

        // Dragonbone necklace (id: 22111)
        22111 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(10)
                    ATT_CRUSH(10)
                    ATT_MAGIC(10)
                    ATT_RANGED(10)
                    DEF_STAB(2)
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                    DEF_MAGIC(2)
                    DEF_RANGE(2)
                    Bonuses.Bonus.STRENGTH(2)
                    PRAYER(12)
                }
            }
        }

        // Mythical cape (id: 22114)
        22114 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_CRUSH(6)
                    DEF_STAB(8)
                    DEF_SLASH(8)
                    DEF_CRUSH(8)
                    DEF_MAGIC(8)
                    DEF_RANGE(8)
                    Bonuses.Bonus.STRENGTH(1)
                    PRAYER(1)
                }
            }
        }

        // Adamant kiteshield (id: 22127)
        22127 {
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

        // Adamant kiteshield (id: 22129)
        22129 {
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

        // Adamant kiteshield (id: 22131)
        22131 {
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

        // Adamant kiteshield (id: 22133)
        22133 {
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

        // Adamant kiteshield (id: 22135)
        22135 {
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

        // Adamant kiteshield (id: 22137)
        22137 {
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

        // Adamant kiteshield (id: 22139)
        22139 {
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

        // Adamant kiteshield (id: 22141)
        22141 {
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

        // Adamant kiteshield (id: 22143)
        22143 {
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

        // Adamant kiteshield (id: 22145)
        22145 {
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

        // Adamant kiteshield (id: 22147)
        22147 {
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

        // Adamant kiteshield (id: 22149)
        22149 {
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

        // Adamant kiteshield (id: 22151)
        22151 {
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

        // Adamant kiteshield (id: 22153)
        22153 {
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

        // Adamant kiteshield (id: 22155)
        22155 {
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

        // Adamant kiteshield (id: 22157)
        22157 {
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

        // Adamant heraldic helm (id: 22159)
        22159 {
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

        // Adamant heraldic helm (id: 22161)
        22161 {
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

        // Adamant heraldic helm (id: 22163)
        22163 {
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

        // Adamant heraldic helm (id: 22165)
        22165 {
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

        // Adamant heraldic helm (id: 22167)
        22167 {
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

        // Adamant heraldic helm (id: 22169)
        22169 {
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

        // Adamant heraldic helm (id: 22171)
        22171 {
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

        // Adamant heraldic helm (id: 22173)
        22173 {
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

        // Adamant heraldic helm (id: 22175)
        22175 {
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

        // Adamant heraldic helm (id: 22177)
        22177 {
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

        // Adamant heraldic helm (id: 22179)
        22179 {
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

        // Adamant heraldic helm (id: 22181)
        22181 {
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

        // Adamant heraldic helm (id: 22183)
        22183 {
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

        // Adamant heraldic helm (id: 22185)
        22185 {
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

        // Adamant heraldic helm (id: 22187)
        22187 {
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

        // Adamant heraldic helm (id: 22189)
        22189 {
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

        // Bullet arrow (id: 22227)
        22227 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    ATT_RANGED(46)
                    RANGE_STRENGTH(125)
                }
            }
        }

        // Field arrow (id: 22228)
        22228 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    ATT_RANGED(46)
                    RANGE_STRENGTH(125)
                }
            }
        }

        // Blunt arrow (id: 22229)
        22229 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    ATT_RANGED(46)
                    RANGE_STRENGTH(125)
                }
            }
        }

        // Barbed arrow (id: 22230)
        22230 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    ATT_RANGED(46)
                    RANGE_STRENGTH(125)
                }
            }
        }

        // Dragon boots (g) (id: 22234)
        22234 {
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

        // Dragon platebody (g) (id: 22242)
        22242 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(109)
                    DEF_SLASH(107)
                    DEF_CRUSH(97)
                    DEF_MAGIC(-6)
                    DEF_RANGE(106)
                }
            }
        }

        // Dragon kiteshield (g) (id: 22244)
        22244 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(-2)
                    DEF_STAB(56)
                    DEF_SLASH(60)
                    DEF_CRUSH(58)
                    DEF_MAGIC(-1)
                    DEF_RANGE(58)
                }
            }
        }

        // Necklace of anguish (or) (id: 22249)
        22249 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_RANGED(15)
                    PRAYER(2)
                }
            }
        }

        // Oak shield (id: 22251)
        22251 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    DEF_STAB(5)
                    DEF_SLASH(6)
                    DEF_CRUSH(4)
                    DEF_MAGIC(1)
                    DEF_RANGE(5)
                }
            }
        }

        // Willow shield (id: 22254)
        22254 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    DEF_STAB(6)
                    DEF_SLASH(7)
                    DEF_CRUSH(5)
                    DEF_MAGIC(2)
                    DEF_RANGE(6)
                }
            }
        }

        // Maple shield (id: 22257)
        22257 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    DEF_STAB(7)
                    DEF_SLASH(8)
                    DEF_CRUSH(6)
                    DEF_MAGIC(2)
                    DEF_RANGE(7)
                }
            }
        }

        // Yew shield (id: 22260)
        22260 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    DEF_STAB(8)
                    DEF_SLASH(9)
                    DEF_CRUSH(7)
                    DEF_MAGIC(3)
                    DEF_RANGE(8)
                }
            }
        }

        // Magic shield (id: 22263)
        22263 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    DEF_STAB(10)
                    DEF_SLASH(13)
                    DEF_CRUSH(9)
                    DEF_MAGIC(3)
                    DEF_RANGE(9)
                }
            }
        }

        // Redwood shield (id: 22266)
        22266 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    DEF_STAB(12)
                    DEF_SLASH(15)
                    DEF_CRUSH(11)
                    DEF_MAGIC(4)
                    DEF_RANGE(10)
                }
            }
        }

        // Hard leather shield (id: 22269)
        22269 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-15)
                    ATT_SLASH(-15)
                    ATT_CRUSH(-11)
                    ATT_MAGIC(-10)
                    ATT_RANGED(2)
                    DEF_STAB(8)
                    DEF_SLASH(7)
                    DEF_CRUSH(7)
                    DEF_MAGIC(5)
                    DEF_RANGE(9)
                }
            }
        }

        // Snakeskin shield (id: 22272)
        22272 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-15)
                    ATT_SLASH(-15)
                    ATT_CRUSH(-11)
                    ATT_MAGIC(-10)
                    ATT_RANGED(3)
                    DEF_STAB(10)
                    DEF_SLASH(9)
                    DEF_CRUSH(8)
                    DEF_MAGIC(7)
                    DEF_RANGE(10)
                }
            }
        }

        // Green d'hide shield (id: 22275)
        22275 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-15)
                    ATT_SLASH(-15)
                    ATT_CRUSH(-11)
                    ATT_MAGIC(-10)
                    ATT_RANGED(4)
                    DEF_STAB(14)
                    DEF_SLASH(12)
                    DEF_CRUSH(11)
                    DEF_MAGIC(9)
                    DEF_RANGE(11)
                }
            }
        }

        // Blue d'hide shield (id: 22278)
        22278 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-15)
                    ATT_SLASH(-15)
                    ATT_CRUSH(-11)
                    ATT_MAGIC(-10)
                    ATT_RANGED(5)
                    DEF_STAB(16)
                    DEF_SLASH(14)
                    DEF_CRUSH(12)
                    DEF_MAGIC(12)
                    DEF_RANGE(12)
                }
            }
        }

        // Red d'hide shield (id: 22281)
        22281 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-15)
                    ATT_SLASH(-15)
                    ATT_CRUSH(-11)
                    ATT_MAGIC(-10)
                    ATT_RANGED(6)
                    DEF_STAB(18)
                    DEF_SLASH(16)
                    DEF_CRUSH(14)
                    DEF_MAGIC(13)
                    DEF_RANGE(13)
                }
            }
        }

        // Black d'hide shield (id: 22284)
        22284 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-15)
                    ATT_SLASH(-15)
                    ATT_CRUSH(-11)
                    ATT_MAGIC(-10)
                    ATT_RANGED(7)
                    DEF_STAB(21)
                    DEF_SLASH(18)
                    DEF_CRUSH(16)
                    DEF_MAGIC(15)
                    DEF_RANGE(14)
                }
            }
        }

        // Trident of the seas (e) (id: 22288)
        22288 {
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

        // Uncharged trident (e) (id: 22290)
        22290 {
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

        // Trident of the swamp (e) (id: 22292)
        22292 {
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

        // Uncharged toxic trident (e) (id: 22294)
        22294 {
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

        // Staff of light (id: 22296)
        22296 {
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

        // Healer icon (id: 22308)
        22308 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Healer icon (id: 22309)
        22309 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Healer icon (id: 22310)
        22310 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Healer icon (id: 22311)
        22311 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Collector icon (id: 22312)
        22312 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Collector icon (id: 22313)
        22313 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Collector icon (id: 22314)
        22314 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Collector icon (id: 22315)
        22315 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Prop sword (id: 22316)
        22316 {
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

        // Avernic defender (id: 22322)
        22322 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(30)
                    ATT_SLASH(29)
                    ATT_CRUSH(28)
                    ATT_MAGIC(-5)
                    ATT_RANGED(-4)
                    DEF_STAB(30)
                    DEF_SLASH(29)
                    DEF_CRUSH(28)
                    DEF_MAGIC(-5)
                    DEF_RANGE(-4)
                    Bonuses.Bonus.STRENGTH(8)
                }
            }
        }

        // Sanguinesti staff (id: 22323)
        22323 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_MAGIC(25)
                    ATT_RANGED(-4)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(15)
                }
            }
        }

        // Ghrazi rapier (id: 22324)
        22324 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(94)
                    ATT_SLASH(55)
                    Bonuses.Bonus.STRENGTH(89)
                }
            }
        }

        // Scythe of vitur (id: 22325)
        22325 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(70)
                    ATT_SLASH(125)
                    ATT_CRUSH(30)
                    ATT_MAGIC(-6)
                    DEF_STAB(-2)
                    DEF_SLASH(8)
                    DEF_CRUSH(10)
                    Bonuses.Bonus.STRENGTH(75)
                }
            }
        }

        // Justiciar faceguard (id: 22326)
        22326 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(60)
                    DEF_SLASH(63)
                    DEF_CRUSH(59)
                    DEF_MAGIC(-6)
                    DEF_RANGE(67)
                    PRAYER(2)
                }
            }
        }

        // Justiciar chestguard (id: 22327)
        22327 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-40)
                    ATT_RANGED(-20)
                    DEF_STAB(132)
                    DEF_SLASH(130)
                    DEF_CRUSH(117)
                    DEF_MAGIC(-16)
                    DEF_RANGE(142)
                    PRAYER(4)
                }
            }
        }

        // Justiciar legguards (id: 22328)
        22328 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-31)
                    ATT_RANGED(-17)
                    DEF_STAB(95)
                    DEF_SLASH(92)
                    DEF_CRUSH(93)
                    DEF_MAGIC(-14)
                    DEF_RANGE(102)
                    PRAYER(4)
                }
            }
        }

        // Starter sword (id: 22331)
        22331 {
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

        // Starter bow (id: 22333)
        22333 {
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
                    RANGE_STRENGTH(7)
                }
            }
        }

        // Starter staff (id: 22335)
        22335 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                    normalAttackDistance = 6
                    longAttackDistance = 8
                }
                bonuses {
                    ATT_MAGIC(10)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(10)
                }
            }
        }

        // Collector icon (id: 22337)
        22337 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Collector icon (id: 22338)
        22338 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Collector icon (id: 22339)
        22339 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Defender icon (id: 22340)
        22340 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Defender icon (id: 22341)
        22341 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Defender icon (id: 22342)
        22342 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Defender icon (id: 22343)
        22343 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Defender icon (id: 22344)
        22344 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Defender icon (id: 22345)
        22345 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Attacker icon (id: 22346)
        22346 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Attacker icon (id: 22347)
        22347 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Attacker icon (id: 22348)
        22348 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Attacker icon (id: 22349)
        22349 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Eggshell platebody (id: 22351)
        22351 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Eggshell platelegs (id: 22353)
        22353 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Holy handegg (id: 22355)
        22355 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Peaceful handegg (id: 22358)
        22358 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Chaotic handegg (id: 22361)
        22361 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Bryophyta's staff (uncharged) (id: 22368)
        22368 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(-1)
                    ATT_CRUSH(40)
                    ATT_MAGIC(15)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(15)
                    Bonuses.Bonus.STRENGTH(50)
                }
            }
        }

        // Bryophyta's staff (id: 22370)
        22370 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(-1)
                    ATT_CRUSH(40)
                    ATT_MAGIC(15)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(15)
                    Bonuses.Bonus.STRENGTH(50)
                }
            }
        }

        // Xeric's guard (id: 22388)
        22388 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Xeric's warrior (id: 22390)
        22390 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Xeric's sentinel (id: 22392)
        22392 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Xeric's general (id: 22394)
        22394 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Xeric's champion (id: 22396)
        22396 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Ivandis flail (id: 22398)
        22398 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(24)
                    ATT_SLASH(38)
                    ATT_CRUSH(62)
                    ATT_MAGIC(8)
                    DEF_STAB(4)
                    DEF_SLASH(4)
                    DEF_CRUSH(2)
                    DEF_MAGIC(8)
                    Bonuses.Bonus.STRENGTH(42)
                    PRAYER(5)
                }
            }
        }

        // Drakan's medallion (id: 22400)
        22400 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Emerald sickle (b) (id: 22433)
        22433 {
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
                    Bonuses.Bonus.STRENGTH(2)
                    PRAYER(5)
                }
            }
        }

        // Enchanted emerald sickle (b) (id: 22435)
        22435 {
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
                    Bonuses.Bonus.STRENGTH(3)
                    PRAYER(5)
                }
            }
        }

        // Sanguinesti staff (uncharged) (id: 22481)
        22481 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_MAGIC(25)
                    ATT_RANGED(-4)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(15)
                }
            }
        }

        // Scythe of vitur (uncharged) (id: 22486)
        22486 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(50)
                    ATT_SLASH(75)
                    ATT_CRUSH(10)
                    ATT_MAGIC(-6)
                    DEF_STAB(-2)
                    DEF_SLASH(6)
                    Bonuses.Bonus.STRENGTH(50)
                }
            }
        }

        // Sinhaza shroud tier 1 (id: 22494)
        22494 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Sinhaza shroud tier 2 (id: 22496)
        22496 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Sinhaza shroud tier 3 (id: 22498)
        22498 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Sinhaza shroud tier 4 (id: 22500)
        22500 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Sinhaza shroud tier 5 (id: 22502)
        22502 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Dawnbringer (id: 22516)
        22516 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 10
                    longAttackDistance = 12
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

        // Escape crystal (id: 22517)
        22517 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Viggora's chainmace (u) (id: 22542)
        22542 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(53)
                    ATT_SLASH(-2)
                    ATT_CRUSH(67)
                    Bonuses.Bonus.STRENGTH(66)
                    PRAYER(2)
                }
            }
        }

        // Viggora's chainmace (id: 22545)
        22545 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(53)
                    ATT_SLASH(-2)
                    ATT_CRUSH(67)
                    Bonuses.Bonus.STRENGTH(66)
                    PRAYER(2)
                }
            }
        }

        // Craw's bow (u) (id: 22547)
        22547 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 9
                    longAttackDistance = 11
                }
                bonuses {
                    ATT_RANGED(75)
                    RANGE_STRENGTH(60)
                }
            }
        }

        // Craw's bow (id: 22550)
        22550 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 9
                    longAttackDistance = 11
                }
                bonuses {
                    ATT_RANGED(75)
                    RANGE_STRENGTH(60)
                }
            }
        }

        // Thammaron's sceptre (u) (id: 22552)
        22552 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_MAGIC(15)
                    DEF_MAGIC(20)
                }
            }
        }

        // Thammaron's sceptre (id: 22555)
        22555 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_MAGIC(15)
                    DEF_MAGIC(20)
                }
            }
        }

        // Amulet of avarice (id: 22557)
        22557 {
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

        // Vesta's spear (id: 22610)
        22610 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(133)
                    ATT_SLASH(113)
                    ATT_CRUSH(120)
                    DEF_STAB(18)
                    DEF_SLASH(21)
                    DEF_CRUSH(21)
                    Bonuses.Bonus.STRENGTH(122)
                }
            }
        }

        // Vesta's longsword (id: 22613)
        22613 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(106)
                    ATT_SLASH(121)
                    ATT_CRUSH(-2)
                    DEF_STAB(1)
                    DEF_SLASH(4)
                    DEF_CRUSH(3)
                    Bonuses.Bonus.STRENGTH(118)
                }
            }
        }

        // Vesta's chainbody (id: 22616)
        22616 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_STAB(35)
                    ATT_SLASH(35)
                    ATT_CRUSH(6)
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(35)
                    DEF_SLASH(38)
                    DEF_CRUSH(36)
                    DEF_MAGIC(-10)
                    DEF_RANGE(40)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Vesta's plateskirt (id: 22619)
        22619 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_STAB(30)
                    ATT_SLASH(30)
                    ATT_CRUSH(6)
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(27)
                    DEF_SLASH(30)
                    DEF_CRUSH(28)
                    DEF_MAGIC(-7)
                    DEF_RANGE(34)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Statius's warhammer (id: 22622)
        22622 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(123)
                    Bonuses.Bonus.STRENGTH(114)
                }
            }
        }

        // Statius's full helm (id: 22625)
        22625 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(15)
                    ATT_SLASH(15)
                    ATT_CRUSH(15)
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(20)
                    DEF_SLASH(25)
                    DEF_CRUSH(23)
                    DEF_MAGIC(-1)
                    DEF_RANGE(28)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Statius's platebody (id: 22628)
        22628 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_STAB(6)
                    ATT_SLASH(6)
                    ATT_CRUSH(35)
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(35)
                    DEF_SLASH(38)
                    DEF_CRUSH(36)
                    DEF_MAGIC(-10)
                    DEF_RANGE(40)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Statius's platelegs (id: 22631)
        22631 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_STAB(6)
                    ATT_SLASH(6)
                    ATT_CRUSH(30)
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(27)
                    DEF_SLASH(30)
                    DEF_CRUSH(28)
                    DEF_MAGIC(-7)
                    DEF_RANGE(34)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Morrigan's throwing axe (id: 22634)
        22634 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(93)
                    RANGE_STRENGTH(117)
                }
            }
        }

        // Morrigan's javelin (id: 22636)
        22636 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                    normalAttackDistance = 5
                    longAttackDistance = 7
                }
                bonuses {
                    ATT_RANGED(105)
                    RANGE_STRENGTH(145)
                }
            }
        }

        // Morrigan's coif (id: 22638)
        22638 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-5)
                    ATT_RANGED(10)
                    DEF_STAB(3)
                    DEF_SLASH(6)
                    DEF_CRUSH(8)
                    DEF_MAGIC(20)
                    DEF_RANGE(7)
                }
            }
        }

        // Morrigan's leather body (id: 22641)
        22641 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(40)
                    DEF_STAB(11)
                    DEF_SLASH(13)
                    DEF_CRUSH(16)
                    DEF_MAGIC(50)
                    DEF_RANGE(20)
                }
            }
        }

        // Morrigan's leather chaps (id: 22644)
        22644 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(24)
                    DEF_STAB(7)
                    DEF_SLASH(9)
                    DEF_CRUSH(11)
                    DEF_MAGIC(30)
                    DEF_RANGE(13)
                }
            }
        }

        // Zuriel's staff (id: 22647)
        22647 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(13)
                    ATT_SLASH(-1)
                    ATT_CRUSH(65)
                    ATT_MAGIC(18)
                    DEF_STAB(5)
                    DEF_SLASH(7)
                    DEF_CRUSH(4)
                    DEF_MAGIC(18)
                    Bonuses.Bonus.STRENGTH(72)
                    MAGIC_DAMAGE(10)
                }
            }
        }

        // Zuriel's hood (id: 22650)
        22650 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(7)
                    ATT_RANGED(-2)
                    DEF_STAB(3)
                    DEF_SLASH(2)
                    DEF_CRUSH(6)
                    DEF_MAGIC(4)
                    MAGIC_DAMAGE(3)
                }
            }
        }

        // Zuriel's robe top (id: 22653)
        22653 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(33)
                    ATT_RANGED(-10)
                    DEF_STAB(11)
                    DEF_SLASH(7)
                    DEF_CRUSH(13)
                    DEF_MAGIC(12)
                    MAGIC_DAMAGE(3)
                }
            }
        }

        // Zuriel's robe bottom (id: 22656)
        22656 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(24)
                    ATT_RANGED(-7)
                    DEF_STAB(7)
                    DEF_SLASH(5)
                    DEF_CRUSH(11)
                    DEF_MAGIC(8)
                    MAGIC_DAMAGE(3)
                }
            }
        }

        // Scythe of vitur (id: 22664)
        22664 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Armadyl godsword (id: 22665)
        22665 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Rubber chicken (id: 22666)
        22666 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Scroll sack (id: 22675)
        22675 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Eek (id: 22684)
        22684 {
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

        // Null (id: 22691)
        22691 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Clown bow tie (id: 22692)
        22692 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Clown gown (id: 22695)
        22695 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Clown trousers (id: 22698)
        22698 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Null (id: 22700)
        22700 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Clown shoes (id: 22701)
        22701 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Collection log (id: 22711)
        22711 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Tree top (id: 22715)
        22715 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Tree skirt (id: 22717)
        22717 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Candy cane (id: 22719)
        22719 {
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

        // Attacker icon (id: 22721)
        22721 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Attacker icon (id: 22722)
        22722 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Attacker icon (id: 22723)
        22723 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Collector icon (id: 22724)
        22724 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Defender icon (id: 22725)
        22725 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Defender icon (id: 22726)
        22726 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Defender icon (id: 22727)
        22727 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Defender icon (id: 22728)
        22728 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Attacker icon (id: 22729)
        22729 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Attacker icon (id: 22730)
        22730 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Dragon hasta (id: 22731)
        22731 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(55)
                    ATT_SLASH(55)
                    ATT_CRUSH(55)
                    DEF_STAB(-15)
                    DEF_SLASH(-15)
                    DEF_CRUSH(-12)
                    DEF_RANGE(-15)
                    Bonuses.Bonus.STRENGTH(60)
                }
            }
        }

        // Dragon hasta(p) (id: 22734)
        22734 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(55)
                    ATT_SLASH(55)
                    ATT_CRUSH(55)
                    DEF_STAB(-15)
                    DEF_SLASH(-15)
                    DEF_CRUSH(-12)
                    DEF_RANGE(-15)
                    Bonuses.Bonus.STRENGTH(60)
                }
            }
        }

        // Dragon hasta(p+) (id: 22737)
        22737 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(55)
                    ATT_SLASH(55)
                    ATT_CRUSH(55)
                    DEF_STAB(-15)
                    DEF_SLASH(-15)
                    DEF_CRUSH(-12)
                    DEF_RANGE(-15)
                    Bonuses.Bonus.STRENGTH(60)
                }
            }
        }

        // Dragon hasta(p++) (id: 22740)
        22740 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(55)
                    ATT_SLASH(55)
                    ATT_CRUSH(55)
                    DEF_STAB(-15)
                    DEF_SLASH(-15)
                    DEF_CRUSH(-12)
                    DEF_RANGE(-15)
                    Bonuses.Bonus.STRENGTH(60)
                }
            }
        }

        // Dragon hasta(kp) (id: 22743)
        22743 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(55)
                    ATT_SLASH(55)
                    ATT_CRUSH(55)
                    DEF_STAB(-15)
                    DEF_SLASH(-15)
                    DEF_CRUSH(-12)
                    DEF_RANGE(-15)
                    Bonuses.Bonus.STRENGTH(60)
                }
            }
        }

        // Dragon knife (id: 22804)
        22804 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(28)
                    RANGE_STRENGTH(30)
                }
            }
        }

        // Dragon knife(p) (id: 22806)
        22806 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(28)
                    RANGE_STRENGTH(30)
                }
            }
        }

        // Dragon knife(p+) (id: 22808)
        22808 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(28)
                    RANGE_STRENGTH(30)
                }
            }
        }

        // Dragon knife(p++) (id: 22810)
        22810 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(28)
                    RANGE_STRENGTH(30)
                }
            }
        }

        // Dragon knife (id: 22812)
        22812 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_RANGED(28)
                }
            }
        }

        // Dragon knife (id: 22814)
        22814 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_RANGED(28)
                }
            }
        }

        // Cormorant's glove (id: 22816)
        22816 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Cormorant's glove (id: 22817)
        22817 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Fish sack (id: 22838)
        22838 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Golden tench (id: 22840)
        22840 {
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

        // Pearl barbarian rod (id: 22842)
        22842 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
            }
        }

        // Pearl fly fishing rod (id: 22844)
        22844 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
            }
        }

        // Pearl fishing rod (id: 22846)
        22846 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
            }
        }

        // Rada's blessing 1 (id: 22941)
        22941 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
            }
        }

        // Rada's blessing 2 (id: 22943)
        22943 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    PRAYER(1)
                }
            }
        }

        // Rada's blessing 3 (id: 22945)
        22945 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    PRAYER(1)
                }
            }
        }

        // Rada's blessing 4 (id: 22947)
        22947 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    PRAYER(2)
                }
            }
        }

        // Boots of brimstone (id: 22951)
        22951 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_STAB(3)
                    ATT_MAGIC(3)
                    ATT_RANGED(5)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(10)
                    DEF_MAGIC(5)
                    DEF_RANGE(5)
                }
            }
        }

        // Devout boots (id: 22954)
        22954 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    PRAYER(5)
                }
            }
        }

        // Brimstone ring (id: 22975)
        22975 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(6)
                    ATT_RANGED(4)
                    DEF_STAB(4)
                    DEF_SLASH(4)
                    DEF_CRUSH(4)
                    DEF_MAGIC(6)
                    DEF_RANGE(4)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Dragon hunter lance (id: 22978)
        22978 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(85)
                    ATT_SLASH(65)
                    ATT_CRUSH(65)
                    Bonuses.Bonus.STRENGTH(70)
                }
            }
        }

        // Ferocious gloves (id: 22981)
        22981 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(16)
                    ATT_SLASH(16)
                    ATT_CRUSH(16)
                    ATT_MAGIC(-16)
                    ATT_RANGED(-16)
                    Bonuses.Bonus.STRENGTH(14)
                }
            }
        }

        // Bonecrusher necklace (id: 22986)
        22986 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(10)
                    ATT_CRUSH(10)
                    ATT_MAGIC(10)
                    ATT_RANGED(10)
                    DEF_STAB(2)
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                    DEF_MAGIC(2)
                    DEF_RANGE(2)
                    Bonuses.Bonus.STRENGTH(2)
                    PRAYER(12)
                }
            }
        }

        // Boots of stone (id: 23037)
        23037 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Mystic hat (dusk) (id: 23047)
        23047 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                }
            }
        }

        // Mystic robe top (dusk) (id: 23050)
        23050 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(20)
                    DEF_MAGIC(20)
                }
            }
        }

        // Mystic robe bottom (dusk) (id: 23053)
        23053 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_MAGIC(15)
                }
            }
        }

        // Mystic gloves (dusk) (id: 23056)
        23056 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Mystic boots (dusk) (id: 23059)
        23059 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Hydra slayer helmet (id: 23073)
        23073 {
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

        // Hydra slayer helmet (i) (id: 23075)
        23075 {
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

        // Ornate gloves (id: 23091)
        23091 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                }
            }
        }

        // Ornate boots (id: 23093)
        23093 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Ornate legs (id: 23095)
        23095 {
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

        // Ornate top (id: 23097)
        23097 {
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

        // Ornate cape (id: 23099)
        23099 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Ornate helm (id: 23101)
        23101 {
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

        // Birthday cake (id: 23108)
        23108 {
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

        // Oily pearl fishing rod (id: 23122)
        23122 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
            }
        }

        // Guthix d'hide shield (id: 23188)
        23188 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-15)
                    ATT_SLASH(-15)
                    ATT_CRUSH(-11)
                    ATT_MAGIC(-10)
                    ATT_RANGED(7)
                    DEF_STAB(21)
                    DEF_SLASH(18)
                    DEF_CRUSH(16)
                    DEF_MAGIC(15)
                    DEF_RANGE(14)
                    PRAYER(1)
                }
            }
        }

        // Saradomin d'hide shield (id: 23191)
        23191 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-15)
                    ATT_SLASH(-15)
                    ATT_CRUSH(-11)
                    ATT_MAGIC(-10)
                    ATT_RANGED(7)
                    DEF_STAB(21)
                    DEF_SLASH(18)
                    DEF_CRUSH(16)
                    DEF_MAGIC(15)
                    DEF_RANGE(14)
                    PRAYER(1)
                }
            }
        }

        // Zamorak d'hide shield (id: 23194)
        23194 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-15)
                    ATT_SLASH(-15)
                    ATT_CRUSH(-11)
                    ATT_MAGIC(-10)
                    ATT_RANGED(7)
                    DEF_STAB(21)
                    DEF_SLASH(18)
                    DEF_CRUSH(16)
                    DEF_MAGIC(15)
                    DEF_RANGE(14)
                    PRAYER(1)
                }
            }
        }

        // Ancient d'hide shield (id: 23197)
        23197 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-15)
                    ATT_SLASH(-15)
                    ATT_CRUSH(-11)
                    ATT_MAGIC(-10)
                    ATT_RANGED(7)
                    DEF_STAB(21)
                    DEF_SLASH(18)
                    DEF_CRUSH(16)
                    DEF_MAGIC(15)
                    DEF_RANGE(14)
                    PRAYER(1)
                }
            }
        }

        // Armadyl d'hide shield (id: 23200)
        23200 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-15)
                    ATT_SLASH(-15)
                    ATT_CRUSH(-11)
                    ATT_MAGIC(-10)
                    ATT_RANGED(7)
                    DEF_STAB(21)
                    DEF_SLASH(18)
                    DEF_CRUSH(16)
                    DEF_MAGIC(15)
                    DEF_RANGE(14)
                    PRAYER(1)
                }
            }
        }

        // Bandos d'hide shield (id: 23203)
        23203 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-15)
                    ATT_SLASH(-15)
                    ATT_CRUSH(-11)
                    ATT_MAGIC(-10)
                    ATT_RANGED(7)
                    DEF_STAB(21)
                    DEF_SLASH(18)
                    DEF_CRUSH(16)
                    DEF_MAGIC(15)
                    DEF_RANGE(14)
                    PRAYER(1)
                }
            }
        }

        // Dual sai (id: 23206)
        23206 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(11)
                    ATT_SLASH(8)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(14)
                }
            }
        }

        // Rune platebody (h1) (id: 23209)
        23209 {
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

        // Rune platebody (h2) (id: 23212)
        23212 {
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

        // Rune platebody (h3) (id: 23215)
        23215 {
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

        // Rune platebody (h4) (id: 23218)
        23218 {
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

        // Rune platebody (h5) (id: 23221)
        23221 {
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

        // Thieving bag (id: 23224)
        23224 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Rune defender (t) (id: 23230)
        23230 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(20)
                    ATT_SLASH(19)
                    ATT_CRUSH(18)
                    ATT_MAGIC(-3)
                    ATT_RANGED(-2)
                    DEF_STAB(20)
                    DEF_SLASH(19)
                    DEF_CRUSH(18)
                    DEF_MAGIC(-3)
                    DEF_RANGE(-2)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Tzhaar-ket-om (t) (id: 23235)
        23235 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_CRUSH(80)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(85)
                }
            }
        }

        // Berserker necklace (or) (id: 23240)
        23240 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(-10)
                    ATT_SLASH(-10)
                    ATT_CRUSH(-10)
                    DEF_STAB(-20)
                    DEF_SLASH(-20)
                    DEF_CRUSH(-20)
                    DEF_MAGIC(-20)
                    DEF_RANGE(-20)
                    Bonuses.Bonus.STRENGTH(7)
                    PRAYER(3)
                }
            }
        }

        // 3rd age plateskirt (id: 23242)
        23242 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-25)
                    ATT_RANGED(-2)
                    DEF_STAB(78)
                    DEF_SLASH(76)
                    DEF_CRUSH(83)
                    DEF_MAGIC(-5)
                    DEF_RANGE(75)
                }
            }
        }

        // Fremennik kilt (id: 23246)
        23246 {
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
                    Bonuses.Bonus.STRENGTH(1)
                }
            }
        }

        // Rangers' tights (id: 23249)
        23249 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(15)
                }
            }
        }

        // Gilded coif (id: 23258)
        23258 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-1)
                    ATT_RANGED(4)
                    DEF_STAB(4)
                    DEF_SLASH(7)
                    DEF_CRUSH(8)
                    DEF_MAGIC(4)
                    DEF_RANGE(6)
                }
            }
        }

        // Gilded d'hide vambraces (id: 23261)
        23261 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(8)
                    DEF_STAB(3)
                    DEF_SLASH(2)
                    DEF_CRUSH(4)
                    DEF_MAGIC(2)
                }
            }
        }

        // Gilded d'hide body (id: 23264)
        23264 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(15)
                    DEF_STAB(40)
                    DEF_SLASH(32)
                    DEF_CRUSH(45)
                    DEF_MAGIC(20)
                    DEF_RANGE(40)
                }
            }
        }

        // Gilded d'hide chaps (id: 23267)
        23267 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(8)
                    DEF_STAB(22)
                    DEF_SLASH(16)
                    DEF_CRUSH(24)
                    DEF_MAGIC(8)
                    DEF_RANGE(22)
                }
            }
        }

        // Gilded pickaxe (id: 23276)
        23276 {
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

        // Gilded axe (id: 23279)
        23279 {
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

        // Gilded spade (id: 23282)
        23282 {
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

        // Mole slippers (id: 23285)
        23285 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Frog slippers (id: 23288)
        23288 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Bear feet (id: 23291)
        23291 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Demon feet (id: 23294)
        23294 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Jester cape (id: 23297)
        23297 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Shoulder parrot (id: 23300)
        23300 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Monk's robe top (t) (id: 23303)
        23303 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    PRAYER(6)
                }
            }
        }

        // Monk's robe (t) (id: 23306)
        23306 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    PRAYER(5)
                }
            }
        }

        // Amulet of defence (t) (id: 23309)
        23309 {
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

        // Sandwich lady top (id: 23315)
        23315 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Sandwich lady bottom (id: 23318)
        23318 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Rune scimitar (id: 23330)
        23330 {
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

        // Rune scimitar (id: 23332)
        23332 {
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

        // Rune scimitar (id: 23334)
        23334 {
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

        // 3rd age druidic robe top (id: 23336)
        23336 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    PRAYER(8)
                }
            }
        }

        // 3rd age druidic robe bottoms (id: 23339)
        23339 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    PRAYER(6)
                }
            }
        }

        // 3rd age druidic staff (id: 23342)
        23342 {
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

        // 3rd age druidic cloak (id: 23345)
        23345 {
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

        // Cape of skulls (id: 23351)
        23351 {
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

        // Amulet of power (t) (id: 23354)
        23354 {
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

        // Rain bow (id: 23357)
        23357 {
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

        // Ham joint (id: 23360)
        23360 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                }
            }
        }

        // Staff of bob the cat (id: 23363)
        23363 {
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

        // Black platebody (h1) (id: 23366)
        23366 {
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

        // Black platebody (h2) (id: 23369)
        23369 {
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

        // Black platebody (h3) (id: 23372)
        23372 {
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

        // Black platebody (h4) (id: 23375)
        23375 {
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

        // Black platebody (h5) (id: 23378)
        23378 {
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

        // Leather body (g) (id: 23381)
        23381 {
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

        // Leather chaps (g) (id: 23384)
        23384 {
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

        // Spiked manacles (id: 23389)
        23389 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Adamant platebody (h1) (id: 23392)
        23392 {
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

        // Adamant platebody (h2) (id: 23395)
        23395 {
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

        // Adamant platebody (h3) (id: 23398)
        23398 {
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

        // Adamant platebody (h4) (id: 23401)
        23401 {
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

        // Adamant platebody (h5) (id: 23404)
        23404 {
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

        // Wolf cloak (id: 23410)
        23410 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Climbing boots (g) (id: 23413)
        23413 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Tormented bracelet (or) (id: 23444)
        23444 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(10)
                    PRAYER(2)
                    MAGIC_DAMAGE(5)
                }
            }
        }

        // Giant easter egg (id: 23446)
        23446 {
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

        // Enchanted lyre(i) (id: 23458)
        23458 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Attacker icon (id: 23460)
        23460 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Attacker icon (id: 23461)
        23461 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Attacker icon (id: 23462)
        23462 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Attacker icon (id: 23463)
        23463 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Attacker icon (id: 23464)
        23464 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Attacker icon (id: 23465)
        23465 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Defender icon (id: 23466)
        23466 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Defender icon (id: 23467)
        23467 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Defender icon (id: 23468)
        23468 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Defender icon (id: 23469)
        23469 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Defender icon (id: 23470)
        23470 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Collector icon (id: 23471)
        23471 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Collector icon (id: 23472)
        23472 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Collector icon (id: 23473)
        23473 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Collector icon (id: 23474)
        23474 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Collector icon (id: 23475)
        23475 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Collector icon (id: 23476)
        23476 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Collector icon (id: 23477)
        23477 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Healer icon (id: 23478)
        23478 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Healer icon (id: 23479)
        23479 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Healer icon (id: 23480)
        23480 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Healer icon (id: 23481)
        23481 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Healer icon (id: 23482)
        23482 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Healer icon (id: 23483)
        23483 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Healer icon (id: 23484)
        23484 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Healer icon (id: 23485)
        23485 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Healer icon (id: 23486)
        23486 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Mask of ranul (id: 23522)
        23522 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(2)
                    DEF_MAGIC(2)
                }
            }
        }

        // Sarachnis cudgel (id: 23528)
        23528 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(30)
                    ATT_CRUSH(70)
                    Bonuses.Bonus.STRENGTH(70)
                }
            }
        }

        // Helm of neitiznot (id: 23591)
        23591 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(31)
                    DEF_SLASH(29)
                    DEF_CRUSH(34)
                    DEF_MAGIC(3)
                    DEF_RANGE(30)
                    Bonuses.Bonus.STRENGTH(3)
                    PRAYER(3)
                }
            }
        }

        // Barrows gloves (id: 23593)
        23593 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(12)
                    ATT_SLASH(12)
                    ATT_CRUSH(12)
                    ATT_MAGIC(6)
                    ATT_RANGED(12)
                    DEF_STAB(12)
                    DEF_SLASH(12)
                    DEF_CRUSH(12)
                    DEF_MAGIC(6)
                    DEF_RANGE(12)
                    Bonuses.Bonus.STRENGTH(12)
                }
            }
        }

        // Berserker ring (i) (id: 23595)
        23595 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    DEF_CRUSH(8)
                    Bonuses.Bonus.STRENGTH(8)
                }
            }
        }

        // Dragon defender (id: 23597)
        23597 {
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

        // Spirit shield (id: 23599)
        23599 {
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

        // Rune crossbow (id: 23601)
        23601 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_RANGED(90)
                }
            }
        }

        // Imbued guthix cape (id: 23603)
        23603 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(15)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Imbued zamorak cape (id: 23605)
        23605 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(15)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Imbued saradomin cape (id: 23607)
        23607 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(15)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Ava's accumulator (id: 23609)
        23609 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_RANGED(4)
                    DEF_SLASH(1)
                    DEF_MAGIC(4)
                }
            }
        }

        // Armadyl crossbow (id: 23611)
        23611 {
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

        // Staff of the dead (id: 23613)
        23613 {
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

        // Vesta's longsword (id: 23615)
        23615 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(106)
                    ATT_SLASH(121)
                    ATT_CRUSH(-2)
                    DEF_STAB(1)
                    DEF_SLASH(4)
                    DEF_CRUSH(3)
                    Bonuses.Bonus.STRENGTH(118)
                }
            }
        }

        // Zuriel's staff (id: 23617)
        23617 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(13)
                    ATT_SLASH(-1)
                    ATT_CRUSH(65)
                    ATT_MAGIC(18)
                    DEF_STAB(5)
                    DEF_SLASH(7)
                    DEF_CRUSH(4)
                    DEF_MAGIC(18)
                    Bonuses.Bonus.STRENGTH(72)
                    MAGIC_DAMAGE(10)
                }
            }
        }

        // Morrigan's javelin (id: 23619)
        23619 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                    normalAttackDistance = 5
                    longAttackDistance = 7
                }
                bonuses {
                    ATT_RANGED(105)
                    RANGE_STRENGTH(145)
                }
            }
        }

        // Statius's warhammer (id: 23620)
        23620 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(123)
                    Bonuses.Bonus.STRENGTH(114)
                }
            }
        }

        // Infernal cape (id: 23622)
        23622 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(1)
                    ATT_RANGED(1)
                    DEF_STAB(12)
                    DEF_SLASH(12)
                    DEF_CRUSH(12)
                    DEF_MAGIC(12)
                    DEF_RANGE(12)
                    Bonuses.Bonus.STRENGTH(8)
                    PRAYER(2)
                }
            }
        }

        // Seers ring (i) (id: 23624)
        23624 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_MAGIC(12)
                    DEF_MAGIC(12)
                    MAGIC_DAMAGE(0)
                }
            }
        }

        // Kodai wand (id: 23626)
        23626 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    ATT_MAGIC(28)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(20)
                    MAGIC_DAMAGE(15)
                }
            }
        }

        // Ghrazi rapier (id: 23628)
        23628 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(94)
                    ATT_SLASH(55)
                    Bonuses.Bonus.STRENGTH(89)
                }
            }
        }

        // Heavy ballista (id: 23630)
        23630 {
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

        // Karil's leathertop (id: 23632)
        23632 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(30)
                    DEF_STAB(47)
                    DEF_SLASH(42)
                    DEF_CRUSH(50)
                    DEF_MAGIC(65)
                    DEF_RANGE(57)
                }
            }
        }

        // Dharok's platelegs (id: 23633)
        23633 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-7)
                    DEF_STAB(85)
                    DEF_SLASH(82)
                    DEF_CRUSH(83)
                    DEF_MAGIC(-4)
                    DEF_RANGE(92)
                }
            }
        }

        // Torag's platelegs (id: 23634)
        23634 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-7)
                    DEF_STAB(85)
                    DEF_SLASH(82)
                    DEF_CRUSH(83)
                    DEF_MAGIC(-4)
                    DEF_RANGE(92)
                }
            }
        }

        // Verac's plateskirt (id: 23635)
        23635 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-7)
                    DEF_STAB(85)
                    DEF_SLASH(82)
                    DEF_CRUSH(83)
                    DEF_RANGE(84)
                    PRAYER(4)
                }
            }
        }

        // Verac's helm (id: 23636)
        23636 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(55)
                    DEF_SLASH(58)
                    DEF_CRUSH(54)
                    DEF_RANGE(56)
                    PRAYER(3)
                }
            }
        }

        // Torag's helm (id: 23637)
        23637 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(55)
                    DEF_SLASH(58)
                    DEF_CRUSH(54)
                    DEF_MAGIC(-1)
                    DEF_RANGE(62)
                }
            }
        }

        // Guthan's helm (id: 23638)
        23638 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(55)
                    DEF_SLASH(58)
                    DEF_CRUSH(54)
                    DEF_MAGIC(-1)
                    DEF_RANGE(62)
                }
            }
        }

        // Dharok's helm (id: 23639)
        23639 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(45)
                    DEF_SLASH(48)
                    DEF_CRUSH(44)
                    DEF_MAGIC(-1)
                    DEF_RANGE(51)
                }
            }
        }

        // Amulet of fury (id: 23640)
        23640 {
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

        // Blessed spirit shield (id: 23642)
        23642 {
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

        // Eternal boots (id: 23644)
        23644 {
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

        // Bandos tassets (id: 23646)
        23646 {
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

        // Dragon javelin (id: 23648)
        23648 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(150)
                }
            }
        }

        // Diamond bolts (e) (id: 23649)
        23649 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(105)
                }
            }
        }

        // Mage's book (id: 23652)
        23652 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_MAGIC(15)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Ahrim's staff (id: 23653)
        23653 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(12)
                    ATT_SLASH(-1)
                    ATT_CRUSH(65)
                    ATT_MAGIC(15)
                    DEF_STAB(3)
                    DEF_SLASH(5)
                    DEF_CRUSH(2)
                    DEF_MAGIC(15)
                    Bonuses.Bonus.STRENGTH(68)
                    MAGIC_DAMAGE(5)
                }
            }
        }

        // Occult necklace (id: 23654)
        23654 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_MAGIC(12)
                    PRAYER(2)
                    MAGIC_DAMAGE(5)
                }
            }
        }

        // Crystal axe (id: 23673)
        23673 {
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

        // Crystal axe (inactive) (id: 23675)
        23675 {
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

        // Dragon pickaxe (or) (id: 23677)
        23677 {
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

        // Crystal pickaxe (id: 23680)
        23680 {
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

        // Crystal pickaxe (inactive) (id: 23682)
        23682 {
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

        // Crystal harpoon (id: 23762)
        23762 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(38)
                    ATT_SLASH(32)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(42)
                }
            }
        }

        // Crystal harpoon (inactive) (id: 23764)
        23764 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(38)
                    ATT_SLASH(32)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(42)
                }
            }
        }

        // Ardougne knight helm (id: 23785)
        23785 {
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

        // Ardougne knight platebody (id: 23787)
        23787 {
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

        // Ardougne knight platelegs (id: 23789)
        23789 {
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

        // Corrupted sceptre (id: 23820)
        23820 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(10)
                    ATT_CRUSH(16)
                    Bonuses.Bonus.STRENGTH(20)
                }
            }
        }

        // Corrupted axe (id: 23821)
        23821 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Corrupted pickaxe (id: 23822)
        23822 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Corrupted harpoon (id: 23823)
        23823 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Corrupted helm (basic) (id: 23840)
        23840 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(2)
                    ATT_SLASH(2)
                    ATT_CRUSH(1)
                    ATT_MAGIC(2)
                    ATT_RANGED(2)
                    DEF_STAB(28)
                    DEF_SLASH(28)
                    DEF_CRUSH(28)
                    DEF_MAGIC(28)
                    DEF_RANGE(28)
                    PRAYER(1)
                }
            }
        }

        // Corrupted helm (attuned) (id: 23841)
        23841 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(6)
                    ATT_SLASH(6)
                    ATT_CRUSH(2)
                    ATT_MAGIC(6)
                    ATT_RANGED(6)
                    DEF_STAB(48)
                    DEF_SLASH(48)
                    DEF_CRUSH(48)
                    DEF_MAGIC(48)
                    DEF_RANGE(48)
                    PRAYER(2)
                }
            }
        }

        // Corrupted helm (perfected) (id: 23842)
        23842 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(10)
                    ATT_CRUSH(3)
                    ATT_MAGIC(10)
                    ATT_RANGED(10)
                    DEF_STAB(68)
                    DEF_SLASH(68)
                    DEF_CRUSH(68)
                    DEF_MAGIC(68)
                    DEF_RANGE(68)
                    PRAYER(3)
                }
            }
        }

        // Corrupted body (basic) (id: 23843)
        23843 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(8)
                    ATT_CRUSH(3)
                    ATT_MAGIC(8)
                    ATT_RANGED(8)
                    DEF_STAB(86)
                    DEF_SLASH(86)
                    DEF_CRUSH(86)
                    DEF_MAGIC(86)
                    DEF_RANGE(86)
                    PRAYER(3)
                }
            }
        }

        // Corrupted body (attuned) (id: 23844)
        23844 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_STAB(12)
                    ATT_SLASH(12)
                    ATT_CRUSH(4)
                    ATT_MAGIC(12)
                    ATT_RANGED(12)
                    DEF_STAB(102)
                    DEF_SLASH(102)
                    DEF_CRUSH(102)
                    DEF_MAGIC(102)
                    DEF_RANGE(102)
                    PRAYER(4)
                }
            }
        }

        // Corrupted body (perfected) (id: 23845)
        23845 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_STAB(16)
                    ATT_SLASH(16)
                    ATT_CRUSH(5)
                    ATT_MAGIC(16)
                    ATT_RANGED(16)
                    DEF_STAB(124)
                    DEF_SLASH(124)
                    DEF_CRUSH(124)
                    DEF_MAGIC(124)
                    DEF_RANGE(124)
                    PRAYER(5)
                }
            }
        }

        // Corrupted legs (basic) (id: 23846)
        23846 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_STAB(6)
                    ATT_SLASH(6)
                    ATT_CRUSH(2)
                    ATT_MAGIC(6)
                    ATT_RANGED(6)
                    DEF_STAB(52)
                    DEF_SLASH(52)
                    DEF_CRUSH(52)
                    DEF_MAGIC(52)
                    DEF_RANGE(52)
                    PRAYER(2)
                }
            }
        }

        // Corrupted legs (attuned) (id: 23847)
        23847 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(10)
                    ATT_CRUSH(3)
                    ATT_MAGIC(10)
                    ATT_RANGED(10)
                    DEF_STAB(74)
                    DEF_SLASH(74)
                    DEF_CRUSH(74)
                    DEF_MAGIC(74)
                    DEF_RANGE(74)
                    PRAYER(3)
                }
            }
        }

        // Corrupted legs (perfected) (id: 23848)
        23848 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_STAB(14)
                    ATT_SLASH(14)
                    ATT_CRUSH(4)
                    ATT_MAGIC(14)
                    ATT_RANGED(14)
                    DEF_STAB(92)
                    DEF_SLASH(92)
                    DEF_CRUSH(92)
                    DEF_MAGIC(92)
                    DEF_RANGE(92)
                    PRAYER(4)
                }
            }
        }

        // Corrupted halberd (basic) (id: 23849)
        23849 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                    normalAttackDistance = 2
                    longAttackDistance = 4
                }
                bonuses {
                    ATT_STAB(68)
                    ATT_SLASH(68)
                    ATT_CRUSH(4)
                    Bonuses.Bonus.STRENGTH(42)
                    PRAYER(1)
                }
            }
        }

        // Corrupted halberd (attuned) (id: 23850)
        23850 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                    normalAttackDistance = 2
                    longAttackDistance = 4
                }
                bonuses {
                    ATT_STAB(114)
                    ATT_SLASH(114)
                    ATT_CRUSH(12)
                    Bonuses.Bonus.STRENGTH(88)
                    PRAYER(2)
                }
            }
        }

        // Corrupted halberd (perfected) (id: 23851)
        23851 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                    normalAttackDistance = 2
                    longAttackDistance = 4
                }
                bonuses {
                    ATT_STAB(166)
                    ATT_SLASH(166)
                    ATT_CRUSH(28)
                    Bonuses.Bonus.STRENGTH(138)
                    PRAYER(3)
                }
            }
        }

        // Corrupted staff (basic) (id: 23852)
        23852 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_MAGIC(84)
                    PRAYER(1)
                }
            }
        }

        // Corrupted staff (attuned) (id: 23853)
        23853 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_MAGIC(128)
                    PRAYER(2)
                }
            }
        }

        // Corrupted staff (perfected) (id: 23854)
        23854 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_MAGIC(184)
                    PRAYER(3)
                }
            }
        }

        // Corrupted bow (basic) (id: 23855)
        23855 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(72)
                    PRAYER(1)
                    RANGE_STRENGTH(42)
                }
            }
        }

        // Corrupted bow (attuned) (id: 23856)
        23856 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(118)
                    PRAYER(2)
                    RANGE_STRENGTH(88)
                }
            }
        }

        // Corrupted bow (perfected) (id: 23857)
        23857 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(172)
                    PRAYER(3)
                    RANGE_STRENGTH(138)
                }
            }
        }

        // Gauntlet cape (id: 23859)
        23859 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Crystal sceptre (id: 23861)
        23861 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(10)
                    ATT_CRUSH(16)
                    Bonuses.Bonus.STRENGTH(20)
                }
            }
        }

        // Crystal axe (id: 23862)
        23862 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Crystal pickaxe (id: 23863)
        23863 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Crystal harpoon (id: 23864)
        23864 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Crystal helm (basic) (id: 23886)
        23886 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(2)
                    ATT_SLASH(2)
                    ATT_CRUSH(1)
                    ATT_MAGIC(2)
                    ATT_RANGED(2)
                    DEF_STAB(28)
                    DEF_SLASH(28)
                    DEF_CRUSH(28)
                    DEF_MAGIC(28)
                    DEF_RANGE(28)
                    PRAYER(1)
                }
            }
        }

        // Crystal helm (attuned) (id: 23887)
        23887 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(6)
                    ATT_SLASH(6)
                    ATT_CRUSH(2)
                    ATT_MAGIC(6)
                    ATT_RANGED(6)
                    DEF_STAB(48)
                    DEF_SLASH(48)
                    DEF_CRUSH(48)
                    DEF_MAGIC(48)
                    DEF_RANGE(48)
                    PRAYER(2)
                }
            }
        }

        // Crystal helm (perfected) (id: 23888)
        23888 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(10)
                    ATT_CRUSH(3)
                    ATT_MAGIC(10)
                    ATT_RANGED(10)
                    DEF_STAB(68)
                    DEF_SLASH(68)
                    DEF_CRUSH(68)
                    DEF_MAGIC(68)
                    DEF_RANGE(68)
                    PRAYER(3)
                }
            }
        }

        // Crystal body (basic) (id: 23889)
        23889 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(8)
                    ATT_CRUSH(3)
                    ATT_MAGIC(8)
                    ATT_RANGED(8)
                    DEF_STAB(86)
                    DEF_SLASH(86)
                    DEF_CRUSH(86)
                    DEF_MAGIC(86)
                    DEF_RANGE(86)
                    PRAYER(3)
                }
            }
        }

        // Crystal body (attuned) (id: 23890)
        23890 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_STAB(12)
                    ATT_SLASH(12)
                    ATT_CRUSH(4)
                    ATT_MAGIC(12)
                    ATT_RANGED(12)
                    DEF_STAB(102)
                    DEF_SLASH(102)
                    DEF_CRUSH(102)
                    DEF_MAGIC(102)
                    DEF_RANGE(102)
                    PRAYER(4)
                }
            }
        }

        // Crystal body (perfected) (id: 23891)
        23891 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_STAB(16)
                    ATT_SLASH(16)
                    ATT_CRUSH(5)
                    ATT_MAGIC(16)
                    ATT_RANGED(16)
                    DEF_STAB(124)
                    DEF_SLASH(124)
                    DEF_CRUSH(124)
                    DEF_MAGIC(124)
                    DEF_RANGE(124)
                    PRAYER(5)
                }
            }
        }

        // Crystal legs (basic) (id: 23892)
        23892 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_STAB(6)
                    ATT_SLASH(6)
                    ATT_CRUSH(2)
                    ATT_MAGIC(6)
                    ATT_RANGED(6)
                    DEF_STAB(52)
                    DEF_SLASH(52)
                    DEF_CRUSH(52)
                    DEF_MAGIC(52)
                    DEF_RANGE(52)
                    PRAYER(2)
                }
            }
        }

        // Crystal legs (attuned) (id: 23893)
        23893 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(10)
                    ATT_CRUSH(3)
                    ATT_MAGIC(10)
                    ATT_RANGED(10)
                    DEF_STAB(74)
                    DEF_SLASH(74)
                    DEF_CRUSH(74)
                    DEF_MAGIC(74)
                    DEF_RANGE(74)
                    PRAYER(3)
                }
            }
        }

        // Crystal legs (perfected) (id: 23894)
        23894 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_STAB(14)
                    ATT_SLASH(14)
                    ATT_CRUSH(4)
                    ATT_MAGIC(14)
                    ATT_RANGED(14)
                    DEF_STAB(92)
                    DEF_SLASH(92)
                    DEF_CRUSH(92)
                    DEF_MAGIC(92)
                    DEF_RANGE(92)
                    PRAYER(4)
                }
            }
        }

        // Crystal halberd (basic) (id: 23895)
        23895 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                    normalAttackDistance = 2
                    longAttackDistance = 4
                }
                bonuses {
                    ATT_STAB(68)
                    ATT_SLASH(68)
                    ATT_CRUSH(4)
                    Bonuses.Bonus.STRENGTH(42)
                    PRAYER(1)
                }
            }
        }

        // Crystal halberd (attuned) (id: 23896)
        23896 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                    normalAttackDistance = 2
                    longAttackDistance = 4
                }
                bonuses {
                    ATT_STAB(114)
                    ATT_SLASH(114)
                    ATT_CRUSH(12)
                    Bonuses.Bonus.STRENGTH(88)
                    PRAYER(2)
                }
            }
        }

        // Crystal halberd (perfected) (id: 23897)
        23897 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                    normalAttackDistance = 2
                    longAttackDistance = 4
                }
                bonuses {
                    ATT_STAB(166)
                    ATT_SLASH(166)
                    ATT_CRUSH(28)
                    Bonuses.Bonus.STRENGTH(138)
                    PRAYER(3)
                }
            }
        }

        // Crystal staff (basic) (id: 23898)
        23898 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_MAGIC(84)
                    PRAYER(1)
                }
            }
        }

        // Crystal staff (attuned) (id: 23899)
        23899 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_MAGIC(128)
                    PRAYER(2)
                }
            }
        }

        // Crystal staff (perfected) (id: 23900)
        23900 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_MAGIC(184)
                    PRAYER(3)
                }
            }
        }

        // Crystal bow (basic) (id: 23901)
        23901 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(72)
                    PRAYER(1)
                    RANGE_STRENGTH(42)
                }
            }
        }

        // Crystal bow (attuned) (id: 23902)
        23902 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(118)
                    PRAYER(2)
                    RANGE_STRENGTH(88)
                }
            }
        }

        // Crystal bow (perfected) (id: 23903)
        23903 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(172)
                    PRAYER(3)
                    RANGE_STRENGTH(138)
                }
            }
        }

        // Imbued tephra (id: 23907)
        23907 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Elven signet (id: 23943)
        23943 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Crystal helm (id: 23971)
        23971 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(9)
                    DEF_STAB(12)
                    DEF_SLASH(8)
                    DEF_CRUSH(14)
                    DEF_MAGIC(10)
                    DEF_RANGE(18)
                    PRAYER(2)
                }
            }
        }

        // Crystal helm (inactive) (id: 23973)
        23973 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
            }
        }

        // Crystal body (id: 23975)
        23975 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-18)
                    ATT_RANGED(31)
                    DEF_STAB(46)
                    DEF_SLASH(38)
                    DEF_CRUSH(48)
                    DEF_MAGIC(44)
                    DEF_RANGE(68)
                    PRAYER(3)
                }
            }
        }

        // Crystal body (inactive) (id: 23977)
        23977 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Crystal legs (id: 23979)
        23979 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-12)
                    ATT_RANGED(18)
                    DEF_STAB(26)
                    DEF_SLASH(21)
                    DEF_CRUSH(30)
                    DEF_MAGIC(34)
                    DEF_RANGE(38)
                    PRAYER(2)
                }
            }
        }

        // Crystal legs (inactive) (id: 23981)
        23981 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Crystal bow (id: 23983)
        23983 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(100)
                    RANGE_STRENGTH(78)
                }
            }
        }

        // Crystal bow (inactive) (id: 23985)
        23985 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
            }
        }

        // Crystal halberd (id: 23987)
        23987 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                    normalAttackDistance = 2
                    longAttackDistance = 4
                }
                bonuses {
                    ATT_STAB(85)
                    ATT_SLASH(110)
                    ATT_CRUSH(5)
                    ATT_MAGIC(-4)
                    DEF_STAB(-1)
                    DEF_SLASH(4)
                    DEF_CRUSH(5)
                    Bonuses.Bonus.STRENGTH(118)
                }
            }
        }

        // Crystal halberd (inactive) (id: 23989)
        23989 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
            }
        }

        // Crystal shield (id: 23991)
        23991 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(-10)
                    DEF_STAB(51)
                    DEF_SLASH(54)
                    DEF_CRUSH(53)
                    DEF_RANGE(80)
                }
            }
        }

        // Crystal shield (inactive) (id: 23993)
        23993 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Blade of saeldor (id: 23995)
        23995 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(55)
                    ATT_SLASH(94)
                    Bonuses.Bonus.STRENGTH(89)
                }
            }
        }

        // Blade of saeldor (inactive) (id: 23997)
        23997 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
            }
        }

        // Crystal grail (id: 24000)
        24000 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Elven boots (id: 24003)
        24003 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Elven gloves (id: 24006)
        24006 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

    }
}
