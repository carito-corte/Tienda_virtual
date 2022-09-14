 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TIendaVirtualMiBarrio.Controller;


import com.example.TIendaVirtualMiBarrio.Models.Ingreso;
import com.example.TIendaVirtualMiBarrio.Models.Ingreso;
import com.example.TIendaVirtualMiBarrio.Service.IngresoService;
import com.example.TIendaVirtualMiBarrio.Service.IngresoService;
import java.util.List;
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
@RequestMapping("/ingreso")

public class IngresoController {
    
    @AutoWired
    
    private IngresoService ingresoService;
    
    @PostMapping(value="/")
    public ResponseEntity<Ingreso> agregar (@RequestBody Ingreso ingreso){
        Ingreso obj = ingresoService.save(ingreso);
        return new ResponseEntity<>(obj ,HttpStatus.OK);
    }
    
    @DeleteMapping(value="/{id}")
    public ResponseEntity<Ingreso> eliminar (@PathVariable Integer id){
        Ingreso obj = ingresoService.findById(id);
        if(obj!=null){
            ingresoService.delete(id);
        }
        else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    
    @PutMapping(value("/"))
    public ResponseEntity<Ingreso> editar (@RequestBody Ingreso ingreso){
        Ingreso obj = ingresoService.findById(ingreso.getIdIngreso());
        if(obj!=null){
            obj.setIdVenta(ingreso.getIdVenta());
            obj.setIdProducto(ingreso.getIdProducto());
            obj.setCompra(ingreso.getCompra());
            
            obj.setIngresoTotal(Ingreso.getIngresoTotal());
            
            obj.setIdSucursal(Ingreso.getIdSucursal());
            
            ingresoService.save(obj);
            
        }
        else
            return new ResponseEntity<>(obj,HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @GetMapping("/list")
    public List<Ingreso> consultarTodo(){
        return ingresoService.findByAll();
        
    }
    @GetMapping("/list/{id}")
    public Ingreso consultarPorId(@PathVariable Integer id){
        return ingresoService.findById(id);
    }
    
}