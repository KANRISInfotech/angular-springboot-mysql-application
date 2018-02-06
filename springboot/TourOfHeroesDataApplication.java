package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.example.demo")
public class TourOfHeroesDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourOfHeroesDataApplication.class, args);
	}
}
