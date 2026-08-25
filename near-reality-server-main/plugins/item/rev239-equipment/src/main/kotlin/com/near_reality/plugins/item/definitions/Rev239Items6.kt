package com.near_reality.plugins.item.definitions

import com.near_reality.scripts.item.definitions.ItemDefinitionsScript
import com.zenyte.game.world.entity.player.Bonuses
import com.zenyte.game.world.entity.player.Bonuses.Bonus.*
import com.zenyte.game.world.entity.player.container.impl.equipment.EquipmentSlot

class Rev239Items6 : ItemDefinitionsScript() {
    init {
        // Elven top (id: 24009)
        24009 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Elven skirt (id: 24012)
        24012 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Elven top (id: 24015)
        24015 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Elven skirt (id: 24018)
        24018 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Elven top (id: 24021)
        24021 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Elven legwear (id: 24024)
        24024 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Elven top (id: 24027)
        24027 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dragonstone full helm (id: 24034)
        24034 {
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

        // Dragonstone platebody (id: 24037)
        24037 {
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

        // Dragonstone platelegs (id: 24040)
        24040 {
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

        // Dragonstone boots (id: 24043)
        24043 {
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

        // Dragonstone gauntlets (id: 24046)
        24046 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(8)
                    ATT_CRUSH(8)
                    ATT_MAGIC(-4)
                    ATT_RANGED(-3)
                    DEF_STAB(8)
                    DEF_SLASH(8)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-4)
                    DEF_RANGE(4)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Crystal bow (id: 24123)
        24123 {
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

        // Crystal halberd (id: 24125)
        24125 {
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

        // Crystal shield (id: 24127)
        24127 {
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

        // Infernal max cape (l) (id: 24133)
        24133 {
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

        // Fire max cape (l) (id: 24134)
        24134 {
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

        // Assembler max cape (l) (id: 24135)
        24135 {
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

        // Bronze defender (l) (id: 24136)
        24136 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(3)
                    ATT_SLASH(2)
                    ATT_CRUSH(1)
                    ATT_MAGIC(-3)
                    ATT_RANGED(-2)
                    DEF_STAB(3)
                    DEF_SLASH(2)
                    DEF_CRUSH(1)
                    DEF_MAGIC(-3)
                    DEF_RANGE(-2)
                }
            }
        }

        // Iron defender (l) (id: 24137)
        24137 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(4)
                    ATT_CRUSH(3)
                    ATT_MAGIC(-3)
                    ATT_RANGED(-2)
                    DEF_STAB(5)
                    DEF_SLASH(4)
                    DEF_CRUSH(3)
                    DEF_MAGIC(-3)
                    DEF_RANGE(-2)
                }
            }
        }

        // Steel defender (l) (id: 24138)
        24138 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(6)
                    ATT_CRUSH(5)
                    ATT_MAGIC(-3)
                    ATT_RANGED(-2)
                    DEF_STAB(7)
                    DEF_SLASH(6)
                    DEF_CRUSH(5)
                    DEF_MAGIC(-3)
                    DEF_RANGE(-2)
                    Bonuses.Bonus.STRENGTH(1)
                }
            }
        }

        // Black defender (l) (id: 24139)
        24139 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(9)
                    ATT_SLASH(8)
                    ATT_CRUSH(7)
                    ATT_MAGIC(-3)
                    ATT_RANGED(-2)
                    DEF_STAB(9)
                    DEF_SLASH(8)
                    DEF_CRUSH(7)
                    DEF_MAGIC(-3)
                    DEF_RANGE(-2)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Mithril defender (l) (id: 24140)
        24140 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(9)
                    ATT_CRUSH(8)
                    ATT_MAGIC(-3)
                    ATT_RANGED(-2)
                    DEF_STAB(10)
                    DEF_SLASH(9)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-3)
                    DEF_RANGE(-2)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Adamant defender (l) (id: 24141)
        24141 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(13)
                    ATT_SLASH(12)
                    ATT_CRUSH(11)
                    ATT_MAGIC(-3)
                    ATT_RANGED(-2)
                    DEF_STAB(13)
                    DEF_SLASH(12)
                    DEF_CRUSH(11)
                    DEF_MAGIC(-3)
                    DEF_RANGE(-2)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Rune defender (l) (id: 24142)
        24142 {
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

        // Dragon defender (l) (id: 24143)
        24143 {
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

        // Staff of balance (id: 24144)
        24144 {
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

        // Decorative sword (l) (id: 24157)
        24157 {
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

        // Decorative armour (l) (id: 24158)
        24158 {
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

        // Decorative armour (l) (id: 24159)
        24159 {
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

        // Decorative helm (l) (id: 24160)
        24160 {
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

        // Decorative shield (l) (id: 24161)
        24161 {
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

        // Decorative armour (l) (id: 24162)
        24162 {
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

        // Decorative armour (l) (id: 24163)
        24163 {
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

        // Decorative armour (l) (id: 24164)
        24164 {
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

        // Decorative armour (l) (id: 24165)
        24165 {
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

        // Decorative armour (l) (id: 24166)
        24166 {
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

        // Decorative armour (l) (id: 24167)
        24167 {
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

        // Decorative armour (l) (id: 24168)
        24168 {
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

        // Saradomin halo (l) (id: 24169)
        24169 {
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

        // Zamorak halo (l) (id: 24170)
        24170 {
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

        // Guthix halo (l) (id: 24171)
        24171 {
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

        // Healer hat (l) (id: 24172)
        24172 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(-5)
                    ATT_SLASH(-5)
                    ATT_CRUSH(-5)
                    ATT_MAGIC(6)
                    ATT_RANGED(-5)
                    DEF_STAB(6)
                    DEF_SLASH(8)
                    DEF_CRUSH(10)
                    DEF_MAGIC(7)
                }
            }
        }

        // Fighter hat (l) (id: 24173)
        24173 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(5)
                    ATT_CRUSH(5)
                    ATT_MAGIC(-7)
                    ATT_RANGED(-7)
                    DEF_STAB(27)
                    DEF_SLASH(29)
                    DEF_CRUSH(26)
                    DEF_MAGIC(-3)
                    DEF_RANGE(28)
                }
            }
        }

        // Ranger hat (l) (id: 24174)
        24174 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(-5)
                    ATT_SLASH(-5)
                    ATT_CRUSH(-5)
                    ATT_MAGIC(-5)
                    ATT_RANGED(6)
                    DEF_STAB(7)
                    DEF_SLASH(10)
                    DEF_CRUSH(11)
                    DEF_MAGIC(5)
                    DEF_RANGE(8)
                }
            }
        }

        // Fighter torso (l) (id: 24175)
        24175 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-40)
                    DEF_STAB(62)
                    DEF_SLASH(85)
                    DEF_CRUSH(62)
                    DEF_MAGIC(-10)
                    DEF_RANGE(67)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Penance skirt (l) (id: 24176)
        24176 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(15)
                    DEF_STAB(26)
                    DEF_SLASH(21)
                    DEF_CRUSH(28)
                    DEF_MAGIC(19)
                    DEF_RANGE(26)
                }
            }
        }

        // Void knight top (l) (id: 24177)
        24177 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_STAB(45)
                    DEF_SLASH(45)
                    DEF_CRUSH(45)
                    DEF_MAGIC(45)
                    DEF_RANGE(45)
                }
            }
        }

        // Elite void top (l) (id: 24178)
        24178 {
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

        // Void knight robe (l) (id: 24179)
        24179 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_STAB(30)
                    DEF_SLASH(30)
                    DEF_CRUSH(30)
                    DEF_MAGIC(30)
                    DEF_RANGE(30)
                }
            }
        }

