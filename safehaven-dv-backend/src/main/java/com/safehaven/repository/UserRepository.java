package com.safehaven.repository;

import com.safehaven.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // ✅ For login
    User findByEmail(String email);
}