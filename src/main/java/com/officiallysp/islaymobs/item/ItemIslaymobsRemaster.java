
package com.officiallysp.islaymobs.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.List;

import com.officiallysp.islaymobs.ElementsISlayMobsMod;

@ElementsISlayMobsMod.ModElement.Tag
public class ItemIslaymobsRemaster extends ElementsISlayMobsMod.ModElement {
	@GameRegistry.ObjectHolder("i_slay_mobs:islaymobs_remaster")
	public static final Item block = null;
	public ItemIslaymobsRemaster(ElementsISlayMobsMod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("i_slay_mobs:islaymobs_remaster", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("islaymobs_remaster", ElementsISlayMobsMod.sounds.get(new ResourceLocation("i_slay_mobs:remaster")));
			setUnlocalizedName("islaymobs_remaster");
			setRegistryName("islaymobs_remaster");
			setCreativeTab(CreativeTabs.MISC);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("Remastered");
		}
	}
}
