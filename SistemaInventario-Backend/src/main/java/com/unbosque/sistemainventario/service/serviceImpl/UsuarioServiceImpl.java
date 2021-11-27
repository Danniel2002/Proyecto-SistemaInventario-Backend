package com.unbosque.sistemainventario.service.serviceImpl;

import com.unbosque.sistemainventario.service.serviceApi.UsuarioService;

import com.unbosque.sistemainventario.model.Usuario;
import com.unbosque.sistemainventario.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService{

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getUsuarios() {
        List<Usuario> usuario = new ArrayList<>();
        usuarioRepository.findAll().forEach(usuario::add);
        return usuario;
    }

    @Override
    public Usuario insertUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public boolean verificarCredenciales(Usuario usuario) {
        String query = "FROM Usuario WHERE usuario=:usuario AND contrasena=:contrasena";
        List<Usuario> lista = entityManager.createQuery(query)
                .setParameter("usuario", usuario.getUsuario())
                .setParameter("contrasena", usuario.getContrasena())
                .getResultList();
        return !lista.isEmpty();
    }

    @Override
    public boolean verificarUsuario(Usuario usuario) {
        String query = "FROM Usuario WHERE usuario=:usuario";
        List<Usuario> lista = entityManager.createQuery(query)
                .setParameter("usuario", usuario.getUsuario())
                .getResultList();
        return lista.isEmpty();
    }

	@Override
	  public Usuario getUsuarioById(Long idUsuario) {
        Usuario usuario = usuarioRepository.findById(idUsuario).get();
        return usuario;
    }

	@Override
	public void updateUsuario(Long id, Usuario usuario) {
        Usuario upUsuario = usuarioRepository.findById(id).get();
        if (usuario.getUsuario() != null && !usuario.getUsuario().isEmpty()) {
            upUsuario.setUsuario(usuario.getUsuario());
        }
        if (usuario.getContrasena() != null && !usuario.getContrasena().isEmpty()) {
            upUsuario.setContrasena(usuario.getContrasena());
        }
        if (usuario.getNombre() != null && !usuario.getNombre().isEmpty()) {
            upUsuario.setNombre(usuario.getNombre());
        }
        if (usuario.getApellido() != null && !usuario.getApellido().isEmpty()) {
            upUsuario.setApellido(usuario.getApellido());
        }
        if (usuario.getCorreo() != null && !usuario.getCorreo().isEmpty()) {
            upUsuario.setCorreo(usuario.getCorreo());
        }
        if (usuario.getEstado() != null && !usuario.getEstado().isEmpty()) {
            upUsuario.setEstado(usuario.getEstado());
        }
        if (usuario.getCargo() != null && !usuario.getCargo().isEmpty()) {
            upUsuario.setCargo(usuario.getCargo());
        }
        usuarioRepository.save(upUsuario);
    }

	@Override
    public Usuario verificarUsuarioByUser(String nombre) {
		Usuario usuario = usuarioRepository.findByUsuario(nombre).get();
        return usuario;
    }


//    @Override
//    public boolean verificarUsuarioByUser(String usuario) {
//        if (usuarioRepository.findByUser(usuario)){
//            return true;
//        } else {
//            return false;
//        }
//    }
}
