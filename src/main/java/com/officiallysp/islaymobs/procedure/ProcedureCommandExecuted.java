package com.officiallysp.islaymobs.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Map;
import java.util.Iterator;

import com.officiallysp.islaymobs.item.ItemIslaymobsRemaster;
import com.officiallysp.islaymobs.item.ItemIslaymobsOriginal;
import com.officiallysp.islaymobs.ElementsISlayMobsMod;

@ElementsISlayMobsMod.ModElement.Tag
public class ProcedureCommandExecuted extends ElementsISlayMobsMod.ModElement {
	public ProcedureCommandExecuted(ElementsISlayMobsMod instance) {
		super(instance, 8);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.canUseCommand((int) 2, ""))) {
			if (entity instanceof EntityPlayerMP) {
				Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
						.getAdvancement(new ResourceLocation("i_slay_mobs:unlock"));
				AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemaningCriteria().iterator();
					while (_iterator.hasNext()) {
						String _criterion = (String) _iterator.next();
						((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
					}
				}
			}
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemIslaymobsOriginal.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemIslaymobsRemaster.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
	}
}
