
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.officiallysp.islaymobs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.officiallysp.islaymobs.ISlayMobsMod;

public class ISlayMobsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ISlayMobsMod.MODID);
	public static final RegistryObject<SoundEvent> OG = REGISTRY.register("og", () -> new SoundEvent(new ResourceLocation("i_slay_mobs", "og")));
	public static final RegistryObject<SoundEvent> OGXMAS = REGISTRY.register("ogxmas",
			() -> new SoundEvent(new ResourceLocation("i_slay_mobs", "ogxmas")));
	public static final RegistryObject<SoundEvent> REMASTERED = REGISTRY.register("remastered",
			() -> new SoundEvent(new ResourceLocation("i_slay_mobs", "remastered")));
	public static final RegistryObject<SoundEvent> REMASTEREDXMAS = REGISTRY.register("remasteredxmas",
			() -> new SoundEvent(new ResourceLocation("i_slay_mobs", "remasteredxmas")));
}
