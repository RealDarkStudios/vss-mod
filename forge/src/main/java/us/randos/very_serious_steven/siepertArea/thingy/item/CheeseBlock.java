package us.randos.very_serious_steven.siepertArea.thingy.item;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import us.randos.very_serious_steven.siepertArea.libraries.MyShapes;

public class CheeseBlock extends Block {
    public CheeseBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pGetter, BlockPos pPos, CollisionContext pContext) {
        return MyShapes.CHEESE_BLOCK_SHAPE;
    }
}
