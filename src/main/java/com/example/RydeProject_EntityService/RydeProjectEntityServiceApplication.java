package com.example.RydeProject_EntityService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RydeProjectEntityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RydeProjectEntityServiceApplication.class, args);
	}

}
