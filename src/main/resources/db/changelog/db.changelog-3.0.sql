--liquibase formatted sql


--changeset kulav:1
ALTER TABLE skills DROP COLUMN industry_id;
ALTER TABLE work_schedules DROP COLUMN industry_id;
ALTER TABLE vacancies ADD COLUMN name VARCHAR(64) NOT NULL UNIQUE;
ALTER TABLE work_schedules ADD COLUMN vacancy_id INT REFERENCES vacancies;