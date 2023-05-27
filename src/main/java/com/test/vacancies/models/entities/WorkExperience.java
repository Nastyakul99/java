package com.test.vacancies.models.entities;

import java.time.Period;

import javax.persistence.Embeddable;

import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.interval.PostgreSQLIntervalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TypeDef(
	    typeClass = PostgreSQLIntervalType.class,
	    defaultForType = Period.class
	)
@Embeddable
public class WorkExperience {
	private Period minWorkExperience;
	private Period maxWorkExperience;
}
