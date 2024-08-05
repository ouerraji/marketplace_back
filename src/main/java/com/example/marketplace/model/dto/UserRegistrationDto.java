package com.example.marketplace.model.dto;
import com.example.marketplace.model.entities.UserType;

import lombok.Data;

@Data
public class UserRegistrationDto {
    private String username;
    private String email;
    private String password;
    private String confirmPassword;
    private String fullName;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private UserType userType; // B2B or B2C

    // Fields specific to B2B
    private String companyName;
    private String businessType;
    private String companyAddress;
    private String companyCity;
    private String companyState;
    private String companyZipCode;
    private String companyCountry;
    private String companyPhoneNumber;
    private String vatNumber; // Tax identification number
}
