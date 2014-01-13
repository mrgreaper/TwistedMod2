package com.mrgreaper.twisted;

public class ConfigInfo {
	
	//by rights this should live with its buddy ConfigHandler, but the other handlers moaned "oh its not a real handler" "ewww an info file, in our neighbourhood!"
	//well you know how mean handlers can be, config info was a little annoyed and said "hay you let Materials live thier", they went quiet at this...after all Materials
	//contains bunny flesh! who would want to risk upsetting such a thing, so poor ConfigInfo was exiled an sort solace in the root folder along with ModInfo where its data once lived
	//all be it briefly.
    
	public static boolean EASYMODE;
    public static final String EASYMODE_KEY = "Easymode (nether star from smelting living bunny)? ";
    public static boolean LSMELT;
    public static final String LSMELT_KEY = "Rottern flesh smelt to leather? ";
    public static boolean SCRAFT;
    public static final String SCRAFT_KEY = "Rottern flesh craftable into slimeballs and back again? ";
    public static boolean ATEX;
    public static final String ATEX_KEY = "Animated textures (where possible) ? ";
    public static boolean SPONGECRAFT;
    public static final String SPONGECRAFT_KEY ="Allow craftable sponge? ";
    public static boolean MOSSYCRAFT;
    public static final String MOSSYCRAFT_KEY ="Allow craftable mossy cobblestone? ";
    public static boolean GRASSCRAFT;
    public static final String GRASSCRAFT_KEY ="Allow craftable grass? ";
	
	
	//not used yet (in exile untill the functions that use them are ready)
	 public static int BUNNYSTATICCHANCE;
     public static final String BUNNYSTATICCHANCE_KEY = "Bunny static chance 1: ";
     public static final int BUNNYSTATICCHANCE_DEFAULT = 10;
     public static int BUNNYSTATICCHARGE;
     public static final String BUNNYSTATICCHARGE_KEY = "Bunny static charge per shake : ";
     public static final int BUNNYSTATICCHARGE_DEFAULT = 10;
     public static boolean DEBUG;
     public static final String DEBUG_KEY = "Debug mode? ";

     public static boolean APPENG;
     public static final String APPENG_KEY = "Applied energetics helper enabled ?";
     public static boolean appEngLoaded;
     public static boolean ELECBUNNYCRYS;
     public static final String ELECBUNNYCRYS_KEY = "Enable electric bunny crys ?";
     public static int MAXENSLAVEDBUNNYRANGE;
     public static final String MAXENSLAVEDBUNNYRANGE_KEY = "Max range for enslaved bunny speach : ";
     public static final int MAXENSLAVEDBUNNYRANGE_DEFAULT = 50;


	
}
