package com.example.studentmanagerment.repository;

import com.example.studentmanagerment.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
}
