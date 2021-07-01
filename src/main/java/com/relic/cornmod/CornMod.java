package com.relic.cornmod;

import com.relic.cornmod.registry.ModBlocks;
import com.relic.cornmod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CornMod implements ModInitializer {
    public static final String MOD_ID = "cornmod";
    public static ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "item_group"), () -> new ItemStack(ModItems.CORN));


    @Override
    public void onInitialize() {
        ModItems.register();
        ModBlocks.register();
    }

}
