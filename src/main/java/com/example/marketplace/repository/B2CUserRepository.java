package com.example.marketplace.repository;

import com.example.marketplace.model.entities.B2CUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface B2CUserRepository extends JpaRepository<B2CUser,Long> {
}
