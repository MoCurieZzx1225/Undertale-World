package com.undertale.enchantment;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.enchantment.Enchantment;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = 
        DeferredRegister.create(Registries.ENCHANTMENT, "undertale");

    public static final ResourceKey<Enchantment> DETERMINATION = ResourceKey.create(
        Registries.ENCHANTMENT, 
        ResourceLocation.fromNamespaceAndPath("undertale", "determination")
    );

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }
}