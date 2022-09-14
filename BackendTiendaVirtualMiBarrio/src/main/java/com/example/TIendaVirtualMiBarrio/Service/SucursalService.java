/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.TIendaVirtualMiBarrio.Service;
import com.example.TIendaVirtualMiBarrio.Models.Sucursal;
import java.util.List;

/**
 *
 * @author duvan
 */
public interface SucursalService {
  public Sucursal save(Sucursal sucursal);
  public void delete(integer id);
  public Sucursal fibdById(Integer id);
  public List<Sucursal> findByAll();
  
    
}
