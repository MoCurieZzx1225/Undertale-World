package net.mcreator.undertale.fluid.types;

import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.Minecraft;

import net.mcreator.undertale.init.UndertaleModFluidTypes;

@EventBusSubscriber
public class WaterfallwatermagicFluidType extends FluidType {
	public WaterfallwatermagicFluidType() {
		super(FluidType.Properties.create().fallDistanceModifier(0F).canExtinguish(true).supportsBoating(true).canHydrate(true).motionScale(0.0084D).lightLevel(14).canConvertToSource(true).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
				.sound(SoundActions.BUCKET_EMPTY, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.drowned.ambient_water"))).sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH));
	}

	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = ResourceLocation.parse("undertale:block/waterfall_water_magic_still");
			private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.parse("undertale:block/w");
			private static final ResourceLocation RENDER_OVERLAY_TEXTURE = ResourceLocation.parse("undertale:textures/waterfall_water.png");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}

			@Override
			public ResourceLocation getRenderOverlayTexture(Minecraft mc) {
				return RENDER_OVERLAY_TEXTURE;
			}
		}, UndertaleModFluidTypes.WATERFALLWATERMAGIC_TYPE.get());
	}
}