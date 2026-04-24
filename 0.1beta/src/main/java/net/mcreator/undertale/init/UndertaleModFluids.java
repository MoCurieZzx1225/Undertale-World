/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertale.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.undertale.fluid.WaterfallwatermagicFluid;
import net.mcreator.undertale.UndertaleMod;

public class UndertaleModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, UndertaleMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> WATERFALLWATERMAGIC = REGISTRY.register("waterfallwatermagic", () -> new WaterfallwatermagicFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_WATERFALLWATERMAGIC = REGISTRY.register("flowing_waterfallwatermagic", () -> new WaterfallwatermagicFluid.Flowing());

	@EventBusSubscriber(Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(WATERFALLWATERMAGIC.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_WATERFALLWATERMAGIC.get(), RenderType.translucent());
		}
	}
}