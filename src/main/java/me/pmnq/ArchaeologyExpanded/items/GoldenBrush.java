package me.pmnq.ArchaeologyExpanded.items;

import net.minecraft.world.item.BrushItem;
import net.minecraft.world.item.Item;

public class GoldenBrush extends BrushItem {

    public GoldenBrush(){
        super(new Item.Properties()
                .stacksTo(1)
                .durability(80)
        );
    }
}
