package com.garethabrahams;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalcAppTest {

    private CalculatorInterface calc;



    @Before
    public void setUp() throws Exception{
        ApplicationContext ctx = new AnnotationConfigApplicationContext(CalcApp.class);
        calc = (CalculatorInterface)ctx.getBean("calc");
    }

    @After
    public void tearDown() throws Exception{

    }

    @Test
    public void testAdd() throws Exception{
        int results = calc.add(4,2);
        Assert.assertEquals(6, results);
    }
}