package me.pmnq.ArchaeologyExpanded.registry;

import net.minecraft.core.component.DataComponentType;
import net.minecraft.world.item.enchantment.ConditionalEffect;
import net.minecraft.world.item.enchantment.effects.EnchantmentValueEffect;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.List;

import static me.pmnq.ArchaeologyExpanded.ArchaeologyExpanded.MOD_ID;

public class ModDataComponents {

    public static final RegistryUtils.EnchantmentEffectComponents ENCHANTMENT_EFFECT_COMPONENTS = RegistryUtils.createEnchantmentEffectComponents(MOD_ID);

    public static final DeferredHolder<DataComponentType<?>, DataComponentType<List<ConditionalEffect<EnchantmentValueEffect>>>> DELICACY_COMPONENT;

    static {
        DELICACY_COMPONENT = ENCHANTMENT_EFFECT_COMPONENTS.registerComponentType("delicacy", (builder) -> {
            return builder.persistent(ConditionalEffect.codec(EnchantmentValueEffect.CODEC, LootContextParamSets.HIT_BLOCK).listOf());
        });
    }
}
