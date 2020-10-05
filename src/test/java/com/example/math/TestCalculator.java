package com.example.math;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(5, 3));
    }

    @Test
    public void subtract() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.subtract(8, 4));
    }

}
