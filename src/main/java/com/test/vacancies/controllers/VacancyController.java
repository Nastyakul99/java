package com.test.vacancies.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.vacancies.models.dto.read.VacancyReadDTO;
import com.test.vacancies.models.dto.update.VacancyUpdateDTO;
import com.test.vacancies.models.entities.Vacancy;
import com.test.vacancies.services.VacancyService;

@RestController()
@RequestMapping("vacancy")
public class VacancyController extends ACrudController<VacancyService,
														Vacancy,
														VacancyUpdateDTO,
														VacancyReadDTO,
														Integer>{

	public VacancyController(VacancyService service) {
		super(service);
	}

}
