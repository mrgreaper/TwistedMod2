/*
 * Copyright (c) 2014. The Code is under The MIT License (MIT)
 *
 * Copyright (c) [2014] [David Eastwick]
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * side note, i request you do not copy whole classes from my mod etc thats just not cool :)
 *
 * Textures and binaries are licensed under Creative Commons 3 *: http://creativecommons.org/licenses/by/3.0/ Any alternate licenses are noted where appropriate *where applicable
 *
 * freetts is used within its license as stated here : http://freetts.sourceforge.net/license.terms
 */

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

    public static void achieveInit() {
        Achievement bunnyBoiler = new Achievement("achievement.bunnyBoiler", "bunnyBoiler", 12, 16, new ItemStack(Items.ItemDeadBunny), null);
        Achievement peterWard = new Achievement("achievement.peterWard", "peterWard", 10, 16, net.minecraft.init.Items.cookie, null);
        Achievement moleKing = new Achievement("achievement.moleKing", "moleKing", 16, 16, net.minecraft.init.Items.snowball, null);
        /*
        peter Ward is a mate of mine who when ever i mention modded minecraft and would tell him about the sprawling
		bases i built on the moon etc, will state "i built a house" poor chap has the console version...
		he is somewhat partial achievements though so i made him one.../me puts on shades...literally!
		my mate moleking....LOVES 16x16 oh and clowns ....this may be my last entry O.O
		*/
        peterWard.registerStat();
        bunnyBoiler.registerStat();
        moleKing.registerStat();
        page = new AchievementPage("TwistedMod", bunnyBoiler, peterWard, moleKing);
        AchievementPage.registerAchievementPage(page);
    }

}
