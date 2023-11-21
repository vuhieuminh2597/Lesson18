package com.example.studentmanagerment.service;

import com.example.studentmanagerment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Service Đánh dấu một Class là tầng Service, phục vụ các xử lý các vấn đề logic và xử lý các yêu cầu từ tầng
 * Controller.
 */
@Service
public class StudentService {
    private StudentRepository studentRepository;

    /**
     * @Autowired khi đánh dấu bằng annotation này trước một attribute,phương thức,tham số
     * spring boot sẽ tự động inject một instance của dependency tương ứng vào thuộc tính đó
     */
    public StudentService(@Autowired StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
