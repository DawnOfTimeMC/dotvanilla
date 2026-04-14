package org.dawnoftime.dotbv;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.dawnoftime.dotbv.item.IconItem;
import org.dawnoftime.dotbv.registry.*;

import java.util.HashSet;
import java.util.Set;
import org.dawnoftime.dotbv.client.gui.creative.CreativeInventoryCategories;
import java.util.function.Function;
import java.util.function.Supplier;

public class RegistryImpls {
    public static class ForgeBlocksRegistry extends DoTBVBlocksRegistry {
        public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DoTBVCommon.MOD_ID);
        public static final DeferredRegister<Item> BLOCK_ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DoTBVCommon.MOD_ID);
        public ForgeBlocksRegistry() {
            postRegister();
        }

        @SafeVarargs
        @Override
        public final <T extends Block, Y extends Item> Supplier<T> registerWithItem(String id, Supplier<T> block, Function<T, Y> item, TagKey<Block>... tags) {
            RegistryObject<T> registryBlock = BLOCKS_REGISTRY.register(id, block);
            if (item != null) {
                BLOCK_ITEMS_REGISTRY.register(id, () -> item.apply(registryBlock.get()));
            }
            if (tags.length == 0) {
                addBlockTag(registryBlock, BlockTags.MINEABLE_WITH_PICKAXE);
            } else {
                for (TagKey<Block> tag : tags) {
                    addBlockTag(registryBlock, tag);
                }
            }
            return registryBlock;
        }
    }

    public static class ForgeItemsRegistry extends DoTBVItemsRegistry {
        public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DoTBVCommon.MOD_ID);

        public ForgeItemsRegistry() {
        }

        @Override
        public <T extends Item> Supplier<Item> register(String name, Supplier<T> itemSupplier) {
            return ITEMS_REGISTRY.register(name, itemSupplier);
        }
    }

    public static class ForgeCreativeModeTabsRegistry extends DoTBVCreativeModeTabsRegistry {
        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS_REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DoTBVCommon.MOD_ID);

        @Override
        public <T extends CreativeModeTab> Supplier<CreativeModeTab> register(String name, Supplier<ItemStack> iconSupplier, Component title) {
            return CREATIVE_MODE_TABS_REGISTRY.register(name, () -> CreativeModeTab.builder().icon(iconSupplier).title(title).build());
        }
    }

    public static void init(IEventBus bus) {
        DoTBVBlocksRegistry.INSTANCE = new ForgeBlocksRegistry();
        DoTBVItemsRegistry.INSTANCE = new ForgeItemsRegistry();
        DoTBVCreativeModeTabsRegistry.INSTANCE = new ForgeCreativeModeTabsRegistry();

        // Register all deferred registries
        ForgeBlocksRegistry.BLOCKS_REGISTRY.register(bus);
        ForgeBlocksRegistry.BLOCK_ITEMS_REGISTRY.register(bus);
        ForgeItemsRegistry.ITEMS_REGISTRY.register(bus);
        ForgeCreativeModeTabsRegistry.CREATIVE_MODE_TABS_REGISTRY.register(bus);

        bus.addListener((BuildCreativeModeTabContentsEvent event) -> {
            if(event.getTab() == DoTBVCreativeModeTabsRegistry.INSTANCE.DOTBV_TAB.get()) {
                Set<Item> addedItems = new HashSet<>();
                for (CreativeInventoryCategories category : CreativeInventoryCategories.values()) {
                    for (Item item : category.getItems()) {
                        if (!(item instanceof IconItem) && addedItems.add(item)) {
                            event.accept(item);
                        }
                    }
                }
            }
        });
    }
}
