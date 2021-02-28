package com.zipcodewilmington.scientificcalculator;

// comments

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        char ch;
        prompt = "0"; // assigned Zero to Prompt variable before taking user input
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Console.println("Please enter the operator: ");
        String userInput = scanner.nextLine(); // Read the operator from the user*
        ch = userInput.charAt(0); // This will just take the first operator from the user if user enters more than one oeprator.
        prompt = (String.valueOf(ch));// This will convert character to string before storing it back in prompt variable.
        return prompt;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        int userInput = scanner.nextInt(); // Read the first number from the user
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        double userInput = scanner.nextDouble(); // Read the second number from the user
        return userInput;
    }
}
