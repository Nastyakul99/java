package com.test.vacancies.mappers;

import org.springframework.stereotype.Component;
import com.test.vacancies.models.dto.update.CompanyUpdateDTO;
import com.test.vacancies.models.dto.update.ContactInfoDTO;
import com.test.vacancies.models.entities.Company;
import com.test.vacancies.models.entities.ContactInfo;
import com.test.vacancies.repositories.IndustryRepository;

@Component
public class CompanyUpdateToEntity implements IMapper<CompanyUpdateDTO, Company>{
	
	private final IndustryRepository industryRepository;
	
	public CompanyUpdateToEntity(IndustryRepository industryRepository) {
		this.industryRepository = industryRepository;
		
	}

	@Override
	public Company map(CompanyUpdateDTO object) {
		Company company = new Company();
		return map(object, company);
	}

	@Override
	public Company map(CompanyUpdateDTO from, Company to) {
		to.setName(from.getName());
		if(from.getIndustryId() != null) {
			to.setIndustry(industryRepository.findById(from.getIndustryId()).orElse(null));
		}
		to.setContactInfo(map(from.getContactInfoDTO()));
		return to;
	}
	
	private ContactInfo map(ContactInfoDTO dto) {
		if(dto == null) return null;
		return new ContactInfo(dto.getTelephone(), dto.getEmail());
	}

}
