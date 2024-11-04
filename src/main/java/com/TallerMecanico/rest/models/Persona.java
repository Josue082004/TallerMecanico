package com.TallerMecanico.rest.models;

public class Persona {
    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String direccion;
    private String tipodeIdentificacion;
    private String numeroDeIdentificacion;

    public Persona() {
    }

    public Persona(Integer id, String nombre, String apellido, String telefono, String email, String direccion, String tipodeIdentificacion, String numeroDeIdentificacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.tipodeIdentificacion = tipodeIdentificacion;
        this.numeroDeIdentificacion = numeroDeIdentificacion;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipodeIdentificacion() {
        return this.tipodeIdentificacion;
    }

    public void setTipodeIdentificacion(String tipodeIdentificacion) {
        this.tipodeIdentificacion = tipodeIdentificacion;
    }

    public String getNumeroDeIdentificacion() {
        return this.numeroDeIdentificacion;
    }

    public void setNumeroDeIdentificacion(String numeroDeIdentificacion) {
        this.numeroDeIdentificacion = numeroDeIdentificacion;
    }

}

