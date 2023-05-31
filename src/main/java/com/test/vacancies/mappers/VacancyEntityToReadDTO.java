package com.test.vacancies.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.test.vacancies.models.dto.read.VacancyReadDTO;
import com.test.vacancies.models.entities.Vacancy;
import lombok.Setter;

@Mapper(componentModel = "spring", uses=WorkScheduleEntityToReadDTO.class)
public abstract class VacancyEntityToReadDTO implements IMapper<Vacancy, VacancyReadDTO>{
	
	@Autowired
	@Setter
	protected CompanyEntityToReadDTO companyEntityToReadDTO;

    @Mapping(target = "company", expression = "java(object.getCompany() != null ? "
    		+ "companyEntityToReadDTO.map(object.getCompany()) "
    		+ ": null)")
	@Override
	public abstract VacancyReadDTO map(Vacancy object);
}
