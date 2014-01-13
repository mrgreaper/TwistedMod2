package com.mrgreaper.twisted.items;

import com.mrgreaper.twisted.ModInfo;
import com.mrgreaper.twisted.TwistedMod;

import net.minecraft.item.Item;

public class ItemBalloonRed extends Item{

	public ItemBalloonRed() {
		this.setCreativeTab(TwistedMod.tabTwisted);
		setMaxStackSize(1);
		setUnlocalizedName("balloonRed");
		setTextureName(ModInfo.modId+":balloon");
	}

}
