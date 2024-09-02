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

    public static final DeferredHolder<Item, Item> SUS_STONE_ITEM;



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

        SUS_STONE_ITEM =ITEMS.register("suspicious_stone", () -> {
            return new BlockItem(BlockRegistry.SUS_STONE.get(), new Item.Properties());
        });


    }
}
