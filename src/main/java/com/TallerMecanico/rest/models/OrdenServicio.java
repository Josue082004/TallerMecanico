package com.TallerMecanico.rest.models;

public class OrdenServicio {
   private Integer id;
   private String id_orden;
   private String id_servicio;

   public Integer getId() {
      return id;
   }
   
   public void setId(Integer id) {
      this.id = id;
   }

   public String getId_orden() {
      return id_orden;
   }

   public void setId_orden(String id_orden) {
      this.id_orden = id_orden;
   }

   public String getId_servicio() {
      return id_servicio;
   }

   public void setId_servicio(String id_servicio) {
      this.id_servicio = id_servicio;
   }
}
