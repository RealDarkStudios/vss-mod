package us.randos.very_serious_steven.siepertArea.registration;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import us.randos.very_serious_steven.VerySeriousStevenConstants;
import us.randos.very_serious_steven.siepertArea.thingy.item.CheeseItem;
import us.randos.very_serious_steven.siepertArea.thingy.item.MaskOfSeriousnessItem;

public class SiepertItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VerySeriousStevenConstants.VERY_SERIOUS_MOD_ID_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER);

    public static final RegistryObject<Item> MASK_OF_SERIOUSNESS = ITEMS.register("mask_of_seriousness",
            () -> new MaskOfSeriousnessItem(new Item.Properties())); // TODO: The custom item class should use the Curios API

    public static final RegistryObject<Item> CHEESE_SLICE = ITEMS.register("cheese_slice",
            () -> new CheeseItem(new Item.Properties().food(
                    new FoodProperties.Builder().nutrition(4).saturationMod(2)
                            .build())));

    public static void register(IEventBus eventBus) {
        VerySeriousStevenConstants.LOGGER.info("Registering Siepert's Items");
        ITEMS.register(eventBus);
    }
}
