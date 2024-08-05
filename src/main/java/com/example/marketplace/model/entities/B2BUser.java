package com.example.marketplace.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "b2b_users")
public class B2BUser extends User {
    private String companyName;
    private String businessType;
    private String companyAddress;
    private String companyCity;
    private String companyState;
    private String companyZipCode;
    private String companyCountry;
    private String companyPhoneNumber;
    private String vatNumber; // Tax identification number
    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;
}
