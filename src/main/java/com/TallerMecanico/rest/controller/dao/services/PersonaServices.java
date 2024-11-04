package com.TallerMecanico.rest.controller.dao.services;
import com.TallerMecanico.rest.controller.dao.PersonaDao;
import com.TallerMecanico.rest.controller.tda.list.LinkedList;
import com.TallerMecanico.rest.models.Persona;

public class PersonaServices {
    private PersonaDao obj;

    public PersonaServices() {
        obj = new PersonaDao();
    }
    
    
    public Boolean save() throws Exception {
        return obj.save();
    }

    public LinkedList listAll() {
        return obj.getListAll();
    }

    public Persona getPersona() {
        return obj.getPersona();
    }

    public void setPersona(Persona persona) {
        obj.setPersona(persona);
    }

}

