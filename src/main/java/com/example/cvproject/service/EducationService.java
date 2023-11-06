package com.example.cvproject.service;

import com.example.cvproject.model.EducationModel;
import com.example.cvproject.repository.EducationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {
private final EducationRepository educationRepository;

    public EducationService(EducationRepository educationRepository){
        this.educationRepository = educationRepository;
    }

    public List<EducationModel> getAllEducationList() {
        List<EducationModel> educationList;
        return educationRepository.findAll();
    }

    public void addNewEducation(EducationModel id) {
        educationRepository.save(id);
    }

    public void deleteById(Long id) {
        educationRepository.deleteById(id);
    }

    public void editEducationById(Long id, EducationModel model) {
        model.setId(id);
        educationRepository.save(model);
    }
}
