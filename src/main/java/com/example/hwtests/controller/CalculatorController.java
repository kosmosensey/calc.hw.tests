package com.example.hwtests.controller;

import com.example.hwtests.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculator;

    public CalculatorController(CalculatorService calculator) {
        this.calculator = calculator;
    }

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus (@RequestParam("num1") int num1,@RequestParam("num2") int num2 ){
        return num1 + " + " + num2 + " = " + calculator.plus(num1,num2);
    }
    @GetMapping("/minus")
    public String minus (@RequestParam("num1") int num1,@RequestParam("num2") int num2 ){
        return num1 + " - " + num2 + " = " + calculator.minus(num1,num2);
    }
    @GetMapping("/multiply")
    public String multiply (@RequestParam("num1") int num1,@RequestParam("num2") int num2 ){
        return num1 + " * " + num2 + " = " + calculator.multiply(num1,num2);
    }
    @GetMapping("/divide")
    public String divide (@RequestParam(value = "num1", required = false) Integer num1,
                          @RequestParam(value = "num2", required = false) Integer num2 ){
        return num1 + " / " + num2 + " = " + calculator.divide(num1,num2);
    }

}
