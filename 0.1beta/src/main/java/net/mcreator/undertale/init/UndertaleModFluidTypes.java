/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertale.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.undertale.fluid.types.WaterfallwatermagicFluidType;
import net.mcreator.undertale.UndertaleMod;

public class UndertaleModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, UndertaleMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> WATERFALLWATERMAGIC_TYPE = REGISTRY.register("waterfallwatermagic", () -> new WaterfallwatermagicFluidType());
}