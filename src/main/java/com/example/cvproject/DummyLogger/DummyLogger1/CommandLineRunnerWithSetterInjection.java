package com.example.cvproject.DummyLogger.DummyLogger1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithSetterInjection implements CommandLineRunner {

    private DummyLogger1 dummyLogger;

    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }

    @Autowired
    public void setDummyLogger(DummyLogger1 dummyLogger) {
        this.dummyLogger = dummyLogger;
    }
}
