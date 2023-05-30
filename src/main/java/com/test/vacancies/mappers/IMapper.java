package com.test.vacancies.mappers;

public interface IMapper <F, T>{
	
	T map(F object);
}
