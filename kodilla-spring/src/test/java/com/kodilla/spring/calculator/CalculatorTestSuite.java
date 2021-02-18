package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    void testCalculations() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double addResult = calculator.add(3, 2);
        Double subResult = calculator.sub(3, 2);
        Double mulResult = calculator.mul(3, 2);
        Double divResult = calculator.div(3, 2);

        //Then
        assertEquals(5, addResult);
        assertEquals(1, subResult);
        assertEquals(6, mulResult);
        assertEquals(1.5, divResult);
    }
}
