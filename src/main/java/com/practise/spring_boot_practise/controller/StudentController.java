package com.practise.spring_boot_practise.controller;

import com.practise.spring_boot_practise.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    //    http://localhost:8080/students
    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Vaibhav","Dharmik"));
        students.add(new Student(2,"Umesh","temp"));
        students.add(new Student(3,"Ram","temp2"));
        students.add(new Student(4,"Sanjay","temp3"));
        return students;
    }
}