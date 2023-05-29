package com.test.vacancies.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.test.vacancies.models.dto.read.CompanyReadDTO;
import com.test.vacancies.models.dto.update.ContactInfoDTO;
import com.test.vacancies.models.entities.Company;
import com.test.vacancies.models.entities.ContactInfo;
import lombok.Setter;

@Component
public class CompanyEntityToReadDTO implements IMapper<Company, CompanyReadDTO>{
	
	@Autowired
	@Setter
	private IndutryEntityToReadDTO indutryEntityToReadDTO;

	@Override
	public CompanyReadDTO map(Company object) {
		CompanyReadDTO dto = new CompanyReadDTO();
		return map(object, dto);
	}

	@Override
	public CompanyReadDTO map(Company from, CompanyReadDTO to) {
		ContactInfo contactInfo = from.getContactInfo();
		if(contactInfo != null) {
			to.setContactInfoDTO(new ContactInfoDTO(contactInfo.getTelephone(),
													contactInfo.getEmail()));
		}
		
		to.setIndustry(from.getIndustry() != null ?
											indutryEntityToReadDTO.map(from.getIndustry())
											: null);
		to.setName(from.getName());
		return to;
	}

}
