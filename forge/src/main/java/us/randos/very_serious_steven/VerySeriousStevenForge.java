package us.randos.very_serious_steven;

import eu.midnightdust.lib.config.MidnightConfig;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import us.randos.very_serious_steven.config.VerySeriousConfigForge;
import us.randos.very_serious_steven.siepertArea.registration.SiepertBlockItems;
import us.randos.very_serious_steven.siepertArea.registration.SiepertBlocks;
import us.randos.very_serious_steven.siepertArea.registration.SiepertItems;

// TODO: Any of the Forge contributors, please port the Mask Of Seriousness to Forge side, use Curios API as a replacement for Trinkets, Pekhui also works the same both sides.
@Mod(VerySeriousStevenConstants.VERY_SERIOUS_MOD_ID_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER)
public class VerySeriousStevenForge {
    
    public VerySeriousStevenForge() {
        VerySeriousStevenConstants.LOGGER.info(VerySeriousStevenConstants.VERY_SERIOUS_MOD_NAME_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER + " has registered its' main class in the forge env.");
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        SiepertBlocks.register(modEventBus);
        SiepertBlockItems.register(modEventBus);
        SiepertItems.register(modEventBus);

        VerySeriousStevenCommon.init();

        MidnightConfig.init(VerySeriousStevenConstants.VERY_SERIOUS_MOD_ID_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER, VerySeriousConfigForge.class);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(SiepertBlockItems.DESTABILIZED_DIRT.get());
        }
    }
}