package us.randos.very_serious_steven.properties;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import us.randos.very_serious_steven.VerySeriousStevenConstants;

public class PropertyInit {
    public static final FabricItemSettings GENERIC_ITEM_PROPERTY = new FabricItemSettings().maxCount(64).fireproof();
    public static final FabricItemSettings GENERIC_ITEM_PROPERTY_SINGLE_ITEM = new FabricItemSettings().fireproof().maxDamage(0).maxCount(1);
    public static void registerVerySeriousStevenProperties() {
        VerySeriousStevenConstants.LOGGER.info(VerySeriousStevenConstants.VERY_SERIOUS_MOD_NAME_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER + " has registered its' properties in the fabric env.");
    }
}
