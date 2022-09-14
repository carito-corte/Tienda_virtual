/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TIendaVirtualMiBarrio.Service.Implement;

import com.example.TIendaVirtualMiBarrio.Dao.AdministradorDao;
import com.example.TIendaVirtualMiBarrio.Models.Administrador;
import com.example.TIendaVirtualMiBarrio.Service.AdministradorService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author duvan
 */    
}
        



@Service
public class AdministradorServiceImplement implements AdministradorService {
    @Autowired
    private AdministradorDao administradorDao;
    


    @Override
    @Transactional(readOnly=false)
    public Administrador save (Administrador administrador){
        return administradorDao.save(administrador);
    }
    
    @Override
    @Transactional (readOnly=false)
    public void delete (Integer id){
    administradorDao.deleteById(id);
     }

    @Override
    @Transactional(reanOnly=true)
    public Administrador findById(Integer id){
        return administradorDao.findById(id).orElse(null);
            }

    @Override
    @Transactional(readOnly=true)
    public List<Administrador> findByAll(){
    return (List<Administrador>) administradorDao.findAll();
    }
}
