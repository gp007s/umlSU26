package com.leszko.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testSumPositiveNumbers() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    public void testSumWithZero() {

        assertEquals(7, calculator.sum(7, 0));
    }

    @Test
    public void testSumNegativeNumbers() {

        assertEquals(-3, calculator.sum(-1, -2));
    }
}
