package com.pm.patientservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class PatientRequestDTO {

    @NotBlank(message = "Name is mandatory") @Size( max = 100, message = "Name should be less than 100 characters")
    private String name;
    @NotBlank(message = "Email is mandatory")
    private String email;
    @NotBlank(message = "Address is mandatory")
    private String address;
    @NotNull(message = "Date of birth is mandatory")
    private String dateOfBirth;
    @NotNull(message = "Registered date is mandatory")
    private Date registeredDate;

    public @NotBlank(message = "Address is mandatory") String getAddress() {
        return address;
    }

    public void setAddress(@NotBlank(message = "Address is mandatory") String address) {
        this.address = address;
    }

    public @NotBlank(message = "Name is mandatory") @Size(max = 100, message = "Name should be less than 100 characters") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name is mandatory") @Size(max = 100, message = "Name should be less than 100 characters") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Email is mandatory") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is mandatory") String email) {
        this.email = email;
    }

    public @NotNull(message = "Date of birth is mandatory") String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(@NotNull(message = "Date of birth is mandatory") String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


}
