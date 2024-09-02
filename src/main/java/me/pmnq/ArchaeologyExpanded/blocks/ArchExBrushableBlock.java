package me.pmnq.ArchaeologyExpanded.blocks;

import me.pmnq.ArchaeologyExpanded.blocks.entity.ArchExBrushableBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BrushableBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;


public class ArchExBrushableBlock extends BrushableBlock {
    public ArchExBrushableBlock(Block block, BlockBehaviour.Properties properties, SoundEvent soundBrush, SoundEvent soundCompleted) {
        super(block, soundBrush, soundCompleted, properties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState blockstate) {
        return new ArchExBrushableBlockEntity(pos, blockstate);
    }

    /*@Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.isSteppingCarefully() && entity instanceof Player) {
            level.destroyBlock(pos,false);
        }

        super.stepOn(level, pos, state, entity);
    }*/
}
