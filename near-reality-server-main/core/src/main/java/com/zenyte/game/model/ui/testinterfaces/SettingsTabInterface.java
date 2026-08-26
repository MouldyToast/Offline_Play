package com.zenyte.game.model.ui.testinterfaces;

import com.zenyte.game.GameInterface;
import com.zenyte.game.model.ui.Interface;
import com.zenyte.game.model.ui.PaneType;
import com.zenyte.game.model.ui.testinterfaces.advancedsettings.SettingVariables;
import com.zenyte.game.packet.PacketDispatcher;
import com.zenyte.game.util.AccessMask;
import com.zenyte.game.world.entity.player.Player;
import com.zenyte.game.world.entity.player.Setting;

import static com.zenyte.game.GameInterface.HOUSE_OPTIONS_TAB;
import static com.zenyte.game.model.ui.testinterfaces.advancedsettings.SettingsInterface.SIDE_PANELS_VARBIT_ID;

/**
 * @author Kris | 24/10/2018 12:32
 * @see <a href="https://www.rune-server.ee/members/kris/">Rune-Server profile</a>
 */
public class SettingsTabInterface extends Interface {

    @Override
    protected void attach() {
        // Rev 239 component IDs from osrs-dumps component.sym (interface 116)
        // Button-type controls (simple remap):
        put(5, "PK Skull Prevention");       // skull_prevention (unchanged)
        put(29, "Accept aid");               // acceptaid (was 72)
        put(30, "Toggle run");               // runmode (was 73)
        put(31, "House options");            // houseoptions (was 74)
        put(32, "All Settings");             // settings_open (was 75)
        put(33, "Open bond pouch");          // bondoptions (was 76)
        put(44, "Disable zooming with scroll wheel"); // mouse_zoom (was 87)
        // Dropdown-type controls (rev 239 uses dropdown UI):
        put(27, "Game Client Layout");       // display_dynamic_setting_1 (was 84)
        put(40, "Game Client Layout Options"); // display_dynamic_setting_1_buttons
        put(6, "Player attack options");     // attack_priority_player (was 81)
        put(38, "Player attack options dropdown"); // attack_priority_player_buttons
        put(7, "NPC attack options");        // attack_priority_npc (was 82)
        put(39, "NPC attack options dropdown"); // attack_priority_npc_buttons
        // Audio slider controls (rev 239 — client-script driven, server handlers are stubs):
        put(23, "Brightness");               // brightness_bobble_container (same ID)
    }

    @Override
    public void open(Player player) {
        final PacketDispatcher dispatcher = player.getPacketDispatcher();
        player.getInterfaceHandler().sendInterface(getInterface());
        // Rev 239: display mode and attack options use dropdown buttons
        dispatcher.sendComponentSettings(getInterface(), getComponent("Brightness"), 0, 21, AccessMask.CLICK_OP1);
        dispatcher.sendComponentSettings(getInterface(), getComponent("Game Client Layout Options"), 0, 3, AccessMask.CLICK_OP1);
        dispatcher.sendComponentSettings(getInterface(), getComponent("NPC attack options dropdown"), 0, 4, AccessMask.CLICK_OP1);
        dispatcher.sendComponentSettings(getInterface(), getComponent("Player attack options dropdown"), 0, 5, AccessMask.CLICK_OP1);
        // Rev 239: audio volume sliders are client-script driven — no server settings needed
    }

    @Override
    protected void build() {
        bind("PK Skull Prevention", player -> player.getVarManager().flipBit(SettingVariables.PK_SKULL_PREVENTION_VARBIT_ID));
        bind("All Settings", GameInterface.ADVANCED_SETTINGS::open);
        bind("Accept aid", player -> {
            if (player.isIronman()) {
                player.getVarManager().sendBit(SettingVariables.ACCEPT_AID_VARBIT_ID, 0);
                player.sendMessage("Ironmen cannot accept aid from other players.");
                return;
            }
            player.getVarManager().flipBit(SettingVariables.ACCEPT_AID_VARBIT_ID);
        });
        bind("Toggle run", player -> {
            player.getInterfaceHandler().closeInterfaces();
            player.setRun(!player.isRun());
        });
        bind("House options", HOUSE_OPTIONS_TAB::open);
        bind("Brightness", (player, slotId, itemId, option) -> player.getVarManager().sendVar(SettingVariables.SCREEN_BRIGHTNESS_VARP_ID, slotId * 5));
        // Rev 239: display mode uses dropdown buttons (component 40), slots 0/1/2
        bind("Game Client Layout Options", (player, slotId, itemId, option) -> {
            if (slotId == 0) {
                if (player.getInterfaceHandler().getPane() != PaneType.FIXED) {
                    player.getInterfaceHandler().sendPane(player.getInterfaceHandler().getPane(), PaneType.FIXED);
                }
            } else if (slotId == 1) {
                if (player.getInterfaceHandler().getPane() != PaneType.RESIZABLE) {
                    player.getInterfaceHandler().sendPane(player.getInterfaceHandler().getPane(), PaneType.RESIZABLE);
                    player.getVarManager().sendBitInstant(SIDE_PANELS_VARBIT_ID, 0);
                }
            } else if (slotId == 2) {
                if (player.getInterfaceHandler().getPane() != PaneType.SIDE_PANELS) {
                    player.getInterfaceHandler().sendPane(player.getInterfaceHandler().getPane(), PaneType.SIDE_PANELS);
                    player.getVarManager().sendBitInstant(SIDE_PANELS_VARBIT_ID, 1);
                }
            }
        });
        // Rev 239: attack options use dropdown buttons
        bind("Player attack options dropdown", (player, slotId, itemId, option) -> player.getVarManager().sendVar(SettingVariables.PLAYER_ATTACK_OPTIONS_VARP_ID, slotId));
        bind("NPC attack options dropdown", (player, slotId, itemId, option) -> player.getVarManager().sendVar(SettingVariables.NPC_ATTACK_OPTIONS_VARP_ID, slotId));
    }

    private void setMusicVolume(final Player player, final int volume) {
        if (volume != 0) {
            if (player.getVarManager().getValue(SettingVariables.MUSIC_VOLUME_VARP_ID) == 0) {
                player.getMusic().restartCurrent();
            }
        }
        player.getVarManager().sendVarInstant(SettingVariables.MUSIC_VOLUME_VARP_ID, volume);
    }

    private void setSoundEffectVolume(final Player player, final int volume) {
        player.getVarManager().sendVarInstant(SettingVariables.SOUND_EFFECT_VOLUME_VARP_ID, volume);
    }

    private void setAreaSoundVolume(final Player player, final int volume) {
        player.getVarManager().sendVarInstant(SettingVariables.AREA_SOUND_VOLUME_VARP_ID, volume);
    }

    @Override
    public boolean isInterruptedOnLock() {
        return false;
    }

    @Override
    public GameInterface getInterface() {
        return GameInterface.SETTINGS;
    }
}
