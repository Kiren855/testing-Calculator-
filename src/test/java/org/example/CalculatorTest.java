package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    @DisplayName("Add")
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Subtract")
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    @DisplayName("Multiply")
    public void testMultiply() {
        int result = calculator.multiply(3, 4);
        assertEquals(12, result);
    }

    @Test
    @DisplayName("Divide")
    public void testDivide() {
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    @DisplayName("Divide by 0")
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}