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

package com.mrgreaper.twisted.botSection;

import com.mrgreaper.twisted.ConfigInfo;
import com.mrgreaper.twisted.handlers.speechThreaded;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;

/**
 * Created by mrgreaper on 16/01/14. This header is only added to files created in IDEA
 */
public class botPublicChat implements Runnable {
    public static EntityPlayerMP player;
    public static String message;
    public static String bot;


    public static void incoming(String message2, String bot2) {
        message = message2;
        bot = bot2;
        Thread t3 = new Thread(new botPublicChat());
        t3.start();
    }


    @Override
    public void run() {

        String answer = "";
        if (bot.equals("fred")) {
            try {
                answer = BotHandler.fredBot(message);
            } catch (Exception e) {
                e.printStackTrace();
                MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("<" + bot + "> Im sorry but i appear to be offline"));
            }
        }
        if (bot.equals("max")) {
            try {
                answer = BotHandler.maxBot(message);
            } catch (Exception e) {
                e.printStackTrace();
                MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("<" + bot + "> Im sorry but i appear to be offline"));
            }
        }
        if (bot.equals("george")) {
            try {
                answer = BotHandler.georgeBot(message);
            } catch (Exception e) {
                e.printStackTrace();
                MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("<" + bot + "> Im sorry but i appear to be offline"));
            }
        }
        MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText("<" + bot + "> " + answer));
        if (ConfigInfo.PUBLICTTSBOTS) {
            speechThreaded.speechSynth(0, 0, 45, 15, answer);
        }
        Thread.currentThread().interrupt();
        return;
    }
}
