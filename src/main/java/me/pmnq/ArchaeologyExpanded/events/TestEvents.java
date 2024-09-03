package me.pmnq.ArchaeologyExpanded.events;

import net.minecraft.network.chat.Component;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;


public class TestEvents {

    @SubscribeEvent
    public void onMove(PlayerInteractEvent.RightClickBlock event){

    }
}