        // Elite void robe (l) (id: 24180)
        24180 {
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

        // Void knight mace (l) (id: 24181)
        24181 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(22)
                    ATT_CRUSH(41)
                    ATT_MAGIC(8)
                    DEF_STAB(2)
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                    DEF_MAGIC(2)
                    DEF_RANGE(2)
                    Bonuses.Bonus.STRENGTH(38)
                    PRAYER(6)
                }
            }
        }

        // Void knight gloves (l) (id: 24182)
        24182 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_STAB(6)
                    DEF_SLASH(6)
                    DEF_CRUSH(6)
                    DEF_MAGIC(4)
                    DEF_RANGE(6)
                }
            }
        }

        // Void mage helm (l) (id: 24183)
        24183 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(6)
                    DEF_SLASH(6)
                    DEF_CRUSH(6)
                    DEF_MAGIC(6)
                    DEF_RANGE(6)
                }
            }
        }

        // Void ranger helm (l) (id: 24184)
        24184 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(6)
                    DEF_SLASH(6)
                    DEF_CRUSH(6)
                    DEF_MAGIC(6)
                    DEF_RANGE(6)
                }
            }
        }

        // Void melee helm (l) (id: 24185)
        24185 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(6)
                    DEF_SLASH(6)
                    DEF_CRUSH(6)
                    DEF_MAGIC(6)
                    DEF_RANGE(6)
                }
            }
        }

        // Avernic defender (l) (id: 24186)
        24186 {
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

        // Deadman's chest (id: 24189)
        24189 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Deadman's legs (id: 24190)
        24190 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Deadman's cape (id: 24191)
        24191 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Armadyl halo (id: 24192)
        24192 {
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

        // Armadyl halo (l) (id: 24194)
        24194 {
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

        // Bandos halo (id: 24195)
        24195 {
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

        // Bandos halo (l) (id: 24197)
        24197 {
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

        // Seren halo (id: 24198)
        24198 {
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

        // Seren halo (l) (id: 24200)
        24200 {
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

        // Ancient halo (id: 24201)
        24201 {
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

        // Ancient halo (l) (id: 24203)
        24203 {
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

        // Brassica halo (id: 24204)
        24204 {
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

        // Brassica halo (l) (id: 24206)
        24206 {
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

        // Victor's cape (1) (id: 24207)
        24207 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Victor's cape (10) (id: 24209)
        24209 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Victor's cape (50) (id: 24211)
        24211 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Victor's cape (100) (id: 24213)
        24213 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Victor's cape (500) (id: 24215)
        24215 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Swift blade (id: 24219)
        24219 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                }
            }
        }

        // Ava's assembler (l) (id: 24222)
        24222 {
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

        // Fire cape (l) (id: 24223)
        24223 {
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

        // Infernal cape (l) (id: 24224)
        24224 {
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

        // Granite maul (id: 24225)
        24225 {
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

        // Granite maul (id: 24227)
        24227 {
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

        // Imbued saradomin max cape (l) (id: 24232)
        24232 {
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

        // Imbued zamorak max cape (l) (id: 24233)
        24233 {
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

        // Imbued guthix max cape (l) (id: 24234)
        24234 {
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

        // Imbued saradomin cape (l) (id: 24248)
        24248 {
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

        // Imbued guthix cape (l) (id: 24249)
        24249 {
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

        // Imbued zamorak cape (l) (id: 24250)
        24250 {
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

        // V's shield (id: 24266)
        24266 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    DEF_STAB(27)
                    DEF_SLASH(31)
                    DEF_CRUSH(29)
                    DEF_MAGIC(5)
                    DEF_RANGE(29)
                }
            }
        }

        // Neitiznot faceguard (id: 24271)
        24271 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(36)
                    DEF_SLASH(34)
                    DEF_CRUSH(38)
                    DEF_MAGIC(3)
                    DEF_RANGE(34)
                    Bonuses.Bonus.STRENGTH(6)
                    PRAYER(3)
                }
            }
        }

        // Dagon'hai hat (id: 24288)
        24288 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(5)
                    DEF_MAGIC(5)
                    PRAYER(2)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Dagon'hai robe top (id: 24291)
        24291 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(25)
                    DEF_MAGIC(21)
                    PRAYER(2)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Dagon'hai robe bottom (id: 24294)
        24294 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(18)
                    DEF_MAGIC(14)
                    PRAYER(2)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Spooky robe (id: 24301)
        24301 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Spooky skirt (id: 24302)
        24302 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Spooky gloves (id: 24303)
        24303 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Spooky boots (id: 24304)
        24304 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Spooky robe (id: 24307)
        24307 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Spooky skirt (id: 24309)
        24309 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Spooky gloves (id: 24311)
        24311 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Spooky boots (id: 24313)
        24313 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Spookier robe (id: 24317)
        24317 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Spookier skirt (id: 24319)
        24319 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Spookier gloves (id: 24321)
        24321 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Spookier boots (id: 24323)
        24323 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Pumpkin lantern (id: 24325)
        24325 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Skeleton lantern (id: 24327)
        24327 {
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

        // Twisted slayer helmet (id: 24370)
        24370 {
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

        // Twisted dragon trophy (id: 24372)
        24372 {
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

        // Twisted rune trophy (id: 24374)
        24374 {
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

        // Twisted adamant trophy (id: 24376)
        24376 {
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

        // Twisted mithril trophy (id: 24378)
        24378 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Twisted steel trophy (id: 24380)
        24380 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Twisted iron trophy (id: 24382)
        24382 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Twisted bronze trophy (id: 24384)
        24384 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Twisted coat (t3) (id: 24389)
        24389 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Twisted trousers (t3) (id: 24391)
        24391 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Twisted boots (t3) (id: 24393)
        24393 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Twisted cane (id: 24395)
        24395 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Twisted coat (t2) (id: 24399)
        24399 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Twisted trousers (t2) (id: 24401)
        24401 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Twisted boots (t2) (id: 24403)
        24403 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Twisted coat (t1) (id: 24407)
        24407 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Twisted trousers (t1) (id: 24409)
        24409 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Twisted boots (t1) (id: 24411)
        24411 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Twisted banner (id: 24413)
        24413 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Inquisitor's mace (id: 24417)
        24417 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(52)
                    ATT_SLASH(-4)
                    ATT_CRUSH(95)
                    Bonuses.Bonus.STRENGTH(89)
                    PRAYER(2)
                }
            }
        }

        // Inquisitor's great helm (id: 24419)
        24419 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(-2)
                    ATT_CRUSH(8)
                    ATT_MAGIC(-5)
                    ATT_RANGED(-5)
                    DEF_STAB(19)
                    DEF_SLASH(10)
                    DEF_CRUSH(21)
                    DEF_RANGE(12)
                    Bonuses.Bonus.STRENGTH(4)
                    PRAYER(1)
                }
            }
        }

        // Inquisitor's hauberk (id: 24420)
        24420 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_STAB(-3)
                    ATT_SLASH(-3)
                    ATT_CRUSH(12)
                    ATT_MAGIC(-11)
                    ATT_RANGED(-10)
                    DEF_STAB(67)
                    DEF_SLASH(55)
                    DEF_CRUSH(71)
                    DEF_RANGE(35)
                    Bonuses.Bonus.STRENGTH(4)
                    PRAYER(2)
                }
            }
        }

        // Inquisitor's plateskirt (id: 24421)
        24421 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_STAB(-3)
                    ATT_SLASH(-3)
                    ATT_CRUSH(12)
                    ATT_MAGIC(-9)
                    ATT_RANGED(-5)
                    DEF_STAB(42)
                    DEF_SLASH(30)
                    DEF_CRUSH(49)
                    DEF_RANGE(22)
                    Bonuses.Bonus.STRENGTH(2)
                    PRAYER(2)
                }
            }
        }

        // Nightmare staff (id: 24422)
        24422 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_MAGIC(16)
                    DEF_MAGIC(14)
                    MAGIC_DAMAGE(15)
                }
            }
        }

        // Harmonised nightmare staff (id: 24423)
        24423 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_MAGIC(16)
                    DEF_MAGIC(14)
                    MAGIC_DAMAGE(15)
                }
            }
        }

        // Volatile nightmare staff (id: 24424)
        24424 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_MAGIC(16)
                    DEF_MAGIC(14)
                    MAGIC_DAMAGE(15)
                }
            }
        }

        // Eldritch nightmare staff (id: 24425)
        24425 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_MAGIC(16)
                    DEF_MAGIC(14)
                    MAGIC_DAMAGE(15)
                }
            }
        }

        // Green gingerbread shield (id: 24428)
        24428 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Red gingerbread shield (id: 24430)
        24430 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Blue gingerbread shield (id: 24431)
        24431 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Gingerbread shield (id: 24437)
        24437 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Iced gingerbread shield (id: 24438)
        24438 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Iced gingerbread shield (id: 24439)
        24439 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Iced gingerbread shield (id: 24440)
        24440 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Twisted slayer helmet (i) (id: 24444)
        24444 {
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

        // Twisted teleport scroll (id: 24460)
        24460 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Victor's cape (1000) (id: 24520)
        24520 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Runner hat (l) (id: 24533)
        24533 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(30)
                    DEF_SLASH(32)
                    DEF_CRUSH(27)
                    DEF_MAGIC(1)
                    DEF_RANGE(30)
                }
            }
        }

        // Carrot sword (id: 24537)
        24537 {
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

        // '24-carat' sword (id: 24539)
        24539 {
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

        // Blade of saeldor (c) (id: 24551)
        24551 {
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

        // Vesta's blighted longsword (id: 24617)
        24617 {
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

        // Twisted ancestral hat (id: 24664)
        24664 {
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

        // Twisted ancestral robe top (id: 24666)
        24666 {
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

        // Twisted ancestral robe bottom (id: 24668)
        24668 {
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

        // Vyre noble top (id: 24676)
        24676 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Vyre noble legs (id: 24678)
        24678 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Vyre noble shoes (id: 24680)
        24680 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Ruby sickle (b) (id: 24693)
        24693 {
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
                    Bonuses.Bonus.STRENGTH(4)
                    PRAYER(5)
                }
            }
        }

        // Enchanted ruby sickle (b) (id: 24695)
        24695 {
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
                    Bonuses.Bonus.STRENGTH(6)
                    PRAYER(5)
                }
            }
        }

        // Blisterwood sickle (id: 24697)
        24697 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(30)
                    ATT_SLASH(38)
                    DEF_STAB(1)
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                    DEF_MAGIC(2)
                    DEF_RANGE(2)
                    Bonuses.Bonus.STRENGTH(32)
                    PRAYER(5)
                }
            }
        }

        // Blisterwood flail (id: 24699)
        24699 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(30)
                    ATT_SLASH(44)
                    ATT_CRUSH(68)
                    ATT_MAGIC(8)
                    DEF_STAB(4)
                    DEF_SLASH(4)
                    DEF_CRUSH(2)
                    DEF_MAGIC(8)
                    Bonuses.Bonus.STRENGTH(46)
                    PRAYER(5)
                }
            }
        }

        // Hallowed grapple (id: 24721)
        24721 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
            }
        }

        // Hallowed focus (id: 24723)
        24723 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Hallowed symbol (id: 24725)
        24725 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Hallowed hammer (id: 24727)
        24727 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
            }
        }

        // Hallowed ring (id: 24731)
        24731 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of endurance (uncharged) (id: 24735)
        24735 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of endurance (id: 24736)
        24736 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Graceful cape (id: 24746)
        24746 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful cape (id: 24748)
        24748 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful top (id: 24749)
        24749 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful top (id: 24751)
        24751 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful legs (id: 24752)
        24752 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful legs (id: 24754)
        24754 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful gloves (id: 24755)
        24755 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful gloves (id: 24757)
        24757 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful boots (id: 24758)
        24758 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Graceful boots (id: 24760)
        24760 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Amulet of blood fury (id: 24780)
        24780 {
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

        // Severed leg (id: 24792)
        24792 {
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

        // Vyre noble blazer (id: 24794)
        24794 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Vyre noble coat tails (id: 24796)
        24796 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Vyre noble vest (id: 24798)
        24798 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Vyre noble pants (id: 24800)
        24800 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Vyre noble corset (id: 24802)
        24802 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Vyre noble skirt (id: 24804)
        24804 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Vyre noble dress top (id: 24806)
        24806 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Vyre noble dress bottom (id: 24808)
        24808 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Vyre noble blazer (id: 24810)
        24810 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Vyre noble coat tails (id: 24812)
        24812 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Vyre noble vest (id: 24814)
        24814 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Vyre noble pants (id: 24816)
        24816 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Vyre noble corset (id: 24818)
        24818 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Vyre noble skirt (id: 24820)
        24820 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Vyre noble dress top (id: 24822)
        24822 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Vyre noble dress bottom (id: 24824)
        24824 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Vyre noble blazer (id: 24826)
        24826 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Vyre noble coat tails (id: 24828)
        24828 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Vyre noble vest (id: 24830)
        24830 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Vyre noble pants (id: 24832)
        24832 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Vyre noble corset (id: 24834)
        24834 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Vyre noble skirt (id: 24836)
        24836 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Vyre noble dress top (id: 24838)
        24838 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Vyre noble dress bottom (id: 24840)
        24840 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Ring of endurance (uncharged) (id: 24844)
        24844 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Mythical max cape (id: 24855)
        24855 {
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

        // Karamjan monkey (id: 24862)
        24862 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Zombie monkey (id: 24863)
        24863 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Maniacal monkey (id: 24864)
        24864 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Skeleton monkey (id: 24865)
        24865 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Kruk jr (id: 24866)
        24866 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Princely monkey (id: 24867)
        24867 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Carpenter's shirt (id: 24874)
        24874 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Carpenter's trousers (id: 24876)
        24876 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Carpenter's boots (id: 24878)
        24878 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Amy's saw (id: 24880)
        24880 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(2)
                    ATT_SLASH(5)
                    ATT_CRUSH(-2)
                    DEF_SLASH(2)
                    DEF_CRUSH(1)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Trailblazer top (t3) (id: 25004)
        25004 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Trailblazer trousers (t3) (id: 25007)
        25007 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Trailblazer boots (t3) (id: 25010)
        25010 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Trailblazer cane (id: 25013)
        25013 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Trailblazer top (t2) (id: 25019)
        25019 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Trailblazer trousers (t2) (id: 25022)
        25022 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Trailblazer boots (t2) (id: 25025)
        25025 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Trailblazer top (t1) (id: 25031)
        25031 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Trailblazer trousers (t1) (id: 25034)
        25034 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Trailblazer boots (t1) (id: 25037)
        25037 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Trailblazer dragon trophy (id: 25042)
        25042 {
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

        // Trailblazer rune trophy (id: 25044)
        25044 {
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

        // Trailblazer adamant trophy (id: 25046)
        25046 {
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

        // Trailblazer mithril trophy (id: 25048)
        25048 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Trailblazer steel trophy (id: 25050)
        25050 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Trailblazer iron trophy (id: 25052)
        25052 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Trailblazer bronze trophy (id: 25054)
        25054 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Trailblazer banner (id: 25056)
        25056 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Infernal harpoon (or) (id: 25059)
        25059 {
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

        // Infernal pickaxe (or) (id: 25063)
        25063 {
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

        // Infernal axe (or) (id: 25066)
        25066 {
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

        // Graceful cape (id: 25072)
        25072 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful cape (id: 25074)
        25074 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful top (id: 25075)
        25075 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful top (id: 25077)
        25077 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful legs (id: 25078)
        25078 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful legs (id: 25080)
        25080 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful gloves (id: 25081)
        25081 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful gloves (id: 25083)
        25083 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful boots (id: 25084)
        25084 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Graceful boots (id: 25086)
        25086 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Trailblazer teleport scroll (id: 25087)
        25087 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Fairy mushroom (id: 25102)
        25102 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Extradimensional bag (id: 25106)
        25106 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Extradimensional bag (id: 25108)
        25108 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Echo axe (id: 25110)
        25110 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Echo pickaxe (id: 25112)
        25112 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Echo harpoon (id: 25114)
        25114 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Beekeeper's top (id: 25131)
        25131 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Beekeeper's legs (id: 25133)
        25133 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Beekeeper's gloves (id: 25135)
        25135 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Beekeeper's boots (id: 25137)
        25137 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Decorative boots (id: 25163)
        25163 {
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

        // Decorative full helm (id: 25165)
        25165 {
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

        // Decorative boots (id: 25167)
        25167 {
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

        // Decorative full helm (id: 25169)
        25169 {
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

        // Decorative boots (id: 25171)
        25171 {
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

        // Decorative boots (l) (id: 25173)
        25173 {
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

        // Decorative full helm (id: 25174)
        25174 {
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

        // Decorative full helm (l) (id: 25176)
        25176 {
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

        // Slayer helmet (i) (id: 25177)
        25177 {
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

        // Black slayer helmet (i) (id: 25179)
        25179 {
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

        // Green slayer helmet (i) (id: 25181)
        25181 {
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

        // Red slayer helmet (i) (id: 25183)
        25183 {
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

        // Purple slayer helmet (i) (id: 25185)
        25185 {
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

        // Turquoise slayer helmet (i) (id: 25187)
        25187 {
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

        // Hydra slayer helmet (i) (id: 25189)
        25189 {
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

        // Twisted slayer helmet (i) (id: 25191)
        25191 {
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

        // Granite ring (i) (id: 25193)
        25193 {
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

        // Blue cape (id: 25195)
        25195 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Red cape (id: 25207)
        25207 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Blue cape (id: 25208)
        25208 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Blue icon (id: 25212)
        25212 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 25213)
        25213 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 25214)
        25214 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 25215)
        25215 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 25216)
        25216 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 25217)
        25217 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 25218)
        25218 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 25219)
        25219 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 25220)
        25220 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 25221)
        25221 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 25222)
        25222 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 25223)
        25223 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 25224)
        25224 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 25225)
        25225 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 25226)
        25226 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 25227)
        25227 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 25228)
        25228 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 25229)
        25229 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 25230)
        25230 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 25231)
        25231 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 25232)
        25232 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 25233)
        25233 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 25234)
        25234 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 25235)
        25235 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 25236)
        25236 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 25237)
        25237 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 25238)
        25238 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 25239)
        25239 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 25240)
        25240 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 25241)
        25241 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 25242)
        25242 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 25243)
        25243 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Ring of suffering (i) (id: 25246)
        25246 {
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

        // Ring of suffering (ri) (id: 25248)
        25248 {
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

        // Salve amulet(i) (id: 25250)
        25250 {
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

        // Ring of the gods (i) (id: 25252)
        25252 {
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

        // Tyrannical ring (i) (id: 25254)
        25254 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_CRUSH(8)
                    DEF_CRUSH(8)
                }
            }
        }

        // Treasonous ring (i) (id: 25256)
        25256 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_STAB(8)
                    DEF_STAB(8)
                }
            }
        }

        // Seers ring (i) (id: 25258)
        25258 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_MAGIC(12)
                    DEF_MAGIC(12)
                    MAGIC_DAMAGE(0)
                }
            }
        }

        // Archers ring (i) (id: 25260)
        25260 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_RANGED(8)
                    DEF_RANGE(8)
                }
            }
        }

        // Warrior ring (i) (id: 25262)
        25262 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_SLASH(8)
                    DEF_SLASH(8)
                }
            }
        }

        // Berserker ring (i) (id: 25264)
        25264 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    DEF_CRUSH(8)
                    Bonuses.Bonus.STRENGTH(8)
                }
            }
        }

        // Black mask (10) (i) (id: 25266)
        25266 {
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

        // Black mask (9) (i) (id: 25267)
        25267 {
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

        // Black mask (8) (i) (id: 25268)
        25268 {
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

        // Black mask (7) (i) (id: 25269)
        25269 {
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

        // Black mask (6) (i) (id: 25270)
        25270 {
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

        // Black mask (5) (i) (id: 25271)
        25271 {
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

        // Black mask (4) (i) (id: 25272)
        25272 {
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

        // Black mask (3) (i) (id: 25273)
        25273 {
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

        // Black mask (2) (i) (id: 25274)
        25274 {
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

        // Black mask (1) (i) (id: 25275)
        25275 {
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

        // Black mask (i) (id: 25276)
        25276 {
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

        // Salve amulet(ei) (id: 25278)
        25278 {
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

        // Sled (id: 25282)
        25282 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Giant boulder (id: 25314)
        25314 {
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

        // 20th anniversary top (id: 25324)
        25324 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // 20th anniversary bottom (id: 25326)
        25326 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // 20th anniversary boots (id: 25328)
        25328 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // 20th anniversary gloves (id: 25330)
        25330 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // 20th anniversary necklace (id: 25332)
        25332 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // 20th anniversary cape (id: 25334)
        25334 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Soul cape (id: 25344)
        25344 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    PRAYER(8)
                }
            }
        }

        // Soul cape (id: 25346)
        25346 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    PRAYER(8)
                }
            }
        }

        // Infernal harpoon (uncharged) (id: 25367)
        25367 {
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

        // Infernal pickaxe (uncharged) (id: 25369)
        25369 {
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

        // Infernal axe (uncharged) (id: 25371)
        25371 {
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

        // Dragon harpoon (or) (id: 25373)
        25373 {
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

        // Dragon pickaxe (or) (id: 25376)
        25376 {
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

        // Dragon axe (or) (id: 25378)
        25378 {
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

        // Swampbark body (id: 25389)
        25389 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_STAB(38)
                    DEF_SLASH(44)
                    DEF_CRUSH(48)
                    DEF_MAGIC(21)
                }
            }
        }

        // Swampbark gauntlets (id: 25392)
        25392 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_STAB(4)
                    DEF_SLASH(3)
                    DEF_CRUSH(5)
                    DEF_MAGIC(4)
                }
            }
        }

        // Swampbark boots (id: 25395)
        25395 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_STAB(4)
                    DEF_SLASH(3)
                    DEF_CRUSH(5)
                    DEF_MAGIC(4)
                }
            }
        }

        // Swampbark helm (id: 25398)
        25398 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_STAB(13)
                    DEF_SLASH(11)
                    DEF_CRUSH(14)
                    DEF_MAGIC(5)
                }
            }
        }

        // Swampbark legs (id: 25401)
        25401 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(10)
                    DEF_STAB(20)
                    DEF_SLASH(22)
                    DEF_CRUSH(24)
                    DEF_MAGIC(15)
                }
            }
        }

        // Bloodbark body (id: 25404)
        25404 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(21)
                    DEF_STAB(53)
                    DEF_SLASH(39)
                    DEF_CRUSH(64)
                    DEF_MAGIC(24)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Bloodbark gauntlets (id: 25407)
        25407 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_STAB(5)
                    DEF_SLASH(4)
                    DEF_CRUSH(6)
                    DEF_MAGIC(5)
                }
            }
        }

        // Bloodbark boots (id: 25410)
        25410 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_STAB(5)
                    DEF_SLASH(4)
                    DEF_CRUSH(6)
                    DEF_MAGIC(5)
                }
            }
        }

        // Bloodbark helm (id: 25413)
        25413 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(5)
                    DEF_STAB(16)
                    DEF_SLASH(14)
                    DEF_CRUSH(17)
                    DEF_MAGIC(6)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Bloodbark legs (id: 25416)
        25416 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(16)
                    DEF_STAB(33)
                    DEF_SLASH(31)
                    DEF_CRUSH(38)
                    DEF_MAGIC(17)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Zealot's robe top (id: 25434)
        25434 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    PRAYER(7)
                }
            }
        }

        // Zealot's robe bottom (id: 25436)
        25436 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    PRAYER(6)
                }
            }
        }

        // Zealot's helm (id: 25438)
        25438 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    PRAYER(1)
                }
            }
        }

        // Zealot's boots (id: 25440)
        25440 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    PRAYER(1)
                }
            }
        }

        // Bronze coffin (id: 25459)
        25459 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Steel coffin (id: 25461)
        25461 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Black coffin (id: 25463)
        25463 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Silver coffin (id: 25465)
        25465 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Gold coffin (id: 25467)
        25467 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Open bronze coffin (id: 25469)
        25469 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Open steel coffin (id: 25470)
        25470 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Open black coffin (id: 25471)
        25471 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Open silver coffin (id: 25472)
        25472 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Open gold coffin (id: 25473)
        25473 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Soulreaper axe (id: 25484)
        25484 {
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

        // Ultor ring (id: 25485)
        25485 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    Bonuses.Bonus.STRENGTH(12)
                }
            }
        }

        // Magus ring (id: 25486)
        25486 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_MAGIC(15)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Venator ring (id: 25487)
        25487 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_RANGED(10)
                }
            }
        }

        // Bellator ring (id: 25488)
        25488 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_SLASH(12)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Blood ancient sceptre (id: 25489)
        25489 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(20)
                    ATT_SLASH(-1)
                    ATT_CRUSH(50)
                    ATT_MAGIC(20)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(15)
                    Bonuses.Bonus.STRENGTH(60)
                    PRAYER(-1)
                    MAGIC_DAMAGE(5)
                }
            }
        }

        // Ice ancient sceptre (id: 25490)
        25490 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(20)
                    ATT_SLASH(-1)
                    ATT_CRUSH(50)
                    ATT_MAGIC(20)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(15)
                    Bonuses.Bonus.STRENGTH(60)
                    PRAYER(-1)
                    MAGIC_DAMAGE(5)
                }
            }
        }

        // Smoke ancient sceptre (id: 25491)
        25491 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(20)
                    ATT_SLASH(-1)
                    ATT_CRUSH(50)
                    ATT_MAGIC(20)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(15)
                    Bonuses.Bonus.STRENGTH(60)
                    PRAYER(-1)
                    MAGIC_DAMAGE(5)
                }
            }
        }

        // Shadow ancient sceptre (id: 25492)
        25492 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(20)
                    ATT_SLASH(-1)
                    ATT_CRUSH(50)
                    ATT_MAGIC(20)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(15)
                    Bonuses.Bonus.STRENGTH(60)
                    PRAYER(-1)
                    MAGIC_DAMAGE(5)
                }
            }
        }

        // Black d'hide chaps (beta) (id: 25493)
        25493 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(17)
                    DEF_STAB(12)
                    DEF_SLASH(18)
                    DEF_CRUSH(18)
                    DEF_MAGIC(23)
                    DEF_RANGE(26)
                }
            }
        }

        // Black d'hide vambraces (beta) (id: 25494)
        25494 {
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

        // Crystal helm (beta) (id: 25495)
        25495 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(8)
                    DEF_STAB(12)
                    DEF_SLASH(8)
                    DEF_CRUSH(14)
                    DEF_MAGIC(26)
                    DEF_RANGE(18)
                    PRAYER(2)
                }
            }
        }

        // Crystal body (beta) (id: 25496)
        25496 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-18)
                    ATT_RANGED(30)
                    DEF_STAB(34)
                    DEF_SLASH(24)
                    DEF_CRUSH(32)
                    DEF_MAGIC(44)
                    DEF_RANGE(53)
                    PRAYER(3)
                }
            }
        }

        // Crystal legs (beta) (id: 25497)
        25497 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-12)
                    ATT_RANGED(17)
                    DEF_STAB(20)
                    DEF_SLASH(16)
                    DEF_CRUSH(24)
                    DEF_MAGIC(34)
                    DEF_RANGE(29)
                    PRAYER(2)
                }
            }
        }

        // Cursed banana (id: 25500)
        25500 {
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

        // Banana cape (id: 25502)
        25502 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Dharok's platebody (id: 25515)
        25515 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-10)
                    DEF_STAB(122)
                    DEF_SLASH(120)
                    DEF_CRUSH(107)
                    DEF_MAGIC(-6)
                    DEF_RANGE(132)
                }
            }
        }

        // Dharok's greataxe (id: 25516)
        25516 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(103)
                    ATT_CRUSH(95)
                    ATT_MAGIC(-4)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(105)
                }
            }
        }

        // Volatile nightmare staff (id: 25517)
        25517 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_MAGIC(16)
                    DEF_MAGIC(14)
                    MAGIC_DAMAGE(15)
                }
            }
        }

        // Ancestral hat (id: 25518)
        25518 {
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

        // Celestial ring (uncharged) (id: 25539)
        25539 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Celestial ring (id: 25541)
        25541 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Celestial signet (uncharged) (id: 25543)
        25543 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Celestial signet (id: 25545)
        25545 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Golden prospector jacket (id: 25551)
        25551 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Golden prospector legs (id: 25553)
        25553 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Golden prospector boots (id: 25555)
        25555 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Dark flippers (id: 25557)
        25557 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(-2)
                    ATT_CRUSH(-2)
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Tome of water (id: 25574)
        25574 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(8)
                    DEF_MAGIC(8)
                }
            }
        }

        // Tome of water (empty) (id: 25576)
        25576 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(8)
                    DEF_MAGIC(8)
                }
            }
        }

        // Fish sack barrel (id: 25585)
        25585 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Open fish sack barrel (id: 25587)
        25587 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Spirit angler top (id: 25594)
        25594 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Spirit angler waders (id: 25596)
        25596 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Spirit angler boots (id: 25598)
        25598 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Gregg's eastdoor (id: 25604)
        25604 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-50)
                    Bonuses.Bonus.STRENGTH(-10)
                }
            }
        }

        // Barronite mace (id: 25641)
        25641 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(20)
                    ATT_SLASH(-2)
                    ATT_CRUSH(40)
                    Bonuses.Bonus.STRENGTH(40)
                    PRAYER(2)
                }
            }
        }

        // Barronite mace (l) (id: 25643)
        25643 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(20)
                    ATT_SLASH(-2)
                    ATT_CRUSH(40)
                    Bonuses.Bonus.STRENGTH(40)
                    PRAYER(2)
                }
            }
        }

        // Imcando hammer (id: 25644)
        25644 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
            }
        }

        // Stool (id: 25710)
        25710 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Stool (id: 25711)
        25711 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan cloak (id: 25712)
        25712 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Clan cloak (id: 25714)
        25714 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Clan cloak (id: 25715)
        25715 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Clan cloak (id: 25716)
        25716 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Clan cloak (id: 25717)
        25717 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Clan cloak (id: 25718)
        25718 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Clan cloak (id: 25719)
        25719 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Clan cloak (id: 25720)
        25720 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Clan vexillum (id: 25721)
        25721 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan vexillum (id: 25723)
        25723 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan vexillum (id: 25724)
        25724 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan vexillum (id: 25725)
        25725 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan vexillum (id: 25726)
        25726 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan vexillum (id: 25727)
        25727 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan vexillum (id: 25728)
        25728 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Clan vexillum (id: 25729)
        25729 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Holy sanguinesti staff (id: 25731)
        25731 {
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

        // Holy sanguinesti staff (uncharged) (id: 25733)
        25733 {
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

        // Holy ghrazi rapier (id: 25734)
        25734 {
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

        // Holy scythe of vitur (id: 25736)
        25736 {
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

        // Holy scythe of vitur (uncharged) (id: 25738)
        25738 {
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

        // Sanguine scythe of vitur (id: 25739)
        25739 {
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

        // Sanguine scythe of vitur (uncharged) (id: 25741)
        25741 {
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

        // Book of the dead (id: 25818)
        25818 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(6)
                    PRAYER(3)
                }
            }
        }

        // Protest banner (id: 25822)
        25822 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Amethyst dart (id: 25849)
        25849 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 3
                    longAttackDistance = 5
                }
                bonuses {
                    RANGE_STRENGTH(28)
                }
            }
        }

        // Amethyst dart(p) (id: 25851)
        25851 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 3
                    longAttackDistance = 5
                }
                bonuses {
                    RANGE_STRENGTH(28)
                }
            }
        }

        // Amethyst dart(p+) (id: 25855)
        25855 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 3
                    longAttackDistance = 5
                }
                bonuses {
                    RANGE_STRENGTH(28)
                }
            }
        }

        // Amethyst dart(p++) (id: 25857)
        25857 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 3
                    longAttackDistance = 5
                }
                bonuses {
                    RANGE_STRENGTH(28)
                }
            }
        }

        // Bow of faerdhinen (inactive) (id: 25862)
        25862 {
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

        // Bow of faerdhinen (id: 25865)
        25865 {
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

        // Bow of faerdhinen (c) (id: 25867)
        25867 {
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

        // Blade of saeldor (c) (id: 25870)
        25870 {
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

        // Blade of saeldor (c) (id: 25872)
        25872 {
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

        // Blade of saeldor (c) (id: 25874)
        25874 {
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

        // Blade of saeldor (c) (id: 25876)
        25876 {
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

        // Blade of saeldor (c) (id: 25878)
        25878 {
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

        // Blade of saeldor (c) (id: 25880)
        25880 {
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

        // Blade of saeldor (c) (id: 25882)
        25882 {
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

        // Bow of faerdhinen (c) (id: 25884)
        25884 {
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

        // Bow of faerdhinen (c) (id: 25886)
        25886 {
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

        // Bow of faerdhinen (c) (id: 25888)
        25888 {
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

        // Bow of faerdhinen (c) (id: 25890)
        25890 {
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

        // Bow of faerdhinen (c) (id: 25892)
        25892 {
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

        // Bow of faerdhinen (c) (id: 25894)
        25894 {
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

        // Bow of faerdhinen (c) (id: 25896)
        25896 {
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

        // Tztok slayer helmet (id: 25898)
        25898 {
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

        // Tztok slayer helmet (i) (id: 25900)
        25900 {
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

        // Tztok slayer helmet (i) (id: 25902)
        25902 {
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

        // Vampyric slayer helmet (id: 25904)
        25904 {
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

        // Vampyric slayer helmet (i) (id: 25906)
        25906 {
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

        // Vampyric slayer helmet (i) (id: 25908)
        25908 {
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

        // Tzkal slayer helmet (id: 25910)
        25910 {
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

        // Tzkal slayer helmet (i) (id: 25912)
        25912 {
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

        // Tzkal slayer helmet (i) (id: 25914)
        25914 {
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

        // Dragon hunter crossbow (t) (id: 25916)
        25916 {
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

        // Dragon hunter crossbow (b) (id: 25918)
        25918 {
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

        // Ghommal's hilt 1 (id: 25926)
        25926 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Ghommal's hilt 2 (id: 25928)
        25928 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Ghommal's hilt 3 (id: 25930)
        25930 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Ghommal's hilt 4 (id: 25932)
        25932 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Ghommal's hilt 5 (id: 25934)
        25934 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Ghommal's hilt 6 (id: 25936)
        25936 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Lightbearer (id: 25975)
        25975 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Keris partisan (id: 25979)
        25979 {
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

        // Keris partisan of breaching (id: 25981)
        25981 {
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

        // Elidinis' ward (id: 25985)
        25985 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(5)
                    DEF_STAB(5)
                    DEF_SLASH(3)
                    DEF_CRUSH(9)
                    DEF_RANGE(6)
                    PRAYER(1)
                    MAGIC_DAMAGE(3)
                }
            }
        }

        // Group ironman helm (id: 26156)
        26156 {
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

        // Group ironman platebody (id: 26158)
        26158 {
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

        // Group ironman platebody (id: 26160)
        26160 {
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

        // Group ironman platebody (id: 26162)
        26162 {
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

        // Group ironman platebody (id: 26164)
        26164 {
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

        // Group ironman platelegs (id: 26166)
        26166 {
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

        // Group ironman bracers (id: 26168)
        26168 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_MAGIC(1)
                    DEF_RANGE(1)
                }
            }
        }

        // Hardcore group ironman helm (id: 26170)
        26170 {
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

        // Hardcore group ironman platebody (id: 26172)
        26172 {
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

        // Hardcore group ironman platebody (id: 26174)
        26174 {
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

        // Hardcore group ironman platebody (id: 26176)
        26176 {
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

        // Hardcore group ironman platebody (id: 26178)
        26178 {
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

        // Hardcore group ironman platelegs (id: 26180)
        26180 {
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

        // Hardcore group ironman bracers (id: 26182)
        26182 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_MAGIC(1)
                    DEF_RANGE(1)
                }
            }
        }

        // Blue icon (id: 26184)
        26184 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 26185)
        26185 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 26186)
        26186 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 26187)
        26187 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 26188)
        26188 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 26189)
        26189 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 26190)
        26190 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 26191)
        26191 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 26192)
        26192 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 26193)
        26193 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 26194)
        26194 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 26195)
        26195 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 26196)
        26196 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 26197)
        26197 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 26198)
        26198 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Blue icon (id: 26199)
        26199 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 26200)
        26200 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 26201)
        26201 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 26202)
        26202 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 26203)
        26203 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 26204)
        26204 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 26205)
        26205 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 26206)
        26206 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 26207)
        26207 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 26208)
        26208 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 26209)
        26209 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 26210)
        26210 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 26211)
        26211 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 26212)
        26212 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 26213)
        26213 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 26214)
        26214 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Red icon (id: 26215)
        26215 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Osmumten's fang (id: 26219)
        26219 {
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

        // Ancient ceremonial top (id: 26221)
        26221 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    PRAYER(6)
                }
            }
        }

        // Ancient ceremonial legs (id: 26223)
        26223 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    PRAYER(5)
                }
            }
        }

        // Ancient ceremonial mask (id: 26225)
        26225 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    PRAYER(2)
                }
            }
        }

        // Ancient ceremonial gloves (id: 26227)
        26227 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    PRAYER(1)
                }
            }
        }

        // Ancient ceremonial boots (id: 26229)
        26229 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    PRAYER(1)
                }
            }
        }

        // Ancient godsword (id: 26233)
        26233 {
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

        // Zaryte vambraces (id: 26235)
        26235 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(-8)
                    ATT_SLASH(-8)
                    ATT_CRUSH(-8)
                    ATT_RANGED(18)
                    DEF_STAB(8)
                    DEF_SLASH(8)
                    DEF_CRUSH(8)
                    DEF_MAGIC(5)
                    DEF_RANGE(8)
                    PRAYER(1)
                }
            }
        }

        // Virtus mask (id: 26241)
        26241 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(8)
                    ATT_RANGED(-3)
                    DEF_STAB(15)
                    DEF_SLASH(14)
                    DEF_CRUSH(16)
                    DEF_MAGIC(6)
                    PRAYER(1)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Virtus robe top (id: 26243)
        26243 {
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

        // Virtus robe bottom (id: 26245)
        26245 {
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

        // Ugly halloween jumper (orange) (id: 26256)
        26256 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Ugly halloween jumper (black) (id: 26258)
        26258 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Haunted wine bottle (id: 26260)
        26260 {
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

        // Festive elf slippers (id: 26310)
        26310 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Secret santa present (red) (id: 26316)
        26316 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Secret santa present (blue) (id: 26318)
        26318 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Secret santa present (green) (id: 26320)
        26320 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Secret santa present (black) (id: 26322)
        26322 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Secret santa present (gold) (id: 26324)
        26324 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Zaryte crossbow (id: 26374)
        26374 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                    normalAttackDistance = 8
                    longAttackDistance = 10
                }
                bonuses {
                    ATT_RANGED(110)
                    DEF_STAB(14)
                    DEF_SLASH(14)
                    DEF_CRUSH(12)
                    DEF_MAGIC(15)
                    DEF_RANGE(16)
                    PRAYER(1)
                }
            }
        }

        // Torva full helm (id: 26382)
        26382 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-5)
                    ATT_RANGED(-5)
                    DEF_STAB(59)
                    DEF_SLASH(60)
                    DEF_CRUSH(62)
                    DEF_MAGIC(-2)
                    DEF_RANGE(57)
                    Bonuses.Bonus.STRENGTH(8)
                    PRAYER(1)
                }
            }
        }

        // Torva platebody (id: 26384)
        26384 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-18)
                    ATT_RANGED(-14)
                    DEF_STAB(117)
                    DEF_SLASH(111)
                    DEF_CRUSH(117)
                    DEF_MAGIC(-11)
                    DEF_RANGE(142)
                    Bonuses.Bonus.STRENGTH(6)
                    PRAYER(1)
                }
            }
        }

        // Torva platelegs (id: 26386)
        26386 {
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

        // Shattered banner (id: 26424)
        26424 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Shattered top (t1) (id: 26430)
        26430 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Shattered trousers (t1) (id: 26433)
        26433 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Shattered boots (t1) (id: 26436)
        26436 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Shattered top (t2) (id: 26442)
        26442 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Shattered trousers (t2) (id: 26445)
        26445 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Shattered boots (t2) (id: 26448)
        26448 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Shattered top (t3) (id: 26454)
        26454 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Shattered trousers (t3) (id: 26457)
        26457 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Shattered boots (t3) (id: 26460)
        26460 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Void knight top (or) (id: 26463)
        26463 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_STAB(45)
                    DEF_SLASH(45)
                    DEF_CRUSH(45)
                    DEF_MAGIC(45)
                    DEF_RANGE(45)
                }
            }
        }

        // Void knight robe (or) (id: 26465)
        26465 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_STAB(30)
                    DEF_SLASH(30)
                    DEF_CRUSH(30)
                    DEF_MAGIC(30)
                    DEF_RANGE(30)
                }
            }
        }

        // Void knight gloves (or) (id: 26467)
        26467 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_STAB(6)
                    DEF_SLASH(6)
                    DEF_CRUSH(6)
                    DEF_MAGIC(4)
                    DEF_RANGE(6)
                }
            }
        }

        // Elite void top (or) (id: 26469)
        26469 {
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

        // Elite void robe (or) (id: 26471)
        26471 {
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

        // Void mage helm (or) (id: 26473)
        26473 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(6)
                    DEF_SLASH(6)
                    DEF_CRUSH(6)
                    DEF_MAGIC(6)
                    DEF_RANGE(6)
                }
            }
        }

        // Void ranger helm (or) (id: 26475)
        26475 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(6)
                    DEF_SLASH(6)
                    DEF_CRUSH(6)
                    DEF_MAGIC(6)
                    DEF_RANGE(6)
                }
            }
        }

        // Void melee helm (or) (id: 26477)
        26477 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(6)
                    DEF_SLASH(6)
                    DEF_CRUSH(6)
                    DEF_MAGIC(6)
                    DEF_RANGE(6)
                }
            }
        }

        // Abyssal whip (or) (id: 26482)
        26482 {
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

        // Abyssal tentacle (or) (id: 26484)
        26484 {
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

        // Rune crossbow (or) (id: 26486)
        26486 {
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

        // Book of balance (or) (id: 26488)
        26488 {
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

        // Book of darkness (or) (id: 26490)
        26490 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(10)
                    PRAYER(5)
                }
            }
        }

        // Book of law (or) (id: 26492)
        26492 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_RANGED(10)
                    PRAYER(5)
                }
            }
        }

        // Book of war (or) (id: 26494)
        26494 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    Bonuses.Bonus.STRENGTH(2)
                    PRAYER(5)
                }
            }
        }

        // Holy book (or) (id: 26496)
        26496 {
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

        // Unholy book (or) (id: 26498)
        26498 {
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

        // Shattered teleport scroll (id: 26500)
        26500 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Shattered relics bronze trophy (id: 26503)
        26503 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Shattered relics iron trophy (id: 26505)
        26505 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Shattered relics steel trophy (id: 26507)
        26507 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Shattered relics mithril trophy (id: 26509)
        26509 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Shattered relics adamant trophy (id: 26511)
        26511 {
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

        // Shattered relics rune trophy (id: 26513)
        26513 {
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

        // Shattered relics dragon trophy (id: 26515)
        26515 {
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

        // Shattered cane (id: 26517)
        26517 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Mystic hat (or) (id: 26531)
        26531 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                }
            }
        }

        // Mystic robe top (or) (id: 26533)
        26533 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(20)
                    DEF_MAGIC(20)
                }
            }
        }

        // Mystic robe bottom (or) (id: 26535)
        26535 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_MAGIC(15)
                }
            }
        }

        // Mystic gloves (or) (id: 26537)
        26537 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Mystic boots (or) (id: 26539)
        26539 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Portable waystone (id: 26549)
        26549 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Arcane grimoire (id: 26551)
        26551 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(6)
                    PRAYER(3)
                }
            }
        }

        // White goblin mail (id: 26567)
        26567 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Goblin potion(4) (id: 26581)
        26581 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Skis (id: 26649)
        26649 {
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

        // Slayer helmet (i) (id: 26674)
        26674 {
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

        // Black slayer helmet (i) (id: 26675)
        26675 {
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

        // Green slayer helmet (i) (id: 26676)
        26676 {
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

        // Red slayer helmet (i) (id: 26677)
        26677 {
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

        // Purple slayer helmet (i) (id: 26678)
        26678 {
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

        // Turquoise slayer helmet (i) (id: 26679)
        26679 {
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

        // Hydra slayer helmet (i) (id: 26680)
        26680 {
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

        // Twisted slayer helmet (i) (id: 26681)
        26681 {
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

        // Tztok slayer helmet (i) (id: 26682)
        26682 {
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

        // Vampyric slayer helmet (i) (id: 26683)
        26683 {
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

        // Tzkal slayer helmet (i) (id: 26684)
        26684 {
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

        // Granite ring (i) (id: 26685)
        26685 {
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

        // Dragon claws (or) (id: 26708)
        26708 {
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

        // Dragon warhammer (or) (id: 26710)
        26710 {
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

        // Heavy ballista (or) (id: 26712)
        26712 {
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

        // Armadyl helmet (or) (id: 26714)
        26714 {
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

        // Armadyl chestplate (or) (id: 26715)
        26715 {
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

        // Armadyl chainskirt (or) (id: 26716)
        26716 {
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

        // Bandos chestplate (or) (id: 26718)
        26718 {
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

        // Bandos tassets (or) (id: 26719)
        26719 {
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

        // Bandos boots (or) (id: 26720)
        26720 {
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

        // Centurion cuirass (id: 26721)
        26721 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-40)
                    DEF_STAB(72)
                    DEF_SLASH(91)
                    DEF_CRUSH(70)
                    DEF_MAGIC(-10)
                    DEF_RANGE(7)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Centurion cuirass (l) (id: 26722)
        26722 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-40)
                    DEF_STAB(72)
                    DEF_SLASH(91)
                    DEF_CRUSH(70)
                    DEF_MAGIC(-10)
                    DEF_RANGE(7)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Wristbands of the arena (id: 26723)
        26723 {
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

        // Wristbands of the arena (l) (id: 26724)
        26724 {
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

        // Wristbands of the arena (c) (id: 26725)
        26725 {
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

        // Wristbands of the arena (cl) (id: 26726)
        26726 {
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

        // Wristbands of the arena (i) (id: 26727)
        26727 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(14)
                    ATT_SLASH(13)
                    ATT_CRUSH(15)
                    ATT_MAGIC(7)
                    ATT_RANGED(13)
                    DEF_STAB(12)
                    DEF_SLASH(12)
                    DEF_CRUSH(12)
                    DEF_MAGIC(6)
                    DEF_RANGE(12)
                    Bonuses.Bonus.STRENGTH(12)
                }
            }
        }

        // Wristbands of the arena (il) (id: 26728)
        26728 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(14)
                    ATT_SLASH(13)
                    ATT_CRUSH(15)
                    ATT_MAGIC(7)
                    ATT_RANGED(13)
                    DEF_STAB(12)
                    DEF_SLASH(12)
                    DEF_CRUSH(12)
                    DEF_MAGIC(6)
                    DEF_RANGE(12)
                    Bonuses.Bonus.STRENGTH(12)
                }
            }
        }

        // Wristbands of the arena (ic) (id: 26729)
        26729 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(14)
                    ATT_SLASH(13)
                    ATT_CRUSH(15)
                    ATT_MAGIC(7)
                    ATT_RANGED(13)
                    DEF_STAB(12)
                    DEF_SLASH(12)
                    DEF_CRUSH(12)
                    DEF_MAGIC(6)
                    DEF_RANGE(12)
                    Bonuses.Bonus.STRENGTH(12)
                }
            }
        }

        // Wristbands of the arena (ilc) (id: 26730)
        26730 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(14)
                    ATT_SLASH(13)
                    ATT_CRUSH(15)
                    ATT_MAGIC(7)
                    ATT_RANGED(13)
                    DEF_STAB(12)
                    DEF_SLASH(12)
                    DEF_CRUSH(12)
                    DEF_MAGIC(6)
                    DEF_RANGE(12)
                    Bonuses.Bonus.STRENGTH(12)
                }
            }
        }

        // Saika's hood (id: 26731)
        26731 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(-20)
                    ATT_SLASH(-20)
                    ATT_CRUSH(-20)
                    ATT_MAGIC(10)
                    ATT_RANGED(-20)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(10)
                    DEF_RANGE(-10)
                }
            }
        }

        // Saika's hood (l) (id: 26732)
        26732 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(6)
                    DEF_STAB(5)
                    DEF_SLASH(5)
                    DEF_CRUSH(5)
                    DEF_MAGIC(2)
                    DEF_RANGE(-8)
                    PRAYER(1)
                }
            }
        }

        // Saika's veil (id: 26733)
        26733 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(-40)
                    ATT_SLASH(-40)
                    ATT_CRUSH(-40)
                    ATT_MAGIC(14)
                    ATT_RANGED(-40)
                    DEF_STAB(15)
                    DEF_SLASH(15)
                    DEF_CRUSH(15)
                    DEF_RANGE(-15)
                }
            }
        }

        // Saika's veil (l) (id: 26734)
        26734 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(-5)
                    ATT_SLASH(-3)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(8)
                    ATT_RANGED(-2)
                    DEF_STAB(14)
                    DEF_SLASH(12)
                    DEF_CRUSH(15)
                    DEF_MAGIC(4)
                    DEF_RANGE(-8)
                    PRAYER(2)
                }
            }
        }

        // Saika's shroud (id: 26735)
        26735 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(-60)
                    ATT_SLASH(-60)
                    ATT_CRUSH(-60)
                    ATT_MAGIC(18)
                    ATT_RANGED(-60)
                    DEF_STAB(20)
                    DEF_SLASH(20)
                    DEF_CRUSH(20)
                    DEF_RANGE(-25)
                }
            }
        }

        // Saika's shroud (l) (id: 26736)
        26736 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(-10)
                    ATT_SLASH(-11)
                    ATT_CRUSH(-8)
                    ATT_MAGIC(11)
                    ATT_RANGED(-4)
                    DEF_STAB(19)
                    DEF_SLASH(18)
                    DEF_CRUSH(20)
                    DEF_MAGIC(8)
                    DEF_RANGE(-8)
                    PRAYER(3)
                }
            }
        }

        // Koriff's headband (id: 26737)
        26737 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(-20)
                    ATT_SLASH(-20)
                    ATT_CRUSH(-20)
                    ATT_MAGIC(-20)
                    ATT_RANGED(10)
                    DEF_STAB(-10)
                    DEF_SLASH(-10)
                    DEF_CRUSH(-10)
                    DEF_MAGIC(10)
                }
            }
        }

        // Koriff's headband (l) (id: 26738)
        26738 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(1)
                    DEF_STAB(-8)
                    DEF_SLASH(-10)
                    DEF_CRUSH(-6)
                    DEF_MAGIC(2)
                    DEF_RANGE(1)
                    PRAYER(1)
                }
            }
        }

        // Koriff's cowl (id: 26739)
        26739 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(-40)
                    ATT_SLASH(-40)
                    ATT_CRUSH(-40)
                    ATT_MAGIC(-40)
                    ATT_RANGED(14)
                    DEF_STAB(-15)
                    DEF_SLASH(-15)
                    DEF_CRUSH(-15)
                    DEF_MAGIC(15)
                }
            }
        }

        // Koriff's cowl (l) (id: 26740)
        26740 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-7)
                    ATT_RANGED(5)
                    DEF_STAB(-8)
                    DEF_SLASH(-10)
                    DEF_CRUSH(-6)
                    DEF_MAGIC(3)
                    DEF_RANGE(3)
                    PRAYER(2)
                }
            }
        }

        // Koriff's coif (id: 26741)
        26741 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(-60)
                    ATT_SLASH(-60)
                    ATT_CRUSH(-60)
                    ATT_MAGIC(-60)
                    ATT_RANGED(18)
                    DEF_STAB(-25)
                    DEF_SLASH(-25)
                    DEF_CRUSH(-25)
                    DEF_MAGIC(20)
                }
            }
        }

        // Koriff's coif (l) (id: 26742)
        26742 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(-3)
                    ATT_SLASH(-4)
                    ATT_CRUSH(-5)
                    ATT_MAGIC(-13)
                    ATT_RANGED(8)
                    DEF_STAB(-8)
                    DEF_SLASH(-10)
                    DEF_CRUSH(-6)
                    DEF_MAGIC(7)
                    DEF_RANGE(12)
                    PRAYER(3)
                }
            }
        }

        // Maoma's med helm (id: 26743)
        26743 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(6)
                    ATT_SLASH(6)
                    ATT_CRUSH(6)
                    ATT_MAGIC(-20)
                    ATT_RANGED(-20)
                    DEF_MAGIC(-10)
                    DEF_RANGE(10)
                    Bonuses.Bonus.STRENGTH(1)
                }
            }
        }

        // Maoma's med helm (l) (id: 26744)
        26744 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-3)
                    DEF_STAB(6)
                    DEF_SLASH(10)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-9)
                    DEF_RANGE(10)
                    Bonuses.Bonus.STRENGTH(1)
                    PRAYER(1)
                }
            }
        }

        // Maoma's full helm (id: 26745)
        26745 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(8)
                    ATT_SLASH(8)
                    ATT_CRUSH(8)
                    ATT_MAGIC(-40)
                    ATT_RANGED(-40)
                    DEF_MAGIC(-15)
                    DEF_RANGE(15)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Maoma's full helm (l) (id: 26746)
        26746 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(2)
                    ATT_SLASH(3)
                    ATT_CRUSH(1)
                    ATT_MAGIC(-13)
                    ATT_RANGED(-7)
                    DEF_STAB(26)
                    DEF_SLASH(29)
                    DEF_CRUSH(27)
                    DEF_MAGIC(-9)
                    DEF_RANGE(38)
                    Bonuses.Bonus.STRENGTH(3)
                    PRAYER(2)
                }
            }
        }

        // Maoma's great helm (id: 26747)
        26747 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(10)
                    ATT_CRUSH(10)
                    ATT_MAGIC(-60)
                    ATT_RANGED(-60)
                    DEF_MAGIC(-25)
                    DEF_RANGE(25)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Maoma's great helm (l) (id: 26748)
        26748 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(6)
                    ATT_SLASH(5)
                    ATT_CRUSH(4)
                    ATT_MAGIC(-20)
                    ATT_RANGED(-10)
                    DEF_STAB(38)
                    DEF_SLASH(46)
                    DEF_CRUSH(43)
                    DEF_MAGIC(-9)
                    DEF_RANGE(59)
                    Bonuses.Bonus.STRENGTH(5)
                    PRAYER(3)
                }
            }
        }

        // Calamity chest (id: 26749)
        26749 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(8)
                    ATT_RANGED(11)
                    DEF_STAB(6)
                    DEF_SLASH(7)
                    DEF_CRUSH(10)
                    DEF_MAGIC(12)
                    DEF_RANGE(10)
                }
            }
        }

        // Calamity chest (l) (id: 26750)
        26750 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_STAB(5)
                    DEF_SLASH(7)
                    DEF_CRUSH(6)
                    DEF_MAGIC(4)
                    DEF_RANGE(5)
                }
            }
        }

        // Superior calamity chest (id: 26751)
        26751 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(5)
                    ATT_CRUSH(5)
                    ATT_MAGIC(12)
                    ATT_RANGED(16)
                    DEF_STAB(47)
                    DEF_SLASH(51)
                    DEF_CRUSH(54)
                    DEF_MAGIC(28)
                    DEF_RANGE(48)
                }
            }
        }

        // Superior calamity chest (l) (id: 26752)
        26752 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_STAB(52)
                    DEF_SLASH(52)
                    DEF_CRUSH(52)
                    DEF_MAGIC(18)
                    DEF_RANGE(49)
                }
            }
        }

        // Elite calamity chest (id: 26753)
        26753 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_STAB(6)
                    ATT_SLASH(6)
                    ATT_CRUSH(6)
                    ATT_MAGIC(16)
                    ATT_RANGED(21)
                    DEF_STAB(66)
                    DEF_SLASH(63)
                    DEF_CRUSH(66)
                    DEF_MAGIC(36)
                    DEF_RANGE(64)
                }
            }
        }

        // Elite calamity chest (l) (id: 26754)
        26754 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_STAB(73)
                    DEF_SLASH(73)
                    DEF_CRUSH(73)
                    DEF_MAGIC(32)
                    DEF_RANGE(67)
                }
            }
        }

        // Calamity breeches (id: 26755)
        26755 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_STAB(2)
                    ATT_SLASH(2)
                    ATT_CRUSH(2)
                    ATT_MAGIC(5)
                    ATT_RANGED(8)
                    DEF_STAB(4)
                    DEF_SLASH(5)
                    DEF_CRUSH(8)
                    DEF_MAGIC(8)
                    DEF_RANGE(8)
                }
            }
        }

        // Calamity breeches (l) (id: 26756)
        26756 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_STAB(3)
                    DEF_SLASH(5)
                    DEF_CRUSH(4)
                    DEF_MAGIC(2)
                    DEF_RANGE(4)
                }
            }
        }

        // Superior calamity breeches (id: 26757)
        26757 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_STAB(3)
                    ATT_SLASH(3)
                    ATT_CRUSH(3)
                    ATT_MAGIC(8)
                    ATT_RANGED(11)
                    DEF_STAB(32)
                    DEF_SLASH(34)
                    DEF_CRUSH(36)
                    DEF_MAGIC(20)
                    DEF_RANGE(32)
                }
            }
        }

        // Superior calamity breeches (l) (id: 26758)
        26758 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_STAB(36)
                    DEF_SLASH(36)
                    DEF_CRUSH(36)
                    DEF_MAGIC(12)
                    DEF_RANGE(34)
                }
            }
        }

        // Elite calamity breeches (id: 26759)
        26759 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(11)
                    ATT_RANGED(14)
                    DEF_STAB(44)
                    DEF_SLASH(43)
                    DEF_CRUSH(44)
                    DEF_MAGIC(24)
                    DEF_RANGE(44)
                }
            }
        }

        // Elite calamity breeches (l) (id: 26760)
        26760 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_STAB(58)
                    DEF_SLASH(58)
                    DEF_CRUSH(58)
                    DEF_MAGIC(20)
                    DEF_RANGE(52)
                }
            }
        }

        // Ring of suffering (i) (id: 26761)
        26761 {
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

        // Ring of suffering (ri) (id: 26762)
        26762 {
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

        // Salve amulet(i) (id: 26763)
        26763 {
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

        // Ring of the gods (i) (id: 26764)
        26764 {
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

        // Tyrannical ring (i) (id: 26765)
        26765 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_CRUSH(8)
                    DEF_CRUSH(8)
                }
            }
        }

        // Treasonous ring (i) (id: 26766)
        26766 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_STAB(8)
                    DEF_STAB(8)
                }
            }
        }

        // Seers ring (i) (id: 26767)
        26767 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_MAGIC(12)
                    DEF_MAGIC(12)
                    MAGIC_DAMAGE(0)
                }
            }
        }

        // Archers ring (i) (id: 26768)
        26768 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_RANGED(8)
                    DEF_RANGE(8)
                }
            }
        }

        // Warrior ring (i) (id: 26769)
        26769 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_SLASH(8)
                    DEF_SLASH(8)
                }
            }
        }

        // Berserker ring (i) (id: 26770)
        26770 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    DEF_CRUSH(8)
                    Bonuses.Bonus.STRENGTH(8)
                }
            }
        }

        // Black mask (10) (i) (id: 26771)
        26771 {
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

        // Black mask (9) (i) (id: 26772)
        26772 {
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

        // Black mask (8) (i) (id: 26773)
        26773 {
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

        // Black mask (7) (i) (id: 26774)
        26774 {
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

        // Black mask (6) (i) (id: 26775)
        26775 {
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

        // Black mask (5) (i) (id: 26776)
        26776 {
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

        // Black mask (4) (i) (id: 26777)
        26777 {
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

        // Black mask (3) (i) (id: 26778)
        26778 {
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

        // Black mask (2) (i) (id: 26779)
        26779 {
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

        // Black mask (1) (i) (id: 26780)
        26780 {
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

        // Black mask (i) (id: 26781)
        26781 {
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

        // Salve amulet(ei) (id: 26782)
        26782 {
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

        // Ring of the elements (id: 26815)
        26815 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ring of the elements (id: 26818)
        26818 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Abyssal lantern (id: 26822)
        26822 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Abyssal lantern (normal logs) (id: 26824)
        26824 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Abyssal lantern (blue logs) (id: 26826)
        26826 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Abyssal lantern (red logs) (id: 26828)
        26828 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Abyssal lantern (white logs) (id: 26830)
        26830 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Abyssal lantern (purple logs) (id: 26832)
        26832 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Abyssal lantern (green logs) (id: 26834)
        26834 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Abyssal lantern (oak logs) (id: 26836)
        26836 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Abyssal lantern (willow logs) (id: 26838)
        26838 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Abyssal lantern (maple logs) (id: 26840)
        26840 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Abyssal lantern (yew logs) (id: 26842)
        26842 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Abyssal lantern (blisterwood logs) (id: 26844)
        26844 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Abyssal lantern (magic logs) (id: 26846)
        26846 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Abyssal lantern (redwood logs) (id: 26848)
        26848 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Robe top of the eye (id: 26852)
        26852 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Robe bottoms of the eye (id: 26854)
        26854 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Boots of the eye (id: 26856)
        26856 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Robe top of the eye (red) (id: 26860)
        26860 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Robe bottoms of the eye (red) (id: 26862)
        26862 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Robe top of the eye (green) (id: 26866)
        26866 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Robe bottoms of the eye (green) (id: 26868)
        26868 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Robe top of the eye (blue) (id: 26872)
        26872 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Robe bottoms of the eye (blue) (id: 26874)
        26874 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Eye amulet (id: 26903)
        26903 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Tarnished locket (id: 26910)
        26910 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Lost bag (id: 26912)
        26912 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Amulet of the eye (id: 26914)
        26914 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Pharaoh's sceptre (uncharged) (id: 26945)
        26945 {
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
                }
            }
        }

        // Pharaoh's sceptre (id: 26948)
        26948 {
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
                }
            }
        }

    }
}
