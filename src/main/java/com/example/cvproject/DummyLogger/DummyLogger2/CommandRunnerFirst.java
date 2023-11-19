package com.example.cvproject.DummyLogger.DummyLogger2;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommandRunnerFirst implements CommandLineRunner {

   private final DummyLogger2 dummyLogger2;
    @Override
    public void run(String... args) throws Exception {
    dummyLogger2.sayHi();
    }
}
