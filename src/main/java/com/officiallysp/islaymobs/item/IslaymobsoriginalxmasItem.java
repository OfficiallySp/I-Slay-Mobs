
package com.officiallysp.islaymobs.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import java.util.List;

import com.officiallysp.islaymobs.ISlayMobsModElements;

@ISlayMobsModElements.ModElement.Tag
public class IslaymobsoriginalxmasItem extends ISlayMobsModElements.ModElement {
	@ObjectHolder("i_slay_mobs:islaymobsoriginalxmas")
	public static final Item block = null;
	public IslaymobsoriginalxmasItem(ISlayMobsModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, ISlayMobsModElements.sounds.get(new ResourceLocation("i_slay_mobs:ogxmas")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("islaymobsoriginalxmas");
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Christmas Edition"));
		}
	}
}
