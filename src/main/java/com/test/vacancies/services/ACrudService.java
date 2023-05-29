package com.test.vacancies.services;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.data.jpa.repository.JpaRepository;
import com.test.vacancies.mappers.IMapper;
import com.test.vacancies.models.dto.read.IDTORead;
import com.test.vacancies.models.dto.update.IDTOUpdate;
import com.test.vacancies.models.entities.IEntity;

public abstract class ACrudService <E extends IEntity,
									U extends IDTOUpdate,
									R extends IDTORead,
									I extends Serializable>
									implements ICrudService<U, R, I>{
	
	private final JpaRepository<E,I> repository;
	private final IMapper<U, E> toEntityMapper;
	private final IMapper<E, R> toDTOMapper;
	
	public ACrudService(IMapper<U, E> toEntityMapper,
						IMapper<E, R> toDTOMapper,
						JpaRepository<E, I> repository) {
		this.repository = repository;
		this.toEntityMapper = toEntityMapper;
		this.toDTOMapper = toDTOMapper;
		
	}

	@Override
	public R create(U entity) {
		E e = toEntityMapper.map(entity);
		repository.save(e);
		return toDTOMapper.map(e);
	}

	@Override
	public R update(I id, U entity) {
		return repository.findById(id)
				.map(e->toEntityMapper.map(entity, e))
				.map(repository::save)
				.map(e -> toDTOMapper.map(e))
				.get();
	}

	@Override
	public Optional<R> findById(I id) {
		return repository.findById(id)
		.map(toDTOMapper::map);
	}

	@Override
	public List<R> findAll() {
		return repository.findAll()
				.stream()
				.map(toDTOMapper::map)
				.collect(Collectors.toList());
	}

	@Override
	public void delete(I id) {
		repository.deleteById(id);	
	}

}
