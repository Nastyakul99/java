package com.test.vacancies.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "skills")
public class Skill implements IEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false, unique = true)
    private String name;
    
    @OneToMany(mappedBy = "primaryKey.skill",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<VacanciesAndSkills> vacanciesAndSkills = new ArrayList<>();

	@Override
	public Skill merge(IEntity m) {
		if(m instanceof Skill) {
			this.setName(((Skill)m).getName());
		}
		
		return this;
	}
}
