package com.unbosque.sistemainventario.service.serviceImpl;

import com.unbosque.sistemainventario.model.Cargo;
import com.unbosque.sistemainventario.repository.CargoRepository;
import com.unbosque.sistemainventario.service.serviceApi.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CargoServiceImpl implements CargoService {

    @Autowired
    private CargoRepository cargoRepository;

    @Override
    public List<Cargo> getCargos() {
        List<Cargo> cargo = new ArrayList<>();
        cargoRepository.findAll().forEach(cargo::add);
        return cargo;
    }

    @Override
    public Cargo insertCargo(Cargo cargo) {return cargoRepository.save(cargo); }
}