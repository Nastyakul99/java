package com.test.vacancies.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.test.vacancies.models.dto.update.IndustryUpdateReadDTO;
import com.test.vacancies.models.entities.Industry;
import com.test.vacancies.repositories.IndustryRepository;
import lombok.Setter;

@Mapper(componentModel = "spring")
public abstract class IndustryUpdateToEntity implements IMapper<IndustryUpdateReadDTO, Industry>{
	
	@Autowired
	@Setter
	protected IndustryRepository industryRepository;

    @Mapping(target = "parent", expression = "java(object.getParentId()!= null "
    		+ "? industryRepository.findById(object.getParentId()).orElse(null) "
    		+ ": null)")
	@Override
	public abstract Industry map(IndustryUpdateReadDTO object);

}
