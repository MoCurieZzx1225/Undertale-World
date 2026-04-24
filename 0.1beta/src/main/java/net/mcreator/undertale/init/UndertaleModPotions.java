/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertale.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.undertale.UndertaleMod;

public class UndertaleModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, UndertaleMod.MODID);
	public static final DeferredHolder<Potion, Potion> WATERFALLMAGICWATERBOTTLE = REGISTRY.register("waterfallmagicwaterbottle", () -> new Potion(new MobEffectInstance(MobEffects.NIGHT_VISION, 12000, 0, false, true),
			new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 2, false, true), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 7200, 0, false, true), new MobEffectInstance(MobEffects.WEAKNESS, 1200, 2, false, true)));
}