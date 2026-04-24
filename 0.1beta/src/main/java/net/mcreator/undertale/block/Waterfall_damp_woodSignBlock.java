package net.mcreator.undertale.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.undertale.init.UndertaleModWoodTypes;

public class Waterfall_damp_woodSignBlock extends StandingSignBlock {
	public Waterfall_damp_woodSignBlock() {
		super(UndertaleModWoodTypes.WATERFALL_DAMP_WOOD_SIGN_WOOD_TYPE, BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1.5f).noCollission().ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn());
	}
}