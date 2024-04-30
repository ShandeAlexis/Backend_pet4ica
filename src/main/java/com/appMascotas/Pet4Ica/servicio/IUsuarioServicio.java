package com.appMascotas.Pet4Ica.servicio;

import com.appMascotas.Pet4Ica.modelo.Usuario;

import java.util.List;

public interface IUsuarioServicio {
    public List<Usuario> listarUsuarios();
    public Usuario buscarUsuarioPorId(Integer idUsuario);
    public Usuario guardarUsuario(Usuario usuario);
    public  void eliminarUsuario(Usuario usuario);
}
