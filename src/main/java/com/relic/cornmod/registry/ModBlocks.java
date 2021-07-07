package com.relic.cornmod.registry;

import com.relic.cornmod.blocks.CornBlock;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    //public static final Block CORN_BLOCK = new CornBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final Block CORN_BLOCK = new CornBlock(8, FabricBlockSettings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().strength(0.2f, 0.2f).breakByTool(FabricToolTags.HOES).sounds(BlockSoundGroup.CROP));

    public static final Tag<Block> FARMLAND = TagRegistry.block(new Identifier("c", "farmlands"));

    public static void register() {

        Registry.register(Registry.BLOCK, CornBlock.ID, CORN_BLOCK);
    }

    public static void clientInit() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CORN_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CORN_BLOCK, RenderLayer.getCutout());
    }


}


