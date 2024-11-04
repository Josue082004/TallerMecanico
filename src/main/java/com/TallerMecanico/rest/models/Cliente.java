package com.TallerMecanico.rest.models;

public class Cliente {
    private Integer id;
    private Persona persona;
    private Vehiculo vehiculo;

    public Cliente() {
    }

    public Cliente(Integer id, Persona persona, Vehiculo vehiculo) {
        this.id = id;
        this.persona = persona;
        this.vehiculo = vehiculo;
    }

    // Constructor adicional que no requiere un ID
    // Este constructor es útil cuando el ID se genera automáticamente
    // y no es necesario proporcionarlo al crear una instancia de Cliente.
    public Cliente(Persona persona, Vehiculo vehiculo) {
        this.persona = persona;
        this.vehiculo = vehiculo;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Persona getPersona() {
        return this.persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}