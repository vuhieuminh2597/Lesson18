package com.example.studentmanagerment.controller;

import com.example.studentmanagerment.model.Student;
import com.example.studentmanagerment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentController {
    private StudentService service;

    public StudentController(@Autowired StudentService service) {
        this.service = service;
    }

    @GetMapping("")
    public List<Student> getAllStudent(){
        return null;
    }
}
