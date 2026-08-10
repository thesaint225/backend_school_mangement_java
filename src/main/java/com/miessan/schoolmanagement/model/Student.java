package com.miessan.schoolmanagement.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String studentNumber;
    @NotBlank(message = "First name is required ")
    private String firstName;
    @NotBlank(message="Last name is required")
    private String lastName;
    @Past
    private LocalDate dateOfBirth;
    private Gender gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
