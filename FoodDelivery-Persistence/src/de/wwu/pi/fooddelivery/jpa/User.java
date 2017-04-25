package de.wwu.pi.fooddelivery.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User implements java.io.Serializable {
	private static final long serialVersionUID = 4965400399083190632L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int userId;
	
	@NotNull(message="Firstname required")
	@Size(min=1, message="Firstname required")
	protected String firstName;
	
	//@NotNull(message="Lastname required")
	//@Size(min=1, message="Lastname required")
	protected String lastName;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
