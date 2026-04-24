/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertale.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.*;

import net.mcreator.undertale.item.*;
import net.mcreator.undertale.UndertaleMod;

@EventBusSubscriber
public class UndertaleModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(UndertaleMod.MODID);
	public static final DeferredItem<Item> ECHOFLOWER;
	public static final DeferredItem<Item> WATERFALLGRESS;
	public static final DeferredItem<Item> WATERFALLDIRT;
	public static final DeferredItem<Item> WATERFALLSTONE;
	public static final DeferredItem<Item> WATERFALLWATERMAGIC_BUCKET;
	public static final DeferredItem<Item> MAGIC_SWORD;
	public static final DeferredItem<Item> MAGICSTONE;
	public static final DeferredItem<Item> WATERFALLCRYSTAL;
	public static final DeferredItem<Item> WATERFALLCRYSTALORE;
	public static final DeferredItem<Item> WATERFALLCRYSTALA_HELMET;
	public static final DeferredItem<Item> WATERFALLCRYSTALA_CHESTPLATE;
	public static final DeferredItem<Item> WATERFALLCRYSTALA_LEGGINGS;
	public static final DeferredItem<Item> WATERFALLCRYSTALA_BOOTS;
	public static final DeferredItem<Item> ECHOFLOWERFIBER;
	public static final DeferredItem<Item> WATERFALLCRYSTALSWORD;
	public static final DeferredItem<Item> WATERFALLCRYSTALPICKAXE;
	public static final DeferredItem<Item> WATERFALLCRYSTALAXE;
	public static final DeferredItem<Item> WATERFALLCRYSTALHOE;
	public static final DeferredItem<Item> WATERFALLCRYSTALSHOVEL;
	public static final DeferredItem<Item> WATERFALLGRASSHIGH;
	public static final DeferredItem<Item> MAGICWATERMEDICINEBOTTLE;
	public static final DeferredItem<Item> MAGICWATER;
	public static final DeferredItem<Item> LOTUS;
	public static final DeferredItem<Item> WATERFALLSTONEBAND;
	public static final DeferredItem<Item> WATERFALLCRYSTALBLOCK;
	public static final DeferredItem<Item> UNDYUE_SPAWN_EGG;
	public static final DeferredItem<Item> WATERFALL_DAMP_WOOD_LOG;
	public static final DeferredItem<Item> WATERFALL_DAMP_WOOD_WOOD;
	public static final DeferredItem<Item> STRIPPED_WATERFALL_DAMP_WOOD_LOG;
	public static final DeferredItem<Item> STRIPPED_WATERFALL_DAMP_WOOD_WOOD;
	public static final DeferredItem<Item> WATERFALL_DAMP_WOOD_PLANKS;
	public static final DeferredItem<Item> WATERFALL_DAMP_WOOD_LEAVES;
	public static final DeferredItem<Item> WATERFALL_DAMP_WOOD_STAIRS;
	public static final DeferredItem<Item> WATERFALL_DAMP_WOOD_SLAB;
	public static final DeferredItem<Item> WATERFALL_DAMP_WOOD_FENCE;
	public static final DeferredItem<Item> WATERFALL_DAMP_WOOD_FENCE_GATE;
	public static final DeferredItem<Item> WATERFALL_DAMP_WOOD_DOOR;
	public static final DeferredItem<Item> WATERFALL_DAMP_WOOD_TRAPDOOR;
	public static final DeferredItem<Item> WATERFALL_DAMP_WOOD_PRESSURE_PLATE;
	public static final DeferredItem<Item> WATERFALL_DAMP_WOOD_BUTTON;
	public static final DeferredItem<Item> WATERFALL_DAMP_WOOD_SIGN;
	public static final DeferredItem<Item> WATERFALL_DAMP_WOOD_HANGING_SIGN;
	public static final DeferredItem<Item> WATERFALL_DAMP_WOOD_BOAT;
	public static final DeferredItem<Item> WATERFALL_DAMP_WOOD_CHEST_BOAT;
	public static final DeferredItem<Item> SEATEA;
	public static final DeferredItem<Item> MAGICSPEAR_0;
	public static final DeferredItem<Item> WATERFALLCRYSTALINGOT;
	public static final DeferredItem<Item> Q;
	public static final DeferredItem<Item> WATERFALL_RED_CRYSTAL;
	public static final DeferredItem<Item> WATERFALL_RED_CRYSTAL_ORE;
	public static final DeferredItem<Item> WATERFALL_RED_CRYSTAL_BLOCK;
	public static final DeferredItem<Item> WATERFALLREDCRYSTALINGOT;
	public static final DeferredItem<Item> BALLETSHOES;
	static {
		ECHOFLOWER = doubleBlock(UndertaleModBlocks.ECHOFLOWER);
		WATERFALLGRESS = block(UndertaleModBlocks.WATERFALLGRESS);
		WATERFALLDIRT = block(UndertaleModBlocks.WATERFALLDIRT);
		WATERFALLSTONE = block(UndertaleModBlocks.WATERFALLSTONE);
		WATERFALLWATERMAGIC_BUCKET = REGISTRY.register("waterfallwatermagic_bucket", WaterfallwatermagicItem::new);
		MAGIC_SWORD = REGISTRY.register("magic_sword", MagicSwordItem::new);
		MAGICSTONE = REGISTRY.register("magicstone", MagicstoneItem::new);
		WATERFALLCRYSTAL = REGISTRY.register("waterfallcrystal", WaterfallcrystalItem::new);
		WATERFALLCRYSTALORE = block(UndertaleModBlocks.WATERFALLCRYSTALORE);
		WATERFALLCRYSTALA_HELMET = REGISTRY.register("waterfallcrystala_helmet", WaterfallcrystalaItem.Helmet::new);
		WATERFALLCRYSTALA_CHESTPLATE = REGISTRY.register("waterfallcrystala_chestplate", WaterfallcrystalaItem.Chestplate::new);
		WATERFALLCRYSTALA_LEGGINGS = REGISTRY.register("waterfallcrystala_leggings", WaterfallcrystalaItem.Leggings::new);
		WATERFALLCRYSTALA_BOOTS = REGISTRY.register("waterfallcrystala_boots", WaterfallcrystalaItem.Boots::new);
		ECHOFLOWERFIBER = REGISTRY.register("echoflowerfiber", EchoflowerfiberItem::new);
		WATERFALLCRYSTALSWORD = REGISTRY.register("waterfallcrystalsword", WaterfallcrystalswordItem::new);
		WATERFALLCRYSTALPICKAXE = REGISTRY.register("waterfallcrystalpickaxe", WaterfallcrystalpickaxeItem::new);
		WATERFALLCRYSTALAXE = REGISTRY.register("waterfallcrystalaxe", WaterfallcrystalaxeItem::new);
		WATERFALLCRYSTALHOE = REGISTRY.register("waterfallcrystalhoe", WaterfallcrystalhoeItem::new);
		WATERFALLCRYSTALSHOVEL = REGISTRY.register("waterfallcrystalshovel", WaterfallcrystalshovelItem::new);
		WATERFALLGRASSHIGH = doubleBlock(UndertaleModBlocks.WATERFALLGRASSHIGH);
		MAGICWATERMEDICINEBOTTLE = REGISTRY.register("magicwatermedicinebottle", MagicwatermedicinebottleItem::new);
		MAGICWATER = REGISTRY.register("magicwater", MagicwaterItem::new);
		LOTUS = block(UndertaleModBlocks.LOTUS);
		WATERFALLSTONEBAND = block(UndertaleModBlocks.WATERFALLSTONEBAND);
		WATERFALLCRYSTALBLOCK = block(UndertaleModBlocks.WATERFALLCRYSTALBLOCK, new Item.Properties().rarity(Rarity.RARE));
		UNDYUE_SPAWN_EGG = REGISTRY.register("undyue_spawn_egg", () -> new DeferredSpawnEggItem(UndertaleModEntities.UNDYUE, -1, -1, new Item.Properties()));
		WATERFALL_DAMP_WOOD_LOG = block(UndertaleModBlocks.WATERFALL_DAMP_WOOD_LOG);
		WATERFALL_DAMP_WOOD_WOOD = block(UndertaleModBlocks.WATERFALL_DAMP_WOOD_WOOD);
		STRIPPED_WATERFALL_DAMP_WOOD_LOG = block(UndertaleModBlocks.STRIPPED_WATERFALL_DAMP_WOOD_LOG);
		STRIPPED_WATERFALL_DAMP_WOOD_WOOD = block(UndertaleModBlocks.STRIPPED_WATERFALL_DAMP_WOOD_WOOD);
		WATERFALL_DAMP_WOOD_PLANKS = block(UndertaleModBlocks.WATERFALL_DAMP_WOOD_PLANKS);
		WATERFALL_DAMP_WOOD_LEAVES = block(UndertaleModBlocks.WATERFALL_DAMP_WOOD_LEAVES);
		WATERFALL_DAMP_WOOD_STAIRS = block(UndertaleModBlocks.WATERFALL_DAMP_WOOD_STAIRS);
		WATERFALL_DAMP_WOOD_SLAB = block(UndertaleModBlocks.WATERFALL_DAMP_WOOD_SLAB);
		WATERFALL_DAMP_WOOD_FENCE = block(UndertaleModBlocks.WATERFALL_DAMP_WOOD_FENCE);
		WATERFALL_DAMP_WOOD_FENCE_GATE = block(UndertaleModBlocks.WATERFALL_DAMP_WOOD_FENCE_GATE);
		WATERFALL_DAMP_WOOD_DOOR = doubleBlock(UndertaleModBlocks.WATERFALL_DAMP_WOOD_DOOR);
		WATERFALL_DAMP_WOOD_TRAPDOOR = block(UndertaleModBlocks.WATERFALL_DAMP_WOOD_TRAPDOOR);
		WATERFALL_DAMP_WOOD_PRESSURE_PLATE = block(UndertaleModBlocks.WATERFALL_DAMP_WOOD_PRESSURE_PLATE);
		WATERFALL_DAMP_WOOD_BUTTON = block(UndertaleModBlocks.WATERFALL_DAMP_WOOD_BUTTON);
		WATERFALL_DAMP_WOOD_SIGN = signBlock(UndertaleModBlocks.WATERFALL_DAMP_WOOD_SIGN, UndertaleModBlocks.WATERFALL_DAMP_WOOD_WALL_SIGN, new Item.Properties().stacksTo(16));
		WATERFALL_DAMP_WOOD_HANGING_SIGN = hangingSignBlock(UndertaleModBlocks.WATERFALL_DAMP_WOOD_HANGING_SIGN, UndertaleModBlocks.WATERFALL_DAMP_WOOD_WALL_HANGING_SIGN, new Item.Properties().stacksTo(16));
		WATERFALL_DAMP_WOOD_BOAT = REGISTRY.register("waterfall_damp_wood_boat", () -> new BoatItem(false, UndertaleModBoatTypes.WATERFALL_DAMP_WOOD_BOAT_TYPE.getValue(), new Item.Properties().stacksTo(1)));
		WATERFALL_DAMP_WOOD_CHEST_BOAT = REGISTRY.register("waterfall_damp_wood_chest_boat", () -> new BoatItem(true, UndertaleModBoatTypes.WATERFALL_DAMP_WOOD_CHEST_BOAT_TYPE.getValue(), new Item.Properties().stacksTo(1)));
		SEATEA = REGISTRY.register("seatea", SeateaItem::new);
		MAGICSPEAR_0 = REGISTRY.register("magicspear_0", Magicspear0Item::new);
		WATERFALLCRYSTALINGOT = REGISTRY.register("waterfallcrystalingot", WaterfallcrystalingotItem::new);
		Q = block(UndertaleModBlocks.Q);
		WATERFALL_RED_CRYSTAL = REGISTRY.register("waterfall_red_crystal", Waterfall_red_crystalItem::new);
		WATERFALL_RED_CRYSTAL_ORE = block(UndertaleModBlocks.WATERFALL_RED_CRYSTAL_ORE);
		WATERFALL_RED_CRYSTAL_BLOCK = block(UndertaleModBlocks.WATERFALL_RED_CRYSTAL_BLOCK);
		WATERFALLREDCRYSTALINGOT = REGISTRY.register("waterfallredcrystalingot", WaterfallredcrystalingotItem::new);
		BALLETSHOES = REGISTRY.register("balletshoes", BalletshoesItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.FluidHandler.ITEM, (stack, context) -> new FluidBucketWrapper(stack), WATERFALLWATERMAGIC_BUCKET.get());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), properties));
	}

	private static DeferredItem<Item> signBlock(DeferredHolder<Block, Block> block, DeferredHolder<Block, Block> wallBlock) {
		return signBlock(block, wallBlock, new Item.Properties());
	}

	private static DeferredItem<Item> signBlock(DeferredHolder<Block, Block> block, DeferredHolder<Block, Block> wallBlock, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new SignItem(properties, block.get(), wallBlock.get()));
	}

	private static DeferredItem<Item> hangingSignBlock(DeferredHolder<Block, Block> block, DeferredHolder<Block, Block> wallBlock) {
		return hangingSignBlock(block, wallBlock, new Item.Properties());
	}

	private static DeferredItem<Item> hangingSignBlock(DeferredHolder<Block, Block> block, DeferredHolder<Block, Block> wallBlock, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new HangingSignItem(block.get(), wallBlock.get(), properties));
	}
}