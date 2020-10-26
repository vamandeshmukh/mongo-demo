package com.example.demo.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApp {	
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApp.class, args);
		System.out.println("Start");
	}

}
