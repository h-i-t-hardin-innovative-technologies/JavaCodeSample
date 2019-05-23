package com.componentwise.eval;

import java.io.Serializable;

/**
 * This demonstrates a class that is available to exist in an HTTP session. The 
 * bare minimum is that the class needs to implement Serializable. The addition of hashCode/equals
 * lets the tests succeed.
 * 
 * @author bhardin
 * 
 *
 */
public class UserKey implements Serializable {

	private static final long serialVersionUID = -4984003611317904715L;
	
	private String name;
	
	private String userid;
	
	public UserKey() {}

	public UserKey(String name, String userid) {
		super();
		this.name = name;
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public String getUserID() {
		return userid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
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
		UserKey other = (UserKey) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserKey [name=" + name + ", userid=" + userid + "]";
	}


}
