/**
 * 
 */
package com.service.beans;

import java.io.Serializable;

/**
 * @author chouhan_r
 *
 */
public class Department implements Serializable {
	private int deptId;
	private String deptName;
	private String deptDesc;


	/**
	 * 
	 */
	public Department() {
	}


	/**
	 * @return the deptId
	 */
	public int getDeptId() {
		return deptId;
	}

	/**
	 * @param deptId
	 *            the deptId to set
	 */
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * @param deptName
	 *            the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
	 * @return the deptDesc
	 */
	public String getDeptDesc() {
		return deptDesc;
	}

	/**
	 * @param deptDesc
	 *            the deptDesc to set
	 */
	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}

}
