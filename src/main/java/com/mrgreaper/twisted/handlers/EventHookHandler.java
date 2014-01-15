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

import com.mrgreaper.twisted.ConfigInfo;
import com.mrgreaper.twisted.items.Items;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemPickupEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ServerChatEvent;


public class EventHookHandler {
    private boolean sound = false;

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

    @SubscribeEvent
    public void TwistedTickEvent(TickEvent.PlayerTickEvent event) { //TODO fix this section!
        if (event.player.getCurrentEquippedItem() != null) {//ok so lets make sure the player has something in thier little gruby handsies
            ItemStack itemstack = event.player.getCurrentEquippedItem(); //lets make itemstack = it
            System.out.println(itemstack);
            if (itemstack.getItem() == Items.ItemElectricBunny && ConfigInfo.ELECBUNNYCRYS && !sound) { //if it IS itemElectricBunny and elecbunnycrys are true and sound is false(it our toggler) then
                int random = DiceHandler.diceRoll(5, 1);//get a number between 1 and 5
                switch (random) { //use that number
                    case 1:
                        SoundHandler.onEntityPlay("bunnyBegA", event.player.worldObj, event.player, 1, 1);
                        System.out.println("sound is now" + sound);
                        break;
                    case 2:
                        SoundHandler.onEntityPlay("bunnyBegB", event.player.worldObj, event.player, 1, 1);
                        System.out.println("sound is now" + sound);
                        break;
                    case 3:
                        SoundHandler.onEntityPlay("bunnyBegC", event.player.worldObj, event.player, 1, 1);
                        System.out.println("sound is now" + sound);
                        break;
                    case 4:
                        SoundHandler.onEntityPlay("bunnyBegD", event.player.worldObj, event.player, 1, 1);
                        System.out.println("sound is now" + sound);
                        break;
                    case 5:
                        SoundHandler.onEntityPlay("bunnyBegE", event.player.worldObj, event.player, 1, 1);
                        System.out.println("sound is now" + sound);
                        break;
                }
                sound = true; //set sound to true so we know its been played and we dont get it trying to repeat the sound
                System.out.println("sound is now" + sound);
            }
            if (itemstack.getItem() != Items.ItemElectricBunny) {//if the item isnt an electric bunny lets
                sound = false; //set this to false again so the system knows it can play it again when it is an electric bunny
                System.out.println("sound is now" + sound);
            }
        }


    }


}


