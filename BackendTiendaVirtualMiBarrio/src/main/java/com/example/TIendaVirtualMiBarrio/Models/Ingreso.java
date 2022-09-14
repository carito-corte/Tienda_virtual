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
@Entity(name = "ingreso")
public class Ingreso implements Serializable {
    @Id @GeneratedValue 
    @Column(name="id_venta")
    private int id_venta;

    @Column(name="cantidad_producto")
    private String cantidad_producto;
    
    @Column(name="valor_venta")
    private int valor_venta;

    @column(name="id_sucursal")
    private Sucursal id_sucursal;

    @column(name="id_producto")
    private Inventario id_producto;

public Ingreso(int idVenta, String cantidadProducto, int valorVenta){
        super(); // Hereda de la clase principal
        this.id_venta = idVenta;
        this.cantidad_producto = cantidadProducto;
        this.valor_venta = valorVenta;
}

public Ingreso(){
}

public int getIdVenta(){
      return id_venta;
}
public void setIdVenta(int idVenta){
      this.id_venta = idVenta;
}
public String getCantidadProducto(){
      return cantidad_producto;
}
public void setCantidadProducto(String cantidadProducto){
      this.cantidad_producto = cantidadProducto;
}

public void getValorVenta(){
      return valor_venta;
}
public void setValorVenta(int valorVenta){
      this.valor_venta = valorVenta;
}

public int getIdSucursal(){
      return id_sucursal;
}
public void setIdSucursal(int idSucursal){
      this.id_sucursal = idSucursal;
}

public int getIdProducto(){
     return id_producto;
}
public void setIdProducto(int idProducto){
     this.id_producto = idProducto;   
} 
}
