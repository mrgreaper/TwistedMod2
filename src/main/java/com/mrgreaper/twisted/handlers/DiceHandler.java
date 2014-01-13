package com.mrgreaper.twisted.handlers;

import java.util.concurrent.ThreadLocalRandom;

public class DiceHandler {
	
	/*
	Another throwback from my dnd character generator and although its ment to be a dice roller its incredably useful as i
	only have to throw it a number and amount of times and it will roll a d#whatevernumber that many times and add them...
	very useful if you want a number between say 1 - 20 you would roll a d20 once, youll never get a 0 or a 21 should
	come in very useful for a lot of my mods random features
	*/
    public static int roll;
	
	public static int diceRoll(int dice,int times) {
		dice++;
		roll=0;
		for(int i = 0; i < times; i++) { 
		int rand = ThreadLocalRandom.current().nextInt(1,dice);
		roll=roll+rand;
		}
		//System.out.println(rand);
		return roll;
	}

}
