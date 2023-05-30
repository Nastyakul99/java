package com.test.vacancies.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.test.vacancies.models.dto.update.CompanyUpdateDTO;
import com.test.vacancies.models.entities.Company;
import com.test.vacancies.repositories.IndustryRepository;

import lombok.Setter;

@Mapper(componentModel = "spring")
public abstract class CompanyUpdateToEntity implements IMapper<CompanyUpdateDTO, Company>{
	
	@Autowired
	@Setter
	protected IndustryRepository industryRepository;

    @Mapping(target = "industry", expression = "java(object.getIndustryId()!= null "
    		+ "? industryRepository.findById(object.getIndustryId()).orElse(null) "
    		+ ": null)")
	@Override
	public abstract Company map(CompanyUpdateDTO object);

}
