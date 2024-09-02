package me.pmnq.ArchaeologyExpanded.blocks.entity;

import me.pmnq.ArchaeologyExpanded.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BrushableBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ArchExBrushableBlockEntity extends BrushableBlockEntity {

    public ArchExBrushableBlockEntity(BlockPos pos, BlockState blockstate) {
        super(pos, blockstate);
    }

    public BlockEntityType<?> getType(){
        return BlockEntityRegistry.BRUSHABLE_SAND.get(); // Use o registro correto
    }
}
