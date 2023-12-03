package com.example.cvproject.zdjavapol141web.zad8sda.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Random;

@Component
@RequestScope
public class RandomBooleanProvider {
    private final boolean value = new Random().nextBoolean();

    public boolean getValue() {
        return value;
    }
}
