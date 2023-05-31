package com.test.vacancies.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.test.vacancies.models.dto.update.WorkScheduleDTO;
import com.test.vacancies.models.entities.WorkSchedule;

@Mapper(componentModel = "spring")
public abstract class WorkScheduleEntityToReadDTO implements IMapper<WorkSchedule, WorkScheduleDTO>{

    @Mapping(target = "vacancyId", expression = "java(object.getVacancy() != null ? "
    		+ "object.getVacancy().getId() "
    		+ ": null)")
	@Override
	public abstract WorkScheduleDTO map(WorkSchedule object);
}
