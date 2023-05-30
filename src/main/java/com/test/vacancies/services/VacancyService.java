package com.test.vacancies.services;

import org.springframework.stereotype.Service;

import com.test.vacancies.mappers.IndustryUpdateToEntity;
import com.test.vacancies.mappers.IndutryEntityToReadDTO;
import com.test.vacancies.mappers.VacancyEntityToReadDTO;
import com.test.vacancies.mappers.VacancyUpdateToEntity;
import com.test.vacancies.models.dto.read.VacancyReadDTO;
import com.test.vacancies.models.dto.update.IndustryUpdateReadDTO;
import com.test.vacancies.models.dto.update.VacancyUpdateDTO;
import com.test.vacancies.models.entities.Industry;
import com.test.vacancies.models.entities.Vacancy;
import com.test.vacancies.repositories.IndustryRepository;
import com.test.vacancies.repositories.VacancyRepository;

@Service
public class VacancyService extends ACrudService<Vacancy,
												VacancyUpdateDTO,
												VacancyReadDTO,
												Integer>{
	
	public VacancyService(VacancyRepository vacancyRepository,
							VacancyUpdateToEntity vacancyUpdateToEntity,
							VacancyEntityToReadDTO vacancyEntityToReadDTO) {
			super(vacancyUpdateToEntity, vacancyEntityToReadDTO, vacancyRepository);
	}

}
