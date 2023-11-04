package com.example.cvproject.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ExperienceDto {

    private Long id;
    private String title;
    private String subtitle;
    private String description;
    private LocalDateTime start;
    private LocalDateTime end;
}
