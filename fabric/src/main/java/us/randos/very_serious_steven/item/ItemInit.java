package us.randos.very_serious_steven.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import us.randos.very_serious_steven.VerySeriousStevenConstants;
import us.randos.very_serious_steven.item.itemtypes.trinkets.MaskOfSeriousnessTrinket;
import us.randos.very_serious_steven.properties.PropertyInit;

public class ItemInit {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(VerySeriousStevenConstants.VERY_SERIOUS_MOD_ID_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER, name), item);
    }

    // Example item
    // public static final Item WiiU = registerItem("wiiu", new Item(PropertyInit.GENERIC_ITEM_PROPERTY_SINGLE_ITEM));
    public static final Item MASK_OF_SERIOUSNESS = registerItem("mask_of_seriousness", new MaskOfSeriousnessTrinket(PropertyInit.GENERIC_ITEM_PROPERTY_SINGLE_ITEM));

    public static void registerVerySeriousStevenItems() {
        VerySeriousStevenConstants.LOGGER.info(VerySeriousStevenConstants.VERY_SERIOUS_MOD_NAME_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER + " has registered its' items in the fabric env.");
    }

}
