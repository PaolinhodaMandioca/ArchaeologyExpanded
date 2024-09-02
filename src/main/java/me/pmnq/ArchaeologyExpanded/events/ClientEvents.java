package me.pmnq.ArchaeologyExpanded.events;


import me.pmnq.ArchaeologyExpanded.registry.BlockEntityRegistry;
import net.minecraft.client.renderer.blockentity.BrushableBlockRenderer;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;


public class ClientEvents {

   /* @SubscribeEvent
    public void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer((BlockEntityType) BlockEntityRegistry.BRUSHABLE_BLOCK.get(), BrushableBlockRenderer::new);
    }*/
}
