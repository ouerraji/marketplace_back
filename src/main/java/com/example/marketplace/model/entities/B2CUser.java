package com.example.marketplace.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "b2c_users")
public class B2CUser extends User {
    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;
}
