package com.github.crab2died.myboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.github.crab2died.myboot.mapper")
@SpringBootApplication
public class MyBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBootApplication.class, args);
	}
}
