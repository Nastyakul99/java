package com.test.vacancies.models.dto.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CompanyUpdateDTO implements IDTOUpdate{
	private String name;
	
	private Integer industryId;
	
	private ContactInfoDTO contactInfo;
}
