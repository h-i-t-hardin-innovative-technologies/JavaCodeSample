package com.componentwise.eval;

import java.util.Date;

/**
 * Oiginal (given) Employee class
 * 
 * @author bhardin
 *
 */
public class EmployeeOrig {
	
	private int id;
	
	private String name;
	
	private Date dateHired;

	private boolean managerFlag;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	public boolean isManager() {
		return managerFlag;
	}

	public void setManager(boolean managerFlag) {
		this.managerFlag = managerFlag;
	}
	
	
}
