package com.near_reality.plugins.item.definitions

import com.near_reality.scripts.item.definitions.ItemDefinitionsScript
import com.zenyte.game.world.entity.player.Bonuses
import com.zenyte.game.world.entity.player.Bonuses.Bonus.*
import com.zenyte.game.world.entity.player.container.impl.equipment.EquipmentSlot

class Rev239Items2 : ItemDefinitionsScript() {
    init {
        // Slayer's staff (id: 4170)
        4170 {
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

        // Mouth grip (id: 4181)
        4181 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Extended brush (id: 4193)
        4193 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Ring of charos (id: 4202)
        4202 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // New crystal bow (id: 4212)
        4212 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // New crystal bow (id: 4213)
        4213 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal bow full (id: 4214)
        4214 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal bow 9/10 (id: 4215)
        4215 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal bow 8/10 (id: 4216)
        4216 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal bow 7/10 (id: 4217)
        4217 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal bow 6/10 (id: 4218)
        4218 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal bow 5/10 (id: 4219)
        4219 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal bow 4/10 (id: 4220)
        4220 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal bow 3/10 (id: 4221)
        4221 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal bow 2/10 (id: 4222)
        4222 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Crystal bow 1/10 (id: 4223)
        4223 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // New crystal shield (id: 4224)
        4224 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Crystal shield full (id: 4225)
        4225 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Crystal shield 9/10 (id: 4226)
        4226 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Crystal shield 8/10 (id: 4227)
        4227 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Crystal shield 7/10 (id: 4228)
        4228 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Crystal shield 6/10 (id: 4229)
        4229 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Crystal shield 5/10 (id: 4230)
        4230 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Crystal shield 4/10 (id: 4231)
        4231 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Crystal shield 3/10 (id: 4232)
        4232 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Crystal shield 2/10 (id: 4233)
        4233 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Crystal shield 1/10 (id: 4234)
        4234 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // New crystal shield (id: 4235)
        4235 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Signed oak bow (id: 4236)
        4236 {
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

        // Ghostspeak amulet (id: 4250)
        4250 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Ham shirt (id: 4298)
        4298 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Ham robe (id: 4300)
        4300 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                }
            }
        }

