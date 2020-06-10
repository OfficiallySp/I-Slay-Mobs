package com.officiallysp.islaymobs.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec2f;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import com.officiallysp.islaymobs.item.IslaymobsRemasterItem;
import com.officiallysp.islaymobs.item.IslaymobsOriginalItem;
import com.officiallysp.islaymobs.ISlayMobsModElements;

@ISlayMobsModElements.ModElement.Tag
public class ResetExecutedProcedure extends ISlayMobsModElements.ModElement {
	public ResetExecutedProcedure(ISlayMobsModElements instance) {
		super(instance, 11);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ResetExecuted!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ResetExecuted!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ResetExecuted!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ResetExecuted!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ResetExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(IslaymobsOriginalItem.block, (int) (1)).getItem() == p.getItem(),
					(int) 1);
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(IslaymobsRemasterItem.block, (int) (1)).getItem() == p.getItem(),
					(int) 1);
		if (!world.isRemote && world.getServer() != null) {
			world.getServer().getCommandManager()
					.handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getServer(), null).withFeedbackDisabled(),
							"/advancement grant @s only i_slay_mobs:unlock");
		}
	}
}
