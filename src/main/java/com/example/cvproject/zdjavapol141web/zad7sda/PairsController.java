package com.example.cvproject.zdjavapol141web.zad7sda;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api")
public class PairsController {
    @GetMapping("/pairs/{name}")
    public NamedPairs getName(@PathVariable("name") String name) {
        log.info(name);
        return NamedPairs
                .builder()
                .firstName(name)
                .twoPairs(Map.of("1","test1"))
                .build();
    }

    @GetMapping("/name/{name}")
    public String getPairsName(@PathVariable("name") String name) {
        return name;
    }
}