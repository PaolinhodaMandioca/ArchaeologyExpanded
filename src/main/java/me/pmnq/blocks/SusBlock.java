package me.pmnq.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BrushableBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class SusBlock extends BrushableBlock {

    public SusBlock(Block turnsInto, SoundEvent brushSound, SoundEvent brushCompletedSound, Properties properties) {
        super(turnsInto, brushSound, brushCompletedSound, properties);
    }
    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new SusBlockEntity(pos, state);
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof Player p) {
            this.destroy(level,pos,state);
        }


        super.stepOn(level, pos, state, entity);
    }
}
