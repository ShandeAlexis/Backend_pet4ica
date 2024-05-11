package com.appMascotas.Pet4Ica.Dto;



public class UsuarioDTO {


    private int usuarioid;

    private String usuarioname;

    private String email;

    private String password;

    public UsuarioDTO(int usuarioid, String usuarioname, String email, String password) {
        this.usuarioid = usuarioid;
        this.usuarioname = usuarioname;
        this.email = email;
        this.password = password;
    }

    public UsuarioDTO() {
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
        return "UsuarioDTO{" +
                "usuarioid=" + usuarioid +
                ", usuarioname='" + usuarioname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
