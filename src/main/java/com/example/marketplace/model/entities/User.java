package com.example.marketplace.model.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;
    private String fullName;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String companyName;
    private String businessType;
    private String companyAddress;
    private String companyCity;
    private String companyState;
    private String companyZipCode;
    private String companyCountry;
    private String companyPhoneNumber;
    private String vatNumber; // Tax identification number

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private UserType userType;

    @Enumerated(EnumType.STRING)
    private Role role;

}



