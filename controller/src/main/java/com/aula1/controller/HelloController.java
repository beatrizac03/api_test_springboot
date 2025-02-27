package com.aula1.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @GetMapping("/test")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/")
    public String initialize() {
        return "Início";
    }

    @GetMapping("/users")
    public String getString(@RequestParam String name) {
        return name + " Seja bem vindo";
    }
    
}
