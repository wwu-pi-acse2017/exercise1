package de.wwu.pi.fooddelivery.jpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Vendor implements java.io.Serializable {
	private static final long serialVersionUID = 4965400399083190632L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int vendorId;
	
	@NotNull(message="Name required")
	@Size(min=1, message="Name required")
	protected String name;
	
	@Pattern(regexp="[0-9]*",message="Zip code - illegal character (only digits allowed)")
	@Size(min=5, max=5, message="Zip code must have 5 digits")
	protected String zip;
	
	@ManyToMany
	protected Collection<Product> products;

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public Collection<Product> getProducts() {
		return products;
	}

	public void setProducts(Collection<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return name + " [vendorId=" + vendorId + ", zip=" + zip + "]";
	}
}
