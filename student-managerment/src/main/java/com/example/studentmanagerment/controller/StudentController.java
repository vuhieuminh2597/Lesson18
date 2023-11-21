package com.example.studentmanagerment.controller;

import com.example.studentmanagerment.domain.Student;
import com.example.studentmanagerment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
/**
 * @RestController là sự kết hợp của @Controller + @ResponseBody
 * @Controller: Đánh dấu một class là tầng
 * Controller, chịu trách nhiệm xử lý các yêu cầu từ
 * người dùng hoặc các yêu cầu gửi đến từ bên ngoài hệ
 * thống.
 * @ResponseBody sẽ định hướng để tất cả các method trong class sẽ trả về định dạng json
 */
@RequestMapping(path = "/api/v1/student")
/**
 * @RequestMapping được sử dụng để ánh xạ yêu cầu với phương thức xử lý request
 */
public class StudentController {
    private final StudentService studentService;

    /**
     * @Autowired khi đánh dấu bằng annotation này trước một attribute,phương thức,tham số
     * spring boot sẽ tự động inject một instance của dependency tương ứng vào thuộc tính đó
     * => spring boot sẽ giúp ta quản lý chúng
     */
    public StudentController(@Autowired StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("")
    public List<String> test(){
        return List.of("A","B","C");
    }
}
