package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan ({"com.example.demo.service", "com.example.demo.controlle‌r"})
public class Proyecto4Application {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto4Application.class, args);
	}

}
