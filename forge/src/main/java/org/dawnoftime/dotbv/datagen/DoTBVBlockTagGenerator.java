package org.dawnoftime.dotbv.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.dawnoftime.dotbv.DoTBVCommon;
import org.dawnoftime.dotbv.registry.DoTBVBlocksRegistry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class DoTBVBlockTagGenerator extends BlockTagsProvider {
    public DoTBVBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, DoTBVCommon.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider pProvider) {
        for(TagKey<Block> tag : DoTBVBlocksRegistry.blockTagsMap.keySet()){
            DoTBVBlocksRegistry.blockTagsMap.get(tag).forEach(block -> this.tag(tag).add(block.get()));
        }
        //blockTagsMap.clear();
        int a = 1;
    }
}
