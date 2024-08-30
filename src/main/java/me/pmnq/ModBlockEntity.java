package me.pmnq;

import com.mojang.datafixers.types.Type;
import me.pmnq.blocks.SusBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static me.pmnq.ArchaeologyExpanded.MOD_ID;

public class ModBlockEntity {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SusBlockEntity>> SUS_BLOCK_ENTITY = BLOCK_ENTITY.register(
            "brushable_block",
            () -> {
                return BlockEntityType.Builder.of(
                        SusBlockEntity::new,
                        new Block[]{
                                (Block) ModBlocks.SUS_DIRT.get(),
                                (Block) ModBlocks.SUS_RED_SAND.get()
                        }
                ).build((Type) null);
            }
    );
}
