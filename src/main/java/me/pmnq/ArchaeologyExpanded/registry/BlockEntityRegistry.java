package me.pmnq.ArchaeologyExpanded.registry;

import me.pmnq.ArchaeologyExpanded.ArchaeologyExpanded;
import me.pmnq.ArchaeologyExpanded.blocks.entity.ArchExBrushableBlockEntity;
import me.pmnq.ArchaeologyExpanded.blocks.entity.ArchExStoneBrushableBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockEntityRegistry {
    public static final DeferredRegister<BlockEntityType<?>> ENTITY = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, ArchaeologyExpanded.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ArchExBrushableBlockEntity>> BRUSHABLE_SAND;
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ArchExStoneBrushableBlockEntity>> BRUSHABLE_STONE;



    static {
        BRUSHABLE_SAND = ENTITY.register("brushable_block", () -> {
            return net.minecraft.world.level.block.entity.BlockEntityType.Builder.of(ArchExBrushableBlockEntity::new,
                    new Block[]{
                            BlockRegistry.SUSPICIOUS_DIRT.get(),
                            BlockRegistry.SUSPICIOUS_SOUL_SAND.get(),
                            BlockRegistry.SUSPICIOUS_CLAY.get(),
                            BlockRegistry.SUSPICIOUS_RED_SAND.get()
                    }).build(null);
        });

        BRUSHABLE_STONE = ENTITY.register("brushable_stone", () -> {
            return net.minecraft.world.level.block.entity.BlockEntityType.Builder.of(ArchExStoneBrushableBlockEntity::new,
                    new Block[]{
                            BlockRegistry.SUS_STONE.get()
                    }).build(null);
        });


    }
}
