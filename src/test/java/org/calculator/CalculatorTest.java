package org.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private float num1 = 3.25f;
    private float num2 = 2.5f;

    @Test
    void add() {
        assertEquals(5.75f, Calculator.add(num1, num2));
    }

    @Test
    void subtract() {
        assertEquals(0.75f, Calculator.subtract(num1, num2));
    }

    @Test
    void multiply() {
        assertEquals(8.125f, Calculator.multiply(num1, num2));
    }

    @Test
    void divide() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(num1, 0f));
        assertEquals(1.3f, Calculator.divide(num1, num2));
    }
}