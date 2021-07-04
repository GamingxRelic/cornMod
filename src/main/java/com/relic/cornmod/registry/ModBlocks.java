package com.relic.cornmod.registry;

import com.relic.cornmod.CornMod;
import com.relic.cornmod.blocks.CornCrop;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block CORN_CROP = new CornCrop(FabricBlockSettings
            .of(Material.PLANT)
            .noCollision()
            .ticksRandomly()
            .nonOpaque()
            .sounds(BlockSoundGroup.CROP)
            .strength(0.2f, 0.2f)
            .breakByTool(FabricToolTags.HOES));



    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(CornMod.MOD_ID, "corn_crop"), CORN_CROP);
    }

}


