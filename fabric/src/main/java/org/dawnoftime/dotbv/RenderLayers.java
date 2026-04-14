package org.dawnoftime.dotbv;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import org.dawnoftime.dotbv.registry.DoTBVBlocksRegistry;

public class RenderLayers {
    public static void init() {
        // Oak
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.OAK_BEAM.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.OAK_PERGOLA.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.OAK_LATTICE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.OAK_SUPPORT_BEAM.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.OAK_LEAVES_EDGE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.OAK_LEAVES_PLATE.get(), RenderType.cutout());
        // Spruce
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.SPRUCE_LEAVES_EDGE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.SPRUCE_LEAVES_PLATE.get(), RenderType.cutout());
        // Birch
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.BIRCH_BEAM.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.BIRCH_PERGOLA.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.BIRCH_LATTICE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.BIRCH_SUPPORT_BEAM.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.BIRCH_LEAVES_EDGE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.BIRCH_LEAVES_PLATE.get(), RenderType.cutout());
        // Jungle
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.JUNGLE_BEAM.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.JUNGLE_PERGOLA.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.JUNGLE_LATTICE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.JUNGLE_SUPPORT_BEAM.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.JUNGLE_LEAVES_EDGE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.JUNGLE_LEAVES_PLATE.get(), RenderType.cutout());
        // Acacia
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.ACACIA_BEAM.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.ACACIA_PERGOLA.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.ACACIA_LATTICE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.ACACIA_SUPPORT_BEAM.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.ACACIA_LEAVES_EDGE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.ACACIA_LEAVES_PLATE.get(), RenderType.cutout());
        // Dark Oak
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.DARK_OAK_BEAM.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.DARK_OAK_PERGOLA.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.DARK_OAK_LATTICE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.DARK_OAK_SUPPORT_BEAM.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.DARK_OAK_LEAVES_EDGE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.DARK_OAK_LEAVES_PLATE.get(), RenderType.cutout());
        // Cherry
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.CHERRY_BEAM.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.CHERRY_PERGOLA.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.CHERRY_LATTICE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.CHERRY_SUPPORT_BEAM.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.CHERRY_LEAVES_EDGE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.CHERRY_LEAVES_PLATE.get(), RenderType.cutout());
        // Mangrove
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.MANGROVE_BEAM.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.MANGROVE_PERGOLA.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.MANGROVE_LATTICE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.MANGROVE_SUPPORT_BEAM.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.MANGROVE_LEAVES_EDGE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.MANGROVE_LEAVES_PLATE.get(), RenderType.cutout());
        // Bamboo
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.BAMBOO_BEAM.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.BAMBOO_PERGOLA.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.BAMBOO_LATTICE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.BAMBOO_SUPPORT_BEAM.get(), RenderType.cutout());
        // Crimson
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.CRIMSON_BEAM.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.CRIMSON_PERGOLA.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.CRIMSON_LATTICE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.CRIMSON_SUPPORT_BEAM.get(), RenderType.cutout());
        // Warped
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.WARPED_BEAM.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.WARPED_PERGOLA.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.WARPED_LATTICE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DoTBVBlocksRegistry.INSTANCE.WARPED_SUPPORT_BEAM.get(), RenderType.cutout());
    }
}
