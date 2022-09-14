/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TIendaVirtualMiBarrio.Controller;

import com.example.TIendaVirtualMiBarrio.Models.Administrador;
import com.example.TIendaVirtualMiBarrio.Service.AdministradorService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
@RequestMapping("/administrador")
public class AdministradorController {
    @AutoWired
    
    private AdministradorService administradorService;
    
    @PostMapping(value="/")
    public ResponseEntity<Administrador> agregar (@RequestBody Administrador administrador){
        Administrador obj = administradorService.save(administrador);
        return new ResponseEntity<>(obj ,HttpStatus.OK);
    }
    
    @DeleteMapping(value="/{id}")
    public ResponseEntity<Administrador> eliminar (@PathVariable Integer id){
        Administrador obj = administradorService.findById(id);
        if(obj!=null){
            administradorService.delete(id);
        }
        else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    
    @PutMapping(value("/"))
    public ResponseEntity<Administrador> editar (@RequestBody Administrador administrador){
        Administrador obj = administradorService.findById(administrador.getIdAdministrador());
        if(obj!=null){
            obj.setNombreAdministrador(administrador.getNombreAdministrador());
            obj.setEmailAdministrador(administrador.getClaveAdministrador());
            
            administradorService.save(obj);
            
        }
        else
            return new ResponseEntity<>(obj,HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @GetMapping("/list")
    public List<Administrador> consultarTodo(){
        return administradorService.findByAll();
        
    }
    @GetMapping("/list/{id}")
    public Administrador consultarPorId(@PathVariable Integer id){
        return administradorService.findById(id);
    }
    
    
    
}


