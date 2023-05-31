package com.test.vacancies.models.dto.read;

import java.util.ArrayList;
import java.util.List;
import com.test.vacancies.models.dto.update.SalaryUpdateReadDTO;
import com.test.vacancies.models.dto.update.WorkExperienceUpdateReadDTO;
import com.test.vacancies.models.dto.update.WorkScheduleDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class VacancyReadDTO implements IDTORead{
	
	private String name;
	
	private CompanyReadDTO company;
	
	private String description;
	
	private WorkExperienceUpdateReadDTO workExperience;
	
	private SalaryUpdateReadDTO salary;
	
	List<WorkScheduleDTO> workSchedule = new ArrayList<>();
//	
//	private SpecialtyUpdateReadDTO specialty;
}
