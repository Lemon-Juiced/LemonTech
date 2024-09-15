package dev.lemonjuice.lemontech.creativetab;

import dev.lemonjuice.lemontech.LemonTech;
import dev.lemonjuice.lemontech.item.LTItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class LTCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LemonTech.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LT_ITEMS_TAB = CREATIVE_MODE_TABS.register("lemontech_items", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.lemontech.items"))
            .icon(() -> new ItemStack(LTItems.COBALT_INGOT.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == LT_ITEMS_TAB.get()) {
            event.accept(LTItems.COBALT_INGOT.get());
            event.accept(LTItems.COBALT_NUGGET.get());
            event.accept(LTItems.RAW_COBALT.get());
        }
    }

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
