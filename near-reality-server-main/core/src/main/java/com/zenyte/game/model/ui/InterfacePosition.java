package com.zenyte.game.model.ui;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;

/**
 * @author Tommeh | 28 jan. 2018 : 23:38:10 | @author Kris | 22. sept 2018 : 20:34:02
 * @see <a href="https://www.rune-server.ee/members/tommeh/">Rune-Server profile</a>
 * @see <a href="https://www.rune-server.ee/members/kris/">Rune-Server profile</a>
 * @see <a href="https://rune-status.net/members/kris.354/">Rune-Status profile</a>
 */
public enum InterfacePosition {
	CHATBOX(96, 162, true),
	PRIVATE_CHAT(93, 163, true),
	WILDERNESS_OVERLAY(3, true),
	BH_OVERLAY(5, true),
	ORBS(33, true),
	SKILLS_TAB(77, 320, true),
	JOURNAL_TAB_HEADER(78, 629, true),
	CHAT_TAB_HEADER(83, true),
	INVENTORY_TAB(79, 149, true),
	EQUIPMENT_TAB(80, 387, true),
	PRAYER_TAB(81, 541, true),
	SPELLBOOK_TAB(82, 218, true),
	ACCOUNT_MANAGEMENT(84, 1702, true),
	FRIENDS_TAB(85, 429, true),
	LOGOUT_TAB(86, 182, true),
	SETTINGS_TAB(87, 116, true),
	EMOTE_TAB(88, 216, true),
	MUSIC_TAB(89, 239, true),
	COMBAT_TAB(76, 593, true),
	CENTRAL(16, false),
	DIALOGUE(567, false),
	MINIGAME_OVERLAY(8, true),
	OVERLAY(1, true),
	SINGLE_TAB(75, false),
	WORLD_MAP(17, false),
	UNKNOWN_OVERLAY(8, true),
	XP_TRACKER(9, true),
	// Special type, parent = adv. settings
	COLOUR_PICKER(8, false),
	NOTIFICATION_POS(13, true),
	HP_HUD_POS(2, -1, true),
	TOA_MANAGEMENT(61, false),
	NIGHTMARE_TOTEMS_POS(12, -1, true),
	;
	/**
	 * An array containing all of the component types.
	 */
	public static final InterfacePosition[] VALUES = values();

	/**
	 * Gets the component pairs when moving from one game pane to another.
	 * 
	 * @param fromPane
	 *            the pane we're moving from.
	 * @param toPane
	 *            the pane we're moving to.
	 * @return a primitive int map containing all the pairs.
	 */
	public static Int2IntOpenHashMap getPairs(final PaneType fromPane, final PaneType toPane) {
		final Int2IntOpenHashMap pairs = new Int2IntOpenHashMap(VALUES.length);
		for (final InterfacePosition position : VALUES) {
			if (position.equals(DIALOGUE)) {
				continue;
			}
			final int from = position.getComponent(fromPane);
			final int to = position.getComponent(toPane);
			if (from != -1 && to != -1) {
				pairs.put(from, to);
			}
		}
		return pairs;
	}

	/**
	 * Gets the component type for the respective component id and pane.
	 * 
	 * @param componentId
	 *            the resizable component id.
	 * @param pane
	 *            the pane to search.
	 * @return the respective component type, or null if not found.
	 */
	public static InterfacePosition getPosition(final int componentId, final PaneType pane) {
		for (final InterfacePosition position : VALUES) {
			if (position.getComponent(pane) == componentId) {
				return position;
			}
		}
		return null;
	}

	private final int resizableComponent;
	private final int gameframeInterfaceId;
	private final boolean walkable;

	InterfacePosition(final int resizableComponent, final boolean walkable) {
		this(resizableComponent, -1, walkable);
	}

	/**
	 * Constructs the component types with the seed component of resizable, used to search the other types.
	 * 
	 * @param resizableComponent
	 *            the resizable component id, used as a seed.
	 * @param walkable
	 *            whether the component is walkable or not.
	 */
	InterfacePosition(final int resizableComponent, final int gameframeInterfaceId, final boolean walkable) {
		this.resizableComponent = resizableComponent;
		this.gameframeInterfaceId = gameframeInterfaceId;
		this.walkable = walkable;
	}

