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
@Entity(name="sucursal")
public class Sucursal implements Serializable {
    @Id @GeneratedValue 
    @Column(name="id_sucursal")
    private int id_sucursal;

    @Column(name="ciudad")
    private String ciudad;
    
    @Column(name="direccion")
    private String direccion;

    @column(name="id_administrador")
    private Administrador id_administrador;

public Sucursal(int idSucursal, String ciudad, String direccion){
       super(); // Hereda de la clase principal
       this.id_sucursal = idSucursal;
       this.ciudad = ciudad;
       this.direccion = direccion;
}

public Sucursal(){
}
public int getIdSucursal(){
      return id_sucursal;
}
public void setIdSucursal(int idSucursal){
      this.id_sucursal = idSucursal;
}

public String getCiudad(){
      return ciudad;
}
public void setCiudad(String Ciudad){
      this.ciudad = ciudad;
}

public String getDireccion(){
    return direccion;
}
public void setDireccion(String Direccion){
    this.direccion = direccion;
}

public int getIdAdministrador(){
     return id_administrador;
}
public void setIdAdministrador(idAdministrador){
     this.id_administrador = idAdministrador;
}
}

