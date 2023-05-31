package com.test.vacancies.models.dto.update;

import java.util.ArrayList;
import java.util.List;

import com.test.vacancies.models.entities.Company;
import com.test.vacancies.models.entities.Salary;
import com.test.vacancies.models.entities.WorkExperience;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VacancyUpdateDTO implements IDTOUpdate{

	private String name;
	
	private Integer companyId;
	
	private String description;
	
	private WorkExperienceUpdateReadDTO workExperience;
	
	private SalaryUpdateReadDTO salary;
	
	List<WorkScheduleDTO> workSchedule = new ArrayList<>();
//	
//	private SpecialtyUpdateReadDTO specialty;
}
