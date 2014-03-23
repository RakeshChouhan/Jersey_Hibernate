/**
 * 
 */
package com.service.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.service.beans.Employee;
import com.service.dao.DBOperations;

/**
 * @author chouhan_r
 *
 */
@Path("/employee")
public class EmployeeController {

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAllEmployees() {
		List<Employee> alEmployee = new ArrayList<Employee>();
		alEmployee = new DBOperations().getAllEmployee();
		return alEmployee;
	}

	@GET
	@Path("{empId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployeeById(@PathParam("empId") int empId) {
		Employee emp = new DBOperations().getEmployeeById(empId);
		return emp;
	}

}
