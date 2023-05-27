package com.test.vacancies.models.entities;

import java.time.Period;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class WorkExperience {
	private Period minWorkExperience;
	private Period maxWorkExperience;
}
