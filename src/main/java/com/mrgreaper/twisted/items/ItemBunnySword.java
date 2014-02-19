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
import com.mrgreaper.twisted.handlers.Materials;
import com.mrgreaper.twisted.handlers.SoundHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemBunnySword extends ItemSword {

    public ItemBunnySword() {
        super(Materials.EnumBunnyFlesh);
        this.setCreativeTab(TwistedMod.tabTwisted);
        setMaxStackSize(1);
        setUnlocalizedName("bunnySword");
        if (ConfigInfo.ATEX) {
            setTextureName(ModInfo.modId + ":bunny_Sword2");
        } else {
            setTextureName(ModInfo.modId + ":bunny_Sword");
        }
    }

    @Override
    public void onCreated(ItemStack itemStack, World world, EntityPlayer player) {
        int playerX = (int) player.prevPosX;
        int playerY = (int) player.prevPosY;
        int playerZ = (int) player.prevPosZ;
        if (!player.worldObj.isRemote) {
            SoundHandler.onEntityPlay("bunnySwordInsert", world, player, 1, 1);
        }
    }

    @Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
        par1ItemStack.damageItem(1, par3EntityLivingBase);
        if (!par2EntityLivingBase.worldObj.isRemote) {
            SoundHandler.onEntityPlay("bunnyOww", par2EntityLivingBase.worldObj, par2EntityLivingBase, 1, DiceHandler.diceRoll(10, 1));
        }
        return true;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        if (!par3EntityPlayer.worldObj.isRemote) {
            SoundHandler.onEntityPlay("growl", par2World, par3EntityPlayer, 1, 1);
        }
        return par1ItemStack;
    }

}
