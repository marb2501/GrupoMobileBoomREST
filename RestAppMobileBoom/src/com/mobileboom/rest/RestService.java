package com.mobileboom.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.mobileboom.bean.Publicacion;
import com.mobileboom.dao.PublicacionDAO;

@Path("/acceso")
public class RestService {

	static Logger log = Logger.getLogger(RestService.class.getName());
	Gson g = new Gson ();
	
	@GET
	@Path("/publications")
	@Consumes("application/json")		
	public Response listPosts(){		
		String ingEntJson = new String();
		PublicacionDAO postDAO = new PublicacionDAO();
		
		try {
			System.out.println("Invoca listado de Publicaciones");
			List<Publicacion> lstPost = postDAO.buscaPublicaciones(1);
			ingEntJson = g.toJson(lstPost);			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return Response.status(200).entity(ingEntJson).build();
	}
}
