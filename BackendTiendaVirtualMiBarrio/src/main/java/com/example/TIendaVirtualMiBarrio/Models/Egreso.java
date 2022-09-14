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
@Entity(name = "egreso")
public class Egreso implements Serializable {
    @Id @GeneratedValue 
    @Column(name="id_egreso")
    private int id_egreso;

    @Column(name="nombre_gasto")
    private String nombre_gasto;
    
    @Column(name="valor_gasto")
    private String valor_gasto;

    @column(name="id_sucursal")
    private Sucursal id_sucursal;

public Egreso(int idEgreso, String nombreGasto, String valorGasto){
        super(); // Hereda de la clase principal
        this.id_egreso = idEgreso;
        this.nombre_gasto = nombreGasto;
        this.valor_gasto = valorGasto;
}

public Ingreso(){
}

public int getIdEgreso(){
      return id_egreso;
}
public void setIdEgreso(int idEgreso){
      this.id_egreso = idEgreso;
}

public String getNombreGasto(){
      return nombre_gasto;
}
public void setNombreGasto(String nombreGasto){
      this.nombre_gasto = nombreGasto;
}

public void getValorGasto(){
      return valor_gasto;
}
public void setValorGasto(String valorGasto){
      this.valor_gasto = valorGasto;
}

public int getIdSucursal(){
      return id_sucursal;
}
public void setIdSucursal(int idSucursal){
      this.id_sucursal = idSucursal;
} 
}
