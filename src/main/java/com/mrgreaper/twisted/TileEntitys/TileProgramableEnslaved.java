package com.mrgreaper.twisted.TileEntitys;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileProgramableEnslaved extends TileEntity{
	private String pESpeech = "";
	

	@Override
	   public void func_145841_b(NBTTagCompound tagCompound)
	   {
	      super.func_145841_b(tagCompound); //writetonbt now readtonbt
	      tagCompound.setString("speech", pESpeech); //set the nbt tag "speech" to hold the data from pESpeech
	   }

	   @Override
	   public void func_145839_a(NBTTagCompound tagCompound) // read from nbt 
	   {
	      super.func_145839_a(tagCompound);
	      this.pESpeech = tagCompound.getString("speech");// take the value of "speech" out of the nbt and use it as the string
	   }


	}