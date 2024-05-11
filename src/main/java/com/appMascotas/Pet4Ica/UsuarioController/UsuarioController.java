package com.appMascotas.Pet4Ica.UsuarioController;

import com.appMascotas.Pet4Ica.Dto.LoginDTO;
import com.appMascotas.Pet4Ica.Dto.UsuarioDTO;
import com.appMascotas.Pet4Ica.Service.UsuarioService;
import com.appMascotas.Pet4Ica.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @PostMapping(path = "/save")
    public String guardarUsuario(@RequestBody UsuarioDTO usuarioDTO){
        String id= usuarioService.addUsuario(usuarioDTO);
        return id;
    }
    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUsuario(@RequestBody LoginDTO loginDTO){
        LoginResponse loginResponse = usuarioService.loginUsuario(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}
