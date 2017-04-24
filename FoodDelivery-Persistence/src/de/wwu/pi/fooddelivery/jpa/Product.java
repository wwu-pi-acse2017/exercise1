package de.wwu.pi.fooddelivery.jpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Product implements java.io.Serializable {
	private static final long serialVersionUID = 4965400399083190632L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int productId;
	
	@NotNull(message="Name required")
	@Size(min=1, message="Name required")
	protected String name;

	@ManyToMany
	@NotNull
	protected Collection<Vendor> vendors;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Vendor> getVendor() {
		return vendors;
	}

	public void setVendor(Collection<Vendor> vendors) {
		this.vendors = vendors;
	}
}
