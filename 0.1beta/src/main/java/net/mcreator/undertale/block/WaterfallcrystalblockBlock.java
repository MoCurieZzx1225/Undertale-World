package net.mcreator.undertale.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class WaterfallcrystalblockBlock extends Block {
	public WaterfallcrystalblockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(3.5f, 10f).lightLevel(blockstate -> 15).requiresCorrectToolForDrops().friction(0.5f).speedFactor(1.1f).instrument(NoteBlockInstrument.CHIME));
	}
}