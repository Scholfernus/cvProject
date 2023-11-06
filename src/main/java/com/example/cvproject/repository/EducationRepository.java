package com.example.cvproject.repository;

import com.example.cvproject.model.EducationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<EducationModel,Long> {
}