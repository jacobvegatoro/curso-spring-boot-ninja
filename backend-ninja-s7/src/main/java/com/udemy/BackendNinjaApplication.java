package com.udemy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BackendNinjaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendNinjaApplication.class, args);
	}

}