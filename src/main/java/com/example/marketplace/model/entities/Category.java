package com.example.marketplace.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;
@Data
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "category")
    private Set<Product> products;
}
