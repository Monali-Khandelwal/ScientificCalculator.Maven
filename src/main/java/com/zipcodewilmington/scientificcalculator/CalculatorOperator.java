package com.zipcodewilmington.scientificcalculator;

//comments

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
    //JUSTIN"S LOG AND FACTORIAL METHODS

    public static double logarithm (double a) {
        double logarithm = Math.log10(a);
        return logarithm;
    }

    public static double inverseLog (double a) {
        double inverseLog = Math.pow(10, a);
        return inverseLog;
    }

    public static double naturalLog (double a) {
        double naturalLog = Math.log(a);
        return naturalLog;
    }

    public static double inverseNaturalLog (double a) {
        double inverseNaturalLog = Math.pow(Math.exp(1),a);
        return inverseNaturalLog;
    }

    public static double factorial (double a) {
        double factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // TRIGONOMETRIC FUNCTIONS

    public static double sine (double a) {
        double sine = Math.sin(a);
        return sine;
    }

    public static double cosine (double a) {
        double cosine = Math.cos(a);
        return cosine;
    }

    public static double tangent (double a) {
        double tangent = Math.tan(a);
        return tangent;
    }

    public static double arcSine (double a) {
        double arcSine = Math.asin(a);
        return arcSine;
    }

    public static double arcCos (double a) {
        double arcCos = Math.acos(a);
        return arcCos;
    }

    public static double arcTan (double a) {
        double arcTan = Math.atan(a);
        return arcTan;
    }




    //necessary methods for the M key, rest handled in main app -- Abe.
    public static double memAdd(double a, double memory)
    {
        memory+=a;
        double roundedMemory=Math.round(memory * 100.0) / 100.0;
        return roundedMemory;
    }
    public static double memSub(double a, double memory)
    {
        memory-=a;
        double roundedMemory=Math.round(memory * 100.0) / 100.0;
        return roundedMemory;
    }
}

