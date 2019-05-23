package com.componentwise.eval;

import java.time.LocalDate;

/**
 * This is the new employee base class that adds an employee type 
 * to distinguish between part-time and full-time employees. Either
 * regular employees or managers can be part-time. I also created a 
 * manager class that extends the employee class. The main difference
 * between the two classes is that the 'isManager' function returns false
 * in the Employee class and 'true in the Manager class. I have removed 
 * the managerFlag member variable
 *    
 * @author bhardin
 *
 */
public class Employee {
	
	private int id;
	
	private String name;
	
	private LocalDate dateHired;
	
	private EmployeeType type = EmployeeType.FULLTIME;

	public Employee( ) {}
	
	public boolean isManager() {
		return false;
	}
	
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

	public LocalDate getDateHired() {
		return dateHired;
	}

	public void setDateHired(LocalDate dateHired) {
		this.dateHired = dateHired;
	}

	public EmployeeType getType() {
		return type;
	}

	public void setType(EmployeeType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateHired == null) ? 0 : dateHired.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (dateHired == null) {
			if (other.dateHired != null)
				return false;
		} else if (!dateHired.equals(other.dateHired))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dateHired=" + dateHired + ", type=" + type + ", isManager=false]";
	}

}
