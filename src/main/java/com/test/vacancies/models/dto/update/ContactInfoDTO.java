package com.test.vacancies.models.dto.update;

import com.test.vacancies.models.dto.read.IDTORead;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ContactInfoDTO implements IDTOUpdate, IDTORead{
	private String telephone;
	
	private String email;
}
