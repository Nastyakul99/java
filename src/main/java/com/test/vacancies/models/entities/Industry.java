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
/**
 * - Медицина
 * 		- Лечебные учреждения
 * 			- Ветеринарная деятельность
 * 			- Детские лечебные учреждения
 * 		- Фармацевтика
 * 			- Фармацевтическая продукция (продвижение, оптовая торговля)
 * 			- 	Фармацевтическая продукция (производство)
 * 		- Клинические исследования
 */
@Getter
@Setter
@Entity
@Table(name = "industries")
public class Industry implements IEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String name;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Industry parent;
    
    @OneToMany(mappedBy="parent")
    private List<Industry> children = new ArrayList<>();
    
    @OneToMany(mappedBy="industry")
    private List<Company> companies = new ArrayList<>();
    
    public void setParent(Industry parent) {
    	this.parent = parent;
    	if(parent != null)
    	parent.getChildren().add(this);
    }
}