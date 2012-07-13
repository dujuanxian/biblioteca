package com.twu28.biblioteca;

public class Application {
    public static void main(String[] args) {
        Library library = new Library();
        library.showWelcomeInterface();
        while (true) {
            library.showMenuOptions();
        }
    }
}
