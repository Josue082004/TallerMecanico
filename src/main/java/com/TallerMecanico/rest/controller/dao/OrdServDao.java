package com.TallerMecanico.rest.controller.dao;

import com.TallerMecanico.rest.controller.dao.implement.AdapterDao;
import com.TallerMecanico.rest.controller.dao.implement.InterfaceActions;
import com.TallerMecanico.rest.models.OrdenServicio;
import com.TallerMecanico.rest.models.Servicio;
import com.google.gson.Gson;

public class OrdServDao extends AdapterDao<OrdenServicio> implements InterfaceActions<OrdenServicio>{
   public OrdenServicio ordServ;

   public OrdServDao(){
      super(OrdenServicio.class);
      gson = new Gson();
   }

   public OrdenServicio getOrdenServicio (){
      if (this.ordServ ==null){
         this.ordServ = new OrdenServicio();
      }
      return ordServ;
   }

   public boolean save() throws Exception {
      Integer id = listAll().getSize()+1;
      this.getOrdenServicio().setId(id);
      this.persist(this.ordServ);
      return true;
   }

   public String toJSON() throws Exception {
      return gson.toJson(getOrdenServicio());
   }

   public OrdenServicio getByID(Integer id) throws Exception {
      return this.get(id);
   }

   public String getJSONByID(Integer id) throws Exception {
      return gson.toJson(getOrdenServicio());
   }

   public void setOrdServ(OrdenServicio  NewOrdServ) {
      this.ordServ = NewOrdServ;
   }

   public void fromJSON(String json) throws Exception {
      this.ordServ = gson.fromJson(json, OrdenServicio.class);
   }
}
