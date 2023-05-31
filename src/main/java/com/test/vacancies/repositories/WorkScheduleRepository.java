package com.test.vacancies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.vacancies.models.entities.WorkSchedule;

public interface WorkScheduleRepository extends JpaRepository<WorkSchedule, Integer> {

}
