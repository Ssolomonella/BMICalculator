package com.example.controller;

import com.example.BmiCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculateBmi")
public class BmiCalculatorController {

    @Autowired
    private BmiCalculatorService bmiCalculatorService;

    @GetMapping("/calculateBmi")
    public double calculateBmi(@RequestParam double weight, @RequestParam double height) {
        return bmiCalculatorService.calculate(weight, height);
    }
}