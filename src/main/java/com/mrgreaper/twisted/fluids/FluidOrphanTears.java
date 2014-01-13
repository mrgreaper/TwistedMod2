package com.mrgreaper.twisted.fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidOrphanTears extends Fluid {

	public FluidOrphanTears() {
		super("OrphanRearsFluid");
		setDensity(10);//set how thick the fluid is this will effect movement speed inside it
		setLuminosity(1); //lets make orphan tears give off a faint light, they are raw power after all
		setViscosity(1000);// how watery is this fluid? well for now default :)
		//FluidRegistry.registerFluid(this); //hmmm cant register it yet
	}

}
