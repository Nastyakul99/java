package com.test.vacancies.models.dto.update;

import com.test.vacancies.models.entities.Schedule;
import lombok.Data;

@Data
public class WorkScheduleDTO {

    private Integer id;

    private Schedule name;
    
    private Integer vacancyId;
}
