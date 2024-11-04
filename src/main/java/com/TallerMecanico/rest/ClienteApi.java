package com.TallerMecanico.rest;

import java.util.HashMap;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.TallerMecanico.rest.controller.dao.services.ClienteServices;
import com.TallerMecanico.rest.models.Cliente;
import com.TallerMecanico.rest.models.Persona;
import com.TallerMecanico.rest.models.Vehiculo;

@Path("Cliente")
public class ClienteApi {

    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllClientes() {
        HashMap<String, Object> map = new HashMap<>();
        ClienteServices cs = new ClienteServices();
        map.put("msg", "Ok");
        map.put("data", cs.listAll().toArray());
        if (cs.listAll().isEmpty()) {
            map.put("data", new Object[]{});
        }
        return Response.ok(map).build();
    }

    @Path("/save")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response save(HashMap<String, Object> map) {
        // VALIDATION (poner en la practica y trabajo final)-- como que la cedula no se repita y asi
        // para acceder a los datos del HashMap es map.get --BAD REQUEST
        ClienteServices cs = new ClienteServices();
        Persona persona = new Persona();
        Vehiculo vehiculo = new Vehiculo();

        persona.setNombre(map.get("nombre").toString());
        persona.setApellido(map.get("apellido").toString());
        persona.setTelefono(map.get("telefono").toString());
        persona.setEmail(map.get("email").toString());
        persona.setDireccion(map.get("direccion").toString());
        persona.setTipodeIdentificacion(map.get("tipodeIdentificacion").toString());
        persona.setNumeroDeIdentificacion(map.get("numeroDeIdentificacion").toString());

        vehiculo.setMarca(map.get("marca").toString());
        vehiculo.setModelo(map.get("modelo").toString());
        vehiculo.setAnio(map.get("anio").toString());
        vehiculo.setPlaca(map.get("placa").toString());

        // Proporcionar un id al crear una instancia de Cliente
        Integer id = cs.listAll().getSize() + 1;
        Cliente cliente = new Cliente(id, persona, vehiculo);
        cs.setCliente(cliente);

        HashMap<String, Object> res = new HashMap<>();
        try {
            cs.save();
            res.put("msg", "OK");
            res.put("data", "Cliente registrado correctamente");
            return Response.ok(res).build();
        } catch (Exception e) {
            res.put("msg", "Error");
            res.put("data", e.toString());
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(res).build();
        }
    }
}