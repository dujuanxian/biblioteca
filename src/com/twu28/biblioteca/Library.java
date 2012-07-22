package com.twu28.biblioteca;

import com.twu28.biblioteca.user.User;
import com.twu28.biblioteca.option.Option;

import java.awt.*;

public class Library {
    public User currentUser = new User(null, null);
    
    void runLibraryApplication() {
        /*
         * Good separation of steps.
         *
         * Separation of concerns is *the* single most important guideline when building IT systems.
         */
        showMenuOption();
        runMenuOption();
    }


    private void runMenuOption() {
        createOption().run(currentUser);
    }

    private Option createOption() {
        return Option.createOption(getOptionNumber(new Command()));
    }

    int getOptionNumber(Command command) {
        int inputNumber = command.getNextInt("Input the number of the menu option between 1 to "
                + Option.TOTAL_OPTION_NUMBER);
        while (!isValidOption(inputNumber))
            inputNumber = command.getNextInt("Wrong number, try again.");
        return inputNumber;
    }

    private void showMenuOption() {
        Application.colorOutput.println("1: View all the books", Color.LIGHT_GRAY, Color.BLACK);
        Application.colorOutput.println("2: View book collections", Color.LIGHT_GRAY, Color.BLACK);
        Application.colorOutput.println("3: View all the movies", Color.LIGHT_GRAY, Color.BLACK);
        Application.colorOutput.println("4: Check Library Number", Color.LIGHT_GRAY, Color.BLACK);
        Application.colorOutput.println("5: Quit Application", Color.LIGHT_GRAY, Color.BLACK);
    }

    private boolean isValidOption(int inputNumber) {
        return inputNumber > 0 && inputNumber <= Option.TOTAL_OPTION_NUMBER;
    }

}
