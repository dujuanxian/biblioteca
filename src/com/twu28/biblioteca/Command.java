package com.twu28.biblioteca;

import java.util.Scanner;

/*
 * Have a look at Mockito and see whether it can help you testing this class.
 */
public class Command {
    public int getNextInt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    public String getNextString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.next();
    }
}