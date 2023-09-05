package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test
    void testPlus() {

        var actual = service.plus(1,3);
        assertEquals(4, actual);}

        @Test
        void testPlus2() {

        var actual2 = service.plus(-1,-3);
        assertEquals(-4, actual2); }

        @Test
        void testPlus3() {
        var actual3 = service.plus(-1,3);
        assertEquals(2, actual3);}

        @Test
        void testPlus4() {

        var actual4 = service.plus(1,-3);
        assertEquals(-2, actual4);}

        @Test
        void testPlus5() {

        var actual5 = service.plus(1,0);
        assertEquals(1, actual5);
    }

    @Test
    void testMinus() {

        var actual = service.minus(1,3);
        assertEquals(-2, actual); }

    @Test
    void testMinus2() {

        var actual2 = service.minus(-1,-3);
        assertEquals(-4, actual2);}

    @Test
    void testMinus3() {
        var actual3 = service.minus(3,1);
        assertEquals(2, actual3);}

    @Test
    void testMinus4() {
        var actual4 = service.minus(3,3);
        assertEquals(0, actual4);

    }

    @Test
    void testMultiply() {

        var actual = service.multiply(1,3);
        assertEquals(3, actual);}

    @Test
    void testMultiply2() {

        var actual2 = service.multiply(2,3);
        assertEquals(6, actual);}

    @Test
    void testMultiply3() {

        var actual3 = service.multiply(-1,-3);
        assertEquals(3, actual3); }

    @Test
    void testMultiply4() {


        var actual4 = service.multiply(-1,3);
        assertEquals(-3, actual4);}

    @Test
    void testMultiply5() {

        var actual5 = service.multiply(0,3);
        assertEquals(0, actual5);
    }

    @Test
    void testDivide() {

        var actual = service.divide(3,1);
        assertEquals(3, actual);}

    @Test
    void testDivide2(){
        var actual2 = service.divide(3,3);
        assertEquals(1, actual2);}

    @Test
    void testDivide3(){
        var actual3 = service.divide(-3,1);
        assertEquals(-3, actual3);}

    @Test
    void testDivide4(){

        var actual4 = service.divide(-3,-1);
        assertEquals(3, actual4);
    }

    @Test
    void testDivide5(){
        assertThrows(IllegalArgumentException.class, () -> service.divide(-3, 0));

    }


}