package me.pmnq;

import me.pmnq.items.DiamondBrush;
import me.pmnq.items.GoldenBrush;
import me.pmnq.items.IronBrush;
import me.pmnq.items.NetheriteBrush;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static me.pmnq.ArchaeologyExpanded.MOD_ID;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

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
