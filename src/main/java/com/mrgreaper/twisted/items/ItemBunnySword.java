package com.mrgreaper.twisted.items;

import com.mrgreaper.twisted.ConfigInfo;
import com.mrgreaper.twisted.ModInfo;
import com.mrgreaper.twisted.TwistedMod;
import com.mrgreaper.twisted.handlers.Materials;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemBunnySword extends ItemSword {

	public ItemBunnySword() {
		super(Materials.EnumBunnyFlesh);
		this.setCreativeTab(TwistedMod.tabTwisted);
		setMaxStackSize(1);
		setUnlocalizedName("bunnySword");
		if (ConfigInfo.ATEX){setTextureName(ModInfo.modId+":bunny_Sword2");}else{setTextureName(ModInfo.modId+":bunny_Sword");}
	}

}
