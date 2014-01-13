package com.mrgreaper.twisted.items;

import net.minecraft.item.Item;

import com.mrgreaper.twisted.ModInfo;
import com.mrgreaper.twisted.TwistedMod;

public class ItemDeathOrb extends Item{

	public ItemDeathOrb() {
		this.setCreativeTab(TwistedMod.tabTwisted);
		setMaxStackSize(1);
		setUnlocalizedName("deathOrb");
		setTextureName(ModInfo.modId+":orb1");
	}
	
	//TODO need to make this call into the world its OBJ file...oh god thats gonna be fun, need to telearn entities!

}
