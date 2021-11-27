package com.unbosque.sistemainventario.controller;

import java.util.List;

import com.unbosque.sistemainventario.model.Producto;
import com.unbosque.sistemainventario.model.Reporte;
import com.unbosque.sistemainventario.service.serviceApi.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/producto"})
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> getAllProductos() {
        List<Producto> producto = productoService.getProductos();
        return new ResponseEntity<>(producto, HttpStatus.OK);
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<Producto> getProducto(@PathVariable Long id) {
        Producto producto = productoService.getProductoById(id);
        return new ResponseEntity<>(producto, HttpStatus.OK);
    }
    @GetMapping({"/nombre/{nombre}"})
    public ResponseEntity<Producto> getEntity(@PathVariable String nombre) {
        Producto producto = productoService.getProductoByNombre(nombre);
        return new ResponseEntity<>(producto, HttpStatus.OK);
    }

    @PostMapping("/nuevo")
    public ResponseEntity<Producto> saveProducto(@RequestBody Producto producto) {
        Producto prod = productoService.insertProducto(producto);
        return new ResponseEntity<>(prod, HttpStatus.CREATED);
    }
    
    @PatchMapping("/editar/{id}")
    public ResponseEntity<Producto> updateProducto(@PathVariable Long id, @RequestBody Producto producto) {
        productoService.updateProducto(id, producto);
        return new ResponseEntity<>(productoService.getProductoById(id), HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Producto> deleteProducto(@PathVariable Long id) {
        productoService.deleteProducto(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    
    
    

}