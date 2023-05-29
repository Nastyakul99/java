package com.test.vacancies.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.vacancies.models.dto.read.CompanyReadDTO;
import com.test.vacancies.models.dto.update.CompanyUpdateDTO;
import com.test.vacancies.models.entities.Company;
import com.test.vacancies.services.CompanyService;

@RestController()
@RequestMapping("company")
public class CompanyController extends ACrudController<CompanyService,
														Company,
														CompanyUpdateDTO,
														CompanyReadDTO,
														Integer> {

	public CompanyController(CompanyService service) {
		super(service);
	}

}
