package com.example.cvproject.DummyLogger.DummyLogger2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DummyLoggerSecond implements DummyLogger2{
    @Override
    public void sayHi() {
    log.info(getClass().getName());
    }
}
