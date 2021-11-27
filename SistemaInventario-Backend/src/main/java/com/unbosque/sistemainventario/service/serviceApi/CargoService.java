package com.unbosque.sistemainventario.service.serviceApi;

import com.unbosque.sistemainventario.model.Cargo;

import java.util.List;

public interface CargoService {

    List<Cargo> getCargos();
    Cargo insertCargo(Cargo cargo);


}