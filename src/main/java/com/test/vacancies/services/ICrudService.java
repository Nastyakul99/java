package com.test.vacancies.services;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import com.test.vacancies.models.dto.read.IDTORead;
import com.test.vacancies.models.dto.update.IDTOUpdate;

public interface ICrudService <U extends IDTOUpdate,
								R extends IDTORead,
								I extends Serializable>{

	R create(U entity);
	
	R update(I id, U entity);

	Optional<R> findById(I id);

	List<R> findAll();
	
	void delete(I id);
	
}
