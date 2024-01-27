use sakila;
DROP DATABASE IF EXISTS universidade;
CREATE DATABASE universidade;
USE universidade;


CREATE TABLE departamento(cod_departamento INT NOT NULL IDENTITY(1,1),nome_departamento VARCHAR(30), PRIMARY KEY(cod_departamento))
CREATE TABLE PROFESSOR (cod_professor INT PRIMARY KEY IDENTITY(1,1), nome_professor VARCHAR(20), sobrenome_professor VARCHAR(50),status_professor BIT,fk_cod_departamento INT FOREIGN KEY REFERENCES departamento(cod_departamento));
CREATE TABLE curso(cod_curso INT NOT NULL IDENTITY(1,1) PRIMARY KEY,nome_curso VARCHAR(30),fk_cod_departamento INT FOREIGN KEY REFERENCES departamento(cod_departamento));
CREATE TABLE turma(cod_turma INT NOT NULL IDENTITY(1,1)PRIMARY KEY,periodo VARCHAR(8),num_alunos INT NOT NULL,data_inicio DATETIME2,data_fim DATETIME2,fk_cod_curso INT FOREIGN KEY REFERENCES curso(cod_curso));
CREATE TABLE disciplina(cod_disciplina INT NOT NULL IDENTITY(1,1) PRIMARY KEY,nome_disciplina VARCHAR(30) NOT NULL,carga_horaria INT,descricao VARCHAR(50),numero_alunos INT, fk_cod_deparatamento INT FOREIGN KEY REFERENCES departamento(cod_departamento));
CREATE TABLE prof_disc (fk_cod_professor INT FOREIGN KEY REFERENCES professor(cod_professor),fk_cod_disciplina INT FOREIGN KEY REFERENCES disciplina(cod_disciplina));
CREATE TABLE curso_disciplina(fk_cod_curso INT FOREIGN KEY REFERENCES curso(cod_curso),fk_cod_disciplina INT FOREIGN KEY REFERENCES disciplina(cod_disciplina));
CREATE TABLE aluno(ra INT NOT NULL PRIMARY KEY IDENTITY(1,1),nome_aluno VARCHAR(20), sobrenome_aluno VARCHAR(20),cpf VARCHAR(11),status_aluno BIT,sexo VARCHAR(1),nome_pai VARCHAR(50),nome_mae VARCHAR(50),email VARCHAR(50),whatsapp VARCHAR(50),fk_cod_curso INT FOREIGN KEY REFERENCES curso(cod_curso), fk_cod_turma INT FOREIGN KEY REFERENCES turma(cod_turma));
CREATE TABLE aluno_disc(fk_ra INT FOREIGN KEY REFERENCES aluno(ra),fk_cod_disciplina INT FOREIGN KEY REFERENCES disciplina(cod_disciplina));
CREATE TABLE depende(fk_cod_disciplina INT FOREIGN KEY REFERENCES disciplina(cod_disciplina),possui_cod_disciplina INT );
CREATE TABLE historico(cod_historico INT PRIMARY KEY IDENTITY(1,1),data_inicio DATETIME2,data_fim DATETIME2,fk_ra INT FOREIGN KEY REFERENCES aluno(ra));
CREATE TABLE disc_hist(nota INT,frequencia INT,fk_cod_historico INT FOREIGN KEY REFERENCES historico(cod_historico),fk_cod_disciplina INT FOREIGN KEY REFERENCES disciplina(cod_disciplina));
CREATE TABLE tipo_logradouro(cod_tipo_logradouro INT NOT NULL PRIMARY KEY IDENTITY(1,1),tipo_logradouro VARCHAR(11));
CREATE TABLE endereco_aluno (cod_end_aluno INT NOT NULL PRIMARY KEY IDENTITY(1,1),nome_rua VARCHAR(50), num_rua INT, complemento VARCHAR(20),cep VARCHAR(8),fk_ra INT FOREIGN KEY REFERENCES aluno(ra),fk_cod_tp_logradouro INT FOREIGN KEY REFERENCES tipo_logradouro(cod_tipo_logradouro));
CREATE TABLE tipo_telefone (cod_tipo_telefone INT NOT NULL PRIMARY KEY IDENTITY(1,1), tipo_telefone VARCHAR(8));
CREATE TABLE telefone_aluno(cod_telefone_aluno INT NOT NULL PRIMARY KEY IDENTITY(1,1), num_telefone VARCHAR(20),fk_ra INT FOREIGN KEY REFERENCES aluno(ra), fk_cod_tipo_telefone INT FOREIGN KEY REFERENCES tipo_telefone(cod_tipo_telefone));


INSERT INTO departamento VALUES ('secretaria');
INSERT INTO PROFESSOR VALUES ('welington','sousa',1,1);
INSERT INTO curso VALUES('programcao c#',1);
INSERT INTO turma VALUES ('primeiro',30,'2018-06-12 10:34:09 AM','2023-11-16 02:45:35 AM',1);
INSERT INTO disciplina VALUES('c#',30,'fundamentos em c#',30,1);
INSERT INTO prof_disc VALUES(1,2);
INSERT INTO curso_disciplina VALUES(1,2);
INSERT INTO aluno VALUES ('eduardo','lucas','14938673598',1,'M','milton', 'helena','duda@holiwood.com','16996352540',1,1);
INSERT INTO aluno_disc VALUES(3,1);
INSERT INTO depende VALUES (1,20);
INSERT INTO historico VALUES('2020-07-12 10:34:09 AM','2023-11-16 02:45:35 AM',3);
INSERT INTO disc_hist VALUES(10,40,3,1);
INSERT INTO tipo_logradouro VALUES('rua');
INSERT INTO endereco_aluno VALUES ('cuiaba',520,'casa','1086204',3,1);
INSERT INTO tipo_telefone VALUES('16989658');
INSERT INTO telefone_aluno VALUES('16997986984',3,1);

select * from tipo_telefone
