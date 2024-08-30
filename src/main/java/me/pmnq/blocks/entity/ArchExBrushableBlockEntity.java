package me.pmnq.blocks.entity;

import me.pmnq.registry.ModRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BrushableBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class ArchExBrushableBlockEntity extends BrushableBlockEntity {

    public ArchExBrushableBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public @NotNull BlockEntityType<?> getType(){
        return ModRegistry.BRUSHABLE_BLOCK.get(); // Use o registro correto
    }
}