	/**
	 * Rev-239 hardcoded component mappings, replacing the stale NR cache enum lookup.
	 * Key = resizable (161) component ID.
	 * Value = { FIXED(548), SIDE_PANELS(164), FULL_SCREEN(165) } component IDs.
	 * -1 means the component does not exist on that pane (falls back to seed).
	 * Source: MouldyToast/osrs-dumps rev-239 enums 1129, 1131, 1132 + component.sym
	 */
	private static final java.util.Map<Integer, int[]> REV239_PANE_MAP = new java.util.HashMap<>();
	static {
		// Index: 0 = FIXED(548), 1 = SIDE_PANELS(164), 2 = FULL_SCREEN(165)
		REV239_PANE_MAP.put(  1, new int[]{ 27,  1,  9}); // overlay_atmosphere
		REV239_PANE_MAP.put(  2, new int[]{ 28,  2, 10}); // hpbar_hud
		REV239_PANE_MAP.put(  3, new int[]{ 29,  3, 32}); // pvp_icons
		REV239_PANE_MAP.put(  4, new int[]{ 30,  4,  3}); // helper
		REV239_PANE_MAP.put(  5, new int[]{ 31,  5,  6}); // stat_boosts_hud
		REV239_PANE_MAP.put(  6, new int[]{ 32,  6,  7}); // buff_bar
		REV239_PANE_MAP.put(  8, new int[]{ 33,  8, 11}); // overlay_hud
		REV239_PANE_MAP.put(  9, new int[]{ 34,  9, 12}); // xp_drops
		REV239_PANE_MAP.put( 10, new int[]{ 35, 10, 13}); // zeah
		REV239_PANE_MAP.put( 11, new int[]{ 38, 11,  4}); // helper_dodger
		REV239_PANE_MAP.put( 12, new int[]{ 39, 12,  5}); // helper_content
		REV239_PANE_MAP.put( 13, new int[]{ 44, 13,  8}); // notifications
		REV239_PANE_MAP.put( 16, new int[]{ 41, 16, 14}); // mainmodal
		REV239_PANE_MAP.put( 17, new int[]{ 42, 17, 15}); // maincrm
		REV239_PANE_MAP.put( 18, new int[]{ 43, 18, 41}); // floater
		REV239_PANE_MAP.put( 19, new int[]{ 45, 19, -1}); // debug
		REV239_PANE_MAP.put( 20, new int[]{ 37, 20, -1}); // multiway_icon
		REV239_PANE_MAP.put( 21, new int[]{ 40, 21, -1}); // gravestone
		REV239_PANE_MAP.put( 30, new int[]{ 22, 30, -1}); // minimap
		REV239_PANE_MAP.put( 31, new int[]{ 24, 31, -1}); // compassclick
		REV239_PANE_MAP.put( 33, new int[]{ 25, 33, 34}); // orbs
		REV239_PANE_MAP.put( 34, new int[]{  2, 66,  0}); // gameframe
		REV239_PANE_MAP.put( 35, new int[]{  3, 67, 42}); // popout
		REV239_PANE_MAP.put( 36, new int[]{  4, 68, 35}); // tli_listener
		REV239_PANE_MAP.put( 37, new int[]{  5, 69, 36}); // mouseover
		REV239_PANE_MAP.put( 38, new int[]{ -1, 70, -1}); // side_background
		REV239_PANE_MAP.put( 42, new int[]{ 47, 51, -1}); // side_bottom
		REV239_PANE_MAP.put( 43, new int[]{ 48, 38, -1}); // stone7
		REV239_PANE_MAP.put( 44, new int[]{ 49, 39, -1}); // stone8
		REV239_PANE_MAP.put( 45, new int[]{ 50, 40, -1}); // stone9
		REV239_PANE_MAP.put( 46, new int[]{ 51, 34, -1}); // stone10
		REV239_PANE_MAP.put( 47, new int[]{ 52, 41, -1}); // stone11
		REV239_PANE_MAP.put( 48, new int[]{ 53, 42, -1}); // stone12
		REV239_PANE_MAP.put( 49, new int[]{ 54, 43, -1}); // stone13
		REV239_PANE_MAP.put( 50, new int[]{ 55, 44, -1}); // icon7
		REV239_PANE_MAP.put( 51, new int[]{ 56, 45, -1}); // icon8
		REV239_PANE_MAP.put( 52, new int[]{ 57, 46, -1}); // icon9
		REV239_PANE_MAP.put( 53, new int[]{ 58, 35, -1}); // icon10
		REV239_PANE_MAP.put( 54, new int[]{ 59, 47, -1}); // icon11
		REV239_PANE_MAP.put( 55, new int[]{ 60, 48, -1}); // icon12
		REV239_PANE_MAP.put( 56, new int[]{ 61, 49, -1}); // icon13
		REV239_PANE_MAP.put( 58, new int[]{ 63, 37, -1}); // side_top
		REV239_PANE_MAP.put( 59, new int[]{ 64, 52, -1}); // stone0
		REV239_PANE_MAP.put( 60, new int[]{ 65, 53, -1}); // stone1
		REV239_PANE_MAP.put( 61, new int[]{ 66, 54, -1}); // stone2
		REV239_PANE_MAP.put( 62, new int[]{ 67, 55, -1}); // stone3
		REV239_PANE_MAP.put( 63, new int[]{ 68, 56, -1}); // stone4
		REV239_PANE_MAP.put( 64, new int[]{ 69, 57, -1}); // stone5
		REV239_PANE_MAP.put( 65, new int[]{ 70, 58, -1}); // stone6
		REV239_PANE_MAP.put( 66, new int[]{ 71, 59, -1}); // icon0
		REV239_PANE_MAP.put( 67, new int[]{ 72, 60, -1}); // icon1
		REV239_PANE_MAP.put( 68, new int[]{ 73, 61, -1}); // icon2
		REV239_PANE_MAP.put( 69, new int[]{ 74, 62, -1}); // icon3
		REV239_PANE_MAP.put( 70, new int[]{ 75, 63, -1}); // icon4
		REV239_PANE_MAP.put( 71, new int[]{ 76, 64, -1}); // icon5
		REV239_PANE_MAP.put( 72, new int[]{ 77, 65, -1}); // icon6
		REV239_PANE_MAP.put( 74, new int[]{ 79, 71, 16}); // sidemodal
		REV239_PANE_MAP.put( 75, new int[]{ 80, 72, -1}); // side_panels
		REV239_PANE_MAP.put( 76, new int[]{ 81, 73, 17}); // side0
		REV239_PANE_MAP.put( 77, new int[]{ 82, 74, 18}); // side1
		REV239_PANE_MAP.put( 78, new int[]{ 83, 75, 19}); // side2
		REV239_PANE_MAP.put( 79, new int[]{ 84, 76, 20}); // side3
		REV239_PANE_MAP.put( 80, new int[]{ 85, 77, 21}); // side4
		REV239_PANE_MAP.put( 81, new int[]{ 86, 78, 22}); // side5
		REV239_PANE_MAP.put( 82, new int[]{ 87, 79, 23}); // side6
		REV239_PANE_MAP.put( 83, new int[]{ 88, 80, 24}); // side7
		REV239_PANE_MAP.put( 84, new int[]{ 89, 81, 25}); // side8
		REV239_PANE_MAP.put( 85, new int[]{ 90, 82, 26}); // side9
		REV239_PANE_MAP.put( 86, new int[]{ 91, 83, 27}); // side10
		REV239_PANE_MAP.put( 87, new int[]{ 92, 84, 28}); // side11
		REV239_PANE_MAP.put( 88, new int[]{ 93, 85, 29}); // side12
		REV239_PANE_MAP.put( 89, new int[]{ 94, 86, 30}); // side13
		REV239_PANE_MAP.put( 90, new int[]{ 95, 87, 31}); // sidecrm
		REV239_PANE_MAP.put( 93, new int[]{ 36, 90, 33}); // pm_container
		REV239_PANE_MAP.put( 96, new int[]{ 11, 93,  2}); // chat_container
		REV239_PANE_MAP.put( 98, new int[]{  6, 97, 37}); // ui_highlights
	}

