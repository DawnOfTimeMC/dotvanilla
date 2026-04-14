package org.dawnoftime.dotbv.registry;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import org.dawnoftime.dotbv.block.templates.*;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

@SuppressWarnings({"unused", "unchecked"})
public abstract class DoTBVBlocksRegistry {
    public static DoTBVBlocksRegistry INSTANCE;
    public static Map<TagKey<Block>, Set<Supplier<Block>>> blockTagsMap = new HashMap<>();

    // NATURALS - WOOD

    // Oak
    public final Supplier<Block> OAK_PLANKS_PLATE = register("oak_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> OAK_PLANKS_EDGE = register("oak_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> OAK_SUPPORT_SLAB = register("oak_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> OAK_SUPPORT_BEAM = register("oak_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> OAK_BEAM = register("oak_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> OAK_WALL = register("oak_wall", () -> new WallBlock(Block.Properties.copy(Blocks.OAK_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> OAK_PERGOLA = register("oak_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> OAK_LATTICE = register("oak_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> OAK_LEAVES_PLATE = register("oak_leaves_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.OAK_LEAVES)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> OAK_LEAVES_EDGE = register("oak_leaves_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.OAK_LEAVES)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);

    // Spruce
    public final Supplier<Block> SPRUCE_PLANKS_PLATE = register("spruce_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SPRUCE_PLANKS_EDGE = register("spruce_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SPRUCE_SUPPORT_SLAB = register("spruce_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SPRUCE_SUPPORT_BEAM = register("spruce_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SPRUCE_BEAM = register("spruce_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SPRUCE_WALL = register("spruce_wall", () -> new WallBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SPRUCE_PERGOLA = register("spruce_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SPRUCE_LATTICE = register("spruce_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SPRUCE_LEAVES_PLATE = register("spruce_leaves_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.SPRUCE_LEAVES)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> SPRUCE_LEAVES_EDGE = register("spruce_leaves_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.SPRUCE_LEAVES)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);

    // Birch
    public final Supplier<Block> BIRCH_PLANKS_PLATE = register("birch_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_PLANKS_EDGE = register("birch_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_SUPPORT_SLAB = register("birch_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_SUPPORT_BEAM = register("birch_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_BEAM = register("birch_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_WALL = register("birch_wall", () -> new WallBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_PERGOLA = register("birch_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_LATTICE = register("birch_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_LEAVES_PLATE = register("birch_leaves_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.BIRCH_LEAVES)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BIRCH_LEAVES_EDGE = register("birch_leaves_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.BIRCH_LEAVES)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);

    // Jungle
    public final Supplier<Block> JUNGLE_PLANKS_PLATE = register("jungle_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> JUNGLE_PLANKS_EDGE = register("jungle_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> JUNGLE_SUPPORT_SLAB = register("jungle_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> JUNGLE_SUPPORT_BEAM = register("jungle_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> JUNGLE_BEAM = register("jungle_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> JUNGLE_WALL = register("jungle_wall", () -> new WallBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> JUNGLE_PERGOLA = register("jungle_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> JUNGLE_LATTICE = register("jungle_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> JUNGLE_LEAVES_PLATE = register("jungle_leaves_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.JUNGLE_LEAVES)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> JUNGLE_LEAVES_EDGE = register("jungle_leaves_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.JUNGLE_LEAVES)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);

    // Acacia
    public final Supplier<Block> ACACIA_PLANKS_PLATE = register("acacia_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> ACACIA_PLANKS_EDGE = register("acacia_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> ACACIA_SUPPORT_SLAB = register("acacia_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> ACACIA_SUPPORT_BEAM = register("acacia_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> ACACIA_BEAM = register("acacia_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> ACACIA_WALL = register("acacia_wall", () -> new WallBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> ACACIA_PERGOLA = register("acacia_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> ACACIA_LATTICE = register("acacia_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> ACACIA_LEAVES_PLATE = register("acacia_leaves_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.ACACIA_LEAVES)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> ACACIA_LEAVES_EDGE = register("acacia_leaves_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.ACACIA_LEAVES)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);

    // Dark Oak
    public final Supplier<Block> DARK_OAK_PLANKS_PLATE = register("dark_oak_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> DARK_OAK_PLANKS_EDGE = register("dark_oak_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> DARK_OAK_SUPPORT_SLAB = register("dark_oak_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> DARK_OAK_SUPPORT_BEAM = register("dark_oak_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> DARK_OAK_BEAM = register("dark_oak_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> DARK_OAK_WALL = register("dark_oak_wall", () -> new WallBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> DARK_OAK_PERGOLA = register("dark_oak_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> DARK_OAK_LATTICE = register("dark_oak_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> DARK_OAK_LEAVES_PLATE = register("dark_oak_leaves_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.DARK_OAK_LEAVES)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> DARK_OAK_LEAVES_EDGE = register("dark_oak_leaves_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.DARK_OAK_LEAVES)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);

    // Cherry
    public final Supplier<Block> CHERRY_PLANKS_PLATE = register("cherry_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHERRY_PLANKS_EDGE = register("cherry_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHERRY_SUPPORT_SLAB = register("cherry_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHERRY_SUPPORT_BEAM = register("cherry_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHERRY_BEAM = register("cherry_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHERRY_WALL = register("cherry_wall", () -> new WallBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHERRY_PERGOLA = register("cherry_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHERRY_LATTICE = register("cherry_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHERRY_LEAVES_PLATE = register("cherry_leaves_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CHERRY_LEAVES)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CHERRY_LEAVES_EDGE = register("cherry_leaves_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CHERRY_LEAVES)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);

    // Mangrove
    public final Supplier<Block> MANGROVE_PLANKS_PLATE = register("mangrove_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MANGROVE_PLANKS_EDGE = register("mangrove_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MANGROVE_SUPPORT_SLAB = register("mangrove_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MANGROVE_SUPPORT_BEAM = register("mangrove_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MANGROVE_BEAM = register("mangrove_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MANGROVE_WALL = register("mangrove_wall", () -> new WallBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MANGROVE_PERGOLA = register("mangrove_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MANGROVE_LATTICE = register("mangrove_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MANGROVE_LEAVES_PLATE = register("mangrove_leaves_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.MANGROVE_LEAVES)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> MANGROVE_LEAVES_EDGE = register("mangrove_leaves_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.MANGROVE_LEAVES)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);

    // Bamboo
    public final Supplier<Block> BAMBOO_PLANKS_PLATE = register("bamboo_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BAMBOO_PLANKS_EDGE = register("bamboo_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BAMBOO_SUPPORT_SLAB = register("bamboo_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BAMBOO_SUPPORT_BEAM = register("bamboo_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BAMBOO_BEAM = register("bamboo_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BAMBOO_WALL = register("bamboo_wall", () -> new WallBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BAMBOO_PERGOLA = register("bamboo_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> BAMBOO_LATTICE = register("bamboo_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.BAMBOO_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);

    // Crimson
    public final Supplier<Block> CRIMSON_PLANKS_PLATE = register("crimson_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CRIMSON_PLANKS_EDGE = register("crimson_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CRIMSON_SUPPORT_SLAB = register("crimson_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CRIMSON_SUPPORT_BEAM = register("crimson_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CRIMSON_BEAM = register("crimson_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CRIMSON_WALL = register("crimson_wall", () -> new WallBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CRIMSON_PERGOLA = register("crimson_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> CRIMSON_LATTICE = register("crimson_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.CRIMSON_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);

    // Warped
    public final Supplier<Block> WARPED_PLANKS_PLATE = register("warped_planks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WARPED_PLANKS_EDGE = register("warped_planks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WARPED_SUPPORT_SLAB = register("warped_support_slab", () -> new SupportSlabBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WARPED_SUPPORT_BEAM = register("warped_support_beam", () -> new SupportBeamBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WARPED_BEAM = register("warped_beam", () -> new BeamBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WARPED_WALL = register("warped_wall", () -> new WallBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WARPED_PERGOLA = register("warped_pergola", () -> new PergolaBlock(Block.Properties.copy(Blocks.WARPED_PLANKS)).setBurnable(), BlockTags.MINEABLE_WITH_AXE);
    public final Supplier<Block> WARPED_LATTICE = register("warped_lattice", () -> new LatticeBlock(Block.Properties.copy(Blocks.WARPED_PLANKS).noOcclusion()).setBurnable(), BlockTags.MINEABLE_WITH_AXE);

    // NATURALS - GRAVEL & SAND

    public final Supplier<Block> GRAVEL_SLAB = register("gravel_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.SAND).mapColor(MapColor.STONE).strength(1.2F).sound(SoundType.GRAVEL)), BlockTags.MINEABLE_WITH_SHOVEL);
    public final Supplier<Block> SAND_SLAB = register("sand_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.SAND).mapColor(MapColor.STONE).strength(1.2F).sound(SoundType.SAND)), BlockTags.MINEABLE_WITH_SHOVEL);
    public final Supplier<Block> GRASS_BLOCK_SLAB = register("grass_block_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.GRASS_BLOCK)), BlockTags.MINEABLE_WITH_SHOVEL);
    public final Supplier<Block> PODZOL_SLAB = register("podzol_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.PODZOL)), BlockTags.MINEABLE_WITH_SHOVEL);
    public final Supplier<Block> MYCELIUM_SLAB = register("mycelium_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.MYCELIUM)), BlockTags.MINEABLE_WITH_SHOVEL);
    public final Supplier<Block> DIRT_PATH_SLAB = register("dirt_path_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.DIRT_PATH)), BlockTags.MINEABLE_WITH_SHOVEL);
    public final Supplier<Block> DIRT_SLAB = register("dirt_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.DIRT)), BlockTags.MINEABLE_WITH_SHOVEL);
    public final Supplier<Block> COARSE_DIRT_SLAB = register("coarse_dirt_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.COARSE_DIRT)), BlockTags.MINEABLE_WITH_SHOVEL);
    public final Supplier<Block> ROOTED_DIRT_SLAB = register("rooted_dirt_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.ROOTED_DIRT)), BlockTags.MINEABLE_WITH_SHOVEL);
    public final Supplier<Block> MUD_SLAB = register("mud_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.MUD)), BlockTags.MINEABLE_WITH_SHOVEL);
    public final Supplier<Block> CLAY_SLAB = register("clay_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.CLAY)), BlockTags.MINEABLE_WITH_SHOVEL);
    public final Supplier<Block> RED_SAND_SLAB = register("red_sand_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.RED_SAND)), BlockTags.MINEABLE_WITH_SHOVEL);
    public final Supplier<Block> MOSS_BLOCK_SLAB = register("moss_block_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.MOSS_BLOCK)), BlockTags.MINEABLE_WITH_SHOVEL);

    // BUILDING - COBBLESTONE

    public final Supplier<Block> COBBLESTONE_PLATE = register("cobblestone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.COBBLESTONE)));
    public final Supplier<Block> COBBLESTONE_EDGE = register("cobblestone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.COBBLESTONE)));
    public final Supplier<Block> MOSSY_COBBLESTONE_PLATE = register("mossy_cobblestone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
    public final Supplier<Block> MOSSY_COBBLESTONE_EDGE = register("mossy_cobblestone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.MOSSY_COBBLESTONE)));

    // BUILDING - STONE

    public final Supplier<Block> STONE_PLATE = register("stone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> STONE_EDGE = register("stone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> SMOOTH_STONE_PLATE = register("smooth_stone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.SMOOTH_STONE)));
    public final Supplier<Block> SMOOTH_STONE_EDGE = register("smooth_stone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.SMOOTH_STONE)));

    public final Supplier<Block> STONE_BRICKS_PLATE = register("stone_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> STONE_BRICKS_EDGE = register("stone_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE_BRICKS)));
    public final Supplier<Block> CRACKED_STONE_BRICKS_STAIRS = register("cracked_stone_bricks_stairs", () -> new CustomStairBlock(Blocks.CRACKED_STONE_BRICKS.defaultBlockState(), Block.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public final Supplier<Block> CRACKED_STONE_BRICKS_PLATE = register("cracked_stone_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public final Supplier<Block> CRACKED_STONE_BRICKS_SLAB = register("cracked_stone_bricks_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public final Supplier<Block> CRACKED_STONE_BRICKS_EDGE = register("cracked_stone_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public final Supplier<Block> CRACKED_STONE_BRICKS_WALL = register("cracked_stone_bricks_wall", () -> new WallBlock(Block.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public final Supplier<Block> MOSSY_STONE_BRICKS_PLATE = register("mossy_stone_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.MOSSY_STONE_BRICKS)));
    public final Supplier<Block> MOSSY_STONE_BRICKS_EDGE = register("mossy_stone_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.MOSSY_STONE_BRICKS)));

    // BUILDING - GRANITE / DIORITE / ANDESITE

    public final Supplier<Block> GRANITE_PLATE = register("granite_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.GRANITE)));
    public final Supplier<Block> GRANITE_EDGE = register("granite_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.GRANITE)));
    public final Supplier<Block> POLISHED_GRANITE_PLATE = register("polished_granite_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.POLISHED_GRANITE)));
    public final Supplier<Block> POLISHED_GRANITE_EDGE = register("polished_granite_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.POLISHED_GRANITE)));
    public final Supplier<Block> DIORITE_PLATE = register("diorite_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.DIORITE)));
    public final Supplier<Block> DIORITE_EDGE = register("diorite_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.DIORITE)));
    public final Supplier<Block> POLISHED_DIORITE_PLATE = register("polished_diorite_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.POLISHED_DIORITE)));
    public final Supplier<Block> POLISHED_DIORITE_EDGE = register("polished_diorite_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.POLISHED_DIORITE)));
    public final Supplier<Block> ANDESITE_PLATE = register("andesite_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.ANDESITE)));
    public final Supplier<Block> ANDESITE_EDGE = register("andesite_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.ANDESITE)));
    public final Supplier<Block> POLISHED_ANDESITE_PLATE = register("polished_andesite_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.POLISHED_ANDESITE)));
    public final Supplier<Block> POLISHED_ANDESITE_EDGE = register("polished_andesite_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.POLISHED_ANDESITE)));

    // BUILDING - DEEPSLATE

    public final Supplier<Block> DEEPSLATE_STAIRS = register("deepslate_stairs", () -> new CustomStairBlock(Blocks.DEEPSLATE.defaultBlockState(), Block.Properties.copy(Blocks.DEEPSLATE)));
    public final Supplier<Block> DEEPSLATE_SLAB = register("deepslate_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.DEEPSLATE)));
    public final Supplier<Block> DEEPSLATE_PLATE = register("deepslate_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.DEEPSLATE)));
    public final Supplier<Block> DEEPSLATE_EDGE = register("deepslate_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.DEEPSLATE)));
    public final Supplier<Block> COBBLED_DEEPSLATE_PLATE = register("cobbled_deepslate_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public final Supplier<Block> COBBLED_DEEPSLATE_EDGE = register("cobbled_deepslate_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.COBBLED_DEEPSLATE)));
    public final Supplier<Block> POLISHED_DEEPSLATE_PLATE = register("polished_deepslate_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.POLISHED_DEEPSLATE)));
    public final Supplier<Block> POLISHED_DEEPSLATE_EDGE = register("polished_deepslate_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.POLISHED_DEEPSLATE)));
    public final Supplier<Block> DEEPSLATE_BRICKS_PLATE = register("deepslate_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public final Supplier<Block> DEEPSLATE_BRICKS_EDGE = register("deepslate_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.DEEPSLATE_BRICKS)));
    public final Supplier<Block> CRACKED_DEEPSLATE_BRICKS_STAIRS = register("cracked_deepslate_bricks_stairs", () -> new CustomStairBlock(Blocks.CRACKED_DEEPSLATE_BRICKS.defaultBlockState(), Block.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public final Supplier<Block> CRACKED_DEEPSLATE_BRICKS_SLAB = register("cracked_deepslate_bricks_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public final Supplier<Block> CRACKED_DEEPSLATE_BRICKS_PLATE = register("cracked_deepslate_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public final Supplier<Block> CRACKED_DEEPSLATE_BRICKS_EDGE = register("cracked_deepslate_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public final Supplier<Block> DEEPSLATE_TILES_PLATE = register("deepslate_tiles_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.DEEPSLATE_TILES)));
    public final Supplier<Block> DEEPSLATE_TILES_EDGE = register("deepslate_tiles_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.DEEPSLATE_TILES)));
    public final Supplier<Block> CRACKED_DEEPSLATE_TILES_STAIRS = register("cracked_deepslate_tiles_stairs", () -> new CustomStairBlock(Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(), Block.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)));
    public final Supplier<Block> CRACKED_DEEPSLATE_TILES_SLAB = register("cracked_deepslate_tiles_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)));
    public final Supplier<Block> CRACKED_DEEPSLATE_TILES_PLATE = register("cracked_deepslate_tiles_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)));
    public final Supplier<Block> CRACKED_DEEPSLATE_TILES_EDGE = register("cracked_deepslate_tiles_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)));

    // BUILDING - BRICKS / MUD

    public final Supplier<Block> BRICKS_PLATE = register("bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.BRICKS)));
    public final Supplier<Block> BRICKS_EDGE = register("bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.BRICKS)));
    public final Supplier<Block> PACKED_MUD_STAIRS = register("packed_mud_stairs", () -> new CustomStairBlock(Blocks.PACKED_MUD.defaultBlockState(), Block.Properties.copy(Blocks.PACKED_MUD)));
    public final Supplier<Block> PACKED_MUD_SLAB = register("packed_mud_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.PACKED_MUD)));
    public final Supplier<Block> PACKED_MUD_PLATE = register("packed_mud_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.PACKED_MUD)));
    public final Supplier<Block> PACKED_MUD_EDGE = register("packed_mud_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.PACKED_MUD)));
    public final Supplier<Block> MUD_BRICKS_PLATE = register("mud_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.MUD_BRICKS)));
    public final Supplier<Block> MUD_BRICKS_EDGE = register("mud_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.MUD_BRICKS)));

    // BUILDING - SANDSTONE

    public final Supplier<Block> SANDSTONE_PLATE = register("sandstone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.SANDSTONE)));
    public final Supplier<Block> SANDSTONE_EDGE = register("sandstone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.SANDSTONE)));

    public final Supplier<Block> CUT_SANDSTONE_STAIRS = register("cut_sandstone_stairs", () -> new CustomStairBlock(Blocks.CUT_SANDSTONE.defaultBlockState(), Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public final Supplier<Block> CUT_SANDSTONE_PLATE = register("cut_sandstone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE)));
    public final Supplier<Block> CUT_SANDSTONE_EDGE = register("cut_sandstone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CUT_SANDSTONE)));

    public final Supplier<Block> SMOOTH_SANDSTONE_PLATE = register("smooth_sandstone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.SMOOTH_SANDSTONE)));
    public final Supplier<Block> SMOOTH_SANDSTONE_EDGE = register("smooth_sandstone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.SMOOTH_SANDSTONE)));
    public final Supplier<Block> RED_SANDSTONE_PLATE = register("red_sandstone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.RED_SANDSTONE)));
    public final Supplier<Block> RED_SANDSTONE_EDGE = register("red_sandstone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.RED_SANDSTONE)));
    public final Supplier<Block> SMOOTH_RED_SANDSTONE_PLATE = register("smooth_red_sandstone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE)));
    public final Supplier<Block> SMOOTH_RED_SANDSTONE_EDGE = register("smooth_red_sandstone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE)));
    public final Supplier<Block> CUT_RED_SANDSTONE_STAIRS = register("cut_red_sandstone_stairs", () -> new CustomStairBlock(Blocks.CUT_RED_SANDSTONE.defaultBlockState(), Block.Properties.copy(Blocks.CUT_RED_SANDSTONE)));
    public final Supplier<Block> CUT_RED_SANDSTONE_PLATE = register("cut_red_sandstone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CUT_RED_SANDSTONE)));
    public final Supplier<Block> CUT_RED_SANDSTONE_EDGE = register("cut_red_sandstone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CUT_RED_SANDSTONE)));

    // DIMENSIONS - NETHER

    public final Supplier<Block> NETHERRACK_STAIRS = register("netherrack_stairs", () -> new CustomStairBlock(Blocks.NETHERRACK.defaultBlockState(), Block.Properties.copy(Blocks.NETHERRACK)));
    public final Supplier<Block> NETHERRACK_SLAB = register("netherrack_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.NETHERRACK)));
    public final Supplier<Block> NETHERRACK_PLATE = register("netherrack_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.NETHERRACK)));
    public final Supplier<Block> NETHERRACK_EDGE = register("netherrack_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.NETHERRACK)));
    public final Supplier<Block> NETHER_BRICKS_PLATE = register("nether_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.NETHER_BRICKS)));
    public final Supplier<Block> NETHER_BRICKS_EDGE = register("nether_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.NETHER_BRICKS)));
    public final Supplier<Block> CRACKED_NETHER_BRICKS_STAIRS = register("cracked_nether_bricks_stairs", () -> new CustomStairBlock(Blocks.CRACKED_NETHER_BRICKS.defaultBlockState(), Block.Properties.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public final Supplier<Block> CRACKED_NETHER_BRICKS_SLAB = register("cracked_nether_bricks_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public final Supplier<Block> CRACKED_NETHER_BRICKS_PLATE = register("cracked_nether_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public final Supplier<Block> CRACKED_NETHER_BRICKS_EDGE = register("cracked_nether_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public final Supplier<Block> RED_NETHER_BRICKS_PLATE = register("red_nether_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.RED_NETHER_BRICKS)));
    public final Supplier<Block> RED_NETHER_BRICKS_EDGE = register("red_nether_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.RED_NETHER_BRICKS)));

    // BUILDING - PRISMARINE

    public final Supplier<Block> PRISMARINE_PLATE = register("prismarine_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.PRISMARINE)));
    public final Supplier<Block> PRISMARINE_EDGE = register("prismarine_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.PRISMARINE)));
    public final Supplier<Block> PRISMARINE_BRICKS_PLATE = register("prismarine_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.PRISMARINE_BRICKS)));
    public final Supplier<Block> PRISMARINE_BRICKS_EDGE = register("prismarine_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.PRISMARINE_BRICKS)));
    public final Supplier<Block> DARK_PRISMARINE_PLATE = register("dark_prismarine_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.DARK_PRISMARINE)));
    public final Supplier<Block> DARK_PRISMARINE_EDGE = register("dark_prismarine_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.DARK_PRISMARINE)));

    // MATERIALS - MINERAL BLOCKS

    public final Supplier<Block> COAL_BLOCK_STAIRS = register("coal_block_stairs", () -> new CustomStairBlock(Blocks.COAL_BLOCK.defaultBlockState(), Block.Properties.copy(Blocks.COAL_BLOCK)));
    public final Supplier<Block> COAL_BLOCK_SLAB = register("coal_block_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.COAL_BLOCK)));
    public final Supplier<Block> COAL_BLOCK_PLATE = register("coal_block_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.COAL_BLOCK)));
    public final Supplier<Block> COAL_BLOCK_EDGE = register("coal_block_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.COAL_BLOCK)));
    public final Supplier<Block> IRON_BLOCK_STAIRS = register("iron_block_stairs", () -> new CustomStairBlock(Blocks.IRON_BLOCK.defaultBlockState(), Block.Properties.copy(Blocks.IRON_BLOCK)));
    public final Supplier<Block> IRON_BLOCK_SLAB = register("iron_block_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public final Supplier<Block> IRON_BLOCK_PLATE = register("iron_block_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public final Supplier<Block> IRON_BLOCK_EDGE = register("iron_block_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public final Supplier<Block> GOLD_BLOCK_STAIRS = register("gold_block_stairs", () -> new CustomStairBlock(Blocks.GOLD_BLOCK.defaultBlockState(), Block.Properties.copy(Blocks.GOLD_BLOCK)));
    public final Supplier<Block> GOLD_BLOCK_SLAB = register("gold_block_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.GOLD_BLOCK)));
    public final Supplier<Block> GOLD_BLOCK_PLATE = register("gold_block_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.GOLD_BLOCK)));
    public final Supplier<Block> GOLD_BLOCK_EDGE = register("gold_block_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.GOLD_BLOCK)));
    public final Supplier<Block> LAPIS_BLOCK_STAIRS = register("lapis_block_stairs", () -> new CustomStairBlock(Blocks.LAPIS_BLOCK.defaultBlockState(), Block.Properties.copy(Blocks.LAPIS_BLOCK)));
    public final Supplier<Block> LAPIS_BLOCK_SLAB = register("lapis_block_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.LAPIS_BLOCK)));
    public final Supplier<Block> LAPIS_BLOCK_PLATE = register("lapis_block_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.LAPIS_BLOCK)));
    public final Supplier<Block> LAPIS_BLOCK_EDGE = register("lapis_block_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.LAPIS_BLOCK)));
    public final Supplier<Block> DIAMOND_BLOCK_STAIRS = register("diamond_block_stairs", () -> new CustomStairBlock(Blocks.DIAMOND_BLOCK.defaultBlockState(), Block.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public final Supplier<Block> DIAMOND_BLOCK_SLAB = register("diamond_block_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public final Supplier<Block> DIAMOND_BLOCK_PLATE = register("diamond_block_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public final Supplier<Block> DIAMOND_BLOCK_EDGE = register("diamond_block_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public final Supplier<Block> NETHERITE_BLOCK_STAIRS = register("netherite_block_stairs", () -> new CustomStairBlock(Blocks.NETHERITE_BLOCK.defaultBlockState(), Block.Properties.copy(Blocks.NETHERITE_BLOCK)));
    public final Supplier<Block> NETHERITE_BLOCK_SLAB = register("netherite_block_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.NETHERITE_BLOCK)));
    public final Supplier<Block> NETHERITE_BLOCK_PLATE = register("netherite_block_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.NETHERITE_BLOCK)));
    public final Supplier<Block> NETHERITE_BLOCK_EDGE = register("netherite_block_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.NETHERITE_BLOCK)));

    // MATERIALS - AMETHYST

    public final Supplier<Block> AMETHYST_BLOCK_STAIRS = register("amethyst_block_stairs", () -> new CustomStairBlock(Blocks.AMETHYST_BLOCK.defaultBlockState(), Block.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public final Supplier<Block> AMETHYST_BLOCK_SLAB = register("amethyst_block_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public final Supplier<Block> AMETHYST_BLOCK_PLATE = register("amethyst_block_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public final Supplier<Block> AMETHYST_BLOCK_EDGE = register("amethyst_block_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.AMETHYST_BLOCK)));

    // MATERIALS - QUARTZ

    public final Supplier<Block> QUARTZ_BLOCK_PLATE = register("quartz_block_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.QUARTZ_BLOCK)));
    public final Supplier<Block> QUARTZ_BLOCK_EDGE = register("quartz_block_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.QUARTZ_BLOCK)));
    public final Supplier<Block> QUARTZ_BRICKS_STAIRS = register("quartz_bricks_stairs", () -> new CustomStairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(), Block.Properties.copy(Blocks.QUARTZ_BRICKS)));
    public final Supplier<Block> QUARTZ_BRICKS_SLAB = register("quartz_bricks_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.QUARTZ_BRICKS)));
    public final Supplier<Block> QUARTZ_BRICKS_PLATE = register("quartz_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.QUARTZ_BRICKS)));
    public final Supplier<Block> QUARTZ_BRICKS_EDGE = register("quartz_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.QUARTZ_BRICKS)));
    public final Supplier<Block> QUARTZ_PILLAR_PLATE = register("quartz_pillar_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.QUARTZ_PILLAR)));
    public final Supplier<Block> SMOOTH_QUARTZ_PLATE = register("smooth_quartz_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.SMOOTH_QUARTZ)));
    public final Supplier<Block> SMOOTH_QUARTZ_EDGE = register("smooth_quartz_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.SMOOTH_QUARTZ)));

    // MATERIALS - COPPER (WAXED)

    public final Supplier<Block> WAXED_CUT_COPPER_PLATE = register("waxed_cut_copper_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.WAXED_CUT_COPPER)));
    public final Supplier<Block> WAXED_CUT_COPPER_EDGE = register("waxed_cut_copper_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.WAXED_CUT_COPPER)));
    public final Supplier<Block> WAXED_EXPOSED_CUT_COPPER_PLATE = register("waxed_exposed_cut_copper_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.WAXED_EXPOSED_CUT_COPPER)));
    public final Supplier<Block> WAXED_EXPOSED_CUT_COPPER_EDGE = register("waxed_exposed_cut_copper_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.WAXED_EXPOSED_CUT_COPPER)));
    public final Supplier<Block> WAXED_WEATHERED_CUT_COPPER_PLATE = register("waxed_weathered_cut_copper_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.WAXED_WEATHERED_CUT_COPPER)));
    public final Supplier<Block> WAXED_WEATHERED_CUT_COPPER_EDGE = register("waxed_weathered_cut_copper_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.WAXED_WEATHERED_CUT_COPPER)));
    public final Supplier<Block> WAXED_OXIDIZED_CUT_COPPER_PLATE = register("waxed_oxidized_cut_copper_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER)));
    public final Supplier<Block> WAXED_OXIDIZED_CUT_COPPER_EDGE = register("waxed_oxidized_cut_copper_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER)));
    public final Supplier<Block> WAXED_COPPER_BLOCK_STAIRS = register("waxed_copper_block_stairs", () -> new CustomStairBlock(Blocks.WAXED_COPPER_BLOCK.defaultBlockState(), Block.Properties.copy(Blocks.WAXED_COPPER_BLOCK)));
    public final Supplier<Block> WAXED_COPPER_BLOCK_SLAB = register("waxed_copper_block_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.WAXED_COPPER_BLOCK)));
    public final Supplier<Block> WAXED_COPPER_BLOCK_PLATE = register("waxed_copper_block_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.WAXED_COPPER_BLOCK)));
    public final Supplier<Block> WAXED_COPPER_BLOCK_EDGE = register("waxed_copper_block_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.WAXED_COPPER_BLOCK)));
    public final Supplier<Block> WAXED_EXPOSED_COPPER_STAIRS = register("waxed_exposed_copper_stairs", () -> new CustomStairBlock(Blocks.WAXED_EXPOSED_COPPER.defaultBlockState(), Block.Properties.copy(Blocks.WAXED_EXPOSED_COPPER)));
    public final Supplier<Block> WAXED_EXPOSED_COPPER_SLAB = register("waxed_exposed_copper_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.WAXED_EXPOSED_COPPER)));
    public final Supplier<Block> WAXED_EXPOSED_COPPER_PLATE = register("waxed_exposed_copper_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.WAXED_EXPOSED_COPPER)));
    public final Supplier<Block> WAXED_EXPOSED_COPPER_EDGE = register("waxed_exposed_copper_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.WAXED_EXPOSED_COPPER)));
    public final Supplier<Block> WAXED_WEATHERED_COPPER_STAIRS = register("waxed_weathered_copper_stairs", () -> new CustomStairBlock(Blocks.WAXED_WEATHERED_COPPER.defaultBlockState(), Block.Properties.copy(Blocks.WAXED_WEATHERED_COPPER)));
    public final Supplier<Block> WAXED_WEATHERED_COPPER_SLAB = register("waxed_weathered_copper_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.WAXED_WEATHERED_COPPER)));
    public final Supplier<Block> WAXED_WEATHERED_COPPER_PLATE = register("waxed_weathered_copper_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.WAXED_WEATHERED_COPPER)));
    public final Supplier<Block> WAXED_WEATHERED_COPPER_EDGE = register("waxed_weathered_copper_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.WAXED_WEATHERED_COPPER)));
    public final Supplier<Block> WAXED_OXIDIZED_COPPER_STAIRS = register("waxed_oxidized_copper_stairs", () -> new CustomStairBlock(Blocks.WAXED_OXIDIZED_COPPER.defaultBlockState(), Block.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER)));
    public final Supplier<Block> WAXED_OXIDIZED_COPPER_SLAB = register("waxed_oxidized_copper_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER)));
    public final Supplier<Block> WAXED_OXIDIZED_COPPER_PLATE = register("waxed_oxidized_copper_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER)));
    public final Supplier<Block> WAXED_OXIDIZED_COPPER_EDGE = register("waxed_oxidized_copper_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER)));

    // BUILDING - CALCITE / TUFF / DRIPSTONE

    public final Supplier<Block> CALCITE_STAIRS = register("calcite_stairs", () -> new CustomStairBlock(Blocks.CALCITE.defaultBlockState(), Block.Properties.copy(Blocks.CALCITE)));
    public final Supplier<Block> CALCITE_SLAB = register("calcite_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.CALCITE)));
    public final Supplier<Block> CALCITE_PLATE = register("calcite_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.CALCITE)));
    public final Supplier<Block> CALCITE_EDGE = register("calcite_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.CALCITE)));
    public final Supplier<Block> TUFF_STAIRS = register("tuff_stairs", () -> new CustomStairBlock(Blocks.TUFF.defaultBlockState(), Block.Properties.copy(Blocks.TUFF)));
    public final Supplier<Block> TUFF_SLAB = register("tuff_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.TUFF)));
    public final Supplier<Block> TUFF_PLATE = register("tuff_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.TUFF)));
    public final Supplier<Block> TUFF_EDGE = register("tuff_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.TUFF)));
    public final Supplier<Block> DRIPSTONE_BLOCK_STAIRS = register("dripstone_block_stairs", () -> new CustomStairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), Block.Properties.copy(Blocks.DRIPSTONE_BLOCK)));
    public final Supplier<Block> DRIPSTONE_BLOCK_SLAB = register("dripstone_block_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.DRIPSTONE_BLOCK)));
    public final Supplier<Block> DRIPSTONE_BLOCK_PLATE = register("dripstone_block_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.DRIPSTONE_BLOCK)));
    public final Supplier<Block> DRIPSTONE_BLOCK_EDGE = register("dripstone_block_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.DRIPSTONE_BLOCK)));

    // DIMENSIONS - NYLIUM / SOUL

    public final Supplier<Block> CRIMSON_NYLIUM_SLAB = register("crimson_nylium_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.CRIMSON_NYLIUM)));
    public final Supplier<Block> WARPED_NYLIUM_SLAB = register("warped_nylium_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.WARPED_NYLIUM)));
    public final Supplier<Block> SOUL_SAND_SLAB = register("soul_sand_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.SOUL_SAND)), BlockTags.MINEABLE_WITH_SHOVEL);
    public final Supplier<Block> SOUL_SOIL_SLAB = register("soul_soil_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.SOUL_SOIL)), BlockTags.MINEABLE_WITH_SHOVEL);

    // NATURALS - ICE

    public final Supplier<Block> ICE_STAIRS = register("ice_stairs", () -> new CustomStairBlock(Blocks.ICE.defaultBlockState(), Block.Properties.copy(Blocks.ICE)));
    public final Supplier<Block> ICE_SLAB = register("ice_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.ICE)));
    public final Supplier<Block> ICE_PLATE = register("ice_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.ICE)));
    public final Supplier<Block> ICE_EDGE = register("ice_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.ICE)));
    public final Supplier<Block> PACKED_ICE_STAIRS = register("packed_ice_stairs", () -> new CustomStairBlock(Blocks.PACKED_ICE.defaultBlockState(), Block.Properties.copy(Blocks.PACKED_ICE)));
    public final Supplier<Block> PACKED_ICE_SLAB = register("packed_ice_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.PACKED_ICE)));
    public final Supplier<Block> PACKED_ICE_PLATE = register("packed_ice_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.PACKED_ICE)));
    public final Supplier<Block> PACKED_ICE_EDGE = register("packed_ice_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.PACKED_ICE)));
    public final Supplier<Block> BLUE_ICE_STAIRS = register("blue_ice_stairs", () -> new CustomStairBlock(Blocks.BLUE_ICE.defaultBlockState(), Block.Properties.copy(Blocks.BLUE_ICE)));
    public final Supplier<Block> BLUE_ICE_SLAB = register("blue_ice_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.BLUE_ICE)));
    public final Supplier<Block> BLUE_ICE_PLATE = register("blue_ice_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.BLUE_ICE)));
    public final Supplier<Block> BLUE_ICE_EDGE = register("blue_ice_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.BLUE_ICE)));

    // DIMENSIONS - SMOOTH BASALT

    public final Supplier<Block> SMOOTH_BASALT_STAIRS = register("smooth_basalt_stairs", () -> new CustomStairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(), Block.Properties.copy(Blocks.SMOOTH_BASALT)));
    public final Supplier<Block> SMOOTH_BASALT_SLAB = register("smooth_basalt_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.SMOOTH_BASALT)));
    public final Supplier<Block> SMOOTH_BASALT_PLATE = register("smooth_basalt_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.SMOOTH_BASALT)));
    public final Supplier<Block> SMOOTH_BASALT_EDGE = register("smooth_basalt_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.SMOOTH_BASALT)));

    // DIMENSIONS - BLACKSTONE

    public final Supplier<Block> BLACKSTONE_PLATE = register("blackstone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.BLACKSTONE)));
    public final Supplier<Block> BLACKSTONE_EDGE = register("blackstone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.BLACKSTONE)));

    // DIMENSIONS - POLISHED BLACKSTONE

    public final Supplier<Block> POLISHED_BLACKSTONE_PLATE = register("polished_blackstone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.POLISHED_BLACKSTONE)));
    public final Supplier<Block> POLISHED_BLACKSTONE_EDGE = register("polished_blackstone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.POLISHED_BLACKSTONE)));

    // DIMENSIONS - POLISHED BLACKSTONE BRICKS

    public final Supplier<Block> POLISHED_BLACKSTONE_BRICKS_PLATE = register("polished_blackstone_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public final Supplier<Block> POLISHED_BLACKSTONE_BRICKS_EDGE = register("polished_blackstone_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));

    // DIMENSIONS - END STONE

    public final Supplier<Block> END_STONE_STAIRS = register("end_stone_stairs", () -> new CustomStairBlock(Blocks.END_STONE.defaultBlockState(), Block.Properties.copy(Blocks.END_STONE)));
    public final Supplier<Block> END_STONE_SLAB = register("end_stone_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.END_STONE)));
    public final Supplier<Block> END_STONE_PLATE = register("end_stone_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.END_STONE)));
    public final Supplier<Block> END_STONE_EDGE = register("end_stone_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.END_STONE)));

    // DIMENSIONS - END STONE BRICKS

    public final Supplier<Block> END_STONE_BRICKS_PLATE = register("end_stone_bricks_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.END_STONE_BRICKS)));
    public final Supplier<Block> END_STONE_BRICKS_EDGE = register("end_stone_bricks_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.END_STONE_BRICKS)));

    // DIMENSIONS - PURPUR BLOCK

    public final Supplier<Block> PURPUR_BLOCK_PLATE = register("purpur_block_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.PURPUR_BLOCK)));
    public final Supplier<Block> PURPUR_BLOCK_EDGE = register("purpur_block_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.PURPUR_BLOCK)));

    // COLORED - TERRACOTTA

    // Plain
    public final Supplier<Block> TERRACOTTA_STAIRS = register("terracotta_stairs", () -> new CustomStairBlock(Blocks.TERRACOTTA.defaultBlockState(), Block.Properties.copy(Blocks.TERRACOTTA)));
    public final Supplier<Block> TERRACOTTA_PLATE = register("terracotta_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> TERRACOTTA_SLAB = register("terracotta_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> TERRACOTTA_EDGE = register("terracotta_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> TERRACOTTA_WALL = register("terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));

    // Orange
    public final Supplier<Block> ORANGE_TERRACOTTA_STAIRS = register("orange_terracotta_stairs", () -> new CustomStairBlock(Blocks.ORANGE_TERRACOTTA.defaultBlockState(), Block.Properties.copy(Blocks.ORANGE_TERRACOTTA)));
    public final Supplier<Block> ORANGE_TERRACOTTA_PLATE = register("orange_terracotta_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> ORANGE_TERRACOTTA_SLAB = register("orange_terracotta_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> ORANGE_TERRACOTTA_EDGE = register("orange_terracotta_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> ORANGE_TERRACOTTA_WALL = register("orange_terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));

    // Red
    public final Supplier<Block> RED_TERRACOTTA_STAIRS = register("red_terracotta_stairs", () -> new CustomStairBlock(Blocks.RED_TERRACOTTA.defaultBlockState(), Block.Properties.copy(Blocks.RED_TERRACOTTA)));
    public final Supplier<Block> RED_TERRACOTTA_PLATE = register("red_terracotta_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> RED_TERRACOTTA_SLAB = register("red_terracotta_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> RED_TERRACOTTA_EDGE = register("red_terracotta_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> RED_TERRACOTTA_WALL = register("red_terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));

    // White
    public final Supplier<Block> WHITE_TERRACOTTA_STAIRS = register("white_terracotta_stairs", () -> new CustomStairBlock(Blocks.WHITE_TERRACOTTA.defaultBlockState(), Block.Properties.copy(Blocks.WHITE_TERRACOTTA)));
    public final Supplier<Block> WHITE_TERRACOTTA_SLAB = register("white_terracotta_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> WHITE_TERRACOTTA_PLATE = register("white_terracotta_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> WHITE_TERRACOTTA_EDGE = register("white_terracotta_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> WHITE_TERRACOTTA_WALL = register("white_terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));

    // Light Gray
    public final Supplier<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = register("light_gray_terracotta_stairs", () -> new CustomStairBlock(Blocks.LIGHT_GRAY_TERRACOTTA.defaultBlockState(), Block.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public final Supplier<Block> LIGHT_GRAY_TERRACOTTA_SLAB = register("light_gray_terracotta_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> LIGHT_GRAY_TERRACOTTA_PLATE = register("light_gray_terracotta_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> LIGHT_GRAY_TERRACOTTA_EDGE = register("light_gray_terracotta_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> LIGHT_GRAY_TERRACOTTA_WALL = register("light_gray_terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));

    // Gray
    public final Supplier<Block> GRAY_TERRACOTTA_STAIRS = register("gray_terracotta_stairs", () -> new CustomStairBlock(Blocks.GRAY_TERRACOTTA.defaultBlockState(), Block.Properties.copy(Blocks.GRAY_TERRACOTTA)));
    public final Supplier<Block> GRAY_TERRACOTTA_SLAB = register("gray_terracotta_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> GRAY_TERRACOTTA_PLATE = register("gray_terracotta_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> GRAY_TERRACOTTA_EDGE = register("gray_terracotta_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> GRAY_TERRACOTTA_WALL = register("gray_terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));

    // Black
    public final Supplier<Block> BLACK_TERRACOTTA_STAIRS = register("black_terracotta_stairs", () -> new CustomStairBlock(Blocks.BLACK_TERRACOTTA.defaultBlockState(), Block.Properties.copy(Blocks.BLACK_TERRACOTTA)));
    public final Supplier<Block> BLACK_TERRACOTTA_SLAB = register("black_terracotta_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> BLACK_TERRACOTTA_PLATE = register("black_terracotta_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> BLACK_TERRACOTTA_EDGE = register("black_terracotta_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> BLACK_TERRACOTTA_WALL = register("black_terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));

    // Brown
    public final Supplier<Block> BROWN_TERRACOTTA_STAIRS = register("brown_terracotta_stairs", () -> new CustomStairBlock(Blocks.BROWN_TERRACOTTA.defaultBlockState(), Block.Properties.copy(Blocks.BROWN_TERRACOTTA)));
    public final Supplier<Block> BROWN_TERRACOTTA_SLAB = register("brown_terracotta_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> BROWN_TERRACOTTA_PLATE = register("brown_terracotta_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> BROWN_TERRACOTTA_EDGE = register("brown_terracotta_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> BROWN_TERRACOTTA_WALL = register("brown_terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));

    // Yellow
    public final Supplier<Block> YELLOW_TERRACOTTA_STAIRS = register("yellow_terracotta_stairs", () -> new CustomStairBlock(Blocks.YELLOW_TERRACOTTA.defaultBlockState(), Block.Properties.copy(Blocks.YELLOW_TERRACOTTA)));
    public final Supplier<Block> YELLOW_TERRACOTTA_SLAB = register("yellow_terracotta_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> YELLOW_TERRACOTTA_PLATE = register("yellow_terracotta_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> YELLOW_TERRACOTTA_EDGE = register("yellow_terracotta_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> YELLOW_TERRACOTTA_WALL = register("yellow_terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));

    // Lime
    public final Supplier<Block> LIME_TERRACOTTA_STAIRS = register("lime_terracotta_stairs", () -> new CustomStairBlock(Blocks.LIME_TERRACOTTA.defaultBlockState(), Block.Properties.copy(Blocks.LIME_TERRACOTTA)));
    public final Supplier<Block> LIME_TERRACOTTA_SLAB = register("lime_terracotta_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> LIME_TERRACOTTA_PLATE = register("lime_terracotta_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> LIME_TERRACOTTA_EDGE = register("lime_terracotta_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> LIME_TERRACOTTA_WALL = register("lime_terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));

    // Green
    public final Supplier<Block> GREEN_TERRACOTTA_STAIRS = register("green_terracotta_stairs", () -> new CustomStairBlock(Blocks.GREEN_TERRACOTTA.defaultBlockState(), Block.Properties.copy(Blocks.GREEN_TERRACOTTA)));
    public final Supplier<Block> GREEN_TERRACOTTA_SLAB = register("green_terracotta_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> GREEN_TERRACOTTA_PLATE = register("green_terracotta_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> GREEN_TERRACOTTA_EDGE = register("green_terracotta_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> GREEN_TERRACOTTA_WALL = register("green_terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));

    // Cyan
    public final Supplier<Block> CYAN_TERRACOTTA_STAIRS = register("cyan_terracotta_stairs", () -> new CustomStairBlock(Blocks.CYAN_TERRACOTTA.defaultBlockState(), Block.Properties.copy(Blocks.CYAN_TERRACOTTA)));
    public final Supplier<Block> CYAN_TERRACOTTA_SLAB = register("cyan_terracotta_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> CYAN_TERRACOTTA_PLATE = register("cyan_terracotta_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> CYAN_TERRACOTTA_EDGE = register("cyan_terracotta_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> CYAN_TERRACOTTA_WALL = register("cyan_terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));

    // Light Blue
    public final Supplier<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = register("light_blue_terracotta_stairs", () -> new CustomStairBlock(Blocks.LIGHT_BLUE_TERRACOTTA.defaultBlockState(), Block.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public final Supplier<Block> LIGHT_BLUE_TERRACOTTA_SLAB = register("light_blue_terracotta_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> LIGHT_BLUE_TERRACOTTA_PLATE = register("light_blue_terracotta_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> LIGHT_BLUE_TERRACOTTA_EDGE = register("light_blue_terracotta_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> LIGHT_BLUE_TERRACOTTA_WALL = register("light_blue_terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));

    // Blue
    public final Supplier<Block> BLUE_TERRACOTTA_STAIRS = register("blue_terracotta_stairs", () -> new CustomStairBlock(Blocks.BLUE_TERRACOTTA.defaultBlockState(), Block.Properties.copy(Blocks.BLUE_TERRACOTTA)));
    public final Supplier<Block> BLUE_TERRACOTTA_SLAB = register("blue_terracotta_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> BLUE_TERRACOTTA_PLATE = register("blue_terracotta_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> BLUE_TERRACOTTA_EDGE = register("blue_terracotta_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> BLUE_TERRACOTTA_WALL = register("blue_terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));

    // Purple
    public final Supplier<Block> PURPLE_TERRACOTTA_STAIRS = register("purple_terracotta_stairs", () -> new CustomStairBlock(Blocks.PURPLE_TERRACOTTA.defaultBlockState(), Block.Properties.copy(Blocks.PURPLE_TERRACOTTA)));
    public final Supplier<Block> PURPLE_TERRACOTTA_SLAB = register("purple_terracotta_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> PURPLE_TERRACOTTA_PLATE = register("purple_terracotta_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> PURPLE_TERRACOTTA_EDGE = register("purple_terracotta_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> PURPLE_TERRACOTTA_WALL = register("purple_terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));

    // Magenta
    public final Supplier<Block> MAGENTA_TERRACOTTA_STAIRS = register("magenta_terracotta_stairs", () -> new CustomStairBlock(Blocks.MAGENTA_TERRACOTTA.defaultBlockState(), Block.Properties.copy(Blocks.MAGENTA_TERRACOTTA)));
    public final Supplier<Block> MAGENTA_TERRACOTTA_SLAB = register("magenta_terracotta_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> MAGENTA_TERRACOTTA_PLATE = register("magenta_terracotta_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> MAGENTA_TERRACOTTA_EDGE = register("magenta_terracotta_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> MAGENTA_TERRACOTTA_WALL = register("magenta_terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));

    // Pink
    public final Supplier<Block> PINK_TERRACOTTA_STAIRS = register("pink_terracotta_stairs", () -> new CustomStairBlock(Blocks.PINK_TERRACOTTA.defaultBlockState(), Block.Properties.copy(Blocks.PINK_TERRACOTTA)));
    public final Supplier<Block> PINK_TERRACOTTA_SLAB = register("pink_terracotta_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> PINK_TERRACOTTA_PLATE = register("pink_terracotta_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> PINK_TERRACOTTA_EDGE = register("pink_terracotta_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> PINK_TERRACOTTA_WALL = register("pink_terracotta_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TERRACOTTA)));

    // COLORED - CONCRETE
    public final Supplier<Block> WHITE_CONCRETE_STAIRS = register("white_concrete_stairs", () -> new CustomStairBlock(Blocks.WHITE_CONCRETE.defaultBlockState(), Block.Properties.copy(Blocks.WHITE_CONCRETE)));
    public final Supplier<Block> WHITE_CONCRETE_SLAB = register("white_concrete_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> WHITE_CONCRETE_PLATE = register("white_concrete_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> WHITE_CONCRETE_EDGE = register("white_concrete_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> WHITE_CONCRETE_WALL = register("white_concrete_wall", () -> new WallBlock(Block.Properties.copy(Blocks.WHITE_CONCRETE)));

    public final Supplier<Block> ORANGE_CONCRETE_STAIRS = register("orange_concrete_stairs", () -> new CustomStairBlock(Blocks.ORANGE_CONCRETE.defaultBlockState(), Block.Properties.copy(Blocks.ORANGE_CONCRETE)));
    public final Supplier<Block> ORANGE_CONCRETE_SLAB = register("orange_concrete_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> ORANGE_CONCRETE_PLATE = register("orange_concrete_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> ORANGE_CONCRETE_EDGE = register("orange_concrete_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> ORANGE_CONCRETE_WALL = register("orange_concrete_wall", () -> new WallBlock(Block.Properties.copy(Blocks.ORANGE_CONCRETE)));

    public final Supplier<Block> MAGENTA_CONCRETE_STAIRS = register("magenta_concrete_stairs", () -> new CustomStairBlock(Blocks.MAGENTA_CONCRETE.defaultBlockState(), Block.Properties.copy(Blocks.MAGENTA_CONCRETE)));
    public final Supplier<Block> MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> MAGENTA_CONCRETE_PLATE = register("magenta_concrete_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> MAGENTA_CONCRETE_EDGE = register("magenta_concrete_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> MAGENTA_CONCRETE_WALL = register("magenta_concrete_wall", () -> new WallBlock(Block.Properties.copy(Blocks.MAGENTA_CONCRETE)));

    public final Supplier<Block> LIGHT_BLUE_CONCRETE_STAIRS = register("light_blue_concrete_stairs", () -> new CustomStairBlock(Blocks.LIGHT_BLUE_CONCRETE.defaultBlockState(), Block.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public final Supplier<Block> LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> LIGHT_BLUE_CONCRETE_PLATE = register("light_blue_concrete_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> LIGHT_BLUE_CONCRETE_EDGE = register("light_blue_concrete_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> LIGHT_BLUE_CONCRETE_WALL = register("light_blue_concrete_wall", () -> new WallBlock(Block.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)));

    public final Supplier<Block> YELLOW_CONCRETE_STAIRS = register("yellow_concrete_stairs", () -> new CustomStairBlock(Blocks.YELLOW_CONCRETE.defaultBlockState(), Block.Properties.copy(Blocks.YELLOW_CONCRETE)));
    public final Supplier<Block> YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> YELLOW_CONCRETE_PLATE = register("yellow_concrete_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> YELLOW_CONCRETE_EDGE = register("yellow_concrete_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> YELLOW_CONCRETE_WALL = register("yellow_concrete_wall", () -> new WallBlock(Block.Properties.copy(Blocks.YELLOW_CONCRETE)));

    public final Supplier<Block> LIME_CONCRETE_STAIRS = register("lime_concrete_stairs", () -> new CustomStairBlock(Blocks.LIME_CONCRETE.defaultBlockState(), Block.Properties.copy(Blocks.LIME_CONCRETE)));
    public final Supplier<Block> LIME_CONCRETE_SLAB = register("lime_concrete_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> LIME_CONCRETE_PLATE = register("lime_concrete_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> LIME_CONCRETE_EDGE = register("lime_concrete_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> LIME_CONCRETE_WALL = register("lime_concrete_wall", () -> new WallBlock(Block.Properties.copy(Blocks.LIME_CONCRETE)));

    public final Supplier<Block> PINK_CONCRETE_STAIRS = register("pink_concrete_stairs", () -> new CustomStairBlock(Blocks.PINK_CONCRETE.defaultBlockState(), Block.Properties.copy(Blocks.PINK_CONCRETE)));
    public final Supplier<Block> PINK_CONCRETE_SLAB = register("pink_concrete_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> PINK_CONCRETE_PLATE = register("pink_concrete_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> PINK_CONCRETE_EDGE = register("pink_concrete_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> PINK_CONCRETE_WALL = register("pink_concrete_wall", () -> new WallBlock(Block.Properties.copy(Blocks.PINK_CONCRETE)));

    public final Supplier<Block> GRAY_CONCRETE_STAIRS = register("gray_concrete_stairs", () -> new CustomStairBlock(Blocks.GRAY_CONCRETE.defaultBlockState(), Block.Properties.copy(Blocks.GRAY_CONCRETE)));
    public final Supplier<Block> GRAY_CONCRETE_SLAB = register("gray_concrete_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> GRAY_CONCRETE_PLATE = register("gray_concrete_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> GRAY_CONCRETE_EDGE = register("gray_concrete_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> GRAY_CONCRETE_WALL = register("gray_concrete_wall", () -> new WallBlock(Block.Properties.copy(Blocks.GRAY_CONCRETE)));

    public final Supplier<Block> LIGHT_GRAY_CONCRETE_STAIRS = register("light_gray_concrete_stairs", () -> new CustomStairBlock(Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState(), Block.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public final Supplier<Block> LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> LIGHT_GRAY_CONCRETE_PLATE = register("light_gray_concrete_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> LIGHT_GRAY_CONCRETE_EDGE = register("light_gray_concrete_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> LIGHT_GRAY_CONCRETE_WALL = register("light_gray_concrete_wall", () -> new WallBlock(Block.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)));

    public final Supplier<Block> CYAN_CONCRETE_STAIRS = register("cyan_concrete_stairs", () -> new CustomStairBlock(Blocks.CYAN_CONCRETE.defaultBlockState(), Block.Properties.copy(Blocks.CYAN_CONCRETE)));
    public final Supplier<Block> CYAN_CONCRETE_SLAB = register("cyan_concrete_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> CYAN_CONCRETE_PLATE = register("cyan_concrete_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> CYAN_CONCRETE_EDGE = register("cyan_concrete_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> CYAN_CONCRETE_WALL = register("cyan_concrete_wall", () -> new WallBlock(Block.Properties.copy(Blocks.CYAN_CONCRETE)));

    public final Supplier<Block> PURPLE_CONCRETE_STAIRS = register("purple_concrete_stairs", () -> new CustomStairBlock(Blocks.PURPLE_CONCRETE.defaultBlockState(), Block.Properties.copy(Blocks.PURPLE_CONCRETE)));
    public final Supplier<Block> PURPLE_CONCRETE_SLAB = register("purple_concrete_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> PURPLE_CONCRETE_PLATE = register("purple_concrete_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> PURPLE_CONCRETE_EDGE = register("purple_concrete_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> PURPLE_CONCRETE_WALL = register("purple_concrete_wall", () -> new WallBlock(Block.Properties.copy(Blocks.PURPLE_CONCRETE)));

    public final Supplier<Block> BLUE_CONCRETE_STAIRS = register("blue_concrete_stairs", () -> new CustomStairBlock(Blocks.BLUE_CONCRETE.defaultBlockState(), Block.Properties.copy(Blocks.BLUE_CONCRETE)));
    public final Supplier<Block> BLUE_CONCRETE_SLAB = register("blue_concrete_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> BLUE_CONCRETE_PLATE = register("blue_concrete_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> BLUE_CONCRETE_EDGE = register("blue_concrete_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> BLUE_CONCRETE_WALL = register("blue_concrete_wall", () -> new WallBlock(Block.Properties.copy(Blocks.BLUE_CONCRETE)));

    public final Supplier<Block> BROWN_CONCRETE_STAIRS = register("brown_concrete_stairs", () -> new CustomStairBlock(Blocks.BROWN_CONCRETE.defaultBlockState(), Block.Properties.copy(Blocks.BROWN_CONCRETE)));
    public final Supplier<Block> BROWN_CONCRETE_SLAB = register("brown_concrete_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> BROWN_CONCRETE_PLATE = register("brown_concrete_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> BROWN_CONCRETE_EDGE = register("brown_concrete_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> BROWN_CONCRETE_WALL = register("brown_concrete_wall", () -> new WallBlock(Block.Properties.copy(Blocks.BROWN_CONCRETE)));

    public final Supplier<Block> GREEN_CONCRETE_STAIRS = register("green_concrete_stairs", () -> new CustomStairBlock(Blocks.GREEN_CONCRETE.defaultBlockState(), Block.Properties.copy(Blocks.GREEN_CONCRETE)));
    public final Supplier<Block> GREEN_CONCRETE_SLAB = register("green_concrete_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> GREEN_CONCRETE_PLATE = register("green_concrete_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> GREEN_CONCRETE_EDGE = register("green_concrete_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> GREEN_CONCRETE_WALL = register("green_concrete_wall", () -> new WallBlock(Block.Properties.copy(Blocks.GREEN_CONCRETE)));

    public final Supplier<Block> RED_CONCRETE_STAIRS = register("red_concrete_stairs", () -> new CustomStairBlock(Blocks.RED_CONCRETE.defaultBlockState(), Block.Properties.copy(Blocks.RED_CONCRETE)));
    public final Supplier<Block> RED_CONCRETE_SLAB = register("red_concrete_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> RED_CONCRETE_PLATE = register("red_concrete_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> RED_CONCRETE_EDGE = register("red_concrete_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> RED_CONCRETE_WALL = register("red_concrete_wall", () -> new WallBlock(Block.Properties.copy(Blocks.RED_CONCRETE)));

    public final Supplier<Block> BLACK_CONCRETE_STAIRS = register("black_concrete_stairs", () -> new CustomStairBlock(Blocks.BLACK_CONCRETE.defaultBlockState(), Block.Properties.copy(Blocks.BLACK_CONCRETE)));
    public final Supplier<Block> BLACK_CONCRETE_SLAB = register("black_concrete_slab", () -> new SlabBlockDoT(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> BLACK_CONCRETE_PLATE = register("black_concrete_plate", () -> new PlateBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> BLACK_CONCRETE_EDGE = register("black_concrete_edge", () -> new EdgeBlock(Block.Properties.copy(Blocks.STONE)));
    public final Supplier<Block> BLACK_CONCRETE_WALL = register("black_concrete_wall", () -> new WallBlock(Block.Properties.copy(Blocks.BLACK_CONCRETE)));

    /**
     * These have to be registered last due to dependencies on other blocks and the items registry too.
     */
    public void postRegister() {

    }

    public <T extends Block> Supplier<T> register(String id, Supplier<T> block) {
        return this.registerWithItem(id, block, (T blockObject) -> new BlockItem(blockObject, new Item.Properties()));
    }

    public <T extends Block> Supplier<T> register(String id, Supplier<T> block, TagKey<Block>... tagKeys) {
        return this.registerWithItem(id, block, (T blockObject) -> new BlockItem(blockObject, new Item.Properties()), tagKeys);
    }

    public abstract <T extends Block, Y extends Item> Supplier<T> registerWithItem(String id, Supplier<T> block, Function<T, Y> item, TagKey<Block>... tags);

    public <T extends Block> void addBlockTag(Supplier<T> block, TagKey<Block> tag){
        blockTagsMap.computeIfAbsent(tag, k -> new HashSet<>()).add((Supplier<Block>) block);
    }

    //Old Function
    private static ToIntFunction<BlockState> litBlockEmission(final int lightValue) {
        return state -> state.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }
}
