package com.example.hwtests.service;

import com.example.hwtests.exception.DivisionByZeroException;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String divide(int num1, int num2) {
        if(num2 == 0){
            throw new DivisionByZeroException("Делитель равен 0");
        }
        int result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }

}
