package com.mrgreaper.twisted.items;

import com.mrgreaper.twisted.ConfigInfo;
import com.mrgreaper.twisted.ModInfo;
import com.mrgreaper.twisted.TwistedMod;

import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemDeadBunny extends Item {
	public ItemDeadBunny() {
		this.setCreativeTab(TwistedMod.tabTwisted);
		setMaxStackSize(1);
		setUnlocalizedName("bunnyDead");
		if (ConfigInfo.ATEX){setTextureName(ModInfo.modId+":bunny_dead2");}else{setTextureName(ModInfo.modId+":bunny_dead");}  
	}
//    @Override
//	public void registerIcons(IIconRegister register){
//	itemIcon = register.registerIcon(ModInfo.modId+":bunny_dead");
//	}
	
	

}
