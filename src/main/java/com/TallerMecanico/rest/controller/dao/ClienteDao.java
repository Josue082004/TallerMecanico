package com.TallerMecanico.rest.controller.dao;

import com.TallerMecanico.rest.controller.dao.implement.AdapterDao;
import com.TallerMecanico.rest.controller.tda.list.LinkedList;
import com.TallerMecanico.rest.models.Cliente;

public class ClienteDao extends AdapterDao<Cliente> {
    private Cliente cliente;
    private LinkedList listAll;

    public ClienteDao() {
        super(Cliente.class);
    }

    public Cliente getCliente() {
        if (cliente == null) {
            cliente = new Cliente();
        }
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LinkedList getListAll() {
        if (listAll == null) {
            this.listAll = listAll();
        }
        return listAll;
    }

    public Boolean save() throws Exception {
        Integer id = getListAll().getSize() + 1;
        cliente.setId(id);
        this.persist(this.cliente);
        return true;
    }
}