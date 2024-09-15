package dev.lemonjuice.lemontech.item;

import dev.lemonjuice.lemontech.item.custom.tier.LTTiers;
import net.minecraft.world.item.*;
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
    public static final Supplier<Item> COBALT_SWORD = ITEMS.register("cobalt_sword", () -> new SwordItem(LTTiers.COBALT_TIER, getSwordItemProperties(LTTiers.COBALT_TIER)));
    public static final Supplier<Item> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe", () -> new PickaxeItem(LTTiers.COBALT_TIER, getPickaxeItemProperties(LTTiers.COBALT_TIER)));
    public static final Supplier<Item> COBALT_AXE = ITEMS.register("cobalt_axe", () -> new AxeItem(LTTiers.COBALT_TIER, getAxeItemProperties(LTTiers.COBALT_TIER)));
    public static final Supplier<Item> COBALT_SHOVEL = ITEMS.register("cobalt_shovel", () -> new ShovelItem(LTTiers.COBALT_TIER, getShovelItemProperties(LTTiers.COBALT_TIER)));
    public static final Supplier<Item> COBALT_HOE = ITEMS.register("cobalt_hoe", () -> new HoeItem(LTTiers.COBALT_TIER, getHoeItemProperties(LTTiers.COBALT_TIER)));

    public static Item.Properties getSwordItemProperties(Tier tier){
        return new Item.Properties().attributes(SwordItem.createAttributes(tier, 3, -2.4F));
    }

    public static Item.Properties getPickaxeItemProperties(Tier tier){
        return new Item.Properties().attributes(PickaxeItem.createAttributes(tier, 1.0F, -2.8F));
    }

    public static Item.Properties getAxeItemProperties(Tier tier){
        return new Item.Properties().attributes(AxeItem.createAttributes(tier, 6.0F, -3.2F));
    }

    public static Item.Properties getShovelItemProperties(Tier tier){
        return new Item.Properties().attributes(AxeItem.createAttributes(tier, 1.5F, -3.0F));
    }

    public static Item.Properties getHoeItemProperties(Tier tier){
        return new Item.Properties().attributes(AxeItem.createAttributes(tier, 0.0F, -3.0F));
    }

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
