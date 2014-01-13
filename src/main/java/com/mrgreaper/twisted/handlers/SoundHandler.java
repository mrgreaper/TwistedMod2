package com.mrgreaper.twisted.handlers;

import net.minecraft.client.audio.SoundManager;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.client.event.sound.SoundLoadEvent;

public class SoundHandler {
	
	public static void onEntityPlay(String name,World world,Entity entityName,float volume ,float pitch){
		world.playSoundAtEntity(entityName,("twistedmod:" + name), (float)volume,(float) pitch);
	}
	
}
