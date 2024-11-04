package com.TallerMecanico.rest.controller.dao;
import java.util.function.ToIntBiFunction;
import com.TallerMecanico.rest.controller.dao.implement.AdapterDao;
import com.TallerMecanico.rest.controller.tda.list.LinkedList;
import com.TallerMecanico.rest.models.Vehiculo;

public class VehiculoDao extends AdapterDao<Vehiculo> {
    private Vehiculo vehiculo;
    private LinkedList listAll;
    public VehiculoDao() {
        super(Vehiculo.class);
    }
    public Vehiculo getVehiculo() {
        if (vehiculo == null) {
            vehiculo = new Vehiculo();
        }
        return this.vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public LinkedList getListAll() {
        if(listAll == null){
            this.listAll = listAll();
        }
        return listAll;
    }

    public Boolean save() throws Exception {
        Integer id = getListAll().getSize()+1;
        vehiculo.setId(id);
        this.persist(this.vehiculo);
        return true;
    }
    
}

