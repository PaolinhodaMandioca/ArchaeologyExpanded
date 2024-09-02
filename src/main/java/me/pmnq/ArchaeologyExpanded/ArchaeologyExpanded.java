package me.pmnq.ArchaeologyExpanded;

import com.mojang.logging.LogUtils;
import me.pmnq.ArchaeologyExpanded.events.TestEvents;
import me.pmnq.ArchaeologyExpanded.events.ClientEvents;
import me.pmnq.ArchaeologyExpanded.registry.BlockRegistry;
import me.pmnq.ArchaeologyExpanded.registry.ItemRegistry;
import me.pmnq.ArchaeologyExpanded.registry.ModRegistry;
import me.pmnq.ArchaeologyExpanded.registry.BlockEntityRegistry;
import me.pmnq.ArchaeologyExpanded.registry.CreativeTabRegistry;
import net.minecraft.client.renderer.blockentity.BrushableBlockRenderer;
import net.minecraft.world.entity.LivingEntity;
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


        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
        NeoForge.EVENT_BUS.register(new TestEvents());
        modEventBus.addListener(this::addCreative);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }


    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

            event.accept(new ItemStack(BlockRegistry.SUSPICIOUS_DIRT.get()));
            event.accept(new ItemStack(BlockRegistry.SUSPICIOUS_SOUL_SAND.get()));
            event.accept(new ItemStack(BlockRegistry.SUSPICIOUS_CLAY.get()));
            event.accept(new ItemStack(BlockRegistry.SUSPICIOUS_RED_SAND.get()));
        }
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(new ItemStack(ItemRegistry.IRON_BRUSH));
            event.accept(new ItemStack(ItemRegistry.GOLDEN_BRUSH));
            event.accept(new ItemStack(ItemRegistry.DIAMOND_BRUSH));
            event.accept(new ItemStack(ItemRegistry.NETHERITE_BRUSH));

        }
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
            event.registerBlockEntityRenderer((BlockEntityType) BlockEntityRegistry.BRUSHABLE_SAND.get(), BrushableBlockRenderer::new);
            //event.registerBlockEntityRenderer((BlockEntityType) BlockEntityRegistry.BRUSHABLE_STONE.get(), BrushableBlockRenderer::new);

        }
    }
}

