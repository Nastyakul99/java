package com.test.vacancies.models.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "vacancies_and_skills")
public class VacanciesAndSkills implements IEntity{

	@EmbeddedId()
	private VacanciesAndSkillsPKey primaryKey;

	@Override
	public VacanciesAndSkills merge(IEntity m) {
		return this;
	}
}
