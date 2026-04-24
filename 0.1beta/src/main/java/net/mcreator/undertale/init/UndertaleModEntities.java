/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.undertale.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.undertale.entity.UndyueEntity;
import net.mcreator.undertale.entity.MagicspearflyEntity;
import net.mcreator.undertale.UndertaleMod;

@EventBusSubscriber
public class UndertaleModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, UndertaleMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<MagicspearflyEntity>> MAGICSPEARFLY = register("magicspearfly",
			EntityType.Builder.<MagicspearflyEntity>of(MagicspearflyEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.6f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<UndyueEntity>> UNDYUE = register("undyue",
			EntityType.Builder.<UndyueEntity>of(UndyueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		UndyueEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(UNDYUE.get(), UndyueEntity.createAttributes().build());
	}
}