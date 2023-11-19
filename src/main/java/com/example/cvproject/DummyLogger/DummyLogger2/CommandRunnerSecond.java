package com.example.cvproject.DummyLogger.DummyLogger2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandRunnerSecond implements CommandLineRunner {

    private final DummyLogger2 dummyLogger2;

    public CommandRunnerSecond(@Qualifier("dummyLoggerSecond") DummyLogger2 dummyLogger2) {
        this.dummyLogger2 = dummyLogger2;
    }

    @Override
    public void run(String... args) throws Exception {
    dummyLogger2.sayHi();
    }
}
