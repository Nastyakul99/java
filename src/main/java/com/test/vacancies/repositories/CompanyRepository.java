package com.test.vacancies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.vacancies.models.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
