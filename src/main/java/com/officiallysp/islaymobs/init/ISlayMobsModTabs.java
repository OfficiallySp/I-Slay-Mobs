
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.officiallysp.islaymobs.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import com.officiallysp.islaymobs.ISlayMobsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ISlayMobsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ISlayMobsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ISlayMobsModItems.ISLAYMOBS_ORIGINAL.get());
			tabData.accept(ISlayMobsModItems.ISLAYMOBS_REMASTER.get());
			tabData.accept(ISlayMobsModItems.ISLAYMOBSORIGINALXMAS.get());
			tabData.accept(ISlayMobsModItems.ISLAYMOBSREMASTERXMAS.get());
			tabData.accept(ISlayMobsModItems.MYLES_SPAWN_EGG.get());
		}
	}
}
