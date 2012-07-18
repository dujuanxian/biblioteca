package com.twu28.biblioteca;

import enigma.console.TextAttributes;
import enigma.core.Enigma;

import java.awt.*;

public class ColorOutput {
    private static final enigma.console.Console s_console;

    public void println(String str, Color frontColor, Color backgroundColor) {
        TextAttributes textAttributes = new TextAttributes(frontColor, backgroundColor);
        s_console.setTextAttributes(textAttributes);
        System.out.println(str);
        s_console.setTextAttributes(new TextAttributes(Color.WHITE, Color.BLACK));
    }

    /*
     * Is this code dead or alive? Is it being used?
     */
    public void print(String str, Color frontColor, Color backgroundColor) {
        TextAttributes textAttributes = new TextAttributes(frontColor, backgroundColor);
        s_console.setTextAttributes(textAttributes);
        System.out.print(str);
        s_console.setTextAttributes(new TextAttributes(Color.WHITE, Color.BLACK));
    }

    static {
        s_console = Enigma.getConsole();
    }

}
