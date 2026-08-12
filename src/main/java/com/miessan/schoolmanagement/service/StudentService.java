package com.miessan.schoolmanagement.service;


import com.miessan.schoolmanagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private  final List<Student> students = new ArrayList<>();


//    register students
    public Student registerStudent(Student student){

        return student;


        }

        public  List<Student> findAll(){

        return  students;


    }
}
