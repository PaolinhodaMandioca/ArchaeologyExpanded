package me.pmnq.block;

import me.pmnq.ArchaeologyExpanded;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SuspiciousDirt {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ArchaeologyExpanded.MOD_ID);



    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
