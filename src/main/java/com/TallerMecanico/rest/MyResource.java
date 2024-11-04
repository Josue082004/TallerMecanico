package com.TallerMecanico.rest;

import java.util.HashMap;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.TallerMecanico.rest.controller.dao.services.PersonaServices;


/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests for Persona.
     *
     * @return Response that will be returned as a JSON response.
     */
    @GET
    @Path("/persona") // Cambié la ruta para distinguir entre los métodos
    @Produces(MediaType.APPLICATION_JSON)
    public Response getpersona() {
        HashMap<String, Object> mapa = new HashMap<>();
        PersonaServices personaServices = new PersonaServices();
        String aux = "";
        
        try {
            personaServices.getPersona().setNombre("Juan");
            personaServices.getPersona().setApellido("Perez");
            personaServices.getPersona().setTelefono("1234567890");
            personaServices.getPersona().setEmail("juan@gmail.com");
            personaServices.getPersona().setDireccion("Calle 123");
            personaServices.getPersona().setTipodeIdentificacion("Cedula");
            personaServices.getPersona().setNumeroDeIdentificacion("1234567890");
            personaServices.save();
            aux = "La lista está vacía: " + personaServices.listAll().isEmpty();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        mapa.put("msg", "Ok");
        mapa.put("data", "test " + aux);
        return Response.ok(mapa).build();
    }
}
