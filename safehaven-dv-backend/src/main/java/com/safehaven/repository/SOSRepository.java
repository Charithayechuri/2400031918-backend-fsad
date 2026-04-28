package com.safehaven.repository;

import com.safehaven.model.SOS;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SOSRepository extends JpaRepository<SOS, Long> {
}