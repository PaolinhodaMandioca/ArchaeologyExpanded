package me.pmnq.ArchaeologyExpanded.mixins;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BrushableBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Block.class)
public class BlockMixin{

    @Inject(method = "stepOn", at = @At("HEAD"))
    private void onStep(Level level, BlockPos pos, BlockState state, Entity entity, CallbackInfo ci){
        if (!entity.isSteppingCarefully() && entity instanceof Player && state.getBlock() instanceof BrushableBlock) {
            level.destroyBlock(pos,false);
        }
    }
}
