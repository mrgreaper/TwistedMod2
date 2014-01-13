package com.mrgreaper.twisted.handlers;

import com.mrgreaper.twisted.TwistedMod;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by david on 12/01/14.
 */
public class EntityHandler {

    public static void init(){
        GameRegistry.registerTileEntity(com.mrgreaper.twisted.TileEntitys.TileProgramableEnslaved.class, "teProgrammableEnslaved");
    }
}
