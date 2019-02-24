package com.garethabrahams;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calc = new Calculator();
        int sum = calc.add(7,3);
        Assert.assertEquals(10,sum);
    }
}