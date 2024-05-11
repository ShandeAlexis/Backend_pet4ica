package com.appMascotas.Pet4Ica.Repo;

import com.appMascotas.Pet4Ica.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface UsuarioRepo extends JpaRepository<Usuario,Integer> {
    Optional<Usuario> findOneByEmailAndPassword(String email, String password);
    Usuario findByEmail(String email);

}
