package com.unbosque.sistemainventario.repository;

import com.unbosque.sistemainventario.model.Compra;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends CrudRepository<Compra, Long> {
    
}
