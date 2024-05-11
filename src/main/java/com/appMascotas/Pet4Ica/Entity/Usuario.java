package com.appMascotas.Pet4Ica.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @Column(name = "usuario_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int usuarioid;

    @Column(name = "usuario_name",length = 255)
    private String usuarioname;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "password", length = 255)
    private String password;

    public Usuario(int usuarioid, String usuarioname, String email, String password) {
        this.usuarioid = usuarioid;
        this.usuarioname = usuarioname;
        this.email = email;
        this.password = password;
    }

    public Usuario() {
    }


    public int getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }

    public String getUsuarioname() {
        return usuarioname;
    }

    public void setUsuarioname(String usuarioname) {
        this.usuarioname = usuarioname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuarioid=" + usuarioid +
                ", usuarioname='" + usuarioname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
