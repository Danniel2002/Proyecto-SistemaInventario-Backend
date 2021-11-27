package com.unbosque.sistemainventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unbosque.sistemainventario.model.Producto;
import com.unbosque.sistemainventario.model.Reporte;
import com.unbosque.sistemainventario.service.serviceApi.ReporteService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/reporte"})
public class ReporteController {
	
	@Autowired
    private ReporteService reporteService;
	
	
	@GetMapping
    public ResponseEntity<List<Reporte>> getAllReportes() {
        List<Reporte> reporte = reporteService.getReportes();
        return new ResponseEntity<>(reporte, HttpStatus.OK);
    }
	
	@PostMapping("/nuevo")
    public ResponseEntity<Reporte> saveProducto(@RequestBody Reporte reporte) {
        Reporte rep = reporteService.insertReporte(reporte);
        return new ResponseEntity<>(rep, HttpStatus.CREATED);
    }

}
