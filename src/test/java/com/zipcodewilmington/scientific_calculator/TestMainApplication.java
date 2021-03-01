package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CalculatorOperator;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    @Test
    public void addition() {
        Assertions.assertEquals(6, CalculatorOperator.addition(3, 3));
    }

    @Test
    public void subtraction() {
        Assertions.assertEquals(-1, CalculatorOperator.subtraction(3, 4));
    }

    @Test
    public void multiplication() {
        Assertions.assertEquals(17, CalculatorOperator.multiplication(17, 1));
    }

    @Test
    public void division() {
        Assertions.assertEquals(1 , CalculatorOperator.division(22, 22));
        Assertions.assertEquals(0, CalculatorOperator.division(9, 0));
    }
    @Test
    public void percentage () {
        Assertions.assertEquals(25.00, CalculatorOperator.percentage(25, 100));
        Assertions.assertEquals(50.00, CalculatorOperator.percentage(9, 18));
        Assertions.assertEquals(33.00, CalculatorOperator.percentage(9, 27));
    }

    @Test
    public void squareTest() {
        Assertions.assertEquals(9, CalculatorOperator.square(3));
    }

    @Test
    public void squareRootTest() {
        Assertions.assertEquals(5, CalculatorOperator.squareRoot(25));
    }

    @Test
    public void exponentsTest() {
        Assertions.assertEquals(4, CalculatorOperator.exponents(2, 2));
    }

    @Test
    public void multiplicativeInverseTest() {
        Assertions.assertEquals(1, CalculatorOperator.multiplicativeInverse(1));
    }

    @Test
    public void additiveInverseTest() {
        Assertions.assertEquals(4, CalculatorOperator.additiveInverse(-4));
    }

    // TESTS FOR JUSTIN"S METHODS
    @Test
    public void logarithmTest() {
        Assertions.assertEquals(1.0791812460476249, CalculatorOperator.logarithm(12));
    }

    @Test
    public void inverseLog() {
        Assertions.assertEquals(100 , CalculatorOperator.inverseLog(2));
    }

    @Test
    public void naturalLog() {
        Assertions.assertEquals(2.4849066497880004 , CalculatorOperator.naturalLog(12));
    }

    @Test
    public void inverseNaturalLog() {
        Assertions.assertEquals(2.718281828459045 , CalculatorOperator.inverseNaturalLog(1));
    }
    @Test
    public void factorialTest() {
        Assertions.assertEquals(120, CalculatorOperator.factorial(5));
    }

    // TRIG TESTS
    @Test
    public void sinTest() {
        Assertions.assertEquals(-0.27941549819892586, CalculatorOperator.sine(6));
    }

    @Test
    public void cosTest() {
        Assertions.assertEquals(0.9074467814501962, CalculatorOperator.cosine(13));
    }

    @Test
    public void tangentTest() {
        Assertions.assertEquals(-0.45231565944180985, CalculatorOperator.tangent(9));
    }

    @Test
    public void arcsinTest() {
        Assertions.assertEquals(1.5707963267948966, CalculatorOperator.arcSine(1));
    }

    @Test
    public void arccosTest() {
        Assertions.assertEquals(1.0471975511965979, CalculatorOperator.arcCos(0.5));
    }

    @Test
    public void arctanTest() {
        Assertions.assertEquals(0.7853981633974483, CalculatorOperator.arcTan(1));
    }

    @Test
    public void memTest() {
        Assertions.assertEquals(26.3, CalculatorOperator.memAdd(5,21.3));
        Assertions.assertEquals(85.9, CalculatorOperator.memAdd(-2,87.9));
        Assertions.assertEquals(3.23, CalculatorOperator.memSub(5.42,8.65));
        Assertions.assertEquals(-3, CalculatorOperator.memSub(5,2));
    }
}





