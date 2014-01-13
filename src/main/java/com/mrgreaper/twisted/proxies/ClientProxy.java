package com.mrgreaper.twisted.proxies;


import cpw.mods.fml.common.Mod.Instance;
import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;



public class ClientProxy extends CommonProxy{
	@Override
    public void registerRenderers() {
            // entity rendering etc will be here
    }
	
/*	public void initSounds() {
		new SoundHandler();
	}*/
	
	public void chatHandler(String msg){
		
	}
	
	 /*public void chatHandler(String m)
	  {
	    if ((Minecraft.getMinecraft().theWorld != null) && (Minecraft.getMinecraft().theWorld.isRemote) && (Minecraft.getMinecraft().thePlayer != null) && (m != null)) {
	      Minecraft.func_147105_a(m);;//                  func_71035_c(p + m);
	    }
	  }*/

}
