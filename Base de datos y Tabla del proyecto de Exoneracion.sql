USE master;
CREATE DATABASE VENTASYSTEM;
USE VENTASYSTEM;

CREATE TABLE DatoCompraCliente (
    Cedula NVARCHAR(20) NOT NULL,
    Fecha DATE NOT NULL,
    Vendedor NVARCHAR(100) NOT NULL,
    TipoCompra NVARCHAR(50) NOT NULL,
    Articulo NVARCHAR(100) NOT NULL,
    Cantidad INT NOT NULL,
    PrecioUnitario DECIMAL(10, 2) NOT NULL,
    Monto DECIMAL(10, 2) NOT NULL
);


CREATE TABLE Cliente (
    Cedula NVARCHAR(20) NOT NULL,
    Nombre NVARCHAR(100) NOT NULL,
	Direccion NVARCHAR(500) NOT NULL,
    Genero NVARCHAR(10) NOT NULL,
    Estado bit NOT NULL
);

CREATE TABLE Vendedor (
    Cedula NVARCHAR(20) NOT NULL,
    Nombre NVARCHAR(100) NOT NULL,
	Direccion NVARCHAR(500) NOT NULL,
    Genero NVARCHAR(10) NOT NULL,
	Rol NVARCHAR(20) ,
	Pass NVARCHAR(50) ,
    Estado bit NOT NULL
);

CREATE TABLE Producto(
	Nombre NVARCHAR(500) NOT NULL,
	PrecioUnitario DECIMAL(10, 2) NOT NULL,
	Estado bit NOT NULL
)

-- DROP TABLE DatoCompraCliente
-- DROP TABLE Cliente
-- DROP TABLE Vendedor
-- DROP TABLE Producto

