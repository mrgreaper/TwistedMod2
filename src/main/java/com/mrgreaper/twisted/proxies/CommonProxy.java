package com.mrgreaper.twisted.proxies;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;

public class CommonProxy {
	
    public void registerRenderers() {
        // Nothing here as the server doesn't render graphics or entities!
    }
    public void chatHandler(String msg) {
    	//should be "player.addChatMessage(msg);" but seems to have changed
    	MinecraftServer.getServer().func_145747_a(new ChatComponentText(msg));
    	}
	public void initSounds() {
		// TODO Auto-generated method stub
		
	}

}
