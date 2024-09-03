package me.pmnq.ArchaeologyExpanded.registry;

import me.pmnq.ArchaeologyExpanded.ArchaeologyExpanded;
import me.pmnq.ArchaeologyExpanded.blocks.ArchExBrushableSand;
import me.pmnq.ArchaeologyExpanded.blocks.ArchExStoneBrushableBlock;
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

    public static final DeferredHolder<Block, ArchExBrushableSand> SUSPICIOUS_DIRT;
    public static final DeferredHolder<Block, ArchExBrushableSand> SUSPICIOUS_SOUL_SAND;
    public static final DeferredHolder<Block, ArchExBrushableSand> SUSPICIOUS_SOUL_SOIL;
    public static final DeferredHolder<Block, ArchExBrushableSand> SUSPICIOUS_CLAY;
    public static final DeferredHolder<Block, ArchExBrushableSand> SUSPICIOUS_RED_SAND;

    public static final DeferredHolder<Block, ArchExStoneBrushableBlock> SUSPICIOUS_STONE;
    public static final DeferredHolder<Block, ArchExStoneBrushableBlock> SUSPICIOUS_GRANITE;
    public static final DeferredHolder<Block, ArchExStoneBrushableBlock> SUSPICIOUS_DIORITE;
    public static final DeferredHolder<Block, ArchExStoneBrushableBlock> SUSPICIOUS_ANDESITE;
    public static final DeferredHolder<Block, ArchExStoneBrushableBlock> SUSPICIOUS_DEEPSLATE;
    public static final DeferredHolder<Block, ArchExStoneBrushableBlock> SUSPICIOUS_END_STONE;
    public static final DeferredHolder<Block, ArchExStoneBrushableBlock> SUSPICIOUS_NETHERRACK;


    public BlockRegistry() {
    }

    static {
        SUSPICIOUS_DIRT = BLOCKS.register("suspicious_dirt", () -> {
            return new ArchExBrushableSand(
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
            return new ArchExBrushableSand(
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

        //configurar
        SUSPICIOUS_SOUL_SOIL = BLOCKS.register("suspicious_soul_soil", () -> {
            return new ArchExBrushableSand(
                    Blocks.SOUL_SOIL,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .instrument(NoteBlockInstrument.SNARE)
                            .strength(0.25F)
                            .sound(SoundType.SOUL_SOIL)
                            .pushReaction(PushReaction.DESTROY),
                    SoundEvents.BRUSH_SAND,
                    SoundEvents.BRUSH_SAND_COMPLETED);
        });

        SUSPICIOUS_CLAY = BLOCKS.register("suspicious_clay", () -> {
            return new ArchExBrushableSand(
                    Blocks.CLAY,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .instrument(NoteBlockInstrument.SNARE)
                            .strength(0.25F)
                            .sound(SoundType.SUSPICIOUS_SAND)
                            .pushReaction(PushReaction.DESTROY),
                    SoundEvents.BRUSH_GRAVEL,
                    SoundEvents.BRUSH_GRAVEL_COMPLETED);
        });

        SUSPICIOUS_RED_SAND = BLOCKS.register("suspicious_red_sand", () -> {
            return new ArchExBrushableSand(
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


        //configurar
        SUSPICIOUS_STONE = BLOCKS.register("suspicious_stone", () -> {
            return new ArchExStoneBrushableBlock(
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

        //configurar
        SUSPICIOUS_GRANITE = BLOCKS.register("suspicious_granite", () -> {
            return new ArchExStoneBrushableBlock(
                    Blocks.GRANITE,
                    SoundEvents.BRUSH_GENERIC,
                    SoundEvents.ENDER_DRAGON_DEATH,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DIRT)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(0.75F)
                            .sound(SoundType.STONE)
                            .pushReaction(PushReaction.DESTROY));
        });

        //configurar
        SUSPICIOUS_DIORITE = BLOCKS.register("suspicious_diorite", () -> {
            return new ArchExStoneBrushableBlock(
                    Blocks.DIORITE,
                    SoundEvents.BRUSH_GENERIC,
                    SoundEvents.ENDER_DRAGON_DEATH,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DIRT)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(0.75F)
                            .sound(SoundType.STONE)
                            .pushReaction(PushReaction.DESTROY));
        });

        //configurar
        SUSPICIOUS_ANDESITE = BLOCKS.register("suspicious_andesite", () -> {
            return new ArchExStoneBrushableBlock(
                    Blocks.ANDESITE,
                    SoundEvents.BRUSH_GENERIC,
                    SoundEvents.ENDER_DRAGON_DEATH,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DIRT)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(0.75F)
                            .sound(SoundType.STONE)
                            .pushReaction(PushReaction.DESTROY));
        });



        //configurar
        SUSPICIOUS_DEEPSLATE = BLOCKS.register("suspicious_deepslate", () -> {
            return new ArchExStoneBrushableBlock(
                    Blocks.DEEPSLATE,
                    SoundEvents.BRUSH_GENERIC,
                    SoundEvents.ENDER_DRAGON_DEATH,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DEEPSLATE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(0.75F)
                            .sound(SoundType.DEEPSLATE)
                            .pushReaction(PushReaction.DESTROY));
        });

        //configurar
        SUSPICIOUS_END_STONE = BLOCKS.register("suspicious_end_stone", () -> {
            return new ArchExStoneBrushableBlock(
                    Blocks.END_STONE,
                    SoundEvents.BRUSH_GENERIC,
                    SoundEvents.ENDER_DRAGON_DEATH,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(0.75F)
                            .sound(SoundType.STONE)
                            .pushReaction(PushReaction.DESTROY));
        });

        //configurar
        SUSPICIOUS_NETHERRACK = BLOCKS.register("suspicious_netherrack", () -> {
            return new ArchExStoneBrushableBlock(
                    Blocks.NETHERRACK,
                    SoundEvents.BRUSH_GENERIC,
                    SoundEvents.ENDER_DRAGON_DEATH,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.NETHER)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(0.75F)
                            .sound(SoundType.NETHERRACK)
                            .pushReaction(PushReaction.DESTROY));
        });
    }
}
