package me.pmnq.ArchaeologyExpanded.blocks;

import me.pmnq.ArchaeologyExpanded.blocks.entity.ArchExBrushableBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BrushableBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;


public class ArchExBrushableBlock extends BrushableBlock {
    public ArchExBrushableBlock(Block block, BlockBehaviour.Properties properties, SoundEvent soundBrush, SoundEvent soundCompleted) {
        super(block, soundCompleted, soundBrush, properties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState blockstate) {
        return new ArchExBrushableBlockEntity(pos, blockstate);
    }
}
