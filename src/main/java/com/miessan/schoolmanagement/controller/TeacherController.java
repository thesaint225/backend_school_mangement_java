package com.miessan.schoolmanagement.controller;

import com.miessan.schoolmanagement.dto.TeacherRegistrationDto;
import com.miessan.schoolmanagement.model.Teacher;
import com.miessan.schoolmanagement.service.TeacherService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/teachers")
public class TeacherController {
    private  final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping
    public Teacher createTeacher( @Valid @RequestBody TeacherRegistrationDto dto) {

        return  teacherService.registerTeacher(dto);

    }

    @GetMapping
    public List<Teacher> findAllTeacher(Teacher teacher){
        return teacherService.findAll();
    }


}
