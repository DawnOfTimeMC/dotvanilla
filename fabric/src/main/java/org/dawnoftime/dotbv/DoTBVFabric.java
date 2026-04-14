package org.dawnoftime.dotbv;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public class DoTBVFabric implements ModInitializer, ClientModInitializer {

    @Override
    public void onInitialize() {
        DoTBVCommon.init();
        RegistryImpls.init();
    }

    @Override
    public void onInitializeClient() {
        RegistryImpls.initClient();
        RenderLayers.init();
    }
}
