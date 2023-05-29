package com.test.vacancies.mappers;

import org.springframework.stereotype.Component;

import com.test.vacancies.models.dto.update.IndustryUpdateReadDTO;
import com.test.vacancies.models.entities.Industry;

@Component
public class IndutryEntityToReadDTO implements IMapper<Industry, IndustryUpdateReadDTO>{

	@Override
	public IndustryUpdateReadDTO map(Industry object) {
		IndustryUpdateReadDTO dto = new IndustryUpdateReadDTO();
		return map(object, dto);
	}

	@Override
	public IndustryUpdateReadDTO map(Industry from, IndustryUpdateReadDTO to) {
		to.setName(from.getName());
		Industry parent = from.getParent();
		if(parent != null) {
			to.setParentId(parent.getId());
		}
		return to;
	}

}
