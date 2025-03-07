package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Marca esta classe como a principal da aplicação Spring Boot
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args); // Inicia o aplicativo Spring Boot
    }
}
