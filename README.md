# Arquitetura-de-Microsservi-os

Projeto Spring Boot - Hello World

Descrição

Este é um projeto simples desenvolvido com Spring Boot que implementa um endpoint REST para retornar a mensagem "Hello, World!". O objetivo é demonstrar a estrutura básica de um projeto Spring Boot e o uso de anotações para criar um controlador REST.

Tecnologias Utilizadas

Java 17 (ou versão compatível)

Spring Boot

Spring Web

Maven

Estrutura do Projeto

seu-projeto/
│-- src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/seuprojeto/controller/HelloController.java
│   │   ├── resources/
│   │       ├── application.properties
│-- pom.xml
│-- README.md

Configuração do Projeto

O projeto foi criado utilizando o Spring Initializr com a dependência Spring Web.

Instalação e Execução

Clone este repositório:

git clone https://github.com/seu-usuario/seu-repositorio.git

Acesse o diretório do projeto:

cd seu-repositorio

Compile e execute a aplicação:

mvn spring-boot:run

A API estará rodando em: http://localhost:8080/test

Endpoint Disponível

Método

Endpoint

Retorno

GET

/test

"Hello, World!"

Personalização

A mensagem retornada pelo endpoint pode ser alterada no método helloWorld() dentro da classe HelloController.java. Por exemplo, para incluir seu nome:

@GetMapping("/test")
public String helloWorld() {
    return "Hello, Ivan Duarte!";
}

Autor

Ivan Duarte
