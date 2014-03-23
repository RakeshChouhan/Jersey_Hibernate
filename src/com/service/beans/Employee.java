/**
 * 
 */
package com.service.beans;

import java.io.Serializable;

/**
 * @author chouhan_r
 *
 */
public class Employee implements Serializable {
	private String empName;
	private double empSal;
	private int empId;
	private String empAddr;

	public Employee() {

	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	
	/**
	 * @param empName
	 *            the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empSal
	 */
	public double getEmpSal() {
		return empSal;
	}
	
	/**
	 * @param empSal
	 *            the empSal to set
	 */
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId
	 *            the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the empAddr
	 */
	public String getEmpAddr() {
		return empAddr;
	}
	
	/**
	 * @param empAddr
	 *            the empAddr to set
	 */
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}


}
