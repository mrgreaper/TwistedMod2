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

    public static void init() {

    }


    @SubscribeEvent
    public void TwistedSmeltEvent(ItemSmeltedEvent event) {
        ItemStack crafting = event.smelting;
        System.out.println(crafting);
        System.out.println("detected smelting");
        //event.player.addExperienceLevel(1000);

    }

    @SubscribeEvent
    public void TwistedPickupEvent(ItemPickupEvent event) {
        //event.player.addExperience(10000000);
    }

    @SubscribeEvent
    public void TwistedChatEvent(ServerChatEvent event) {
        String chatMessage = event.message;
        //System.out.println("message reads :"+chatMessage);
        if (chatMessage.startsWith("max") || chatMessage.startsWith("fred") || chatMessage.startsWith("george")) {
            String[] botname = event.message.split(" ", 2);
            String bot = botname[0];
            //SoundHandler.onEntityPlay("bunnyBegB", event.player.worldObj, event.player, 1, 1);
            event.setCanceled(true);
            BotChat.incoming(event.player, chatMessage, bot);
        }
        if (chatMessage.startsWith("test") && chatMessage.endsWith("sound")) {
            SoundHandler.onEntityPlay("bunnyRelease", event.player.worldObj, event.player, 1, 1);
        }
    }


}


