package com.relic.cornmod.registry;

import com.relic.cornmod.CornMod;
import com.relic.cornmod.items.*;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item TEST_SEEDS = new AliasedBlockItem(ModBlocks.TEST_CROP, new Item.Settings().group(CornMod.ITEM_GROUP));

    //Seeds
    public static final ItemCornSeeds CORN_SEEDS = Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "corn_seeds"), new ItemCornSeeds(ModBlocks.CORN_CROP, (new Item.Settings().group(CornMod.ITEM_GROUP))));

    //Food
    public static final ItemCorn CORN = Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "corn"), new ItemCorn(new Item.Settings().group(CornMod.ITEM_GROUP).food(ModFood.CORN)));
    public static final ItemRoastedCorn ROASTED_CORN = Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "roasted_corn"), new ItemRoastedCorn(new Item.Settings().group(CornMod.ITEM_GROUP).food(ModFood.ROASTED_CORN)));
    public static final ItemPopcorn POPCORN = Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "popcorn"), new ItemPopcorn(new Item.Settings().group(CornMod.ITEM_GROUP).food(ModFood.POPCORN)));
    public static final ItemBagOfPopcorn BAG_OF_POPCORN = Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "bag_of_popcorn"), new ItemBagOfPopcorn(new Item.Settings().group(CornMod.ITEM_GROUP).food(ModFood.BAG_OF_POPCORN)));
    public static final ItemCornedBeef CORNED_BEEF = Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "corned_beef"), new ItemCornedBeef(new Item.Settings().group(CornMod.ITEM_GROUP).food(ModFood.CORNED_BEEF)));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "test_seeds"), TEST_SEEDS);
    }
}
