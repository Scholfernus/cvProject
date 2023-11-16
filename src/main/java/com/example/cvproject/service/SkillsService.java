package com.example.cvproject.service;

import com.example.cvproject.model.SkillsModel;
import com.example.cvproject.repository.SkillsRepository;
import org.springframework.stereotype.Service;

@Service
public class SkillsService {
    private final SkillsRepository skillsRepository;

    public SkillsService(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }

    public void addSkillToList(SkillsModel model) {
        skillsRepository.save(model);
    }

    public void deleteById(Long id) {
    skillsRepository.deleteById(id);
    }

    public void editSkillById(SkillsModel model, Long id) {
        model.setId(id);
        skillsRepository.save(model);
    }

    public void getAddSkill() {
        skillsRepository.findAll();
    }
}
