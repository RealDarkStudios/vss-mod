package us.randos.very_serious_steven.siepertArea.registration;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import us.randos.very_serious_steven.VerySeriousStevenConstants;

public class SiepertItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VerySeriousStevenConstants.VERY_SERIOUS_MOD_ID_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER);

    public static final RegistryObject<Item> MASK_OF_SERIOUSNESS = ITEMS.register("mask_of_seriousness",
            () -> new Item(new Item.Properties())); // TODO: This should have a custom Item class using the Curios API

    public static void register(IEventBus eventBus) {
        VerySeriousStevenConstants.LOGGER.info("Registering Siepert's Items");
        ITEMS.register(eventBus);
    }
}
