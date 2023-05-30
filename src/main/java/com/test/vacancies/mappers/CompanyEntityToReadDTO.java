package com.test.vacancies.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.test.vacancies.models.dto.read.CompanyReadDTO;
import com.test.vacancies.models.entities.Company;
import lombok.Setter;

@Mapper(componentModel = "spring")
public abstract class CompanyEntityToReadDTO implements IMapper<Company, CompanyReadDTO>{
	
	@Autowired
	@Setter
	protected IndutryEntityToReadDTO indutryEntityToReadDTO;

    @Mapping(target = "industry", expression = "java(object.getIndustry() != null ? "
									    		+ "indutryEntityToReadDTO.map(object.getIndustry()) "
									    		+ ": null)")
	@Override
	public abstract CompanyReadDTO map(Company object);

}
