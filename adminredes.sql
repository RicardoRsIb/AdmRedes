CREATE DATABASE adminredes DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;
USE adminredes;
CREATE TABLE `inventario` (
	fabricante varchar(20) COLLATE utf8mb4_spanish_ci NOT NULL,
	modelo varchar(20) COLLATE utf8mb4_spanish_ci NOT NULL,
	estado varchar(12) COLLATE utf8mb4_spanish_ci NOT NULL,
	Ubicacion varchar(20) COLLATE utf8mb4_spanish_ci NOT NULL,
	DireccionIP varchar(16) COLLATE utf8mb4_spanish_ci NOT NULL
  
)
ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

drop table if exists `inventario`;
INSERT INTO `inventario` VALUES 
('HP','laptop','bueno','laboratorio','192.168.1.11');
