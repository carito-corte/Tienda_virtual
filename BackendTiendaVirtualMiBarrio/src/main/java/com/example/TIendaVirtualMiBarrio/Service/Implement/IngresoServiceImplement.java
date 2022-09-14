/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TIendaVirtualMiBarrio.Service.Implement;
import com.example.TIendaVirtualMiBarrio.Dao.IngresoDao;
import com.example.TIendaVirtualMiBarrio.Models.Ingreso;
import com.example.TIendaVirtualMiBarrio.Service.IngresoService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 *
 * @author duvan
 */
@Service
public class IngresoServiceImplement implements IngresoService {
    @Autowired
    private IngresoDao ingresoDao;
    
    @Override
    @Transactional(readOnly=false)
    public Ingreso save(Ingreso ingreso){
        return ingresoDao.save(ingreso);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id){
        ingresoDao.deleteById(id);

    }

    @Override
    @Transactional(readonly=true)
    public Ingreso findById(Integer id){
        return ingresoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=true)
    public List<Ingreso> findByAll(){
        return (List<Ingreso>) ingreso.Dao.findAll();
    }

}