        // Ham hood (id: 4302)
        4302 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                    DEF_RANGE(1)
                }
            }
        }

        // Ham cloak (id: 4304)
        4304 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Ham logo (id: 4306)
        4306 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Ham gloves (id: 4308)
        4308 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                }
            }
        }

        // Ham boots (id: 4310)
        4310 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Team-1 cape (id: 4315)
        4315 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-2 cape (id: 4317)
        4317 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-3 cape (id: 4319)
        4319 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-4 cape (id: 4321)
        4321 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-5 cape (id: 4323)
        4323 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-6 cape (id: 4325)
        4325 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-7 cape (id: 4327)
        4327 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-8 cape (id: 4329)
        4329 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-9 cape (id: 4331)
        4331 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-10 cape (id: 4333)
        4333 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-11 cape (id: 4335)
        4335 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-12 cape (id: 4337)
        4337 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-13 cape (id: 4339)
        4339 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-14 cape (id: 4341)
        4341 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-15 cape (id: 4343)
        4343 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-16 cape (id: 4345)
        4345 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-17 cape (id: 4347)
        4347 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-18 cape (id: 4349)
        4349 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-19 cape (id: 4351)
        4351 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-20 cape (id: 4353)
        4353 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-21 cape (id: 4355)
        4355 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-22 cape (id: 4357)
        4357 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-23 cape (id: 4359)
        4359 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-24 cape (id: 4361)
        4361 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-25 cape (id: 4363)
        4363 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-26 cape (id: 4365)
        4365 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-27 cape (id: 4367)
        4367 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-28 cape (id: 4369)
        4369 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-29 cape (id: 4371)
        4371 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-30 cape (id: 4373)
        4373 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-31 cape (id: 4375)
        4375 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-32 cape (id: 4377)
        4377 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-33 cape (id: 4379)
        4379 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-34 cape (id: 4381)
        4381 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-35 cape (id: 4383)
        4383 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-36 cape (id: 4385)
        4385 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-37 cape (id: 4387)
        4387 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-38 cape (id: 4389)
        4389 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-39 cape (id: 4391)
        4391 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-40 cape (id: 4393)
        4393 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-41 cape (id: 4395)
        4395 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-42 cape (id: 4397)
        4397 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-43 cape (id: 4399)
        4399 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-44 cape (id: 4401)
        4401 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-45 cape (id: 4403)
        4403 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-46 cape (id: 4405)
        4405 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-47 cape (id: 4407)
        4407 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-48 cape (id: 4409)
        4409 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-49 cape (id: 4411)
        4411 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Team-50 cape (id: 4413)
        4413 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Rope (id: 4498)
        4498 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Pole (id: 4500)
        4500 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Null (id: 4501)
        4501 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Bearhead (id: 4502)
        4502 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-3)
                    DEF_STAB(12)
                    DEF_SLASH(14)
                    DEF_CRUSH(10)
                    DEF_MAGIC(7)
                    DEF_RANGE(9)
                }
            }
        }

        // Decorative sword (id: 4503)
        4503 {
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

        // Decorative armour (id: 4504)
        4504 {
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

        // Decorative armour (id: 4505)
        4505 {
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

        // Decorative helm (id: 4506)
        4506 {
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

        // Decorative shield (id: 4507)
        4507 {
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

        // Decorative sword (id: 4508)
        4508 {
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

        // Decorative armour (id: 4509)
        4509 {
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

        // Decorative armour (id: 4510)
        4510 {
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

        // Decorative helm (id: 4511)
        4511 {
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

        // Decorative shield (id: 4512)
        4512 {
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

        // Castlewars hood (id: 4513)
        4513 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                    DEF_RANGE(1)
                }
            }
        }

        // Castlewars cloak (id: 4514)
        4514 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Castlewars hood (id: 4515)
        4515 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                    DEF_RANGE(1)
                }
            }
        }

        // Castlewars cloak (id: 4516)
        4516 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Spiny helmet (id: 4551)
        4551 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-6)
                    ATT_RANGED(-2)
                    DEF_STAB(9)
                    DEF_SLASH(10)
                    DEF_CRUSH(7)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                }
            }
        }

        // Easter basket (id: 4565)
        4565 {
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

        // Rubber chicken (id: 4566)
        4566 {
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

        // Gold helmet (id: 4567)
        4567 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_SLASH(10)
                    DEF_CRUSH(20)
                    DEF_RANGE(10)
                }
            }
        }

        // Black spear (id: 4580)
        4580 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
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

        // Black spear(p) (id: 4582)
        4582 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
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

        // Black spear(kp) (id: 4584)
        4584 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
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

        // Dragon plateskirt (id: 4585)
        4585 {
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

        // Dragon scimitar (id: 4587)
        4587 {
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

        // Oak blackjack (id: 4599)
        4599 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Willow blackjack (id: 4600)
        4600 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    Bonuses.Bonus.STRENGTH(8)
                }
            }
        }

        // Snake charm (id: 4605)
        4605 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Ring of visibility (id: 4657)
        4657 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Ancient staff (id: 4675)
        4675 {
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

        // Catspeak amulet (id: 4677)
        4677 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Stone bowl (id: 4704)
        4704 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Ahrim's hood (id: 4708)
        4708 {
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

        // Ahrim's staff (id: 4710)
        4710 {
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

        // Ahrim's robetop (id: 4712)
        4712 {
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

        // Ahrim's robeskirt (id: 4714)
        4714 {
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

        // Dharok's helm (id: 4716)
        4716 {
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

        // Dharok's greataxe (id: 4718)
        4718 {
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

        // Dharok's platebody (id: 4720)
        4720 {
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

        // Dharok's platelegs (id: 4722)
        4722 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(85)
                    DEF_SLASH(82)
                    DEF_CRUSH(83)
                    DEF_MAGIC(-4)
                    DEF_RANGE(92)
                }
            }
        }

        // Guthan's helm (id: 4724)
        4724 {
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

        // Guthan's warspear (id: 4726)
        4726 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(75)
                    ATT_SLASH(75)
                    ATT_CRUSH(75)
                    DEF_STAB(7)
                    DEF_SLASH(7)
                    DEF_CRUSH(7)
                    Bonuses.Bonus.STRENGTH(75)
                }
            }
        }

        // Guthan's platebody (id: 4728)
        4728 {
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

        // Guthan's chainskirt (id: 4730)
        4730 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-14)
                    ATT_RANGED(-11)
                    DEF_STAB(75)
                    DEF_SLASH(72)
                    DEF_CRUSH(73)
                    DEF_MAGIC(-4)
                    DEF_RANGE(82)
                }
            }
        }

        // Karil's coif (id: 4732)
        4732 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-1)
                    ATT_RANGED(7)
                    DEF_STAB(6)
                    DEF_SLASH(9)
                    DEF_CRUSH(12)
                    DEF_MAGIC(6)
                    DEF_RANGE(10)
                }
            }
        }

        // Karil's crossbow (id: 4734)
        4734 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 8
                    longAttackDistance = 10
                }
                bonuses {
                    ATT_RANGED(84)
                }
            }
        }

        // Karil's leathertop (id: 4736)
        4736 {
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

        // Karil's leatherskirt (id: 4738)
        4738 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(17)
                    DEF_STAB(26)
                    DEF_SLASH(20)
                    DEF_CRUSH(28)
                    DEF_MAGIC(35)
                    DEF_RANGE(33)
                }
            }
        }

        // Bolt rack (id: 4740)
        4740 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(55)
                }
            }
        }

        // Torag's helm (id: 4745)
        4745 {
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

        // Torag's hammers (id: 4747)
        4747 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(85)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(72)
                }
            }
        }

        // Torag's platebody (id: 4749)
        4749 {
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

        // Torag's platelegs (id: 4751)
        4751 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(85)
                    DEF_SLASH(82)
                    DEF_CRUSH(83)
                    DEF_MAGIC(-4)
                    DEF_RANGE(92)
                }
            }
        }

        // Verac's helm (id: 4753)
        4753 {
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

        // Verac's flail (id: 4755)
        4755 {
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

        // Verac's brassard (id: 4757)
        4757 {
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

        // Verac's plateskirt (id: 4759)
        4759 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(85)
                    DEF_SLASH(82)
                    DEF_CRUSH(83)
                    DEF_RANGE(84)
                    PRAYER(4)
                }
            }
        }

        // Bronze brutal (id: 4773)
        4773 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(11)
                }
            }
        }

        // Iron brutal (id: 4778)
        4778 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(13)
                }
            }
        }

        // Steel brutal (id: 4783)
        4783 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(19)
                }
            }
        }

        // Black brutal (id: 4788)
        4788 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(22)
                }
            }
        }

        // Mithril brutal (id: 4793)
        4793 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(34)
                }
            }
        }

        // Adamant brutal (id: 4798)
        4798 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(45)
                }
            }
        }

        // Rune brutal (id: 4803)
        4803 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(60)
                }
            }
        }

        // Book of portraiture (id: 4817)
        4817 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Comp ogre bow (id: 4827)
        4827 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 5
                    longAttackDistance = 7
                }
                bonuses {
                    ATT_RANGED(38)
                }
            }
        }

        // Book of 'h.a.m' (id: 4829)
        4829 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Necromancy book (id: 4837)
        4837 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Ahrim's hood 100 (id: 4856)
        4856 {
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

        // Ahrim's hood 75 (id: 4857)
        4857 {
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

        // Ahrim's hood 50 (id: 4858)
        4858 {
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

        // Ahrim's hood 25 (id: 4859)
        4859 {
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

        // Ahrim's staff 100 (id: 4862)
        4862 {
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

        // Ahrim's staff 75 (id: 4863)
        4863 {
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

        // Ahrim's staff 50 (id: 4864)
        4864 {
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

        // Ahrim's staff 25 (id: 4865)
        4865 {
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

        // Ahrim's staff 0 (id: 4866)
        4866 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Ahrim's robetop 100 (id: 4868)
        4868 {
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

        // Ahrim's robetop 75 (id: 4869)
        4869 {
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

        // Ahrim's robetop 50 (id: 4870)
        4870 {
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

        // Ahrim's robetop 25 (id: 4871)
        4871 {
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

        // Ahrim's robetop 0 (id: 4872)
        4872 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Ahrim's robeskirt 100 (id: 4874)
        4874 {
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

        // Ahrim's robeskirt 75 (id: 4875)
        4875 {
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

        // Ahrim's robeskirt 50 (id: 4876)
        4876 {
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

        // Ahrim's robeskirt 25 (id: 4877)
        4877 {
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

        // Ahrim's robeskirt 0 (id: 4878)
        4878 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dharok's helm 100 (id: 4880)
        4880 {
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

        // Dharok's helm 75 (id: 4881)
        4881 {
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

        // Dharok's helm 50 (id: 4882)
        4882 {
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

        // Dharok's helm 25 (id: 4883)
        4883 {
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

        // Dharok's greataxe 100 (id: 4886)
        4886 {
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

        // Dharok's greataxe 75 (id: 4887)
        4887 {
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

        // Dharok's greataxe 50 (id: 4888)
        4888 {
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

        // Dharok's greataxe 25 (id: 4889)
        4889 {
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

        // Dharok's greataxe 0 (id: 4890)
        4890 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Dharok's platebody 100 (id: 4892)
        4892 {
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

        // Dharok's platebody 75 (id: 4893)
        4893 {
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

        // Dharok's platebody 50 (id: 4894)
        4894 {
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

        // Dharok's platebody 25 (id: 4895)
        4895 {
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

        // Dharok's platebody 0 (id: 4896)
        4896 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Dharok's platelegs 100 (id: 4898)
        4898 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(85)
                    DEF_SLASH(82)
                    DEF_CRUSH(83)
                    DEF_MAGIC(-4)
                    DEF_RANGE(92)
                }
            }
        }

        // Dharok's platelegs 75 (id: 4899)
        4899 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(85)
                    DEF_SLASH(82)
                    DEF_CRUSH(83)
                    DEF_MAGIC(-4)
                    DEF_RANGE(92)
                }
            }
        }

        // Dharok's platelegs 50 (id: 4900)
        4900 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(85)
                    DEF_SLASH(82)
                    DEF_CRUSH(83)
                    DEF_MAGIC(-4)
                    DEF_RANGE(92)
                }
            }
        }

        // Dharok's platelegs 25 (id: 4901)
        4901 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(85)
                    DEF_SLASH(82)
                    DEF_CRUSH(83)
                    DEF_MAGIC(-4)
                    DEF_RANGE(92)
                }
            }
        }

        // Dharok's platelegs 0 (id: 4902)
        4902 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Guthan's helm 100 (id: 4904)
        4904 {
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

        // Guthan's helm 75 (id: 4905)
        4905 {
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

        // Guthan's helm 50 (id: 4906)
        4906 {
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

        // Guthan's helm 25 (id: 4907)
        4907 {
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

        // Guthan's warspear 100 (id: 4910)
        4910 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(75)
                    ATT_SLASH(75)
                    ATT_CRUSH(75)
                    DEF_STAB(7)
                    DEF_SLASH(7)
                    DEF_CRUSH(7)
                    Bonuses.Bonus.STRENGTH(75)
                }
            }
        }

        // Guthan's warspear 75 (id: 4911)
        4911 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(75)
                    ATT_SLASH(75)
                    ATT_CRUSH(75)
                    DEF_STAB(7)
                    DEF_SLASH(7)
                    DEF_CRUSH(7)
                    Bonuses.Bonus.STRENGTH(75)
                }
            }
        }

        // Guthan's warspear 50 (id: 4912)
        4912 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(75)
                    ATT_SLASH(75)
                    ATT_CRUSH(75)
                    DEF_STAB(7)
                    DEF_SLASH(7)
                    DEF_CRUSH(7)
                    Bonuses.Bonus.STRENGTH(75)
                }
            }
        }

        // Guthan's warspear 25 (id: 4913)
        4913 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(75)
                    ATT_SLASH(75)
                    ATT_CRUSH(75)
                    DEF_STAB(7)
                    DEF_SLASH(7)
                    DEF_CRUSH(7)
                    Bonuses.Bonus.STRENGTH(75)
                }
            }
        }

        // Guthan's warspear 0 (id: 4914)
        4914 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Guthan's platebody 100 (id: 4916)
        4916 {
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

        // Guthan's platebody 75 (id: 4917)
        4917 {
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

        // Guthan's platebody 50 (id: 4918)
        4918 {
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

        // Guthan's platebody 25 (id: 4919)
        4919 {
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

        // Guthan's platebody 0 (id: 4920)
        4920 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Guthan's chainskirt 100 (id: 4922)
        4922 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-14)
                    ATT_RANGED(-11)
                    DEF_STAB(75)
                    DEF_SLASH(72)
                    DEF_CRUSH(73)
                    DEF_MAGIC(-4)
                    DEF_RANGE(82)
                }
            }
        }

        // Guthan's chainskirt 75 (id: 4923)
        4923 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-14)
                    ATT_RANGED(-11)
                    DEF_STAB(75)
                    DEF_SLASH(72)
                    DEF_CRUSH(73)
                    DEF_MAGIC(-4)
                    DEF_RANGE(82)
                }
            }
        }

        // Guthan's chainskirt 50 (id: 4924)
        4924 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-14)
                    ATT_RANGED(-11)
                    DEF_STAB(75)
                    DEF_SLASH(72)
                    DEF_CRUSH(73)
                    DEF_MAGIC(-4)
                    DEF_RANGE(82)
                }
            }
        }

        // Guthan's chainskirt 25 (id: 4925)
        4925 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-14)
                    ATT_RANGED(-11)
                    DEF_STAB(75)
                    DEF_SLASH(72)
                    DEF_CRUSH(73)
                    DEF_MAGIC(-4)
                    DEF_RANGE(82)
                }
            }
        }

        // Guthan's chainskirt 0 (id: 4926)
        4926 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Karil's coif 100 (id: 4928)
        4928 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-1)
                    ATT_RANGED(7)
                    DEF_STAB(6)
                    DEF_SLASH(9)
                    DEF_CRUSH(12)
                    DEF_MAGIC(6)
                    DEF_RANGE(10)
                }
            }
        }

        // Karil's coif 75 (id: 4929)
        4929 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-1)
                    ATT_RANGED(7)
                    DEF_STAB(6)
                    DEF_SLASH(9)
                    DEF_CRUSH(12)
                    DEF_MAGIC(6)
                    DEF_RANGE(10)
                }
            }
        }

        // Karil's coif 50 (id: 4930)
        4930 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-1)
                    ATT_RANGED(7)
                    DEF_STAB(6)
                    DEF_SLASH(9)
                    DEF_CRUSH(12)
                    DEF_MAGIC(6)
                    DEF_RANGE(10)
                }
            }
        }

        // Karil's coif 25 (id: 4931)
        4931 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-1)
                    ATT_RANGED(7)
                    DEF_STAB(6)
                    DEF_SLASH(9)
                    DEF_CRUSH(12)
                    DEF_MAGIC(6)
                    DEF_RANGE(10)
                }
            }
        }

        // Karil's crossbow 100 (id: 4934)
        4934 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 8
                    longAttackDistance = 10
                }
                bonuses {
                    ATT_RANGED(84)
                }
            }
        }

        // Karil's crossbow 75 (id: 4935)
        4935 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 8
                    longAttackDistance = 10
                }
                bonuses {
                    ATT_RANGED(84)
                }
            }
        }

        // Karil's crossbow 50 (id: 4936)
        4936 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 8
                    longAttackDistance = 10
                }
                bonuses {
                    ATT_RANGED(84)
                }
            }
        }

        // Karil's crossbow 25 (id: 4937)
        4937 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 8
                    longAttackDistance = 10
                }
                bonuses {
                    ATT_RANGED(84)
                }
            }
        }

        // Karil's crossbow 0 (id: 4938)
        4938 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
                    normalAttackDistance = 8
                    longAttackDistance = 10
                }
            }
        }

        // Karil's leathertop 100 (id: 4940)
        4940 {
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

        // Karil's leathertop 75 (id: 4941)
        4941 {
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

        // Karil's leathertop 50 (id: 4942)
        4942 {
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

        // Karil's leathertop 25 (id: 4943)
        4943 {
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

        // Karil's leathertop 0 (id: 4944)
        4944 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Karil's leatherskirt 100 (id: 4946)
        4946 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(17)
                    DEF_STAB(26)
                    DEF_SLASH(20)
                    DEF_CRUSH(28)
                    DEF_MAGIC(35)
                    DEF_RANGE(33)
                }
            }
        }

        // Karil's leatherskirt 75 (id: 4947)
        4947 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(17)
                    DEF_STAB(26)
                    DEF_SLASH(20)
                    DEF_CRUSH(28)
                    DEF_MAGIC(35)
                    DEF_RANGE(33)
                }
            }
        }

        // Karil's leatherskirt 50 (id: 4948)
        4948 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(17)
                    DEF_STAB(26)
                    DEF_SLASH(20)
                    DEF_CRUSH(28)
                    DEF_MAGIC(35)
                    DEF_RANGE(33)
                }
            }
        }

        // Karil's leatherskirt 25 (id: 4949)
        4949 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-10)
                    ATT_RANGED(17)
                    DEF_STAB(26)
                    DEF_SLASH(20)
                    DEF_CRUSH(28)
                    DEF_MAGIC(35)
                    DEF_RANGE(33)
                }
            }
        }

        // Karil's leatherskirt 0 (id: 4950)
        4950 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Torag's helm 100 (id: 4952)
        4952 {
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

        // Torag's helm 75 (id: 4953)
        4953 {
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

        // Torag's helm 50 (id: 4954)
        4954 {
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

        // Torag's helm 25 (id: 4955)
        4955 {
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

        // Torag's hammers 100 (id: 4958)
        4958 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(85)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(72)
                }
            }
        }

        // Torag's hammers 75 (id: 4959)
        4959 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(85)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(72)
                }
            }
        }

        // Torag's hammers 50 (id: 4960)
        4960 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(85)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(72)
                }
            }
        }

        // Torag's hammers 25 (id: 4961)
        4961 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(85)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(72)
                }
            }
        }

        // Torag's hammers 0 (id: 4962)
        4962 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Torag's platebody 100 (id: 4964)
        4964 {
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

        // Torag's platebody 75 (id: 4965)
        4965 {
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

        // Torag's platebody 50 (id: 4966)
        4966 {
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

        // Torag's platebody 25 (id: 4967)
        4967 {
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

        // Torag's platebody 0 (id: 4968)
        4968 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Torag's platelegs 100 (id: 4970)
        4970 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(85)
                    DEF_SLASH(82)
                    DEF_CRUSH(83)
                    DEF_MAGIC(-4)
                    DEF_RANGE(92)
                }
            }
        }

        // Torag's platelegs 75 (id: 4971)
        4971 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(85)
                    DEF_SLASH(82)
                    DEF_CRUSH(83)
                    DEF_MAGIC(-4)
                    DEF_RANGE(92)
                }
            }
        }

        // Torag's platelegs 50 (id: 4972)
        4972 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(85)
                    DEF_SLASH(82)
                    DEF_CRUSH(83)
                    DEF_MAGIC(-4)
                    DEF_RANGE(92)
                }
            }
        }

        // Torag's platelegs 25 (id: 4973)
        4973 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(85)
                    DEF_SLASH(82)
                    DEF_CRUSH(83)
                    DEF_MAGIC(-4)
                    DEF_RANGE(92)
                }
            }
        }

        // Torag's platelegs 0 (id: 4974)
        4974 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Verac's helm 100 (id: 4976)
        4976 {
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

        // Verac's helm 75 (id: 4977)
        4977 {
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

        // Verac's helm 50 (id: 4978)
        4978 {
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

        // Verac's helm 25 (id: 4979)
        4979 {
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

        // Verac's flail 100 (id: 4982)
        4982 {
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

        // Verac's flail 75 (id: 4983)
        4983 {
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

        // Verac's flail 50 (id: 4984)
        4984 {
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

        // Verac's flail 25 (id: 4985)
        4985 {
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

        // Verac's flail 0 (id: 4986)
        4986 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Verac's brassard 100 (id: 4988)
        4988 {
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

        // Verac's brassard 75 (id: 4989)
        4989 {
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

        // Verac's brassard 50 (id: 4990)
        4990 {
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

        // Verac's brassard 25 (id: 4991)
        4991 {
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

        // Verac's brassard 0 (id: 4992)
        4992 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Verac's plateskirt 100 (id: 4994)
        4994 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(85)
                    DEF_SLASH(82)
                    DEF_CRUSH(83)
                    DEF_RANGE(84)
                    PRAYER(4)
                }
            }
        }

        // Verac's plateskirt 75 (id: 4995)
        4995 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(85)
                    DEF_SLASH(82)
                    DEF_CRUSH(83)
                    DEF_RANGE(84)
                    PRAYER(4)
                }
            }
        }

        // Verac's plateskirt 50 (id: 4996)
        4996 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(85)
                    DEF_SLASH(82)
                    DEF_CRUSH(83)
                    DEF_RANGE(84)
                    PRAYER(4)
                }
            }
        }

        // Verac's plateskirt 25 (id: 4997)
        4997 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-11)
                    DEF_STAB(85)
                    DEF_SLASH(82)
                    DEF_CRUSH(83)
                    DEF_RANGE(84)
                    PRAYER(4)
                }
            }
        }

        // Verac's plateskirt 0 (id: 4998)
        4998 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Mining helmet (id: 5013)
        5013 {
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

        // Mining helmet (id: 5014)
        5014 {
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

        // Bone spear (id: 5016)
        5016 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(11)
                    ATT_SLASH(11)
                    ATT_CRUSH(11)
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(13)
                }
            }
        }

        // Bone club (id: 5018)
        5018 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(16)
                    ATT_MAGIC(-4)
                    Bonuses.Bonus.STRENGTH(15)
                }
            }
        }

        // Woven top (id: 5024)
        5024 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Woven top (id: 5026)
        5026 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Woven top (id: 5028)
        5028 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Shirt (id: 5030)
        5030 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Shirt (id: 5032)
        5032 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Shirt (id: 5034)
        5034 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Trousers (id: 5036)
        5036 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Trousers (id: 5038)
        5038 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Trousers (id: 5040)
        5040 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Shorts (id: 5042)
        5042 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Shorts (id: 5044)
        5044 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Shorts (id: 5046)
        5046 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Skirt (id: 5048)
        5048 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Skirt (id: 5050)
        5050 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Skirt (id: 5052)
        5052 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Dwarven battleaxe (id: 5060)
        5060 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Dwarven battleaxe (id: 5061)
        5061 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Secateurs (id: 5329)
        5329 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Gardening boots (id: 5345)
        5345 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Binding necklace (id: 5521)
        5521 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Rogue top (id: 5553)
        5553 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(10)
                    DEF_MAGIC(10)
                    DEF_RANGE(10)
                }
            }
        }

        // Rogue mask (id: 5554)
        5554 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    DEF_STAB(5)
                    DEF_SLASH(5)
                    DEF_CRUSH(5)
                    DEF_MAGIC(5)
                    DEF_RANGE(5)
                }
            }
        }

        // Rogue trousers (id: 5555)
        5555 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    DEF_STAB(7)
                    DEF_SLASH(7)
                    DEF_CRUSH(7)
                    DEF_MAGIC(7)
                    DEF_RANGE(7)
                }
            }
        }

        // Rogue gloves (id: 5556)
        5556 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_STAB(2)
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                    DEF_MAGIC(2)
                    DEF_RANGE(2)
                }
            }
        }

        // Rogue boots (id: 5557)
        5557 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_STAB(2)
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                    DEF_MAGIC(2)
                    DEF_RANGE(2)
                }
            }
        }

        // Stethoscope (id: 5560)
        5560 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Initiate sallet (id: 5574)
        5574 {
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
                    PRAYER(3)
                }
            }
        }

        // Initiate hauberk (id: 5575)
        5575 {
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
                    PRAYER(6)
                }
            }
        }

        // Initiate cuisse (id: 5576)
        5576 {
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
                    PRAYER(5)
                }
            }
        }

        // Grain (id: 5607)
        5607 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Fox (id: 5608)
        5608 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Chicken (id: 5609)
        5609 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Magic carpet (id: 5614)
        5614 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Bronze arrow(p+) (id: 5616)
        5616 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(7)
                }
            }
        }

        // Iron arrow(p+) (id: 5617)
        5617 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(10)
                }
            }
        }

        // Steel arrow(p+) (id: 5618)
        5618 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(16)
                }
            }
        }

        // Mithril arrow(p+) (id: 5619)
        5619 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(22)
                }
            }
        }

        // Adamant arrow(p+) (id: 5620)
        5620 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(31)
                }
            }
        }

        // Rune arrow(p+) (id: 5621)
        5621 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(49)
                }
            }
        }

        // Bronze arrow(p++) (id: 5622)
        5622 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(7)
                }
            }
        }

        // Iron arrow(p++) (id: 5623)
        5623 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(10)
                }
            }
        }

        // Steel arrow(p++) (id: 5624)
        5624 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(16)
                }
            }
        }

        // Mithril arrow(p++) (id: 5625)
        5625 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(22)
                }
            }
        }

        // Adamant arrow(p++) (id: 5626)
        5626 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(31)
                }
            }
        }

        // Rune arrow(p++) (id: 5627)
        5627 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(49)
                }
            }
        }

        // Bronze dart(p+) (id: 5628)
        5628 {
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

        // Iron dart(p+) (id: 5629)
        5629 {
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

        // Steel dart(p+) (id: 5630)
        5630 {
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

        // Black dart(p+) (id: 5631)
        5631 {
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

        // Mithril dart(p+) (id: 5632)
        5632 {
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

        // Adamant dart(p+) (id: 5633)
        5633 {
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

        // Rune dart(p+) (id: 5634)
        5634 {
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

        // Bronze dart(p++) (id: 5635)
        5635 {
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

        // Iron dart(p++) (id: 5636)
        5636 {
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

        // Steel dart(p++) (id: 5637)
        5637 {
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

        // Black dart(p++) (id: 5638)
        5638 {
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

        // Mithril dart(p++) (id: 5639)
        5639 {
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

        // Adamant dart(p++) (id: 5640)
        5640 {
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

        // Rune dart(p++) (id: 5641)
        5641 {
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

        // Bronze javelin(p+) (id: 5642)
        5642 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(25)
                }
            }
        }

        // Iron javelin(p+) (id: 5643)
        5643 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(42)
                }
            }
        }

        // Steel javelin(p+) (id: 5644)
        5644 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(64)
                }
            }
        }

        // Mithril javelin(p+) (id: 5645)
        5645 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(85)
                }
            }
        }

        // Adamant javelin(p+) (id: 5646)
        5646 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(102)
                }
            }
        }

        // Rune javelin(p+) (id: 5647)
        5647 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(124)
                }
            }
        }

        // Bronze javelin(p++) (id: 5648)
        5648 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(25)
                }
            }
        }

        // Iron javelin(p++) (id: 5649)
        5649 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(42)
                }
            }
        }

        // Steel javelin(p++) (id: 5650)
        5650 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(64)
                }
            }
        }

        // Mithril javelin(p++) (id: 5651)
        5651 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(85)
                }
            }
        }

        // Adamant javelin(p++) (id: 5652)
        5652 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(102)
                }
            }
        }

        // Rune javelin(p++) (id: 5653)
        5653 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(124)
                }
            }
        }

        // Bronze knife(p+) (id: 5654)
        5654 {
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

        // Iron knife(p+) (id: 5655)
        5655 {
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

        // Steel knife(p+) (id: 5656)
        5656 {
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

        // Mithril knife(p+) (id: 5657)
        5657 {
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

        // Black knife(p+) (id: 5658)
        5658 {
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

        // Adamant knife(p+) (id: 5659)
        5659 {
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

        // Rune knife(p+) (id: 5660)
        5660 {
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

        // Bronze knife(p++) (id: 5661)
        5661 {
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

        // Iron knife(p++) (id: 5662)
        5662 {
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

        // Steel knife(p++) (id: 5663)
        5663 {
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

        // Mithril knife(p++) (id: 5664)
        5664 {
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

        // Black knife(p++) (id: 5665)
        5665 {
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

        // Adamant knife(p++) (id: 5666)
        5666 {
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

        // Rune knife(p++) (id: 5667)
        5667 {
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

        // Iron dagger(p+) (id: 5668)
        5668 {
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

        // Bronze dagger(p+) (id: 5670)
        5670 {
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

        // Steel dagger(p+) (id: 5672)
        5672 {
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

        // Mithril dagger(p+) (id: 5674)
        5674 {
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

        // Adamant dagger(p+) (id: 5676)
        5676 {
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

        // Rune dagger(p+) (id: 5678)
        5678 {
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

        // Dragon dagger(p+) (id: 5680)
        5680 {
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

        // Black dagger(p+) (id: 5682)
        5682 {
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

        // Poison dagger(p+) (id: 5684)
        5684 {
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

        // Iron dagger(p++) (id: 5686)
        5686 {
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

        // Bronze dagger(p++) (id: 5688)
        5688 {
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

        // Steel dagger(p++) (id: 5690)
        5690 {
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

        // Mithril dagger(p++) (id: 5692)
        5692 {
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

        // Adamant dagger(p++) (id: 5694)
        5694 {
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

        // Rune dagger(p++) (id: 5696)
        5696 {
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

        // Dragon dagger(p++) (id: 5698)
        5698 {
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

        // Black dagger(p++) (id: 5700)
        5700 {
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

        // Poison dagger(p++) (id: 5702)
        5702 {
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

        // Bronze spear(p+) (id: 5704)
        5704 {
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

        // Iron spear(p+) (id: 5706)
        5706 {
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

        // Steel spear(p+) (id: 5708)
        5708 {
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

        // Mithril spear(p+) (id: 5710)
        5710 {
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

        // Adamant spear(p+) (id: 5712)
        5712 {
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

        // Rune spear(p+) (id: 5714)
        5714 {
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

        // Dragon spear(p+) (id: 5716)
        5716 {
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

        // Bronze spear(p++) (id: 5718)
        5718 {
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

        // Iron spear(p++) (id: 5720)
        5720 {
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

        // Steel spear(p++) (id: 5722)
        5722 {
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

        // Mithril spear(p++) (id: 5724)
        5724 {
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

        // Adamant spear(p++) (id: 5726)
        5726 {
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

        // Rune spear(p++) (id: 5728)
        5728 {
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

        // Dragon spear(p++) (id: 5730)
        5730 {
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

        // Stool (id: 5732)
        5732 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Black spear(p+) (id: 5734)
        5734 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
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

        // Black spear(p++) (id: 5736)
        5736 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4
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

        // Amulet of nature (id: 6040)
        6040 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Pre-nature amulet (id: 6041)
        6041 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Bronze bolts (p+) (id: 6061)
        6061 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(10)
                }
            }
        }

        // Bronze bolts (p++) (id: 6062)
        6062 {
            equipment {
                slot = EquipmentSlot.AMMUNITION.slot
                bonuses {
                    RANGE_STRENGTH(10)
                }
            }
        }

        // Mourner top (id: 6065)
        6065 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Mourner trousers (id: 6067)
        6067 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Mourner gloves (id: 6068)
        6068 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                }
            }
        }

        // Mourner boots (id: 6069)
        6069 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Mourner cloak (id: 6070)
        6070 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Fixed device (id: 6082)
        6082 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Ghostly boots (id: 6106)
        6106 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(2)
                    DEF_MAGIC(2)
                }
            }
        }

        // Ghostly robe (id: 6107)
        6107 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(5)
                    DEF_MAGIC(5)
                }
            }
        }

        // Ghostly robe (id: 6108)
        6108 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                }
            }
        }

        // Ghostly hood (id: 6109)
        6109 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Ghostly gloves (id: 6110)
        6110 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(2)
                    DEF_MAGIC(2)
                }
            }
        }

        // Ghostly cloak (id: 6111)
        6111 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    ATT_MAGIC(5)
                    DEF_MAGIC(5)
                }
            }
        }

        // A chair (id: 6122)
        6122 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Beer glass (id: 6123)
        6123 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Enchanted lyre(2) (id: 6125)
        6125 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Enchanted lyre(3) (id: 6126)
        6126 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Enchanted lyre(4) (id: 6127)
        6127 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Rock-shell helm (id: 6128)
        6128 {
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

        // Rock-shell plate (id: 6129)
        6129 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-30)
                    ATT_RANGED(-10)
                    DEF_STAB(82)
                    DEF_SLASH(80)
                    DEF_CRUSH(72)
                    DEF_MAGIC(-6)
                    DEF_RANGE(80)
                }
            }
        }

        // Rock-shell legs (id: 6130)
        6130 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-21)
                    ATT_RANGED(-7)
                    DEF_STAB(51)
                    DEF_SLASH(49)
                    DEF_CRUSH(47)
                    DEF_MAGIC(-4)
                    DEF_RANGE(49)
                }
            }
        }

        // Spined helm (id: 6131)
        6131 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_STAB(-6)
                    ATT_SLASH(-6)
                    ATT_CRUSH(-6)
                    ATT_MAGIC(-6)
                    ATT_RANGED(6)
                    DEF_STAB(6)
                    DEF_SLASH(6)
                    DEF_CRUSH(6)
                    DEF_MAGIC(6)
                }
            }
        }

        // Spined body (id: 6133)
        6133 {
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

        // Spined chaps (id: 6135)
        6135 {
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

        // Skeletal helm (id: 6137)
        6137 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(2)
                    ATT_RANGED(-2)
                    DEF_STAB(10)
                    DEF_SLASH(9)
                    DEF_CRUSH(11)
                    DEF_MAGIC(3)
                }
            }
        }

        // Skeletal top (id: 6139)
        6139 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(8)
                    ATT_RANGED(-10)
                    DEF_STAB(35)
                    DEF_SLASH(25)
                    DEF_CRUSH(42)
                    DEF_MAGIC(15)
                }
            }
        }

        // Skeletal bottoms (id: 6141)
        6141 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(6)
                    ATT_RANGED(-7)
                    DEF_STAB(22)
                    DEF_SLASH(20)
                    DEF_CRUSH(24)
                    DEF_MAGIC(10)
                }
            }
        }

        // Spined boots (id: 6143)
        6143 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Rock-shell boots (id: 6145)
        6145 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Skeletal boots (id: 6147)
        6147 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                }
            }
        }

        // Spined gloves (id: 6149)
        6149 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                }
            }
        }

        // Rock-shell gloves (id: 6151)
        6151 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                }
            }
        }

        // Skeletal gloves (id: 6153)
        6153 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                }
            }
        }

        // Lederhosen top (id: 6180)
        6180 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Lederhosen shorts (id: 6181)
        6181 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Royal frog tunic (id: 6184)
        6184 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Royal frog leggings (id: 6185)
        6185 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Royal frog blouse (id: 6186)
        6186 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Royal frog skirt (id: 6187)
        6187 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Broodoo shield (10) (id: 6215)
        6215 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (9) (id: 6217)
        6217 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (8) (id: 6219)
        6219 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (7) (id: 6221)
        6221 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (6) (id: 6223)
        6223 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (5) (id: 6225)
        6225 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (4) (id: 6227)
        6227 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (3) (id: 6229)
        6229 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (2) (id: 6231)
        6231 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (1) (id: 6233)
        6233 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (id: 6235)
        6235 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (10) (id: 6237)
        6237 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (9) (id: 6239)
        6239 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (8) (id: 6241)
        6241 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (7) (id: 6243)
        6243 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (6) (id: 6245)
        6245 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (5) (id: 6247)
        6247 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (4) (id: 6249)
        6249 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (3) (id: 6251)
        6251 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (2) (id: 6253)
        6253 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (1) (id: 6255)
        6255 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (id: 6257)
        6257 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (10) (id: 6259)
        6259 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (9) (id: 6261)
        6261 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (8) (id: 6263)
        6263 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (7) (id: 6265)
        6265 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (6) (id: 6267)
        6267 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (5) (id: 6269)
        6269 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (4) (id: 6271)
        6271 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (3) (id: 6273)
        6273 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (2) (id: 6275)
        6275 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (1) (id: 6277)
        6277 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Broodoo shield (id: 6279)
        6279 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(3)
                    ATT_RANGED(-7)
                    DEF_STAB(10)
                    DEF_SLASH(10)
                    DEF_CRUSH(15)
                    DEF_MAGIC(5)
                    PRAYER(5)
                }
            }
        }

        // Thatch spar light (id: 6281)
        6281 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Thatch spar med (id: 6283)
        6283 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Thatch spar dense (id: 6285)
        6285 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Opal machete (id: 6313)
        6313 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_SLASH(8)
                    ATT_CRUSH(-2)
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Jade machete (id: 6315)
        6315 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_SLASH(11)
                    ATT_CRUSH(-2)
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    Bonuses.Bonus.STRENGTH(6)
                }
            }
        }

        // Red topaz machete (id: 6317)
        6317 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_SLASH(16)
                    ATT_CRUSH(-2)
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    Bonuses.Bonus.STRENGTH(10)
                }
            }
        }

        // Snakeskin body (id: 6322)
        6322 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-5)
                    ATT_RANGED(12)
                    DEF_STAB(25)
                    DEF_SLASH(28)
                    DEF_CRUSH(32)
                    DEF_MAGIC(15)
                    DEF_RANGE(35)
                }
            }
        }

        // Snakeskin chaps (id: 6324)
        6324 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-5)
                    ATT_RANGED(6)
                    DEF_STAB(8)
                    DEF_SLASH(8)
                    DEF_CRUSH(10)
                    DEF_MAGIC(4)
                    DEF_RANGE(10)
                }
            }
        }

        // Snakeskin bandana (id: 6326)
        6326 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-5)
                    ATT_RANGED(4)
                    DEF_STAB(2)
                    DEF_SLASH(4)
                    DEF_CRUSH(4)
                    DEF_MAGIC(2)
                    DEF_RANGE(2)
                }
            }
        }

        // Snakeskin boots (id: 6328)
        6328 {
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

        // Snakeskin vambraces (id: 6330)
        6330 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(-5)
                    ATT_RANGED(6)
                    DEF_STAB(2)
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                    DEF_MAGIC(1)
                }
            }
        }

        // Tribal top (id: 6341)
        6341 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Villager robe (id: 6343)
        6343 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Villager armband (id: 6347)
        6347 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Villager sandals (id: 6349)
        6349 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Tribal top (id: 6351)
        6351 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Villager robe (id: 6353)
        6353 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Villager sandals (id: 6357)
        6357 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Villager armband (id: 6359)
        6359 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Tribal top (id: 6361)
        6361 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Villager robe (id: 6363)
        6363 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Villager sandals (id: 6367)
        6367 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Villager armband (id: 6369)
        6369 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Tribal top (id: 6371)
        6371 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Villager robe (id: 6373)
        6373 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Villager sandals (id: 6377)
        6377 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Villager armband (id: 6379)
        6379 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Desert top (id: 6384)
        6384 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Desert robes (id: 6386)
        6386 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Desert top (id: 6388)
        6388 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Desert legs (id: 6390)
        6390 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Menaphite purple top (id: 6394)
        6394 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Menaphite purple robe (id: 6396)
        6396 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Menaphite purple kilt (id: 6398)
        6398 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Menaphite red top (id: 6402)
        6402 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Menaphite red robe (id: 6404)
        6404 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Menaphite red kilt (id: 6406)
        6406 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Oak blackjack(o) (id: 6408)
        6408 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    ATT_CRUSH(4)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Oak blackjack(d) (id: 6410)
        6410 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    DEF_CRUSH(4)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Willow blackjack(o) (id: 6412)
        6412 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    ATT_CRUSH(8)
                    Bonuses.Bonus.STRENGTH(8)
                }
            }
        }

        // Willow blackjack(d) (id: 6414)
        6414 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    DEF_CRUSH(8)
                    Bonuses.Bonus.STRENGTH(8)
                }
            }
        }

        // Maple blackjack (id: 6416)
        6416 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    Bonuses.Bonus.STRENGTH(20)
                }
            }
        }

        // Maple blackjack(o) (id: 6418)
        6418 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    ATT_CRUSH(24)
                    Bonuses.Bonus.STRENGTH(20)
                }
            }
        }

        // Maple blackjack(d) (id: 6420)
        6420 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    DEF_CRUSH(24)
                    Bonuses.Bonus.STRENGTH(20)
                }
            }
        }

        // Ring of charos(a) (id: 6465)
        6465 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Toktz-xil-ul (id: 6522)
        6522 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 7
                    longAttackDistance = 9
                }
                bonuses {
                    ATT_RANGED(69)
                    RANGE_STRENGTH(49)
                }
            }
        }

        // Toktz-xil-ak (id: 6523)
        6523 {
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

        // Toktz-ket-xil (id: 6524)
        6524 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-12)
                    ATT_RANGED(-8)
                    DEF_STAB(40)
                    DEF_SLASH(42)
                    DEF_CRUSH(38)
                    DEF_RANGE(65)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Toktz-xil-ek (id: 6525)
        6525 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(16)
                    ATT_SLASH(48)
                    Bonuses.Bonus.STRENGTH(39)
                }
            }
        }

        // Toktz-mej-tal (id: 6526)
        6526 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 6
                }
                bonuses {
                    ATT_STAB(15)
                    ATT_SLASH(-1)
                    ATT_CRUSH(55)
                    ATT_MAGIC(15)
                    DEF_STAB(10)
                    DEF_SLASH(15)
                    DEF_CRUSH(5)
                    DEF_MAGIC(15)
                    Bonuses.Bonus.STRENGTH(55)
                    PRAYER(5)
                }
            }
        }

        // Tzhaar-ket-em (id: 6527)
        6527 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(-4)
                    ATT_SLASH(-4)
                    ATT_CRUSH(62)
                    Bonuses.Bonus.STRENGTH(56)
                }
            }
        }

        // Tzhaar-ket-om (id: 6528)
        6528 {
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

        // Mouse toy (id: 6541)
        6541 {
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

        // Catspeak amulet(e) (id: 6544)
        6544 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Mud battlestaff (id: 6562)
        6562 {
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

        // Mystic mud staff (id: 6563)
        6563 {
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

        // Obsidian cape (id: 6568)
        6568 {
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

        // Fire cape (id: 6570)
        6570 {
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

        // Onyx ring (id: 6575)
        6575 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Onyx necklace (id: 6577)
        6577 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Onyx amulet (id: 6581)
        6581 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Ring of stone (id: 6583)
        6583 {
            equipment {
                slot = EquipmentSlot.RING.slot
            }
        }

        // Amulet of fury (id: 6585)
        6585 {
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

        // White claws (id: 6587)
        6587 {
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
                    PRAYER(1)
                }
            }
        }

        // White battleaxe (id: 6589)
        6589 {
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
                    PRAYER(1)
                }
            }
        }

        // White dagger (id: 6591)
        6591 {
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
                    PRAYER(1)
                }
            }
        }

        // White dagger(p) (id: 6593)
        6593 {
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
                    PRAYER(1)
                }
            }
        }

        // White dagger(p+) (id: 6595)
        6595 {
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
                    PRAYER(1)
                }
            }
        }

        // White dagger(p++) (id: 6597)
        6597 {
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
                    PRAYER(1)
                }
            }
        }

        // White halberd (id: 6599)
        6599 {
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
                    PRAYER(1)
                }
            }
        }

        // White mace (id: 6601)
        6601 {
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
                    PRAYER(3)
                }
            }
        }

        // White magic staff (id: 6603)
        6603 {
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
                    PRAYER(1)
                }
            }
        }

        // White sword (id: 6605)
        6605 {
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
                    PRAYER(1)
                }
            }
        }

        // White longsword (id: 6607)
        6607 {
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
                    PRAYER(1)
                }
            }
        }

        // White 2h sword (id: 6609)
        6609 {
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
                    PRAYER(1)
                }
            }
        }

        // White scimitar (id: 6611)
        6611 {
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
                    PRAYER(1)
                }
            }
        }

        // White warhammer (id: 6613)
        6613 {
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
                    PRAYER(1)
                }
            }
        }

        // White chainbody (id: 6615)
        6615 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(-15)
                    DEF_STAB(22)
                    DEF_SLASH(32)
                    DEF_CRUSH(39)
                    DEF_MAGIC(-3)
                    DEF_RANGE(24)
                    PRAYER(1)
                }
            }
        }

        // White platebody (id: 6617)
        6617 {
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
                    PRAYER(1)
                }
            }
        }

        // White boots (id: 6619)
        6619 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(-3)
                    ATT_RANGED(-1)
                    DEF_STAB(7)
                    DEF_SLASH(8)
                    DEF_CRUSH(9)
                    PRAYER(1)
                }
            }
        }

        // White med helm (id: 6621)
        6621 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(-3)
                    DEF_STAB(9)
                    DEF_SLASH(10)
                    DEF_CRUSH(8)
                    DEF_MAGIC(-1)
                    DEF_RANGE(9)
                    PRAYER(1)
                }
            }
        }

        // White full helm (id: 6623)
        6623 {
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
                    PRAYER(1)
                }
            }
        }

        // White platelegs (id: 6625)
        6625 {
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
                    PRAYER(1)
                }
            }
        }

        // White plateskirt (id: 6627)
        6627 {
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
                    PRAYER(1)
                }
            }
        }

        // White gloves (id: 6629)
        6629 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(2)
                    PRAYER(1)
                }
            }
        }

        // White sq shield (id: 6631)
        6631 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(-6)
                    DEF_STAB(15)
                    DEF_SLASH(16)
                    DEF_CRUSH(14)
                    DEF_RANGE(15)
                    PRAYER(1)
                }
            }
        }

        // White kiteshield (id: 6633)
        6633 {
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
                    PRAYER(1)
                }
            }
        }

        // Camo top (id: 6654)
        6654 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Camo bottoms (id: 6655)
        6655 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Camo top (id: 6657)
        6657 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Camo bottoms (id: 6658)
        6658 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Flippers (id: 6666)
        6666 {
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

        // Fishbowl (id: 6670)
        6670 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Fishbowl (id: 6671)
        6671 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Fishbowl (id: 6672)
        6672 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Camulet (id: 6707)
        6707 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Slayer gloves (id: 6720)
        6720 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_STAB(4)
                    DEF_SLASH(5)
                    DEF_CRUSH(3)
                }
            }
        }

        // Seercull (id: 6724)
        6724 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                    normalAttackDistance = 8
                    longAttackDistance = 10
                }
                bonuses {
                    ATT_RANGED(69)
                }
            }
        }

        // Seers ring (id: 6731)
        6731 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_MAGIC(6)
                    DEF_MAGIC(6)
                    MAGIC_DAMAGE(0)
                }
            }
        }

        // Archers ring (id: 6733)
        6733 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_RANGED(4)
                    DEF_RANGE(4)
                }
            }
        }

        // Warrior ring (id: 6735)
        6735 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    ATT_SLASH(4)
                    DEF_SLASH(4)
                }
            }
        }

        // Berserker ring (id: 6737)
        6737 {
            equipment {
                slot = EquipmentSlot.RING.slot
                bonuses {
                    DEF_CRUSH(4)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Dragon axe (id: 6739)
        6739 {
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

        // Broken axe (id: 6741)
        6741 {
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

        // Silverlight (id: 6745)
        6745 {
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

        // Darklight (id: 6746)
        6746 {
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

        // Black desert shirt (id: 6750)
        6750 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Black desert robe (id: 6752)
        6752 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Guthix mjolnir (id: 6760)
        6760 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_CRUSH(11)
                    Bonuses.Bonus.STRENGTH(14)
                }
            }
        }

        // Saradomin mjolnir (id: 6762)
        6762 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_CRUSH(11)
                    Bonuses.Bonus.STRENGTH(14)
                }
            }
        }

        // Zamorak mjolnir (id: 6764)
        6764 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 5
                }
                bonuses {
                    ATT_CRUSH(11)
                    Bonuses.Bonus.STRENGTH(14)
                }
            }
        }

        // Rat pole (id: 6773)
        6773 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
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

        // Rat pole (id: 6774)
        6774 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
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

        // Rat pole (id: 6775)
        6775 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
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

        // Rat pole (id: 6776)
        6776 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
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

        // Rat pole (id: 6777)
        6777 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
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

        // Rat pole (id: 6778)
        6778 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
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

        // Rat pole (id: 6779)
        6779 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
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

        // Robe of elidinis (id: 6786)
        6786 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Robe of elidinis (id: 6787)
        6787 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Shoes (id: 6790)
        6790 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Granite legs (id: 6809)
        6809 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(-31)
                    ATT_RANGED(-18)
                    DEF_STAB(43)
                    DEF_SLASH(45)
                    DEF_CRUSH(41)
                    DEF_MAGIC(-4)
                    DEF_RANGE(68)
                }
            }
        }

        // Slender blade (id: 6817)
        6817 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Bow-sword (id: 6818)
        6818 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    twoHanded = true
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Bobble scarf (id: 6857)
        6857 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Jester scarf (id: 6859)
        6859 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Tri-jester scarf (id: 6861)
        6861 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Woolly scarf (id: 6863)
        6863 {
            equipment {
                slot = EquipmentSlot.AMULET.slot
            }
        }

        // Marionette handle (id: 6864)
        6864 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Mage's book (id: 6889)
        6889 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_MAGIC(15)
                    MAGIC_DAMAGE(2)
                }
            }
        }

        // Beginner wand (id: 6908)
        6908 {
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

        // Apprentice wand (id: 6910)
        6910 {
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

        // Teacher wand (id: 6912)
        6912 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
                bonuses {
                    ATT_MAGIC(15)
                    DEF_MAGIC(15)
                }
            }
        }

        // Master wand (id: 6914)
        6914 {
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

        // Infinity top (id: 6916)
        6916 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(22)
                    DEF_MAGIC(22)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Infinity hat (id: 6918)
        6918 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(6)
                    DEF_MAGIC(6)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Infinity boots (id: 6920)
        6920 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    ATT_MAGIC(5)
                    DEF_MAGIC(5)
                }
            }
        }

        // Infinity gloves (id: 6922)
        6922 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_MAGIC(5)
                    DEF_MAGIC(5)
                }
            }
        }

        // Infinity bottoms (id: 6924)
        6924 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(17)
                    DEF_MAGIC(17)
                    MAGIC_DAMAGE(1)
                }
            }
        }

        // Pink cape (id: 6959)
        6959 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
                bonuses {
                    DEF_SLASH(1)
                    DEF_CRUSH(1)
                    DEF_RANGE(2)
                }
            }
        }

        // Unlit bug lantern (id: 7051)
        7051 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Lit bug lantern (id: 7053)
        7053 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Stripy pirate shirt (id: 7110)
        7110 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Pirate boots (id: 7114)
        7114 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Pirate leggings (id: 7116)
        7116 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Stripy pirate shirt (id: 7122)
        7122 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Pirate leggings (id: 7126)
        7126 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Stripy pirate shirt (id: 7128)
        7128 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Pirate leggings (id: 7132)
        7132 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Stripy pirate shirt (id: 7134)
        7134 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Pirate leggings (id: 7138)
        7138 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Lucky cutlass (id: 7140)
        7140 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(20)
                    ATT_MAGIC(-5)
                    DEF_STAB(6)
                    DEF_SLASH(6)
                    DEF_CRUSH(6)
                    Bonuses.Bonus.STRENGTH(25)
                }
            }
        }

        // Harry's cutlass (id: 7141)
        7141 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(3)
                    ATT_SLASH(14)
                    ATT_MAGIC(-5)
                    DEF_STAB(4)
                    DEF_SLASH(4)
                    DEF_CRUSH(4)
                    Bonuses.Bonus.STRENGTH(22)
                }
            }
        }

        // Rapier (id: 7142)
        7142 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                }
                bonuses {
                    ATT_STAB(45)
                    ATT_SLASH(7)
                    ATT_CRUSH(-2)
                    DEF_SLASH(1)
                    Bonuses.Bonus.STRENGTH(44)
                }
            }
        }

        // Dragon 2h sword (id: 7158)
        7158 {
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

        // Insulated boots (id: 7159)
        7159 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
                bonuses {
                    DEF_STAB(1)
                    DEF_SLASH(1)
                    DEF_RANGE(1)
                }
            }
        }

        // Mud pie (id: 7170)
        7170 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4
                    normalAttackDistance = 6
                    longAttackDistance = 8
                }
                bonuses {
                    ATT_STAB(-100)
                    ATT_SLASH(-100)
                    ATT_CRUSH(-50)
                    Bonuses.Bonus.STRENGTH(-10)
                }
            }
        }

        // Black shield (h1) (id: 7332)
        7332 {
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

        // Adamant shield (h1) (id: 7334)
        7334 {
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

        // Rune shield (h1) (id: 7336)
        7336 {
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

        // Black shield (h2) (id: 7338)
        7338 {
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

        // Adamant shield (h2) (id: 7340)
        7340 {
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

        // Rune shield (h2) (id: 7342)
        7342 {
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

        // Black shield (h3) (id: 7344)
        7344 {
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

        // Adamant shield (h3) (id: 7346)
        7346 {
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

        // Rune shield (h3) (id: 7348)
        7348 {
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

        // Black shield (h4) (id: 7350)
        7350 {
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

        // Adamant shield (h4) (id: 7352)
        7352 {
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

        // Rune shield (h4) (id: 7354)
        7354 {
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

        // Black shield (h5) (id: 7356)
        7356 {
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

        // Adamant shield (h5) (id: 7358)
        7358 {
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

        // Rune shield (h5) (id: 7360)
        7360 {
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

        // Studded body (g) (id: 7362)
        7362 {
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

        // Studded body (t) (id: 7364)
        7364 {
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

        // Studded chaps (g) (id: 7366)
        7366 {
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

        // Studded chaps (t) (id: 7368)
        7368 {
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

        // Green d'hide body (g) (id: 7370)
        7370 {
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

        // Green d'hide body (t) (id: 7372)
        7372 {
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

        // Blue d'hide body (g) (id: 7374)
        7374 {
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

        // Blue d'hide body (t) (id: 7376)
        7376 {
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

        // Green d'hide chaps (g) (id: 7378)
        7378 {
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

        // Green d'hide chaps (t) (id: 7380)
        7380 {
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

        // Blue d'hide chaps (g) (id: 7382)
        7382 {
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

        // Blue d'hide chaps (t) (id: 7384)
        7384 {
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

        // Blue skirt (g) (id: 7386)
        7386 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Blue skirt (t) (id: 7388)
        7388 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Blue wizard robe (g) (id: 7390)
        7390 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Blue wizard robe (t) (id: 7392)
        7392 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(3)
                    DEF_MAGIC(3)
                }
            }
        }

        // Blue wizard hat (g) (id: 7394)
        7394 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(2)
                    DEF_MAGIC(2)
                }
            }
        }

        // Blue wizard hat (t) (id: 7396)
        7396 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(2)
                    DEF_MAGIC(2)
                }
            }
        }

        // Enchanted robe (id: 7398)
        7398 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
                bonuses {
                    ATT_MAGIC(15)
                    DEF_MAGIC(15)
                }
            }
        }

        // Enchanted top (id: 7399)
        7399 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
                bonuses {
                    ATT_MAGIC(20)
                    DEF_MAGIC(20)
                }
            }
        }

        // Enchanted hat (id: 7400)
        7400 {
            equipment {
                slot = EquipmentSlot.HELMET.slot
                bonuses {
                    ATT_MAGIC(4)
                    DEF_MAGIC(4)
                }
            }
        }

        // Magic secateurs (id: 7409)
        7409 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 5
                }
                bonuses {
                    ATT_STAB(7)
                    ATT_SLASH(9)
                    ATT_CRUSH(-5)
                    ATT_MAGIC(1)
                    DEF_SLASH(1)
                    DEF_MAGIC(1)
                    Bonuses.Bonus.STRENGTH(1)
                }
            }
        }

        // Queen's secateurs (id: 7410)
        7410 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Paddle (id: 7414)
        7414 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Fungicide spray 10 (id: 7421)
        7421 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Fungicide spray 9 (id: 7422)
        7422 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Fungicide spray 8 (id: 7423)
        7423 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Fungicide spray 7 (id: 7424)
        7424 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Fungicide spray 6 (id: 7425)
        7425 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Fungicide spray 5 (id: 7426)
        7426 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Fungicide spray 4 (id: 7427)
        7427 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Fungicide spray 3 (id: 7428)
        7428 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Fungicide spray 2 (id: 7429)
        7429 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Fungicide spray 1 (id: 7430)
        7430 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Fungicide spray 0 (id: 7431)
        7431 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Wooden spoon (id: 7433)
        7433 {
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

        // Egg whisk (id: 7435)
        7435 {
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

        // Spork (id: 7437)
        7437 {
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

        // Spatula (id: 7439)
        7439 {
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
                    Bonuses.Bonus.STRENGTH(22)
                }
            }
        }

        // Frying pan (id: 7441)
        7441 {
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
                    Bonuses.Bonus.STRENGTH(20)
                }
            }
        }

        // Skewer (id: 7443)
        7443 {
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

        // Rolling pin (id: 7445)
        7445 {
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

        // Kitchen knife (id: 7447)
        7447 {
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

        // Meat tenderiser (id: 7449)
        7449 {
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
                    Bonuses.Bonus.STRENGTH(48)
                }
            }
        }

        // Cleaver (id: 7451)
        7451 {
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

        // Hardleather gloves (id: 7453)
        7453 {
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

        // Bronze gloves (id: 7454)
        7454 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(2)
                    ATT_SLASH(2)
                    ATT_CRUSH(2)
                    ATT_MAGIC(1)
                    ATT_RANGED(2)
                    DEF_STAB(2)
                    DEF_SLASH(2)
                    DEF_CRUSH(2)
                    DEF_MAGIC(1)
                    DEF_RANGE(2)
                    Bonuses.Bonus.STRENGTH(2)
                }
            }
        }

        // Iron gloves (id: 7455)
        7455 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(3)
                    ATT_SLASH(3)
                    ATT_CRUSH(3)
                    ATT_MAGIC(2)
                    ATT_RANGED(3)
                    DEF_STAB(3)
                    DEF_SLASH(3)
                    DEF_CRUSH(3)
                    DEF_MAGIC(2)
                    DEF_RANGE(3)
                    Bonuses.Bonus.STRENGTH(3)
                }
            }
        }

        // Steel gloves (id: 7456)
        7456 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(4)
                    ATT_SLASH(4)
                    ATT_CRUSH(4)
                    ATT_MAGIC(2)
                    ATT_RANGED(4)
                    DEF_STAB(4)
                    DEF_SLASH(4)
                    DEF_CRUSH(4)
                    DEF_MAGIC(2)
                    DEF_RANGE(4)
                    Bonuses.Bonus.STRENGTH(4)
                }
            }
        }

        // Black gloves (id: 7457)
        7457 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(5)
                    ATT_SLASH(5)
                    ATT_CRUSH(5)
                    ATT_MAGIC(3)
                    ATT_RANGED(5)
                    DEF_STAB(5)
                    DEF_SLASH(5)
                    DEF_CRUSH(5)
                    DEF_MAGIC(3)
                    DEF_RANGE(5)
                    Bonuses.Bonus.STRENGTH(5)
                }
            }
        }

        // Mithril gloves (id: 7458)
        7458 {
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

        // Adamant gloves (id: 7459)
        7459 {
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

        // Rune gloves (id: 7460)
        7460 {
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

        // Dragon gloves (id: 7461)
        7461 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    ATT_STAB(9)
                    ATT_SLASH(9)
                    ATT_CRUSH(9)
                    ATT_MAGIC(5)
                    ATT_RANGED(9)
                    DEF_STAB(9)
                    DEF_SLASH(9)
                    DEF_CRUSH(9)
                    DEF_MAGIC(5)
                    DEF_RANGE(9)
                    Bonuses.Bonus.STRENGTH(9)
                }
            }
        }

        // Barrows gloves (id: 7462)
        7462 {
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

        // Diving apparatus (id: 7535)
        7535 {
            equipment {
                slot = EquipmentSlot.CAPE.slot
            }
        }

        // Crab claw (id: 7537)
        7537 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
                bonuses {
                    DEF_STAB(3)
                    DEF_SLASH(4)
                    DEF_CRUSH(2)
                    Bonuses.Bonus.STRENGTH(1)
                }
            }
        }

        // Crab helmet (id: 7539)
        7539 {
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

        // Red banana (id: 7572)
        7572 {
            equipment {
                slot = EquipmentSlot.SHIELD.slot
            }
        }

        // Zombie shirt (id: 7592)
        7592 {
            equipment {
                slot = EquipmentSlot.PLATE.slot
            }
        }

        // Zombie trousers (id: 7593)
        7593 {
            equipment {
                slot = EquipmentSlot.LEGS.slot
            }
        }

        // Zombie gloves (id: 7595)
        7595 {
            equipment {
                slot = EquipmentSlot.HANDS.slot
            }
        }

        // Zombie boots (id: 7596)
        7596 {
            equipment {
                slot = EquipmentSlot.BOOTS.slot
            }
        }

        // Silvthrill rod (id: 7637)
        7637 {
            equipment {
                slot = EquipmentSlot.WEAPON.slot
                weapon {
                    attackSpeed = 4 // cache had no speed; default
                }
            }
        }

        // Rod of ivandis (10) (id: 7639)
        7639 {
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

    }
}
