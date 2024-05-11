package com.appMascotas.Pet4Ica.Service;

import com.appMascotas.Pet4Ica.Dto.LoginDTO;
import com.appMascotas.Pet4Ica.Dto.UsuarioDTO;
import com.appMascotas.Pet4Ica.response.LoginResponse;

public interface UsuarioService {
    String addUsuario(UsuarioDTO usuarioDTO);

    LoginResponse loginUsuario(LoginDTO loginDTO);
}
