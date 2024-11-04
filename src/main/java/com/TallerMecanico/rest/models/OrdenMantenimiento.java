package com.TallerMecanico.rest.models;

import java.time.LocalDate;

public class OrdenMantenimiento {
    private Integer id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String descripcion;
    private float kilometraje;
    private EstadoOrden idEstadoOrden;
    private Vehiculo idVehiculo;

    public OrdenMantenimiento() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Date getFechaInicio() {
        return fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public Date getFechaFin() {
        return fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public float getKilometraje() {
        return kilometraje;
    }
    
    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }
    
    public EstadoOrden getIdEstadoOrden() {
        return idEstadoOrden;
    }
    
    public void setIdEstadoOrden(EstadoOrden idEstadoOrden) {
        this.idEstadoOrden = idEstadoOrden;
    }
    
    public Vehiculo getIdVehiculo() {
        return idVehiculo;
    }
    
    public void setIdVehiculo(Vehiculo idVehiculo) {
        this.idVehiculo = idVehiculo;
    }
}
