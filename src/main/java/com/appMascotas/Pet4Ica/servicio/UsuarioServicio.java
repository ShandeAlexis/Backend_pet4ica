package com.appMascotas.Pet4Ica.servicio;

import com.appMascotas.Pet4Ica.modelo.Usuario;
import com.appMascotas.Pet4Ica.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioServicio implements IUsuarioServicio {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public Usuario buscarUsuarioPorId(Integer idUsuario) {
        Usuario usuario= usuarioRepositorio.findById(idUsuario).orElse(null);
        return usuario;
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        usuarioRepositorio.delete(usuario);
    }
}
