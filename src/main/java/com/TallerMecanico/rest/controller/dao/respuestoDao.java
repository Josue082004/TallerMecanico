package com.TallerMecanico.rest.controller.dao;

import com.TallerMecanico.rest.controller.dao.implement.AdapterDao;
import com.TallerMecanico.rest.controller.dao.implement.InterfaceActions;
import com.TallerMecanico.rest.models.Respuesto;
import com.google.gson.Gson;

public class respuestoDao extends AdapterDao<Respuesto> implements InterfaceActions<Respuesto> {
   private Respuesto repuesto;

   public respuestoDao(){
      super(Respuesto.class);
      gson = new Gson();
   }

   public Respuesto getRepuesto (){
      if (this.repuesto == null){
         this.repuesto = new Respuesto();
      }
      return repuesto;
   }

   public boolean save() throws Exception {
      Integer id = listAll().getSize()+1;
      this.getRepuesto().setId(id);
      this.persist(this.repuesto);
      return true;
   }

   public String toJSON() throws Exception {
      return gson.toJson(this.getRepuesto());
   }

   public Respuesto getByID(Integer id) throws Exception {
      return this.get(id);
   }

   public String getJSONByID(Integer id) throws Exception {
      return gson.toJson(getByID(id));
   }

   public void setRepuesto(Respuesto Nuevorepuesto) {
      this.repuesto = Nuevorepuesto;
   }

   public void fromJSON(String json) throws Exception {
      this.repuesto = gson.fromJson(json, Respuesto.class);
   }








}
