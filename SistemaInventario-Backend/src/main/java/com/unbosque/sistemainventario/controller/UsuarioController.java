package com.unbosque.sistemainventario.controller;

import com.unbosque.sistemainventario.model.Usuario;
import com.unbosque.sistemainventario.service.serviceApi.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/usuario"})
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> getAllUsuarios() {
        List<Usuario> usuario = usuarioService.getUsuarios();
        return  new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @PostMapping("/nuevo")
    public ResponseEntity<Usuario> saveProducto(@RequestBody Usuario usuario) {
        if (usuarioService.verificarUsuario(usuario)) {
            Usuario user = usuarioService.insertUsuario(usuario);
            return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Usuario> deleteUsuario(@PathVariable Long id) {
        usuarioService.deleteUsuario(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    @PatchMapping("/editar/{idUsuario}")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable Long idUsuario, @RequestBody Usuario usuario) {
        usuarioService.updateUsuario(idUsuario, usuario);
        return new ResponseEntity<>(usuarioService.getUsuarioById(idUsuario), HttpStatus.OK);
    }
    
    
    
    @GetMapping("/{usuario}")
    public ResponseEntity<Usuario> verificarUsuarioByUser(@PathVariable String usuario) {
    	   Usuario user = usuarioService.verificarUsuarioByUser(usuario);
    	 return  new ResponseEntity<>(user, HttpStatus.OK);
    }
    
}
