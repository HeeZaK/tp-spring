package com.example.tpspring;

import com.example.tpspring.service.BavardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TpSpringApplication {

    // TP02 - Injection du BavardService par Spring
    @Autowired
    private BavardService bavardService;

    public static void main(String[] args) {
        SpringApplication.run(TpSpringApplication.class, args);
    }

    // TP01 - Hello World
    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String name) {
        if (name != null) return "Bonjour, " + name + " !";
        return "Bonjour, monde !";
    }

    // TP02 - Utilisation du BavardService injecté
    @GetMapping("/blabla")
    public String blabla() {
        return bavardService.parler();
    }
}
