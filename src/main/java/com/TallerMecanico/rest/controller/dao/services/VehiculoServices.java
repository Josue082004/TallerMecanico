package com.TallerMecanico.rest.controller.dao.services;
import com.TallerMecanico.rest.controller.dao.VehiculoDao;
import com.TallerMecanico.rest.controller.tda.list.LinkedList;
import com.TallerMecanico.rest.models.Vehiculo;

public class VehiculoServices {
    private VehiculoDao obj;

    public VehiculoServices() {
        obj = new VehiculoDao();
    }
    
    
    public Boolean save() throws Exception {
        return obj.save();
    }

    public LinkedList listAll() {
        return obj.getListAll();
    }

    public Vehiculo getVehiculo() {
        return obj.getVehiculo();
    }

    public void setVehiculo(Vehiculo vehiculo) {
        obj.setVehiculo(vehiculo);
    }

}

