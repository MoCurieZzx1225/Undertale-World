/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertale.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.undertale.UndertaleMod;

public class UndertaleModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, UndertaleMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> WATERFALLPARTICLE = REGISTRY.register("waterfallparticle", () -> new SimpleParticleType(false));
}