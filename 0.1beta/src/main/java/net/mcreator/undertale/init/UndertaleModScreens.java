/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertale.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.undertale.client.gui.WScreen;

@EventBusSubscriber(Dist.CLIENT)
public class UndertaleModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(UndertaleModMenus.W.get(), WScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}