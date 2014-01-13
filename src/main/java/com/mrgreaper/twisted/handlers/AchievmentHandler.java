package com.mrgreaper.twisted.handlers;

import com.mrgreaper.twisted.TwistedMod;
import com.mrgreaper.twisted.items.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

/*
achievements hmmm should i add them? it would instantly make my mod
130% more popular amongst 900% off achievement obsessed people yay
though im down 9/3rds with those that maths know.
*/
public class AchievmentHandler {
	
	public static AchievementPage page;
	
	public static void achieveInit(){
		Achievement bunnyBoiler = new Achievement("achievement.bunnyBoiler", "bunnyBoiler", 12, 16,new ItemStack (Items.ItemDeadBunny), null);
		Achievement peterWard = new Achievement("achievement.peterWard", "peterWard", 10, 16,net.minecraft.init.Items.cookie, null);
        Achievement moleKing = new Achievement("achievement.moleKing","moleKing",16,16,net.minecraft.init.Items.snowball, null);
		/*
		peter Ward is a mate of mine who when ever i mention modded minecraft and would tell him about the sprawling
		bases i built on the moon etc, will state "i built a house" poor chap has the console version...
		he is somewhat partial achievements though so i made him one.../me puts on shades...literally!
		my mate moleking....LOVES 16x16 oh and clowns ....this may be my last entry O.O
		*/
        peterWard.registerStat();
		bunnyBoiler.registerStat();
        moleKing.registerStat();
		page = new AchievementPage("TwistedMod", bunnyBoiler,peterWard,moleKing);
		AchievementPage.registerAchievementPage(page);
	}

}
