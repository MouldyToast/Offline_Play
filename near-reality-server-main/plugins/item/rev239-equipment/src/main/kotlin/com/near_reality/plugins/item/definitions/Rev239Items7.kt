package com.near_reality.plugins.item.definitions

import com.near_reality.scripts.item.definitions.ItemDefinitionsScript
import com.zenyte.game.world.entity.player.Bonuses
import com.zenyte.game.world.entity.player.Bonuses.Bonus.*
import com.zenyte.game.world.entity.player.container.impl.equipment.EquipmentSlot

class Rev239Items7 : ItemDefinitionsScript() {
    init {
        // Pharaoh's sceptre (id: 26950)
        26950 {
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

        // Lost bag (id: 26984)
        26984 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Lost bag (id: 26986)
        26986 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Lost bag (id: 26988)
        26988 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Amulet of the eye (id: 26990)
        26990 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Amulet of the eye (id: 26992)
        26992 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Amulet of the eye (id: 26994)
        26994 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Void knight top (l)(or) (id: 27000)
        27000 {
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

        // Void knight robe (l)(or) (id: 27001)
        27001 {
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

        // Void knight gloves (l)(or) (id: 27002)
        27002 {
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

        // Elite void top (l)(or) (id: 27003)
        27003 {
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

        // Elite void robe (l)(or) (id: 27004)
        27004 {
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

        // Void mage helm (l)(or) (id: 27005)
        27005 {
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

        // Void ranger helm (l)(or) (id: 27006)
        27006 {
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

        // Void melee helm (l)(or) (id: 27007)
        27007 {
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

        // Dragon defender (l)(t) (id: 27008)
        27008 {
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

        // Rune defender (l)(t) (id: 27009)
        27009 {
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

        // Preform (id: 27010)
        27010 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Colossal blade (id: 27021)
        27021 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(98)
                    ATT_CRUSH(65)
                    ATT_MAGIC(-4)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(100)
                }
            }
        }

        // Smiths tunic (id: 27023)
        27023 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Smiths trousers (id: 27025)
        27025 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Smiths boots (id: 27027)
        27027 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Smiths gloves (id: 27029)
        27029 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Smiths gloves (i) (id: 27031)
        27031 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Group ironman helm (unranked) (id: 27042)
        27042 {
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

        // Group ironman platelegs (unranked) (id: 27044)
        27044 {
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

        // Group ironman bracers (unranked) (id: 27046)
        27046 {
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

        // Group ironman platebody (unranked) (id: 27048)
        27048 {
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

        // Group ironman platebody (unranked) (id: 27050)
        27050 {
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

        // Group ironman platebody (unranked) (id: 27052)
        27052 {
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

        // Group ironman platebody (unranked) (id: 27054)
        27054 {
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

        // Elder maul (or) (id: 27100)
        27100 {
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

        // Mithril gloves (wrapped) (id: 27110)
        27110 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(15)
                    ATT_SLASH(15)
                    ATT_CRUSH(15)
                    ATT_MAGIC(6)
                    ATT_RANGED(15)
                    Bonuses.Bonus.STRENGTH(6)
                }
            }
        }

        // Rune gloves (wrapped) (id: 27111)
        27111 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(17)
                    ATT_SLASH(17)
                    ATT_CRUSH(17)
                    ATT_MAGIC(7)
                    ATT_RANGED(17)
                    Bonuses.Bonus.STRENGTH(8)
                }
            }
        }

        // Barrows gloves (wrapped) (id: 27112)
        27112 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(21)
                    ATT_SLASH(21)
                    ATT_CRUSH(21)
                    ATT_MAGIC(9)
                    ATT_RANGED(21)
                    Bonuses.Bonus.STRENGTH(12)
                }
            }
        }

        // Elder chaos top (or) (id: 27115)
        27115 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(10)
                    DEF_MAGIC(8)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Elder chaos robe (or) (id: 27117)
        27117 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(6)
                    DEF_MAGIC(6)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Elder chaos hood (or) (id: 27119)
        27119 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(5)
                    DEF_MAGIC(4)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Dagon'hai hat (or) (id: 27123)
        27123 {
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

        // Dagon'hai robe top (or) (id: 27125)
        27125 {
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

        // Dagon'hai robe bottom (or) (id: 27127)
        27127 {
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

        // Dragon knife (id: 27157)
        27157 {
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

        // Mystic robe top (dark) (id: 27158)
        27158 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(20)
                    DEF_MAGIC(20)
                }
            }
        }

        // Mystic robe bottom (dark) (id: 27159)
        27159 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_MAGIC(15)
                }
            }
        }

        // Mystic robe top (light) (id: 27160)
        27160 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(20)
                    DEF_MAGIC(20)
                }
            }
        }

        // Mystic robe bottom (light) (id: 27161)
        27161 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_MAGIC(15)
                }
            }
        }

