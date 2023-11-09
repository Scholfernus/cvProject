package com.example.cvproject.service;

import com.example.cvproject.model.SkillsModel;
import com.example.cvproject.repository.SkillsRepository;

public class SkillsService {
    private final SkillsRepository skillsRepository;

    public SkillsService(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }

    public void addSkillToList(SkillsModel model) {
        skillsRepository.save(model);
    }
}
