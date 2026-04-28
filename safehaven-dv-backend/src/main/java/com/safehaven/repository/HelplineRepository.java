package com.safehaven.repository;

import com.safehaven.model.Helpline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelplineRepository extends JpaRepository<Helpline, Long> {
}