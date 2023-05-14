package com.example.BMIcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.BMIcalculator", "controller", "service"})
public class BmIcalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmIcalculatorApplication.class, args);
	}

}
