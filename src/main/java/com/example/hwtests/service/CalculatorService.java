package com.example.hwtests.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Integer plus(int num1, int num2) {
        return num1 + num2;
    }

    public Integer minus(int num1, int num2) {
        return num1 - num2;
    }

    public Integer multiply(int num1, int num2) {
        return num1 * num2;
    }

    public Integer divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Требуются оба параметра num1 и num2");
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("Делитель равен 0");
        }
        return num1 / num2;
    }
}
