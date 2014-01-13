package com.mrgreaper.twisted.items;

import com.mrgreaper.twisted.ModInfo;
import com.mrgreaper.twisted.TwistedMod;

import net.minecraft.item.Item;

public class ItemElectricBunny extends Item {
	//later this will extend what ever electric api i use (likely to be ue to be fair)
	public ItemElectricBunny() {
		this.setCreativeTab(TwistedMod.tabTwisted);
		setMaxStackSize(1);
		setUnlocalizedName("electricBunny");
		setTextureName(ModInfo.modId+":bunny_energized");
	}

}
