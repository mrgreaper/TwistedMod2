package com.mrgreaper.twisted.items;

import com.mrgreaper.twisted.TwistedMod;
import com.mrgreaper.twisted.handlers.Materials;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class Items {
	
	public static Item ItemDeadBunny;
	public static Item ItemLivingBunny;
	public static Item ItemBalloonRed;
	public static Item ItemOrphanTear;
	public static Item ItemDeathOrb;
	public static Item ItemOrphanLeg;
	public static Item ItemBunnySword;
	public static Item ItemOrphanLegBoneHilt; //longest item internal name EVER! woooo!
	public static Item ItemElectricBunny;
	
	public static void init(){
		ItemDeadBunny = new ItemDeadBunny();
		GameRegistry.registerItem(ItemDeadBunny, "bunnyD" );
		ItemLivingBunny = new ItemLivingBunny();
		GameRegistry.registerItem(ItemLivingBunny, "bunnyL" );
		ItemBalloonRed = new ItemBalloonRed();
		GameRegistry.registerItem(ItemBalloonRed, "balloonR" );
		ItemOrphanTear = new ItemOrphanTear();
		GameRegistry.registerItem(ItemOrphanTear, "orphanTear" );
		ItemDeathOrb = new ItemDeathOrb();
		GameRegistry.registerItem(ItemDeathOrb, "deathOrb" );
		ItemOrphanLeg= new ItemOrphanLeg();
		GameRegistry.registerItem(ItemOrphanLeg, "orphanLeg" );
		ItemBunnySword= new ItemBunnySword();
		GameRegistry.registerItem(ItemBunnySword, "bunnySword" );
		ItemOrphanLegBoneHilt = new ItemOrphanLegBoneHilt();
		GameRegistry.registerItem(ItemOrphanLegBoneHilt, "orphanLegBoneHilt");
		ItemElectricBunny = new ItemElectricBunny();
		GameRegistry.registerItem(ItemElectricBunny, "electricBunny");

	}



	public static void addNames() {
		//now all delt with by the lang file, i could delete this method, but we have been through a lot him and me, to casualy delete, sentence him to silicon hell seems mean.
	}

}
