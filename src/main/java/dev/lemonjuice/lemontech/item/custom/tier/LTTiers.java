package dev.lemonjuice.lemontech.item.custom.tier;

import dev.lemonjuice.lemontech.item.LTItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

/**
 * Simple Tiers
 * new SimpleTier(TagKey<Block> incorrectBlockForDrops, int uses, float speed, int enchantmentValue, Supplier<Ingredient> repairIngredient)
 *
 * WOOD(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2.0F, 0.0F, 15, () -> {
 *  return Ingredient.of(ItemTags.PLANKS);
 * }),
 * STONE(BlockTags.INCORRECT_FOR_STONE_TOOL, 131, 4.0F, 1.0F, 5, () -> {
 *  return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);
 * }),
 * IRON(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 6.0F, 2.0F, 14, () -> {
 *  return Ingredient.of(new ItemLike[]{Items.IRON_INGOT});
 * }),
 * DIAMOND(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 8.0F, 3.0F, 10, () -> {
 *  return Ingredient.of(new ItemLike[]{Items.DIAMOND});
 * }),
 * GOLD(BlockTags.INCORRECT_FOR_GOLD_TOOL, 32, 12.0F, 0.0F, 22, () -> {
 *  return Ingredient.of(new ItemLike[]{Items.GOLD_INGOT});
 * }),
 * NETHERITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2031, 9.0F, 4.0F, 15, () -> {
 *  return Ingredient.of(new ItemLike[]{Items.NETHERITE_INGOT});
 * });
 */
public class LTTiers {
    public static final Tier COBALT_TIER = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, getCobaltUses(), getCobaltSpeed(), 2.0F, 14, () -> Ingredient.of(LTItems.COBALT_INGOT.get()));


    // Extra Methods That Will Make Life Easier Than Straight Numbers
    private static int getCobaltUses() {return Tiers.GOLD.getUses() * 20;}
    private static float getCobaltSpeed() {return Tiers.GOLD.getSpeed() * 1.5F;}
}
