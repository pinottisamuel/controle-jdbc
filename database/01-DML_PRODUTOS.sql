create table produtos (
	id int auto_increment primary key,
	nome_produto varchar(255) not null,
	valor decimal(10.2),
	data_cadastro date,
	observacao varchar(255)
);