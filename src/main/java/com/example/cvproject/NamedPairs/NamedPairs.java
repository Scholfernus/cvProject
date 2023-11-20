package com.example.cvproject.NamedPairs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NamedPairs {
    private String name;
    Map<String, String> bestPairs;
}
