package com.example.helloworld.controller; // Isso está correto para o seu caso

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Anotação que torna a classe um controlador REST
public class HelloController {

    @GetMapping("/test") // Mapeia o método para a URL "/test"
    public String helloWorld() {
        return "Hello, World!"; // Retorna a mensagem "Hello, World!" quando acessado o endpoint
    }
}
