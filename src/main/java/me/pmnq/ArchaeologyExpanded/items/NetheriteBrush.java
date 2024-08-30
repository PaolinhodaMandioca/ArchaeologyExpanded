package me.pmnq.ArchaeologyExpanded.items;

import net.minecraft.world.item.BrushItem;
import net.minecraft.world.item.Item;

public class NetheriteBrush extends BrushItem {
    public NetheriteBrush(){
        super(new Item.Properties()
                .stacksTo(1)
                .durability(64*6)
        );
    }
}
