CREATE DATABASE IF NOT EXISTS adminredes;

USE adminredes;

CREATE TABLE IF NOT EXISTS archivosconf (
  id INT NOT NULL,
  nombrepdf VARCHAR(45) NOT NULL,
  archivo MEDIUMBLOB NOT NULL
  ) 