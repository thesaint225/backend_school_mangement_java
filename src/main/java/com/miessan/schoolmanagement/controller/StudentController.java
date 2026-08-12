package com.miessan.schoolmanagement.controller;


import com.miessan.schoolmanagement.model.Student;
import com.miessan.schoolmanagement.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private  final StudentService studentservice;

    public StudentController(StudentService studentservice) {
        this.studentservice = studentservice;
    }

    @PostMapping
    public Student createStudent(@Valid @RequestBody Student student){
        return studentservice.registerStudent(student);

    }

    @GetMapping
    public List<Student> findAllStudent(){
        return  studentservice.findAll();
    }

}
