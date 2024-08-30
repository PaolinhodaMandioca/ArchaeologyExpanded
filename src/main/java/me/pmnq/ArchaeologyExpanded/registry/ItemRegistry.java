package me.pmnq.ArchaeologyExpanded.registry;

import me.pmnq.ArchaeologyExpanded.items.DiamondBrush;
import me.pmnq.ArchaeologyExpanded.items.GoldenBrush;
import me.pmnq.ArchaeologyExpanded.items.IronBrush;
import me.pmnq.ArchaeologyExpanded.items.NetheriteBrush;
import me.pmnq.ArchaeologyExpanded.ArchaeologyExpanded;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArchaeologyExpanded.MOD_ID);

    public static final DeferredHolder<Item, Item> IRON_BRUSH;
    public static final DeferredHolder<Item, Item> GOLDEN_BRUSH;
    public static final DeferredHolder<Item, Item> DIAMOND_BRUSH;
    public static final DeferredHolder<Item,Item> NETHERITE_BRUSH;

    static {
        IRON_BRUSH = ITEMS.register("iron_brush", IronBrush::new);
        GOLDEN_BRUSH = ITEMS.register("golden_brush", GoldenBrush::new);
        DIAMOND_BRUSH =ITEMS.register("diamond_brush", DiamondBrush::new);
        NETHERITE_BRUSH =ITEMS.register("netherite_brush", NetheriteBrush::new);
    }
}
