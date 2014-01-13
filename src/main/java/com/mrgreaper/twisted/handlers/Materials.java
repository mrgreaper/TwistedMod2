package com.mrgreaper.twisted.handlers;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Materials {
	//place to store the materials
	public static ToolMaterial EnumBunnyFlesh = EnumHelper.addToolMaterial("BunnyFlesh", 3, 1100, 14.0F, 4, 26); //name, level it can mine at, number of uses, strength against blocks,damage against entities, enchantability
	//they said it couldnt be done, you cant have bunny flesh swords they said, your mad they said! Mad they called me...ME ..mad! i showed them! look bunnyflesh for swords....actualy i think they said it shouldnt be done...
	//public static ArmorMaterial EnumBunnyHide= EnumHelper.addArmorMaterial("bunnyHide", 5, new int[]{2, 5, 4, 1}, 10); //not used yet, making armour is not going to be easy
	//ah yes the hide of a bunny....need to make a model for armour, fantastic reason to learn armour coding though...even if it means using techne...shudder
}