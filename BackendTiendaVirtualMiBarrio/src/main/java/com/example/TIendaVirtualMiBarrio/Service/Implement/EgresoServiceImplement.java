/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TIendaVirtualMiBarrio.Service.Implement;

import com.example.TIendaVirtualMiBarrio.Dao.EgresoDao;
import com.example.TIendaVirtualMiBarrio.Models.Egreso;
import com.example.TIendaVirtualMiBarrio.Service.EgresoService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 *
 * @author duvan
 */
@Service
public class EgresoServiceImplement implements EgresoService {
    @Autowired
    private EgresoDao egresoDao;
    

    @Override
    @Transactional(readOnly=false)
    public Egreso save(Egreso egreso){
    return egresoDao.save(egreso);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id){
        egresoDao.deleteById(id);

    }
    @Override
    @Transactional (readOnly=true)
    public Egreso findById(Integer id){
           return egreso.Dao.findById(id).orElse(null);
    }
    @Override
    @Transactional(readOnly=true)
    public List<Egreso> findByAll(){
        return (List<Egreso>) egresoDao.findAll();

    }
}

