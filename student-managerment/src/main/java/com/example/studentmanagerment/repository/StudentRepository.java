package com.example.studentmanagerment.repository;

import com.example.studentmanagerment.model.StudentDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentRepository {
    List<StudentDTO> findAll();
}