	/**
	 * Rev-239 mobile component mappings, replacing the stale NR cache enum 1745 lookup.
	 * Key = resizable (161) component ID.
	 * Value = mobile (601) component ID.
	 * Source: MouldyToast/osrs-dumps rev-239 enum 1745 + component.sym
	 */
	private static final java.util.Map<Integer, Integer> REV239_MOBILE_MAP = new java.util.HashMap<>();
	static {
		REV239_MOBILE_MAP.put(  1,   4); // overlay_atmosphere
		REV239_MOBILE_MAP.put(  2,   5); // hpbar_hud
		REV239_MOBILE_MAP.put(  3,   6); // pvp_icons
		REV239_MOBILE_MAP.put(  4,   9); // helper
		REV239_MOBILE_MAP.put(  5,  13); // stat_boosts_hud
		REV239_MOBILE_MAP.put(  6,  12); // buff_bar
		REV239_MOBILE_MAP.put(  7,   8); // hud_container_back
		REV239_MOBILE_MAP.put(  8,  14); // overlay_hud
		REV239_MOBILE_MAP.put(  9,  15); // xp_drops
		REV239_MOBILE_MAP.put( 10,  16); // zeah
		REV239_MOBILE_MAP.put( 11,  10); // helper_dodger
		REV239_MOBILE_MAP.put( 12,  11); // helper_content
		REV239_MOBILE_MAP.put( 13,  17); // notifications
		REV239_MOBILE_MAP.put( 14,  18); // mainmodal_backgrounds
		REV239_MOBILE_MAP.put( 15,  26); // hud_container_front
		REV239_MOBILE_MAP.put( 16,  27); // mainmodal
		REV239_MOBILE_MAP.put( 17,  28); // maincrm
		REV239_MOBILE_MAP.put( 18,  29); // floater
		REV239_MOBILE_MAP.put( 19,  30); // debug
		REV239_MOBILE_MAP.put( 20,  24); // multiway_icon
		REV239_MOBILE_MAP.put( 21,  25); // gravestone
		REV239_MOBILE_MAP.put( 30,  34); // minimap
		REV239_MOBILE_MAP.put( 31,  35); // compassclick
		REV239_MOBILE_MAP.put( 33,  37); // orbs
		REV239_MOBILE_MAP.put( 34,  20); // gameframe
		REV239_MOBILE_MAP.put( 35, 131); // popout
		REV239_MOBILE_MAP.put( 36, 133); // tli_listener
		REV239_MOBILE_MAP.put( 37, 132); // mouseover
		REV239_MOBILE_MAP.put( 38, 113); // side_background
		REV239_MOBILE_MAP.put( 42,  70); // side_bottom
		REV239_MOBILE_MAP.put( 43,  74); // stone7
		REV239_MOBILE_MAP.put( 44,  76); // stone8
		REV239_MOBILE_MAP.put( 45,  75); // stone9
		REV239_MOBILE_MAP.put( 46,  44); // stone10
		REV239_MOBILE_MAP.put( 47,  77); // stone11
		REV239_MOBILE_MAP.put( 48,  72); // stone12
		REV239_MOBILE_MAP.put( 49,  73); // stone13
		REV239_MOBILE_MAP.put( 50,  81); // icon7
		REV239_MOBILE_MAP.put( 51,  83); // icon8
		REV239_MOBILE_MAP.put( 52,  82); // icon9
		REV239_MOBILE_MAP.put( 53,  45); // icon10
		REV239_MOBILE_MAP.put( 54,  84); // icon11
		REV239_MOBILE_MAP.put( 55,  79); // icon12
		REV239_MOBILE_MAP.put( 56,  80); // icon13
		REV239_MOBILE_MAP.put( 58,  96); // side_top
		REV239_MOBILE_MAP.put( 59, 101); // stone0
		REV239_MOBILE_MAP.put( 60,  71); // stone1
		REV239_MOBILE_MAP.put( 61, 102); // stone2
		REV239_MOBILE_MAP.put( 62,  97); // stone3
		REV239_MOBILE_MAP.put( 63,  98); // stone4
		REV239_MOBILE_MAP.put( 64,  99); // stone5
		REV239_MOBILE_MAP.put( 65, 100); // stone6
		REV239_MOBILE_MAP.put( 66, 108); // icon0
		REV239_MOBILE_MAP.put( 67,  78); // icon1
		REV239_MOBILE_MAP.put( 68, 109); // icon2
		REV239_MOBILE_MAP.put( 69, 104); // icon3
		REV239_MOBILE_MAP.put( 70, 105); // icon4
		REV239_MOBILE_MAP.put( 71, 106); // icon5
		REV239_MOBILE_MAP.put( 72, 107); // icon6
		REV239_MOBILE_MAP.put( 74, 114); // sidemodal
		REV239_MOBILE_MAP.put( 75, 115); // side_panels
		REV239_MOBILE_MAP.put( 76, 116); // side0
		REV239_MOBILE_MAP.put( 77, 117); // side1
		REV239_MOBILE_MAP.put( 78, 118); // side2
		REV239_MOBILE_MAP.put( 79, 119); // side3
		REV239_MOBILE_MAP.put( 80, 120); // side4
		REV239_MOBILE_MAP.put( 81, 121); // side5
		REV239_MOBILE_MAP.put( 82, 122); // side6
		REV239_MOBILE_MAP.put( 83, 123); // side7
		REV239_MOBILE_MAP.put( 84, 124); // side8
		REV239_MOBILE_MAP.put( 85, 125); // side9
		REV239_MOBILE_MAP.put( 86, 126); // side10
		REV239_MOBILE_MAP.put( 87, 127); // side11
		REV239_MOBILE_MAP.put( 88, 128); // side12
		REV239_MOBILE_MAP.put( 89, 129); // side13
		REV239_MOBILE_MAP.put( 90, 130); // sidecrm
		REV239_MOBILE_MAP.put( 92,   3); // viewport_tracker_back
		REV239_MOBILE_MAP.put( 93,  21); // pm_container
		REV239_MOBILE_MAP.put( 94,  23); // viewport_tracker_front
		REV239_MOBILE_MAP.put( 95,  22); // map_container
		REV239_MOBILE_MAP.put( 96,  49); // chat_container
		REV239_MOBILE_MAP.put( 98, 134); // ui_highlights
	}

