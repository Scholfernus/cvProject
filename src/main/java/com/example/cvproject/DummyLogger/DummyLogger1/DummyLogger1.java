package com.example.cvproject.DummyLogger.DummyLogger1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DummyLogger1 {
    public void sayHello() {
    log.info("Hello Everyone");
    }
}
