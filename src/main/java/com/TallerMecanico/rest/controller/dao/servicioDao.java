package com.TallerMecanico.rest.controller.dao;

import com.TallerMecanico.rest.controller.dao.implement.InterfaceActions;
import com.TallerMecanico.rest.controller.dao.implement.AdapterDao;
import com.TallerMecanico.rest.models.Respuesto;
import com.TallerMecanico.rest.models.Servicio;
import com.google.gson.Gson;

public class servicioDao extends AdapterDao<Servicio> implements InterfaceActions<Servicio>{
   private Servicio servicio;

   public servicioDao (){
      super(Servicio.class);
      gson = new Gson();
   }

   public Servicio getServicio (){
      if (this.servicio == null){
         this.servicio = new Servicio();
      }
      return servicio;
   }

   public boolean save() throws Exception {
      Integer id = listAll().getSize()+1;
      this.getServicio().setId(id);
      this.persist(this.servicio);
      return true;
   };

   public String toJSON() throws Exception {
      return gson.toJson(getServicio());
   }

   public Servicio getByID(Integer id) throws Exception {
      return this.get(id);
   }

   public String getJSONByID(Integer id) throws Exception {
      return gson.toJson(getByID(id));
   }

   public void setServicio(Servicio servicio) {
   this.servicio = servicio;
   }

   public void fromJSON(String json) throws Exception {
      this.servicio = gson.fromJson(json,Servicio.class);
   }

}
