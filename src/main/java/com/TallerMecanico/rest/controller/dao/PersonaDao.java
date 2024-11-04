package com.TallerMecanico.rest.controller.dao;
import java.util.function.ToIntBiFunction;
import com.TallerMecanico.rest.controller.dao.implement.AdapterDao;
import com.TallerMecanico.rest.controller.tda.list.LinkedList;
import com.TallerMecanico.rest.models.Persona;

public class PersonaDao extends AdapterDao<Persona> {
    private Persona persona;
    private LinkedList listAll;
    public PersonaDao() {
        super(Persona.class);
    }
    public Persona getPersona() {
        if (persona == null) {
            persona = new Persona();
        }
        return this.persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public LinkedList getListAll() {
        if(listAll == null){
            this.listAll = listAll();
        }
        return listAll;
    }

    public Boolean save() throws Exception {
        Integer id = getListAll().getSize()+1;
        persona.setId(id);
        this.persist(this.persona);
        return true;
    }
    
}

