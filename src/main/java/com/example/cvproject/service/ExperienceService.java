package com.example.cvproject.service;

import com.example.cvproject.model.ExperienceModel;
import com.example.cvproject.repository.ExperienceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienceService {
    private final ExperienceRepository expRepository;

    public ExperienceService(ExperienceRepository expRepository) {
        this.expRepository = expRepository;
    }

    public List<ExperienceModel> getExperienceList() {
        return expRepository.findAll();
    }

    public void addNewExperience(ExperienceModel experience) {
        expRepository.save(experience);
    }

    public void deleteById(Long id) {
        expRepository.deleteById(id);
    }

    public void saveEditExperience(Long id, ExperienceModel model) {
        model.setId(id);
        expRepository.save(model);
    }

    public Optional<ExperienceModel> getExperienceById(Long id) {
       return expRepository.findById(id);
    }

}
