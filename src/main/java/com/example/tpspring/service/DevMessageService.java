package com.example.tpspring.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

// Actif uniquement quand spring.profiles.active=dev
@Component
@Profile("dev")
public class DevMessageService implements MessageService {

    @Override
    public String getMessage() {
        return "[DEV] Message de développement.";
    }
}
