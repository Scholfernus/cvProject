package com.example.cvproject.homeworkshapeSDA.command;

import com.example.cvproject.homeworkshapeSDA.service.CalculateAreaService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RunCalculateCommand implements CommandLineRunner {
    private final CalculateAreaService calculateAreaService;

    @Override
    public void run(String... args) throws Exception {

    }
}
