package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test
    void plus() {

        var actual = service.plus(1,3);
        assertEquals(4, actual);

        var actual2 = service.plus(-1,-3);
        assertEquals(-4, actual2);

        var actual3 = service.plus(-1,3);
        assertEquals(2, actual3);

        var actual4 = service.plus(1,-3);
        assertEquals(-2, actual4);

        var actual5 = service.plus(1,0);
        assertEquals(1, actual5);
    }

    @Test
    void minus() {

        var actual = service.minus(1,3);
        assertEquals(-2, actual);

        var actual2 = service.minus(-1,-3);
        assertEquals(-4, actual2);

        var actual3 = service.minus(3,1);
        assertEquals(2, actual3);

        var actual4 = service.minus(3,3);
        assertEquals(0, actual4);

    }

    @Test
    void multiply() {

        var actual = service.multiply(1,3);
        assertEquals(3, actual);

        var actual2 = service.multiply(2,3);
        assertEquals(6, actual);

        var actual3 = service.multiply(-1,-3);
        assertEquals(3, actual3);

        var actual4 = service.multiply(-1,3);
        assertEquals(-3, actual4);

        var actual5 = service.multiply(0,3);
        assertEquals(0, actual5);
    }

    @Test
    void divide() {

        var actual = service.divide(3,1);
        assertEquals(3, actual);

        var actual2 = service.divide(3,3);
        assertEquals(1, actual2);

        var actual3 = service.divide(-3,1);
        assertEquals(-3, actual3);

        var actual4 = service.divide(-3,-1);
        assertEquals(3, actual4);
    }
}