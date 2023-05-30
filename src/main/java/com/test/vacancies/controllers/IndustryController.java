package com.test.vacancies.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.vacancies.models.dto.update.IndustryUpdateReadDTO;
import com.test.vacancies.models.entities.Industry;
import com.test.vacancies.services.IndustryService;

@RestController()
@RequestMapping("industry")
public class IndustryController extends ACrudController<IndustryService,
														Industry,
														IndustryUpdateReadDTO,
														IndustryUpdateReadDTO,
														Integer>{

	public IndustryController(IndustryService service) {
		super(service);
	}


}
