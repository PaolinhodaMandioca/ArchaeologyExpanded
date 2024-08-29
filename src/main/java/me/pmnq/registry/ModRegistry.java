package me.pmnq.registry;

import me.pmnq.blocks.entity.ArchExBrushableBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, "archaeologyexpanded");
    public static final DeferredRegister<BlockEntityType<?>> ENTITY = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, "archaeologyexpanded");

    public static final DeferredHolder<BlockEntityType<ArchExBrushableBlockEntity>, BlockEntityType<?>> BRUSHABLE_BLOCK;
    public static final DeferredHolder<Item, Item> SUSPICIOUS_DIRT_ITEM;

    public ModRegistry() {
    }

    static {
        SUSPICIOUS_DIRT_ITEM = ITEMS.register("suspicious_dirt", () -> new BlockItem(BlockRegistry.SUSPICIOUS_DIRT.get(), new Item.Properties()));

        BRUSHABLE_BLOCK = ENTITY.register("brushable_block", () ->
                BlockEntityType.Builder.of(ArchExBrushableBlockEntity::new,
                new Block(BlockRegistry.SUSPICIOUS_DIRT.get())));
    }
}
