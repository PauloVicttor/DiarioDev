package com.paulovictor.DiarioDev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DiarioDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiarioDevApplication.class, args);
	}

}
