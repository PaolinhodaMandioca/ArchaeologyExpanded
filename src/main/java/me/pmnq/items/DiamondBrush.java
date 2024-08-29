package me.pmnq.items;

import net.minecraft.world.item.BrushItem;
import net.minecraft.world.item.Item;

public class DiamondBrush extends BrushItem {

    public DiamondBrush(){
        super(new Item.Properties()
                .stacksTo(1)
                .durability(64*3)
        );
    }
}
