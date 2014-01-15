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

package com.mrgreaper.twisted.items;

import com.mrgreaper.twisted.ConfigInfo;
import com.mrgreaper.twisted.ModInfo;
import com.mrgreaper.twisted.TwistedMod;

import com.mrgreaper.twisted.handlers.DiceHandler;
import com.mrgreaper.twisted.handlers.SoundHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class ItemLivingBunny extends Item{

		public ItemLivingBunny() {
			this.setCreativeTab(TwistedMod.tabTwisted);
			setMaxStackSize(1);
			setUnlocalizedName("bunnyLiving");
			if (ConfigInfo.ATEX){setTextureName(ModInfo.modId+":bunny_living2");}else{setTextureName(ModInfo.modId+":bunny_living");}
	}

    @Override
    public void onCreated(ItemStack itemStack, World world, EntityPlayer player) {
        int playerX = (int) player.prevPosX;
        int playerY = (int) player.prevPosY;
        int playerZ = (int) player.prevPosZ;
        if (!player.worldObj.isRemote) {
            int rand = DiceHandler.diceRoll(5, 1);
            switch (rand) {
                case 1:
                    SoundHandler.onEntityPlay("monster", world, player, 1, 1);
                    break;
                case 2:
                    SoundHandler.onEntityPlay("bunnyResistance", world, player, 1, 1);
                    break;
                case 3:
                    SoundHandler.onEntityPlay("bunnyRelease", world, player, 1, 1);
                    break;
                case 4:
                    SoundHandler.onEntityPlay("bunnyExp", world, player, 1, 1);
                    break;
                case 5:
                    SoundHandler.onEntityPlay("littleBunny", world, player, 1, 1);
                    break;
            }


        } else {
            player.func_145747_a(new ChatComponentText("Don't let the vile evil creature go free!"));
        }


    }


}
