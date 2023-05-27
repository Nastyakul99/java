package com.test.vacancies.models.entities;

import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Salary {
	private Float minSalary;
	private Float maxSalary;
}
