/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TIendaVirtualMiBarrio.Models;

/**
 *
 * @author duvan
 */
import java.io.Serializable;
import javax.persistenece.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedVAlue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Table
@Entity(name="administrador")
public class Administrador implements Serializable {
    @Id
    @Column(name = "id_administrador")
    private int id_administrador;

    @Column(name = "nombre_administrador")
    private String nombre_administrador;

    @Column(name = "clave")
    private String clave;
 
    @Column(name = "email")
    private String email;

public Administrador(int idAdministrador, String nombreAdministrador, String clave, String email){
     this.id_administrador = idAdministrador;
     this.nombre_administrador = nombreAdministrador;
     this.clave = clave;
     this.email = email;
}

public Administrador(){
}

public int getIdAdministrador(){
     return id_administrador;
}
public void setIdAdministrador(int idAdmistrador){
     this.id_administrador = idAdministrador;
}

public String getNombreAdmistrador(){
      return nombre_administrador;
}
public void setNombreAdmistrador(String nombreAdministrador){
      this.nombre_administrador = nombreAdministrador;
}

public String getClave(){
    return clave;
}
public void setClave(String clave){
      this.clave = clave;
}

public String getemail(){
      return email;
}
public void setEmail(String email){
      this.email = email;
}
}
