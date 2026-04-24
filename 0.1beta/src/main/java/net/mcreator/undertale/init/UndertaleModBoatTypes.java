/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertale.init;

import net.neoforged.fml.common.asm.enumextension.EnumProxy;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.vehicle.Boat;

import java.util.function.Supplier;

public class UndertaleModBoatTypes {
	public static final EnumProxy<Boat.Type> WATERFALL_DAMP_WOOD_BOAT_TYPE = new EnumProxy<>(Boat.Type.class, (Supplier<Block>) () -> Blocks.OAK_PLANKS, "undertale:waterfall_damp_wood_boat", UndertaleModItems.WATERFALL_DAMP_WOOD_BOAT,
			(Supplier<Item>) () -> Items.AIR, (Supplier<Item>) () -> Items.STICK, false);
	public static final EnumProxy<Boat.Type> WATERFALL_DAMP_WOOD_CHEST_BOAT_TYPE = new EnumProxy<>(Boat.Type.class, (Supplier<Block>) () -> Blocks.OAK_PLANKS, "undertale:waterfall_damp_wood_chest_boat", (Supplier<Item>) () -> Items.AIR,
			UndertaleModItems.WATERFALL_DAMP_WOOD_CHEST_BOAT, (Supplier<Item>) () -> Items.STICK, false);
}