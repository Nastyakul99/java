package com.test.vacancies.models.dto.update;

import java.time.Period;

import javax.persistence.Embeddable;

import org.hibernate.annotations.TypeDef;

import com.test.vacancies.models.dto.read.IDTORead;
import com.vladmihalcea.hibernate.type.interval.PostgreSQLIntervalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WorkExperienceUpdateReadDTO implements IDTOUpdate, IDTORead{
	private Period minWorkExperience;
	private Period maxWorkExperience;
}
