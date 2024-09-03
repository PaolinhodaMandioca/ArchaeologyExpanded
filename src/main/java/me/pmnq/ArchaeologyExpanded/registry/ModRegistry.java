package me.pmnq.ArchaeologyExpanded.registry;

import me.pmnq.ArchaeologyExpanded.ArchaeologyExpanded;
import net.minecraft.world.item.Item;
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
