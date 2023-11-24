package com.example.cvproject.zdjavapol141_22_07_2023.command;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Order(3)
@Component
public class PrintConstructorInjectionCommand implements CommandLineRunner {
    private String someProperty;

    public PrintConstructorInjectionCommand(@Value("#{{key1: '1', key2: '2', key3: '3'}.key1}") String someProperty) {
        this.someProperty = someProperty;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("{} {}",getClass(),someProperty);
    }
}
