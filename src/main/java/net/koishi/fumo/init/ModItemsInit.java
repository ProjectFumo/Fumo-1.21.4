package net.koishi.fumo.init;

import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.koishi.fumo.Fumo;
import net.minecraft.world.level.Level;

public class ModItemsInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Fumo.MODID);

    public static void spawnFumo(String entityID, Level world, Player player, BlockPos pos, ItemStack handItem) {
        if ((world.getBlockState(BlockPos.containing(pos.getX(), pos.getY() + 1, pos.getZ()))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(pos.getX(), pos.getY() + 1, pos.getZ()))).getBlock() instanceof LiquidBlock) {
            if (world instanceof ServerLevel _level) {
                _level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((pos.getX() + 0.5), (pos.getY() + 1), (pos.getZ() + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), ("/summon " + Fumo.MODID + ":" + entityID + " ~ ~ ~ " + "{Rotation:[" + (player.getYRot() - 180) + "f]}"));
            }
            if (!player.isCreative()) {
                handItem.shrink(1);
            }
            if (world instanceof ServerLevel) {
                world.playSound(null, pos, SoundEvents.WOOL_PLACE, SoundSource.BLOCKS, 1.0f, 1.0f);
            }
        }
    }

    // Add Debug fumo
    public static final RegistryObject<ForgeSpawnEggItem> FUMO_ITEM = ITEMS.register("fumo_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("fumo_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });


    public static final RegistryObject<ForgeSpawnEggItem> ALICE_ITEM = ITEMS.register("alice_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("alice_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });


    public static final RegistryObject<ForgeSpawnEggItem> CHEN_ITEM = ITEMS.register("chen_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("chen_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });

    public static final RegistryObject<ForgeSpawnEggItem> CIRNO_ITEM = ITEMS.register("cirno_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("cirno_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });


    public static final RegistryObject<ForgeSpawnEggItem> EIKI_ITEM = ITEMS.register("eiki_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("eiki_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });


    public static final RegistryObject<ForgeSpawnEggItem> FLAN_ITEM = ITEMS.register("flandre_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("flandre_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });


    public static final RegistryObject<ForgeSpawnEggItem> KOISHI_ITEM = ITEMS.register("koishi_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("koishi_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });


    public static final RegistryObject<ForgeSpawnEggItem> MARISA_ITEM = ITEMS.register("marisa_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("marisa_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });


    public static final RegistryObject<ForgeSpawnEggItem> MARISA_HAT_ITEM = ITEMS.register("marisa_hat_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("marisa_hat_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });


    public static final RegistryObject<ForgeSpawnEggItem> MEILING_ITEM = ITEMS.register("meiling_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("meiling_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });


    public static final RegistryObject<ForgeSpawnEggItem> NAZRIN_ITEM = ITEMS.register("nazrin_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("nazrin_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });


    public static final RegistryObject<ForgeSpawnEggItem> NITORI_ITEM = ITEMS.register("nitori_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("nitori_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });


    public static final RegistryObject<ForgeSpawnEggItem> PATCHOULI_ITEM = ITEMS.register("patchouli_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("patchouli_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });


    public static final RegistryObject<ForgeSpawnEggItem> REIMU_ITEM = ITEMS.register("reimu_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("reimu_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });


    public static final RegistryObject<ForgeSpawnEggItem> REIMU_BLUE_ITEM = ITEMS.register("reimu_blue_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("reimu_blue_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });


    public static final RegistryObject<ForgeSpawnEggItem> SUNNY_MILK_ITEM = ITEMS.register("sunny_milk_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("sunny_milk_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });


    public static final RegistryObject<ForgeSpawnEggItem> TAN_CIRNO_ITEM = ITEMS.register("tan_cirno_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("tan_cirno_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });


    public static final RegistryObject<ForgeSpawnEggItem> TEWI_ITEM = ITEMS.register("tewi_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("tewi_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });


    public static final RegistryObject<ForgeSpawnEggItem> YOUMU_ITEM = ITEMS.register("youmu_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("youmu_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });


    public static final RegistryObject<ForgeSpawnEggItem> YUYUKO_ITEM = ITEMS.register("yuyuko_item",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.FUMO_ENTITY, 0xFFFFFF, 0xFFFFFF, new Item.Properties()
                    .stacksTo(1)
            ) {
                @Override
                public InteractionResult useOn(UseOnContext context) {
                    spawnFumo("yuyuko_entity", context.getLevel(), context.getPlayer(), context.getClickedPos(), context.getItemInHand());
                    return InteractionResult.SUCCESS;
                }
            });

    public static final RegistryObject<Item> CREATIVE_TAB_ITEM = ITEMS.register("creative_tab_item", () -> new Item(new Item.Properties().stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        System.out.println("Items registered");
    }
}
