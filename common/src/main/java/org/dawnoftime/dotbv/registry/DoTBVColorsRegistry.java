package org.dawnoftime.dotbv.registry;

import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Block;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Supplier;

public class DoTBVColorsRegistry {
    private static final Map<BlockColor, List<Supplier<Block>>> BLOCKS_COLOR_REGISTRY = new HashMap<>();
    private static final Map<ItemColor, List<Supplier<Item>>> ITEMS_COLOR_REGISTRY = new HashMap<>();

    public static final BlockColor LEAVES_BLOCK_COLOR = DoTBVColorsRegistry.register(
            (blockState, blockAndTintGetter, blockPos, tintIndexIn) -> BiomeColors.getAverageFoliageColor(blockAndTintGetter, blockPos),
            DoTBVBlocksRegistry.INSTANCE.ACACIA_LEAVES_EDGE,
            DoTBVBlocksRegistry.INSTANCE.ACACIA_LEAVES_PLATE,
            DoTBVBlocksRegistry.INSTANCE.BIRCH_LEAVES_EDGE,
            DoTBVBlocksRegistry.INSTANCE.BIRCH_LEAVES_PLATE,
            DoTBVBlocksRegistry.INSTANCE.DARK_OAK_LEAVES_EDGE,
            DoTBVBlocksRegistry.INSTANCE.DARK_OAK_LEAVES_PLATE,
            DoTBVBlocksRegistry.INSTANCE.JUNGLE_LEAVES_EDGE,
            DoTBVBlocksRegistry.INSTANCE.JUNGLE_LEAVES_PLATE,
            DoTBVBlocksRegistry.INSTANCE.MANGROVE_LEAVES_EDGE,
            DoTBVBlocksRegistry.INSTANCE.MANGROVE_LEAVES_PLATE,
            DoTBVBlocksRegistry.INSTANCE.OAK_LEAVES_EDGE,
            DoTBVBlocksRegistry.INSTANCE.OAK_LEAVES_PLATE,
            DoTBVBlocksRegistry.INSTANCE.SPRUCE_LEAVES_EDGE,
            DoTBVBlocksRegistry.INSTANCE.SPRUCE_LEAVES_PLATE
    );

    // Grass color handler for grass_block_slab — uses biome-averaged grass color in world,
    // and the default grass color in inventory (no biome context when rendering items).
    public static final BlockColor GRASS_BLOCK_COLOR = DoTBVColorsRegistry.register(
            (blockState, blockAndTintGetter, blockPos, tintIndexIn) -> BiomeColors.getAverageGrassColor(blockAndTintGetter, blockPos),
            DoTBVBlocksRegistry.INSTANCE.GRASS_BLOCK_SLAB
    );

    public static final ItemColor GRASS_ITEM_COLOR = DoTBVColorsRegistry.registerItemFromBlocks(
            (stack, tintIndex) -> GrassColor.getDefaultColor(),
            DoTBVBlocksRegistry.INSTANCE.GRASS_BLOCK_SLAB
    );

    // Item colors for leaf blocks in inventory — uses the default foliage color since
    // there is no biome context when rendering items. This makes them appear green
    // in inventory instead of black/white.
    public static final ItemColor LEAVES_ITEM_COLOR = DoTBVColorsRegistry.registerItemFromBlocks(
            (stack, tintIndex) -> FoliageColor.getDefaultColor(),
            DoTBVBlocksRegistry.INSTANCE.ACACIA_LEAVES_EDGE,
            DoTBVBlocksRegistry.INSTANCE.ACACIA_LEAVES_PLATE,
            DoTBVBlocksRegistry.INSTANCE.BIRCH_LEAVES_EDGE,
            DoTBVBlocksRegistry.INSTANCE.BIRCH_LEAVES_PLATE,
            DoTBVBlocksRegistry.INSTANCE.DARK_OAK_LEAVES_EDGE,
            DoTBVBlocksRegistry.INSTANCE.DARK_OAK_LEAVES_PLATE,
            DoTBVBlocksRegistry.INSTANCE.JUNGLE_LEAVES_EDGE,
            DoTBVBlocksRegistry.INSTANCE.JUNGLE_LEAVES_PLATE,
            DoTBVBlocksRegistry.INSTANCE.MANGROVE_LEAVES_EDGE,
            DoTBVBlocksRegistry.INSTANCE.MANGROVE_LEAVES_PLATE,
            DoTBVBlocksRegistry.INSTANCE.OAK_LEAVES_EDGE,
            DoTBVBlocksRegistry.INSTANCE.OAK_LEAVES_PLATE,
            DoTBVBlocksRegistry.INSTANCE.SPRUCE_LEAVES_EDGE,
            DoTBVBlocksRegistry.INSTANCE.SPRUCE_LEAVES_PLATE
    );

    public static Map<BlockColor, List<Supplier<Block>>> getBlocksColorRegistry() {
        return BLOCKS_COLOR_REGISTRY;
    }

    public static Map<ItemColor, List<Supplier<Item>>> getItemsColorRegistry() {
        return ITEMS_COLOR_REGISTRY;
    }

    @SafeVarargs
    private static BlockColor register(final BlockColor blockColorIn, final Supplier<Block>... blocksIn) {
        List<Supplier<Block>> blocks = DoTBVColorsRegistry.getBlocks(blockColorIn);
        if (blocks == null) {
            blocks = new ArrayList<>();
            DoTBVColorsRegistry.BLOCKS_COLOR_REGISTRY.put(blockColorIn, blocks);
        }
        Collections.addAll(blocks, blocksIn);
        return blockColorIn;
    }

    // Converts Block suppliers to Item suppliers (via block.asItem()) and registers them
    // for item color tinting. Avoids duplicating the block list between block and item registries.
    @SafeVarargs
    private static ItemColor registerItemFromBlocks(final ItemColor itemColorIn, final Supplier<Block>... blocksIn) {
        List<Supplier<Item>> items = new ArrayList<>();
        for (Supplier<Block> blockSupplier : blocksIn) {
            items.add(() -> blockSupplier.get().asItem());
        }
        DoTBVColorsRegistry.ITEMS_COLOR_REGISTRY.put(itemColorIn, items);
        return itemColorIn;
    }

    private static List<Supplier<Block>> getBlocks(final BlockColor blockColorIn) {
        for (final Entry<BlockColor, List<Supplier<Block>>> entry : DoTBVColorsRegistry.BLOCKS_COLOR_REGISTRY.entrySet()) {
            if (entry.getKey().getClass() == blockColorIn.getClass()) {
                return entry.getValue();
            }
        }
        return null;
    }

    public static void initialize() {
    }
}