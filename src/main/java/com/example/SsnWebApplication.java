package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SsnWebApplication {
	private final static String req="https://facebook.come";

	public static void main(String[] args) {
		SpringApplication.run(SsnWebApplication.class, args);
	}

}
