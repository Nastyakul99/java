package com.test.vacancies.controllers;

import java.io.Serializable;
import java.util.List;
import org.springframework.http.ResponseEntity;
import com.test.vacancies.models.dto.read.IDTORead;
import com.test.vacancies.models.dto.update.IDTOUpdate;
import com.test.vacancies.models.entities.IEntity;
import com.test.vacancies.services.ACrudService;

public interface ICrudController <S extends ACrudService<E, U, R, I>,
								E extends IEntity,
								U extends IDTOUpdate,
								R extends IDTORead,
								I extends Serializable>{
	

	public ResponseEntity<R> create(U entity);

	public ResponseEntity<R> update(I id, U entity);

	public ResponseEntity<R> findById(I id);

	public  ResponseEntity<List<R>> findAll();

	public ResponseEntity<?> delete(I id);

}
