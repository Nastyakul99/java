package com.test.vacancies.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.vacancies.models.dto.update.SpecialtyUpdateReadDTO;
import com.test.vacancies.models.entities.Specialty;
import com.test.vacancies.services.SpecialtyService;

@RestController()
@RequestMapping("specialty")
public class SpecialtyController extends ACrudController<SpecialtyService,
														Specialty,
														SpecialtyUpdateReadDTO,
														SpecialtyUpdateReadDTO,
														Integer>{

	public SpecialtyController(SpecialtyService service) {
		super(service);
	}
}
