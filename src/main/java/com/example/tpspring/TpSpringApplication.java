package com.example.tpspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// TP01 - Hello World REST
@SpringBootApplication
@RestController
public class TpSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpSpringApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String name) {
        if (name != null) return "Bonjour, " + name + " !";
        return "Bonjour, monde !";
    }
}
