package me.pmnq;

import me.pmnq.blocks.SusBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static me.pmnq.ArchaeologyExpanded.MOD_ID;
import static me.pmnq.ModItems.ITEMS;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, MOD_ID);

    public static final DeferredHolder<Block, SusBlock> SUS_DIRT = BLOCKS.register(
            "suspicious_dirt",
            () -> {
                return new SusBlock(
                        Blocks.DIRT,
                        SoundEvents.BRUSH_GRAVEL,
                        SoundEvents.BRUSH_GRAVEL_COMPLETED,
                        Properties.of()
                                .mapColor(MapColor.DIRT)
                                .instrument(NoteBlockInstrument.SNARE)
                                .strength(0.25f)
                                .sound(SoundType.SUSPICIOUS_GRAVEL)
                                .pushReaction(PushReaction.DESTROY)
                );
            }
    );
    public static final DeferredItem<BlockItem> SUS_DIRT_ITEM = ITEMS.registerSimpleBlockItem("suspicious_dirt", SUS_DIRT);

    public static final DeferredHolder<Block, SusBlock> SUS_RED_SAND = BLOCKS.register(
            "suspicious_red_sand",
            () -> {
                return new SusBlock(
                        Blocks.RED_SAND,
                        SoundEvents.BRUSH_SAND,
                        SoundEvents.BRUSH_SAND_COMPLETED,
                        Properties.of()
                                .mapColor(MapColor.SAND)
                                .instrument(NoteBlockInstrument.SNARE)
                                .strength(0.25f)
                                .sound(SoundType.SUSPICIOUS_SAND)
                                .pushReaction(PushReaction.DESTROY)
                );
            }
    );
    public static final DeferredItem<BlockItem> SUS_RED_SAND_ITEM = ITEMS.registerSimpleBlockItem("suspicious_red_sand", SUS_RED_SAND);




}
