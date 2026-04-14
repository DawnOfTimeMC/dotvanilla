package org.dawnoftime.dotbv;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.dawnoftime.dotbv.datagen.DataGenerators;

@Mod(DoTBVCommon.MOD_ID)
public class DoTBVForge {
    public DoTBVForge() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        DoTBVCommon.init();

        RegistryImpls.init(modEventBus);

        if (FMLEnvironment.dist.isClient()) {
            modEventBus.register(DoTBVForgeClient.class);
        }

        modEventBus.register(DataGenerators.class);
    }

}