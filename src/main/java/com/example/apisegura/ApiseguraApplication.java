package com.example.apisegura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiseguraApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiseguraApplication.class, args);
		System.out.println("Estoy funcionando en el main");
	}

}
