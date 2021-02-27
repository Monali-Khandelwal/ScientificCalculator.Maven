package com.zipcodewilmington.scientificcalculator;

// comments

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String operator = Console.getStringInput("Enter a Operator:");
        double num1 = Console.getIntegerInput("Enter the first number:");
        double num2 = Console.getDoubleInput("Enter the second number:");

        Console.println("The user input %s as a operator", operator);
        Console.println("The user input %s as a first number", num1);
        Console.println("The user input %s as a second number", num2);

        //double c = calculator(operator,num1,num2 );
        //Console.println("The Output is %s ", c);
    }

    public static double calculator (String operator, double num1, double num2) {
        double result = 0;
            switch (operator) {
                case "+":
                    result = CalculatorOperator.addition(num1, num2);
                    break;
                case "-":
                    result = CalculatorOperator.subtraction(num1, num2);
                    break;
                case "*":
                    result = CalculatorOperator.multiplication(num1, num2);
                    break;
                case "/":
                    result = CalculatorOperator.division(num1,num2);
                    break;
                default:
                    Console.println("Not a valid Operator");
            }
            return result;
        }
    }
