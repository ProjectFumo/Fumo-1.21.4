package net.koishi.fumo.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.koishi.fumo.Fumo;

public class CreativeModTabsInit {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Fumo.MODID);

    public static final RegistryObject<CreativeModeTab> FUMO_TAB = CREATIVE_MODE_TABS.register("fumo_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItemsInit.CREATIVE_TAB_ITEM.get()))
            .title(Component.translatable("creativetab.fumo_tab"))
            .displayItems(((itemDisplayParameters, output) -> {
                // CREATIVE TAB ITEM ORDER. try to keep alphabetical please
                //output.accept(ModItemsInit.FUMO_ITEM.get());
                output.accept(ModItemsInit.ALICE_ITEM.get());
                output.accept(ModItemsInit.CHEN_ITEM.get());
                output.accept(ModItemsInit.CIRNO_ITEM.get());
                output.accept(ModItemsInit.EIKI_ITEM.get());
                output.accept(ModItemsInit.FLAN_ITEM.get());
                output.accept(ModItemsInit.KOISHI_ITEM.get());
                output.accept(ModItemsInit.MARISA_ITEM.get());
                output.accept(ModItemsInit.MARISA_HAT_ITEM.get());
                output.accept(ModItemsInit.MEILING_ITEM.get());
                output.accept(ModItemsInit.NAZRIN_ITEM.get());
                output.accept(ModItemsInit.NITORI_ITEM.get());
                output.accept(ModItemsInit.PATCHOULI_ITEM.get());
                output.accept(ModItemsInit.REIMU_ITEM.get());
                output.accept(ModItemsInit.REIMU_BLUE_ITEM.get());
                output.accept(ModItemsInit.SUNNY_MILK_ITEM.get());
                output.accept(ModItemsInit.TAN_CIRNO_ITEM.get());
                output.accept(ModItemsInit.TEWI_ITEM.get());
                output.accept(ModItemsInit.YOUMU_ITEM.get());
                output.accept(ModItemsInit.YUYUKO_ITEM.get());

            }))
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
