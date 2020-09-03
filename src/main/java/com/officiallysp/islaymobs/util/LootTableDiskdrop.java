
package com.officiallysp.islaymobs.util;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

import com.officiallysp.islaymobs.ElementsISlayMobsMod;

@ElementsISlayMobsMod.ModElement.Tag
public class LootTableDiskdrop extends ElementsISlayMobsMod.ModElement {
	public LootTableDiskdrop(ElementsISlayMobsMod instance) {
		super(instance, 4);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("i_slay_mobs", "diskdrop"));
	}
}
