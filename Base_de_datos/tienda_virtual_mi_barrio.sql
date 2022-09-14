create database tienda_virtual_mi_barrio;
use  tienda_virtual_mi_barrio;	


CREATE TABLE administrador (
  id_administrador INT NOT NULL,
  nombre_administrador varchar(45) NOT NULL,
 clave varchar(20) NOT NULL,
 email varchar(20) NOT NULL,
  constraint administrador_pk PRIMARY KEY (id_administrador));
  

  
  
  CREATE TABLE inventario (
  id_producto int NOT NULL AUTO_INCREMENT,
  nombre_producto varchar(50) NOT NULL,
  cantidad_producto int NOT NULL,
  valor_producto int NOT NULL,
  constraint producto_pk PRIMARY KEY (id_producto));
  
  
  
   CREATE TABLE sucursal (
  id_sucursal int NOT NULL AUTO_INCREMENT,
   ciudad varchar(50) NOT NULL,
   direccion varchar(50) NOT NULL,
  id_administrador int NOT NULL,
  constraint sucursal_pk PRIMARY KEY (id_sucursal),
   CONSTRAINT sucursal_id_administrador_fk FOREIGN KEY (id_administrador) REFERENCES administrador (id_administrador));
  
  
 CREATE TABLE ingreso (
   id_venta int NOT NULL AUTO_INCREMENT,
   cantidad_producto varchar(50) NOT NULL,
   valor_venta int NOT NULL,
   id_sucursal int not null,
   id_producto int NOT NULL,
  constraint ingreso_pk PRIMARY KEY (id_venta),
  constraint ingreso_id_sucursal_fk FOREIGN KEY (id_sucursal) REFERENCES sucursal (id_sucursal),
  constraint ingreso_id_producto_fk FOREIGN KEY (id_producto) REFERENCES inventario (id_producto));
  
  
    CREATE TABLE egreso (
   id_egreso int NOT NULL AUTO_INCREMENT,
   nombre_gasto varchar(30) NOT NULL,
   valor_gasto varchar(30) NOT NULL,
	id_sucursal int not null,
  constraint egreso_pk PRIMARY KEY (id_egreso),
  constraint egreso_id_sucursal_fk FOREIGN KEY (id_sucursal) REFERENCES sucursal (id_sucursal));