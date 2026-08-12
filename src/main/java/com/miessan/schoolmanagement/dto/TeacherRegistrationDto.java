package com.miessan.schoolmanagement.dto;

import com.miessan.schoolmanagement.model.Gender;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public class TeacherRegistrationDto {

    @NotBlank
    private String firstname;
    @NotBlank
    private String lastName;

    @NotNull
    @Past
    private LocalDate dateOfBirth;
    @NotNull
    private Gender gender;

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFirstname() {
        return firstname;
    }

    public Gender getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }
}


