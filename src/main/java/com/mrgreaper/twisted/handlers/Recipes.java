package com.mrgreaper.twisted.handlers;

import com.mrgreaper.twisted.ConfigInfo;
import com.mrgreaper.twisted.items.Items;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;


public class Recipes {
	
	//want to know how to cook turkey? well look in google! want to know how to make something in my mod? yay right place!
	//yes i know a non standard format...eeek it could all be done on one line..eeek...dont care i like this format, its close to wysiwyg :P
	
	
	public static void registerRecipes() {
		
		GameRegistry.addRecipe(new ItemStack(Items.ItemDeadBunny),//output item
                new Object[] {         "C C",//crafting grid
                                       " D ",
                                       "C C",
                                                
                                          'D', Blocks.dirt, //items used in the above list
                                          'C', net.minecraft.init.Items.carrot
                                         });        
	
	GameRegistry.addRecipe(new ItemStack(Items.ItemBunnySword),//output item
            new Object[] {         " C ",//crafting grid
                                   " B ",
                                   " S ",
                                            
                                      'B', Items.ItemLivingBunny, //take one living bunny
                                      'S', Items.ItemOrphanLegBoneHilt, //one orphan bone hilt
                                      'C', Blocks.cobblestone //ram the the bunny on with a bit of cobblestone
                                      //its wierd people say im evil..... wierd that
                                      //dont worry you will hear the click when the orphan hilt enters fig b of the bunny and clips into place
                                      //or a scream....proberly a scream....you heartless person you! 
                                      //that poor cobblestone
                                      
                                     });        
	GameRegistry.addRecipe(new ItemStack(Items.ItemDeathOrb),//output item
            new Object[] {         " F ",//crafting grid
                                   "FIF",
                                   " F ",
                                            
                                      'F', net.minecraft.init.Items.flint,
                                      'I', net.minecraft.init.Items.iron_ingot 
                                     }); 

	
	
	//shapeless mod recipies
	GameRegistry.addShapelessRecipe(new ItemStack (Items.ItemOrphanLegBoneHilt), Items.ItemOrphanLeg);

	
	
	//smelting recipies
	
	if (ConfigInfo.EASYMODE) {GameRegistry.addSmelting(Items.ItemLivingBunny ,new ItemStack(net.minecraft.init.Items.nether_star) , 0.1f);}else{GameRegistry.addSmelting(Items.ItemLivingBunny ,new ItemStack(net.minecraft.init.Items.skull,1,1) , 0.1f);} 
	GameRegistry.addSmelting(Items.ItemOrphanLeg, new ItemStack(Items.ItemOrphanLegBoneHilt), 0.2f);
	
	
	//mod helpers
	
	//vanila
	if (ConfigInfo.LSMELT) {GameRegistry.addSmelting(net.minecraft.init.Items.rotten_flesh, new ItemStack(net.minecraft.init.Items.leather), 0.1f);}
	if (ConfigInfo.SCRAFT) {GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.rotten_flesh), net.minecraft.init.Items.slime_ball);}
	if (ConfigInfo.SCRAFT) {GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.slime_ball), net.minecraft.init.Items.rotten_flesh);}
	if (ConfigInfo.GRASSCRAFT){GameRegistry.addShapelessRecipe(new ItemStack(Blocks.grass), Blocks.vine,Blocks.dirt);}
	if (ConfigInfo.SPONGECRAFT){GameRegistry.addRecipe(new ItemStack(Blocks.sponge),//output item
            new Object[] {         " W ",//crafting grid
                                   "WBW",
                                   " W ",
                                            
                                      'W', Blocks.wool,
                                      'B', net.minecraft.init.Items.water_bucket
                                     });} 
	
	if (ConfigInfo.MOSSYCRAFT){GameRegistry.addRecipe(new ItemStack(Blocks.mossy_cobblestone),//output item
            new Object[] {         " V ",//crafting grid
                                   "VCV",
                                   " V ",
                                            
                                      'V', Blocks.vine,
                                      'C', Blocks.cobblestone
                                     });} 
}



}