package com.relic.cornmod.registry;

import com.relic.cornmod.CornMod;
import com.relic.cornmod.items.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    //Seeds
    public static final Item CORN_SEEDS = new AliasedBlockItem(ModBlocks.CORN_CROP, new FabricItemSettings().group(CornMod.ITEM_GROUP));

    //Food
    public static final ItemCorn CORN = Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "corn"), new ItemCorn(new Item.Settings().group(CornMod.ITEM_GROUP).food(ModFood.CORN)));
    public static final ItemRoastedCorn ROASTED_CORN = Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "roasted_corn"), new ItemRoastedCorn(new Item.Settings().group(CornMod.ITEM_GROUP).food(ModFood.ROASTED_CORN)));
    public static final ItemPopcorn POPCORN = Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "popcorn"), new ItemPopcorn(new Item.Settings().group(CornMod.ITEM_GROUP).food(ModFood.POPCORN)));
    public static final ItemBagOfPopcorn BAG_OF_POPCORN = Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "bag_of_popcorn"), new ItemBagOfPopcorn(new Item.Settings().group(CornMod.ITEM_GROUP).food(ModFood.BAG_OF_POPCORN)));
    public static final ItemCornedBeef CORNED_BEEF = Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "corned_beef"), new ItemCornedBeef(new Item.Settings().group(CornMod.ITEM_GROUP).food(ModFood.CORNED_BEEF).maxCount(1)));
    public static final ItemCornBread CORN_BREAD = Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "corn_bread"), new ItemCornBread(new Item.Settings().group(CornMod.ITEM_GROUP).food(ModFood.CORN_BREAD)));
    public static final ItemCornChip CORN_CHIP = Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "corn_chip"), new ItemCornChip(new Item.Settings().group(CornMod.ITEM_GROUP).food(ModFood.CORN_CHIP)));
    public static final ItemSweetCorn SWEET_CORN = Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "sweet_corn"), new ItemSweetCorn(new Item.Settings().group(CornMod.ITEM_GROUP).food(ModFood.SWEET_CORN).maxCount(1)));
    public static final ItemCreamOfCorn CREAM_OF_CORN = Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "cream_of_corn"), new ItemCreamOfCorn(new Item.Settings().group(CornMod.ITEM_GROUP).food(ModFood.CREAM_OF_CORN).recipeRemainder(Items.BUCKET).maxCount(1)));

    //Ingredients
    public static final ItemCornFlour CORN_FLOUR = Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "corn_flour"), new ItemCornFlour(new Item.Settings().group(CornMod.ITEM_GROUP).recipeRemainder(ModItems.SEED_CRUSHER)));
    public static final ItemCornDough CORN_DOUGH = Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "corn_dough"), new ItemCornDough(new Item.Settings().group(CornMod.ITEM_GROUP).recipeRemainder(Items.BUCKET)));

    //Crafting Tools (Seed Crusher)
    public static final ItemSeedCrusher SEED_CRUSHER = Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "seed_crusher"), new ItemSeedCrusher(new Item.Settings().group(CornMod.ITEM_GROUP).maxCount(1).maxDamage(64)));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(CornMod.MOD_ID, "corn_seeds"), CORN_SEEDS);
    }
}
