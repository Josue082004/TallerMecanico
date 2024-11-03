package com.TallerMecanico.rest.models;

public class Persona {
    private Integer id;
    private String nombre;
    private String apellido;
    private Int telefono;
    private String email;
    private Integer direccion_id;
    private int Cedula;

public Persona(){}

public Persona(Integer id, String nombre, String apellido, Int telefono, String email, Integer direccion_id, int Cedula){
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.telefono = telefono;
    this.email = email;
    this.direccion_id = direccion_id;
    this.Cedula = Cedula;
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

    public Int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(Int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDireccion_id() {
        return this.direccion_id;
    }

    public void setDireccion_id(Integer direccion_id) {
        this.direccion_id = direccion_id;
    }

    public int getCedula() {
        return this.Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

}
