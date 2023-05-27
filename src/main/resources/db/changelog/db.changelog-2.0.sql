--liquibase formatted sql


--changeset kulav:1
CREATE TABLE IF NOT EXISTS specialties
(
    id SERIAL PRIMARY KEY ,
    name VARCHAR(64) NOT NULL UNIQUE,
    parent_id INT REFERENCES specialties (id)
    
);

--changeset kulav:2
CREATE TABLE IF NOT EXISTS skills
(
    id SERIAL PRIMARY KEY ,
    name VARCHAR(64) NOT NULL UNIQUE,
    industry_id INT REFERENCES industries (id) 
);

--changeset kulav:3
CREATE TABLE IF NOT EXISTS vacancies_and_skills
(

    vacancy_id INT REFERENCES vacancies (id),
    skill_id INT REFERENCES skills (id),

    CONSTRAINT vacancies_and_skills_pkey PRIMARY KEY (vacancy_id, skill_id)
);

--changeset kulav:4
CREATE TABLE IF NOT EXISTS work_schedules
(
    id SERIAL PRIMARY KEY ,
    name VARCHAR(64) NOT NULL UNIQUE,
    industry_id INT REFERENCES industries (id) 
);

--changeset kulav:5
ALTER TABLE vacancies ADD COLUMN specialty_id INT REFERENCES specialties;
ALTER TABLE vacancies ADD COLUMN created_at TIMESTAMP;
ALTER TABLE vacancies ADD COLUMN modified_at TIMESTAMP;

