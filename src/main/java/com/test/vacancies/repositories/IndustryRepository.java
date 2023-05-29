package com.test.vacancies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.vacancies.models.entities.Industry;

public interface IndustryRepository extends JpaRepository<Industry, Integer>{

}
