package me.pmnq.blocks;

import me.pmnq.ModBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BrushableBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SusBlockEntity extends BrushableBlockEntity {

    public SusBlockEntity(BlockPos pos, BlockState blockState) {
        super(pos, blockState);
    }

    public BlockEntityType<?> getType() {
        return (BlockEntityType) ModBlockEntity.SUS_DIRT_ENTITY.get();
    }
}
