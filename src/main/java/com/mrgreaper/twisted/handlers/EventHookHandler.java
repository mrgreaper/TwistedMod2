package com.mrgreaper.twisted.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.ServerChatEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemPickupEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;

import com.mrgreaper.twisted.TwistedMod;
import com.mrgreaper.twisted.entities.TwsistedPlayer;


public class EventHookHandler {
	
	public static void init(){
		
	}
	
	
	
	@SubscribeEvent
	public void TwistedSmeltEvent(ItemSmeltedEvent event){
		ItemStack crafting= event.smelting;
		System.out.println(crafting);
		System.out.println("detected smelting");
		//event.player.addExperienceLevel(1000);
		
	}
	
	@SubscribeEvent
	public void TwistedPickupEvent(ItemPickupEvent event){
		//event.player.addExperience(10000000);
	}
	
	@SubscribeEvent
	public void TwistedChatEvent(ServerChatEvent event){
		String chatMessage =event.message;
		//System.out.println("message reads :"+chatMessage);
		if (chatMessage.startsWith("max")||chatMessage.startsWith("fred") ||chatMessage.startsWith("george")){
			String [] botname = event.message.split(" ",2);
			String bot = botname[0];
			//SoundHandler.onEntityPlay("bunnyBegB", event.player.worldObj, event.player, 1, 1);
			event.setCanceled(true);
			BotChat.incoming(event.player, chatMessage, bot);
		}
		if (chatMessage.startsWith("test")&&chatMessage.endsWith("sound")){SoundHandler.onEntityPlay("bunnyRelease", event.player.worldObj, event.player, 1, 1);}	
	}
	
	

}


