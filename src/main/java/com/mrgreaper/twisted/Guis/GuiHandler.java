package com.mrgreaper.twisted.Guis;

import com.mrgreaper.twisted.TileEntitys.TileProgramableEnslaved;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by david on 12/01/14.
 */
public class GuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID){
            case 0:
                TileEntity tileEntity = world.func_147438_o(x,y,z);
                if (tileEntity instanceof TileProgramableEnslaved){
                    return null; //later return new ContainerTiny(player.inventory, (TileEntityTiny) tileEntity); (from tutorial)
        }else{
                    System.out.println ("i could not find the tile entity " + tileEntity);
                }
                break;

        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        switch (ID){
            case 0:
                TileEntity tileEntity = world.func_147438_o(x,y,z);
                if (tileEntity instanceof TileProgramableEnslaved){
                    return null; //later return new GuiTiny(player.inventory, (TileEntityTiny) tileEntity);
                }else {
                    System.out.println("i could not find the tile entity " + tileEntity);
                }
                break;

        }

        return null;
    }
}
