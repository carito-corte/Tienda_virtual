/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.TIendaVirtualMiBarrio.Service;
import com.example.TIendaVirtualMiBarrio.Models.Administrador;
import java.util.List;

/**
 *
 * @author duvan
 */
public interface AdministradorService {
  public Administrador save(Administrador administrador);
  public void delete(Integer id);
  public Administrador findById(Integer id);
  public List<Administrador> findbyAll();
    
}
