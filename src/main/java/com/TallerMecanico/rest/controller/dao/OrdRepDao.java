package com.TallerMecanico.rest.controller.dao;

import com.TallerMecanico.rest.controller.dao.implement.AdapterDao;
import com.TallerMecanico.rest.controller.dao.implement.InterfaceActions;
import com.TallerMecanico.rest.models.OrdenRespuesto;
import com.TallerMecanico.rest.models.OrdenServicio;
import com.TallerMecanico.rest.models.Respuesto;
import com.google.gson.Gson;

public class OrdRepDao extends AdapterDao<OrdenRespuesto> implements InterfaceActions<OrdenRespuesto>{
   private OrdenRespuesto ordRes;

   public OrdRepDao (){
      super(OrdenRespuesto.class);
      gson = new Gson();
   }
   
   public OrdenRespuesto getOrdenRespuesto(){
      if (this.ordRes == null){
         this.ordRes = new OrdenRespuesto();
      }
      return ordRes;
   }

   public boolean save() throws Exception {
      Integer id = listAll().getSize()+1;
      this.getOrdenRespuesto().setId(id);
      this.persist(this.ordRes);
      return true;
   }

   public String toJSON() throws Exception {
      return gson.toJson(getOrdenRespuesto());
   }

   public OrdenRespuesto getByID(Integer id) throws Exception {
      return this.get(id);
   }

   public String getJSONByID(Integer id) throws Exception {
      return gson.toJson(getOrdenRespuesto());
   }

   public void setOrdRes(OrdenRespuesto NewOrdRes) {
      this.ordRes = NewOrdRes;
   }

   public void fromJSON(String json) throws Exception {
      this.ordRes = gson.fromJson(json, OrdenRespuesto.class);
   }

}