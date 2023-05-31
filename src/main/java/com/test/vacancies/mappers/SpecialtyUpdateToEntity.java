package com.test.vacancies.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.test.vacancies.models.dto.update.SpecialtyUpdateReadDTO;
import com.test.vacancies.models.entities.Specialty;
import com.test.vacancies.repositories.SpecialtyRepository;
import lombok.Setter;

@Mapper(componentModel = "spring")
public abstract class SpecialtyUpdateToEntity implements IMapper<SpecialtyUpdateReadDTO, Specialty>{

	@Autowired
	@Setter
	protected SpecialtyRepository specialtyRepository;

    @Mapping(target = "parent", expression = "java(object.getParentId()!= null "
    		+ "? specialtyRepository.findById(object.getParentId()).orElse(null) "
    		+ ": null)")
	@Override
	public abstract Specialty map(SpecialtyUpdateReadDTO object);
}
