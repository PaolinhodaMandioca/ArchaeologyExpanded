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

    public static final DeferredRegister<Item> ITEMS;
    public static final DeferredRegister<BlockEntityType<?>> ENTITY;
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ArchExBrushableBlockEntity>> BRUSHABLE_BLOCK;

    public static final DeferredHolder<Item, Item> SUSPICIOUS_DIRT_ITEM;
    public static final DeferredHolder<Item, Item> SUSPICIOUS_SOUL_SAND_ITEM;
    public static final DeferredHolder<Item, Item> SUSPICIOUS_CLAY_ITEM;

    public ModRegistry() {
    }

    static {
        ITEMS = DeferredRegister.createItems("archaeologyexpanded");
        ENTITY = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, "archaeologyexpanded");

        SUSPICIOUS_DIRT_ITEM = ITEMS.register("suspicious_dirt", () -> {
            return new BlockItem(BlockRegistry.SUSPICIOUS_DIRT.get(), new Item.Properties());
        });

        SUSPICIOUS_SOUL_SAND_ITEM = ITEMS.register("suspicious_soul_sand", () -> {
            return new BlockItem(BlockRegistry.SUSPICIOUS_SOUL_SAND.get(), new Item.Properties());
        });

        SUSPICIOUS_CLAY_ITEM = ITEMS.register("suspicious_soul_sand", () -> {
            return new BlockItem(BlockRegistry.SUSPICIOUS_CLAY.get(), new Item.Properties());
        });



        BRUSHABLE_BLOCK = ENTITY.register("brushable_block", () -> {
            //noinspection DataFlowIssue
            return net.minecraft.world.level.block.entity.BlockEntityType.Builder.of(ArchExBrushableBlockEntity::new,
                    new Block[]{
                            BlockRegistry.SUSPICIOUS_DIRT.get(),
                            BlockRegistry.SUSPICIOUS_SOUL_SAND.get(),
                            BlockRegistry.SUSPICIOUS_CLAY.get()
                    }).build(null);
        });
    }

}
