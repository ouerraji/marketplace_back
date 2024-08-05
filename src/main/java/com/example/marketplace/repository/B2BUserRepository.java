package com.example.marketplace.repository;

import com.example.marketplace.model.entities.B2BUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface B2BUserRepository extends JpaRepository<B2BUser,Long> {
}
