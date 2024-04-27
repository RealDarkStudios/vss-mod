package us.randos.very_serious_steven.itemgroups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import us.randos.very_serious_steven.VerySeriousStevenConstants;
import us.randos.very_serious_steven.item.ItemInit;

public class ItemGroupInit {
    public static final ItemGroup ALL = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VerySeriousStevenConstants.VERY_SERIOUS_MOD_ID_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER, "very_serious_steven_tab"),
            FabricItemGroup.builder().displayName(Text.translatable("tab.very_serious_steven.very_serious_steven_tab"))
                    .icon(() -> new ItemStack(ItemInit.MASK_OF_SERIOUSNESS)).entries((displayContext, entries) -> {
                        entries.add(ItemInit.MASK_OF_SERIOUSNESS);
                    }).build());

    public static void registerVerySeriousStevenItemGroups() {
        VerySeriousStevenConstants.LOGGER.info(VerySeriousStevenConstants.VERY_SERIOUS_MOD_NAME_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER + " has registered its' itemgroups in the fabric env.");
    }

}
