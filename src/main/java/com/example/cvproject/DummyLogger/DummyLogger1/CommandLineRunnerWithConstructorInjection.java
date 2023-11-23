package com.example.cvproject.DummyLogger.DummyLogger1;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommandLineRunnerWithConstructorInjection implements CommandLineRunner {
    private final DummyLogger1 logger;
    @Override
    public void run(String... args) throws Exception {
     logger.sayHello();
    }
}
