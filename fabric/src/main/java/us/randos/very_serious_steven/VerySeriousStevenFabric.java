package us.randos.very_serious_steven;

import dev.emi.trinkets.api.client.TrinketRenderer;
import dev.emi.trinkets.api.client.TrinketRendererRegistry;

import eu.midnightdust.lib.config.MidnightConfig;

import net.fabricmc.api.ModInitializer;

import us.randos.very_serious_steven.block.BlockInit;
import us.randos.very_serious_steven.config.VerySeriousConfigFabric;
import us.randos.very_serious_steven.item.ItemInit;
import us.randos.very_serious_steven.item.itemtags.TagInit;
import us.randos.very_serious_steven.properties.PropertyInit;

public class VerySeriousStevenFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        
        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Logger and Initializing Classes
        VerySeriousStevenConstants.LOGGER.info(VerySeriousStevenConstants.VERY_SERIOUS_MOD_NAME_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER + " has registered its' main class in the fabric env.");
        VerySeriousStevenCommon.init();
        ItemInit.registerVerySeriousStevenItems();
        BlockInit.registerVerySeriousStevenBlocks();
        TagInit.registerVerySeriousStevenTags();
        PropertyInit.registerVerySeriousStevenProperties();

        // Config
        MidnightConfig.init(VerySeriousStevenConstants.VERY_SERIOUS_MOD_ID_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER, VerySeriousConfigFabric.class);

        // Trinket Render
        //TrinketRendererRegistry.registerRenderer(ItemInit.MASK_OF_SERIOUSNESS, (TrinketRenderer) ItemInit.MASK_OF_SERIOUSNESS);
    }
}
