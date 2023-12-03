package com.example.cvproject.zdjavapol141web.zad8sda.controller;

import com.example.cvproject.zdjavapol141web.zad8sda.model.BeanInfo;
import com.example.cvproject.zdjavapol141web.zad8sda.model.RandomBooleanProvider;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class RandomController {
    private final RandomBooleanProvider booleanProvider;

    @GetMapping("/api/random-boolean")
    public BeanInfo getRandomValue() {
        return BeanInfo.builder()
                .address(booleanProvider.toString())
                .trueOrFalse(booleanProvider.getValue())
                .build();
    }
}
