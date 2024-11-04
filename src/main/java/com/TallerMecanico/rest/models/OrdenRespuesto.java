package com.TallerMecanico.rest.models;

public class OrdenRespuesto {
   private Integer id;
   private String id_repuesto;
   private String id_orden;

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

   public String getId_repuesto() {
      return id_repuesto;
   }

   public void setId_repuesto(String id_repuesto) {
      this.id_repuesto = id_repuesto;
   }
}
