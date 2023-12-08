package com.example.cvproject.zdjavapol141web.zad9sda.repository;

import com.example.cvproject.zdjavapol141web.zad9sda.FileData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FileDataRepository extends JpaRepository<FileData, UUID> {
}
