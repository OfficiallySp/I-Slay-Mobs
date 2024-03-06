
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.officiallysp.islaymobs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.officiallysp.islaymobs.client.renderer.MylesRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ISlayMobsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ISlayMobsModEntities.MYLES.get(), MylesRenderer::new);
	}
}
