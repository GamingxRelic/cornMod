package com.relic.cornmod;

import com.relic.cornmod.util.BlockRenders;
import net.fabricmc.api.ClientModInitializer;

public class CropsClient implements ClientModInitializer {

    public void onInitializeClient() {
        BlockRenders.defineRenders();
    }
}