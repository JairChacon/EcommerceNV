CREATE TABLE clientes (

id_usuario int not null auto_increment primary key,
nome varchar(40),
email varchar(40),
cpf int,
telefone int,
data_de_nascimento date
)