package me.pmnq.ArchaeologyExpanded.registry;

import me.pmnq.ArchaeologyExpanded.items.*;
import me.pmnq.ArchaeologyExpanded.ArchaeologyExpanded;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArchaeologyExpanded.MOD_ID);

    //Items
    public static final DeferredHolder<Item, Item> IRON_BRUSH;
    public static final DeferredHolder<Item, Item> GOLDEN_BRUSH;
    public static final DeferredHolder<Item, Item> DIAMOND_BRUSH;
    public static final DeferredHolder<Item,Item> NETHERITE_BRUSH;
    public static final DeferredHolder<Item, Item> HAND_PICK;

    //BlockItems
    public static final DeferredHolder<Item, Item> SUSPICIOUS_DIRT_ITEM;
    public static final DeferredHolder<Item, Item> SUSPICIOUS_SOUL_SAND_ITEM;
    public static final DeferredHolder<Item, Item> SUSPICIOUS_CLAY_ITEM;
    public static final DeferredHolder<Item, Item> SUSPICIOUS_RED_SAND_ITEM;
    public static final DeferredHolder<Item, Item> SUSPICIOUS_SOUL_SOIL_ITEM;

    public static final DeferredHolder<Item, Item> SUSPICIOUS_STONE_ITEM;
    public static final DeferredHolder<Item, Item> SUSPICIOUS_ANDESITE_ITEM;
    public static final DeferredHolder<Item, Item> SUSPICIOUS_DEEPSLATE_ITEM;
    public static final DeferredHolder<Item, Item> SUSPICIOUS_DIORITE_ITEM;
    public static final DeferredHolder<Item, Item> SUSPICIOUS_END_STONE_ITEM;
    public static final DeferredHolder<Item, Item> SUSPICIOUS_NETHERRACK_ITEM;



    static {
        //Items
        IRON_BRUSH = ITEMS.register("iron_brush", IronBrush::new);
        GOLDEN_BRUSH = ITEMS.register("golden_brush", GoldenBrush::new);
        DIAMOND_BRUSH = ITEMS.register("diamond_brush", DiamondBrush::new);
        NETHERITE_BRUSH = ITEMS.register("netherite_brush", NetheriteBrush::new);
        HAND_PICK = ITEMS.register("hand_pick", HandPick::new);



        //BlockItems
        SUSPICIOUS_DIRT_ITEM = ITEMS.register("suspicious_dirt", () -> {
            return new BlockItem(BlockRegistry.SUSPICIOUS_DIRT.get(), new Item.Properties());
        });

        SUSPICIOUS_SOUL_SAND_ITEM = ITEMS.register("suspicious_soul_sand", () -> {
            return new BlockItem(BlockRegistry.SUSPICIOUS_SOUL_SAND.get(), new Item.Properties());
        });

        SUSPICIOUS_CLAY_ITEM = ITEMS.register("suspicious_clay", () -> {
            return new BlockItem(BlockRegistry.SUSPICIOUS_CLAY.get(), new Item.Properties());
        });

        SUSPICIOUS_RED_SAND_ITEM = ITEMS.register("suspicious_red_sand", () -> {
            return new BlockItem(BlockRegistry.SUSPICIOUS_RED_SAND.get(), new Item.Properties());
        });

        SUSPICIOUS_SOUL_SOIL_ITEM = ITEMS.register("suspicious_soul_soil", () -> {
            return new BlockItem(BlockRegistry.SUSPICIOUS_SOUL_SOIL.get(), new Item.Properties());
        });

        SUSPICIOUS_STONE_ITEM =ITEMS.register("suspicious_stone", () -> {
            return new BlockItem(BlockRegistry.SUSPICIOUS_STONE.get(), new Item.Properties());
        });

        SUSPICIOUS_ANDESITE_ITEM =ITEMS.register("suspicious_andesite", () -> {
            return new BlockItem(BlockRegistry.SUSPICIOUS_ANDESITE.get(), new Item.Properties());
        });

        SUSPICIOUS_DEEPSLATE_ITEM =ITEMS.register("suspicious_deepslate", () -> {
            return new BlockItem(BlockRegistry.SUSPICIOUS_DEEPSLATE.get(), new Item.Properties());
        });

        SUSPICIOUS_DIORITE_ITEM =ITEMS.register("suspicious_diorite", () -> {
            return new BlockItem(BlockRegistry.SUSPICIOUS_DIORITE.get(), new Item.Properties());
        });

        SUSPICIOUS_END_STONE_ITEM =ITEMS.register("suspicious_end_stone", () -> {
            return new BlockItem(BlockRegistry.SUSPICIOUS_END_STONE.get(), new Item.Properties());
        });

        SUSPICIOUS_NETHERRACK_ITEM =ITEMS.register("suspicious_netherrack", () -> {
            return new BlockItem(BlockRegistry.SUSPICIOUS_NETHERRACK.get(), new Item.Properties());
        });

    }
}
