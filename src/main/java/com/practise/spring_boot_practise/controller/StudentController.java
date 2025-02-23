package com.practise.spring_boot_practise.controller;

import com.practise.spring_boot_practise.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

//    Spring boot REST API with Path Variable
//    {id} - URI template variable
//    http://localhost:8080/students/1/vaibhav/dharmik
    @GetMapping("students/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(@PathVariable("id")int studentId,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("last-name") String lastName){
        return new Student(studentId,firstName,lastName);
    }

//   Spring boot REST API with Request Param
//    http://localhost:8080/students/query?id=1&firstName=Vaibhav&lastName=Dharmik

    @GetMapping("students/query")
    public Student studentRequestVariable(@RequestParam int id,
                                          @RequestParam String firstName,
                                          @RequestParam String lastName){
        return new Student(id,firstName,lastName);
    }


}