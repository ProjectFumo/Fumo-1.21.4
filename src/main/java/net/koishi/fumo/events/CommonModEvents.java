package net.koishi.fumo.events;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.koishi.fumo.Fumo;
import net.koishi.fumo.entity.fumo.fumos.alice.AliceEntity;
import net.koishi.fumo.entity.fumo.fumos.chen.ChenEntity;
import net.koishi.fumo.entity.fumo.fumos.cirno.CirnoEntity;
import net.koishi.fumo.entity.fumo.fumos.eiki.EikiEntity;
import net.koishi.fumo.entity.fumo.fumos.flan.FlandreEntity;
import net.koishi.fumo.entity.fumo.fumos.fumo.FumoEntity;
import net.koishi.fumo.entity.fumo.fumos.koishi.KoishiEntity;
import net.koishi.fumo.entity.fumo.fumos.marisa.MarisaEntity;
import net.koishi.fumo.entity.fumo.fumos.marisahat.MarisaHatEntity;
import net.koishi.fumo.entity.fumo.fumos.meiling.MeilingEntity;
import net.koishi.fumo.entity.fumo.fumos.nazrin.NazrinEntity;
import net.koishi.fumo.entity.fumo.fumos.nitori.NitoriEntity;
import net.koishi.fumo.entity.fumo.fumos.patchouli.PatchouliEntity;
import net.koishi.fumo.entity.fumo.fumos.reimu.ReimuEntity;
import net.koishi.fumo.entity.fumo.fumos.reimublue.ReimuBlueEntity;
import net.koishi.fumo.entity.fumo.fumos.sunnymilk.SunnyMilkEntity;
import net.koishi.fumo.entity.fumo.fumos.tancirno.TanCirnoEntity;
import net.koishi.fumo.entity.fumo.fumos.tewi.TewiEntity;
import net.koishi.fumo.entity.fumo.fumos.youmu.YoumuEntity;
import net.koishi.fumo.entity.fumo.fumos.yuyuko.YuyukoEntity;
import net.koishi.fumo.init.ModEntitiesInit;

@Mod.EventBusSubscriber(modid = Fumo.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonModEvents {
    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntitiesInit.FUMO_ENTITY.get(), FumoEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.ALICE_ENTITY.get(), AliceEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.CHEN_ENTITY.get(), ChenEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.CIRNO_ENTITY.get(), CirnoEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.EIKI_ENTITY.get(), EikiEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.FLANDRE_ENTITY.get(), FlandreEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.KOISHI_ENTITY.get(), KoishiEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.MARISA_ENTITY.get(), MarisaEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.MARISA_HAT_ENTITY.get(), MarisaHatEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.MEILING_ENTITY.get(), MeilingEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.NAZRIN_ENTITY.get(), NazrinEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.NITORI_ENTITY.get(), NitoriEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.PATCHOULI_ENTITY.get(), PatchouliEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.REIMU_ENTITY.get(), ReimuEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.REIMU_BLUE_ENTITY.get(), ReimuBlueEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.SUNNY_MILK_ENTITY.get(), SunnyMilkEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.TAN_CIRNO_ENTITY.get(), TanCirnoEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.TEWI_ENTITY.get(), TewiEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.YOUMU_ENTITY.get(), YoumuEntity.createMobAttributes().build());
        event.put(ModEntitiesInit.YUYUKO_ENTITY.get(), YuyukoEntity.createMobAttributes().build());
    }


//    @SubscribeEvent
//    public void onEvent(PlayerInteractEvent event)
//    {
//
//        if(event.getEntity() instanceof FumoEntity)
//        {
//            System.out.println("Player has interacted with the mob");
//        }
//    }
}
