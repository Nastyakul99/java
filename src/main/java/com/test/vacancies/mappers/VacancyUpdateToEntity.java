package com.test.vacancies.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.test.vacancies.models.dto.update.VacancyUpdateDTO;
import com.test.vacancies.models.entities.Vacancy;
import com.test.vacancies.repositories.CompanyRepository;
import lombok.Setter;

@Mapper(componentModel = "spring")
public abstract class VacancyUpdateToEntity implements IMapper<VacancyUpdateDTO, Vacancy>{

	@Autowired
	@Setter
	protected CompanyRepository companyRepository;
	
    @Mapping(target = "company", expression = "java(object.getCompanyId()!= null "
    		+ " ? companyRepository.findById(object.getCompanyId()).orElse(null) "
    		+ " : null)")
	@Override
	public abstract Vacancy map(VacancyUpdateDTO object);
}
