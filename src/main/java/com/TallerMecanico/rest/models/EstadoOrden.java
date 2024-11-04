package com.TallerMecanico.rest.models;

public class EstadoOrden {
    private Integer id;
    private String nombre;

    public EstadoOrden() {}

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
}
