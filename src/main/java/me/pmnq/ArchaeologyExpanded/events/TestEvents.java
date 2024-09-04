package me.pmnq.ArchaeologyExpanded.events;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.armadillo.Armadillo;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;


public class TestEvents {

    @SubscribeEvent
    public void onSpawn(EntityJoinLevelEvent event){
        Entity entity = event.getEntity();
        if (entity instanceof Armadillo){

        }
    }
}
