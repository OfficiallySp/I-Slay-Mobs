package com.officiallysp.islaymobs.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import com.officiallysp.islaymobs.init.ISlayMobsModItems;

public class ShadecommandProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.hasPermissions(2)) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ISlayMobsModItems.SECRETSHADE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
