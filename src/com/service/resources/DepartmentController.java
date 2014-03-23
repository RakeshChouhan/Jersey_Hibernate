/**
 * 
 */
package com.service.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.service.beans.Department;
import com.service.dao.DBOperations;

/**
 * @author chouhan_r
 *
 */
@Path("/department")
public class DepartmentController {
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Department> getAllDeparments() {
		List<Department> alDeparments = new DBOperations().getAllDepartment();
		return alDeparments;
	}
	
	@GET
	@Path("{deptId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Department getDepartmentById(@PathParam("deptId") int deptId) {
		Department dept = new DBOperations().getDepartmentById(deptId);
		return dept;
	}
	

}
