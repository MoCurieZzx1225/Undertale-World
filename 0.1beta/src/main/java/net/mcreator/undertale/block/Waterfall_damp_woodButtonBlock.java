package net.mcreator.undertale.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.ButtonBlock;

public class Waterfall_damp_woodButtonBlock extends ButtonBlock {
	public Waterfall_damp_woodButtonBlock() {
		super(BlockSetType.OAK, 30, BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(0.75f).noCollission().pushReaction(PushReaction.DESTROY));
	}
}