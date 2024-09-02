package me.pmnq.ArchaeologyExpanded.registry;

import me.pmnq.ArchaeologyExpanded.ArchaeologyExpanded;
import me.pmnq.ArchaeologyExpanded.blocks.ArchExBrushableBlock;
import me.pmnq.ArchaeologyExpanded.blocks.StoneBrushableBlock;
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
    public static final DeferredHolder<Block, ArchExBrushableBlock> SUSPICIOUS_RED_SAND;
    public static final DeferredHolder<Block, StoneBrushableBlock> SUS_STONE;


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
                            .sound(SoundType.SUSPICIOUS_GRAVEL)
                            .pushReaction(PushReaction.DESTROY),
                    SoundEvents.BRUSH_GRAVEL,
                    SoundEvents.BRUSH_GRAVEL_COMPLETED);
        });

        SUSPICIOUS_SOUL_SAND = BLOCKS.register("suspicious_soul_sand", () -> {
            return new ArchExBrushableBlock(
                    Blocks.SOUL_SAND,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .instrument(NoteBlockInstrument.SNARE)
                            .strength(0.25F)
                            .sound(SoundType.SOUL_SAND)
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

        SUSPICIOUS_RED_SAND = BLOCKS.register("suspicious_red_sand", () -> {
            return new ArchExBrushableBlock(
                    Blocks.RED_SAND,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .instrument(NoteBlockInstrument.SNARE)
                            .strength(0.25F)
                            .sound(SoundType.SUSPICIOUS_SAND)
                            .pushReaction(PushReaction.DESTROY),
                    SoundEvents.BRUSH_SAND,
                    SoundEvents.BRUSH_SAND_COMPLETED);
        });

        SUS_STONE = BLOCKS.register("suspicious_stone", () -> {
            return new StoneBrushableBlock(
                    Blocks.STONE,
                    SoundEvents.BRUSH_GENERIC,
                    SoundEvents.ENDER_DRAGON_DEATH,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(0.75F)
                            .sound(SoundType.STONE)
                            .pushReaction(PushReaction.DESTROY));
        });
    }
}
