/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertale.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.core.dispenser.BoatDispenseItemBehavior;

@EventBusSubscriber
public class UndertaleModDispenseBehaviors {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DispenserBlock.registerBehavior(UndertaleModItems.WATERFALL_DAMP_WOOD_BOAT.get(), new BoatDispenseItemBehavior(UndertaleModBoatTypes.WATERFALL_DAMP_WOOD_BOAT_TYPE.getValue()));
			DispenserBlock.registerBehavior(UndertaleModItems.WATERFALL_DAMP_WOOD_CHEST_BOAT.get(), new BoatDispenseItemBehavior(UndertaleModBoatTypes.WATERFALL_DAMP_WOOD_CHEST_BOAT_TYPE.getValue(), true));
		});
	}
}