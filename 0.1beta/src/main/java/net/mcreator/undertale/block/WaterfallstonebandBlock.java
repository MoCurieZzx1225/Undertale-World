package net.mcreator.undertale.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class WaterfallstonebandBlock extends Block {
	public WaterfallstonebandBlock() {
		super(BlockBehaviour.Properties.of().strength(2f, 8f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}