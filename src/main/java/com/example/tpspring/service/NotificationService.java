package com.example.tpspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    private MessageService messageService;

    // Injection par setter - @Primary fait qu'EmailService est injecté par défaut
    // Utiliser @Qualifier("smsService") pour forcer l'injection de SmsService
    @Autowired
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public String notifier() {
        return messageService.getMessage();
    }
}
