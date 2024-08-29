package me.pmnq.blocks;

import me.pmnq.blocks.entity.ArchExBrushableBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BrushableBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class ArchExBrushableBlock extends BrushableBlock {
    public ArchExBrushableBlock(Block block, BlockBehaviour.Properties properties, SoundEvent soundBrush, SoundEvent soundCompleted) {
        super(block, soundCompleted, soundBrush, properties);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ArchExBrushableBlockEntity(pos, state);
    }
}
