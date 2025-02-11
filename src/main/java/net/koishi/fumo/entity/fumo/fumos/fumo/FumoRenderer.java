package net.koishi.fumo.entity.fumo.fumos.fumo;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.resources.ResourceLocation;
import net.koishi.fumo.Fumo;
import net.koishi.fumo.entity.fumo.models.FumoEntityModel;

public class FumoRenderer extends LivingEntityRenderer<FumoEntity, FumoEntityModel<FumoEntity>> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Fumo.MODID, "textures/entity/fumo_entity.png");


    public FumoRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new FumoEntityModel<>(pContext.bakeLayer(FumoEntityModel.LAYER_LOCATION)), 0);
    }

    @Override
    protected boolean shouldShowName(FumoEntity entity) {
        return entity.hasCustomName(); // This will prevent the nameplate from showing
    }


    @Override
    public ResourceLocation getTextureLocation(FumoEntity pEntity) {
        return TEXTURE;
    }
}
