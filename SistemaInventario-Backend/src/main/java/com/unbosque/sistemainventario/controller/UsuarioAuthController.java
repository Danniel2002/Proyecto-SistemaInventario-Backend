package com.unbosque.sistemainventario.controller;

import com.unbosque.sistemainventario.model.Usuario;
import com.unbosque.sistemainventario.service.serviceApi.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/usuario"})
public class UsuarioAuthController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario usuario) {
        if (usuarioService.verificarCredenciales(usuario))
            return new ResponseEntity<>(usuario, HttpStatus.ACCEPTED);
        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
}
