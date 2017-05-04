package de.wwu.pi.fooddelivery.jpa;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import de.wwu.pi.fooddelivery.constraints.IsAdult;

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
	
	@NotNull
	@Past
	@IsAdult // Custom validation
	protected Date birthDate;

	@NotNull(message="IBAN required")
	@Size(min=15, max=34, message="Incorrect IBAN (must be between 15 and 34 characters)")
	protected String iban;
	
	@NotNull(message="BIC required")
	@Size(min=8, max=11, message="Incorrect BIC (must be between 8 and 11 characters)")
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
	
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return lastName + ", "+ firstName + " [userId=" + userId + "]";
	}
}
