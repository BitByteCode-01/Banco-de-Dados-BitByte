create database if not exists BitByte_Commerce;
use BitByte_Commerce;

create table Usuarios(
usuario_id int auto_increment primary key,
nome varchar(25) ,
email varchar(25),
cpf varchar(15)
);

insert into Usuarios (nome,email,cpf) values('Gérson da Silva','Gersojn@gmail.com','42112345609'),
                                             ('Guilherme Guimarães','Guimasraes@gmail.com','45124256756'),    
                                             ('Caio castro','ocaiocastro@gmail.com','13465045690'),
                                             ('Estér Alenkar','ester@gmail.com','25690820087'),
                                             ('Bruno Franciso','Bfran@gmail.com','46712978910');
                                             select * from Usuarios;
                              
                                      
create table if not exists Empresas(
empresa_id int auto_increment primary key,
nome varchar(25),
email varchar(50),
cnpj varchar(20),
telefone varchar(15)
);



insert into Empresas (nome,email,cnpj,telefone) values('Padaria doce sabor','contato@padariadocesabor.com.br','54.321.098/0001-99','(11)4021-5185'),                                            
                                                       ('Marcenaria do seu zé','marcenariaseuze@gmail.com','43.455.123/0002-88','(11)4321-2121'),
                                                       ('Mercadinho do Professor','contatodoprofessor@gmail.com','12.333.890/0001-90','(11)5015-0876'),
                                                       ('Lanchonete dos 3 irmãos ','tresirmaos@gmail.com','19.425.900/0003-79','(11)4742-9090'),
                                                       ('Papelaria Lazer','papelaria@gmail.com.br','47.890.334/0002-90','(21)5042-8597');
                                                       select * from Empresas; 
                                                       drop table empresas;
                                                       drop  table usuarios;