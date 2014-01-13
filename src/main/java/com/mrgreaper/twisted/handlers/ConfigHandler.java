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

import java.io.File;

import com.mrgreaper.twisted.ConfigInfo;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

    public static void init(File configFile) {
        Configuration config = new Configuration(configFile);

        config.load();


        //here is where we let users ..well ok mainly server admins control parts of the mod

        ConfigInfo.EASYMODE = config.get("Bunny Toggles", ConfigInfo.EASYMODE_KEY, true).getBoolean(true);
        ConfigInfo.LSMELT = config.get("Vanila Tweaks", ConfigInfo.LSMELT_KEY, true).getBoolean(true);
        ConfigInfo.SCRAFT = config.get("Vanila Tweaks", ConfigInfo.SCRAFT_KEY, true).getBoolean(true);
        ConfigInfo.ATEX = config.get("Bunny Toggles", ConfigInfo.ATEX_KEY, true).getBoolean(true);
        ConfigInfo.SPONGECRAFT = config.get("Vanila Tweaks", ConfigInfo.SPONGECRAFT_KEY, true).getBoolean(true);
        ConfigInfo.MOSSYCRAFT = config.get("Vanila Tweaks", ConfigInfo.MOSSYCRAFT_KEY, true).getBoolean(true);
        ConfigInfo.GRASSCRAFT = config.get("Vanila Tweaks", ConfigInfo.GRASSCRAFT_KEY, true).getBoolean(true);

        config.save();

    }

}
