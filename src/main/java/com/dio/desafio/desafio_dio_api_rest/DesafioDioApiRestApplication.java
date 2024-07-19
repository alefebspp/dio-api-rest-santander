package com.dio.desafio.desafio_dio_api_rest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default server url")})
@SpringBootApplication
public class DesafioDioApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioDioApiRestApplication.class, args);
	}

}
