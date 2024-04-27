package us.randos.very_serious_steven.item.itemtypes.trinkets;

import com.google.common.collect.Multimap;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import dev.emi.trinkets.api.client.TrinketRenderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import org.jetbrains.annotations.Nullable;

import us.randos.very_serious_steven.VerySeriousStevenConstants;
import us.randos.very_serious_steven.config.VerySeriousConfigFabric;
import us.randos.very_serious_steven.model.MOSModel;

import java.util.List;
import java.util.UUID;

// TODO: Copy over Pekhui code then decide what to make it do, also check that the tooltip renders with EnvType.CLIENT
public class MaskOfSeriousnessTrinket extends TrinketItem implements TrinketRenderer {
    private static final Identifier TEXTURE = new Identifier(VerySeriousStevenConstants.VERY_SERIOUS_MOD_ID_FOR_THE_COOLEST_MOD_IN_EXISTENCE_NAMED_VERY_SERIOUS_STEVEN_MOD_FOR_THE_KAUPENHUB_SERVER, "textures/item/trinkets/mos.png");
    private BipedEntityModel<LivingEntity> model;
    public MaskOfSeriousnessTrinket(Settings settings) {
        super(settings);
    }
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        //modifiers.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(uuid, "very_serious_steven:attack_modifier", 2.0, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        return modifiers;
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        /*
        if(!entity.hasStatusEffect(StatusEffects.WITHER)) {
            ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 20 * 10, 0));
        }
        ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 5, 2));
        ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 5, 2));
        ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, 20 * 5, 2));
        ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20 * 5, 2));
        ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 20 * 5, 2));
        */
    }


    @Environment(EnvType.CLIENT)
    @Override
    public void render(ItemStack stack, SlotReference slotReference, EntityModel<? extends LivingEntity> contextModel, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, LivingEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        BipedEntityModel<LivingEntity> model = this.getModel();
        model.setAngles(entity, limbAngle, limbDistance, animationProgress, animationProgress, headPitch);
        model.animateModel(entity, limbAngle, limbDistance, tickDelta);
        TrinketRenderer.followBodyRotations(entity, model);
        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(model.getLayer(TEXTURE));
        model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, 1, 1, 1, 1);
    }
    @Environment(EnvType.CLIENT)
    private BipedEntityModel<LivingEntity> getModel() {
        if (this.model == null) {
            // Vanilla 1.17 uses EntityModels, EntityModelLoader and EntityModelLayers
            this.model = new MOSModel(MOSModel.getTexturedModelData().createModel());
        }

        return this.model;
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext options) {
        if (VerySeriousConfigFabric.showTooltips == true) {
            tooltip.add(Text.translatable("tooltip.very_serious_steven.mask_of_seriousness_trinket_one"));
            tooltip.add(Text.translatable("tooltip.very_serious_steven.mask_of_seriousness_trinket_two"));
            tooltip.add(Text.translatable("tooltip.very_serious_steven.mask_of_seriousness_trinket_three"));
            super.appendTooltip(stack, world, tooltip, options);
        }
    }
}