/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertale.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.undertale.UndertaleMod;

public class UndertaleModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, UndertaleMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> WATERFALL = REGISTRY.register("waterfall", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("undertale", "waterfall")));
}