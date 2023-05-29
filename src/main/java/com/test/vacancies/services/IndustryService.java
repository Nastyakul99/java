package com.test.vacancies.services;

import org.springframework.stereotype.Service;
import com.test.vacancies.mappers.IndustryUpdateToEntity;
import com.test.vacancies.mappers.IndutryEntityToReadDTO;
import com.test.vacancies.models.dto.update.IndustryUpdateReadDTO;
import com.test.vacancies.models.entities.Industry;
import com.test.vacancies.repositories.IndustryRepository;

@Service
public class IndustryService extends ACrudService<Industry,
												IndustryUpdateReadDTO,
												IndustryUpdateReadDTO,
												Integer>{
	
	public IndustryService(IndustryRepository industryRepository,
							IndustryUpdateToEntity industryUpdateToEntity,
							IndutryEntityToReadDTO indutryEntityToReadDTO) {
		super(industryUpdateToEntity, indutryEntityToReadDTO, industryRepository);
	}
}
