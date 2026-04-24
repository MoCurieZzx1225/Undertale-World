/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertale.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.client.renderer.Sheets;

import net.mcreator.undertale.block.*;
import net.mcreator.undertale.UndertaleMod;

@EventBusSubscriber
public class UndertaleModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(UndertaleMod.MODID);
	public static final DeferredBlock<Block> UNDERTALE_PORTAL;
	public static final DeferredBlock<Block> ECHOFLOWER;
	public static final DeferredBlock<Block> WATERFALLGRESS;
	public static final DeferredBlock<Block> WATERFALLDIRT;
	public static final DeferredBlock<Block> WATERFALLSTONE;
	public static final DeferredBlock<Block> WATERFALLWATERMAGIC;
	public static final DeferredBlock<Block> WATERFALLCRYSTALORE;
	public static final DeferredBlock<Block> WATERFALLGRASSHIGH;
	public static final DeferredBlock<Block> LOTUS;
	public static final DeferredBlock<Block> WATERFALLSTONEBAND;
	public static final DeferredBlock<Block> WATERFALLCRYSTALBLOCK;
	public static final DeferredBlock<Block> WATERFALL_DAMP_WOOD_LOG;
	public static final DeferredBlock<Block> WATERFALL_DAMP_WOOD_WOOD;
	public static final DeferredBlock<Block> STRIPPED_WATERFALL_DAMP_WOOD_LOG;
	public static final DeferredBlock<Block> STRIPPED_WATERFALL_DAMP_WOOD_WOOD;
	public static final DeferredBlock<Block> WATERFALL_DAMP_WOOD_PLANKS;
	public static final DeferredBlock<Block> WATERFALL_DAMP_WOOD_LEAVES;
	public static final DeferredBlock<Block> WATERFALL_DAMP_WOOD_STAIRS;
	public static final DeferredBlock<Block> WATERFALL_DAMP_WOOD_SLAB;
	public static final DeferredBlock<Block> WATERFALL_DAMP_WOOD_FENCE;
	public static final DeferredBlock<Block> WATERFALL_DAMP_WOOD_FENCE_GATE;
	public static final DeferredBlock<Block> WATERFALL_DAMP_WOOD_DOOR;
	public static final DeferredBlock<Block> WATERFALL_DAMP_WOOD_TRAPDOOR;
	public static final DeferredBlock<Block> WATERFALL_DAMP_WOOD_PRESSURE_PLATE;
	public static final DeferredBlock<Block> WATERFALL_DAMP_WOOD_BUTTON;
	public static final DeferredBlock<Block> WATERFALL_DAMP_WOOD_SIGN;
	public static final DeferredBlock<Block> WATERFALL_DAMP_WOOD_WALL_SIGN;
	public static final DeferredBlock<Block> WATERFALL_DAMP_WOOD_HANGING_SIGN;
	public static final DeferredBlock<Block> WATERFALL_DAMP_WOOD_WALL_HANGING_SIGN;
	public static final DeferredBlock<Block> Q;
	public static final DeferredBlock<Block> WATERFALL_RED_CRYSTAL_ORE;
	public static final DeferredBlock<Block> WATERFALL_RED_CRYSTAL_BLOCK;
	static {
		UNDERTALE_PORTAL = REGISTRY.register("undertale_portal", UndertalePortalBlock::new);
		ECHOFLOWER = REGISTRY.register("echoflower", GemabungaBlock::new);
		WATERFALLGRESS = REGISTRY.register("waterfallgress", WaterfallgressBlock::new);
		WATERFALLDIRT = REGISTRY.register("waterfalldirt", WaterfallditBlock::new);
		WATERFALLSTONE = REGISTRY.register("waterfallstone", WaterfallstoneBlock::new);
		WATERFALLWATERMAGIC = REGISTRY.register("waterfallwatermagic", WaterfallwatermagicBlock::new);
		WATERFALLCRYSTALORE = REGISTRY.register("waterfallcrystalore", WaterfallcrystaloreBlock::new);
		WATERFALLGRASSHIGH = REGISTRY.register("waterfallgrasshigh", WaterfallgrasshighBlock::new);
		LOTUS = REGISTRY.register("lotus", LotusBlock::new);
		WATERFALLSTONEBAND = REGISTRY.register("waterfallstoneband", WaterfallstonebandBlock::new);
		WATERFALLCRYSTALBLOCK = REGISTRY.register("waterfallcrystalblock", WaterfallcrystalblockBlock::new);
		WATERFALL_DAMP_WOOD_LOG = REGISTRY.register("waterfall_damp_wood_log", Waterfall_damp_woodLogBlock::new);
		WATERFALL_DAMP_WOOD_WOOD = REGISTRY.register("waterfall_damp_wood_wood", Waterfall_damp_woodWoodBlock::new);
		STRIPPED_WATERFALL_DAMP_WOOD_LOG = REGISTRY.register("stripped_waterfall_damp_wood_log", StrippedWaterfall_damp_woodLogBlock::new);
		STRIPPED_WATERFALL_DAMP_WOOD_WOOD = REGISTRY.register("stripped_waterfall_damp_wood_wood", StrippedWaterfall_damp_woodWoodBlock::new);
		WATERFALL_DAMP_WOOD_PLANKS = REGISTRY.register("waterfall_damp_wood_planks", Waterfall_damp_woodPlanksBlock::new);
		WATERFALL_DAMP_WOOD_LEAVES = REGISTRY.register("waterfall_damp_wood_leaves", Waterfall_damp_woodLeavesBlock::new);
		WATERFALL_DAMP_WOOD_STAIRS = REGISTRY.register("waterfall_damp_wood_stairs", Waterfall_damp_woodStairsBlock::new);
		WATERFALL_DAMP_WOOD_SLAB = REGISTRY.register("waterfall_damp_wood_slab", Waterfall_damp_woodSlabBlock::new);
		WATERFALL_DAMP_WOOD_FENCE = REGISTRY.register("waterfall_damp_wood_fence", Waterfall_damp_woodFenceBlock::new);
		WATERFALL_DAMP_WOOD_FENCE_GATE = REGISTRY.register("waterfall_damp_wood_fence_gate", Waterfall_damp_woodFenceGateBlock::new);
		WATERFALL_DAMP_WOOD_DOOR = REGISTRY.register("waterfall_damp_wood_door", Waterfall_damp_woodDoorBlock::new);
		WATERFALL_DAMP_WOOD_TRAPDOOR = REGISTRY.register("waterfall_damp_wood_trapdoor", Waterfall_damp_woodTrapdoorBlock::new);
		WATERFALL_DAMP_WOOD_PRESSURE_PLATE = REGISTRY.register("waterfall_damp_wood_pressure_plate", Waterfall_damp_woodPressurePlateBlock::new);
		WATERFALL_DAMP_WOOD_BUTTON = REGISTRY.register("waterfall_damp_wood_button", Waterfall_damp_woodButtonBlock::new);
		WATERFALL_DAMP_WOOD_SIGN = REGISTRY.register("waterfall_damp_wood_sign", Waterfall_damp_woodSignBlock::new);
		WATERFALL_DAMP_WOOD_WALL_SIGN = REGISTRY.register("waterfall_damp_wood_wall_sign", Waterfall_damp_woodWallSignBlock::new);
		WATERFALL_DAMP_WOOD_HANGING_SIGN = REGISTRY.register("waterfall_damp_wood_hanging_sign", Waterfall_damp_woodHangingSignBlock::new);
		WATERFALL_DAMP_WOOD_WALL_HANGING_SIGN = REGISTRY.register("waterfall_damp_wood_wall_hanging_sign", Waterfall_damp_woodWallHangingSignBlock::new);
		Q = REGISTRY.register("q", QBlock::new);
		WATERFALL_RED_CRYSTAL_ORE = REGISTRY.register("waterfall_red_crystal_ore", Waterfall_red_crystalOreBlock::new);
		WATERFALL_RED_CRYSTAL_BLOCK = REGISTRY.register("waterfall_red_crystal_block", Waterfall_red_crystalBlockBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@EventBusSubscriber(Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			GemabungaBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			Sheets.addWoodType(UndertaleModWoodTypes.WATERFALL_DAMP_WOOD_SIGN_WOOD_TYPE);
			Sheets.addWoodType(UndertaleModWoodTypes.WATERFALL_DAMP_WOOD_HANGING_SIGN_WOOD_TYPE);
		}
	}

	@SubscribeEvent
	public static void registerSigns(BlockEntityTypeAddBlocksEvent event) {
		event.modify(BlockEntityType.SIGN, WATERFALL_DAMP_WOOD_SIGN.get(), WATERFALL_DAMP_WOOD_WALL_SIGN.get());
		event.modify(BlockEntityType.HANGING_SIGN, WATERFALL_DAMP_WOOD_HANGING_SIGN.get(), WATERFALL_DAMP_WOOD_WALL_HANGING_SIGN.get());
	}
}