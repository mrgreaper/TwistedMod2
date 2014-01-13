package com.mrgreaper.twisted.items;

import net.minecraft.item.Item;

import com.mrgreaper.twisted.ModInfo;
import com.mrgreaper.twisted.TwistedMod;

//hmmm this should be a couldron recipie but i have no idea how to make them...or if thier even possible with out having a custom couldron

public class ItemOrphanLegBoneHilt extends Item {
	public ItemOrphanLegBoneHilt() {
		this.setCreativeTab(TwistedMod.tabTwisted);
		setMaxStackSize(1);
		setUnlocalizedName("orphanLegBoneHilt");
		setTextureName(ModInfo.modId+":orphan_legBoneHilt");		
	}


}
