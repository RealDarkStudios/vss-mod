package us.randos.very_serious_steven.model;

import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.LivingEntity;

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
                .cuboid(-8f, -12.0f, -4.2f, 16f, 16f, 0.1f), ModelTransform.NONE);
        return TexturedModelData.of(modelData, 64, 64);
    }
}

