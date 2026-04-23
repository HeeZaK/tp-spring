package org.sebsy.demo.escaperooms.controller;

import org.springframework.stereotype.Component;

// Bean Spring simple, pas de profil → toujours actif
@Component
public class EscapeRoom1Controller {

    public void entreeSalle1() {
        System.out.println("Bravo, vous avez trouvé la première salle !");
    }
}
