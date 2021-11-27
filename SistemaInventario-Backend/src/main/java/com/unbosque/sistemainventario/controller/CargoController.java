package com.unbosque.sistemainventario.controller;

import com.unbosque.sistemainventario.model.Cargo;
import com.unbosque.sistemainventario.service.serviceApi.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/usuario/cargo"})
public class CargoController {

    @Autowired
    private CargoService cargoService;

    @GetMapping
    public ResponseEntity<List<Cargo>> getAllCargo() {
        List<Cargo> cargo = cargoService.getCargos();
        return new ResponseEntity<>(cargo, HttpStatus.OK);
    }

    @PostMapping("/nuevo")
    public ResponseEntity<Cargo> saveCargo(@RequestBody Cargo cargo) {
        Cargo carg = cargoService.insertCargo(cargo);
        return new ResponseEntity<>(carg, HttpStatus.CREATED);
    }
}
