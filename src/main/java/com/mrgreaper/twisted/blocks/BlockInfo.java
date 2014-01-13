package com.mrgreaper.twisted.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockInfo {
	
	

	public static Block BlockGeorgeSkull;
	public static Block BlockProgramableEnslaved;
	
	
	
	 public static void init() {
		 BlockGeorgeSkull = new BlockGeorgeSkull();
		 GameRegistry.registerBlock(BlockGeorgeSkull, "georgeS");
		 BlockProgramableEnslaved = new BlockProgramableEnslaved();
		 GameRegistry.registerBlock(BlockProgramableEnslaved, "programableEnslaved");
		 
		 
	 }
	
		

}
