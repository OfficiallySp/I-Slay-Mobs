
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.officiallysp.islaymobs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import com.officiallysp.islaymobs.enchantment.CheeseEnchantment;
import com.officiallysp.islaymobs.ISlayMobsMod;

public class ISlayMobsModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ISlayMobsMod.MODID);
	public static final RegistryObject<Enchantment> CHEESE = REGISTRY.register("cheese", () -> new CheeseEnchantment());
}
