package com.relic.cornmod;

import com.relic.cornmod.registry.ModBlocks;
import net.fabricmc.api.ClientModInitializer;

@SuppressWarnings("unused")
    public class CornModClient implements ClientModInitializer {

        @Override
        public void onInitializeClient() {
            ModBlocks.clientInit();
        }
    }
