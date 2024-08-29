package me.pmnq;

import me.pmnq.blocks.SusDirtEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static me.pmnq.ArchaeologyExpanded.MOD_ID;

public class ModBlockEntity {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPE = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<?>> SUS_DIRT_ENTITY = BLOCK_ENTITY_TYPE.register(
            "suspicious_dirt_entity",
            () -> BlockEntityType.Builder.of(SusDirtEntity::new,ModBlocks.SUS_DIRT.get()).build(null)

    );
}
