package net.koishi.fumo.entity.fumo.fumos.tancirno;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.koishi.fumo.Fumo;
import net.koishi.fumo.entity.fumo.fumos.fumo.FumoEntity;
import net.koishi.fumo.entity.fumo.fumos.fumo.FumoRenderer;

public class TanCirnoRenderer extends FumoRenderer {
    public TanCirnoRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public ResourceLocation getTextureLocation(FumoEntity pEntity) {
        return new ResourceLocation(Fumo.MODID, "textures/entity/tan_cirno_entity.png");
    }
}
