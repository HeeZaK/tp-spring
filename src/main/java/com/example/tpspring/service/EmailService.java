package com.example.tpspring.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Bean prioritaire par défaut grâce à @Primary
@Component
@Primary
public class EmailService implements MessageService {

    @Override
    public String getMessage() {
        return "Message envoyé par email.";
    }
}
