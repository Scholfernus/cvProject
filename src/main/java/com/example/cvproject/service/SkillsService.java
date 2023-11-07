package com.example.cvproject.service;

import com.example.cvproject.repository.SkillsRepository;

public class SkillsService {
    private final SkillsRepository skillsRepository;

    public SkillsService(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }

}
