package com.unbosque.sistemainventario.repository;

import com.unbosque.sistemainventario.model.Categoria;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends CrudRepository <Categoria, Long> {
    
}
