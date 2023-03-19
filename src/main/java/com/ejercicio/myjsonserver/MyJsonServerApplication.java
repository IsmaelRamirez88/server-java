package com.ejercicio.myjsonserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MyJsonServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyJsonServerApplication.class, args);
	}

}
