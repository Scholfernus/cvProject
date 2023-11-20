package com.example.cvproject.NamedPairs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class PairController {
    @GetMapping("/api/pairs/{firstName}")
    public NamedPairs getPairs(@PathVariable("firstName") String name){
        log.info(name);
        return NamedPairs
                .builder()
                .name(name)
                .bestPairs(Map.of("test","test2"))
                 .build();
    }
}
