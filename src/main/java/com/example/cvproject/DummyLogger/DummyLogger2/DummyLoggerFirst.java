package com.example.cvproject.DummyLogger.DummyLogger2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Slf4j
public class DummyLoggerFirst implements DummyLogger2 {

    @Override
    public void sayHi() {
        log.info(getClass().getName());
    }
}
