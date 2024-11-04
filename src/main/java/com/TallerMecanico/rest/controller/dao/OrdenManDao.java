package com.TallerMecanico.rest.controller.dao;

import com.TallerMecanico.rest.models.OrdenMantenimiento;
import com.google.gson.Gson;

public class OrdenManDao extends AdapterDao<OrdenMantenimiento> {
    private OrdenMantenimiento ordenMantenimiento;
    private Gson gson = new Gson();

    public OrdenManDao() {
        super(OrdenMantenimiento.class);
    }

    public OrdenMantenimiento getOrdenMantenimiento() {
        if (this.ordenMantenimiento == null) {
            this.ordenMantenimiento = new OrdenMantenimiento();
            
        }
        return ordenMantenimiento;
    }

    public String toJson(OrdenMantenimiento ordenMantenimiento) throws Exception {
        return gson.toJson(ordenMantenimiento);
    }

    public OrdenMantenimiento getById(Integer id) throws Exception {
        return this.get(id);
    }

    public String getJSONById(Integer id) throws Exception {
        return this.toJson(this.getById(id));
    }

    public void setOrdenMantenimiento(OrdenMantenimiento ordenMantenimiento) throws Exception {
        this.ordenMantenimiento = ordenMantenimiento;
    }

    public OrdenMantenimiento fromJson(String json) throws Exception {
        return gson.fromJson(json, OrdenMantenimiento.class);
    }
}
