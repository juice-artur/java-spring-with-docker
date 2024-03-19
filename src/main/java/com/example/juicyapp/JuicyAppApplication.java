package com.example.juicyapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class JuicyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JuicyAppApplication.class, args);
	}

}
