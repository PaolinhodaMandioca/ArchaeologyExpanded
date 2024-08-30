package me.pmnq;

import com.mojang.logging.LogUtils;
import me.pmnq.registry.BlockRegistry;
import me.pmnq.registry.ItemRegistry;
import me.pmnq.registry.ModRegistry;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;



@Mod(ArchaeologyExpanded.MOD_ID)
public class ArchaeologyExpanded {
    public static final String MOD_ID = "archaeologyexpanded";
    private static final Logger LOGGER = LogUtils.getLogger();


    public ArchaeologyExpanded(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        //nao futrica aqui essa parte é pra funcionar
        BlockRegistry.BLOCKS.register(modEventBus);// Registre os blocos primeiro
        ModRegistry.ENTITY.register(modEventBus);// Em seguida, registre as entidades


        modEventBus.addListener(this::addCreative);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);


    }

    private void commonSetup(final FMLCommonSetupEvent event) {


    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
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
        }
    }

