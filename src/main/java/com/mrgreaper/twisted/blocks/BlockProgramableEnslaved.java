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

package com.mrgreaper.twisted.blocks;

import com.mrgreaper.twisted.ModInfo;
import com.mrgreaper.twisted.TileEntitys.TileProgramableEnslaved;
import com.mrgreaper.twisted.TwistedMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockProgramableEnslaved extends Block {

    protected BlockProgramableEnslaved() {
        super(Material.field_151576_e);
        this.func_149647_a(TwistedMod.tabTwisted);
        this.func_149663_c("ProgramableEnslaved");
        this.func_149658_d(ModInfo.modId + ":slavedbunny_front");
    }

    //@Override
    public TileEntity func_149915_a(World world, int metadata) {
        return new TileProgramableEnslaved();
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c) {
        player.openGui(TwistedMod.instance, 3, world, x, y, z);

        return true;
    }

/*
aparently this is how we get the data from the tile entity... it dont seem to work
proberly srg issue yet again!
TileProgramableEnslaved tile = (TileProgramableEnslaved) World.getBlockTileEntity(i, j, k);
if (tile != null)
{
String speech = Tile.Speech;
}
*/


}
