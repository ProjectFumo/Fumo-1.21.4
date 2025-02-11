package net.koishi.fumo.entity.fumo.fumos.marisahat;

import net.koishi.fumo.entity.fumo.models.MarisaHatEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.resources.ResourceLocation;
import net.koishi.fumo.Fumo;


public class MarisaHatRenderer extends LivingEntityRenderer<MarisaHatEntity, MarisaHatEntityModel<MarisaHatEntity>> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Fumo.MODID, "textures/entity/marisa_hat_entity.png");


    public MarisaHatRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new MarisaHatEntityModel<>(pContext.bakeLayer(MarisaHatEntityModel.LAYER_LOCATION)), 0);
    }

    @Override
    protected boolean shouldShowName(MarisaHatEntity entity) {
        return entity.hasCustomName(); // This will prevent the nameplate from showing
    }


    @Override
    public ResourceLocation getTextureLocation(MarisaHatEntity pEntity) { return TEXTURE; }
}
