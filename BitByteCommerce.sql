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