package me.pmnq;

import com.mojang.logging.LogUtils;
import me.pmnq.blocks.SusDirt;
import me.pmnq.blocks.SusDirtEntity;
import me.pmnq.items.DiamondBrush;
import me.pmnq.items.GoldenBrush;
import me.pmnq.items.IronBrush;
import me.pmnq.items.NetheriteBrush;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BrushableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
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
import net.neoforged.neoforge.registries.*;
import org.slf4j.Logger;

import java.util.function.Supplier;

import static me.pmnq.ModBlockEntity.BLOCK_ENTITY_TYPE;
import static me.pmnq.ModBlocks.BLOCKS;
import static me.pmnq.ModItems.ITEMS;

@Mod(ArchaeologyExpanded.MOD_ID)
public class ArchaeologyExpanded {
    public static final String MOD_ID = "archaeologyexpanded";
    private static final Logger LOGGER = LogUtils.getLogger();


    public ArchaeologyExpanded(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        BLOCKS.register(modEventBus);
        BLOCK_ENTITY_TYPE.register(modEventBus);
        ITEMS.register(modEventBus);



        NeoForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);


    }

    private void commonSetup(final FMLCommonSetupEvent event) {


    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(new ItemStack(ModItems.IRON_BRUSH));
            event.accept(new ItemStack(ModItems.GOLDEN_BRUSH));
            event.accept(new ItemStack(ModItems.DIAMOND_BRUSH));
            event.accept(new ItemStack(ModItems.NETHERITE_BRUSH));

        }

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
