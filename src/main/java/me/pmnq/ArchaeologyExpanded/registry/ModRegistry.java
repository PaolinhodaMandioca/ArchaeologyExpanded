package me.pmnq.ArchaeologyExpanded.registry;

import me.pmnq.ArchaeologyExpanded.ArchaeologyExpanded;
import me.pmnq.ArchaeologyExpanded.blocks.entity.ArchExBrushableBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModRegistry {

    public static final DeferredRegister.Items MOD_LOGO = DeferredRegister.createItems(ArchaeologyExpanded.MOD_ID);

    public static final DeferredItem<Item> LOGO = MOD_LOGO.registerSimpleItem("mod_logo");




    public ModRegistry() {
    }

    static {

    }

}
