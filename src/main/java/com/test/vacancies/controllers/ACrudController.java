package com.test.vacancies.controllers;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
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
import com.test.vacancies.models.dto.read.IDTORead;
import com.test.vacancies.models.dto.update.IDTOUpdate;
import com.test.vacancies.models.entities.IEntity;
import com.test.vacancies.services.ACrudService;

public abstract class ACrudController <S extends ACrudService<E, U, R, I>,
										E extends IEntity,
										U extends IDTOUpdate,
										R extends IDTORead,
										I extends Serializable>
										implements ICrudController<S, E, U, R, I>{
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	private final S service;
	
	public ACrudController(S service) {
		this.service = service;
		
	}

	@PostMapping
	@Override
	public ResponseEntity<R> create(@RequestBody U entity) {
		try {
			return new ResponseEntity<R>(service.create(entity), HttpStatus.CREATED);
		}catch(Exception e) {
			logger.error("craete faild", e);
			return new ResponseEntity<R>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/{id}")
	@Override
	public ResponseEntity<R> update(@PathVariable I id, @RequestBody U entity) {
		try {
			return new ResponseEntity<R>(service.update(id, entity), HttpStatus.OK);
		}catch(Exception e) {
			logger.error("update faild", e);
			return new ResponseEntity<R>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/{id}")
	@Override
	public ResponseEntity<R> findById(@PathVariable I id) {
		try {
			Optional<R> optional = service.findById(id);
			if(optional.isPresent()) {
				return new ResponseEntity<R>(optional.get(), HttpStatus.OK);
			}
			return new ResponseEntity<R>(HttpStatus.NOT_FOUND);
		}catch(Exception e) {
			logger.error("findById faild", e);
			return new ResponseEntity<R>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping
	@Override
	public ResponseEntity<List<R>> findAll() {
		try {
			return new ResponseEntity<List<R>>(service.findAll(), HttpStatus.OK);
		}catch(Exception e) {
			logger.error("findAll faild", e);
			return new ResponseEntity<List<R>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/{id}")
	@Override
	public ResponseEntity<?> delete(@PathVariable I id) {
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			logger.error("delete", e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
