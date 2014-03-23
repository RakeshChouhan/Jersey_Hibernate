package com.service.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.service.beans.Employee;

@Path("/greet")
public class Greetings {
	@GET
	@Path("/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee sayHello(@PathParam("name") String name) {
		Employee emp = new Employee();

		return emp;
	}

	/*
	 * @GET
	 * @Path("/{name}")
	 * @Produces(MediaType.TEXT_PLAIN) public Response
	 * sayHello(@PathParam("name") String name) { return
	 * Response.status(200).entity("Hello " + name).build(); }
	 */
}
