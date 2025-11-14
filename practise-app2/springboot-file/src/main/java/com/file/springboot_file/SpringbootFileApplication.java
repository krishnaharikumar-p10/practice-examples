package com.file.springboot_file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.file.springboot_file.service")
public class SpringbootFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFileApplication.class, args);
	}

}
