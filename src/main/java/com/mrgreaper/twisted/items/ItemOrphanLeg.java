package com.mrgreaper.twisted.items;

import net.minecraft.item.ItemFood;

import com.mrgreaper.twisted.ModInfo;
import com.mrgreaper.twisted.TwistedMod;

public class ItemOrphanLeg extends ItemFood{

	public ItemOrphanLeg() {
		super(10,true);
		this.setCreativeTab(TwistedMod.tabTwisted);
		setMaxStackSize(1);
		setUnlocalizedName("orphanLeg");
		setTextureName(ModInfo.modId+":orphan_leg");
	}

}
