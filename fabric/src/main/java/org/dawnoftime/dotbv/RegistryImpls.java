package org.dawnoftime.dotbv;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import org.dawnoftime.dotbv.block.IFlammable;
import org.dawnoftime.dotbv.client.gui.creative.CreativeInventoryCategories;
import org.dawnoftime.dotbv.item.IconItem;
import org.dawnoftime.dotbv.registry.*;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

public class RegistryImpls {
    public static class FabricBlocksRegistry extends DoTBVBlocksRegistry {
        public FabricBlocksRegistry() {
            postRegister();

            for (Map.Entry<ResourceKey<Block>, Block> resourceKeyBlockEntry : BuiltInRegistries.BLOCK.entrySet()) {
                Block block = resourceKeyBlockEntry.getValue();
                if (block instanceof IFlammable) {
                    FlammableBlockRegistry.getDefaultInstance().add(block, ((IFlammable) block).getFireSpreadSpeed(block.defaultBlockState(), null, null, null), ((IFlammable) block).getFlammability(block.defaultBlockState(), null, null, null));
                }
            }
        }

        @SafeVarargs
        @Override
        public final <T extends Block, Y extends Item> Supplier<T> registerWithItem(String id, Supplier<T> block, Function<T, Y> item, TagKey<Block>... tags) {
            T registryBlock = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DoTBVCommon.MOD_ID, id), block.get());
            if(item != null) {
                Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DoTBVCommon.MOD_ID, id), item.apply(registryBlock));
            }
            if(tags.length == 0){
                addBlockTag(() -> registryBlock, BlockTags.MINEABLE_WITH_PICKAXE);
            }else{
                for (TagKey<Block> tag : tags) {
                    addBlockTag(() -> registryBlock, tag);
                }
            }
            return () -> registryBlock;
        }
    }

    public static class FabricItemsRegistry extends DoTBVItemsRegistry {
        @Override
        public <T extends Item> Supplier<Item> register(String name, Supplier<T> itemSupplier) {
            T item = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DoTBVCommon.MOD_ID, name), itemSupplier.get());
            return () -> item;
        }
    }

    public static class FabricCreativeModeTabsRegistry extends DoTBVCreativeModeTabsRegistry {
        @Override
        public <T extends CreativeModeTab> Supplier<CreativeModeTab> register(String name, Supplier<ItemStack> iconSupplier, Component title) {
            var group = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(DoTBVCommon.MOD_ID, name), FabricItemGroup.builder().icon(iconSupplier).title(title).displayItems((itemDisplayParameters, output) -> {
                Set<Item> addedItems = new HashSet<>();
                for (CreativeInventoryCategories category : CreativeInventoryCategories.values()) {
                    for (Item item : category.getItems()) {
                        if (!(item instanceof IconItem) && addedItems.add(item)) {
                            output.accept(item);
                        }
                    }
                }
            }).build());
            return () -> group;
        }
    }

    public static void initClient() {
        DoTBVColorsRegistry.initialize();
        DoTBVColorsRegistry.getBlocksColorRegistry().forEach((blockColor, blocks) ->
            ColorProviderRegistry.BLOCK.register(blockColor, blocks.stream().map(Supplier::get).toArray(Block[]::new))
        );
        // Register item colors so leaf plates/edges display correctly in inventory.
        // BlockColors only tint placed blocks; ItemColors are needed separately for inventory rendering.
        DoTBVColorsRegistry.getItemsColorRegistry().forEach((itemColor, items) ->
            ColorProviderRegistry.ITEM.register(itemColor, items.stream().map(Supplier::get).toArray(net.minecraft.world.item.Item[]::new))
        );
    }

    public static void init() {
        DoTBVBlocksRegistry.INSTANCE = new FabricBlocksRegistry();
        FabricItemsRegistry.INSTANCE = new FabricItemsRegistry();
        DoTBVCreativeModeTabsRegistry.INSTANCE = new FabricCreativeModeTabsRegistry();
    }
}
