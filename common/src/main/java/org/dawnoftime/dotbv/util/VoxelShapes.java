package org.dawnoftime.dotbv.util;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import static org.dawnoftime.dotbv.util.VoxelShapesBuilder.*;

public class VoxelShapes {

    // Test shape
    // The Y are decimals defined so that it still accept 0.01 or 0.5, values used to avoid overlapping textures or in fancy models.
    // Default shapes
    public static final VoxelShape[] FULL_SHAPE = new VoxelShape[]{Shapes.block()};

    // Custom shapes
    public static final VoxelShape[] BEAM_SHAPES = makeBeamShapes();
     public static final VoxelShape[] EDGE_SHAPES = makeEdgeShapes();
     public static final VoxelShape[] LATTICE_FOUR_SIDES = VoxelShapesBuilder.generateFourSidesShapes(Block.box(0.0D, 0.0D, 14.0D, 16.0D, 16.0D, 16.0D));

   public static final VoxelShape[] PERGOLA_SHAPES = makePergolaShapes();
    public static final VoxelShape[] PLATE_SHAPES = makePlateShapes();
 public static final VoxelShape[] SUPPORT_BEAM_SHAPES = makeSupportBeamShapes();
    public static final VoxelShape[] SUPPORT_SLAB_SHAPES = makeSupportSlabShapes();

}
