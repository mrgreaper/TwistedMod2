package com.mrgreaper.twisted.handlers;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

//this is one of the most complicated bits, we have to put the speech into its own thread or we hang the program, this means timing will be important for cc users :( 
//it also means if two cc`s start a sentence at the exact same nano second we will get only one of them...odds are slim that will be an issue but untill i can test in a
//playable enviroment i cant really see if its an issue issue or ignorable and at this point cc doesnt even have a 1.7.2 api 08/1/14

public class speechThreaded implements Runnable{
	
	public static double vVoice;
	public static float vPitch;
	public static float vPitchRange;
	public static float vPitchShift;
	public static String vSentence;
	
	public static void speechSynth(double vVoice2,float vPitch2,float vPitchRange2,float vPitchShift2,String vSentence2 ) {
		vVoice = vVoice2;
		vPitch = vPitch2;
		vPitchRange = vPitchRange2;
		vPitchShift=vPitchShift2;
		vSentence = vSentence2;
		System.out.println(" set the values to "+vVoice+" "+vPitch+" "+vPitchRange+" "+vPitchShift+" "+vSentence);
		
		
		Thread t1 = new Thread(new speechThreaded());
		
		t1.start();
//		try {        //rejoining the thread causes the application to hang while the thread does its work (after all thats what join does! but that causes issues the same as we had before
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
	}

	@Override
	public void run() {
		System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
		System.out.println(" about to try "+vVoice+" "+vPitch+" "+vPitchRange+" "+vPitchShift+" "+vSentence);
		try {
			String VOICENAME = "kevin16";
			if (vVoice == 1) {VOICENAME = "kevin";}; //for now we wont use the low quality one, it would proberly not be used much and thus the removal of an augment will help players
			if (vVoice == 2) {VOICENAME = "kevin16";};
			//if (vVoice == 3) {VOICENAME = "alan";}; //REMed out as alan can only talk about the time
			Voice voice;
			VoiceManager vm= VoiceManager.getInstance();
			voice=vm.getVoice(VOICENAME);
			voice.allocate();
			voice.setPitch(vPitch);
			voice.setPitchRange(vPitchRange);
			voice.setPitchShift(vPitchShift);
			voice.speak(vSentence);
			return;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
