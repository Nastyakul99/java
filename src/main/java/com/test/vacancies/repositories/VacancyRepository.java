package com.test.vacancies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.vacancies.models.entities.Vacancy;

public interface VacancyRepository extends JpaRepository<Vacancy, Integer>{

}
