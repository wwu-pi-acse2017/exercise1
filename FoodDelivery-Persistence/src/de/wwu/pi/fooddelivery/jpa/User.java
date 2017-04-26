package de.wwu.pi.fooddelivery.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
	
	@NotNull(message="Lastname required")
	@Size(min=1, message="Lastname required")
	protected String lastName;
	
	//TODO Date
	@NotNull
	protected String birthDate;

	@NotNull(message="IBAN required")
	@Size(min=15, max=34, message="IBAN required")
	protected String iban;
	
	@NotNull(message="BIC required")
	@Size(min=8, max=11, message="BIC required")
	protected String bic;
	
	@OneToOne(cascade=CascadeType.ALL)
	protected Address address;

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
	
	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return lastName + ", "+ firstName + " [userId=" + userId + "]";
	}
}
