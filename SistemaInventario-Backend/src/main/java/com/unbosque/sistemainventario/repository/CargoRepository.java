package com.unbosque.sistemainventario.repository;

import com.unbosque.sistemainventario.model.Cargo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, Long> {
    
}
