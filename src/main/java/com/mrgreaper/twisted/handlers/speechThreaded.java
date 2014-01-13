/*
 * Copyright (c) 2014. The Code is under The MIT License (MIT)
 *
 * Copyright (c) [2014] [David Eastwick]
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * side note, i request you do not copy whole classes from my mod etc thats just not cool :)
 *
 * Textures and binaries are licensed under Creative Commons 3 *: http://creativecommons.org/licenses/by/3.0/ Any alternate licenses are noted where appropriate *where applicable
 *
 * freetts is used within its license as stated here : http://freetts.sourceforge.net/license.terms
 */

package com.mrgreaper.twisted.handlers;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

//this is one of the most complicated bits, we have to put the speech into its own thread or we hang the program, this means timing will be important for cc users :( 
//it also means if two cc`s start a sentence at the exact same nano second we will get only one of them...odds are slim that will be an issue but untill i can test in a
//playable enviroment i cant really see if its an issue issue or ignorable and at this point cc doesnt even have a 1.7.2 api 08/1/14

public class speechThreaded implements Runnable {

    public static double vVoice;
    public static float vPitch;
    public static float vPitchRange;
    public static float vPitchShift;
    public static String vSentence;

    public static void speechSynth(double vVoice2, float vPitch2, float vPitchRange2, float vPitchShift2, String vSentence2) {
        vVoice = vVoice2;
        vPitch = vPitch2;
        vPitchRange = vPitchRange2;
        vPitchShift = vPitchShift2;
        vSentence = vSentence2;
        System.out.println(" set the values to " + vVoice + " " + vPitch + " " + vPitchRange + " " + vPitchShift + " " + vSentence);


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
        System.out.println(" about to try " + vVoice + " " + vPitch + " " + vPitchRange + " " + vPitchShift + " " + vSentence);
        try {
            String VOICENAME = "kevin16";
            if (vVoice == 1) {
                VOICENAME = "kevin";
            }
            ; //for now we wont use the low quality one, it would proberly not be used much and thus the removal of an augment will help players
            if (vVoice == 2) {
                VOICENAME = "kevin16";
            }
            ;
            //if (vVoice == 3) {VOICENAME = "alan";}; //REMed out as alan can only talk about the time
            Voice voice;
            VoiceManager vm = VoiceManager.getInstance();
            voice = vm.getVoice(VOICENAME);
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
