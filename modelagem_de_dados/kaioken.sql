-- Exported from QuickDBD: https://www.quickdatabasediagrams.com/
-- Link to schema: https://app.quickdatabasediagrams.com/#/d/q7qqYI
-- NOTE! If you have used non-SQL datatypes in your design, you will have to change these here.


CREATE TABLE `destinos` (
    `id_destinos` INT AUTO_INCREMENT NULL ,
    `destino` VARCHAR(255)  NULL 
);

CREATE TABLE `Promo` (
    `id_promo` INT AUTO_INCREMENT NULL ,
    `pacote_familia` VARCHAR(255)  NULL ,
    `pacote_dupla` VARCHAR(255)  NULL 
);

CREATE TABLE `contato` (
    `id_contato` INT AUTO_INCREMENT NULL ,
    `email` VARCHAR(255)  NULL ,
    `mensagem` TEXT  NULL 
);

CREATE TABLE `usuario` (
    `id_usuario` INT AUTO_INCREMENT NULL ,
    `telefone` VARCHAR(20)  NULL ,
    `cpf` VARCHAR(14)  NULL ,
    `senha` VARCHAR(255)  NULL ,
    `email` VARCHAR(255)  NULL ,
    `nome` VARCHAR(255)  NULL 
);

CREATE TABLE `pedido` (
    `id_pedido` INT AUTO_INCREMENT NULL ,
    `status_pedido` VARCHAR(50)  NULL ,
    `data_ida` DATE  NULL ,
    `data_volta` DATE  NULL ,
    `num_viajantes` INT  NULL 
);

CREATE TABLE `faz` (
    `id_faz` INT AUTO_INCREMENT NULL ,
    `id_pedido` INT  NULL ,
    `id_usuario` INT  NULL 
);

CREATE TABLE `pedido_destinos` (
    `id_pedido_destinos` INT AUTO_INCREMENT NULL ,
    `id_pedido` INT  NULL ,
    `id_destinos` INT  NULL 
);

CREATE TABLE `pedido_promo` (
    `id_pedido_promo` INT AUTO_INCREMENT NULL ,
    `id_pedido` INT  NULL ,
    `id_promo` INT  NULL 
);

ALTER TABLE `faz` ADD CONSTRAINT `fk_faz_id_pedido` FOREIGN KEY(`id_pedido`)
REFERENCES `pedido` (`id_pedido`);

ALTER TABLE `faz` ADD CONSTRAINT `fk_faz_id_usuario` FOREIGN KEY(`id_usuario`)
REFERENCES `usuario` (`id_usuario`);

ALTER TABLE `pedido_destinos` ADD CONSTRAINT `fk_pedido_destinos_id_pedido` FOREIGN KEY(`id_pedido`)
REFERENCES `pedido` (`id_pedido`);

ALTER TABLE `pedido_destinos` ADD CONSTRAINT `fk_pedido_destinos_id_destinos` FOREIGN KEY(`id_destinos`)
REFERENCES `destinos` (`id_destinos`);

ALTER TABLE `pedido_promo` ADD CONSTRAINT `fk_pedido_promo_id_pedido` FOREIGN KEY(`id_pedido`)
REFERENCES `pedido` (`id_pedido`);

ALTER TABLE `pedido_promo` ADD CONSTRAINT `fk_pedido_promo_id_promo` FOREIGN KEY(`id_promo`)
REFERENCES `Promo` (`id_promo`);

