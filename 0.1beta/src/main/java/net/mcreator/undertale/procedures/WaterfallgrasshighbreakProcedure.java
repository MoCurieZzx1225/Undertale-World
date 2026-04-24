package net.mcreator.undertale.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.core.BlockPos;

import net.mcreator.undertale.init.UndertaleModBlocks;

public class WaterfallgrasshighbreakProcedure {
	public static InteractionResult execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return InteractionResult.PASS;
		if (UndertaleModBlocks.WATERFALLGRASSHIGH.get().defaultBlockState() == (world.getBlockState(BlockPos.containing(x, y, z)))
				&& (entity instanceof LivingEntity _entUseItem2 ? _entUseItem2.getUseItem() : ItemStack.EMPTY).getItem() == Items.SHEARS) {
		} else {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(UndertaleModBlocks.WATERFALLGRASSHIGH.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		return InteractionResult.FAIL;
	}
}