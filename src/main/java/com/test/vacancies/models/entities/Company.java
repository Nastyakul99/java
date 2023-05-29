package com.test.vacancies.models.entities;

import java.util.ArrayList;
import java.util.List;

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
@Table(name = "companies")
public class Company implements IEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String name;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "industry_id")
    private Industry industry;
    
    @OneToMany(mappedBy="company")
    private List<Vacancy> vacansies = new ArrayList<>();
    
    @Embedded
    private ContactInfo contactInfo;
    
    public void setIndustry(Industry industry) {
    	this.industry = industry;
    	if(industry != null)
    	industry.getCompanies().add(this);
    }
    
    public void setContactInfo(String telephone, String email) {
    	if(contactInfo == null) {
    		this.contactInfo = new ContactInfo(telephone, email);
    		return;
    	}
    	this.contactInfo.setEmail(email);
    	this.contactInfo.setTelephone(telephone);
    }
}
