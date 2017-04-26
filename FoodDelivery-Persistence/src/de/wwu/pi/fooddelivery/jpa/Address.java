package de.wwu.pi.fooddelivery.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Address implements java.io.Serializable {
	private static final long serialVersionUID = 4965400399083190632L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int addressId;
	
	@NotNull(message="Street required")
	@Size(min=1, message="Street required")
	protected String street;
	
	@NotNull(message="Street number required")
	@Size(min=1, max=10, message="Street number required")
	protected String streetNo;
	
	//regex
	@NotNull(message="Zip code required")
	@Size(min=5, max=5, message="Zip code required")
	protected String zip;
	
	@NotNull(message="City required")
	@Size(min=1, max=10, message="City required")
	protected String city;
	
	@Size(max=1000, message="Space for additional information is limited")
	protected String additionalLocationInformation;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAdditionalLocationInformation() {
		return additionalLocationInformation;
	}

	public void setAdditionalLocationInformation(String additionalLocationInformation) {
		this.additionalLocationInformation = additionalLocationInformation;
	}

	@Override
	public String toString() {
		return street + " " + streetNo + ", " + zip + " " + city + " [addressId=" + addressId + "]";
	}
}