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

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;

public class BotChat implements Runnable {


    public static EntityPlayerMP player;
    public static String message;
    public static String bot;

    public static void incoming(EntityPlayerMP player2, String message2, String bot2) {
        player = player2;
        message = message2;
        bot = bot2;
        Thread t2 = new Thread(new BotChat());
        t2.start();
    }


    public void run() {

        String[] messageMod = message.split(" ", 2);
        System.out.println("adapted message is : " + messageMod[1]);
        String answer = "";
        try {
            if (bot.equals("max")) {
                answer = BotHandler.maxBot(messageMod[1]);
                speechThreaded.speechSynth(0, 5, 4, 2, answer);
            }
            if (bot.equals("george")) {
                answer = BotHandler.georgeBot(messageMod[1]);
                speechThreaded.speechSynth(0, 11, 11, 10, answer);
            }
            if (bot.equals("fred")) {
                answer = BotHandler.fredBot(messageMod[1]);
                speechThreaded.speechSynth(1, 0, 60, 10, answer);
            }
            player.addChatMessage(new ChatComponentText("<Pm to " + bot + "> " + messageMod[1]));
            player.addChatMessage(new ChatComponentText("<Pm from " + bot + "> " + answer));
            //speechThreaded.speechSynth(0, 1, 4, 2, answer);
        } catch (Exception e) {
            e.printStackTrace();
            player.addChatMessage(new ChatComponentText("<Pm from chat handler> "+ bot+" seems to be inaccessable at the moment, perhaps he is sleeping?"));
            player.addChatMessage(new ChatComponentText("<Pm from chat handler> I threw the error into the console log for you though"));
        }
    }

}
