package com.example.tpspring.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

// Actif uniquement hors profils dev/prod (pas de @Profile = toujours actif)
// @Primary pour éviter le conflit quand aucun profil n'est actif
@Component
@Primary
@Profile("!dev & !prod")
public class EmailService implements MessageService {

    @Override
    public String getMessage() {
        return "Message envoyé par email.";
    }
}
