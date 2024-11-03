package com.TallerMecanico.rest.models;

public class Servicio {
   private Integer id;
   private String cod_servicio;
   private String descripcion;
   private Float precio;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getCod_servicio() {
      return cod_servicio;
   }

   public void setCod_servicio(String cod_servicio) {
      this.cod_servicio = cod_servicio;
   }

   public String getDescripcion() {
      return descripcion;
   }

   public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
   }

   public Float getPrecio() {
      return precio;
   }

   public void setPrecio(Float precio) {
      this.precio = precio;
   }
}