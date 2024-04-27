package us.randos.very_serious_steven.siepertArea.registration;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;
import us.randos.very_serious_steven.VerySeriousStevenConstants;

public class SiepertBlockItems {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VerySeriousStevenConstants.VERY_SERIOUS_MOD_ID_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER);

    public static final RegistryObject<Item> DESTABILIZED_SHAPE = ITEMS.register("destabilized_shape",
            () -> new BlockItem(SiepertBlocks.DESTABILIZED_SHAPE.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        LOGGER.info("Registering Siepert's BlockItems");
        ITEMS.register(eventBus);
    }
}
