package de.wwu.pi.fooddelivery.jpa;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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
	
	@ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch=FetchType.EAGER)
	protected Set<Product> products;
	
	@OneToMany(mappedBy = "vendor", targetEntity=Order.class, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch=FetchType.EAGER)
	protected Set<Order> orders;

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
		if(products == null) products = new HashSet<Product>();
		
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	public void addProduct(Product product){
		this.products.add(product);
		product.addVendor(this);
	}
	
	public void removeProduct(Product product){
		this.products.remove(product);
		product.removeVendor(this);
	}
	
	public Collection<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
	public void addOrder(Order order){
		this.orders.add(order);
	}
	
	public void removeOrder(Order order){
		this.orders.remove(order);
	}

	@Override
	public String toString() {
		return name + " [vendorId=" + vendorId + ", zip=" + zip + "]";
	}
}
