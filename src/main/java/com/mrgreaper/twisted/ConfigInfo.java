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
    public static final String SPONGECRAFT_KEY = "Allow craftable sponge? ";
    public static boolean MOSSYCRAFT;
    public static final String MOSSYCRAFT_KEY = "Allow craftable mossy cobblestone? ";
    public static boolean GRASSCRAFT;
    public static final String GRASSCRAFT_KEY = "Allow craftable grass? ";
    public static boolean ELECBUNNYCRYS;
    public static final String ELECBUNNYCRYS_KEY = "Enable electric bunny crys ?";
    public static boolean PUBLICTTSBOTS;
    public static final String PUBLICTTSBOTS_KEY = "Do bots use speech when in public channels ? ";


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
    public static int MAXENSLAVEDBUNNYRANGE;
    public static final String MAXENSLAVEDBUNNYRANGE_KEY = "Max range for enslaved bunny speach : ";
    public static final int MAXENSLAVEDBUNNYRANGE_DEFAULT = 50;


}
