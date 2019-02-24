package com.garethabrahams;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalcApp {

    @Bean(name= "calc")
    public  CalculatorInterface getService(){
        return new CalculatorServiceImpl();
    }
}
