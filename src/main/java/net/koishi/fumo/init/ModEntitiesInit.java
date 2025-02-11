package net.koishi.fumo.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
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

public class ModEntitiesInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Fumo.MODID);

    public static final RegistryObject<EntityType<FumoEntity>> FUMO_ENTITY = ENTITIES.register("fumo_entity",
            () -> EntityType.Builder.<FumoEntity>of(FumoEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "fumo_entity").toString())
    );


    public static final RegistryObject<EntityType<AliceEntity>> ALICE_ENTITY = ENTITIES.register("alice_entity",
            () -> EntityType.Builder.<AliceEntity>of(AliceEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "alice_entity").toString())
    );


    public static final RegistryObject<EntityType<ChenEntity>> CHEN_ENTITY = ENTITIES.register("chen_entity",
            () -> EntityType.Builder.<ChenEntity>of(ChenEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "chen_entity").toString())
    );


    public static final RegistryObject<EntityType<CirnoEntity>> CIRNO_ENTITY = ENTITIES.register("cirno_entity",
            () -> EntityType.Builder.<CirnoEntity>of(CirnoEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "cirno_entity").toString())
    );


    public static final RegistryObject<EntityType<EikiEntity>> EIKI_ENTITY = ENTITIES.register("eiki_entity",
            () -> EntityType.Builder.<EikiEntity>of(EikiEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "eiki_entity").toString())
    );

    public static final RegistryObject<EntityType<FlandreEntity>> FLANDRE_ENTITY = ENTITIES.register("flandre_entity",
            () -> EntityType.Builder.<FlandreEntity>of(FlandreEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "flandre_entity").toString())
    );

    public static final RegistryObject<EntityType<KoishiEntity>> KOISHI_ENTITY = ENTITIES.register("koishi_entity",
            () -> EntityType.Builder.<KoishiEntity>of(KoishiEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "koishi_entity").toString())
    );

    public static final RegistryObject<EntityType<MarisaEntity>> MARISA_ENTITY = ENTITIES.register("marisa_entity",
            () -> EntityType.Builder.<MarisaEntity>of(MarisaEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "marisa_entity").toString())
    );

    public static final RegistryObject<EntityType<MarisaHatEntity>> MARISA_HAT_ENTITY = ENTITIES.register("marisa_hat_entity",
            () -> EntityType.Builder.<MarisaHatEntity>of(MarisaHatEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "marisa_hat_entity").toString())
    );

    public static final RegistryObject<EntityType<MeilingEntity>> MEILING_ENTITY = ENTITIES.register("meiling_entity",
            () -> EntityType.Builder.<MeilingEntity>of(MeilingEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "meiling_entity").toString())
    );

    public static final RegistryObject<EntityType<NazrinEntity>> NAZRIN_ENTITY = ENTITIES.register("nazrin_entity",
            () -> EntityType.Builder.<NazrinEntity>of(NazrinEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "nazrin_entity").toString())
    );

    public static final RegistryObject<EntityType<NitoriEntity>> NITORI_ENTITY = ENTITIES.register("nitori_entity",
            () -> EntityType.Builder.<NitoriEntity>of(NitoriEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "nitori_entity").toString())
    );

    public static final RegistryObject<EntityType<PatchouliEntity>> PATCHOULI_ENTITY = ENTITIES.register("patchouli_entity",
            () -> EntityType.Builder.<PatchouliEntity>of(PatchouliEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "patchouli_entity").toString())
    );

    public static final RegistryObject<EntityType<ReimuEntity>> REIMU_ENTITY = ENTITIES.register("reimu_entity",
            () -> EntityType.Builder.<ReimuEntity>of(ReimuEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "reimu_entity").toString())
    );


    public static final RegistryObject<EntityType<ReimuBlueEntity>> REIMU_BLUE_ENTITY = ENTITIES.register("reimu_blue_entity",
            () -> EntityType.Builder.<ReimuBlueEntity>of(ReimuBlueEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "reimu_blue_entity").toString())
    );


    public static final RegistryObject<EntityType<SunnyMilkEntity>> SUNNY_MILK_ENTITY = ENTITIES.register("sunny_milk_entity",
            () -> EntityType.Builder.<SunnyMilkEntity>of(SunnyMilkEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "sunny_milk_entity").toString())
    );

    public static final RegistryObject<EntityType<TanCirnoEntity>> TAN_CIRNO_ENTITY = ENTITIES.register("tan_cirno_entity",
            () -> EntityType.Builder.<TanCirnoEntity>of(TanCirnoEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "tan_cirno_entity").toString())
    );

    public static final RegistryObject<EntityType<TewiEntity>> TEWI_ENTITY = ENTITIES.register("tewi_entity",
            () -> EntityType.Builder.<TewiEntity>of(TewiEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "tewi_entity").toString())
    );

    public static final RegistryObject<EntityType<YoumuEntity>> YOUMU_ENTITY = ENTITIES.register("youmu_entity",
            () -> EntityType.Builder.<YoumuEntity>of(YoumuEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "youmu_entity").toString())
    );

    public static final RegistryObject<EntityType<YuyukoEntity>> YUYUKO_ENTITY = ENTITIES.register("yuyuko_entity",
            () -> EntityType.Builder.<YuyukoEntity>of(YuyukoEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .fireImmune()
                    .build(new ResourceLocation(Fumo.MODID, "yuyuko_entity").toString())
    );

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
        System.out.println("Entities registered");
    }

}
