/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TIendaVirtualMiBarrio.Controller;

import com.example.TIendaVirtualMiBarrio.Models.Sucursal;
import com.example.TIendaVirtualMiBarrio.Models.Sucursal;
import com.example.TIendaVirtualMiBarrio.Service.SucursalService;
import com.example.TIendaVirtualMiBarrio.Service.SucursalService;
import java.util.List;

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
@RequestMapping("/sucursal")

public class SucursalController {
    @AutoWired
    
    private SucursalService sucursalService;
    
    @PostMapping(value="/")
    public ResponseEntity<Sucursal> agregar (@RequestBody Sucursal sucursal){
        Sucursal obj = sucursalService.save(sucursal);
        return new ResponseEntity<>(obj ,HttpStatus.OK);
    }
    
    @DeleteMapping(value="/{id}")
    public ResponseEntity<Sucursal> eliminar (@PathVariable Integer id){
        Sucursal obj = sucursalService.findById(id);
        if(obj!=null){
            sucursalService.delete(id);
        }
        else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    
    @PutMapping(value("/"))
    public ResponseEntity<Sucursal> editar (@RequestBody Sucursal sucursal){
        Sucursal obj = sucursalService.findById(sucursal.getIdSucursal());
        if(obj!=null){
            obj.setCiudadSucursal(sucursal.getCiudadSucursal());
            obj.setDireccionSucursal(sucursal.getDireccionSucursal());
            obj.setIdVentaIngresoSucursal(sucursal.getIdVentaIngreso());
            obj.setIdCompraEgresoSucursal(sucursal.getIdCompraEgreso());
            
            sucursalService.save(obj);
            
        }
        else
            return new ResponseEntity<>(obj,HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @GetMapping("/list")
    public List<Sucursal> consultarTodo(){
        return sucursalService.findByAll();
        
    }
    @GetMapping("/list/{id}")
    public Sucursal consultarPorId(@PathVariable Integer id){
        return sucursalService.findById(id);
    }
    
    
}
