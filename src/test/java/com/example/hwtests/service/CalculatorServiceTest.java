package com.example.hwtests.service;

import com.example.hwtests.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.hwtests.constant.CalculatorServiceTestConstants.*;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorServiceTest {

    private final CalculatorService calculator = new CalculatorService();

    @Test
    void plusTest() {
        Integer result = calculator.plus(NUMBER_ONE, NUMBER_TWO);
        Assertions.assertEquals(PLUS_RESULT, result);
    }

    @Test
    void minusTest() {
        Integer result = calculator.minus(NUMBER_ONE, NUMBER_TWO);
        Assertions.assertEquals(MINUS_RESULT, result);
    }

    @Test
    void multiplyTest() {
        Integer result = calculator.multiply(NUMBER_ONE, NUMBER_TWO);
        Assertions.assertEquals(MULTIPLY_RESULT, result);
    }

    @Test
    void divideTest() {
        Integer result = calculator.divide(NUMBER_ONE, NUMBER_TWO);
        Assertions.assertEquals(DIVIDE_RESULT, result);
    }

    @Test
    void secondDivisionNumIsNotZero() {
        assertThrows(IllegalArgumentException.class, () ->
                calculator.divide(NUMBER_ONE, WRONG_NUMBER_FOR_DIVIDE));
    }
}
