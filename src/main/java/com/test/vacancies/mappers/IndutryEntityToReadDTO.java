package com.test.vacancies.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.test.vacancies.models.dto.update.IndustryUpdateReadDTO;
import com.test.vacancies.models.entities.Industry;

@Mapper(componentModel = "spring")
public abstract class IndutryEntityToReadDTO implements IMapper<Industry, IndustryUpdateReadDTO>{

    @Mapping(target = "parentId", expression = "java(object.getParent()!= null "
    		+ "? object.getParent().getId() "
    		+ ": null)")
	@Override
	public abstract IndustryUpdateReadDTO map(Industry object);

}
