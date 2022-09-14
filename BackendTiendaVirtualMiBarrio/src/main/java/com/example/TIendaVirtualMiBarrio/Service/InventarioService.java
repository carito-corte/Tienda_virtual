/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.TIendaVirtualMiBarrio.Service;

import com.example.TIendaVirtualMiBarrio.Models.Inventario;
import java.util.List;


/**
 *
 * @author duvan
 */
public interface InventarioService {
  public Inventario save(Inventario inventario);
  public void delete(Integer id);
  public Inventario findById(Integer id);
  public List<Inventario> findbyAll();
    
}
