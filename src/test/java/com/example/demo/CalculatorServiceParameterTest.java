package com.example.demo;

import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class CalculatorServiceParameterTest {

    private static List<Advice.Argument>parametrs(){
        return List.of(
                Argument.of(1,4);
                Argument.of(-1,-4);
                Argument.of(1,-4);
                Argument.of(-1,4);
        Argument.of(1,0));
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testPlus(double num1, double num2){
        assertEquals(num1 + num2, service.plus(num1,num2));
        assertEquals(num1 - num2, service.minus(num1,num2));
        assertEquals(num1 * num2, service.multiply(num1,num2));
        assertEquals(num1 / num2, service.divide(num1,num2));
    }
}
