package us.randos.very_serious_steven.siepertArea.thingy.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Random;

public class CheeseItem extends Item {
    Random random = new Random();
    public CheeseItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        if (random.nextInt(100) == 0) pLevel.explode(null,
                pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), 5f, Level.ExplosionInteraction.TNT);
        return super.use(pLevel, pPlayer, pHand);
    }
}
