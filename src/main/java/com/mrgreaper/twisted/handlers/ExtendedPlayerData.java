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

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

/**
 * Created by mrgreaper on 15/01/14. This header is only added to files created in IDEA
 * with the help of this guide http://www.minecraftforum.net/topic/1952901-eventhandler-and-iextendedentityproperties/
 */
public class ExtendedPlayerData implements IExtendedEntityProperties {
    //first we need the name of the extended property (we can have more then one property so it needs to be unique)
    public final static String EXT_TAG_NAME = "TwistedPlayer";


    //the guide i read said its a good idea to entity were extending
    private final EntityPlayer player;

    //now for the data were adding :
    private boolean hasPlayed, shouldPlay;

    public ExtendedPlayerData(EntityPlayer player) {
        this.player = player;
        hasPlayed = false; //both need to start false
        shouldPlay = false;
    }


    /**
     * Used to register these extended properties for the player during EntityConstructing event
     * This method is for convenience only; it will make your code look nicer
     */
    public static final void register(EntityPlayer player) {
        player.registerExtendedProperties(ExtendedPlayerData.EXT_TAG_NAME, new ExtendedPlayerData(player));
    }

    /**
     * Returns ExtendedPlayer properties for player
     * This method is for convenience only; it will make your code look nicer
     */
    public static final ExtendedPlayerData get(EntityPlayer player) {
        return (ExtendedPlayerData) player.getExtendedProperties(EXT_TAG_NAME);
    }


    @Override //ok so here we save the data
    public void saveNBTData(NBTTagCompound compound) {
        // We need to create a new tag compound that will save everything for our Extended Properties
        NBTTagCompound properties = new NBTTagCompound();

        properties.setBoolean("hasPlayed", this.hasPlayed);
        properties.setBoolean("shouldPlay", this.shouldPlay);

        /*
Now add our custom tag to the player's tag with a unique name (our property's name). This will allow you to save multiple
types of properties and distinguish between them. If you only have one type, it isn't as important, but it will still avoid
conflicts between your tag names and vanilla tag names. For instance, if you add some "Items" tag, that will conflict with
vanilla. Not good. So just use a unique tag name.
*/
        compound.setTag(EXT_TAG_NAME, properties);


    }

    @Override
    public void loadNBTData(NBTTagCompound compound) {
        // Here we fetch the unique tag compound we set for this class of Extended Properties
        NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_TAG_NAME);
// Get our data from the custom tag compound
        this.hasPlayed = properties.getBoolean("hasPlayed");
        this.shouldPlay = properties.getBoolean("shouldPlay");

        System.out.println("properties from tag read shouldplay : " + this.shouldPlay + " hasPlayed : " + this.hasPlayed);


    }

    @Override
    public void init(Entity entity, World world) {

    }
    //TODO finish this!
}
