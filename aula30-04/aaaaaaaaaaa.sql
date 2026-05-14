CREATE DATABASE IF NOT EXISTS loja;
USE loja;

CREATE TABLE IF NOT EXISTS roupa (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome_produto VARCHAR(255),
    marca VARCHAR(50),
    tamanho VARCHAR(3),
    preco DOUBLE,
    quantidade INT
);


SELECT * FROM roupa;
DROP TABLE IF EXISTS roupa;