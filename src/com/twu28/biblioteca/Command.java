package com.twu28.biblioteca;

import java.util.Scanner;

public class Command {
    public static int getCommand() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}