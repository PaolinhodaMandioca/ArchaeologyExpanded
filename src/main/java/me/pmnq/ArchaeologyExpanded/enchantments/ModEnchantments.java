package me.pmnq.ArchaeologyExpanded.enchantments;

import me.pmnq.ArchaeologyExpanded.ArchaeologyExpanded;
import me.pmnq.ArchaeologyExpanded.commom.tags.ModTags;
import me.pmnq.ArchaeologyExpanded.registry.ModDataComponents;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.LevelBasedValue;
import net.minecraft.world.item.enchantment.effects.MultiplyValue;


public class ModEnchantments {
    public static final ResourceKey<Enchantment> DELICACY = key("archaeologists_delicacy");


    private static ResourceKey<Enchantment> key(String name) {
        return ResourceKey.create(Registries.ENCHANTMENT, ArchaeologyExpanded.loc(name));
    }

    public static void bootstrap(BootstrapContext<Enchantment> context) {
        HolderGetter<Item> items = context.lookup(Registries.ITEM);
        register(context, DELICACY, Enchantment.enchantment(Enchantment.definition(items.getOrThrow(ModTags.BRUSH_ENCHANTABLE), 5, 3, Enchantment.dynamicCost(15, 9), Enchantment.dynamicCost(50, 8), 2, new EquipmentSlotGroup[]{EquipmentSlotGroup.MAINHAND})).withEffect((DataComponentType) ModDataComponents.DELICACY_COMPONENT.get(), new MultiplyValue(LevelBasedValue.perLevel(1.4F, 0.2F))));
    }

    private static void register(BootstrapContext<Enchantment> context, ResourceKey<Enchantment> key, Enchantment.Builder builder) {
        context.register(key, builder.build(key.location()));
    }
}
