package com.TallerMecanico.rest.controller.dao.implement;

public interface InterfaceActions<T> {
   public boolean save()throws Exception;
   public String toJSON()throws Exception;
   public T getByID (Integer id) throws Exception;
   public String getJSONByID (Integer id) throws Exception;
   public void fromJSON(String json)throws Exception;
}
