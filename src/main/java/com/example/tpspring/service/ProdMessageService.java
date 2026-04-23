package com.example.tpspring.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

// Actif uniquement quand spring.profiles.active=prod
@Component
@Profile("prod")
public class ProdMessageService implements MessageService {

    @Override
    public String getMessage() {
        return "[PROD] Message de production.";
    }
}
