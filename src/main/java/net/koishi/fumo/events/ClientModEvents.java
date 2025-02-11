package net.koishi.fumo.events;

import net.koishi.fumo.entity.fumo.models.EikiEntityModel;
import net.koishi.fumo.entity.fumo.models.MarisaHatEntityModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.koishi.fumo.Fumo;
import net.koishi.fumo.entity.fumo.fumos.alice.AliceRenderer;
import net.koishi.fumo.entity.fumo.fumos.chen.ChenRenderer;
import net.koishi.fumo.entity.fumo.fumos.cirno.CirnoRenderer;
import net.koishi.fumo.entity.fumo.fumos.eiki.EikiRenderer;
import net.koishi.fumo.entity.fumo.fumos.fumo.FumoRenderer;
import net.koishi.fumo.entity.fumo.fumos.flan.FlandreRenderer;
import net.koishi.fumo.entity.fumo.models.FumoEntityModel;
import net.koishi.fumo.entity.fumo.fumos.koishi.KoishiRenderer;
import net.koishi.fumo.entity.fumo.fumos.marisa.MarisaRenderer;
import net.koishi.fumo.entity.fumo.fumos.marisahat.MarisaHatRenderer;
import net.koishi.fumo.entity.fumo.fumos.meiling.MeilingRenderer;
import net.koishi.fumo.entity.fumo.fumos.nazrin.NazrinRenderer;
import net.koishi.fumo.entity.fumo.fumos.nitori.NitoriRenderer;
import net.koishi.fumo.entity.fumo.fumos.patchouli.PatchouliRenderer;
import net.koishi.fumo.entity.fumo.fumos.reimu.ReimuRenderer;
import net.koishi.fumo.entity.fumo.fumos.reimublue.ReimuBlueRenderer;
import net.koishi.fumo.entity.fumo.fumos.sunnymilk.SunnyMilkRenderer;
import net.koishi.fumo.entity.fumo.fumos.tancirno.TanCirnoRenderer;
import net.koishi.fumo.entity.fumo.fumos.tewi.TewiRenderer;
import net.koishi.fumo.entity.fumo.fumos.youmu.YoumuRenderer;
import net.koishi.fumo.entity.fumo.fumos.yuyuko.YuyukoRenderer;
import net.koishi.fumo.init.ModEntitiesInit;

@Mod.EventBusSubscriber(modid = Fumo.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(ModEntitiesInit.FUMO_ENTITY.get(), FumoRenderer::new);

        event.registerEntityRenderer(ModEntitiesInit.ALICE_ENTITY.get(), AliceRenderer::new);
        event.registerEntityRenderer(ModEntitiesInit.CHEN_ENTITY.get(), ChenRenderer::new);
        event.registerEntityRenderer(ModEntitiesInit.CIRNO_ENTITY.get(), CirnoRenderer::new);
        event.registerEntityRenderer(ModEntitiesInit.EIKI_ENTITY.get(), EikiRenderer::new);
        event.registerEntityRenderer(ModEntitiesInit.FLANDRE_ENTITY.get(), FlandreRenderer::new);
        event.registerEntityRenderer(ModEntitiesInit.KOISHI_ENTITY.get(), KoishiRenderer::new);
        event.registerEntityRenderer(ModEntitiesInit.MARISA_ENTITY.get(), MarisaRenderer::new);
        event.registerEntityRenderer(ModEntitiesInit.MARISA_HAT_ENTITY.get(), MarisaHatRenderer::new);
        event.registerEntityRenderer(ModEntitiesInit.MEILING_ENTITY.get(), MeilingRenderer::new);
        event.registerEntityRenderer(ModEntitiesInit.NAZRIN_ENTITY.get(), NazrinRenderer::new);
        event.registerEntityRenderer(ModEntitiesInit.NITORI_ENTITY.get(), NitoriRenderer::new);
        event.registerEntityRenderer(ModEntitiesInit.PATCHOULI_ENTITY.get(), PatchouliRenderer::new);
        event.registerEntityRenderer(ModEntitiesInit.REIMU_ENTITY.get(), ReimuRenderer::new);
        event.registerEntityRenderer(ModEntitiesInit.REIMU_BLUE_ENTITY.get(), ReimuBlueRenderer::new);
        event.registerEntityRenderer(ModEntitiesInit.SUNNY_MILK_ENTITY.get(), SunnyMilkRenderer::new);
        event.registerEntityRenderer(ModEntitiesInit.TAN_CIRNO_ENTITY.get(), TanCirnoRenderer::new);
        event.registerEntityRenderer(ModEntitiesInit.TEWI_ENTITY.get(), TewiRenderer::new);
        event.registerEntityRenderer(ModEntitiesInit.YOUMU_ENTITY.get(), YoumuRenderer::new);
        event.registerEntityRenderer(ModEntitiesInit.YUYUKO_ENTITY.get(), YuyukoRenderer::new);
    }


    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(FumoEntityModel.LAYER_LOCATION, FumoEntityModel::createBodyLayer);
        event.registerLayerDefinition(EikiEntityModel.LAYER_LOCATION, EikiEntityModel::createBodyLayer);
        event.registerLayerDefinition(MarisaHatEntityModel.LAYER_LOCATION, MarisaHatEntityModel::createBodyLayer);
    }
}
