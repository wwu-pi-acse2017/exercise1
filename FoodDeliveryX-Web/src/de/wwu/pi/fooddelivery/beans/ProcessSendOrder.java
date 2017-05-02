package de.wwu.pi.fooddelivery.beans;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.ConstraintViolationException;

import de.wwu.pi.fooddelivery.ejb.OrderService;
import de.wwu.pi.fooddelivery.jpa.Order;
import de.wwu.pi.fooddelivery.web.Util;

/**
 * Backing bean for the create order page.
 */

@ManagedBean
@SessionScoped
public class ProcessSendOrder {
	private int orderId;
	private Order order;
	private String errorMessage;

	@EJB
	private OrderService orderEjb;

	public void ensureInitialized() {
		try{
			if(orderEjb.getOrder(orderId) != null)
				return; // Success
		} catch(EJBException e) {
			e.printStackTrace();
		}
		Util.redirectToRoot();
	}
	
	public Order getOrder() {
		if (order == null)
			order = new Order();
		return order;
	}

	public String submit_step1_createOrder() {
		// Action
		try {
			orderEjb.validate(getOrder());
			
			errorMessage = null;
		} catch (EJBException e) {
			errorMessage = "User not created: " + Util.getConstraintMessage(e);
		} catch (ConstraintViolationException e) {
			errorMessage = "User not created: " + Util.getConstraintMessage(e);
		}

		// Navigation
		if (errorMessage != null)
			return null;
		else
			return "sendOrder_step2_selectVendor";
	}
		
	public void cancel() {
		reset();
		
		Util.redirectToRoot();
	}
	
	public void reset() {
		order = null;
		orderId = 0;
		errorMessage = null;
	}
	
	public String getError() {
		return errorMessage != null ? errorMessage : "";
	}
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
}
