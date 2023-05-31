package com.test.vacancies.services;

import org.springframework.stereotype.Service;
import com.test.vacancies.mappers.SpecialtyEntityToReadDTO;
import com.test.vacancies.mappers.SpecialtyUpdateToEntity;
import com.test.vacancies.models.dto.update.SpecialtyUpdateReadDTO;
import com.test.vacancies.models.entities.Specialty;
import com.test.vacancies.repositories.SpecialtyRepository;

@Service
public class SpecialtyService extends ACrudService<Specialty,
													SpecialtyUpdateReadDTO,
													SpecialtyUpdateReadDTO,
													Integer>{

	public SpecialtyService(SpecialtyRepository specialtyRepository,
							SpecialtyUpdateToEntity specialtyUpdateToEntity,
							SpecialtyEntityToReadDTO specialtyEntityToReadDTO) {
		super(specialtyUpdateToEntity, specialtyEntityToReadDTO, specialtyRepository);
	}
}
