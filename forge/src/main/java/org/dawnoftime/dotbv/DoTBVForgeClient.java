package org.dawnoftime.dotbv;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.dawnoftime.dotbv.registry.DoTBVColorsRegistry;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = DoTBVCommon.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DoTBVForgeClient {
    public DoTBVForgeClient() {}
    @SubscribeEvent
    public static void setupBlockColors(final RegisterColorHandlersEvent.Block event) {
        DoTBVColorsRegistry.getBlocksColorRegistry().forEach((blockColor, blocks) ->
            event.register(blockColor, blocks.stream().map(Supplier::get).toArray(Block[]::new)));
    }

    // Register item colors so leaf plates/edges display correctly in inventory.
    // BlockColors only tint placed blocks; ItemColors are needed separately for inventory rendering.
    @SubscribeEvent
    public static void setupItemColors(final RegisterColorHandlersEvent.Item event) {
        DoTBVColorsRegistry.getItemsColorRegistry().forEach((itemColor, items) ->
            event.register(itemColor, items.stream().map(Supplier::get).toArray(Item[]::new)));
    }

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(DoTBVForgeClient::setupBlockColors);
        eventBus.addListener(DoTBVForgeClient::setupItemColors);
        eventBus.addListener(DoTBVForgeClient::registerRenderers);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
    }
}
