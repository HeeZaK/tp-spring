package com.example.tpspring.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

// TP02 - Bean de type Service
@Service
public class BavardService {

    private String nom = "BavardService par défaut";

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Exécuté juste après l'instanciation du bean par Spring
    @PostConstruct
    private void postConstruct() {
        System.out.println("[PostConstruct] BavardService est initialisé !");
    }

    public String parler() {
        return nom + " - " + this.getClass().getSimpleName();
    }
}
