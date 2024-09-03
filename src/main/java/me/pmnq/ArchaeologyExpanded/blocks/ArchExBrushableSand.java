package me.pmnq.ArchaeologyExpanded.blocks;

import me.pmnq.ArchaeologyExpanded.blocks.entity.ArchExBrushableSandEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BrushableBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;


public class ArchExBrushableSand extends BrushableBlock {
    public ArchExBrushableSand(Block block, BlockBehaviour.Properties properties, SoundEvent soundBrush, SoundEvent soundCompleted) {
        super(block, soundBrush, soundCompleted, properties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState blockstate) {
        return new ArchExBrushableSandEntity(pos, blockstate);
    }
}
