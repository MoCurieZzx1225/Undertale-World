/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertale.init;

import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class UndertaleModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == UndertaleModBlocks.ECHOFLOWER.get().asItem())
			event.setBurnTime(100);
		else if (itemstack.getItem() == UndertaleModItems.WATERFALL_RED_CRYSTAL.get())
			event.setBurnTime(1200);
	}
}