        // Wizard boots (id: 27162)
        27162 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                }
            }
        }

        // Guthix halo (id: 27163)
        27163 {
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

        // Zamorak halo (id: 27164)
        27164 {
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

        // Saradomin halo (id: 27165)
        27165 {
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

        // Ghostly hood (id: 27166)
        27166 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Ghostly robe (id: 27167)
        27167 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(5)
                    DEF_MAGIC(5)
                }
            }
        }

        // Ghostly robe (id: 27168)
        27168 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                }
            }
        }

        // Berserker helm (id: 27169)
        27169 {
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

        // Infinity boots (id: 27170)
        27170 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(5)
                    DEF_MAGIC(5)
                }
            }
        }

        // Tormented bracelet (id: 27171)
        27171 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(10)
                    PRAYER(2)
                    MAGIC_DAMAGE(5)
                }
            }
        }

        // Necklace of anguish (id: 27172)
        27172 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_RANGED(15)
                    PRAYER(2)
                }
            }
        }

        // Amulet of torture (id: 27173)
        27173 {
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

        // Elder chaos top (id: 27174)
        27174 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(10)
                    DEF_MAGIC(8)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Elder chaos robe (id: 27175)
        27175 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(6)
                    DEF_MAGIC(6)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Elder chaos hood (id: 27176)
        27176 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(5)
                    DEF_MAGIC(4)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Fremennik kilt (id: 27177)
        27177 {
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

        // Spiked manacles (id: 27178)
        27178 {
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

        // Rangers' tunic (id: 27179)
        27179 {
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

        // Guthix chaps (id: 27180)
        27180 {
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

        // Zamorak chaps (id: 27181)
        27181 {
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

        // Saradomin chaps (id: 27182)
        27182 {
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

        // 3rd age mage hat (id: 27183)
        27183 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(8)
                    DEF_MAGIC(8)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Ancient godsword (id: 27184)
        27184 {
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

        // Rune defender (id: 27185)
        27185 {
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

        // Zaryte crossbow (id: 27186)
        27186 {
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

        // Bow of faerdhinen (c) (id: 27187)
        27187 {
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

        // Light ballista (id: 27188)
        27188 {
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

        // Verac's flail (id: 27189)
        27189 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(68)
                    ATT_SLASH(-2)
                    ATT_CRUSH(82)
                    Bonuses.Bonus.STRENGTH(72)
                    PRAYER(6)
                }
            }
        }

        // Verac's brassard (id: 27190)
        27190 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(81)
                    DEF_SLASH(95)
                    DEF_CRUSH(85)
                    DEF_RANGE(81)
                    PRAYER(5)
                }
            }
        }

        // Unholy book (id: 27191)
        27191 {
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

        // Opal dragon bolts (e) (id: 27192)
        27192 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(122)
                }
            }
        }

        // Ancestral robe top (id: 27193)
        27193 {
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

        // Ancestral robe bottom (id: 27194)
        27194 {
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

        // Inquisitor's great helm (id: 27195)
        27195 {
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

        // Inquisitor's hauberk (id: 27196)
        27196 {
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

        // Inquisitor's plateskirt (id: 27197)
        27197 {
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

        // Inquisitor's mace (id: 27198)
        27198 {
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

        // 3rd age range top (id: 27199)
        27199 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(30)
                    DEF_STAB(55)
                    DEF_SLASH(47)
                    DEF_CRUSH(60)
                    DEF_MAGIC(60)
                    DEF_RANGE(55)
                }
            }
        }

        // 3rd age range legs (id: 27200)
        27200 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(17)
                    DEF_STAB(31)
                    DEF_SLASH(25)
                    DEF_CRUSH(33)
                    DEF_MAGIC(30)
                    DEF_RANGE(31)
                }
            }
        }

        // 3rd age range coif (id: 27201)
        27201 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-2)
                    ATT_RANGED(9)
                    DEF_STAB(4)
                    DEF_SLASH(7)
                    DEF_CRUSH(10)
                    DEF_MAGIC(5)
                    DEF_RANGE(8)
                }
            }
        }

        // Masori mask (id: 27226)
        27226 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-1)
                    ATT_RANGED(12)
                    DEF_STAB(3)
                    DEF_SLASH(4)
                    DEF_CRUSH(3)
                    DEF_MAGIC(6)
                    DEF_RANGE(4)
                }
            }
        }

        // Masori body (id: 27229)
        27229 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-4)
                    ATT_RANGED(43)
                    DEF_STAB(37)
                    DEF_SLASH(35)
                    DEF_CRUSH(38)
                    DEF_MAGIC(25)
                    DEF_RANGE(33)
                }
            }
        }

        // Masori chaps (id: 27232)
        27232 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-2)
                    ATT_RANGED(27)
                    DEF_STAB(26)
                    DEF_SLASH(24)
                    DEF_CRUSH(29)
                    DEF_MAGIC(19)
                    DEF_RANGE(22)
                }
            }
        }

        // Masori mask (f) (id: 27235)
        27235 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-1)
                    ATT_RANGED(12)
                    DEF_STAB(8)
                    DEF_SLASH(10)
                    DEF_CRUSH(12)
                    DEF_MAGIC(12)
                    DEF_RANGE(9)
                    PRAYER(1)
                }
            }
        }

        // Masori body (f) (id: 27238)
        27238 {
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

        // Masori chaps (f) (id: 27241)
        27241 {
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

        // Osmumten's fang (or) (id: 27246)
        27246 {
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

        // Elidinis' ward (f) (id: 27251)
        27251 {
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

        // Elidinis' ward (or) (id: 27253)
        27253 {
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

        // Icthlarin's shroud (tier 1) (id: 27257)
        27257 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Icthlarin's shroud (tier 2) (id: 27259)
        27259 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Icthlarin's shroud (tier 3) (id: 27261)
        27261 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Icthlarin's shroud (tier 4) (id: 27263)
        27263 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Icthlarin's shroud (tier 5) (id: 27265)
        27265 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Tumeken's shadow (id: 27275)
        27275 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 8
                    longAttackDistance = 10
                }
                bonuses {
                    ATT_MAGIC(35)
                    DEF_MAGIC(20)
                    PRAYER(1)
                }
            }
        }

        // Tumeken's shadow (uncharged) (id: 27277)
        27277 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 8
                    longAttackDistance = 10
                }
                bonuses {
                    ATT_MAGIC(35)
                    DEF_MAGIC(20)
                    PRAYER(1)
                }
            }
        }

        // Keris partisan of corruption (id: 27287)
        27287 {
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

        // Keris partisan of the sun (id: 27291)
        27291 {
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

        // Tome of fire (id: 27358)
        27358 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(8)
                    DEF_MAGIC(8)
                }
            }
        }

        // Masori assembler max cape (id: 27363)
        27363 {
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

        // Masori assembler max cape (l) (id: 27365)
        27365 {
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

        // Masori assembler (id: 27374)
        27374 {
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

        // Masori assembler (l) (id: 27376)
        27376 {
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

        // Adventurer's top (t1) (id: 27388)
        27388 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Adventurer's trousers (t1) (id: 27390)
        27390 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Adventurer's boots (t1) (id: 27394)
        27394 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Adventurer's top (t2) (id: 27396)
        27396 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Adventurer's trousers (t2) (id: 27398)
        27398 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Adventurer's boots (t2) (id: 27402)
        27402 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Adventurer's top (t3) (id: 27404)
        27404 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Adventurer's trousers (t3) (id: 27406)
        27406 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Adventurer's boots (t3) (id: 27410)
        27410 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Adventurer's vambraces (id: 27412)
        27412 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Giant stopwatch (id: 27414)
        27414 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-50)
                    Bonuses.Bonus.STRENGTH(-10)
                }
            }
        }

        // Speedy teleport scroll (id: 27416)
        27416 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Bronze speedrun trophy (id: 27418)
        27418 {
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

        // Silver speedrun trophy (id: 27420)
        27420 {
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

        // Gold speedrun trophy (id: 27422)
        27422 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-50)
                    Bonuses.Bonus.STRENGTH(-10)
                }
            }
        }

        // Platinum speedrun trophy (id: 27424)
        27424 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-50)
                    Bonuses.Bonus.STRENGTH(-10)
                }
            }
        }

        // Robe top of ruin (id: 27430)
        27430 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Robe bottom of ruin (id: 27432)
        27432 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Gloves of ruin (id: 27434)
        27434 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Socks of ruin (id: 27436)
        27436 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Cloak of ruin (id: 27438)
        27438 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Infinite money bag (id: 27440)
        27440 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Adventurer's cape (id: 27442)
        27442 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful cape (id: 27447)
        27447 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful cape (id: 27449)
        27449 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful top (id: 27450)
        27450 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful top (id: 27452)
        27452 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful legs (id: 27453)
        27453 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful legs (id: 27455)
        27455 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful gloves (id: 27456)
        27456 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful gloves (id: 27458)
        27458 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful boots (id: 27459)
        27459 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Graceful boots (id: 27461)
        27461 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Treat cauldron (id: 27463)
        27463 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Treat cauldron (id: 27465)
        27465 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Treat cauldron (id: 27467)
        27467 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Treat cauldron (id: 27469)
        27469 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Treat cauldron (id: 27471)
        27471 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Witch top (id: 27475)
        27475 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Witch robes (id: 27477)
        27477 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Witch boots (id: 27479)
        27479 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Witch cape (id: 27481)
        27481 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Terrifying charm (id: 27483)
        27483 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
            }
        }

        // Ghommal's lucky penny (id: 27544)
        27544 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
            }
        }

        // Ghommal's avernic defender 5 (id: 27550)
        27550 {
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

        // Ghommal's avernic defender 5 (l) (id: 27551)
        27551 {
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

        // Ghommal's avernic defender 6 (id: 27552)
        27552 {
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

        // Ghommal's avernic defender 6 (l) (id: 27553)
        27553 {
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

        // Sack of coal (id: 27558)
        27558 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Santa's list (id: 27564)
        27564 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Christmas jumper (id: 27566)
        27566 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Sack of coal (id: 27570)
        27570 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Festive nutcracker top (id: 27572)
        27572 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Festive nutcracker trousers (id: 27574)
        27574 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Festive nutcracker boots (id: 27578)
        27578 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Festive nutcracker staff (id: 27580)
        27580 {
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

        // Sweet nutcracker top (id: 27582)
        27582 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Sweet nutcracker trousers (id: 27583)
        27583 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Sweet nutcracker boots (id: 27585)
        27585 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Sweet nutcracker staff (id: 27586)
        27586 {
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

        // Venator bow (id: 27610)
        27610 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 6
                    longAttackDistance = 8
                }
                bonuses {
                    ATT_RANGED(90)
                }
            }
        }

        // Venator bow (uncharged) (id: 27612)
        27612 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 6
                    longAttackDistance = 8
                }
                bonuses {
                    ATT_RANGED(90)
                }
            }
        }

        // Ancient sceptre (id: 27624)
        27624 {
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

        // Ancient sceptre (l) (id: 27626)
        27626 {
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

        // Saturated heart (id: 27641)
        27641 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Mystic cards (id: 27645)
        27645 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 3
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-50)
                    Bonuses.Bonus.STRENGTH(-20)
                }
            }
        }

        // Webweaver bow (u) (id: 27652)
        27652 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 9
                    longAttackDistance = 11
                }
                bonuses {
                    ATT_RANGED(85)
                    RANGE_STRENGTH(65)
                }
            }
        }

        // Webweaver bow (id: 27655)
        27655 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 9
                    longAttackDistance = 11
                }
                bonuses {
                    ATT_RANGED(85)
                    RANGE_STRENGTH(65)
                }
            }
        }

        // Ursine chainmace (u) (id: 27657)
        27657 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(53)
                    ATT_SLASH(-2)
                    ATT_CRUSH(71)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(74)
                    PRAYER(2)
                }
            }
        }

        // Ursine chainmace (id: 27660)
        27660 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(53)
                    ATT_SLASH(-2)
                    ATT_CRUSH(71)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(74)
                    PRAYER(2)
                }
            }
        }

        // Accursed sceptre (u) (id: 27662)
        27662 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_MAGIC(22)
                    DEF_MAGIC(20)
                }
            }
        }

        // Accursed sceptre (id: 27665)
        27665 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_MAGIC(22)
                    DEF_MAGIC(20)
                }
            }
        }

        // Accursed sceptre (au) (id: 27676)
        27676 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_MAGIC(22)
                    DEF_MAGIC(20)
                }
            }
        }

        // Accursed sceptre (a) (id: 27679)
        27679 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_MAGIC(22)
                    DEF_MAGIC(20)
                }
            }
        }

        // Voidwaker (id: 27690)
        27690 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(70)
                    ATT_SLASH(80)
                    ATT_CRUSH(-2)
                    ATT_MAGIC(5)
                    DEF_SLASH(1)
                    DEF_MAGIC(2)
                    Bonuses.Bonus.STRENGTH(80)
                }
            }
        }

        // Crystal body (id: 27697)
        27697 {
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

        // Crystal body (inactive) (id: 27699)
        27699 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Crystal legs (id: 27701)
        27701 {
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

        // Crystal legs (inactive) (id: 27703)
        27703 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Crystal helm (id: 27705)
        27705 {
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

        // Crystal helm (inactive) (id: 27707)
        27707 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
            }
        }

        // Crystal body (id: 27709)
        27709 {
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

        // Crystal body (inactive) (id: 27711)
        27711 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Crystal legs (id: 27713)
        27713 {
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

        // Crystal legs (inactive) (id: 27715)
        27715 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Crystal helm (id: 27717)
        27717 {
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

        // Crystal helm (inactive) (id: 27719)
        27719 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
            }
        }

        // Crystal body (id: 27721)
        27721 {
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

        // Crystal body (inactive) (id: 27723)
        27723 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Crystal legs (id: 27725)
        27725 {
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

        // Crystal legs (inactive) (id: 27727)
        27727 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Crystal helm (id: 27729)
        27729 {
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

        // Crystal helm (inactive) (id: 27731)
        27731 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
            }
        }

        // Crystal body (id: 27733)
        27733 {
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

        // Crystal body (inactive) (id: 27735)
        27735 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Crystal legs (id: 27737)
        27737 {
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

        // Crystal legs (inactive) (id: 27739)
        27739 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Crystal helm (id: 27741)
        27741 {
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

        // Crystal helm (inactive) (id: 27743)
        27743 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
            }
        }

        // Crystal body (id: 27745)
        27745 {
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

        // Crystal body (inactive) (id: 27747)
        27747 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Crystal legs (id: 27749)
        27749 {
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

        // Crystal legs (inactive) (id: 27751)
        27751 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Crystal helm (id: 27753)
        27753 {
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

        // Crystal helm (inactive) (id: 27755)
        27755 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
            }
        }

        // Crystal body (id: 27757)
        27757 {
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

        // Crystal body (inactive) (id: 27759)
        27759 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Crystal legs (id: 27761)
        27761 {
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

        // Crystal legs (inactive) (id: 27763)
        27763 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Crystal helm (id: 27765)
        27765 {
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

        // Crystal helm (inactive) (id: 27767)
        27767 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
            }
        }

        // Crystal body (id: 27769)
        27769 {
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

        // Crystal body (inactive) (id: 27771)
        27771 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Crystal legs (id: 27773)
        27773 {
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

        // Crystal legs (inactive) (id: 27775)
        27775 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Crystal helm (id: 27777)
        27777 {
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

        // Crystal helm (inactive) (id: 27779)
        27779 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
            }
        }

        // Diamond speedrun trophy (id: 27783)
        27783 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-50)
                    Bonuses.Bonus.STRENGTH(-10)
                }
            }
        }

        // Thammaron's sceptre (au) (id: 27785)
        27785 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_MAGIC(15)
                    DEF_MAGIC(20)
                }
            }
        }

        // Thammaron's sceptre (a) (id: 27788)
        27788 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_MAGIC(15)
                    DEF_MAGIC(20)
                }
            }
        }

        // Gnome child backpack (id: 27802)
        27802 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Bob the cat slippers (id: 27806)
        27806 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Null (id: 27807)
        27807 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Jad slippers (id: 27808)
        27808 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Dragon candle dagger (id: 27810)
        27810 {
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

        // 10th birthday cape (id: 27812)
        27812 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Jad plush (id: 27814)
        27814 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Stray dog plush (id: 27816)
        27816 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Null (id: 27817)
        27817 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Gnome child plush (id: 27818)
        27818 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Null (id: 27819)
        27819 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // 10th birthday balloons (id: 27820)
        27820 {
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

        // Oldschool jumper (id: 27822)
        27822 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Oldschool jumper (id: 27823)
        27823 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Oldschool jumper (id: 27824)
        27824 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Oldschool jumper (id: 27825)
        27825 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Oldschool jumper (id: 27826)
        27826 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Oldschool jumper (id: 27827)
        27827 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Vesta's chainbody (bh) (id: 27831)
        27831 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_STAB(14)
                    ATT_SLASH(14)
                    ATT_CRUSH(4)
                    ATT_MAGIC(-32)
                    ATT_RANGED(-15)
                    DEF_STAB(55)
                    DEF_SLASH(59)
                    DEF_CRUSH(62)
                    DEF_MAGIC(-18)
                    DEF_RANGE(85)
                    Bonuses.Bonus.STRENGTH(6)
                }
            }
        }

        // Vesta's plateskirt (bh) (id: 27832)
        27832 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(10)
                    ATT_CRUSH(3)
                    ATT_MAGIC(-30)
                    ATT_RANGED(-12)
                    DEF_STAB(39)
                    DEF_SLASH(42)
                    DEF_CRUSH(45)
                    DEF_MAGIC(-15)
                    DEF_RANGE(59)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Statius's full helm (bh) (id: 27833)
        27833 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(1)
                    ATT_SLASH(1)
                    ATT_CRUSH(6)
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(52)
                    DEF_SLASH(50)
                    DEF_CRUSH(47)
                    DEF_MAGIC(-1)
                    DEF_RANGE(55)
                    Bonuses.Bonus.STRENGTH(3)
                    PRAYER(1)
                }
            }
        }

        // Statius's platebody (bh) (id: 27834)
        27834 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_STAB(2)
                    ATT_SLASH(2)
                    ATT_CRUSH(14)
                    ATT_MAGIC(-38)
                    ATT_RANGED(-17)
                    DEF_STAB(102)
                    DEF_SLASH(97)
                    DEF_CRUSH(94)
                    DEF_MAGIC(-16)
                    DEF_RANGE(105)
                    Bonuses.Bonus.STRENGTH(5)
                    PRAYER(3)
                }
            }
        }

        // Statius's platelegs (bh) (id: 27835)
        27835 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_STAB(1)
                    ATT_SLASH(1)
                    ATT_CRUSH(10)
                    ATT_MAGIC(-30)
                    ATT_RANGED(-12)
                    DEF_STAB(73)
                    DEF_SLASH(71)
                    DEF_CRUSH(68)
                    DEF_MAGIC(-14)
                    DEF_RANGE(95)
                    Bonuses.Bonus.STRENGTH(3)
                    PRAYER(3)
                }
            }
        }

        // Morrigan's coif (bh) (id: 27836)
        27836 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-5)
                    ATT_RANGED(13)
                    DEF_STAB(8)
                    DEF_SLASH(11)
                    DEF_CRUSH(14)
                    DEF_MAGIC(8)
                    DEF_RANGE(12)
                }
            }
        }

        // Morrigan's leather body (bh) (id: 27837)
        27837 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(36)
                    DEF_STAB(35)
                    DEF_SLASH(30)
                    DEF_CRUSH(40)
                    DEF_MAGIC(75)
                    DEF_RANGE(37)
                }
            }
        }

        // Morrigan's leather chaps (bh) (id: 27838)
        27838 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(23)
                    DEF_STAB(18)
                    DEF_SLASH(15)
                    DEF_CRUSH(20)
                    DEF_MAGIC(46)
                    DEF_RANGE(22)
                }
            }
        }

        // Zuriel's hood (bh) (id: 27839)
        27839 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(18)
                    ATT_RANGED(-2)
                    DEF_STAB(20)
                    DEF_SLASH(16)
                    DEF_CRUSH(22)
                    DEF_MAGIC(8)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Zuriel's robe top (bh) (id: 27840)
        27840 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(58)
                    ATT_RANGED(-10)
                    DEF_STAB(63)
                    DEF_SLASH(45)
                    DEF_CRUSH(74)
                    DEF_MAGIC(35)
                    MAGIC_DAMAGE(3)
                }
            }
        }

        // Zuriel's robe bottom (bh) (id: 27841)
        27841 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(46)
                    ATT_RANGED(-7)
                    DEF_STAB(38)
                    DEF_SLASH(35)
                    DEF_CRUSH(44)
                    DEF_MAGIC(25)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Corrupted vesta's chainbody (bh) (id: 27842)
        27842 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_STAB(14)
                    ATT_SLASH(14)
                    ATT_CRUSH(4)
                    ATT_MAGIC(-28)
                    ATT_RANGED(-14)
                    DEF_STAB(18)
                    DEF_SLASH(21)
                    DEF_CRUSH(23)
                    DEF_MAGIC(-10)
                    DEF_RANGE(21)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Corrupted vesta's plateskirt (bh) (id: 27843)
        27843 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(10)
                    ATT_CRUSH(3)
                    ATT_MAGIC(-24)
                    ATT_RANGED(-12)
                    DEF_STAB(14)
                    DEF_SLASH(11)
                    DEF_CRUSH(16)
                    DEF_MAGIC(-9)
                    DEF_RANGE(15)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Corrupted statius's full helm (bh) (id: 27844)
        27844 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(1)
                    ATT_SLASH(1)
                    ATT_CRUSH(6)
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(10)
                    DEF_SLASH(13)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-1)
                    DEF_RANGE(11)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Corrupted statius's platebody (bh) (id: 27845)
        27845 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_STAB(2)
                    ATT_SLASH(2)
                    ATT_CRUSH(14)
                    ATT_MAGIC(-30)
                    ATT_RANGED(-15)
                    DEF_STAB(35)
                    DEF_SLASH(31)
                    DEF_CRUSH(29)
                    DEF_MAGIC(-12)
                    DEF_RANGE(33)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Corrupted statius's platelegs (bh) (id: 27846)
        27846 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_STAB(1)
                    ATT_SLASH(1)
                    ATT_CRUSH(10)
                    ATT_MAGIC(-26)
                    ATT_RANGED(-13)
                    DEF_STAB(25)
                    DEF_SLASH(23)
                    DEF_CRUSH(21)
                    DEF_MAGIC(-10)
                    DEF_RANGE(22)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Corrupted morrigan's coif (bh) (id: 27847)
        27847 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-4)
                    ATT_RANGED(13)
                    DEF_STAB(4)
                    DEF_SLASH(5)
                    DEF_CRUSH(6)
                    DEF_MAGIC(4)
                    DEF_RANGE(6)
                }
            }
        }

        // Corrupted morrigan's leather body (bh) (id: 27848)
        27848 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-13)
                    ATT_RANGED(36)
                    DEF_STAB(14)
                    DEF_SLASH(10)
                    DEF_CRUSH(12)
                    DEF_MAGIC(30)
                    DEF_RANGE(15)
                }
            }
        }

        // Corrupted morrigan's leather chaps (bh) (id: 27849)
        27849 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-8)
                    ATT_RANGED(23)
                    DEF_STAB(9)
                    DEF_SLASH(7)
                    DEF_CRUSH(8)
                    DEF_MAGIC(20)
                    DEF_RANGE(11)
                }
            }
        }

        // Corrupted zuriel's hood (bh) (id: 27850)
        27850 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(12)
                    ATT_RANGED(-1)
                    DEF_STAB(13)
                    DEF_SLASH(11)
                    DEF_CRUSH(14)
                    DEF_MAGIC(5)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Corrupted zuriel's robe top (bh) (id: 27851)
        27851 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(46)
                    ATT_RANGED(-8)
                    DEF_STAB(43)
                    DEF_SLASH(39)
                    DEF_CRUSH(47)
                    DEF_MAGIC(22)
                    MAGIC_DAMAGE(3)
                }
            }
        }

        // Corrupted zuriel's robe bottom (bh) (id: 27852)
        27852 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(32)
                    ATT_RANGED(-6)
                    DEF_STAB(21)
                    DEF_SLASH(20)
                    DEF_CRUSH(23)
                    DEF_MAGIC(14)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Dark bow (bh) (id: 27853)
        27853 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 9
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(105)
                }
            }
        }

        // Barrelchest anchor (bh) (id: 27855)
        27855 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-2)
                    ATT_SLASH(10)
                    ATT_CRUSH(102)
                    Bonuses.Bonus.STRENGTH(110)
                }
            }
        }

        // Dragon mace (bh) (id: 27857)
        27857 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(44)
                    ATT_SLASH(-2)
                    ATT_CRUSH(64)
                    Bonuses.Bonus.STRENGTH(55)
                    PRAYER(5)
                }
            }
        }

        // Dragon longsword (bh) (id: 27859)
        27859 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(62)
                    ATT_SLASH(75)
                    ATT_CRUSH(-2)
                    DEF_SLASH(3)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(71)
                }
            }
        }

        // Abyssal dagger (bh) (id: 27861)
        27861 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(85)
                    ATT_SLASH(40)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(75)
                }
            }
        }

        // Abyssal dagger (bh)(p) (id: 27863)
        27863 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(85)
                    ATT_SLASH(40)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(75)
                }
            }
        }

        // Abyssal dagger (bh)(p+) (id: 27865)
        27865 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(85)
                    ATT_SLASH(40)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(75)
                }
            }
        }

        // Abyssal dagger (bh)(p++) (id: 27867)
        27867 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(85)
                    ATT_SLASH(40)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(75)
                }
            }
        }

        // Voidwaker (id: 27869)
        27869 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(70)
                    ATT_SLASH(80)
                    ATT_CRUSH(-2)
                    ATT_MAGIC(5)
                    DEF_SLASH(1)
                    DEF_MAGIC(2)
                    Bonuses.Bonus.STRENGTH(80)
                }
            }
        }

        // Lightbearer (id: 27870)
        27870 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Giant bronze dagger (id: 27871)
        27871 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
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

        // Vesta's spear (bh) (id: 27900)
        27900 {
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

        // Vesta's longsword (bh) (id: 27904)
        27904 {
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

        // Statius's warhammer (bh) (id: 27908)
        27908 {
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

        // Morrigan's throwing axe (bh) (id: 27912)
        27912 {
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

        // Morrigan's javelin (bh) (id: 27916)
        27916 {
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

        // Zuriel's staff (bh) (id: 27920)
        27920 {
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

        // Dragon dagger (cr) (id: 28019)
        28019 {
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

        // Dragon dagger (p)(cr) (id: 28021)
        28021 {
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

        // Dragon dagger (p+)(cr) (id: 28023)
        28023 {
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

        // Dragon dagger (p++)(cr) (id: 28025)
        28025 {
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

        // Dragon mace (cr) (id: 28027)
        28027 {
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

        // Dragon sword (cr) (id: 28029)
        28029 {
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

        // Dragon scimitar (cr) (id: 28031)
        28031 {
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

        // Dragon longsword (cr) (id: 28033)
        28033 {
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

        // Dragon warhammer (cr) (id: 28035)
        28035 {
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

        // Dragon battleaxe (cr) (id: 28037)
        28037 {
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

        // Dragon claws (cr) (id: 28039)
        28039 {
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

        // Dragon spear (cr) (id: 28041)
        28041 {
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

        // Dragon spear (p)(cr) (id: 28043)
        28043 {
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

        // Dragon spear (p+)(cr) (id: 28045)
        28045 {
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

        // Dragon spear (p++)(cr) (id: 28047)
        28047 {
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

        // Dragon halberd (cr) (id: 28049)
        28049 {
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

        // Dragon 2h sword (cr) (id: 28051)
        28051 {
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

        // Dragon crossbow (cr) (id: 28053)
        28053 {
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

        // Dragon boots (cr) (id: 28055)
        28055 {
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

        // Dragon med helm (cr) (id: 28057)
        28057 {
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

        // Dragon sq shield (cr) (id: 28059)
        28059 {
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

        // Dragon platelegs (cr) (id: 28061)
        28061 {
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

        // Dragon plateskirt (cr) (id: 28063)
        28063 {
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

        // Dragon chainbody (cr) (id: 28065)
        28065 {
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

        // Fighter torso (or) (id: 28067)
        28067 {
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

        // Fighter torso (l)(or) (id: 28069)
        28069 {
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

        // Helm of neitiznot (or) (id: 28070)
        28070 {
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

        // Colourful scarf (id: 28108)
        28108 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Colourful scarf (id: 28109)
        28109 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Colourful scarf (id: 28110)
        28110 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Colourful scarf (id: 28111)
        28111 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Colourful scarf (id: 28112)
        28112 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Colourful scarf (id: 28113)
        28113 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Colourful scarf (id: 28114)
        28114 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Colourful scarf (id: 28115)
        28115 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Rainbow jumper (id: 28116)
        28116 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Colourful jumper (id: 28118)
        28118 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Colourful jumper (id: 28119)
        28119 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Colourful jumper (id: 28120)
        28120 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Colourful jumper (id: 28121)
        28121 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Colourful jumper (id: 28122)
        28122 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Colourful jumper (id: 28123)
        28123 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Colourful jumper (id: 28124)
        28124 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Colourful jumper (id: 28125)
        28125 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Poet's jacket (id: 28126)
        28126 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Love crossbow (id: 28128)
        28128 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 3
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-50)
                    Bonuses.Bonus.STRENGTH(-20)
                }
            }
        }

        // Forestry kit (id: 28136)
        28136 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Log basket (id: 28140)
        28140 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Open log basket (id: 28142)
        28142 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Forestry basket (id: 28143)
        28143 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Open forestry basket (id: 28145)
        28145 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Forestry top (id: 28169)
        28169 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Forestry legs (id: 28171)
        28171 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Forestry boots (id: 28175)
        28175 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Bronze felling axe (id: 28196)
        28196 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-3)
                    ATT_SLASH(6)
                    ATT_CRUSH(3)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(8)
                }
            }
        }

        // Iron felling axe (id: 28199)
        28199 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-3)
                    ATT_SLASH(8)
                    ATT_CRUSH(4)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(11)
                }
            }
        }

        // Steel felling axe (id: 28202)
        28202 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-3)
                    ATT_SLASH(12)
                    ATT_CRUSH(9)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(14)
                }
            }
        }

        // Black felling axe (id: 28205)
        28205 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-3)
                    ATT_SLASH(16)
                    ATT_CRUSH(12)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(19)
                }
            }
        }

        // Mithril felling axe (id: 28208)
        28208 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-3)
                    ATT_SLASH(19)
                    ATT_CRUSH(16)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(20)
                }
            }
        }

        // Adamant felling axe (id: 28211)
        28211 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-3)
                    ATT_SLASH(27)
                    ATT_CRUSH(24)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(30)
                }
            }
        }

        // Rune felling axe (id: 28214)
        28214 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-3)
                    ATT_SLASH(41)
                    ATT_CRUSH(38)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(46)
                }
            }
        }

        // Dragon felling axe (id: 28217)
        28217 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-3)
                    ATT_SLASH(60)
                    ATT_CRUSH(51)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(67)
                }
            }
        }

        // Crystal felling axe (id: 28220)
        28220 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-3)
                    ATT_SLASH(60)
                    ATT_CRUSH(51)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(67)
                }
            }
        }

        // Crystal felling axe (inactive) (id: 28223)
        28223 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-3)
                    ATT_SLASH(60)
                    ATT_CRUSH(51)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(67)
                }
            }
        }

        // 3rd age felling axe (id: 28226)
        28226 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                }
                bonuses {
                    ATT_STAB(-3)
                    ATT_SLASH(60)
                    ATT_CRUSH(51)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(67)
                }
            }
        }

        // Sanguine torva full helm (id: 28254)
        28254 {
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

        // Sanguine torva platebody (id: 28256)
        28256 {
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

        // Sanguine torva platelegs (id: 28258)
        28258 {
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

        // Blood ancient sceptre (id: 28260)
        28260 {
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

        // Ice ancient sceptre (id: 28262)
        28262 {
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

        // Smoke ancient sceptre (id: 28264)
        28264 {
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

        // Shadow ancient sceptre (id: 28266)
        28266 {
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

        // Ultor ring (id: 28307)
        28307 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    Bonuses.Bonus.STRENGTH(12)
                }
            }
        }

        // Venator ring (id: 28310)
        28310 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_RANGED(10)
                }
            }
        }

        // Magus ring (id: 28313)
        28313 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_MAGIC(15)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Bellator ring (id: 28316)
        28316 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_SLASH(20)
                    Bonuses.Bonus.STRENGTH(6)
                }
            }
        }

        // Ring of shadows (id: 28327)
        28327 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(5)
                    ATT_RANGED(4)
                    DEF_MAGIC(5)
                    Bonuses.Bonus.STRENGTH(2)
                    PRAYER(2)
                }
            }
        }

        // Ring of shadows (uncharged) (id: 28329)
        28329 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(5)
                    ATT_RANGED(4)
                    DEF_MAGIC(5)
                    Bonuses.Bonus.STRENGTH(2)
                    PRAYER(2)
                }
            }
        }

        // Soulreaper axe (id: 28338)
        28338 {
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

        // Magic lantern (id: 28426)
        28426 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Blood ancient sceptre (l) (id: 28473)
        28473 {
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

        // Ice ancient sceptre (l) (id: 28474)
        28474 {
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

        // Smoke ancient sceptre (l) (id: 28475)
        28475 {
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

        // Shadow ancient sceptre (l) (id: 28476)
        28476 {
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

        // Corrupted voidwaker (id: 28531)
        28531 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(70)
                    ATT_SLASH(80)
                    ATT_CRUSH(-2)
                    ATT_MAGIC(5)
                    DEF_SLASH(1)
                    DEF_MAGIC(2)
                    Bonuses.Bonus.STRENGTH(68)
                }
            }
        }

        // Corrupted dragon claws (id: 28534)
        28534 {
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
                    Bonuses.Bonus.STRENGTH(48)
                }
            }
        }

        // Corrupted armadyl godsword (id: 28537)
        28537 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                }
                bonuses {
                    ATT_SLASH(132)
                    ATT_CRUSH(80)
                    Bonuses.Bonus.STRENGTH(112)
                    PRAYER(7)
                }
            }
        }

        // Corrupted twisted bow (id: 28540)
        28540 {
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

        // Corrupted scythe of vitur (id: 28543)
        28543 {
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
                    Bonuses.Bonus.STRENGTH(64)
                }
            }
        }

        // Corrupted scythe of vitur (uncharged) (id: 28545)
        28545 {
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
                    Bonuses.Bonus.STRENGTH(43)
                }
            }
        }

        // Corrupted tumeken's shadow (id: 28547)
        28547 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 8
                    longAttackDistance = 10
                }
                bonuses {
                    ATT_MAGIC(35)
                    DEF_MAGIC(20)
                    PRAYER(1)
                }
            }
        }

        // Corrupted tumeken's shadow (uncharged) (id: 28549)
        28549 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 8
                    longAttackDistance = 10
                }
                bonuses {
                    ATT_MAGIC(35)
                    DEF_MAGIC(20)
                    PRAYER(1)
                }
            }
        }

        // Starter bow (id: 28555)
        28555 {
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

        // Starter staff (id: 28557)
        28557 {
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

        // Starter sword (id: 28559)
        28559 {
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

        // Crystal chime (id: 28577)
        28577 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Warped sceptre (uncharged) (id: 28583)
        28583 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_MAGIC(12)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(12)
                }
            }
        }

        // Warped sceptre (id: 28585)
        28585 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_MAGIC(12)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(12)
                }
            }
        }

        // Cobweb cape (id: 28601)
        28601 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Pheasant cape (id: 28616)
        28616 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Pheasant boots (id: 28618)
        28618 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Pheasant legs (id: 28622)
        28622 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Twitcher's gloves (id: 28630)
        28630 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                }
            }
        }

        // Petal garland (id: 28655)
        28655 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Web cloak (id: 28671)
        28671 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Fancier boots (id: 28672)
        28672 {
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

        // Dinh's blazing bulwark (id: 28682)
        28682 {
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

        // Blazing blowpipe (empty) (id: 28687)
        28687 {
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

        // Blazing blowpipe (id: 28688)
        28688 {
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

        // Trailblazer reloaded banner (id: 28702)
        28702 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Trailblazer reloaded home teleport scroll (id: 28705)
        28705 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Trailblazer reloaded rejuvenation pool scroll (id: 28708)
        28708 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Trailblazer reloaded top (t1) (id: 28715)
        28715 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Trailblazer reloaded trousers (t1) (id: 28718)
        28718 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Trailblazer reloaded boots (t1) (id: 28721)
        28721 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Trailblazer reloaded top (t2) (id: 28727)
        28727 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Trailblazer reloaded trousers (t2) (id: 28730)
        28730 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Trailblazer reloaded boots (t2) (id: 28733)
        28733 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Trailblazer reloaded top (t3) (id: 28739)
        28739 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Trailblazer reloaded trousers (t3) (id: 28742)
        28742 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Trailblazer reloaded boots (t3) (id: 28745)
        28745 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Trailblazer reloaded torch (id: 28748)
        28748 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Trailblazer reloaded dragon trophy (id: 28751)
        28751 {
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

        // Trailblazer reloaded rune trophy (id: 28753)
        28753 {
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

        // Trailblazer reloaded adamant trophy (id: 28755)
        28755 {
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

        // Trailblazer reloaded mithril trophy (id: 28757)
        28757 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Trailblazer reloaded steel trophy (id: 28759)
        28759 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Trailblazer reloaded iron trophy (id: 28761)
        28761 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Trailblazer reloaded bronze trophy (id: 28763)
        28763 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Globetrotter pendant (id: 28765)
        28765 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Searing boots (id: 28771)
        28771 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Sage's axe (id: 28773)
        28773 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 3
                    normalAttackDistance = 5
                    longAttackDistance = 7
                }
            }
        }

        // Ruinous powers (id: 28775)
        28775 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    PRAYER(-1)
                }
            }
        }

        // Icy jumper (id: 28786)
        28786 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Bone mace (id: 28792)
        28792 {
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
                }
            }
        }

        // Bone shortbow (id: 28794)
        28794 {
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

        // Bone staff (id: 28796)
        28796 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 8
                    longAttackDistance = 10
                }
                bonuses {
                    ATT_MAGIC(14)
                }
            }
        }

        // Shield of arrav (id: 28807)
        28807 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Zombie axe (id: 28810)
        28810 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-3)
                    ATT_SLASH(105)
                    ATT_CRUSH(90)
                    DEF_STAB(-1)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(107)
                }
            }
        }

        // Tecu salamander (id: 28834)
        28834 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 1
                    longAttackDistance = 3
                }
                bonuses {
                    ATT_SLASH(77)
                    ATT_RANGED(87)
                    Bonuses.Bonus.STRENGTH(91)
                }
            }
        }

        // Irit tar (id: 28837)
        28837 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(60)
                }
            }
        }

        // Wood camo top (id: 28839)
        28839 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_STAB(10)
                    DEF_SLASH(15)
                    DEF_CRUSH(19)
                    DEF_RANGE(12)
                }
            }
        }

        // Wood camo legs (id: 28842)
        28842 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_RANGED(-7)
                    DEF_STAB(11)
                    DEF_SLASH(10)
                    DEF_CRUSH(10)
                    DEF_RANGE(10)
                }
            }
        }

        // Jungle camo top (id: 28845)
        28845 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_STAB(10)
                    DEF_SLASH(15)
                    DEF_CRUSH(19)
                    DEF_RANGE(12)
                }
            }
        }

        // Jungle camo legs (id: 28848)
        28848 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_RANGED(-7)
                    DEF_STAB(11)
                    DEF_SLASH(10)
                    DEF_CRUSH(10)
                    DEF_RANGE(10)
                }
            }
        }

        // Desert camo top (id: 28851)
        28851 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_STAB(10)
                    DEF_SLASH(15)
                    DEF_CRUSH(19)
                    DEF_RANGE(12)
                }
            }
        }

        // Desert camo legs (id: 28854)
        28854 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_RANGED(-7)
                    DEF_STAB(11)
                    DEF_SLASH(10)
                    DEF_CRUSH(10)
                    DEF_RANGE(10)
                }
            }
        }

        // Polar camo top (id: 28857)
        28857 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_STAB(10)
                    DEF_SLASH(15)
                    DEF_CRUSH(19)
                    DEF_RANGE(12)
                }
            }
        }

        // Polar camo legs (id: 28860)
        28860 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_RANGED(-7)
                    DEF_STAB(11)
                    DEF_SLASH(10)
                    DEF_CRUSH(10)
                    DEF_RANGE(10)
                }
            }
        }

        // Hunters' sunlight crossbow (id: 28869)
        28869 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 8
                    longAttackDistance = 10
                }
                bonuses {
                    ATT_RANGED(79)
                }
            }
        }

        // Sunlight antler bolts (id: 28872)
        28872 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(55)
                }
            }
        }

        // Moonlight antler bolts (id: 28878)
        28878 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(60)
                }
            }
        }

        // Dizana's max cape (id: 28902)
        28902 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_RANGED(18)
                }
            }
        }

        // Dizana's max cape (l) (id: 28906)
        28906 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_RANGED(18)
                }
            }
        }

        // Tonalztics of ralos (uncharged) (id: 28919)
        28919 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 7
                    normalAttackDistance = 6
                    longAttackDistance = 8
                }
                bonuses {
                    ATT_RANGED(115)
                    PRAYER(2)
                    RANGE_STRENGTH(55)
                }
            }
        }

        // Tonalztics of ralos (id: 28922)
        28922 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 7
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_RANGED(115)
                    PRAYER(2)
                    RANGE_STRENGTH(55)
                }
            }
        }

        // Sunfire fanatic helm (id: 28933)
        28933 {
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
                    PRAYER(6)
                }
            }
        }

        // Sunfire fanatic cuirass (id: 28936)
        28936 {
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
                    PRAYER(10)
                }
            }
        }

        // Sunfire fanatic chausses (id: 28939)
        28939 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-4)
                    ATT_RANGED(-11)
                    DEF_STAB(51)
                    DEF_SLASH(49)
                    DEF_CRUSH(47)
                    DEF_MAGIC(-4)
                    DEF_RANGE(49)
                    PRAYER(8)
                }
            }
        }

        // Echo boots (id: 28945)
        28945 {
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
                    PRAYER(4)
                }
            }
        }

        // Dizana's quiver (uncharged) (id: 28947)
        28947 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_RANGED(18)
                }
            }
        }

        // Dizana's quiver (l) (uncharged) (id: 28949)
        28949 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_RANGED(18)
                }
            }
        }

        // Dizana's quiver (id: 28951)
        28951 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_RANGED(18)
                }
            }
        }

        // Dizana's quiver (l) (id: 28953)
        28953 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_RANGED(18)
                }
            }
        }

        // Blessed dizana's quiver (id: 28955)
        28955 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_RANGED(18)
                }
            }
        }

        // Blessed dizana's quiver (l) (id: 28957)
        28957 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_RANGED(18)
                }
            }
        }

        // Blue moon spear (id: 28988)
        28988 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(70)
                    ATT_SLASH(62)
                    ATT_CRUSH(62)
                    ATT_MAGIC(30)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(15)
                    Bonuses.Bonus.STRENGTH(71)
                    MAGIC_DAMAGE(5)
                }
            }
        }

        // Atlatl dart (id: 28991)
        28991 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
            }
        }

        // Dual macuahuitl (id: 28997)
        28997 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(115)
                    ATT_SLASH(-4)
                    ATT_CRUSH(121)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(81)
                }
            }
        }

        // Eclipse atlatl (id: 29000)
        29000 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 6
                    longAttackDistance = 8
                }
                bonuses {
                    ATT_RANGED(87)
                    Bonuses.Bonus.STRENGTH(40)
                }
            }
        }

        // Eclipse moon chestplate (id: 29004)
        29004 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(31)
                    DEF_STAB(15)
                    DEF_SLASH(18)
                    DEF_CRUSH(57)
                    DEF_MAGIC(55)
                    DEF_RANGE(32)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Eclipse moon tassets (id: 29007)
        29007 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(17)
                    DEF_STAB(9)
                    DEF_SLASH(13)
                    DEF_CRUSH(37)
                    DEF_MAGIC(31)
                    DEF_RANGE(17)
                    Bonuses.Bonus.STRENGTH(1)
                }
            }
        }

        // Eclipse moon helm (id: 29010)
        29010 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(8)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(14)
                    DEF_MAGIC(10)
                    DEF_RANGE(4)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Blue moon chestplate (id: 29013)
        29013 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(30)
                    DEF_CRUSH(51)
                    DEF_MAGIC(28)
                    Bonuses.Bonus.STRENGTH(2)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Blue moon tassets (id: 29016)
        29016 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(22)
                    DEF_CRUSH(23)
                    DEF_MAGIC(32)
                    Bonuses.Bonus.STRENGTH(1)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Blue moon helm (id: 29019)
        29019 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(6)
                    DEF_CRUSH(10)
                    DEF_MAGIC(6)
                    Bonuses.Bonus.STRENGTH(3)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Blood moon chestplate (id: 29022)
        29022 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(-10)
                    DEF_STAB(60)
                    DEF_SLASH(80)
                    DEF_CRUSH(80)
                    DEF_MAGIC(40)
                    DEF_RANGE(79)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Blood moon tassets (id: 29025)
        29025 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-7)
                    DEF_STAB(30)
                    DEF_SLASH(50)
                    DEF_CRUSH(49)
                    DEF_MAGIC(32)
                    DEF_RANGE(46)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Blood moon helm (id: 29028)
        29028 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(20)
                    DEF_SLASH(31)
                    DEF_CRUSH(34)
                    DEF_MAGIC(7)
                    DEF_RANGE(29)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Eclipse moon chestplate (id: 29031)
        29031 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(31)
                    DEF_STAB(15)
                    DEF_SLASH(18)
                    DEF_CRUSH(57)
                    DEF_MAGIC(55)
                    DEF_RANGE(32)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Eclipse moon tassets (id: 29033)
        29033 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(17)
                    DEF_STAB(9)
                    DEF_SLASH(13)
                    DEF_CRUSH(37)
                    DEF_MAGIC(31)
                    DEF_RANGE(17)
                    Bonuses.Bonus.STRENGTH(1)
                }
            }
        }

        // Eclipse moon helm (id: 29035)
        29035 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(8)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(14)
                    DEF_MAGIC(10)
                    DEF_RANGE(4)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Blue moon chestplate (id: 29037)
        29037 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(30)
                    DEF_CRUSH(51)
                    DEF_MAGIC(28)
                    Bonuses.Bonus.STRENGTH(2)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Blue moon tassets (id: 29039)
        29039 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(22)
                    DEF_CRUSH(23)
                    DEF_MAGIC(32)
                    Bonuses.Bonus.STRENGTH(1)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Blue moon helm (id: 29041)
        29041 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(6)
                    DEF_CRUSH(10)
                    DEF_MAGIC(6)
                    Bonuses.Bonus.STRENGTH(3)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Blood moon chestplate (id: 29043)
        29043 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(-10)
                    DEF_STAB(60)
                    DEF_SLASH(80)
                    DEF_CRUSH(80)
                    DEF_MAGIC(40)
                    DEF_RANGE(79)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Blood moon tassets (id: 29045)
        29045 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-7)
                    DEF_STAB(30)
                    DEF_SLASH(50)
                    DEF_CRUSH(49)
                    DEF_MAGIC(32)
                    DEF_RANGE(46)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Blood moon helm (id: 29047)
        29047 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(20)
                    DEF_SLASH(31)
                    DEF_CRUSH(34)
                    DEF_MAGIC(7)
                    DEF_RANGE(29)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Eclipse moon chestplate (broken) (id: 29049)
        29049 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Eclipse moon tassets (broken) (id: 29052)
        29052 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Blue moon chestplate (broken) (id: 29058)
        29058 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Blue moon tassets (broken) (id: 29061)
        29061 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Blood moon chestplate (broken) (id: 29067)
        29067 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Blood moon tassets (broken) (id: 29070)
        29070 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Sulphur blades (id: 29084)
        29084 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(11)
                    ATT_SLASH(72)
                    Bonuses.Bonus.STRENGTH(64)
                }
            }
        }

        // Guild hunter top (id: 29265)
        29265 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Guild hunter legs (id: 29267)
        29267 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Guild hunter boots (id: 29269)
        29269 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Trapper's tipple (id: 29277)
        29277 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Mixed hide top (id: 29280)
        29280 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(-2)
                    ATT_CRUSH(-3)
                    ATT_MAGIC(-15)
                    ATT_RANGED(27)
                    DEF_STAB(33)
                    DEF_SLASH(39)
                    DEF_CRUSH(43)
                    DEF_MAGIC(30)
                    DEF_RANGE(32)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Mixed hide legs (id: 29283)
        29283 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_STAB(3)
                    ATT_SLASH(-1)
                    ATT_CRUSH(-2)
                    ATT_MAGIC(-10)
                    ATT_RANGED(14)
                    DEF_STAB(20)
                    DEF_SLASH(23)
                    DEF_CRUSH(22)
                    DEF_MAGIC(16)
                    DEF_RANGE(20)
                }
            }
        }

        // Mixed hide boots (id: 29286)
        29286 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(5)
                    DEF_STAB(4)
                    DEF_SLASH(5)
                    DEF_CRUSH(6)
                    DEF_MAGIC(3)
                    DEF_RANGE(3)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Mixed hide cape (id: 29289)
        29289 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(5)
                    DEF_STAB(2)
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                    DEF_MAGIC(5)
                    DEF_RANGE(1)
                    Bonuses.Bonus.STRENGTH(1)
                }
            }
        }

        // Hunter's spear (id: 29305)
        29305 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                    normalAttackDistance = 5
                    longAttackDistance = 7
                }
                bonuses {
                    ATT_RANGED(73)
                    Bonuses.Bonus.STRENGTH(48)
                    PRAYER(1)
                }
            }
        }

        // Book of egg (id: 29433)
        29433 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Book of egg (id: 29435)
        29435 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Egg priest robe (id: 29437)
        29437 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Egg priest robe top (id: 29439)
        29439 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Egg priest necklace (id: 29441)
        29441 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Prospector jacket (id: 29474)
        29474 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Prospector legs (id: 29476)
        29476 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Prospector boots (id: 29478)
        29478 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Cursed amulet of magic (id: 29486)
        29486 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    MAGIC_DAMAGE(-80)
                }
            }
        }

        // Rainbow cape (id: 29489)
        29489 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Colourful cape (id: 29491)
        29491 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Colourful cape (id: 29493)
        29493 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Colourful cape (id: 29495)
        29495 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Colourful cape (id: 29497)
        29497 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Colourful cape (id: 29499)
        29499 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Colourful cape (id: 29501)
        29501 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Colourful cape (id: 29503)
        29503 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Colourful cape (id: 29505)
        29505 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Rainbow crown shirt (id: 29507)
        29507 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Colourful crown shirt (id: 29509)
        29509 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Colourful crown shirt (id: 29510)
        29510 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Colourful crown shirt (id: 29511)
        29511 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Colourful crown shirt (id: 29512)
        29512 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Colourful crown shirt (id: 29513)
        29513 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Colourful crown shirt (id: 29514)
        29514 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Colourful crown shirt (id: 29515)
        29515 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Colourful crown shirt (id: 29516)
        29516 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Elite black full helm (id: 29560)
        29560 {
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
                    PRAYER(4)
                }
            }
        }

        // Elite black platebody (id: 29562)
        29562 {
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
                    PRAYER(8)
                }
            }
        }

        // Elite black platelegs (id: 29564)
        29564 {
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
                    PRAYER(6)
                }
            }
        }

        // Dark squall hood (id: 29566)
        29566 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(2)
                    DEF_MAGIC(2)
                }
            }
        }

        // Dark squall robe top (id: 29568)
        29568 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                }
            }
        }

        // Dark squall robe bottom (id: 29570)
        29570 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Burning claws (id: 29577)
        29577 {
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

        // Emberlight (id: 29589)
        29589 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(63)
                    ATT_SLASH(70)
                    DEF_SLASH(3)
                    DEF_CRUSH(2)
                    DEF_MAGIC(5)
                    Bonuses.Bonus.STRENGTH(13)
                }
            }
        }

        // Scorching bow (id: 29591)
        29591 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 10
                    longAttackDistance = 12
                }
                bonuses {
                    ATT_RANGED(124)
                }
            }
        }

        // Purging staff (id: 29594)
        29594 {
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

        // Corrupted dark bow (id: 29599)
        29599 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 7
                    normalAttackDistance = 6
                    longAttackDistance = 8
                }
                bonuses {
                    ATT_RANGED(89)
                }
            }
        }

        // Corrupted volatile nightmare staff (id: 29602)
        29602 {
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

        // Armadyl godsword (deadman) (id: 29605)
        29605 {
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

        // Voidwaker (deadman) (id: 29607)
        29607 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(70)
                    ATT_SLASH(80)
                    ATT_CRUSH(-2)
                    ATT_MAGIC(5)
                    DEF_SLASH(1)
                    DEF_MAGIC(2)
                    Bonuses.Bonus.STRENGTH(80)
                }
            }
        }

        // Volatile nightmare staff (deadman) (id: 29609)
        29609 {
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

        // Dark bow (deadman) (id: 29611)
        29611 {
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

        // Imbued zamorak cape (deadman) (id: 29613)
        29613 {
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

        // Imbued guthix cape (deadman) (id: 29615)
        29615 {
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

        // Imbued saradomin cape (deadman) (id: 29617)
        29617 {
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

        // Armageddon teleport scroll (id: 29622)
        29622 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Dni23 torso lightbuttons (id: 29686)
        29686 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 torso darkbuttons (id: 29688)
        29688 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 torso darkbuttons (id: 29690)
        29690 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 torso shirt (id: 29692)
        29692 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 torso stitching (id: 29694)
        29694 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 torso twotoned (id: 29696)
        29696 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 torso princely (id: 29698)
        29698 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 torso rippedweskit (id: 29700)
        29700 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 torso rippedweskit (id: 29702)
        29702 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 torso croptops (id: 29704)
        29704 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 torso poloneck (id: 29706)
        29706 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 torso simple (id: 29708)
        29708 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 torso frilly (id: 29710)
        29710 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 torso corsetry (id: 29712)
        29712 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 torso bodice (id: 29714)
        29714 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 arms thin (id: 29716)
        29716 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 arms shoulderpads (id: 29718)
        29718 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 arms thickstripe (id: 29720)
        29720 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 arms loosesleeves (id: 29722)
        29722 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 arms princely (id: 29724)
        29724 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 arms tattylong (id: 29726)
        29726 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 arms ripped (id: 29728)
        29728 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 arms bare (id: 29730)
        29730 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 arms frilly (id: 29732)
        29732 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 arms tattyshort (id: 29734)
        29734 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 arms bareshoulders (id: 29736)
        29736 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dni23 legs shorts (id: 29738)
        29738 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dni23 legs beach (id: 29740)
        29740 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dni23 legs princely (id: 29742)
        29742 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dni23 legs leggings (id: 29744)
        29744 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dni23 legs sidestripes (id: 29746)
        29746 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dni23 legs ripped (id: 29748)
        29748 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dni23 legs patched (id: 29750)
        29750 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dni23 legs skirt (id: 29752)
        29752 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dni23 legs longskirt (id: 29754)
        29754 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dni23 legs longnarrowskirt (id: 29756)
        29756 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dni23 legs shortskirt (id: 29758)
        29758 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dni23 legs layered (id: 29760)
        29760 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dni23 legs sashdots (id: 29762)
        29762 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dni23 legs bighem (id: 29764)
        29764 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dni23 legs sashtrousers (id: 29766)
        29766 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dni23 legs patterned (id: 29768)
        29768 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dni23 legs tornskirt (id: 29770)
        29770 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dni23 legs patchedskirt (id: 29772)
        29772 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Amy's saw (off-hand) (id: 29774)
        29774 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Imcando hammer (off-hand) (id: 29775)
        29775 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Bruma torch (off-hand) (id: 29777)
        29777 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Noxious halberd (id: 29796)
        29796 {
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

        // Amulet of rancour (id: 29801)
        29801 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(25)
                    ATT_SLASH(25)
                    ATT_CRUSH(25)
                    ATT_MAGIC(-6)
                    ATT_RANGED(-8)
                    Bonuses.Bonus.STRENGTH(12)
                    PRAYER(2)
                }
            }
        }

        // Amulet of rancour (s) (id: 29804)
        29804 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(25)
                    ATT_SLASH(25)
                    ATT_CRUSH(25)
                    ATT_MAGIC(-6)
                    ATT_RANGED(-8)
                    Bonuses.Bonus.STRENGTH(12)
                    PRAYER(2)
                }
            }
        }

        // Aranea boots (id: 29806)
        29806 {
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

        // Araxyte slayer helmet (id: 29816)
        29816 {
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

        // Araxyte slayer helmet (i) (id: 29818)
        29818 {
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

        // Araxyte slayer helmet (i) (id: 29820)
        29820 {
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

        // Araxyte slayer helmet (i) (id: 29822)
        29822 {
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

        // Eclipse moon chestplate (id: 29840)
        29840 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(31)
                    DEF_STAB(15)
                    DEF_SLASH(18)
                    DEF_CRUSH(57)
                    DEF_MAGIC(55)
                    DEF_RANGE(32)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Eclipse moon tassets (id: 29841)
        29841 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(17)
                    DEF_STAB(9)
                    DEF_SLASH(13)
                    DEF_CRUSH(37)
                    DEF_MAGIC(31)
                    DEF_RANGE(17)
                    Bonuses.Bonus.STRENGTH(1)
                }
            }
        }

        // Eclipse moon helm (id: 29842)
        29842 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(8)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(14)
                    DEF_MAGIC(10)
                    DEF_RANGE(4)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Blue moon chestplate (id: 29843)
        29843 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(30)
                    DEF_CRUSH(51)
                    DEF_MAGIC(28)
                    Bonuses.Bonus.STRENGTH(2)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Blue moon tassets (id: 29844)
        29844 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(22)
                    DEF_CRUSH(23)
                    DEF_MAGIC(32)
                    Bonuses.Bonus.STRENGTH(1)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Blue moon helm (id: 29845)
        29845 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(6)
                    DEF_CRUSH(10)
                    DEF_MAGIC(6)
                    Bonuses.Bonus.STRENGTH(3)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Blood moon chestplate (id: 29846)
        29846 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(-10)
                    DEF_STAB(60)
                    DEF_SLASH(80)
                    DEF_CRUSH(80)
                    DEF_MAGIC(40)
                    DEF_RANGE(79)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Blood moon tassets (id: 29847)
        29847 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-7)
                    DEF_STAB(30)
                    DEF_SLASH(50)
                    DEF_CRUSH(49)
                    DEF_MAGIC(32)
                    DEF_RANGE(46)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Blood moon helm (id: 29848)
        29848 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(20)
                    DEF_SLASH(31)
                    DEF_CRUSH(34)
                    DEF_MAGIC(7)
                    DEF_RANGE(29)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Blue moon spear (id: 29849)
        29849 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(70)
                    ATT_SLASH(62)
                    ATT_CRUSH(62)
                    ATT_MAGIC(30)
                    DEF_STAB(2)
                    DEF_SLASH(3)
                    DEF_CRUSH(1)
                    DEF_MAGIC(15)
                    Bonuses.Bonus.STRENGTH(71)
                    MAGIC_DAMAGE(5)
                }
            }
        }

        // Dual macuahuitl (id: 29850)
        29850 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(115)
                    ATT_SLASH(-4)
                    ATT_CRUSH(121)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(81)
                }
            }
        }

        // Eclipse atlatl (id: 29851)
        29851 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 6
                    longAttackDistance = 8
                }
                bonuses {
                    ATT_RANGED(87)
                    Bonuses.Bonus.STRENGTH(40)
                }
            }
        }

        // Atlatl dart (id: 29852)
        29852 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
            }
        }

        // Emissary robe top (id: 29870)
        29870 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Emissary robe bottom (id: 29872)
        29872 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Emissary sandals (id: 29874)
        29874 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Glacial temotli (id: 29889)
        29889 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(11)
                    ATT_CRUSH(72)
                    Bonuses.Bonus.STRENGTH(64)
                    PRAYER(2)
                }
            }
        }

        // Pendant of ates (inert) (id: 29892)
        29892 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_MAGIC(2)
                }
            }
        }

        // Pendant of ates (id: 29893)
        29893 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    DEF_MAGIC(3)
                    PRAYER(2)
                }
            }
        }

        // Prop sword (id: 29911)
        29911 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Butler's tray (id: 29912)
        29912 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Butler's tray (id: 29913)
        29913 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Butler's uniform (id: 29914)
        29914 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Butler's uniform (id: 29915)
        29915 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Butler's uniform (id: 29916)
        29916 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Butler's uniform (id: 29918)
        29918 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Alchemist labcoat (id: 29978)
        29978 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Alchemist labcoat (id: 29980)
        29980 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Alchemist pants (id: 29982)
        29982 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Alchemist pants (id: 29984)
        29984 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Alchemist gloves (id: 29986)
        29986 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Alchemist's amulet (id: 29988)
        29988 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Alchemist's amulet (id: 29990)
        29990 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Alchemist's amulet (id: 29992)
        29992 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Graceful cape (id: 30048)
        30048 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful cape (id: 30050)
        30050 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Graceful top (id: 30051)
        30051 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful top (id: 30053)
        30053 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Graceful legs (id: 30054)
        30054 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful legs (id: 30056)
        30056 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Graceful gloves (id: 30057)
        30057 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful gloves (id: 30059)
        30059 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Graceful boots (id: 30060)
        30060 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Graceful boots (id: 30062)
        30062 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Tome of earth (id: 30064)
        30064 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(8)
                    DEF_MAGIC(8)
                }
            }
        }

        // Tome of earth (empty) (id: 30066)
        30066 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(8)
                    DEF_MAGIC(8)
                }
            }
        }

        // Dragon hunter wand (id: 30070)
        30070 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    ATT_MAGIC(16)
                    DEF_MAGIC(16)
                    MAGIC_DAMAGE(10)
                }
            }
        }

        // Hueycoatl hide coif (id: 30073)
        30073 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-1)
                    ATT_RANGED(7)
                    DEF_STAB(4)
                    DEF_SLASH(7)
                    DEF_CRUSH(10)
                    DEF_MAGIC(5)
                    DEF_RANGE(8)
                    PRAYER(2)
                }
            }
        }

        // Hueycoatl hide body (id: 30076)
        30076 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    ATT_RANGED(30)
                    DEF_STAB(55)
                    DEF_SLASH(47)
                    DEF_CRUSH(60)
                    DEF_MAGIC(56)
                    DEF_RANGE(55)
                    PRAYER(3)
                }
            }
        }

        // Hueycoatl hide chaps (id: 30079)
        30079 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(17)
                    DEF_STAB(31)
                    DEF_SLASH(25)
                    DEF_CRUSH(33)
                    DEF_MAGIC(30)
                    DEF_RANGE(31)
                    PRAYER(2)
                }
            }
        }

        // Hueycoatl hide vambraces (id: 30082)
        30082 {
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

        // Helmet of the moon (id: 30111)
        30111 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_STAB(6)
                    DEF_SLASH(7)
                    DEF_CRUSH(5)
                    DEF_MAGIC(3)
                    DEF_RANGE(6)
                    PRAYER(3)
                }
            }
        }

        // Butler's tray (id: 30156)
        30156 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Butler's tray (id: 30157)
        30157 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Null (id: 30162)
        30162 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Null (id: 30163)
        30163 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Null (id: 30164)
        30164 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Null (id: 30165)
        30165 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Null (id: 30166)
        30166 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Null (id: 30167)
        30167 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Null (id: 30168)
        30168 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Scarecrow shirt (id: 30232)
        30232 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Torva platebody (id: 30303)
        30303 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Torva platelegs (id: 30304)
        30304 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Arclight (inactive) (id: 30305)
        30305 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(16)
                    ATT_CRUSH(-2)
                    DEF_SLASH(3)
                    DEF_CRUSH(2)
                    DEF_MAGIC(2)
                    Bonuses.Bonus.STRENGTH(13)
                }
            }
        }

        // Arrav's axe (id: 30320)
        30320 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-3)
                    ATT_SLASH(105)
                    ATT_CRUSH(90)
                    DEF_STAB(-1)
                    DEF_RANGE(-1)
                    Bonuses.Bonus.STRENGTH(107)
                }
            }
        }

        // Zombie helmet (id: 30321)
        30321 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_CRUSH(8)
                    ATT_MAGIC(-4)
                    ATT_RANGED(-2)
                    DEF_STAB(30)
                    DEF_SLASH(32)
                    DEF_CRUSH(38)
                    DEF_RANGE(30)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Crystal dagger (perfected) (id: 30340)
        30340 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(20)
                    ATT_SLASH(120)
                    ATT_CRUSH(-4)
                    ATT_MAGIC(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(40)
                    PRAYER(3)
                }
            }
        }

        // Infernal harpoon (or) (id: 30342)
        30342 {
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

        // Infernal harpoon (uncharged) (id: 30343)
        30343 {
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

        // Infernal pickaxe (or) (id: 30345)
        30345 {
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

        // Infernal pickaxe (uncharged) (id: 30346)
        30346 {
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

        // Infernal axe (or) (id: 30347)
        30347 {
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

        // Infernal axe (uncharged) (id: 30348)
        30348 {
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

        // Dragon harpoon (or) (id: 30349)
        30349 {
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

        // Dragon pickaxe (or) (id: 30351)
        30351 {
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

        // Dragon axe (or) (id: 30352)
        30352 {
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

        // Forager's pouch (id: 30357)
        30357 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Banker's briefcase (id: 30361)
        30361 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Clue compass (id: 30363)
        30363 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
            }
        }

        // The dogsword (id: 30367)
        30367 {
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

        // Sunlight spear (id: 30369)
        30369 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(125)
                    ATT_SLASH(75)
                    DEF_STAB(70)
                    DEF_SLASH(70)
                    DEF_CRUSH(70)
                    DEF_MAGIC(28)
                    DEF_RANGE(70)
                    Bonuses.Bonus.STRENGTH(113)
                }
            }
        }

        // Devil's element (id: 30371)
        30371 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(20)
                    PRAYER(3)
                    MAGIC_DAMAGE(6)
                }
            }
        }

        // Drygore blowpipe (empty) (id: 30373)
        30373 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 3
                    normalAttackDistance = 6
                    longAttackDistance = 8
                }
                bonuses {
                    ATT_RANGED(50)
                    RANGE_STRENGTH(10)
                }
            }
        }

        // Drygore blowpipe (id: 30374)
        30374 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 3
                    normalAttackDistance = 6
                    longAttackDistance = 8
                }
                bonuses {
                    ATT_RANGED(50)
                    RANGE_STRENGTH(10)
                }
            }
        }

        // Amulet of the monarchs (id: 30376)
        30376 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
                bonuses {
                    ATT_STAB(30)
                    ATT_SLASH(30)
                    ATT_CRUSH(30)
                    ATT_MAGIC(30)
                    ATT_RANGED(30)
                    DEF_STAB(30)
                    DEF_SLASH(30)
                    DEF_CRUSH(30)
                    DEF_MAGIC(30)
                    DEF_RANGE(30)
                    Bonuses.Bonus.STRENGTH(15)
                    PRAYER(10)
                    MAGIC_DAMAGE(10)
                }
            }
        }

        // Emperor ring (id: 30378)
        30378 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_STAB(30)
                    ATT_SLASH(30)
                    ATT_CRUSH(30)
                    ATT_MAGIC(30)
                    ATT_RANGED(30)
                    DEF_STAB(30)
                    DEF_SLASH(30)
                    DEF_CRUSH(30)
                    DEF_MAGIC(30)
                    DEF_RANGE(30)
                    Bonuses.Bonus.STRENGTH(15)
                    PRAYER(10)
                    MAGIC_DAMAGE(5)
                }
            }
        }

        // Gloves of the damned (id: 30380)
        30380 {
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

        // Thousand-dragon ward (id: 30382)
        30382 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_STAB(35)
                    ATT_SLASH(35)
                    ATT_CRUSH(35)
                    ATT_MAGIC(15)
                    ATT_RANGED(25)
                    DEF_STAB(50)
                    DEF_SLASH(55)
                    DEF_CRUSH(53)
                    DEF_MAGIC(40)
                    DEF_RANGE(52)
                    Bonuses.Bonus.STRENGTH(12)
                    PRAYER(6)
                }
            }
        }

        // Crystal blessing (id: 30384)
        30384 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    PRAYER(5)
                }
            }
        }

        // Sunlit bracers (id: 30386)
        30386 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(10)
                    ATT_SLASH(10)
                    ATT_CRUSH(10)
                    ATT_MAGIC(6)
                    ATT_RANGED(18)
                    DEF_STAB(12)
                    DEF_SLASH(12)
                    DEF_CRUSH(12)
                    DEF_MAGIC(6)
                    DEF_RANGE(12)
                    Bonuses.Bonus.STRENGTH(8)
                }
            }
        }

        // Thunder khopesh (id: 30388)
        30388 {
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

        // Nature's reprisal (id: 30390)
        30390 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_STAB(95)
                    ATT_MAGIC(45)
                    ATT_RANGED(155)
                    Bonuses.Bonus.STRENGTH(103)
                    MAGIC_DAMAGE(12)
                }
            }
        }

        // Nature's reprisal (uncharged) (id: 30392)
        30392 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
            }
        }

        // Raging echoes top (t1) (id: 30406)
        30406 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Raging echoes robeskirt (t1) (id: 30408)
        30408 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Raging echoes boots (t1) (id: 30410)
        30410 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Raging echoes top (t2) (id: 30414)
        30414 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Raging echoes robeskirt (t2) (id: 30416)
        30416 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Raging echoes boots (t2) (id: 30418)
        30418 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Raging echoes top (t3) (id: 30422)
        30422 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Raging echoes robeskirt (t3) (id: 30424)
        30424 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Raging echoes boots (t3) (id: 30426)
        30426 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Raging echoes cane (id: 30428)
        30428 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Raging echoes banner (id: 30430)
        30430 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Echo venator bow (id: 30434)
        30434 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 6
                    longAttackDistance = 8
                }
                bonuses {
                    ATT_RANGED(90)
                }
            }
        }

        // Echo venator bow (uncharged) (id: 30436)
        30436 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 6
                    longAttackDistance = 8
                }
                bonuses {
                    ATT_RANGED(90)
                }
            }
        }

        // Echo virtus mask (id: 30437)
        30437 {
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

        // Echo virtus robe top (id: 30439)
        30439 {
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

        // Echo virtus robe bottom (id: 30441)
        30441 {
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

        // Echo ahrim's hood (id: 30445)
        30445 {
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

        // Echo ahrim's robetop (id: 30447)
        30447 {
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

        // Echo ahrim's robeskirt (id: 30449)
        30449 {
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

        // Echo home teleport scroll (id: 30453)
        30453 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Raging echoes dragon trophy (id: 30465)
        30465 {
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

    }
}
