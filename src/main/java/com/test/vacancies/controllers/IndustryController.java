package com.test.vacancies.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.vacancies.models.dto.update.IndustryUpdateReadDTO;
import com.test.vacancies.models.entities.Industry;
import com.test.vacancies.services.IndustryService;

@RestController()
@RequestMapping("industry")
public class IndustryController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	private final IndustryService industryService;
	
	public IndustryController(IndustryService industryService) {
		this.industryService = industryService;
		
	}

	@PostMapping
	public ResponseEntity<IndustryUpdateReadDTO> create(@RequestBody IndustryUpdateReadDTO entity) {
		try {
			return new ResponseEntity<IndustryUpdateReadDTO>(industryService.create(entity), HttpStatus.CREATED);
		}catch(Exception e) {
			logger.error("craete faild", e);
			return new ResponseEntity<IndustryUpdateReadDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<IndustryUpdateReadDTO> update(@PathVariable Integer id, @RequestBody IndustryUpdateReadDTO entity) {
		try {
			return new ResponseEntity<IndustryUpdateReadDTO>(industryService.update(id, entity), HttpStatus.OK);
		}catch(Exception e) {
			logger.error("update faild", e);
			return new ResponseEntity<IndustryUpdateReadDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


	@GetMapping("/{id}")
	public ResponseEntity<IndustryUpdateReadDTO> findById(@PathVariable Integer id) {
		try {
			Optional<IndustryUpdateReadDTO> optional = industryService.findById(id);
			if(optional.isPresent()) {
				return new ResponseEntity<IndustryUpdateReadDTO>(optional.get(), HttpStatus.OK);
			}
			return new ResponseEntity<IndustryUpdateReadDTO>(HttpStatus.NOT_FOUND);
		}catch(Exception e) {
			logger.error("findById faild", e);
			return new ResponseEntity<IndustryUpdateReadDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping
	public  ResponseEntity<List<IndustryUpdateReadDTO>> findAll() {
		try {
			return new ResponseEntity<List<IndustryUpdateReadDTO>>(industryService.findAll(), HttpStatus.OK);

		}catch(Exception e) {
			logger.error("findAll faild", e);
			return new ResponseEntity<List<IndustryUpdateReadDTO>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}	
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		try {
			industryService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			logger.error("delete", e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
