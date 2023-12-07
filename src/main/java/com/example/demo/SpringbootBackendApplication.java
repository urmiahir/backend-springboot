package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication// this is our main running class and this annotation making it Springboot application
@ComponentScan// it will scan the component which is nothing but considering as a bean 
public class SpringbootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
		
		System.out.println("I am Working Urmi..");
	}

}
