package me.pmnq.ArchaeologyExpanded.registry;

import me.pmnq.ArchaeologyExpanded.ArchaeologyExpanded;
import me.pmnq.ArchaeologyExpanded.blocks.entity.ArchExBrushableBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModRegistry {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArchaeologyExpanded.MOD_ID);
    public static final DeferredRegister<BlockEntityType<?>> ENTITY = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, ArchaeologyExpanded.MOD_ID);
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ArchExBrushableBlockEntity>> BRUSHABLE_BLOCK;

    public static final DeferredHolder<Item, Item> SUSPICIOUS_DIRT_ITEM;
    public static final DeferredHolder<Item, Item> SUSPICIOUS_SOUL_SAND_ITEM;
    public static final DeferredHolder<Item, Item> SUSPICIOUS_CLAY_ITEM;
    public static final DeferredHolder<Item, Item> SUSPICIOUS_RED_SAND_ITEM;


    public ModRegistry() {
    }

    static {
        SUSPICIOUS_DIRT_ITEM = ITEMS.register("suspicious_dirt", () ->
                new BlockItem(BlockRegistry.SUSPICIOUS_DIRT.get(), new Item.Properties()));


        SUSPICIOUS_SOUL_SAND_ITEM = ITEMS.register("suspicious_soul_sand", () -> {
            return new BlockItem(BlockRegistry.SUSPICIOUS_SOUL_SAND.get(), new Item.Properties());
        });

        SUSPICIOUS_CLAY_ITEM = ITEMS.register("suspicious_clay", () -> {
            return new BlockItem(BlockRegistry.SUSPICIOUS_CLAY.get(), new Item.Properties());
        });

        SUSPICIOUS_RED_SAND_ITEM = ITEMS.register("suspicious_red_sand", () -> {
            return new BlockItem(BlockRegistry.SUSPICIOUS_RED_SAND.get(), new Item.Properties());
        });


        BRUSHABLE_BLOCK = ENTITY.register("brushable_block", () -> {
            return net.minecraft.world.level.block.entity.BlockEntityType.Builder.of(ArchExBrushableBlockEntity::new,
                    new Block[]{
                            BlockRegistry.SUSPICIOUS_DIRT.get(),
                            BlockRegistry.SUSPICIOUS_SOUL_SAND.get(),
                            BlockRegistry.SUSPICIOUS_CLAY.get(),
                            BlockRegistry.SUSPICIOUS_RED_SAND.get()
                    }).build(null);
        });
    }

}
