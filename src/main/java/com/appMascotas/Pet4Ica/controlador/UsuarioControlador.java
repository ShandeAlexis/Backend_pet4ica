package com.appMascotas.Pet4Ica.controlador;

import com.appMascotas.Pet4Ica.modelo.Usuario;
import com.appMascotas.Pet4Ica.servicio.IUsuarioServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pet4ica")
public class UsuarioControlador {
    private static final Logger logger=
            LoggerFactory.getLogger(UsuarioControlador.class);

    @Autowired
    private IUsuarioServicio usuarioServicio;

    @GetMapping("/usuarios")
    public List<Usuario> obtenerUsuarios(){
        var usuarios= usuarioServicio.listarUsuarios();
        usuarios.forEach((usuario -> logger.info(usuario.toString())));
        return usuarios;
    }



}
