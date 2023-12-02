package com.example.cvproject.zdjavapol141web.zad7sda;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class NamedPairs {
    private String name;
    private Map<String, String> pairs;
}
