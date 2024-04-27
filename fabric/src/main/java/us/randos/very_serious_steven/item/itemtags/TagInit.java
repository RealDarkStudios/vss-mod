package us.randos.very_serious_steven.item.itemtags;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import us.randos.very_serious_steven.VerySeriousStevenConstants;

public class TagInit {

    //public static final TagKey<Item> ENCHANTABLE_WEAPON = TagKey.of(RegistryKeys.ITEM, new Identifier(VerySeriousStevenConstants.VERY_SERIOUS_MOD_ID_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER, "enchantable_weapon"));
    // If re-enabled, we can use this alongside some mixin stuff I know to allow our items to be enchanted - Mavity

    //LOGGER
    public static void registerVerySeriousStevenTags() {
        VerySeriousStevenConstants.LOGGER.info(VerySeriousStevenConstants.VERY_SERIOUS_MOD_NAME_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER + " has registered its' item tags in the fabric env.");
    }
}

