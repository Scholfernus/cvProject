package com.example.cvproject.zdjavapol141_22_07_2023.command;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Order(2)
@Component
public class PrintValueCommand implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

    }
    @Value("#{systemProperties['priority]}")
    private String spellValue;

    @Value("#{numbers.number}")
    private Integer someBeanValue;
}
