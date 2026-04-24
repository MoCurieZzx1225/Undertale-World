package net.mcreator.undertale.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.CeilingHangingSignBlock;

import net.mcreator.undertale.init.UndertaleModWoodTypes;

public class Waterfall_damp_woodHangingSignBlock extends CeilingHangingSignBlock {
	public Waterfall_damp_woodHangingSignBlock() {
		super(UndertaleModWoodTypes.WATERFALL_DAMP_WOOD_HANGING_SIGN_WOOD_TYPE, BlockBehaviour.Properties.of().sound(SoundType.HANGING_SIGN).strength(1.5f).noCollission().ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn());
	}
}