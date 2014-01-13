package com.mrgreaper.twisted.items;

import com.mrgreaper.twisted.ConfigInfo;
import com.mrgreaper.twisted.ModInfo;
import com.mrgreaper.twisted.TwistedMod;

import net.minecraft.item.Item;

public class ItemLivingBunny extends Item{

		public ItemLivingBunny() {
			this.setCreativeTab(TwistedMod.tabTwisted);
			setMaxStackSize(1);
			setUnlocalizedName("bunnyLiving");
			if (ConfigInfo.ATEX){setTextureName(ModInfo.modId+":bunny_living2");}else{setTextureName(ModInfo.modId+":bunny_living");}
	}

}
