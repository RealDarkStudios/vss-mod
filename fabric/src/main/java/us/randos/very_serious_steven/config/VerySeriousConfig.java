package us.randos.very_serious_steven.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class VerySeriousConfig extends MidnightConfig {
    @Comment(category = "settings", centered = true) public static Comment comment_1;
    @Entry(category = "settings") public static boolean showTooltips = true;
}
