package com.Hot_Desking_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class HotDeskingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotDeskingAppApplication.class, args);
	}

}
