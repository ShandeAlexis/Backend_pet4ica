package com.appMascotas.Pet4Ica.Service.Impl;

import com.appMascotas.Pet4Ica.Dto.LoginDTO;
import com.appMascotas.Pet4Ica.Dto.UsuarioDTO;
import com.appMascotas.Pet4Ica.Entity.Usuario;
import com.appMascotas.Pet4Ica.Repo.UsuarioRepo;
import com.appMascotas.Pet4Ica.Service.UsuarioService;
import com.appMascotas.Pet4Ica.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioIMPL implements UsuarioService {
    @Autowired
    private UsuarioRepo usuarioRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String addUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario(
                usuarioDTO.getUsuarioid(),
                usuarioDTO.getUsuarioname(),
                usuarioDTO.getEmail(),
                this.passwordEncoder.encode(usuarioDTO.getPassword())
        );
        usuarioRepo.save(usuario);
        return usuario.getUsuarioname();
    }
    UsuarioDTO usuarioDTO;
    @Override
    public LoginResponse loginUsuario(LoginDTO loginDTO) {
        String msg= "";
        Usuario usuario1= usuarioRepo.findByEmail(loginDTO.getEmail());
        if (usuario1!= null){
            String password = loginDTO.getPassword();
            String encodedPassword = usuario1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight){
                Optional<Usuario> usuario= usuarioRepo.findOneByEmailAndPassword(loginDTO.getEmail(),encodedPassword);
                if (usuario.isPresent()){
                    return new LoginResponse("Login Success",true);
                } else {
                    return new LoginResponse("Login Failed",false);
                }
            } else {
                return new LoginResponse("password Not Match", false);
            }
        } else {
            return new LoginResponse("Email no exists", false);
        }
    }
}
