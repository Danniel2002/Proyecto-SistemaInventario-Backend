package com.unbosque.sistemainventario.model;

import javax.persistence.*;

@Entity
@Table (name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long idUsuario;
    @Column (name = "usuario")
    private String usuario;
    @Column (name = "contrasena")
    private String contrasena;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "apellido")
    private String apellido;
    @Column (name = "correoElectronico")
    private String correo;
    @Column (name = "estado")
    private String estado;
    @Column (name = "cargo")
    private String cargo;
    //@ManyToOne
    //@JoinColumn(name = "cargo", referencedColumnName = "idCargo")
    //private Cargo cargo;

    public Usuario() {    }

    public Usuario(long idUsuario, String usuario, String contrasena, String correo, String cargo) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.correo = correo;
        this.cargo = cargo;
    }

    public long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return this.contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() { return correo; }

    public void setCorreo(String correo) { this.correo = correo; }

    public String getEstado() { return estado; }

    public void setEstado(String estado) { this.estado = estado; }

    public String getCargo() { return cargo; }

    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }
}