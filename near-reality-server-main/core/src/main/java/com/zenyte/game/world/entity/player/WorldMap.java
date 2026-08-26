package com.zenyte.game.world.entity.player;

import com.zenyte.game.model.ui.InterfacePosition;
import com.zenyte.game.model.ui.PaneType;
import com.zenyte.game.util.AccessMask;
import com.zenyte.game.world.entity.Location;

public class WorldMap {

    private final Player player;

    private PaneType previousPane;

    private boolean visible, fullScreen;

    public WorldMap(final Player player) {
        this.player = player;
    }

    /**
     * Floater component per pane. The worldmap opens as an overlay on the floater slot,
     * NOT as a modal on maincrm. Resizable seed = 18, from REV239_PANE_MAP entry 18.
     */
    private static int floaterComponent(PaneType pane) {
        switch (pane) {
            case FIXED: return 43;
            case FULL_SCREEN: return 41;
            default: return 18; // RESIZABLE, SIDE_PANELS
        }
    }

    public void updateLocation() {
        updateLocation(player.getLocation());
    }

    public void updateLocation(Location location) {
        player.getPacketDispatcher().sendClientScript(1749,
                location.getPositionHash(),
                player.getGravestone().getGravestoneLocationBitpacked());
    }

    public void close() {
        final boolean wasFullScreen = fullScreen;
        visible = false;
        fullScreen = false;
        if (wasFullScreen && player.getInterfaceHandler().getPane().equals(PaneType.FULL_SCREEN)) {
            // Close the overlay on the FULL_SCREEN floater, then switch pane back.
            player.getInterfaceHandler().closeInterfaceSpecific(
                    floaterComponent(PaneType.FULL_SCREEN), PaneType.FULL_SCREEN);
            player.getInterfaceHandler().sendPane(PaneType.FULL_SCREEN, previousPane);
        } else {
            // Close the floating overlay on the current pane's floater.
            final PaneType pane = player.getInterfaceHandler().getPane();
            player.getInterfaceHandler().closeInterfaceSpecific(floaterComponent(pane), pane);
        }
    }

    public void sendFullScreenWorldMap() {
        visible = true;
        previousPane = player.getInterfaceHandler().getPane();
        updateLocation();
        // Switch to FULL_SCREEN pane, then open overlay on its floater.
        player.getInterfaceHandler().sendPane(previousPane, PaneType.FULL_SCREEN);
        final int comp = floaterComponent(PaneType.FULL_SCREEN);
        player.getInterfaceHandler().sendInterface(595, comp, PaneType.FULL_SCREEN, true);
        player.getPacketDispatcher().sendComponentSettings(595, 21, 0, 4, AccessMask.CLICK_OP1);
    }

    public void sendFloatingWorldMap() {
        visible = true;
        updateLocation();
        // Open as overlay on the current pane's floater — NOT as modal on maincrm.
        final PaneType pane = player.getInterfaceHandler().getPane();
        final int comp = floaterComponent(pane);
        player.getInterfaceHandler().sendInterface(595, comp, pane, true);
        player.getPacketDispatcher().sendComponentSettings(595, 21, 0, 4, AccessMask.CLICK_OP1);
    }

    public PaneType getPreviousPane() {
        return previousPane;
    }

    public void setPreviousPane(PaneType previousPane) {
        this.previousPane = previousPane;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isFullScreen() {
        return fullScreen;
    }

    public void setFullScreen(boolean fullScreen) {
        this.fullScreen = fullScreen;
    }

}
