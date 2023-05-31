package com.test.vacancies.models.dto.update;

import java.time.Duration;
import com.test.vacancies.models.dto.read.IDTORead;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WorkExperienceUpdateReadDTO implements IDTOUpdate, IDTORead{
	private Duration minWorkExperience;
	private Duration maxWorkExperience;
}
