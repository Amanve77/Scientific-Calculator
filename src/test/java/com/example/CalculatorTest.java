package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testSquareRoot() {
        assertEquals(5.0, calculator.squareRoot(25), 0.001);
    }

    @Test
    void testFactorial() {
        assertEquals(125, calculator.factorial(5));
    }

    @Test
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-1));
    }

    @Test
    void testNaturalLog() {
        assertEquals(0, calculator.naturalLog(1), 0.001);
    }

    @Test
    void testPower() {
        assertEquals(16.0, calculator.power(2, 4), 0.001);
    }
}

