/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.TIendaVirtualMiBarrio.Service;
import com.example.TIendaVirtualMiBarrio.Models.Egreso;
import java.util.List;

/**
 *
 * @author duvan
 */
public interface EgresoService {
  public Egreso save(Egreso egreso);
  public void delete(Integer id);
  public Egreso findById(Integer id);
  public List<Egreso> findbyAll();

}
