package com.TallerMecanico.rest;
import java.util.HashMap;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import com.TallerMecanico.rest.controller.dao.services.PersonaServices;

@Path("Person")
public class PersonaApi {
    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllGenerators() {
        HashMap map = new HashMap<>();
        PersonaServices ps = new PersonaServices();
        map.put("msg", "Ok");
        map.put("data", ps.listAll().toArray());
        if (ps.listAll().isEmpty()){
            map.put("data", new Object[]{});
        }
        return Response.ok(map).build();
    }

    //
   

    //
    @Path ("/save")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response save(HashMap map){
        //TODO
        //VALIDATION (poner en la practica y trabajo final)-- como que la cedula no se repita y asi
        //para acceder a los datos del HashMap es map.get --BAD REQUEST
        com.TallerMecanico.rest.controller.dao.services.PersonaServices ps= new PersonaServices();
        ps.getPersona().setNombre(map.get("nombre").toString());
        ps.getPersona().setApellido(map.get("apellido").toString());
        ps.getPersona().setTelefono(map.get("telefono").toString());
        ps.getPersona().setEmail(map.get("email").toString());
        ps.getPersona().setDireccion(map.get("direccion").toString());
        ps.getPersona().setTipodeIdentificacion(map.get("tipodeIdentificacion").toString());
        ps.getPersona().setNumeroDeIdentificacion(map.get("numeroDeIdentificacion").toString());
        
       
        HashMap res = new HashMap<>(); 
        try{
            ps.save();
                res.put("msg","OK");
                res.put("data","Persona registrado correctamente");
                return Response.ok(res).build();
        } catch (Exception e){
            res.put("msg","Error");
            res.put("data", e.toString());
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(res).build();
            //TODO
        }
    }
}
