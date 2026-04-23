package com.example.tpspring.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ClassA {

    private final ClassB classB;

    // @Lazy résout la dépendance circulaire :
    // Spring crée un proxy de ClassB au lieu de l'instancier immédiatement
    // Sans @Lazy → BeanCurrentlyInCreationException au démarrage
    @Autowired
    public ClassA(@Lazy ClassB classB) {
        this.classB = classB;
    }

    public String hello() {
        return "ClassA appelle ClassB : " + classB.getClass().getSimpleName();
    }
}
