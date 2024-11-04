package com.TallerMecanico.rest.controller.dao;

import com.TallerMecanico.rest.controller.dao.implement.AdapterDao;
import com.TallerMecanico.rest.models.EstadoOrden;
import com.google.gson.Gson;

public class EstadoOrdDao extends AdapterDao<EstadoOrden> {
    private EstadoOrden estadoOrden;
    private Gson gson = new Gson();

    public EstadoOrdDao() {
        super(EstadoOrden.class);
    }

    public EstadoOrden getEstadoOrden() {
        if (this.estadoOrden == null) {
            this.estadoOrden = new EstadoOrden();
            
        }
        return estadoOrden;
    }

    public void setEstadoOrden(EstadoOrden estadoOrden) throws Exception {
        this.estadoOrden = estadoOrden;
    }

    public String toJson(EstadoOrden estadoOrden) throws Exception {
        return gson.toJson(estadoOrden);
    }

    public EstadoOrden fromJson(String json) throws Exception {
        return gson.fromJson(json, EstadoOrden.class);
    }

    public EstadoOrden getEstadoOrdenById(Integer id) throws Exception {
        return this.get(id);
    }

    public String getEstadoOrdenByIdToJson(Integer id) throws Exception {
        return this.toJson(getEstadoOrdenById(id));
    }
}
