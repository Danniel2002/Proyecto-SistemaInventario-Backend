package com.unbosque.sistemainventario.service.serviceApi;

import com.unbosque.sistemainventario.model.Producto;
import com.unbosque.sistemainventario.model.Usuario;

import java.util.List;

public interface UsuarioService {

	List<Usuario> getUsuarios();
    Usuario getUsuarioById(Long idUsuario);
    Usuario insertUsuario(Usuario usuario);
    void deleteUsuario(Long id);
    void updateUsuario(Long id, Usuario usuario);
    boolean verificarCredenciales(Usuario usuario);
    boolean verificarUsuario(Usuario usuario);
    Usuario verificarUsuarioByUser(String usuario);
}
