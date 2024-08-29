package me.pmnq.blocks.entity;

import me.pmnq.registry.ModRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BrushableBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ArchExBrushableBlockEntity extends BrushableBlockEntity {

    public ArchExBrushableBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType(){
        return ModRegistry.BRUSHABLE_BLOCK.get(); // Use o registro correto
    }
}
