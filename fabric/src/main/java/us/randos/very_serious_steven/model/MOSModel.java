package us.randos.very_serious_steven.model;

import com.google.common.collect.Multimap;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import dev.emi.trinkets.api.client.TrinketRenderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.model.*;
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

import java.util.List;
import java.util.UUID;

public class MOSModel extends BipedEntityModel<LivingEntity> {
    public MOSModel(ModelPart root) {
        super(root);
        this.setVisible(false);
        this.head.visible = true;
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = BipedEntityModel.getModelData(Dilation.NONE, 0f);
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(64, 64)
                .cuboid(-8f, -12.5f, -4.2f, 16f, 16f, 0.1f), ModelTransform.NONE);
        return TexturedModelData.of(modelData, 64, 64);
    }
}

