package com.relic.cornmod.registry;

import com.relic.cornmod.CornMod;
import com.relic.cornmod.blocks.CornCrop;
import com.relic.cornmod.blocks.TestCrop;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final CornCrop CORN_CROP = Registry.register(Registry.BLOCK, new Identifier(CornMod.MOD_ID, "corn_crop"), new CornCrop(FabricBlockSettings
            .of(Material.PLANT)
            .noCollision()
            .ticksRandomly()
            .nonOpaque()
            .sounds(BlockSoundGroup.CROP)
            .strength(0.2f, 0.2f)
            .breakByTool(FabricToolTags.HOES)));


    public static final CropBlock TEST_CROP = new TestCrop(FabricBlockSettings
            .of(Material.PLANT)
            .noCollision()
            .ticksRandomly()
            .nonOpaque()
            .sounds(BlockSoundGroup.CROP)
            .strength(0.2f, 0.2f)
            .breakByTool(FabricToolTags.HOES) );


    public static void register() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),TEST_CROP);
        Registry.register(Registry.BLOCK, new Identifier(CornMod.MOD_ID, "test_crop"), TEST_CROP);
    }

}


