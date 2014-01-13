package com.mrgreaper.twisted.handlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExternalFileHandler {
	
	//used in my dungeons and dragons background program to load lists from text files into arrays..not needed so far in my mod but hey be prepared and all that!
	//

public static ArrayList<String> tempArray = new ArrayList<String>();
	
	public static void arrayMake(String filename) throws FileNotFoundException{
		tempArray.clear();//clear the array so we no longer need to make new ones
		Scanner scanTable1 = new Scanner(new File("data/"+filename+".txt")); 
		while(scanTable1.hasNextLine()){ 
			String line = scanTable1.nextLine(); 
			tempArray.add(line);
			//System.out.println(line); //debug line
			//speechHandler.speechSynth(2, 1, 0, 60, line);
		}
		scanTable1.close();
		//return table1; //this return did not work as its not a proper return
	} 
}
