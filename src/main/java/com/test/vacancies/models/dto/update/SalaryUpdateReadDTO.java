package com.test.vacancies.models.dto.update;

import com.test.vacancies.models.dto.read.IDTORead;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SalaryUpdateReadDTO implements IDTOUpdate, IDTORead{
	private Float minSalary;
	private Float maxSalary;
}
