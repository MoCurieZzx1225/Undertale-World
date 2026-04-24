package net.mcreator.undertale.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class WaterfallditBlock extends Block {
	public WaterfallditBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 3f).lightLevel(blockstate -> 1));
	}
}