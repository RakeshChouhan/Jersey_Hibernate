package com.service.resources;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class AppController extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		System.out.println("Here I am");
		Set<Class<?>> setClass = new HashSet<Class<?>>();
		setClass.add(Greetings.class);
		setClass.add(EmployeeController.class);
		setClass.add(DepartmentController.class);
		return setClass;
	}

}
