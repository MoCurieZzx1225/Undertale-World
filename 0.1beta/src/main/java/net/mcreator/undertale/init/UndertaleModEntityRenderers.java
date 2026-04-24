/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertale.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.undertale.client.renderer.UndyueRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class UndertaleModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(UndertaleModEntities.MAGICSPEARFLY.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(UndertaleModEntities.UNDYUE.get(), UndyueRenderer::new);
	}
}