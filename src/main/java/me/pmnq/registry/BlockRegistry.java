package me.pmnq.registry;

import me.pmnq.blocks.ArchExBrushableBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, "archaeologyexpanded");
    public static final DeferredHolder<Block, Block> SUSPICIOUS_DIRT;

    public BlockRegistry() {
    }

    static {
        SUSPICIOUS_DIRT = BLOCKS.register("suspicious_dirt",
                () -> new ArchExBrushableBlock(
                        Blocks.DIRT,
                        BlockBehaviour.Properties.of()
                                .mapColor(MapColor.DIRT)
                                .strength(0.25F)
                                .sound(SoundType.AMETHYST)
                                .pushReaction(PushReaction.DESTROY),
                        SoundEvents.BRUSH_SAND,
                        SoundEvents.BRUSH_SAND_COMPLETED
                )
        );
    }
}
