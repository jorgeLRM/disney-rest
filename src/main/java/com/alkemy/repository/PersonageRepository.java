package com.alkemy.repository;

import com.alkemy.domain.Personage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonageRepository extends JpaRepository<Personage, Integer> {
}
