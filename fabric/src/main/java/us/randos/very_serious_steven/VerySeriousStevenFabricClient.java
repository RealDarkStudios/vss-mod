package us.randos.very_serious_steven;

import net.fabricmc.api.ClientModInitializer;

public class VerySeriousStevenFabricClient implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        
        // This method is invoked by the Fabric mod loader in the client env when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        VerySeriousStevenConstants.LOGGER.info(VerySeriousStevenConstants.VERY_SERIOUS_MOD_NAME_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER + " has registered its' client class in the fabric env.");
        VerySeriousStevenCommonClient.init();
    }
}
