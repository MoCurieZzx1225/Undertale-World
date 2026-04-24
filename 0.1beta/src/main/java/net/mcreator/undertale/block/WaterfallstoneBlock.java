package net.mcreator.undertale.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class WaterfallstoneBlock extends Block {
	public WaterfallstoneBlock() {
		super(BlockBehaviour.Properties.of().strength(1.5f, 7f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}