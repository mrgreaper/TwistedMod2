package com.mrgreaper.twisted.entities;

import com.mojang.authlib.GameProfile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

/*
This was ment to be a fake player for the use of the chat bots
i have not really looked into it much theres a lot to do
and its not exactly easy to understhad
*/
public class TwsistedPlayer extends EntityPlayer{

	public TwsistedPlayer(World p_i45324_1_, GameProfile p_i45324_2_) {
		super(p_i45324_1_, p_i45324_2_);
		// TODO Auto-generated constructor stub
	}

	public void func_145747_a(IChatComponent var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canCommandSenderUseCommand(int var1, String var2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ChunkCoordinates getPlayerCoordinates() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}