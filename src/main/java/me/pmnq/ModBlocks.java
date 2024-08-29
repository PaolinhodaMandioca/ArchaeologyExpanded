package me.pmnq;

import me.pmnq.blocks.SusDirt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static me.pmnq.ArchaeologyExpanded.MOD_ID;
import static me.pmnq.ModItems.ITEMS;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

    public static final DeferredHolder<Block, Block> SUS_DIRT = BLOCKS.register(
            "suspicious_dirt",
            SusDirt::new
    );
    public static final DeferredItem<BlockItem> SUS_DIRT_ITEM = ITEMS.registerSimpleBlockItem("suspicious_dirt", SUS_DIRT);

}
