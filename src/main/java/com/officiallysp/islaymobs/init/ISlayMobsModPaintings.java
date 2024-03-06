
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.officiallysp.islaymobs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import com.officiallysp.islaymobs.ISlayMobsMod;

public class ISlayMobsModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ISlayMobsMod.MODID);
	public static final RegistryObject<PaintingVariant> CHEESELOGO = REGISTRY.register("cheeselogo", () -> new PaintingVariant(32, 32));
	public static final RegistryObject<PaintingVariant> CHEDDAR = REGISTRY.register("cheddar", () -> new PaintingVariant(32, 32));
}
