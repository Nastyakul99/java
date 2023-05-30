package com.test.vacancies.models.dto.update;

import com.test.vacancies.models.dto.read.IDTORead;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SpecialtyUpdateReadDTO implements IDTOUpdate, IDTORead{
	
    private String name;
    
    private Integer parentId;
}
