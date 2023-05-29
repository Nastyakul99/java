package com.test.vacancies.mappers;

import org.springframework.stereotype.Component;
import com.test.vacancies.models.dto.update.IndustryUpdateReadDTO;
import com.test.vacancies.models.entities.Industry;
import com.test.vacancies.repositories.IndustryRepository;

@Component
public class IndustryUpdateToEntity implements IMapper<IndustryUpdateReadDTO, Industry>{
	
	private final IndustryRepository industryRepository;
	
	public IndustryUpdateToEntity(IndustryRepository industryRepository) {
		this.industryRepository = industryRepository;
	}

	@Override
	public Industry map(IndustryUpdateReadDTO object) {
		Industry industry = new Industry();
		return map(object, industry);
	}

	@Override
	public Industry map(IndustryUpdateReadDTO from, Industry to) {
		to.setName(from.getName());
		to.setParent(getParent(from.getParentId()));
		return to;
	}
	
	private Industry getParent(Integer id) {
		if(id==null) return null;
		return industryRepository.findById(id).orElse(null);
	}

}
