CREATE DATABASE UNIP; 
USE UNIP;
CREATE TABLE usuarios ( cd_usuario INT(6), nm_nome VARCHAR(30), nm_sobrenome VARCHAR(30), ds_email VARCHAR(50), dt_criacao DATE );
INSERT INTO usuarios values ('1', 'Astrogildo', 'Espaço', 'astro@gildo.com.br', STR_TO_DATE('1-01-2019', '%d-%m-%Y')); INSERT   INTO   usuarios   values   ('2',   'Crisnatágoras',   'Silveira',   'cris@gmail.com.br', STR_TO_DATE('2-01-2020', '%d-%m-%Y')); INSERT INTO usuarios values ('3', 'Netanias', 'Gates', 'netanias@hotmail.com.br', STR_TO_DATE('1-02-2020', '%d-%m-%Y')); INSERT  INTO  usuarios  values  ('4',  'Netuno',  'Zuckerberg',  'netu@gmail.com',  STR_TO_DATE('1-03-2020', '%d-%m-%Y')); INSERT INTO usuarios values ('5', 'Zoroastro', 'Trump', 'zoro@outlook.com.br', CURDATE());
DESCRIBE usuarios;
SELECT * FROM usuarios; 
SELECT * FROM usuarios WHERE cd_usuario = 1;
SELECT * FROM usuarios WHERE nm_nome = 'Netanias' AND nm_sobrenome = 'Gates';
SELECT cd_usuario, nm_nome, dt_criacao FROM usuarios;
SELECT u.cd_usuario, u.nm_nome, u.dt_criacao FROM usuarios u WHERE u.nm_nome = 'Astrogildo' AND u.nm_sobrenome = 'Espaço'
