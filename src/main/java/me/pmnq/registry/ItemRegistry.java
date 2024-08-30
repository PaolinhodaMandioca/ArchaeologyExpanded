package me.pmnq.registry;

import me.pmnq.ArchaeologyExpanded;
import me.pmnq.items.*;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArchaeologyExpanded.MOD_ID);


    public static final DeferredHolder<Item, Item> IRON_BRUSH = ITEMS.register(
            "iron_brush",
            IronBrush::new
    );

    public static final DeferredHolder<Item, Item> GOLDEN_BRUSH = ITEMS.register(
            "golden_brush",
            GoldenBrush::new
    );

    public static final DeferredHolder<Item, Item> DIAMOND_BRUSH = ITEMS.register(
            "diamond_brush",
            DiamondBrush::new
    );

    public static final DeferredHolder<Item,Item> NETHERITE_BRUSH = ITEMS.register(
            "netherite_brush",
            NetheriteBrush::new
    );

}
