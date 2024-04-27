package us.randos.very_serious_steven.siepertArea.registration;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;
import us.randos.very_serious_steven.VerySeriousStevenConstants;

public class SiepertBlocks {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, VerySeriousStevenConstants.VERY_SERIOUS_MOD_ID_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER);

    public static final RegistryObject<Block> DESTABILIZED_SHAPE = BLOCKS.register("destabilized_shape",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).noOcclusion()));

    public static void register(IEventBus eventBus) {
        LOGGER.info("Registering Siepert's Blocks");
        BLOCKS.register(eventBus);
    }
}
