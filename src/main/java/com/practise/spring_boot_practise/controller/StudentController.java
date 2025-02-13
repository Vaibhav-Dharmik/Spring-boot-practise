package com.practise.spring_boot_practise.controller;

import com.practise.spring_boot_practise.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

//    http://localhost:8080/student
    @GetMapping("student")
    public Student getStudent(){
        Student student =new Student(
                1,
                "Vaibhav",
                "Dharmik"
        );
    return student;
    }
}