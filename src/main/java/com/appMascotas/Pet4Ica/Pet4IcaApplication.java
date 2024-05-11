package com.appMascotas.Pet4Ica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class Pet4IcaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Pet4IcaApplication.class, args);
	}

}
