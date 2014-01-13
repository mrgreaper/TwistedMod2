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

import com.google.code.chatterbotapi.ChatterBot;
import com.google.code.chatterbotapi.ChatterBotFactory;
import com.google.code.chatterbotapi.ChatterBotSession;
import com.google.code.chatterbotapi.ChatterBotType;

public class BotHandler {

    private static ChatterBotSession maxSession;
    private static ChatterBotSession fredSession;
    private static ChatterBotSession georgeSession;

    public static void init() throws Exception {
        ChatterBotFactory factory = new ChatterBotFactory();
        ChatterBot max = factory.create(ChatterBotType.CLEVERBOT);
        maxSession = max.createSession();
        ChatterBot fred = factory.create(ChatterBotType.JABBERWACKY);
        fredSession = fred.createSession();
        ChatterBot george = factory.create(ChatterBotType.PANDORABOTS, "b0dafd24ee35a477");
        georgeSession = george.createSession();

    }

    public static String maxBot(String s) throws Exception {
        return maxSession.think(s);
    }

    public static String fredBot(String s) throws Exception {
        return fredSession.think(s);
    }

    public static String georgeBot(String s) throws Exception {
        return georgeSession.think(s);
    }
}

