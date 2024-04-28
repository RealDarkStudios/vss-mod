package us.randos.very_serious_steven;

import eu.midnightdust.lib.config.MidnightConfig;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotResult;
import us.randos.very_serious_steven.config.VerySeriousConfigForge;
import us.randos.very_serious_steven.siepertArea.registration.SiepertBlockItems;
import us.randos.very_serious_steven.siepertArea.registration.SiepertBlocks;
import us.randos.very_serious_steven.siepertArea.registration.SiepertItems;

import java.util.function.Predicate;

// TODO: Add custom Item class using Curios API, and properly implement the custom Curios slot type.
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

        //curios

        CuriosApi.registerCurioPredicate(new ResourceLocation("very_serious_steven", "mask"),
                slotResult -> slotResult.stack().is(SiepertItems.MASK_OF_SERIOUSNESS.get()));
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(SiepertBlockItems.DESTABILIZED_DIRT);
            event.accept(SiepertBlockItems.CHEESE_BLOCK);
        }
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(SiepertItems.MASK_OF_SERIOUSNESS);
            event.accept(SiepertItems.CHEESE_SLICE);
        }
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(SiepertItems.MASK_OF_SERIOUSNESS);
        }
    }
}