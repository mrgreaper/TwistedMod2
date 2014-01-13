package com.mrgreaper.twisted;

import com.mrgreaper.twisted.Guis.GuiHandler;
import com.mrgreaper.twisted.handlers.*;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

import com.mrgreaper.twisted.items.ItemDeadBunny;
import com.mrgreaper.twisted.items.Items;
import com.mrgreaper.twisted.blocks.BlockInfo;
import com.mrgreaper.twisted.proxies.CommonProxy;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = ModInfo.modId,name="MrGReapers Twisted Mod", version = ModInfo.modVersion)



public class TwistedMod{
	
	
	
    @Instance(ModInfo.modId)
    public static TwistedMod instance;
    
    @SidedProxy(clientSide="com.mrgreaper.twisted.proxies.ClientProxy", serverSide="com.mrgreaper.twisted.proxies.CommonProxy")
    public static CommonProxy proxy;
	
	public static CreativeTabs tabTwisted = new CreativeTabs("tabTwisted"){
		@Override
		   public ItemStack func_151244_d() 
        {
                return new ItemStack(Items.ItemDeadBunny);
        }

		@Override
		public Item getTabIconItem() {
			// this is needed but doesnt actually do anything! the item image above works fine
			return null;
		}

	};
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		Items.init();
		BlockInfo.init();
		FMLCommonHandler.instance().bus().register(new EventHookHandler());
		MinecraftForge.EVENT_BUS.register(new EventHookHandler());
		try {
			BotHandler.init();
			System.out.println("Bot Handler is a loaded");
		} catch (Exception e) {
			System.out.println("Bot Handler failed! arghhhhhhhhhhhh its the end of the world as we know it!");
			e.printStackTrace();
			
		}
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		//left it in incase i suddenly thought...why isnt that in..its cos its wrong ok future me? its not needed it changed! MinecraftForge.EVENT_BUS.register(new EventHookHandler());
		//proxy.initSounds();  sounds at the moment are not usable in forge how they used to be 
	}
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		
        //System.out.println("DIRT BLOCK >> "+Blocks.dirt.func_149739_a()); //left for reference
        try { //lets test the bot
			//System.out.println(BotHandler.maxBot("how are you robot?"));
			//System.out.println(BotHandler.fredBot("where are you?"));
			//System.out.println(BotHandler.georgeBot("do you like minecraft?"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       //  speechThreaded.speechSynth(0, 2, 4, 1, "there be bunnys ma boy!"); //lets test the speech synth
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event){
    	proxy.registerRenderers();
    	Items.addNames();
    	Recipes.registerRecipes();
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabTwisted", "en_US", "Mr G Reapers Twisted Tab");
    	AchievmentHandler.achieveInit();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
            //stuff
    }
    
    
}
