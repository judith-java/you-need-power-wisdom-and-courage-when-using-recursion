package org.example;

import org.example.model.TriangleNumberCalculator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleNumberCalculatorTest {

    TriangleNumberCalculator calculator = new TriangleNumberCalculator();

    @Test
    void testValue() {
        assertEquals(1, calculator.value(1));
        assertEquals(3, calculator.value(2));
        assertEquals(6, calculator.value(3));
        assertEquals(10, calculator.value(4));
    }

    @Test
    void testAdd() {
        assertEquals(2, calculator.add(1, 1));
        assertEquals(9, calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(0, calculator.subtract(1, 1));
        assertEquals(-3, calculator.subtract(2, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(18, calculator.multiply(2, 3)); // 3 * 6
    }

    @Test
    void testDivide() {
        assertEquals(3.3333333333333335, calculator.divide(4, 2), 0.0001); // 10 / 3
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }

    @Test
    void testSequence() {
        List<Integer> expected = List.of(1, 3, 6, 10, 15);
        assertEquals(expected, calculator.sequence(5));
    }

    @Test
    void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> calculator.value(-1));
        assertThrows(IllegalArgumentException.class, () -> calculator.sequence(-1));
    }
}
