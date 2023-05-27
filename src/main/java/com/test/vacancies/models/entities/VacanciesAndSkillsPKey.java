package com.test.vacancies.models.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class VacanciesAndSkillsPKey implements Serializable{

	private static final long serialVersionUID = 1L;
	@ManyToOne(optional = false)
	private Vacancy vacancy;
	@ManyToOne(optional = false)
    private Skill skill;
    
	@Override
	public int hashCode() {
		return Objects.hash(skill.getId(), vacancy.getId());
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VacanciesAndSkillsPKey other = (VacanciesAndSkillsPKey) obj;
		return Objects.equals(skill.getId(), other.skill.getId())
				&& Objects.equals(vacancy.getId(), other.vacancy.getId());
	}
    
    
}
