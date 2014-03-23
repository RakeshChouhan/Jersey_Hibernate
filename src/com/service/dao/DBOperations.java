package com.service.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.service.beans.Department;
import com.service.beans.Employee;
import com.service.dao.helper.HibernateUtil;

/**
 * 
 * @author chouhan_r
 * 
 */
public class DBOperations {
	private SessionFactory sf = HibernateUtil.getSessionFactory();
	/**
	 * 
	 * @author chouhan_r
	 * @date Mar 3, 2014
	 * @description getAllEmployee
	 * @return List<Employee>
	 */
	public List<Employee> getAllEmployee() {
		List<Employee> alEmployee = new ArrayList<Employee>();

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		alEmployee = (List<Employee>) session.createQuery(
				"from Employee").list();

		tx.commit();
		session.close();

		// alEmployee.add(emp);
		return alEmployee;
	}

	/**
	 * 
	 * @author chouhan_r
	 * @date Mar 3, 2014
	 * @description getEmployeeById
	 * @param id
	 * @return Object Employee
	 */
	public Employee getEmployeeById(int id) {
		Employee emp = new Employee();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		emp = (Employee) session.load(Employee.class, id);
		tx.commit();
		session.close();

		return emp;
	}

	/**
	 * 
	 * @author chouhan_r
	 * @date Mar 3, 2014
	 * @description getAllEmployee
	 * @return List<Employee>
	 */
	public List<Department> getAllDepartment() {
		List<Department> alDepartment = new ArrayList<Department>();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		alDepartment = (List<Department>) session
				.createQuery("from Department")
				.list();

		tx.commit();
		session.close();
		return alDepartment;
	}

	/**
	 * 
	 * @author chouhan_r
	 * @date Mar 3, 2014
	 * @description getDepartmentById
	 * @param id
	 * @return Object Department
	 */
	public Department getDepartmentById(int id) {
		Department dept = new Department();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		dept = (Department) session.load(Department.class, id);
		tx.commit();
		session.close();
		return dept;
	}

	public static void main(String args[]) {
		DBOperations db = new DBOperations();
		System.out.println(db.getEmployeeById(1));
		/*
		 * SessionFactory sf = HibernateUtil.getSessionFactory();
		 * System.out.println("Got SessionFactory ::::::::;" + sf); Session
		 * session = sf.openSession();
		 * 
		 * Transaction tx = session.beginTransaction();
		 * 
		 * // System.out.println(session.load(Employee.class, 1));
		 * System.out.println
		 * (session.createQuery("from Employee").list().size());
		 * 
		 * tx.commit(); session.close();
		 */

	}
}
