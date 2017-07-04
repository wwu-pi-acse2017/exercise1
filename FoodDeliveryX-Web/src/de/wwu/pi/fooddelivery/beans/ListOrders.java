package de.wwu.pi.fooddelivery.beans;

import java.util.Collection;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import de.wwu.pi.fooddelivery.ejb.OrderService;
import de.wwu.pi.fooddelivery.jpa.Order;

@ManagedBean
public class ListOrders {
	
	@EJB
	OrderService orderEjb;

	private Collection<Order> orders;
	
	public Collection<Order> getOrders(){
		if(orders == null)
			orders = orderEjb.getAll();
		return orders;
	}
}
