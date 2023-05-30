package com.test.vacancies.models.dto.read;

import com.test.vacancies.models.dto.update.ContactInfoDTO;
import com.test.vacancies.models.dto.update.IndustryUpdateReadDTO;
import com.test.vacancies.models.dto.update.SalaryUpdateReadDTO;
import com.test.vacancies.models.dto.update.SpecialtyUpdateReadDTO;
import com.test.vacancies.models.dto.update.WorkExperienceUpdateReadDTO;
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
//	
//	private WorkExperienceUpdateReadDTO workExperience;
//	
//	private SalaryUpdateReadDTO salary;
//	
//	private SpecialtyUpdateReadDTO specialty;
}
