/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TIendaVirtualMiBarrio.Service.Implement;

import com.example.TIendaVirtualMiBarrio.Dao.InventarioDao;
import com.example.TIendaVirtualMiBarrio.Models.Inventario;
import com.example.TIendaVirtualMiBarrio.Service.InventarioService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author duvan
 */

@Service
public class InventarioServiceImplement implements InventarioService{
    @Autowired
    private InventarioDao inventarioDao;


    @Override
    @Transactional (readOnly=false)
    public Inventario save (Inventario inventario){
        return inventarioDao.save(inventario);

    }
    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id){
        inventarioDao.deleteById(id);
    }
    @Override
    @Transactional(readOnly=true)
    public Inventario findById(Integer id){
        return inventario.Dao.findById(id).orElse(null);
    }
    @Override
    @Transactional(readOnly=true)
    public List<inventario> findByAll(){
        return (List<Inventario>) inventarioDao.findAll();
    }
}