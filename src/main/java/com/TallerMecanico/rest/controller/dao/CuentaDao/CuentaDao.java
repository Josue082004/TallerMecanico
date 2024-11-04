package com.TallerMecanico.rest.controller.dao.CuentaDao;

import com.TallerMecanico.rest.controller.dao.implement.AdapterDao;
import com.TallerMecanico.rest.controller.tda.list.LinkedList;
import com.TallerMecanico.rest.models.Cuenta;

public class CuentaDao extends AdapterDao<Cuenta>{
    private Cuenta cuenta = new Cuenta();
    private LinkedList listAll;

    public CuentaDao() {
       super(Cuenta.class);
    }
    public Cuenta getCuenta() {
        if(cuenta == null) {
            cuenta = new Cuenta();
        }
        return this.cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void setPersona(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public LinkedList getListAll() {
        if(listAll == null) {
            listAll = new LinkedList();
        }
        return this.listAll;
    }

    public Boolean save() throws Exception {
        Integer id = getListAll().getSize()+1;
        cuenta.setId(id);
        this.persist(this.cuenta);
        this.listAll = listAll();
        return true;

    }
}
