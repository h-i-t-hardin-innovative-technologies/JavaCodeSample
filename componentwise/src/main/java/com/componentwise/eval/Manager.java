package com.componentwise.eval;

/**
 * The Manager class extends the Employee class,
 * overriding the 'isManager' call (always returning true)
 * 
 * @author bhardin
 *
 */
public class Manager extends Employee {
	
	public Manager() {
		super();
	} 
	
	@Override
	public boolean isManager() {
		return true;
	}

	@Override
	public String toString() {
		return "Manager [getId()=" + getId() + ", getName()=" + getName() + ", getDateHired()=" + getDateHired()
				+ ", getType()=" + getType() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", isManager=true]";
	}

}
