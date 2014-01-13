package com.mrgreaper.twisted.items;

import com.mrgreaper.twisted.ModInfo;
import com.mrgreaper.twisted.TwistedMod;

import net.minecraft.item.Item;

public class ItemOrphanTear extends Item{

	public ItemOrphanTear() {
		this.setCreativeTab(TwistedMod.tabTwisted);
		setMaxStackSize(64);
		setUnlocalizedName("orphanTear");
		setTextureName(ModInfo.modId+":orphan_tear");
	}

}
