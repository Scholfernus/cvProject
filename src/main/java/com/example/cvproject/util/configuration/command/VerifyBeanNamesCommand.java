package com.example.cvproject.util.configuration.command;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Component
@Slf4j
@RequiredArgsConstructor
public class VerifyBeanNamesCommand implements CommandLineRunner {
    private final ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        final Set<String> correctNames = Set.of("dummyLogger", "listUtility", "stringUtility");
        log.info("Zadanie rozwiązane poprawnie? {}", new HashSet<>(Arrays.asList(applicationContext.getBeanDefinitionNames()))
                .containsAll(correctNames));
    }
}
