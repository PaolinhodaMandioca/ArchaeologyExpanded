package me.pmnq.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class SusDirtEntity extends BlockEntity {

    public SusDirtEntity(BlockPos pos, BlockState state){
        super(BlockEntityType.BRUSHABLE_BLOCK, pos, state);

    }

}
