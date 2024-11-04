package com.TallerMecanico.rest.models;

public class Respuesto {
   private Integer id;
   private String nombre;
   private Float precio;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public Float getPrecio() {
      return precio;
   }

   public void setPrecio(Float precio) {
      this.precio = precio;
   }
}
