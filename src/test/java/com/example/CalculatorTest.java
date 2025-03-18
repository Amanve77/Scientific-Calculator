package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(.0, calculator.add(3, 4), 0.001);
        assertEquals(0.0, calculator.add(-5, 5), 0.001);
    }

    @Test
    void testSubtraction() {
        assertEquals(1.0, calculator.subtract(5, 4), 0.001);
        assertEquals(-10.0, calculator.subtract(-5, 5), 0.001);
    }

    @Test
    void testMultiplication() {
        assertEquals(20.0, calculator.multiply(4, 5), 0.001);
        assertEquals(0.0, calculator.multiply(4, 0), 0.001);
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculator.divide(10, 5), 0.001);
        assertEquals(0.5, calculator.divide(1, 2), 0.001);
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    @Test
    void testSquareRoot() {
        assertEquals(3.0, calculator.squareRoot(9), 0.001);
        assertEquals(5.0, calculator.squareRoot(25), 0.001);
    }

    @Test
    void testFactorial() {
        assertEquals(1, calculator.factorial(0));
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-1));
    }

    @Test
    void testNaturalLog() {
        assertEquals(0, calculator.naturalLog(1), 0.001);
        assertEquals(1.609, calculator.naturalLog(5), 0.001);
    }

    @Test
    void testPower() {
        assertEquals(1.0, calculator.power(5, 0), 0.001);
        assertEquals(16.0, calculator.power(2, 4), 0.001);
    }
}

