CREATE TABLE produto(
	id 			UUID 			PRIMARY KEY,
	nome 		VARCHAR(150) 	NOT NULL,
	preco 		NUMERIC(10,2)	NOT NULL,
	quantidade 	INT				NOT NULL
);

