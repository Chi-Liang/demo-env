package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoEnvApplication implements CommandLineRunner {
	
	@Value("${which.env}")
	private String env;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoEnvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("env123456:" + env);
	}

}
