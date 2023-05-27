package com.test.vacancies.models.entities;

public enum Schedule {
	
	FULL_DAY("Полный день"),
	SHIFT_SCHEDULE("Сменный график"),
	FLEXIBLE_SCHEDULE("Гибкий график"),
	REMOTE_WORK("Удаленная работа"),
	ROTATIONAL_METHOD("Вахтовый метод");
	
	private String name;

	private Schedule(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}
