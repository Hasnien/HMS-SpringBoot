package com.hms.controller;

import com.hms.model.PathologicalTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringHmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHmsApplication.class, args);
		System.out.println("Test Compilation for \"Spring HMS\"");
//		List<PathologicalTest> Tests = new ArrayList<>();

	}

}
