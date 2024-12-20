package com.TallerMecanico.rest.controller.dao.implement;
import com.TallerMecanico.rest.controller.tda.list.LinkedList;

public interface InterfazDao <T> {
    public void persist(T object) throws Exception;
    public void merge(T object, Integer index) throws Exception;
    public LinkedList<T> getlistAll() throws Exception;
    public T get(Integer id) throws Exception;    
}