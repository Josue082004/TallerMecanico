package com.TallerMecanico.rest.controller.dao.services;
import com.TallerMecanico.rest.controller.dao.ClienteDao;
import com.TallerMecanico.rest.controller.tda.list.LinkedList;
import com.TallerMecanico.rest.models.Cliente;

public class ClienteServices {
    private ClienteDao obj;

    public ClienteServices() {
        obj = new ClienteDao();
    }
    
    
    public Boolean save() throws Exception {
        return obj.save();
    }

    public LinkedList listAll() {
        return obj.getListAll();
    }

    public Cliente getCliente() {
        return obj.getCliente();
    }

    public void setCliente(Cliente cliente) {
        obj.setCliente(cliente);
    }

}

