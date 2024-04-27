package us.randos.very_serious_steven;

import eu.midnightdust.lib.config.MidnightConfig;
import net.minecraftforge.fml.common.Mod;
import us.randos.very_serious_steven.config.VerySeriousConfigForge;

// TODO: Any of the Forge contributors, please port the Mask Of Seriousness to Forge side, use Curios API as a replacement for Trinkets, Pekhui also works the same both sides.
@Mod(VerySeriousStevenConstants.VERY_SERIOUS_MOD_ID_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER)
public class VerySeriousStevenForge {
    
    public VerySeriousStevenForge() {
    
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        VerySeriousStevenConstants.LOGGER.info(VerySeriousStevenConstants.VERY_SERIOUS_MOD_NAME_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER + " has registered its' main class in the forge env.");
        VerySeriousStevenCommon.init();
        // Config
        MidnightConfig.init(VerySeriousStevenConstants.VERY_SERIOUS_MOD_ID_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER, VerySeriousConfigForge.class);
    }
}