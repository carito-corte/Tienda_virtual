/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TIendaVirtualMiBarrio.Service.Implement;
import com.example.TIendaVirtualMiBarrio.Dao.SucursalDao;
import com.example.TIendaVirtualMiBarrio.Models.Sucursal;
import com.example.TIendaVirtualMiBarrio.Service.SucursalService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author duvan
 */
@Service
public class SucursalServiceImplement implements SucursalService{
    @Autowired
    private SucursalDao sucursalDao;
    

    
    @Override
    @Transactional(readOnly=false)
    public Sucursal save(Sucursal sucursal){
        return sucursalDao.save(sucursal);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id){
        sucursalDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly=true)
    public Sucursal findById(Integer id){
        return sucursalDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=true)
    public List<Sucursal>  findByAll(){
        return(List<Sucursal>) sucursalDao.findAll();
    }
    
}
