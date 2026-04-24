/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertale.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.undertale.UndertaleMod;

public class UndertaleModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UndertaleMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> UNDERTALE = REGISTRY.register("undertale",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.undertale.undertale")).icon(() -> new ItemStack(Items.HEART_POTTERY_SHERD)).displayItems((parameters, tabData) -> {
				tabData.accept(UndertaleModBlocks.ECHOFLOWER.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALLGRESS.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALLDIRT.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALLSTONE.get().asItem());
				tabData.accept(UndertaleModItems.WATERFALLWATERMAGIC_BUCKET.get());
				tabData.accept(UndertaleModItems.MAGIC_SWORD.get());
				tabData.accept(UndertaleModItems.MAGICSTONE.get());
				tabData.accept(UndertaleModItems.WATERFALLCRYSTAL.get());
				tabData.accept(UndertaleModBlocks.WATERFALLCRYSTALORE.get().asItem());
				tabData.accept(UndertaleModItems.WATERFALLCRYSTALA_HELMET.get());
				tabData.accept(UndertaleModItems.WATERFALLCRYSTALA_CHESTPLATE.get());
				tabData.accept(UndertaleModItems.WATERFALLCRYSTALA_LEGGINGS.get());
				tabData.accept(UndertaleModItems.WATERFALLCRYSTALA_BOOTS.get());
				tabData.accept(UndertaleModItems.ECHOFLOWERFIBER.get());
				tabData.accept(UndertaleModItems.WATERFALLCRYSTALSWORD.get());
				tabData.accept(UndertaleModItems.WATERFALLCRYSTALPICKAXE.get());
				tabData.accept(UndertaleModItems.WATERFALLCRYSTALAXE.get());
				tabData.accept(UndertaleModItems.WATERFALLCRYSTALHOE.get());
				tabData.accept(UndertaleModItems.WATERFALLCRYSTALSHOVEL.get());
				tabData.accept(UndertaleModBlocks.WATERFALLGRASSHIGH.get().asItem());
				tabData.accept(UndertaleModItems.MAGICWATERMEDICINEBOTTLE.get());
				tabData.accept(UndertaleModItems.MAGICWATER.get());
				tabData.accept(UndertaleModBlocks.LOTUS.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALLSTONEBAND.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALLCRYSTALBLOCK.get().asItem());
				tabData.accept(UndertaleModItems.UNDYUE_SPAWN_EGG.get());
				tabData.accept(UndertaleModBlocks.WATERFALL_DAMP_WOOD_LOG.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALL_DAMP_WOOD_WOOD.get().asItem());
				tabData.accept(UndertaleModBlocks.STRIPPED_WATERFALL_DAMP_WOOD_LOG.get().asItem());
				tabData.accept(UndertaleModBlocks.STRIPPED_WATERFALL_DAMP_WOOD_WOOD.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALL_DAMP_WOOD_PLANKS.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALL_DAMP_WOOD_LEAVES.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALL_DAMP_WOOD_STAIRS.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALL_DAMP_WOOD_SLAB.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALL_DAMP_WOOD_FENCE.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALL_DAMP_WOOD_FENCE_GATE.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALL_DAMP_WOOD_DOOR.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALL_DAMP_WOOD_TRAPDOOR.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALL_DAMP_WOOD_PRESSURE_PLATE.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALL_DAMP_WOOD_BUTTON.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALL_DAMP_WOOD_SIGN.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALL_DAMP_WOOD_HANGING_SIGN.get().asItem());
				tabData.accept(UndertaleModItems.WATERFALL_DAMP_WOOD_BOAT.get());
				tabData.accept(UndertaleModItems.WATERFALL_DAMP_WOOD_CHEST_BOAT.get());
				tabData.accept(UndertaleModItems.SEATEA.get());
				tabData.accept(UndertaleModItems.MAGICSPEAR_0.get());
				tabData.accept(UndertaleModItems.WATERFALLCRYSTALINGOT.get());
				tabData.accept(UndertaleModBlocks.Q.get().asItem());
				tabData.accept(UndertaleModItems.WATERFALL_RED_CRYSTAL.get());
				tabData.accept(UndertaleModBlocks.WATERFALL_RED_CRYSTAL_ORE.get().asItem());
				tabData.accept(UndertaleModBlocks.WATERFALL_RED_CRYSTAL_BLOCK.get().asItem());
				tabData.accept(UndertaleModItems.WATERFALLREDCRYSTALINGOT.get());
				tabData.accept(UndertaleModItems.BALLETSHOES.get());
			}).build());
}