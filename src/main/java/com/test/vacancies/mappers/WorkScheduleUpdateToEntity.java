package com.test.vacancies.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.test.vacancies.models.dto.update.WorkScheduleDTO;
import com.test.vacancies.models.entities.WorkSchedule;
import com.test.vacancies.repositories.VacancyRepository;
import lombok.Setter;

@Mapper(componentModel = "spring")
public abstract class WorkScheduleUpdateToEntity implements IMapper<WorkScheduleDTO, WorkSchedule>{

	@Autowired
	@Setter
	protected VacancyRepository vacancyRepository;

    @Mapping(target = "vacancy", expression = "java(object.getVacancyId()!= null "
    		+ "? vacancyRepository.findById(object.getVacancyId()).orElse(null) "
    		+ ": null)")
	@Override
	public abstract WorkSchedule map(WorkScheduleDTO object);
}
