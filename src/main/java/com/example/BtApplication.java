package com.example;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.service.MathService;

@SpringBootApplication
public class BtApplication {

	@Autowired
	private MathService mathService;
	
	public static void main(String[] args) {
		SpringApplication.run(BtApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner runner() {
		return args -> {
			System.out.println("Hello, Spring Boot!");
			Stream<Long> fs = mathService.factorialStream();
			fs.limit(10).forEach(System.out::println);
		};
	}
	@Bean
	public CommandLineRunner runner2() {
		return args -> {
			System.out.println("Hello, Spring Boot!");
			Stream<Long> fs = mathService.test();
			fs.limit(10).forEach(System.out::println);
		};
	}
	
	@Bean
	public CommandLineRunner runner3() {
		return args -> {
			System.out.println("Hello, Spring Boot!");
			Stream<Long> fs = mathService.test2();
			fs.limit(1).forEach(System.out::println);
		};
	}
	@Bean
	public CommandLineRunner runner4() {
		return args -> {
			System.out.println("Hello, Spring Boot!");
			Stream<Long> fs = mathService.test3();
			fs.limit(10).forEach(System.out::println);
		};
	}
}
