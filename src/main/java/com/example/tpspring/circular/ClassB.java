package com.example.tpspring.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassB {

    private final ClassA classA;

    @Autowired
    public ClassB(ClassA classA) {
        this.classA = classA;
    }

    public String hello() {
        return "ClassB dit bonjour depuis " + this.getClass().getSimpleName();
    }
}
