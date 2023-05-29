package com.test.vacancies.services;

import org.springframework.stereotype.Service;
import com.test.vacancies.mappers.CompanyEntityToReadDTO;
import com.test.vacancies.mappers.CompanyUpdateToEntity;
import com.test.vacancies.models.dto.read.CompanyReadDTO;
import com.test.vacancies.models.dto.update.CompanyUpdateDTO;
import com.test.vacancies.models.entities.Company;
import com.test.vacancies.repositories.CompanyRepository;


@Service
public class CompanyService extends ACrudService<Company,
												CompanyUpdateDTO,
												CompanyReadDTO,
												Integer>{
	
	public CompanyService(CompanyUpdateToEntity companyUpdateToEntity,
						  CompanyRepository companyRepository,
						  CompanyEntityToReadDTO companyEntityToReadDTO) {
		super(companyUpdateToEntity, companyEntityToReadDTO, companyRepository);
	}
}
