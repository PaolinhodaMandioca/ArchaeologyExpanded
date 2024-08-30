package me.pmnq.ArchaeologyExpanded.registry;

import me.pmnq.ArchaeologyExpanded.ArchaeologyExpanded;
import me.pmnq.ArchaeologyExpanded.blocks.ArchExBrushableBlock;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ArchaeologyExpanded.MOD_ID);

    public static final DeferredHolder<Block, ArchExBrushableBlock> SUSPICIOUS_DIRT;
    public static final DeferredHolder<Block, ArchExBrushableBlock> SUSPICIOUS_SOUL_SAND;
    public static final DeferredHolder<Block, ArchExBrushableBlock> SUSPICIOUS_CLAY;

    public BlockRegistry() {
    }

    static {
        SUSPICIOUS_DIRT = BLOCKS.register("suspicious_dirt", () -> {
            return new ArchExBrushableBlock(
                    Blocks.DIRT,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DIRT)
                            .instrument(NoteBlockInstrument.SNARE)
                            .strength(0.25F)
                            .sound(SoundType.SUSPICIOUS_SAND)
                            .pushReaction(PushReaction.DESTROY),
                    SoundEvents.BRUSH_SAND,
                    SoundEvents.BRUSH_SAND_COMPLETED);
        });

        SUSPICIOUS_SOUL_SAND = BLOCKS.register("suspicious_soul_sand", () -> {
            return new ArchExBrushableBlock(
                    Blocks.SOUL_SAND,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .instrument(NoteBlockInstrument.SNARE)
                            .strength(0.25F)
                            .sound(SoundType.SUSPICIOUS_SAND)
                            .pushReaction(PushReaction.DESTROY),
                    SoundEvents.BRUSH_SAND,
                    SoundEvents.BRUSH_SAND_COMPLETED);
        });

        SUSPICIOUS_CLAY = BLOCKS.register("suspicious_clay", () -> {
            return new ArchExBrushableBlock(
                    Blocks.CLAY,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .instrument(NoteBlockInstrument.SNARE)
                            .strength(0.25F)
                            .sound(SoundType.SUSPICIOUS_SAND)
                            .pushReaction(PushReaction.DESTROY),
                    SoundEvents.BRUSH_SAND,
                    SoundEvents.BRUSH_SAND_COMPLETED);
        });
    }
}
