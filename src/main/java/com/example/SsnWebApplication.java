package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SsnWebApplication {
	Map<String,Integer> ma=new Map<String,Integer>();

	public static void main(String[] args) {
		SpringApplication.run(SsnWebApplication.class, args);
	}
	
	public String m1(){
	
	System.out.println("this is my m1 method");
	}

}
