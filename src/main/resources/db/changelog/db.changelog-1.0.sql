--liquibase formatted sql


--changeset kulav:1
CREATE TABLE IF NOT EXISTS industries
(
    id SERIAL PRIMARY KEY ,
    name VARCHAR(64) NOT NULL UNIQUE,
    parent_id INT REFERENCES industries (id)
    
);

--changeset kulav:2
CREATE TABLE IF NOT EXISTS companies
(
    id SERIAL PRIMARY KEY ,
    name VARCHAR(64) NOT NULL UNIQUE,
    industry_id INT REFERENCES industries (id),
    telephone VARCHAR(64),
    email VARCHAR(64)
    
);

--changeset kulav:3
CREATE TABLE IF NOT EXISTS vacancies
(
	id SERIAL PRIMARY KEY ,
    company_id INT REFERENCES companies (id),
    description VARCHAR(255) NOT NULL,
    min_work_experience INTERVAL,
    max_work_experience INTERVAL,
    min_salary FLOAT,
    max_salary FLOAT
    
);
