package dev.lemonjuice.lemontech.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static dev.lemonjuice.lemontech.LemonTech.MOD_ID;

public class LTItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(MOD_ID);

    // Cobalt Set
    public static final Supplier<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> COBALT_NUGGET = ITEMS.register("cobalt_nugget", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RAW_COBALT = ITEMS.register("raw_cobalt", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
