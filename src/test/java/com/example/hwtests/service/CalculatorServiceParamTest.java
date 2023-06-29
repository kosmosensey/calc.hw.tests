package com.example.hwtests.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceParamTest {

    private final CalculatorService calculator = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideParamsForPlusTest")
    void plusTest(int num1, int num2, int num3) {
        int result = calculator.plus(num1, num2);
        assertEquals(num3, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusTest")
    void minusTest(int num1, int num2, int num3) {
        Integer result = calculator.minus(num1, num2);
        assertEquals(num3, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTest")
    void multiplyTest(int num1, int num2, int num3) {
        Integer result = calculator.multiply(num1, num2);
        assertEquals(num3, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTest")
    void divideTest(int num1, int num2, int num3) {
        Integer result = calculator.divide(num1, num2);
        assertEquals(num3, result);
    }

    static Stream<Arguments> provideParamsForPlusTest() {
        return Stream.of(
                Arguments.of(2, 3, 5),
                Arguments.of(-5, 7, 2),
                Arguments.of(0, 0, 0),
                Arguments.of(10, -10, 0)
        );
    }

    static Stream<Arguments> provideParamsForMinusTest() {
        return Stream.of(
                Arguments.of(5, 3, 2),
                Arguments.of(10, 7, 3),
                Arguments.of(0, 0, 0),
                Arguments.of(-5, -10, 5)
        );
    }

    static Stream<Arguments> provideParamsForMultiplyTest() {
        return Stream.of(
                Arguments.of(2, 3, 6),
                Arguments.of(-5, 7, -35),
                Arguments.of(0, 10, 0),
                Arguments.of(-2, -10, 20)
        );
    }

    static Stream<Arguments> provideParamsForDivideTest() {
        return Stream.of(
                Arguments.of(10, 2, 5),
                Arguments.of(20, -4, -5),
                Arguments.of(0, 5, 0),
                Arguments.of(-15, -3, 5)
        );
    }
}