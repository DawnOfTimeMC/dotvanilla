package org.dawnoftime.dotbv.registry;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.dawnoftime.dotbv.DoTBVCommon;

import java.util.function.Supplier;

public abstract class DoTBVCreativeModeTabsRegistry {
    public static DoTBVCreativeModeTabsRegistry INSTANCE;
    // DOTBV_ITEM is an IconItem — filtered out of the item list, used solely as the mod logo
    // in the creative tab row (alongside vanilla tabs and other mods).
    public Supplier<CreativeModeTab> DOTBV_TAB = register("dot_tab", () -> new ItemStack(DoTBVItemsRegistry.INSTANCE.DOTBV_ITEM.get()), Component.translatable("itemGroup." + DoTBVCommon.MOD_ID + ".dotbvtab"));
    public abstract <T extends CreativeModeTab> Supplier<CreativeModeTab> register(final String name, final Supplier<ItemStack> iconSupplier, final Component title);
}
