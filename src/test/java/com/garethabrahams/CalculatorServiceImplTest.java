package com.garethabrahams;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorServiceImplTest {

    @Test
    public void add() {
        CalculatorInterface calcs = new CalculatorServiceImpl();
        int results = calcs.add(8,9);
        Assert.assertEquals(17, results);
    }
}