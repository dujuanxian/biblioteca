package com.twu28.biblioteca;

public class Application {
    public static Library library = new Library();
    
    public static void main(String[] args) {        
        library.showWelcomeInterface();
        while (true) {
            library.showMenuOptions();
        }
    }
}
