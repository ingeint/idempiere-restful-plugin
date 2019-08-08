package com.ingeint.ws;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class PartnerWS {

	@GET
	@Path("/")
	@Produces(MediaType.TEXT_PLAIN)
	public String get() {
		return "get";
	}
	

	@PUT
	@Path("/")
	@Produces(MediaType.TEXT_PLAIN)
	public String put() {
		return "put";
	}
	
	@POST
	@Path("/")
	@Produces(MediaType.TEXT_PLAIN)
	public String post() {
		return "post";
	}
	
	@DELETE
	@Path("/")
	@Produces(MediaType.TEXT_PLAIN)
	public String delete() {
		return "delete";
	}

}