package com.mrgreaper.twisted.handlers;

import java.io.File;

import com.mrgreaper.twisted.ConfigInfo;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);
		
		config.load();
		
		
		//here is where we let users ..well ok mainly server admins control parts of the mod
		
		ConfigInfo.EASYMODE=config.get("Bunny Toggles", ConfigInfo.EASYMODE_KEY, true).getBoolean(true);
		ConfigInfo.LSMELT = config.get("Vanila Tweaks", ConfigInfo.LSMELT_KEY, true).getBoolean(true);
		ConfigInfo.SCRAFT = config.get("Vanila Tweaks", ConfigInfo.SCRAFT_KEY, true).getBoolean(true);
		ConfigInfo.ATEX = config.get("Bunny Toggles", ConfigInfo.ATEX_KEY, true).getBoolean(true);
		ConfigInfo.SPONGECRAFT = config.get("Vanila Tweaks", ConfigInfo.SPONGECRAFT_KEY, true).getBoolean(true);
		ConfigInfo.MOSSYCRAFT = config.get("Vanila Tweaks", ConfigInfo.MOSSYCRAFT_KEY, true).getBoolean(true);
		ConfigInfo.GRASSCRAFT = config.get("Vanila Tweaks", ConfigInfo.GRASSCRAFT_KEY, true).getBoolean(true);

		config.save();
		
	}

}
