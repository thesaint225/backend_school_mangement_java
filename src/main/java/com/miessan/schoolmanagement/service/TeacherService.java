package com.miessan.schoolmanagement.service;

import com.miessan.schoolmanagement.dto.TeacherRegistrationDto;
import com.miessan.schoolmanagement.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {
//    two responsibilities that are
//    Register teacher
//   return all  teachers

    private final  List<Teacher> teachers = new ArrayList<>();




//Register Teacher
public Teacher registerTeacher(TeacherRegistrationDto dto){

    Teacher teacher = new Teacher();
    teacher.setFirstName(dto.getFirstname());
    teacher.setLastName(dto.getLastName());
    teacher.setGender(dto.getGender());
    teacher.setDateOfBirth(dto.getDateOfBirth());

    teachers.add(teacher);

    return teacher;

}


//return all teachers
public List<Teacher> findAll(){
    return  teachers;

    }
}
