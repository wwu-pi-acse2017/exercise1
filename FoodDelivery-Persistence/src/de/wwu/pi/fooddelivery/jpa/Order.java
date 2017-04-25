package de.wwu.pi.fooddelivery.jpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Order implements java.io.Serializable {
	private static final long serialVersionUID = 4965400399083190632L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int orderId;
	
	// TODO date
	@NotNull
	protected String orderDate;
	
	//TODO time
	@NotNull
	protected String deliveryTime;
	
	@Size(max=1000, message="Space for additional information is limited")
	protected String additionalOrderInformation;
	
	@OneToMany
	protected Collection<OrderPosition> orderPositions;
	
	@OneToOne
	protected User user;

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getAdditionalOrderInformation() {
		return additionalOrderInformation;
	}

	public void setAdditionalOrderInformation(String additionalOrderInformation) {
		this.additionalOrderInformation = additionalOrderInformation;
	}

	public Collection<OrderPosition> getOrderPositions() {
		return orderPositions;
	}

	public void setOrderPositions(Collection<OrderPosition> orderPositions) {
		this.orderPositions = orderPositions;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
