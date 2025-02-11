package net.koishi.fumo.entity.fumo.fumos.eiki;

import net.koishi.fumo.entity.fumo.models.EikiEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.resources.ResourceLocation;
import net.koishi.fumo.Fumo;

public class EikiRenderer extends LivingEntityRenderer<EikiEntity, EikiEntityModel<EikiEntity>> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Fumo.MODID, "textures/entity/eiki_entity.png");


    public EikiRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new EikiEntityModel<>(pContext.bakeLayer(EikiEntityModel.LAYER_LOCATION)), 0);
    }

    @Override
    protected boolean shouldShowName(EikiEntity entity) {
        return entity.hasCustomName(); // This will prevent the nameplate from showing
    }


    @Override
    public ResourceLocation getTextureLocation(EikiEntity pEntity) { return TEXTURE; }
}
