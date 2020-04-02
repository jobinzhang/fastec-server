package com.example.fastec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
@MapperScan("com.example.fastec.mapper")
public class FastecApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastecApplication.class, args);
	}

}
