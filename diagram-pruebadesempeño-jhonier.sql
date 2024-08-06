CREATE DATABASE riwyacademyDB;

USE riwyacademyDB;

CREATE TABLE students (
	id_student INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    apellido VARCHAR(20) NOT NULL,
    email VARCHAR (30) NOT NULL,
    edad INT NOT NULL
);


CREATE TABLE subjects (
	id_curso INT AUTO_INCREMENT PRIMARY KEY,
    name_course VARCHAR(20) NOT NULL,
    hours INT NOT NULL,
    teacher VARCHAR(20) NOT NULL
);


CREATE TABLE enrollment (
	id_inscripciones INT AUTO_INCREMENT PRIMARY KEY
);


CREATE TABLE grades (
	score INT(30) NOT NULL
);
