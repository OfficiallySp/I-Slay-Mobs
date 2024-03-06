
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.officiallysp.islaymobs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import com.officiallysp.islaymobs.item.SecretshadeItem;
import com.officiallysp.islaymobs.item.IslaymobsremasterxmasItem;
import com.officiallysp.islaymobs.item.IslaymobsoriginalxmasItem;
import com.officiallysp.islaymobs.item.IslaymobsRemasterItem;
import com.officiallysp.islaymobs.item.IslaymobsOriginalItem;
import com.officiallysp.islaymobs.ISlayMobsMod;

public class ISlayMobsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ISlayMobsMod.MODID);
	public static final RegistryObject<Item> ISLAYMOBS_ORIGINAL = REGISTRY.register("islaymobs_original", () -> new IslaymobsOriginalItem());
	public static final RegistryObject<Item> ISLAYMOBS_REMASTER = REGISTRY.register("islaymobs_remaster", () -> new IslaymobsRemasterItem());
	public static final RegistryObject<Item> ISLAYMOBSORIGINALXMAS = REGISTRY.register("islaymobsoriginalxmas", () -> new IslaymobsoriginalxmasItem());
	public static final RegistryObject<Item> ISLAYMOBSREMASTERXMAS = REGISTRY.register("islaymobsremasterxmas", () -> new IslaymobsremasterxmasItem());
	public static final RegistryObject<Item> SECRETSHADE = REGISTRY.register("secretshade", () -> new SecretshadeItem());
	public static final RegistryObject<Item> MYLES_SPAWN_EGG = REGISTRY.register("myles_spawn_egg", () -> new ForgeSpawnEggItem(ISlayMobsModEntities.MYLES, -205, -26317, new Item.Properties()));
}
