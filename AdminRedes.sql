CREATE DATABASE AdminRedes;

USE `AdminRedes`;

DROP TABLE IF EXISTS `archivosConf`;

CREATE TABLE `archivosConf` (
  `Numero` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) DEFAULT NULL,
  `Archivo` mediumblob,
  PRIMARY KEY (`Numero`)
) ENGINE=InnoDB;