package com.test.vacancies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.vacancies.models.entities.Specialty;

public interface SpecialtyRepository extends JpaRepository<Specialty, Integer> {

}
