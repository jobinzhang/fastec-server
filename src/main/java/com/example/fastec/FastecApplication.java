package com.example.fastec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FastecApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastecApplication.class, args);
	}

}
