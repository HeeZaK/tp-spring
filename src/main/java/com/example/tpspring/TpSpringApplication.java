package com.example.tpspring;

import com.example.tpspring.circular.ClassA;
import com.example.tpspring.service.BavardService;
import com.example.tpspring.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TpSpringApplication {

    @Autowired
    private BavardService bavardService;

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private ClassA classA;

    public static void main(String[] args) {
        SpringApplication.run(TpSpringApplication.class, args);
    }

    // TP01 - Hello World
    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String name) {
        if (name != null) return "Bonjour, " + name + " !";
        return "Bonjour, monde !";
    }

    // TP02 simple - BavardService
    @GetMapping("/blabla")
    public String blabla() {
        return bavardService.parler();
    }

    // TP02 avancé Exo 1 & 2 - NotificationService
    @GetMapping("/notifier")
    public String notifier() {
        return notificationService.notifier();
    }

    // TP02 avancé Exo 3 - Injection circulaire résolue
    @GetMapping("/circular")
    public String circular() {
        return classA.hello();
    }
}