	/**
	 * Gets the component id for the respective pane based on the resizable type.
	 * Uses hardcoded rev-239 mappings instead of NR's stale cache enum lookup.
	 *
	 * @param pane
	 *            the pane to seek.
	 * @return the component id
	 */
	public final int getComponent(final PaneType pane) {
		if (pane == null) {
			return -1;
		} else if (pane == PaneType.RESIZABLE || pane == PaneType.TOA_MANAGEMENT) {
			return resizableComponent;
		}
		final int[] mapping = REV239_PANE_MAP.get(resizableComponent);
		if (mapping != null) {
			final int idx;
			switch (pane) {
				case FIXED:       idx = 0; break;
				case SIDE_PANELS: idx = 1; break;
				case FULL_SCREEN: idx = 2; break;
				default: return resizableComponent;
			}
			return mapping[idx] == -1 ? resizableComponent : mapping[idx];
		}
		// Unmapped components (NR-custom) — return seed as-is
		return resizableComponent;
	}

	/**
	 * Gets the fixed component based on the resizable one.
	 * 
	 * @return the fixed component's id.
	 */
	public final int getFixedComponent() {
		return getComponent(PaneType.FIXED);
	}

	/**
	 * Gets the fullscreen component based on the resizable one.
	 * 
	 * @return the fullscreen component's id.
	 */
	public final int getFullScreenComponent() {
		return getComponent(PaneType.FULL_SCREEN);
	}

	/**
	 * Gets the mobile component based on the resizable one.
	 * 
	 * @return the mobile component's id.
	 */
	public final int getMobileComponent() {
		final Integer mapped = REV239_MOBILE_MAP.get(resizableComponent);
		return mapped != null ? mapped : resizableComponent;
	}

	/**
	 * Gets the sidepanels component based on the resizable one.
	 *
	 * @return the sidepanels component's id.
	 */
	public final int getSidepanelsComponent() {
		return getComponent(PaneType.SIDE_PANELS);
	}

	public int getResizableComponent() {
		return resizableComponent;
	}

	public int getGameframeInterfaceId() {
		return gameframeInterfaceId;
	}

	public boolean isWalkable() {
		return walkable;
	}
}
