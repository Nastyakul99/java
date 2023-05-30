package com.test.vacancies.models.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "specialties")
public class Specialty implements IEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false, unique = true)
    private String name;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Specialty parent;
    
    @OneToMany(mappedBy="parent")
    private List<Specialty> children = new ArrayList<>();
    
    @OneToMany(mappedBy="specialty")
    private List<Vacancy> specialty = new ArrayList<>();

	@Override
	public Specialty merge(IEntity m) {
		if(m instanceof Specialty) {
			this.setName(((Specialty)m).getName());
			this.setParent(((Specialty)m).getParent());
		}
		
		return this;
	}
}

