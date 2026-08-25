package com.near_reality.plugins.item.definitions

import com.near_reality.scripts.item.definitions.ItemDefinitionsScript
import com.zenyte.game.world.entity.player.Bonuses
import com.zenyte.game.world.entity.player.Bonuses.Bonus.*
import com.zenyte.game.world.entity.player.container.impl.equipment.EquipmentSlot

class Rev239Items8 : ItemDefinitionsScript() {
    init {
        // Raging echoes rune trophy (id: 30467)
        30467 {
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

        // Raging echoes adamant trophy (id: 30469)
        30469 {
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

        // Raging echoes mithril trophy (id: 30471)
        30471 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Raging echoes steel trophy (id: 30473)
        30473 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Raging echoes iron trophy (id: 30475)
        30475 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Raging echoes bronze trophy (id: 30477)
        30477 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Festive scarf (id: 30489)
        30489 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Dog boots (id: 30491)
        30491 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Echo ahrim's hood 100 (id: 30519)
        30519 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(6)
                    ATT_RANGED(-2)
                    DEF_STAB(15)
                    DEF_SLASH(13)
                    DEF_CRUSH(16)
                    DEF_MAGIC(6)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Echo ahrim's robetop 100 (id: 30521)
        30521 {
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

        // Echo ahrim's robeskirt 100 (id: 30523)
        30523 {
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

        // Echo ahrim's hood 75 (id: 30525)
        30525 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(6)
                    ATT_RANGED(-2)
                    DEF_STAB(15)
                    DEF_SLASH(13)
                    DEF_CRUSH(16)
                    DEF_MAGIC(6)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Echo ahrim's robetop 75 (id: 30527)
        30527 {
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

        // Echo ahrim's robeskirt 75 (id: 30529)
        30529 {
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

        // Echo ahrim's hood 50 (id: 30531)
        30531 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(6)
                    ATT_RANGED(-2)
                    DEF_STAB(15)
                    DEF_SLASH(13)
                    DEF_CRUSH(16)
                    DEF_MAGIC(6)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Echo ahrim's robetop 50 (id: 30533)
        30533 {
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

        // Echo ahrim's robeskirt 50 (id: 30535)
        30535 {
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

        // Echo ahrim's hood 25 (id: 30537)
        30537 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(6)
                    ATT_RANGED(-2)
                    DEF_STAB(15)
                    DEF_SLASH(13)
                    DEF_CRUSH(16)
                    DEF_MAGIC(6)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Echo ahrim's robetop 25 (id: 30539)
        30539 {
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

        // Echo ahrim's robeskirt 25 (id: 30541)
        30541 {
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

        // Echo ahrim's robetop 0 (id: 30545)
        30545 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Echo ahrim's robeskirt 0 (id: 30547)
        30547 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Echo ahrim's staff (id: 30568)
        30568 {
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

        // Echo ahrim's staff 100 (id: 30570)
        30570 {
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

        // Echo ahrim's staff 75 (id: 30571)
        30571 {
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

        // Echo ahrim's staff 50 (id: 30572)
        30572 {
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

        // Echo ahrim's staff 25 (id: 30573)
        30573 {
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

        // Echo ahrim's staff 0 (id: 30574)
        30574 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Collection log (id: 30579)
        30579 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Collection log (id: 30581)
        30581 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Collection log (id: 30583)
        30583 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Collection log (id: 30585)
        30585 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Collection log (id: 30587)
        30587 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Collection log (id: 30589)
        30589 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Collection log (id: 30591)
        30591 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Collection log (id: 30593)
        30593 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Collection log (id: 30595)
        30595 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Bronze staff of collection (id: 30597)
        30597 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Iron staff of collection (id: 30599)
        30599 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Steel staff of collection (id: 30601)
        30601 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Black staff of collection (id: 30603)
        30603 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Mithril staff of collection (id: 30605)
        30605 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Adamant staff of collection (id: 30607)
        30607 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Rune staff of collection (id: 30609)
        30609 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Dragon staff of collection (id: 30611)
        30611 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Gilded staff of collection (id: 30613)
        30613 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Twinflame staff (id: 30634)
        30634 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
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
                    Bonuses.Bonus.STRENGTH(22)
                }
            }
        }

        // Giantsoul amulet (uncharged) (id: 30637)
        30637 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Giantsoul amulet (id: 30638)
        30638 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Classic imp tail (id: 30646)
        30646 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Castle wars arrow (id: 30694)
        30694 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(60)
                }
            }
        }

        // Castle wars bolts (id: 30696)
        30696 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Carrot costume body (id: 30722)
        30722 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Carrot costume tights (id: 30724)
        30724 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Carrot costume gloves (id: 30726)
        30726 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Oathplate helm (id: 30750)
        30750 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_SLASH(10)
                    ATT_MAGIC(-2)
                    ATT_RANGED(-7)
                    DEF_STAB(50)
                    DEF_SLASH(72)
                    DEF_CRUSH(45)
                    DEF_RANGE(50)
                    Bonuses.Bonus.STRENGTH(6)
                }
            }
        }

        // Oathplate chest (id: 30753)
        30753 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_SLASH(16)
                    ATT_MAGIC(-16)
                    ATT_RANGED(-18)
                    DEF_STAB(105)
                    DEF_SLASH(128)
                    DEF_CRUSH(100)
                    DEF_MAGIC(-5)
                    DEF_RANGE(112)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Oathplate legs (id: 30756)
        30756 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_SLASH(12)
                    ATT_MAGIC(-12)
                    ATT_RANGED(-14)
                    DEF_STAB(75)
                    DEF_SLASH(100)
                    DEF_CRUSH(73)
                    DEF_MAGIC(-3)
                    DEF_RANGE(81)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Soulflame horn (id: 30759)
        30759 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(2)
                    ATT_CRUSH(21)
                    DEF_SLASH(7)
                    DEF_CRUSH(3)
                    DEF_MAGIC(11)
                    Bonuses.Bonus.STRENGTH(23)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Radiant oathplate helm (id: 30777)
        30777 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_SLASH(10)
                    ATT_MAGIC(-2)
                    ATT_RANGED(-7)
                    DEF_STAB(50)
                    DEF_SLASH(72)
                    DEF_CRUSH(45)
                    DEF_RANGE(50)
                    Bonuses.Bonus.STRENGTH(6)
                }
            }
        }

        // Radiant oathplate chest (id: 30779)
        30779 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_SLASH(16)
                    ATT_MAGIC(-16)
                    ATT_RANGED(-18)
                    DEF_STAB(105)
                    DEF_SLASH(128)
                    DEF_CRUSH(100)
                    DEF_MAGIC(-5)
                    DEF_RANGE(112)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Radiant oathplate legs (id: 30781)
        30781 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_SLASH(12)
                    ATT_MAGIC(-12)
                    ATT_RANGED(-14)
                    DEF_STAB(75)
                    DEF_SLASH(100)
                    DEF_CRUSH(73)
                    DEF_MAGIC(-3)
                    DEF_RANGE(81)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        //  (id: 30872)
        30872 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Keris partisan of amascut (id: 30891)
        30891 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(58)
                    ATT_SLASH(-2)
                    ATT_CRUSH(57)
                    ATT_MAGIC(2)
                    Bonuses.Bonus.STRENGTH(45)
                    PRAYER(3)
                }
            }
        }

        // Steel ring (id: 30895)
        30895 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    DEF_STAB(24)
                    DEF_SLASH(24)
                    DEF_CRUSH(24)
                }
            }
        }

        // Potato sack (id: 30947)
        30947 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(-1)
                    ATT_SLASH(-1)
                    ATT_CRUSH(-1)
                    ATT_MAGIC(-1)
                    ATT_RANGED(-1)
                }
            }
        }

        // Arkan blade (id: 30955)
        30955 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(55)
                    ATT_SLASH(70)
                    Bonuses.Bonus.STRENGTH(64)
                    PRAYER(1)
                }
            }
        }

        // Earthbound tecpatl (id: 30957)
        30957 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(72)
                    ATT_SLASH(11)
                    Bonuses.Bonus.STRENGTH(64)
                    PRAYER(2)
                }
            }
        }

        // Egg (id: 30970)
        30970 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Fletching knife (id: 31043)
        31043 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Redwood hiking staff (id: 31049)
        31049 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(10)
                }
            }
        }

        // Antler guard (id: 31081)
        31081 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(15)
                    ATT_SLASH(15)
                    ATT_CRUSH(15)
                    ATT_MAGIC(9)
                    ATT_RANGED(9)
                    DEF_STAB(-15)
                    DEF_SLASH(-15)
                    DEF_CRUSH(-15)
                    DEF_MAGIC(-15)
                    DEF_RANGE(-15)
                    Bonuses.Bonus.STRENGTH(5)
                    PRAYER(5)
                }
            }
        }

        // Avernic treads (id: 31088)
        31088 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(5)
                    ATT_CRUSH(5)
                    ATT_MAGIC(11)
                    ATT_RANGED(15)
                    DEF_STAB(21)
                    DEF_SLASH(25)
                    DEF_CRUSH(25)
                    DEF_MAGIC(10)
                    DEF_RANGE(10)
                    Bonuses.Bonus.STRENGTH(4)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Avernic treads (pr) (id: 31091)
        31091 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(5)
                    ATT_CRUSH(5)
                    ATT_MAGIC(11)
                    ATT_RANGED(15)
                    DEF_STAB(21)
                    DEF_SLASH(25)
                    DEF_CRUSH(25)
                    DEF_MAGIC(10)
                    DEF_RANGE(10)
                    Bonuses.Bonus.STRENGTH(6)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Avernic treads (pe) (id: 31092)
        31092 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(5)
                    ATT_CRUSH(5)
                    ATT_MAGIC(11)
                    ATT_RANGED(15)
                    DEF_STAB(21)
                    DEF_SLASH(25)
                    DEF_CRUSH(25)
                    DEF_MAGIC(10)
                    DEF_RANGE(10)
                    Bonuses.Bonus.STRENGTH(4)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Avernic treads (et) (id: 31093)
        31093 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(5)
                    ATT_CRUSH(5)
                    ATT_MAGIC(11)
                    ATT_RANGED(15)
                    DEF_STAB(21)
                    DEF_SLASH(25)
                    DEF_CRUSH(25)
                    DEF_MAGIC(10)
                    DEF_RANGE(10)
                    Bonuses.Bonus.STRENGTH(4)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Avernic treads (pr)(pe) (id: 31094)
        31094 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(5)
                    ATT_CRUSH(5)
                    ATT_MAGIC(11)
                    ATT_RANGED(15)
                    DEF_STAB(21)
                    DEF_SLASH(25)
                    DEF_CRUSH(25)
                    DEF_MAGIC(10)
                    DEF_RANGE(10)
                    Bonuses.Bonus.STRENGTH(6)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Avernic treads (pr)(et) (id: 31095)
        31095 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(5)
                    ATT_CRUSH(5)
                    ATT_MAGIC(11)
                    ATT_RANGED(15)
                    DEF_STAB(21)
                    DEF_SLASH(25)
                    DEF_CRUSH(25)
                    DEF_MAGIC(10)
                    DEF_RANGE(10)
                    Bonuses.Bonus.STRENGTH(6)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Avernic treads (pe)(et) (id: 31096)
        31096 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(5)
                    ATT_CRUSH(5)
                    ATT_MAGIC(11)
                    ATT_RANGED(15)
                    DEF_STAB(21)
                    DEF_SLASH(25)
                    DEF_CRUSH(25)
                    DEF_MAGIC(10)
                    DEF_RANGE(10)
                    Bonuses.Bonus.STRENGTH(4)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Avernic treads (max) (id: 31097)
        31097 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(5)
                    ATT_CRUSH(5)
                    ATT_MAGIC(11)
                    ATT_RANGED(15)
                    DEF_STAB(21)
                    DEF_SLASH(25)
                    DEF_CRUSH(25)
                    DEF_MAGIC(10)
                    DEF_RANGE(10)
                    Bonuses.Bonus.STRENGTH(6)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Confliction gauntlets (id: 31106)
        31106 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(20)
                    ATT_RANGED(-4)
                    DEF_STAB(15)
                    DEF_SLASH(18)
                    DEF_CRUSH(7)
                    DEF_MAGIC(5)
                    DEF_RANGE(5)
                    PRAYER(2)
                    MAGIC_DAMAGE(7)
                }
            }
        }

        // Eye of ayak (id: 31113)
        31113 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 6
                    longAttackDistance = 8
                }
                bonuses {
                    ATT_MAGIC(30)
                    DEF_STAB(1)
                    DEF_SLASH(5)
                    DEF_CRUSH(5)
                    DEF_MAGIC(10)
                    PRAYER(2)
                }
            }
        }

        // Eye of ayak (uncharged) (id: 31115)
        31115 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 6
                    longAttackDistance = 8
                }
                bonuses {
                    ATT_MAGIC(30)
                    DEF_STAB(1)
                    DEF_SLASH(5)
                    DEF_CRUSH(5)
                    DEF_MAGIC(10)
                    PRAYER(2)
                }
            }
        }

        // Dinh's blazing bulwark (id: 31132)
        31132 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Venator bow (id: 31133)
        31133 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 6
                    longAttackDistance = 8
                }
            }
        }

        // Battlehat (id: 31172)
        31172 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(15)
                    ATT_SLASH(15)
                    ATT_CRUSH(15)
                    ATT_MAGIC(15)
                    ATT_RANGED(15)
                    DEF_STAB(60)
                    DEF_SLASH(60)
                    DEF_CRUSH(60)
                    DEF_MAGIC(60)
                    DEF_RANGE(60)
                    Bonuses.Bonus.STRENGTH(10)
                    PRAYER(10)
                    MAGIC_DAMAGE(5)
                }
            }
        }

        // Grid master tabard (id: 31181)
        31181 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Grid master tabard (b) (id: 31184)
        31184 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Grid master tabard (p) (id: 31187)
        31187 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Grid master tabard (g) (id: 31190)
        31190 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Swords and emblem (id: 31193)
        31193 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Swords and emblem (b) (id: 31196)
        31196 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Swords and emblem (p) (id: 31199)
        31199 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Swords and emblem (g) (id: 31202)
        31202 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Spooky pumpkin lantern (id: 31227)
        31227 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Grim reaper top (id: 31229)
        31229 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Grim reaper bottoms (id: 31231)
        31231 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Grim reaper gloves (id: 31233)
        31233 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Horn of plenty (id: 31241)
        31241 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Horn of plenty (empty) (id: 31243)
        31243 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Belle's folly (id: 31248)
        31248 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(100)
                    ATT_SLASH(78)
                    ATT_CRUSH(-3)
                    DEF_STAB(20)
                    DEF_SLASH(15)
                    DEF_CRUSH(-9)
                    Bonuses.Bonus.STRENGTH(102)
                }
            }
        }

        // Sailing cape (id: 31288)
        31288 {
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

        // Sailing cape(t) (id: 31290)
        31290 {
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

        // Deep sea apparatus (id: 31300)
        31300 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Mayor of catherby (id: 31331)
        31331 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Prison uniform top (id: 31353)
        31353 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Prison uniform trousers (id: 31355)
        31355 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Fishy prison uniform top (id: 31357)
        31357 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Tin cup (id: 31359)
        31359 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Tin cup (id: 31361)
        31361 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Vacuum pump and gull (id: 31373)
        31373 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Tortugan shield (id: 31398)
        31398 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_STAB(8)
                    DEF_SLASH(8)
                    DEF_CRUSH(6)
                    DEF_RANGE(8)
                }
            }
        }

        // Deep sea apparatus (id: 31403)
        31403 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Camphor blowpipe (id: 31575)
        31575 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 3
                    normalAttackDistance = 5
                    longAttackDistance = 7
                }
                bonuses {
                    ATT_RANGED(12)
                    RANGE_STRENGTH(2)
                }
            }
        }

        // Camphor blowpipe (empty) (id: 31577)
        31577 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 3
                    normalAttackDistance = 5
                    longAttackDistance = 7
                }
                bonuses {
                    ATT_RANGED(12)
                    RANGE_STRENGTH(2)
                }
            }
        }

        // Ironwood blowpipe (id: 31579)
        31579 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 3
                    normalAttackDistance = 5
                    longAttackDistance = 7
                }
                bonuses {
                    ATT_RANGED(16)
                    RANGE_STRENGTH(4)
                }
            }
        }

        // Ironwood blowpipe (empty) (id: 31581)
        31581 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 3
                    normalAttackDistance = 5
                    longAttackDistance = 7
                }
                bonuses {
                    ATT_RANGED(16)
                    RANGE_STRENGTH(4)
                }
            }
        }

        // Rosewood blowpipe (id: 31583)
        31583 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 3
                    normalAttackDistance = 5
                    longAttackDistance = 7
                }
                bonuses {
                    ATT_RANGED(22)
                    RANGE_STRENGTH(6)
                }
            }
        }

        // Rosewood blowpipe (empty) (id: 31585)
        31585 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 3
                    normalAttackDistance = 5
                    longAttackDistance = 7
                }
                bonuses {
                    ATT_RANGED(22)
                    RANGE_STRENGTH(6)
                }
            }
        }

        // Storm cruiser's coat (id: 31738)
        31738 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Storm cruiser's trousers (id: 31740)
        31740 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Storm cruiser's shoes (id: 31742)
        31742 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Swamp cruiser's jacket (id: 31750)
        31750 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Swamp cruiser's trousers (id: 31752)
        31752 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Swamp cruiser's shoes (id: 31754)
        31754 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Crystal glider's jacket (id: 31762)
        31762 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Crystal glider's trousers (id: 31764)
        31764 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Crystal glider's shoes (id: 31766)
        31766 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Medallion of the deep (id: 32386)
        32386 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Sailors' amulet (inert) (id: 32398)
        32398 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Sailors' amulet (id: 32399)
        32399 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Crate of adamantite ore (id: 32435)
        32435 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of crab paste (id: 32436)
        32436 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of crystal seeds (id: 32437)
        32437 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of daggers (id: 32438)
        32438 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of dyes (id: 32439)
        32439 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of furs (id: 32440)
        32440 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of jewellery (id: 32441)
        32441 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of lead ore (id: 32442)
        32442 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of monkfish (id: 32443)
        32443 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of nickel ore (id: 32444)
        32444 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of pest remains (id: 32445)
        32445 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of platebodies (id: 32446)
        32446 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of spears (id: 32447)
        32447 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of arrowtips (id: 32448)
        32448 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of bananas (id: 32449)
        32449 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of crystal seeds (id: 32450)
        32450 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32451)
        32451 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of furs (id: 32452)
        32452 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of gold ore (id: 32453)
        32453 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of halberds (id: 32454)
        32454 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of jewellery (id: 32455)
        32455 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of poison (id: 32456)
        32456 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of rabbit meat (id: 32457)
        32457 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of red coral (id: 32458)
        32458 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of runes (id: 32459)
        32459 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of salamanders (id: 32460)
        32460 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of sand (id: 32461)
        32461 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of silk (id: 32462)
        32462 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of spices (id: 32463)
        32463 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of bear meat (id: 32464)
        32464 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of beer (id: 32465)
        32465 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of cacti (id: 32466)
        32466 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of camphor logs (id: 32467)
        32467 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of compost (id: 32468)
        32468 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32469)
        32469 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of gems (id: 32470)
        32470 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of iron bars (id: 32471)
        32471 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of jewellery (id: 32472)
        32472 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of machinery parts (id: 32473)
        32473 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of rum (id: 32474)
        32474 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of sandstone (id: 32475)
        32475 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of silver ore (id: 32476)
        32476 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of spices (id: 32477)
        32477 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of vodka (id: 32478)
        32478 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of wine (id: 32479)
        32479 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of gold bars (id: 32480)
        32480 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of secret stuff (id: 32481)
        32481 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of arrowtips (id: 32482)
        32482 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of bait (id: 32483)
        32483 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of feathers (id: 32484)
        32484 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of bananas (id: 32485)
        32485 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of coconuts (id: 32486)
        32486 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of furs (id: 32487)
        32487 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of glassmaking supplies (id: 32488)
        32488 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of gold ore (id: 32489)
        32489 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of grog (id: 32490)
        32490 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of javelins (id: 32491)
        32491 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of jewellery (id: 32492)
        32492 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of karambwans (id: 32493)
        32493 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of pineapples (id: 32494)
        32494 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of potatoes (id: 32495)
        32495 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of seeds (id: 32496)
        32496 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of silk (id: 32497)
        32497 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of silver ore (id: 32498)
        32498 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of vials (id: 32499)
        32499 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of astral runes (id: 32500)
        32500 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of books (id: 32501)
        32501 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of coral (id: 32502)
        32502 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32503)
        32503 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fruit (id: 32504)
        32504 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of gems (id: 32505)
        32505 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of historical artefacts (id: 32506)
        32506 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of nickel ore (id: 32507)
        32507 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of oranges (id: 32508)
        32508 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of ores (id: 32509)
        32509 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of pineapples (id: 32510)
        32510 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of red coral (id: 32511)
        32511 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of runes (id: 32512)
        32512 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of seeds (id: 32513)
        32513 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of ship parts (id: 32514)
        32514 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of spices (id: 32515)
        32515 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of staffs (id: 32516)
        32516 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of tokens (id: 32517)
        32517 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of vegetables (id: 32518)
        32518 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of arrowtips (id: 32519)
        32519 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of bear meat (id: 32520)
        32520 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of beer (id: 32521)
        32521 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of daggers (id: 32522)
        32522 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32523)
        32523 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of gems (id: 32524)
        32524 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of khali brews (id: 32525)
        32525 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of peg legs (id: 32526)
        32526 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of platebodies (id: 32527)
        32527 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of rum (id: 32528)
        32528 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of scimitars (id: 32529)
        32529 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of ship parts (id: 32530)
        32530 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of swords (id: 32531)
        32531 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of alpaca wool (id: 32532)
        32532 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of camphor logs (id: 32533)
        32533 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fabrics (id: 32534)
        32534 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fruit (id: 32535)
        32535 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of furs (id: 32536)
        32536 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of granite (id: 32537)
        32537 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of javelins (id: 32538)
        32538 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of logs (id: 32539)
        32539 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of machinery parts (id: 32540)
        32540 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of mahogany logs (id: 32541)
        32541 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of pest remains (id: 32542)
        32542 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of pickaxes (id: 32543)
        32543 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of planks (id: 32544)
        32544 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of suqah hides (id: 32545)
        32545 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of warhammers (id: 32546)
        32546 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of bananas (id: 32547)
        32547 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of barley (id: 32548)
        32548 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of sand (id: 32549)
        32549 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of adamantite ore (id: 32550)
        32550 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32551)
        32551 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fruit (id: 32552)
        32552 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of iron ore (id: 32553)
        32553 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of monkfish (id: 32554)
        32554 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of onions (id: 32555)
        32555 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of planks (id: 32556)
        32556 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of swords (id: 32557)
        32557 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of warhammers (id: 32558)
        32558 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of yak hair (id: 32559)
        32559 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32560)
        32560 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of lead ore (id: 32561)
        32561 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of rope (id: 32562)
        32562 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of xerician fabrics (id: 32563)
        32563 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32564)
        32564 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of flax (id: 32565)
        32565 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of logs (id: 32566)
        32566 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of bear meat (id: 32567)
        32567 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32568)
        32568 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of furs (id: 32569)
        32569 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of gems (id: 32570)
        32570 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of kebbit fur (id: 32571)
        32571 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of meat (id: 32572)
        32572 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of ores (id: 32573)
        32573 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of secret things (id: 32574)
        32574 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of swords (id: 32575)
        32575 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of vegetables (id: 32576)
        32576 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of wine (id: 32577)
        32577 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of antelope fur (id: 32578)
        32578 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of berries (id: 32579)
        32579 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of coal (id: 32580)
        32580 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of crystal seeds (id: 32581)
        32581 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32582)
        32582 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of furs (id: 32583)
        32583 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of kebbit fur (id: 32584)
        32584 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of logs (id: 32585)
        32585 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of potions (id: 32586)
        32586 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of red coral (id: 32587)
        32587 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of bananas (id: 32588)
        32588 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of beer glasses (id: 32589)
        32589 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of cocktails (id: 32590)
        32590 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of eye patches (id: 32591)
        32591 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32592)
        32592 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of high importance (id: 32593)
        32593 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of honey (id: 32594)
        32594 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of lobsters (id: 32595)
        32595 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of logs (id: 32596)
        32596 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of mahogany logs (id: 32597)
        32597 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of meat (id: 32598)
        32598 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of rotten bananas (id: 32599)
        32599 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of secret stuff (id: 32600)
        32600 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of ship parts (id: 32601)
        32601 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of silk (id: 32602)
        32602 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of coal (id: 32603)
        32603 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of mahogany logs (id: 32604)
        32604 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of sand (id: 32605)
        32605 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fabrics (id: 32606)
        32606 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32607)
        32607 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of flax (id: 32608)
        32608 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of furs (id: 32609)
        32609 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of potions (id: 32610)
        32610 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of vodka (id: 32611)
        32611 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of angler outfit pieces (id: 32612)
        32612 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of arrowtips (id: 32613)
        32613 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of bows (id: 32614)
        32614 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of bread (id: 32615)
        32615 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of chainbodies (id: 32616)
        32616 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of coal (id: 32617)
        32617 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of crab paste (id: 32618)
        32618 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fruit (id: 32619)
        32619 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of gunpowder (id: 32620)
        32620 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of herbs (id: 32621)
        32621 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of huasca (id: 32622)
        32622 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of kyatt teeth (id: 32623)
        32623 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of planks (id: 32624)
        32624 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of platebodies (id: 32625)
        32625 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of red coral (id: 32626)
        32626 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of scimitars (id: 32627)
        32627 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of secret stuff (id: 32628)
        32628 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of spears (id: 32629)
        32629 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of swamp paste (id: 32630)
        32630 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of vodka (id: 32631)
        32631 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of antelope meat (id: 32632)
        32632 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of astral runes (id: 32633)
        32633 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of books (id: 32634)
        32634 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of cannonballs (id: 32635)
        32635 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of coal (id: 32636)
        32636 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fabrics (id: 32637)
        32637 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of furs (id: 32638)
        32638 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of gems (id: 32639)
        32639 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of gin (id: 32640)
        32640 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of honey (id: 32641)
        32641 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of jewellery (id: 32642)
        32642 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of kebbit fur (id: 32643)
        32643 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of mahogany logs (id: 32644)
        32644 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of planks (id: 32645)
        32645 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of platebodies (id: 32646)
        32646 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of red coral (id: 32647)
        32647 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of seeds (id: 32648)
        32648 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of wine (id: 32649)
        32649 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of antelope fur (id: 32650)
        32650 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of berries (id: 32651)
        32651 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of bows (id: 32652)
        32652 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of coral (id: 32653)
        32653 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fabrics (id: 32654)
        32654 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32655)
        32655 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of flax (id: 32656)
        32656 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of furs (id: 32657)
        32657 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of gems (id: 32658)
        32658 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of honey (id: 32659)
        32659 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of jewellery (id: 32660)
        32660 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of logs (id: 32661)
        32661 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of meat (id: 32662)
        32662 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of nickel ore (id: 32663)
        32663 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of ores (id: 32664)
        32664 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of red coral (id: 32665)
        32665 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of runes (id: 32666)
        32666 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of seeds (id: 32667)
        32667 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of silk (id: 32668)
        32668 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of silver ore (id: 32669)
        32669 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of staffs (id: 32670)
        32670 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of teak logs (id: 32671)
        32671 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of wine (id: 32672)
        32672 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of amulets (id: 32673)
        32673 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of beer (id: 32674)
        32674 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of books (id: 32675)
        32675 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of cacti (id: 32676)
        32676 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of camphor logs (id: 32677)
        32677 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of coconuts (id: 32678)
        32678 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32679)
        32679 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of flax (id: 32680)
        32680 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of honey (id: 32681)
        32681 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of jewellery (id: 32682)
        32682 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of kebabs (id: 32683)
        32683 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of logs (id: 32684)
        32684 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of nothing sinister (id: 32685)
        32685 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of pest remains (id: 32686)
        32686 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of red coral (id: 32687)
        32687 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of runes (id: 32688)
        32688 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of seeds (id: 32689)
        32689 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of spices (id: 32690)
        32690 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of sunbeam ale (id: 32691)
        32691 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of swords (id: 32692)
        32692 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of arrowtips (id: 32693)
        32693 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of chinchompas (id: 32694)
        32694 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of coal (id: 32695)
        32695 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fabrics (id: 32696)
        32696 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32697)
        32697 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fruit (id: 32698)
        32698 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of furs (id: 32699)
        32699 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of herbs (id: 32700)
        32700 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of mithril ore (id: 32701)
        32701 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of ores (id: 32702)
        32702 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of platebodies (id: 32703)
        32703 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of seeds (id: 32704)
        32704 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of shields (id: 32705)
        32705 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of snakeskin (id: 32706)
        32706 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of swords (id: 32707)
        32707 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of vegetables (id: 32708)
        32708 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of astral runes (id: 32709)
        32709 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of books (id: 32710)
        32710 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of clothes (id: 32711)
        32711 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32712)
        32712 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of halberds (id: 32713)
        32713 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of herbs (id: 32714)
        32714 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of logs (id: 32715)
        32715 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of ores (id: 32716)
        32716 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of potions (id: 32717)
        32717 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of silk (id: 32718)
        32718 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of spices (id: 32719)
        32719 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of xerician fabrics (id: 32720)
        32720 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of astral runes (id: 32721)
        32721 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of battleaxes (id: 32722)
        32722 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of coal (id: 32723)
        32723 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32724)
        32724 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of furs (id: 32725)
        32725 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of granite (id: 32726)
        32726 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of herbs (id: 32727)
        32727 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of karambwans (id: 32728)
        32728 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of ores (id: 32729)
        32729 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of protective clothing (id: 32730)
        32730 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of runes (id: 32731)
        32731 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of ship parts (id: 32732)
        32732 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of spices (id: 32733)
        32733 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of adamantite ore (id: 32734)
        32734 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of beer (id: 32735)
        32735 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of dragon bitter (id: 32736)
        32736 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fabrics (id: 32737)
        32737 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32738)
        32738 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of halberds (id: 32739)
        32739 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of lead ore (id: 32740)
        32740 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of monkfish (id: 32741)
        32741 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of pies (id: 32742)
        32742 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of planks (id: 32743)
        32743 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of redwood logs (id: 32744)
        32744 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of rope (id: 32745)
        32745 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of ship parts (id: 32746)
        32746 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of teak logs (id: 32747)
        32747 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of wine (id: 32748)
        32748 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of calquat (id: 32749)
        32749 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of cocktails (id: 32750)
        32750 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of coral (id: 32751)
        32751 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32752)
        32752 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fishing supplies (id: 32753)
        32753 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of javelins (id: 32754)
        32754 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of planks (id: 32755)
        32755 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of runes (id: 32756)
        32756 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of ship parts (id: 32757)
        32757 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of beer (id: 32758)
        32758 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fabrics (id: 32759)
        32759 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32760)
        32760 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of maces (id: 32761)
        32761 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of warhammers (id: 32762)
        32762 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of wine (id: 32763)
        32763 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of arrowtips (id: 32764)
        32764 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of bananas (id: 32765)
        32765 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of battleaxes (id: 32766)
        32766 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of cacti (id: 32767)
        32767 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of coral (id: 32768)
        32768 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of gold bars (id: 32769)
        32769 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of granite (id: 32770)
        32770 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of meat (id: 32771)
        32771 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of pineapples (id: 32772)
        32772 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of platebodies (id: 32773)
        32773 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of rum (id: 32774)
        32774 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of sea shells (id: 32775)
        32775 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of spices (id: 32776)
        32776 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of steel bars (id: 32777)
        32777 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of swamp paste (id: 32778)
        32778 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of wax (id: 32779)
        32779 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of bananas (id: 32780)
        32780 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of cacti (id: 32781)
        32781 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of gems (id: 32782)
        32782 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of javelins (id: 32783)
        32783 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of jewellery (id: 32784)
        32784 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of leather (id: 32785)
        32785 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of meat (id: 32786)
        32786 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of nickel ore (id: 32787)
        32787 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of pest remains (id: 32788)
        32788 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of pineapples (id: 32789)
        32789 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of potions (id: 32790)
        32790 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of rope (id: 32791)
        32791 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of sandstone (id: 32792)
        32792 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of shields (id: 32793)
        32793 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of coral (id: 32794)
        32794 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of dragonhide (id: 32795)
        32795 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of granite (id: 32796)
        32796 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of herbs (id: 32797)
        32797 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of logs (id: 32798)
        32798 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of maces (id: 32799)
        32799 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of ores (id: 32800)
        32800 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of platebodies (id: 32801)
        32801 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of potions (id: 32802)
        32802 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of runes (id: 32803)
        32803 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of seeds (id: 32804)
        32804 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of spears (id: 32805)
        32805 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of wrath runes (id: 32806)
        32806 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of ship parts (id: 32807)
        32807 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of looty (id: 32808)
        32808 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Mouldy block (id: 32864)
        32864 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Dull knife (id: 32865)
        32865 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Broken compass (id: 32866)
        32866 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Rusty coin (id: 32867)
        32867 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Broken sextant (id: 32868)
        32868 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Mouldy doll (id: 32869)
        32869 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Smashed mirror (id: 32870)
        32870 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Aquanite hopper (id: 32879)
        32879 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(-5)
                    ATT_SLASH(-5)
                    ATT_CRUSH(-3)
                    ATT_MAGIC(-13)
                    ATT_RANGED(12)
                }
            }
        }

        // Crate of arrowtips (id: 32924)
        32924 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of clothes (id: 32925)
        32925 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Lovley jubbly bib (id: 32928)
        32928 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Beer belly sweater (id: 32930)
        32930 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Jad jumper (id: 32932)
        32932 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Christmas dinner (id: 32934)
        32934 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of furs (id: 32936)
        32936 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32937)
        32937 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32938)
        32938 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32939)
        32939 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of sand (id: 32940)
        32940 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of red coral (id: 32941)
        32941 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32942)
        32942 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of spices (id: 32943)
        32943 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of jewellery (id: 32944)
        32944 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of bait (id: 32945)
        32945 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of coconuts (id: 32946)
        32946 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of arrowtips (id: 32947)
        32947 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of pineapples (id: 32948)
        32948 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of logs (id: 32949)
        32949 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of planks (id: 32950)
        32950 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of logs (id: 32951)
        32951 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of alpaca wool (id: 32952)
        32952 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of planks (id: 32953)
        32953 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fabrics (id: 32954)
        32954 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of planks (id: 32955)
        32955 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of logs (id: 32956)
        32956 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of planks (id: 32957)
        32957 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32958)
        32958 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32959)
        32959 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of gems (id: 32960)
        32960 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32961)
        32961 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32962)
        32962 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of potions (id: 32963)
        32963 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of furs (id: 32964)
        32964 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of swamp paste (id: 32965)
        32965 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of planks (id: 32966)
        32966 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of books (id: 32967)
        32967 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of books (id: 32968)
        32968 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of jewellery (id: 32969)
        32969 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of jewellery (id: 32970)
        32970 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of planks (id: 32971)
        32971 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of furs (id: 32972)
        32972 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32973)
        32973 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32974)
        32974 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of silk (id: 32975)
        32975 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32976)
        32976 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of logs (id: 32977)
        32977 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of swords (id: 32978)
        32978 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32979)
        32979 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32980)
        32980 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of seeds (id: 32981)
        32981 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of swords (id: 32982)
        32982 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of platebodies (id: 32983)
        32983 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of swords (id: 32984)
        32984 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of ores (id: 32985)
        32985 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of logs (id: 32986)
        32986 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of potions (id: 32987)
        32987 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32988)
        32988 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32989)
        32989 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of runes (id: 32990)
        32990 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of fish (id: 32991)
        32991 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of planks (id: 32992)
        32992 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of teak logs (id: 32993)
        32993 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of runes (id: 32994)
        32994 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of cocktails (id: 32995)
        32995 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of ship parts (id: 32996)
        32996 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of rum (id: 32997)
        32997 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of javelins (id: 32998)
        32998 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of potions (id: 32999)
        32999 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of ores (id: 33000)
        33000 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crate of potions (id: 33001)
        33001 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Holy moleys (id: 33002)
        33002 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    PRAYER(3)
                }
            }
        }

        // Ruinous powers (id: 33010)
        33010 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    PRAYER(-1)
                }
            }
        }

        // Annihilation teleport scroll (id: 33018)
        33018 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Bow of faerdhinen (c) (id: 33021)
        33021 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(128)
                    RANGE_STRENGTH(106)
                }
            }
        }

        // Crystal body (id: 33023)
        33023 {
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

        // Crystal body (inactive) (id: 33025)
        33025 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Crystal legs (id: 33027)
        33027 {
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

        // Crystal legs (inactive) (id: 33029)
        33029 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Crystal helm (id: 33031)
        33031 {
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

        // Crystal helm (inactive) (id: 33033)
        33033 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
            }
        }

        // Toxic staff (uncharged) (id: 33035)
        33035 {
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

        // Toxic staff (deadman) (id: 33036)
        33036 {
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

        // The dogsword (id: 33038)
        33038 {
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

        // Thunder khopesh (id: 33041)
        33041 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(65)
                    ATT_SLASH(110)
                    Bonuses.Bonus.STRENGTH(100)
                }
            }
        }

        // Starter cape (id: 33063)
        33063 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(5)
                    ATT_CRUSH(5)
                    ATT_MAGIC(5)
                    ATT_RANGED(5)
                }
            }
        }

        // Hooded slayer helmet (id: 33066)
        33066 {
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

        // Hooded slayer helmet (i) (id: 33068)
        33068 {
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

        // Hooded slayer helmet (i) (id: 33070)
        33070 {
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

        // Hooded slayer helmet (i) (id: 33072)
        33072 {
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

        // 25th anniversary warrior tabard (id: 33082)
        33082 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // 25th anniversary skeleton tabard (id: 33084)
        33084 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Cow slippers (id: 33093)
        33093 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Cow slippers (id: 33096)
        33096 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Cow slippers (id: 33097)
        33097 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Cow slippers (id: 33098)
        33098 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Brutus slippers (id: 33099)
        33099 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Mooleta (id: 33101)
        33101 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(7)
                    ATT_CRUSH(7)
                    ATT_MAGIC(-1)
                    ATT_RANGED(-1)
                    DEF_STAB(4)
                    DEF_SLASH(8)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-2)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(1)
                }
            }
        }

        // Cowbell amulet (id: 33103)
        33103 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Cowbell amulet (id: 33104)
        33104 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Archibald (id: 33151)
        33151 {
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

        // Archibald (id: 33153)
        33153 {
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

        // Archibald (id: 33155)
        33155 {
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

        // Archibald (id: 33157)
        33157 {
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

        // Archibald (id: 33159)
        33159 {
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

        // Archibald (id: 33161)
        33161 {
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

        // Archibald (id: 33163)
        33163 {
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

        // Crystal body (id: 33166)
        33166 {
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

        // Crystal legs (id: 33168)
        33168 {
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

        // Crystal helm (id: 33170)
        33170 {
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

        // Avernic treads (max) (id: 33172)
        33172 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(5)
                    ATT_CRUSH(5)
                    ATT_MAGIC(11)
                    ATT_RANGED(15)
                    DEF_STAB(21)
                    DEF_SLASH(25)
                    DEF_CRUSH(25)
                    DEF_MAGIC(10)
                    DEF_RANGE(10)
                    Bonuses.Bonus.STRENGTH(6)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Osmumten's fang (id: 33174)
        33174 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(105)
                    ATT_SLASH(75)
                    Bonuses.Bonus.STRENGTH(103)
                }
            }
        }

        // Elidinis' ward (f) (id: 33176)
        33176 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(25)
                    DEF_STAB(53)
                    DEF_SLASH(55)
                    DEF_CRUSH(73)
                    DEF_MAGIC(2)
                    DEF_RANGE(52)
                    PRAYER(4)
                    MAGIC_DAMAGE(5)
                }
            }
        }

        // Noxious halberd (id: 33178)
        33178 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 2
                    longAttackDistance = 4
                }
                bonuses {
                    ATT_STAB(80)
                    ATT_SLASH(132)
                    Bonuses.Bonus.STRENGTH(142)
                }
            }
        }

        // Magus ring (id: 33180)
        33180 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_MAGIC(15)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Ultor ring (id: 33182)
        33182 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    Bonuses.Bonus.STRENGTH(12)
                }
            }
        }

        // Purging staff (id: 33184)
        33184 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(-5)
                    ATT_CRUSH(83)
                    ATT_MAGIC(37)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    DEF_MAGIC(25)
                    Bonuses.Bonus.STRENGTH(62)
                    MAGIC_DAMAGE(10)
                }
            }
        }

        // Dragonfire shield (id: 33186)
        33186 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(-5)
                    DEF_STAB(70)
                    DEF_SLASH(75)
                    DEF_CRUSH(72)
                    DEF_MAGIC(10)
                    DEF_RANGE(72)
                    Bonuses.Bonus.STRENGTH(7)
                }
            }
        }

        // Twisted buckler (id: 33188)
        33188 {
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

        // Masori body (f) (id: 33190)
        33190 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-4)
                    ATT_RANGED(43)
                    DEF_STAB(59)
                    DEF_SLASH(52)
                    DEF_CRUSH(64)
                    DEF_MAGIC(74)
                    DEF_RANGE(60)
                    PRAYER(1)
                }
            }
        }

        // Masori chaps (f) (id: 33192)
        33192 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-2)
                    ATT_RANGED(27)
                    DEF_STAB(35)
                    DEF_SLASH(30)
                    DEF_CRUSH(39)
                    DEF_MAGIC(46)
                    DEF_RANGE(37)
                    PRAYER(1)
                }
            }
        }

        // Torva platelegs (id: 33194)
        33194 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-24)
                    ATT_RANGED(-11)
                    DEF_STAB(87)
                    DEF_SLASH(78)
                    DEF_CRUSH(79)
                    DEF_MAGIC(-9)
                    DEF_RANGE(102)
                    Bonuses.Bonus.STRENGTH(4)
                    PRAYER(1)
                }
            }
        }

        // Virtus robe top (id: 33196)
        33196 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(35)
                    ATT_RANGED(-11)
                    DEF_STAB(47)
                    DEF_SLASH(36)
                    DEF_CRUSH(56)
                    DEF_MAGIC(31)
                    PRAYER(2)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Virtus robe bottom (id: 33198)
        33198 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(26)
                    ATT_RANGED(-9)
                    DEF_STAB(31)
                    DEF_SLASH(28)
                    DEF_CRUSH(34)
                    DEF_MAGIC(22)
                    PRAYER(1)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Burning claws (id: 33200)
        33200 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(43)
                    ATT_SLASH(54)
                    DEF_STAB(3)
                    DEF_SLASH(6)
                    DEF_CRUSH(1)
                    Bonuses.Bonus.STRENGTH(32)
                }
            }
        }

        // Aranea boots (id: 33202)
        33202 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(5)
                    ATT_RANGED(6)
                    Bonuses.Bonus.STRENGTH(4)
                    PRAYER(1)
                }
            }
        }

        // Evil eye (id: 33227)
        33227 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Transmutation ledger (id: 33229)
        33229 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Infernal tecpatl (id: 33243)
        33243 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(72)
                    ATT_SLASH(72)
                    ATT_CRUSH(72)
                    Bonuses.Bonus.STRENGTH(70)
                    PRAYER(-1)
                }
            }
        }

        // Nature's recurve (id: 33245)
        33245 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_RANGED(95)
                }
            }
        }

        // V's helm (id: 33247)
        33247 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(8)
                    ATT_RANGED(12)
                    DEF_STAB(40)
                    DEF_SLASH(40)
                    DEF_CRUSH(40)
                    DEF_MAGIC(10)
                    DEF_RANGE(40)
                    Bonuses.Bonus.STRENGTH(8)
                    MAGIC_DAMAGE(3)
                }
            }
        }

        // Fang of the hound (id: 33249)
        33249 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                }
                bonuses {
                    ATT_STAB(60)
                    ATT_SLASH(60)
                    ATT_CRUSH(10)
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                    Bonuses.Bonus.STRENGTH(20)
                }
            }
        }

        // King's barrage (id: 33251)
        33251 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                    normalAttackDistance = 9
                    longAttackDistance = 11
                }
                bonuses {
                    ATT_RANGED(130)
                    DEF_STAB(20)
                    DEF_SLASH(20)
                    DEF_CRUSH(20)
                    DEF_MAGIC(25)
                    DEF_RANGE(60)
                }
            }
        }

        // Shadowflame quadrant (id: 33253)
        33253 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                    normalAttackDistance = 8
                    longAttackDistance = 10
                }
                bonuses {
                    ATT_CRUSH(60)
                    ATT_MAGIC(25)
                    DEF_SLASH(5)
                    DEF_CRUSH(5)
                    DEF_MAGIC(17)
                    Bonuses.Bonus.STRENGTH(50)
                    MAGIC_DAMAGE(15)
                }
            }
        }

        // Lithic sceptre (id: 33255)
        33255 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_MAGIC(25)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(10)
                    DEF_MAGIC(20)
                }
            }
        }

        // Lithic sceptre (uncharged) (id: 33257)
        33257 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_MAGIC(25)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(10)
                    DEF_MAGIC(20)
                }
            }
        }

        // Demonic robe top (t1) (id: 33263)
        33263 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Demonic robe bottom (t1) (id: 33266)
        33266 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Demonic boots (t1) (id: 33269)
        33269 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Demonic robe top (t2) (id: 33275)
        33275 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Demonic robe bottom (t2) (id: 33278)
        33278 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Demonic boots (t2) (id: 33281)
        33281 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Demonic robe top (t3) (id: 33287)
        33287 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Demonic robe bottom (t3) (id: 33290)
        33290 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Demonic boots (t3) (id: 33293)
        33293 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Demonic sceptre (id: 33296)
        33296 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Demonic pacts banner (id: 33299)
        33299 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Trident of the swamp (o) (id: 33314)
        33314 {
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

        // Uncharged toxic trident (o) (id: 33316)
        33316 {
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

        // Trident of the swamp (e) (o) (id: 33318)
        33318 {
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

        // Uncharged toxic trident (e) (o) (id: 33320)
        33320 {
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

        // Trident of the seas (o) (id: 33322)
        33322 {
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

        // Trident of the seas (full) (o) (id: 33323)
        33323 {
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

        // Trident of the seas (e) (o) (id: 33326)
        33326 {
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

        // Uncharged trident (e) (o) (id: 33328)
        33328 {
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

        // Iban's staff (o) (id: 33330)
        33330 {
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

        // Iban's staff (u) (o) (id: 33332)
        33332 {
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

        // Soulreaper axe (o) (id: 33335)
        33335 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(28)
                    ATT_SLASH(134)
                    ATT_CRUSH(66)
                    Bonuses.Bonus.STRENGTH(121)
                }
            }
        }

        // Oathplate slayer helmet (id: 33338)
        33338 {
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

        // Radiant slayer helmet (id: 33340)
        33340 {
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

        // Demonic pacts dragon trophy (id: 33345)
        33345 {
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

        // Demonic pacts rune trophy (id: 33347)
        33347 {
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

        // Demonic pacts adamant trophy (id: 33349)
        33349 {
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

        // Demonic pacts mithril trophy (id: 33351)
        33351 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Demonic pacts steel trophy (id: 33353)
        33353 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Demonic pacts iron trophy (id: 33355)
        33355 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Demonic pacts bronze trophy (id: 33357)
        33357 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Impish ritual scroll (id: 33359)
        33359 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Uncharged trident (o) (id: 33434)
        33434 {
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

        // Oathplate slayer helmet (i) (id: 33439)
        33439 {
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

        // Oathplate slayer helmet (i) (id: 33441)
        33441 {
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

        // Oathplate slayer helmet (i) (id: 33443)
        33443 {
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

        // Radiant slayer helmet (i) (id: 33445)
        33445 {
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

        // Radiant slayer helmet (i) (id: 33447)
        33447 {
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

        // Radiant slayer helmet (i) (id: 33449)
        33449 {
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

        // Dragon crossbow (id: 33460)
        33460 {
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

        // Oathplate helm (id: 33462)
        33462 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_SLASH(10)
                    ATT_MAGIC(-2)
                    ATT_RANGED(-7)
                    DEF_STAB(50)
                    DEF_SLASH(72)
                    DEF_CRUSH(45)
                    DEF_RANGE(50)
                    Bonuses.Bonus.STRENGTH(6)
                }
            }
        }

        // Seeking bronze arrow (id: 33553)
        33553 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    ATT_RANGED(20)
                    RANGE_STRENGTH(7)
                }
            }
        }

        // Seeking iron arrow (id: 33559)
        33559 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    ATT_RANGED(20)
                    RANGE_STRENGTH(10)
                }
            }
        }

        // Seeking steel arrow (id: 33565)
        33565 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    ATT_RANGED(20)
                    RANGE_STRENGTH(16)
                }
            }
        }

        // Seeking mithril arrow (id: 33571)
        33571 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    ATT_RANGED(20)
                    RANGE_STRENGTH(22)
                }
            }
        }

        // Seeking adamant arrow (id: 33577)
        33577 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    ATT_RANGED(20)
                    RANGE_STRENGTH(31)
                }
            }
        }

        // Seeking rune arrow (id: 33583)
        33583 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    ATT_RANGED(20)
                    RANGE_STRENGTH(49)
                }
            }
        }

        // Seeking amethyst arrow (id: 33589)
        33589 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    ATT_RANGED(20)
                    RANGE_STRENGTH(55)
                }
            }
        }

        // Seeking dragon arrow (id: 33595)
        33595 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    ATT_RANGED(20)
                    RANGE_STRENGTH(60)
                }
            }
        }

        // Seeking broad arrows (id: 33601)
        33601 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    ATT_RANGED(20)
                    RANGE_STRENGTH(28)
                }
            }
        }

        // Crimson kisten (id: 33631)
        33631 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_CRUSH(80)
                    Bonuses.Bonus.STRENGTH(56)
                }
            }
        }

        // Necklace of rupture (id: 33639)
        33639 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_RANGED(20)
                    PRAYER(3)
                }
            }
        }

        // Dummy stymphike feather (id: 33644)
        33644 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                }
            }
        }

        // Makeshift spear (id: 33655)
        33655 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Diamond sickle (b) (id: 33709)
        33709 {
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
                    Bonuses.Bonus.STRENGTH(8)
                    PRAYER(5)
                }
            }
        }

        // Enchanted diamond sickle (b) (id: 33711)
        33711 {
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
                    Bonuses.Bonus.STRENGTH(12)
                    PRAYER(5)
                }
            }
        }

        // Blisterwood sickle (e) (id: 33713)
        33713 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(44)
                    ATT_SLASH(56)
                    DEF_STAB(1)
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                    DEF_MAGIC(2)
                    DEF_RANGE(2)
                    Bonuses.Bonus.STRENGTH(56)
                    PRAYER(5)
                }
            }
        }

        // Blisterwood stake (id: 33716)
        33716 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 6
                    longAttackDistance = 8
                }
                bonuses {
                    ATT_RANGED(16)
                    RANGE_STRENGTH(14)
                }
            }
        }

        // Hallowed flail (id: 33718)
        33718 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(32)
                    ATT_SLASH(68)
                    ATT_MAGIC(10)
                    DEF_SLASH(2)
                    DEF_MAGIC(10)
                    Bonuses.Bonus.STRENGTH(46)
                    PRAYER(6)
                }
            }
        }

        // Sunspear (id: 33722)
        33722 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(100)
                    ATT_SLASH(21)
                    ATT_CRUSH(60)
                    DEF_SLASH(42)
                    DEF_CRUSH(28)
                    Bonuses.Bonus.STRENGTH(70)
                    PRAYER(7)
                }
            }
        }

        // Spine (id: 33790)
        33790 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 4
                    longAttackDistance = 6
                }
                bonuses {
                    ATT_RANGED(16)
                    RANGE_STRENGTH(26)
                }
            }
        }

        // Silvthrill ballista (id: 33800)
        33800 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(125)
                }
            }
        }

        // Silvthrill javelin (id: 33801)
        33801 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(124)
                }
            }
        }
    }
}
