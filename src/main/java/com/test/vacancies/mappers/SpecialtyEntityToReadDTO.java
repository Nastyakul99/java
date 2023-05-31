package com.test.vacancies.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.test.vacancies.models.dto.update.SpecialtyUpdateReadDTO;
import com.test.vacancies.models.entities.Specialty;

@Mapper(componentModel = "spring")
public abstract class SpecialtyEntityToReadDTO implements IMapper<Specialty, SpecialtyUpdateReadDTO>{


    @Mapping(target = "parentId", expression = "java(object.getParent()!= null "
    		+ "? object.getParent().getId() "
    		+ ": null)")
	@Override
	public abstract SpecialtyUpdateReadDTO map(Specialty object);
}
