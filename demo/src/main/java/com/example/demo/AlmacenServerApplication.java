package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "objects")
@ComponentScan(basePackages = {"service", "controller","security" })
public class AlmacenServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlmacenServerApplication.class, args);
	}

}
