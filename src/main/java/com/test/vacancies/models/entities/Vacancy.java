package com.test.vacancies.models.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
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
@Table(name = "vacancies")
public class Vacancy extends AuditingEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false, unique = true)
    private String name;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;
    
    @Column(nullable = false)
    private String description;
    
    @Embedded
    private WorkExperience workExperience;
    
    @Embedded
    private Salary salary;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "specialty_id")
    private Specialty specialty;
    
    @OneToMany(mappedBy = "primaryKey.vacancy",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<VacanciesAndSkills> vacanciesAndSkills;
    
    @OneToMany(mappedBy = "vacancy", fetch = FetchType.LAZY)
    List<WorkSchedule> workSchedule;
}
