package com.example.cvproject.DummyLogger.DummyLogger2;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class CommandRunnerThird implements CommandLineRunner {

    private final Set<DummyLogger2> dummyLogger2Set;
    @Override
    public void run(String... args) throws Exception {
    dummyLogger2Set.forEach(DummyLogger2::sayHi);
    }
}
