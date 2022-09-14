/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TIendaVirtualMiBarrio.Models;

import java.io.Serializable;
import javax.persistenece.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedVAlue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Table
@Entity(name="inventario")
public class Inventario implements Serializable {
    @Id
    @Column(name = "id_producto")
    private int id_producto;

    @Column(name = "nombre_producto")
    private String nombre_producto;

    @Column(name = "cantidad_producto")
    private int cantidad_producto;
 
    @Column(name = "valor_producto")
    private int valor_producto;

public Inventario(int idProducto, String nombreProducto, int cantidadProducto, int valorProducto){
            this.id_producto = idProducto;
            this.nombre_producto = nombreProducto;
            this.cantidad_producto = cantidadProducto;
            this.valor_producto = valorProducto;
}

public Inventario(){
}

public int getIdProducto(){
     return id_producto;
}
public void setIdProducto(int idProducto){
     this.id_producto = idProducto;   
}

public String getNombreProducto(){
     return nombre_producto;
}
public void setNombreProducto(String nombreProducto){
     this.nombre_producto = nombreProducto;
}

public int getCantidadProducto(){
     return cantidad_producto;
}
public void setCantidadProducto(int cantidadProducto){
     this.cantidad_producto = cantidadProducto;
}

public int getValorProducto(){
     return valor_producto;
}
public void setValorProducto(int valorProducto){
     this.valor_producto = valorProducto;
}    
}
