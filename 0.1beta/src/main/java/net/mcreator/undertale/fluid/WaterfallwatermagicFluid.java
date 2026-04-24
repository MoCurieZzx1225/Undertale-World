package net.mcreator.undertale.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.undertale.init.UndertaleModItems;
import net.mcreator.undertale.init.UndertaleModFluids;
import net.mcreator.undertale.init.UndertaleModFluidTypes;
import net.mcreator.undertale.init.UndertaleModBlocks;

public abstract class WaterfallwatermagicFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> UndertaleModFluidTypes.WATERFALLWATERMAGIC_TYPE.get(), () -> UndertaleModFluids.WATERFALLWATERMAGIC.get(),
			() -> UndertaleModFluids.FLOWING_WATERFALLWATERMAGIC.get()).explosionResistance(100f).tickRate(6).bucket(() -> UndertaleModItems.WATERFALLWATERMAGIC_BUCKET.get()).block(() -> (LiquidBlock) UndertaleModBlocks.WATERFALLWATERMAGIC.get());

	private WaterfallwatermagicFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.FALLING_WATER;
	}

	public static class Source extends WaterfallwatermagicFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends WaterfallwatermagicFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}