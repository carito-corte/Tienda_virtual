/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.TIendaVirtualMiBarrio.Service;
import com.example.TIendaVirtualMiBarrio.Models.Ingreso;
import java.util.List;

/**
 *
 * @author duvan
 */
public interface IngresoService {
  public Ingreso save(Ingreso ingreso);
  public void delete(Integer id);
  public Ingreso findById(Integer id);
  public List<Ingreso> findbyAll();
}
