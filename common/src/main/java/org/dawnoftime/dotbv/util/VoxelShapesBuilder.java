package org.dawnoftime.dotbv.util;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VoxelShapesBuilder {
    /**
     * Generates all orientations based
     * @param shapes Array of Shapes for the South rotation.
     * @param nonRotatedShapes Additional shapes that will be added at the end of the rotated Shapes.
     * @return A list of shapes ordered as following : South, West, North, East.
     */
    public static VoxelShape[] generateHorizontalShapes(final VoxelShape[] shapes, VoxelShape... nonRotatedShapes) {
        final VoxelShape[] newShape = {Shapes.empty()};
        final VoxelShape[] newShapes = new VoxelShape[shapes.length * 4 + nonRotatedShapes.length];
        int i = 0;
        // First we copy the provided array at the start of the new one.
        for (final VoxelShape shape : shapes) {
            newShapes[i] = shape;
            i++;
        }
        // Then rotate the provided array in each direction, and add it the new array.
        for (int rotation = 1; rotation < 4; rotation++) {
            int j = 0;
            for (final VoxelShape shape : shapes) {
                shape.forAllBoxes((minX, minY, minZ, maxX, maxY, maxZ) -> newShape[0] = Shapes.or(newShape[0], Shapes.box(1 - maxZ, minY, minX, 1 - minZ, maxY, maxX)));
                shapes[j] = newShape[0];
                newShapes[i] = newShape[0];
                newShape[0] = Shapes.empty();
                i++;
                j++;
            }
        }
        // Lastly, we add the non-rotated shapes at the end of the array.
        for (final VoxelShape shape : nonRotatedShapes) {
            newShapes[i] = shape;
            i++;
        }
        return newShapes;
    }

    /**
     * Generates all the possible combination of the voxel shape passed in parameter for all horizontal rotations.
     * @param vsSouth : VoxelShape for the SOUTH Direction.
     * @return Array of VoxelShapes, with index : [0 and 15 → S+W+N+E, 1 → S, 2 → W, 3 → S+W, 4 → N, 5 → S+N, 6 → W+N, 7 → S+W+N,
     * 8 → E, 9 → S+E, 10 → W+E, 11 → S+W+E, 12 → N+E, 13 → S+N+E, 14 → W+N+E
     */
    public static VoxelShape[] generateFourSidesShapes(VoxelShape vsSouth) {
        VoxelShape[] horizontalShapes = generateHorizontalShapes(new VoxelShape[]{vsSouth});
        VoxelShape vsWest = horizontalShapes[1];
        VoxelShape vsNorth = horizontalShapes[2];
        VoxelShape vsEast = horizontalShapes[3];
        VoxelShape vsSW = Shapes.or(vsSouth, vsWest);
        VoxelShape vsWN = Shapes.or(vsWest,  vsNorth);
        VoxelShape vsNE = Shapes.or(vsNorth, vsEast);
        VoxelShape vsES = Shapes.or(vsEast,  vsSouth);
        VoxelShape all  = Shapes.or(vsSW, vsNE);

        return new VoxelShape[]{
                all,                          // 0
                vsSouth,                      // 1
                vsWest,                       // 2
                vsSW,                         // 3
                vsNorth,                      // 4
                Shapes.or(vsSouth, vsNorth),  // 5
                vsWN,                         // 6
                Shapes.or(vsSW, vsNorth),     // 7
                vsEast,                       // 8
                vsES,                         // 9
                Shapes.or(vsWest, vsEast),    // 10
                Shapes.or(vsSW, vsEast),      // 11
                vsNE,                         // 12
                Shapes.or(vsSouth, vsNE),     // 13
                Shapes.or(vsWN, vsEast)       // 14
        };
    }

    protected static VoxelShape[] makePlateShapes() {
        final VoxelShape vsNorthFlat = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 8.0D);
        final VoxelShape vsEastFlat = Block.box(8.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
        final VoxelShape vsSouthFlat = Block.box(0.0D, 0.0D, 8.0D, 16.0D, 16.0D, 16.0D);
        final VoxelShape vsWestFlat = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 16.0D, 16.0D);
        final VoxelShape vsNorthWestCorner = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 16.0D, 8.0D);
        final VoxelShape vsNorthEastCorner = Block.box(8.0D, 0.0D, 0.0D, 16.0D, 16.0D, 8.0D);
        final VoxelShape vsSouthEastCorner = Block.box(8.0D, 0.0D, 8.0D, 16.0D, 16.0D, 16.0D);
        final VoxelShape vsSouthWestCorner = Block.box(0.0D, 0.0D, 8.0D, 8.0D, 16.0D, 16.0D);
        return new VoxelShape[]{vsNorthWestCorner, vsNorthFlat, Shapes.or(vsNorthFlat, vsSouthWestCorner), vsNorthEastCorner, vsEastFlat, Shapes.or(vsEastFlat, vsNorthWestCorner), vsSouthEastCorner, vsSouthFlat, Shapes.or(vsSouthFlat, vsNorthEastCorner), vsSouthWestCorner, vsWestFlat, Shapes.or(vsWestFlat, vsSouthEastCorner),};
    }

    protected static VoxelShape[] makeBeamShapes() {
        VoxelShape vsAxisX = Block.box(0.0D, 4.0D, 4.0D, 16.0D, 12.0D, 12.0D);
        VoxelShape vsAxisZ = Block.box(4.0D, 4.0D, 0.0D, 12.0D, 12.0D, 16.0D);
        VoxelShape vsAxisXZ = Shapes.or(vsAxisX, vsAxisZ);
        VoxelShape vsAxisY = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 16.0D, 13.0D);
        VoxelShape vsAxisY_bottom = Shapes.or(vsAxisY, Block.box(2.0D, 0.0D, 2.0D, 14.0D, 4.0D, 14.0D));
        return new VoxelShape[]{
                vsAxisX,
                vsAxisZ,
                vsAxisXZ,
                vsAxisY,
                Shapes.or(vsAxisY, vsAxisX),
                Shapes.or(vsAxisY, vsAxisZ),
                Shapes.or(vsAxisY, vsAxisXZ),
                vsAxisY_bottom,
                Shapes.or(vsAxisY_bottom, vsAxisX),
                Shapes.or(vsAxisY_bottom, vsAxisZ),
                Shapes.or(vsAxisY_bottom, vsAxisXZ)
        };
    }

    protected static VoxelShape[] makePergolaShapes() {
        VoxelShape vsAxisX = Block.box(0.0D, 5.0D, 6.0D, 16.0D, 11.0D, 10.0D);
        VoxelShape vsAxisZ = Block.box(6.0D, 5.0D, 0.0D, 10.0D, 11.0D, 16.0D);
        VoxelShape vsAxisXZ = Shapes.or(vsAxisX, vsAxisZ);
        VoxelShape vsAxisY = Block.box(5.0D, 0.0D, 5.0D, 11.0D, 16.0D, 11.0D);
        return new VoxelShape[]{
                vsAxisX,
                vsAxisZ,
                vsAxisXZ,
                vsAxisY,
                Shapes.or(vsAxisY, vsAxisX),
                Shapes.or(vsAxisY, vsAxisZ),
                Shapes.or(vsAxisY, vsAxisXZ),
        };
    }

    protected static VoxelShape[] makeEdgeShapes() {
        final VoxelShape vsNorthFlat = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 8.0D);
        final VoxelShape vsEastFlat = Block.box(8.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
        final VoxelShape vsSouthFlat = Block.box(0.0D, 0.0D, 8.0D, 16.0D, 8.0D, 16.0D);
        final VoxelShape vsWestFlat = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 8.0D, 16.0D);
        final VoxelShape vsNorthWestCorner = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 8.0D, 8.0D);
        final VoxelShape vsNorthEastCorner = Block.box(8.0D, 0.0D, 0.0D, 16.0D, 8.0D, 8.0D);
        final VoxelShape vsSouthEastCorner = Block.box(8.0D, 0.0D, 8.0D, 16.0D, 8.0D, 16.0D);
        final VoxelShape vsSouthWestCorner = Block.box(0.0D, 0.0D, 8.0D, 8.0D, 8.0D, 16.0D);
        VoxelShape[] voxelShapes = new VoxelShape[24];
        VoxelShape[] voxelShapesBottom = {
                vsNorthWestCorner,
                vsNorthFlat,
                Shapes.or(vsNorthFlat, vsSouthWestCorner),
                vsNorthEastCorner,
                vsEastFlat,
                Shapes.or(vsEastFlat, vsNorthWestCorner),
                vsSouthEastCorner,
                vsSouthFlat,
                Shapes.or(vsSouthFlat, vsNorthEastCorner),
                vsSouthWestCorner,
                vsWestFlat,
                Shapes.or(vsWestFlat, vsSouthEastCorner)
        };
        System.arraycopy(voxelShapesBottom, 0, voxelShapes, 0, voxelShapesBottom.length);
        for (int i = 0; i < voxelShapesBottom.length; i++) {
            voxelShapes[i + voxelShapesBottom.length] = voxelShapesBottom[i].move(0.0D, 0.5D, 0.0D);
        }
        return voxelShapes;
    }

      protected static VoxelShape[] makeSupportSlabShapes() {
        VoxelShape vs = Block.box(0.0D, 12.0D, 0.0D, 16.0D, 16.0D, 16.0D);
        VoxelShape vsFourPx = Shapes.or(vs, Block.box(6.0D, 0.0D, 6.0D, 10.0D, 16.0D, 10.0D));
        VoxelShape vsEightPx = Shapes.or(vs, Block.box(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D));
        VoxelShape vsTenPx = Shapes.or(vs, Block.box(3.0D, 0.0D, 3.0D, 13.0D, 16.0D, 13.0D));
        return new VoxelShape[]{vs, vsFourPx, vsEightPx, vsTenPx};
    }


    protected static VoxelShape[] makeSupportBeamShapes() {
        VoxelShape vs = Block.box(0.0D, 12.0D, 0.0D, 16.0D, 16.0D, 16.0D);
        VoxelShape vsAxisX = Shapes.or(vs, Block.box(0.0D, 4.0D, 4.0D, 16.0D, 12.0D, 12.0D));
        VoxelShape vsAxisZ = Shapes.or(vs, Block.box(4.0D, 4.0D, 0.0D, 12.0D, 12.0D, 16.0D));
        VoxelShape vsAxisXZ = Shapes.or(vsAxisX, Block.box(4.0D, 4.0D, 0.0D, 12.0D, 12.0D, 16.0D));
        VoxelShape vsAxis4px = Block.box(6.0D, 0.0D, 6.0D, 10.0D, 16.0D, 10.0D);
        VoxelShape vsAxis8px = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);
        VoxelShape vsAxis10px = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 16.0D, 13.0D);
        return new VoxelShape[]{
                vsAxisX,
                vsAxisZ,
                vsAxisXZ,
                Shapes.or(vsAxisX, vsAxis4px),
                Shapes.or(vsAxisZ, vsAxis4px),
                Shapes.or(vsAxisXZ, vsAxis4px),
                Shapes.or(vsAxisX, vsAxis8px),
                Shapes.or(vsAxisZ, vsAxis8px),
                Shapes.or(vsAxisXZ, vsAxis8px),
                Shapes.or(vsAxisX, vsAxis10px),
                Shapes.or(vsAxisZ, vsAxis10px),
                Shapes.or(vsAxisXZ, vsAxis10px)
        };
    }
}
