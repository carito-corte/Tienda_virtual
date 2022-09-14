 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TIendaVirtualMiBarrio.Controller;


import com.example.TIendaVirtualMiBarrio.Models.Inventario;
import com.example.TIendaVirtualMiBarrio.Models.Inventario;
import com.example.TIendaVirtualMiBarrio.Service.InventarioService;
import com.example.TIendaVirtualMiBarrio.Service.InventarioService;
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
@RequestMapping("/inventario")

public class InventarioController {
    
    @AutoWired
    
    private InventarioService inventarioService;
    
    @PostMapping(value="/")
    public ResponseEntity<Inventario> agregar (@RequestBody Inventario inventario){
        Inventario obj = inventarioService.save(inventario);
        return new ResponseEntity<>(obj ,HttpStatus.OK);
    }
    
    @DeleteMapping(value="/{id}")
    public ResponseEntity<Inventario> eliminar (@PathVariable Integer id){
        Inventario obj = inventarioService.findById(id);
        if(obj!=null){
            inventarioService.delete(id);
        }
        else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    
    @PutMapping(value("/"))
    public ResponseEntity<Inventario> editar (@RequestBody Inventario inventario){
        Inventario obj = inventarioService.findById(inventario.getIdInventario());
        if(obj!=null){
            obj.setIdBodega(inventario.getIdBodega());
            obj.setNombre(inventario.getNombre());
            obj.setCantidad(inventario.getCantidad());
            
            obj.setIdSucursal(inventario.getIdSucursal());
            
            inventarioService.save(obj);
            
        }
        else
            return new ResponseEntity<>(obj,HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @GetMapping("/list")
    public List<Inventario> consultarTodo(){
        return inventarioService.findByAll();
        
    }
    @GetMapping("/list/{id}")
    public Inventario consultarPorId(@PathVariable Integer id){
        return inventarioService.findById(id);
    }
    
}