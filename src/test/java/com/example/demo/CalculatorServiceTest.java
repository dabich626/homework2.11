package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test
    void shouldReturnPositiveNumberWhenPlusPositiveNumbers() {

        var actual = service.plus(1,3);
        assertEquals(4, actual);}

        @Test
        void shouldReturnNegativeNumberWhenPlusNegativeNumbers() {

        var actual2 = service.plus(-1,-3);
        assertEquals(-4, actual2); }

        @Test
        void shouldReturnPositiveNumberWhenPlusNegativeAndPositiveNumbers() {
        var actual3 = service.plus(-1,3);
        assertEquals(2, actual3);}

        @Test
        void shouldReturnNegativeNumberWhenPlusNegativeAndPositiveNumbers() {

        var actual4 = service.plus(1,-3);
        assertEquals(-2, actual4);}

        @Test
        void shouldReturnPositiveNumberWhenPlusPositiveNumberAndZero() {

        var actual5 = service.plus(1,0);
        assertEquals(1, actual5);
    }

    @Test
    void shouldReturnNegativeNumberWhenMinusPositiveNumbers() {

        var actual = service.minus(1,3);
        assertEquals(-2, actual); }

    @Test
    void shouldReturnNegativeNumberWhenMinusNegativeNumbers() {

        var actual2 = service.minus(-1,-3);
        assertEquals(-4, actual2);}

    @Test
    void shouldReturnPositiveNumberWhenMinusPositiveNumbers() {
        var actual3 = service.minus(3,1);
        assertEquals(2, actual3);}

    @Test
    void shouldReturnZeroWhenMinusSamePositiveNumbers() {
        var actual4 = service.minus(3,3);
        assertEquals(0, actual4);

    }

    @Test
    void shouldReturnPositiveWhenMultiplyPositiveNumbers() {

        var actual = service.multiply(1,3);
        assertEquals(3, actual);}

    @Test
    void shouldReturnPositiveWhenMultiplyPositiveNumbers2() {

        var actual2 = service.multiply(2,3);
        assertEquals(6, actual2);}

    @Test
    void shouldReturnPositiveWhenMultiplyTwoNegativeNumbers() {

        var actual3 = service.multiply(-1,-3);
        assertEquals(3, actual3); }

    @Test
    void shouldReturnNegativeWhenMultiplyNegativeAndPositiveNumbers() {


        var actual4 = service.multiply(-1,3);
        assertEquals(-3, actual4);}

    @Test
    void shouldReturnZeroWhenMultiplyPositiveAndZeroNumbers() {

        var actual5 = service.multiply(0,3);
        assertEquals(0, actual5);
    }

    @Test
    void shouldReturnPositiveWhenDividePositiveNumbers() {

        var actual = service.divide(3,1);
        assertEquals(3, actual);}

    @Test
    void shouldReturnPositiveOneWhenDividePositiveSameNumbers(){
        var actual2 = service.divide(3,3);
        assertEquals(1, actual2);}

    @Test
    void shouldReturnNegativeWhenDividePositiveAndNegativeNumbers(){
        var actual3 = service.divide(-3,1);
        assertEquals(-3, actual3);}

    @Test
    void shouldReturnPositiveWhenDivideNegativeNumbers(){

        var actual4 = service.divide(-3,-1);
        assertEquals(3, actual4);
    }

    @Test
    void shouldThrowExceptionWhenDivideBy0(){
        assertThrows(IllegalArgumentException.class, () -> service.divide(-3, 0));

    }


}