package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String operator = Console.getStringInput("Enter an Operator:");

        double num1 = Console.getIntegerInput("Enter the first number:");
        double num2 = Console.getDoubleInput("Enter the second number:");

        Console.println("The user input %s as an operator", operator);
        Console.println("The user input %s as a first number", num1);
        Console.println("The user input %s as a second number", num2);

        double output = calculator(operator, num1, num2);
        Console.println("The result of your operation is %.2f ", output);
    }

    public static calculator(String operator, double num1, double num2) {
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
                result = CalculatorOperator.division(num1, num2);
                break;
            case "%":
                result = CalculatorOperator.percentage(num1, num2);
                break;
            default:
                Console.println("Not a valid Operator");
        }

//Initial command is entered here, along with initial value of numeric input and memory
                String s = Console.getStringInput("Enter a command:");
                double memory = 0.0;
                double i = 0.0;
//q is calculator quit command, will keep prompting for commands until q is entered
                while (!(s.equalsIgnoreCase("q"))) {
//initialising second value if it's needed, result needs to initialize to zero in case of switch or base
                    double d;
                    //double result=0;

                    switch (s) {
                        case "switch":

                            break;
                        case "":
                            break;
                        case "M+":
                            i = Console.getDoubleInput("Enter a value to add to memory");
                            CalculatorOperator.memAdd(i, memory);
                            break;
                        case "M-":
                            i = Console.getDoubleInput("Enter a value to subtract from memory");
                            CalculatorOperator.memSub(i, memory);
                            break;
                        case "M":
                            Console.println(Double.toString(memory));
                            break;
                        case "Mc":
                            memory = 0;
                            break;
                        case "+":
                            i = Console.getDoubleInput("Enter a double");
                            d = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.addition(i, d);
                            Console.println(Double.toString(result));
                            break;
                        case "-":
                            i = Console.getDoubleInput("Enter a double");
                            d = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.subtraction(i, d);
                            Console.println(Double.toString(result));
                            break;
                        case "*":
                            i = Console.getDoubleInput("Enter a double");
                            d = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.multiplication(i, d);
                            Console.println(Double.toString(result));
                            break;
                        case "/":
                            i = Console.getDoubleInput("Enter a double");
                            d = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.division(i, d);
                            Console.println(Double.toString(result));
                            break;
                        case "sq":
                            i = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.square(i);
                            Console.println(Double.toString(result));
                            break;
                        case "sqrt":
                            i = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.squareRoot(i);
                            Console.println(Double.toString(result));
                            break;
                        case "expo":
                            i = Console.getDoubleInput("Enter a double");
                            d = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.exponents(i, d);
                            Console.println(Double.toString(result));
                            break;
                        case "inv":
                            i = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.multiplicativeInverse(i);
                            Console.println(Double.toString(result));
                            break;
                        case "neg":
                            i = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.additiveInverse(i);
                            Console.println(Double.toString(result));
                            break;
                        case "log":
                            i = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.logarithm(i);
                            Console.println(Double.toString(result));
                            break;
                        case "-log":
                            i = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.inverseLog(i);
                            Console.println(Double.toString(result));
                            break;
                        case "ln":
                            i = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.naturalLog(i);
                            Console.println(Double.toString(result));
                            break;
                        case "-ln":
                            i = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.inverseNaturalLog(i);
                            Console.println(Double.toString(result));
                            break;
                        case "!":
                            i = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.factorial(i);
                            Console.println(Double.toString(result));
                            break;
                        case "sin":
                            i = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.sine(i);
                            Console.println(Double.toString(result));
                            break;
                        case "cos":
                            i = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.cosine(i);
                            Console.println(Double.toString(result));
                            break;
                        case "tan":
                            i = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.tangent(i);
                            Console.println(Double.toString(result));
                            break;
                        case "asin":
                            i = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.arcSine(i);
                            Console.println(Double.toString(result));
                            break;
                        case "acos":
                            i = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.arcCos(i);
                            Console.println(Double.toString(result));
                            break;
                        case "atan":
                            i = Console.getDoubleInput("Enter a double");
                            result = CalculatorOperator.arcTan(i);
                            Console.println(Double.toString(result));
                            break;
                        case "help":
                            Console.helpDoc();
                            break;
                        default:
                            Console.println("Invalid Command");
                    }
                    //lets the user enter a new command
                    s = Console.getStringInput("Enter an command:");
                }
        }

    }
}
