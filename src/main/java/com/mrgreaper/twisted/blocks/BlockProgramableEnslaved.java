package com.mrgreaper.twisted.blocks;

import com.mrgreaper.twisted.ModInfo;
import com.mrgreaper.twisted.TileEntitys.TileProgramableEnslaved;
import com.mrgreaper.twisted.TwistedMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockProgramableEnslaved extends Block{

	protected BlockProgramableEnslaved() {
		super(Material.field_151576_e);
		this.func_149647_a(TwistedMod.tabTwisted);
        this.func_149663_c("ProgramableEnslaved");
        this.func_149658_d(ModInfo.modId+":slavedbunny_front");
	}
    //@Override
    public TileEntity func_149915_a(World world, int metadata){
        return new TileProgramableEnslaved();
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c)
    {
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
