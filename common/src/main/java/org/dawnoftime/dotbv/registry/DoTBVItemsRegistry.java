package org.dawnoftime.dotbv.registry;

import net.minecraft.world.item.Item;
import org.dawnoftime.dotbv.item.templates.ItemDoTBV;

import java.util.function.Supplier;

@SuppressWarnings({"unused"})
public abstract class DoTBVItemsRegistry {
    public static DoTBVItemsRegistry INSTANCE;

    // General
    public final Supplier<Item> DOTBV_ITEM = register("dot_beyond_vanilla", () -> new ItemDoTBV());

    public abstract <T extends Item> Supplier<Item> register(final String name, final Supplier<T> itemSupplier);

}
