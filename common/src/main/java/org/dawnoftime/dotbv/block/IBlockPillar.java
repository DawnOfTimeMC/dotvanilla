package org.dawnoftime.dotbv.block;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.dawnoftime.dotbv.util.BlockStatePropertiesAA;

import javax.annotation.Nonnull;

public interface IBlockPillar {

    static BlockStatePropertiesAA.PillarConnection getPillarConnectionAbove(LevelAccessor worldIn, BlockPos pos) {
        BlockState state = worldIn.getBlockState(pos);
        Block block = state.getBlock();
        if(block instanceof IBlockPillar)
            return ((IBlockPillar) block).getBlockPillarConnectionAbove(state);
        if(state.is(BlockTags.FENCES))
            return BlockStatePropertiesAA.PillarConnection.FOUR_PX;
        if(state.is(BlockTags.WALLS))
            return BlockStatePropertiesAA.PillarConnection.EIGHT_PX;
        return BlockStatePropertiesAA.PillarConnection.NOTHING;
    }

    @Nonnull
    BlockStatePropertiesAA.PillarConnection getBlockPillarConnectionAbove(BlockState state);

}
