package com.zipcodewilmington.scientificcalculator;

//comments

import com.sun.deploy.security.SelectableSecurityManager;

public class CalculatorOperator {

    public static double addition (double num1, double num2) {
        double add = num1 + num2;
        return add;
    }

    public static double subtraction
            (double num1, double num2) {
        double subtract = num1 - num2;
        return subtract;
    }

    public static double multiplication (double num1, double num2) {
        double multiply = num1 * num2;
        return multiply;
    }

    public static double division (double num1, double num2){
        double divide=0;
        if (num2 == 0)
            Console.println("Error");
        else
            divide = num1/num2;
            return divide;
}

    public static double percentage (double num1, double num2){
        double percent = (num1/num2) * 100;
        return percent;
    }

    public static double square (double a) {
        double square = Math.pow(a,2);
        return square;
    }

    public static double squareRoot (double a) {
        double squareRoot = Math.sqrt(a);
        return squareRoot;
    }

    public static double exponents (double a, double b) {
        double exponent = Math.pow(a,b);
        return exponent;
    }

    public static double multiplicativeInverse (double a) {
        double multiplicativeInverse = 1/a;
        return multiplicativeInverse;
    }

    public static double additiveInverse (double a) {
        double additiveInverse = a * -1;
        return additiveInverse;
    }

}

