package com.dio.santini.projetoSprintJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjetoSprintJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSprintJavaApplication.class, args);
	}

}
