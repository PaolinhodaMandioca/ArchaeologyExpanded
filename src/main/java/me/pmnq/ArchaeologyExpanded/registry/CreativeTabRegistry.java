package me.pmnq.ArchaeologyExpanded.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static me.pmnq.ArchaeologyExpanded.ArchaeologyExpanded.MOD_ID;
import static me.pmnq.ArchaeologyExpanded.registry.ItemRegistry.ITEMS;
import static me.pmnq.ArchaeologyExpanded.registry.BlockRegistry.BLOCKS;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final Supplier<CreativeModeTab> ARCHEAOLOGY_TAB;


    static {
        ARCHEAOLOGY_TAB = CREATIVE_TAB.register(
                "archealogy_tab",
                () -> CreativeModeTab.builder()
                        .title(Component.translatable("itemGroup." + MOD_ID + ".archeaology_tab"))
                        .icon(() -> new ItemStack(ItemRegistry.DIAMOND_BRUSH.get()))
                        .displayItems((params,output) -> {
                            Stream allItems = ITEMS.getEntries().stream().map(DeferredHolder::get).map(Item::getDefaultInstance);
                            Objects.requireNonNull(output);
                            for (Object item : allItems.toArray()){
                                output.accept((ItemStack) item);
                            }
                        })
                        .build()

        );
    }
}
