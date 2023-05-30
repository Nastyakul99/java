package com.test.vacancies.models.dto.read;

import com.test.vacancies.models.dto.update.ContactInfoDTO;
import com.test.vacancies.models.dto.update.IndustryUpdateReadDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CompanyReadDTO implements IDTORead{
	
	private String name;
	
	private IndustryUpdateReadDTO industry;
	
	private ContactInfoDTO contactInfo;
}
