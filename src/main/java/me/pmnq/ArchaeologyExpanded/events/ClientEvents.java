package me.pmnq.ArchaeologyExpanded.events;

import me.pmnq.ArchaeologyExpanded.registry.BlockEntityRegistry;
import me.pmnq.ArchaeologyExpanded.registry.ModRegistry;
import net.minecraft.client.renderer.blockentity.BrushableBlockRenderer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

public class ClientEvents {
    public ClientEvents(){
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(BlockEntityRegistry.BRUSHABLE_BLOCK.get(), BrushableBlockRenderer::new);
    }
}