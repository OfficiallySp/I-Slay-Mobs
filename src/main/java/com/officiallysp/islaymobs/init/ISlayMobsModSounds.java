
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
	public static final RegistryObject<SoundEvent> OG = REGISTRY.register("og", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("i_slay_mobs", "og")));
	public static final RegistryObject<SoundEvent> OGXMAS = REGISTRY.register("ogxmas", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("i_slay_mobs", "ogxmas")));
	public static final RegistryObject<SoundEvent> REMASTERED = REGISTRY.register("remastered", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("i_slay_mobs", "remastered")));
	public static final RegistryObject<SoundEvent> REMASTEREDXMAS = REGISTRY.register("remasteredxmas", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("i_slay_mobs", "remasteredxmas")));
	public static final RegistryObject<SoundEvent> SHADE = REGISTRY.register("shade", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("i_slay_mobs", "shade")));
	public static final RegistryObject<SoundEvent> MYLESHURT = REGISTRY.register("myleshurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("i_slay_mobs", "myleshurt")));
	public static final RegistryObject<SoundEvent> MYLESDED = REGISTRY.register("mylesded", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("i_slay_mobs", "mylesded")));
	public static final RegistryObject<SoundEvent> MYLESLIST = REGISTRY.register("myleslist", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("i_slay_mobs", "myleslist")));
}
