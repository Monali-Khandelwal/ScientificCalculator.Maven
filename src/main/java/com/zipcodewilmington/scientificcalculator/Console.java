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
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        // Read the first number from the user
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        // Read the second number from the user
        double userInput = scanner.nextDouble();
        return userInput;
    }


    /*switches the current display mode to the next from smallest to largest.
WARNING: Display modes other then decimal will cause the calculator to be
unable to display values less then zero.*/
    public static String switchDisplayMode(double i, String mode){
        int a = (int)i;
        if (mode.equals("decimal")){
            println(Integer.toHexString(a));
            return "hexadecimal";
        }else if(mode.equals("hexadecimal")){
            println(Integer.toBinaryString(a));
            return "binary";
        }else if(mode.equals("binary")){
            println(Integer.toOctalString(a));
            return "octal";
        }else if(mode.equals("octal")){
            println(Integer.toString(a));
            return "decimal";
        }
        return "";
    }
    //alternate switch display statement that lets the user manually change the display mode.
    public static void directDisplayMode(String mode, double i){
        int a = (int)i;
        if (mode.equalsIgnoreCase("decimal")) {
            println(Integer.toString(a));
        }else if (mode.equalsIgnoreCase("octal")) {
            println(Integer.toOctalString(a));
        }else if (mode.equalsIgnoreCase("binary")) {
            println(Integer.toBinaryString(a));
        }else if (mode.equalsIgnoreCase("hexadecimal")){
            println(Integer.toHexString(a));
        }else
            println("Invalid command. Please pick binary, octal, decimal, or hexadecimal");
    }
    //A help method to bring up a list of commands --AF
    //ryan I love you for adding to this for me and savimg me some work --AF
    public static void helpDoc(){
        println("q      Will exit the calculator");
        println("+      Will add two numbers");
        println("-      Will subtract the first input from the next");
        println("*      Will multiply the first input from the next");
        println("/      Will divide the first input from the next");
        println("sq     Will calculate the square of a number");
        println("sqrt   Will calculate the square root of a number");
        println("expo   Will calculate the first input to the power of the second");
        println("inv     Will calculate the value of 1 divided by the input");
        println("neg    Will calculate the input multiplied by -1");
        println("log    Will calculate the logarithm of the input");
        println("-log    Will calculate the inverse logarithm of the input");
        println("ln    Will calculate the natural logarithm of the input");
        println("-ln    Will calculate the inverse natural logarithm of the input");
        println("!    Will calculate the factorial of a number");
        println("sin    Will calculate sine given the input");
        println("cos    Will calculate cosine given the input");
        println("tan    Will calculate tangent given the input");
        println("asin    Will calculate arcsine given the input");
        println("acos    Will calculate arccosine given the input");
        println("atan    Will calculate arctangent given the input");
    }
}
