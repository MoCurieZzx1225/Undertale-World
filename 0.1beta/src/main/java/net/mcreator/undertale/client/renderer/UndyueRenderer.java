package net.mcreator.undertale.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.undertale.entity.UndyueEntity;
import net.mcreator.undertale.client.model.animations.undyueAnimation;
import net.mcreator.undertale.client.model.Modelundyue;

public class UndyueRenderer extends MobRenderer<UndyueEntity, Modelundyue<UndyueEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("undertale:textures/entities/undyue.png");

	public UndyueRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelundyue.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(UndyueEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelundyue<UndyueEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<UndyueEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(UndyueEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(undyueAnimation.walk, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(UndyueEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}