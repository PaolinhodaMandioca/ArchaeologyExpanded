package me.pmnq.ArchaeologyExpanded;

import com.mojang.logging.LogUtils;
import me.pmnq.ArchaeologyExpanded.events.TestEvents;
import me.pmnq.ArchaeologyExpanded.events.ClientEvents;
import me.pmnq.ArchaeologyExpanded.registry.*;
import me.pmnq.ArchaeologyExpanded.renderer.StoneBrushableBlockRenderer;
import net.minecraft.client.renderer.blockentity.BrushableBlockRenderer;
import net.minecraft.core.component.DataComponentPatch;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.animal.armadillo.Armadillo;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.entity.living.LivingEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;
import org.spongepowered.asm.launch.MixinBootstrap;

@Mod(ArchaeologyExpanded.MOD_ID)
public class ArchaeologyExpanded {



    public static final String MOD_ID = "archaeologyexpanded";
    private static final Logger LOGGER = LogUtils.getLogger();


    public ArchaeologyExpanded(IEventBus modEventBus, ModContainer modContainer) {
        MixinBootstrap.init();

        BlockRegistry.BLOCKS.register(modEventBus);
        ModRegistry.MOD_LOGO.register(modEventBus);
        ItemRegistry.ITEMS.register(modEventBus);
        BlockEntityRegistry.ENTITY.register(modEventBus);
        CreativeTabRegistry.CREATIVE_TAB.register(modEventBus);
        ModDataComponents.ENCHANTMENT_EFFECT_COMPONENTS.register(modEventBus);


        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
        NeoForge.EVENT_BUS.register(new TestEvents());
        modEventBus.addListener(this::addCreative);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }


    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting (ServerStartingEvent event){
    }
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
        @SubscribeEvent
        public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
            event.registerBlockEntityRenderer(BlockEntityRegistry.BRUSHABLE_SAND.get(), BrushableBlockRenderer::new);
            event.registerBlockEntityRenderer(BlockEntityRegistry.BRUSHABLE_STONE.get(), StoneBrushableBlockRenderer::new);

        }
    }

    public static ResourceLocation loc(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

}

