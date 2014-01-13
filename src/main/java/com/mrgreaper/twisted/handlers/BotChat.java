package com.mrgreaper.twisted.handlers;

import java.util.Arrays;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;

public class BotChat implements Runnable{


	
	public static EntityPlayerMP player; 
	public static String message;
	public static String bot;
	
	public static void incoming(EntityPlayerMP player2,String message2,String bot2) {
		player= player2;
		message=message2;
		bot=bot2;
		Thread t2 = new Thread(new BotChat());
		t2.start();
		
	}
	
	
	public void run() {
		
		String [] messageMod = message.split(" ",2);
		System.out.println("adapted message is : "+messageMod[1]);
		String answer = "";
		try {
			if (bot.equals("max")){answer = BotHandler.maxBot(messageMod[1]);speechThreaded.speechSynth(0, 5, 4, 2, answer);}
			if (bot.equals("george")){answer = BotHandler.georgeBot(messageMod[1]);speechThreaded.speechSynth(0, 11, 11, 10, answer);}
			if (bot.equals("fred")){answer = BotHandler.fredBot(messageMod[1]);speechThreaded.speechSynth(0, 1, 10, 9, answer);}
			player.func_145747_a(new ChatComponentText("<Pm to "+bot+"> "+messageMod[1]));
			player.func_145747_a(new ChatComponentText("<Pm from "+bot+"> "+answer));
			//speechThreaded.speechSynth(0, 1, 4, 2, answer);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
	}

}
