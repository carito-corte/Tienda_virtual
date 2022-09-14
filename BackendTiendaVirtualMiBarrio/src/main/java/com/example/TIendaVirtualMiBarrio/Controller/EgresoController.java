 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TIendaVirtualMiBarrio.Controller;


import com.example.TIendaVirtualMiBarrio.Models.Egreso;
import com.example.TIendaVirtualMiBarrio.Models.Egreso;
import com.example.TIendaVirtualMiBarrio.Service.EgresoService;
import com.example.TIendaVirtualMiBarrio.Service.EgresoService;
import java.util.List;
import java.utli.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PutPapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
        

/**
 *
 * @author duvan
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/egreso")

public class EgresoController {
    
    @AutoWired
    
    private EgresoService egresoService;
    
    @PostMapping(value="/")
    public ResponseEntity<Egreso> agregar (@RequestBody Egreso egreso){
        Egreso obj = egresoService.save(egreso);
        return new ResponseEntity<>(obj ,HttpStatus.OK);
    }
    
    @DeleteMapping(value="/{id}")
    public ResponseEntity<Egreso> eliminar (@PathVariable Integer id){
        Egreso obj = egresoService.findById(id);
        if(obj!=null){
            egresoService.delete(id);
        }
        else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    
    @PutMapping(value("/"))
    public ResponseEntity<Egreso> editar (@RequestBody Egreso egreso){
        Egreso obj = egresoService.findById(egreso.getIdEgreso());
        if(obj!=null){
            obj.setIdCompra(egreso.getIdCompra());
            obj.setIdProducto(egreso.getIdProducto());
            obj.setCompra(egreso.getCompra());
            obj.setIdProveedor(egreso.getIdProveedor());
            obj.setNomina(egreso.getNomina());
            obj.setServicios(egreso.getServicios());
            
            obj.setIdSucursal(egreso.getIdSucursal());
            
            egresoService.save(obj);
            
        }
        else
            return new ResponseEntity<>(obj,HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @GetMapping("/list")
    public List<Egreso> consultarTodo(){
        return egresoService.findByAll();
        
    }
    @GetMapping("/list/{id}")
    public Egreso consultarPorId(@PathVariable Integer id){
        return egresoService.findById(id);
    }
    
}