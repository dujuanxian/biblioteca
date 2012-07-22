package com.twu28.biblioteca;

import java.awt.*;

public class Application {
    public static Library myLibrary = new Library();
    public static ColorOutput colorOutput = new ColorOutput();

    public static void main(String[] args) {
        showWelcomeInterface();
        while (true) {
            myLibrary.runLibraryApplication();
        }
    }

    private static void showWelcomeInterface() {
        colorOutput.println("Welcome to the Bilioteca Library.", Color.RED, Color.BLACK);
    }
}
