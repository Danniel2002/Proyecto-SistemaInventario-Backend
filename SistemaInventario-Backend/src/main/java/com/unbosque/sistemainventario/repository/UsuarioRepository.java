package com.unbosque.sistemainventario.repository;


import com.unbosque.sistemainventario.model.Usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository <Usuario, Long> {
    Optional<Usuario> findByUsuario(String usuario);
}
