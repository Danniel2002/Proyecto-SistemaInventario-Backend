package com.unbosque.sistemainventario.repository;

import com.unbosque.sistemainventario.model.Proveedor;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends CrudRepository <Proveedor, Long> {
    
}
