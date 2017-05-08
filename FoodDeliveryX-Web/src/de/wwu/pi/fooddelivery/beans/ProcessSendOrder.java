package de.wwu.pi.fooddelivery.beans;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.convert.Converter;
import javax.validation.ConstraintViolationException;

import de.wwu.pi.fooddelivery.ejb.OrderService;
import de.wwu.pi.fooddelivery.ejb.UserService;
import de.wwu.pi.fooddelivery.ejb.VendorService;
import de.wwu.pi.fooddelivery.jpa.Order;
import de.wwu.pi.fooddelivery.jpa.OrderPosition;
import de.wwu.pi.fooddelivery.jpa.Product;
import de.wwu.pi.fooddelivery.jpa.User;
import de.wwu.pi.fooddelivery.jpa.Vendor;
import de.wwu.pi.fooddelivery.web.SelectItemsConverter;
import de.wwu.pi.fooddelivery.web.Util;

/**
 * Backing bean for the create order page.
 */

@ManagedBean
@SessionScoped
public class ProcessSendOrder {
	private Order order;
	private String errorMessage;
	private Vendor vendor;
	private Collection<Vendor> vendors;
	private OrderPosition orderPosition;
	private User user;
	private Collection<User> users;
	
	@EJB
	private OrderService orderEjb;
	
	@EJB
	private VendorService vendorEjb;
	
	@EJB
	private UserService userEjb;
	
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
			errorMessage = "Order not created: " + Util.getConstraintMessage(e);
		} catch (ConstraintViolationException e) {
			errorMessage = "Order not created: " + Util.getConstraintMessage(e);
		}

		// Navigation
		if (errorMessage != null)
			return null;
		else
			return "sendOrder_step2_selectVendor";
	}
	
	public String submit_step2_selectVendor(){
		// Action
		try {
			errorMessage = null;
			
			if(vendor == null) errorMessage = "Vendor is required";
			order.setVendor(vendor);
			
			orderEjb.validate(getOrder());
		} catch (EJBException e) {
			errorMessage = "Order not created: " + Util.getConstraintMessage(e);
		} catch (ConstraintViolationException e) {
			errorMessage = "Order not created: " + Util.getConstraintMessage(e);
		}

		// Navigation
		if (errorMessage != null)
			return null;
		else
			return "sendOrder_step3_addPosition";
	}
	
	public String submit_step3_addOrderPosition(){
		// Action
		try {
			errorMessage = null;
			
			if(orderPosition == null) errorMessage = "Order position is required";
			order.addOrderPosition(orderPosition);
			orderPosition = null;
			
			orderEjb.validate(getOrder());
		} catch (EJBException e) {
			errorMessage = "Order not created: " + Util.getConstraintMessage(e);
		} catch (ConstraintViolationException e) {
			errorMessage = "Order not created: " + Util.getConstraintMessage(e);
		}

		// Navigation
		if (errorMessage != null)
			return null;
		else
			return "sendOrder_step4_ask";
	}
	
	public static enum Step4Options {
		YES,
		NO
	}
	
	public String submit_step4_ask(Step4Options answer){
		// Navigation
		switch(answer){
		case YES:
			return "sendOrder_step3_addPosition";
		case NO:
			return "sendOrder_step5_selectUser";
		}
		return null;
	}
	
	public String submit_step5_selectUser(){
		// Action
		try {
			errorMessage = null;
			
			order.setUser(getUser());
			orderEjb.validate(getOrder());
		} catch (EJBException e) {
			errorMessage = "Order not created: " + Util.getConstraintMessage(e);
		} catch (ConstraintViolationException e) {
			errorMessage = "Order not created: " + Util.getConstraintMessage(e);
		}

		// Navigation
		if (errorMessage != null)
			return null;
		else
			return "sendOrder_step6_showOrder";
	}
	
	public String submit_step6_showOrder(){
		// Navigation
		return "index";
	}
	
	public void cancel() {
		reset();
		
		Util.redirectToRoot();
	}
	
	public void reset() {
		order = null;
		vendor = null;
		vendors = null;
		orderPosition = null;
		user = null;
		users = null;
		errorMessage = null;
	}
	
	public String getError() {
		return errorMessage != null ? errorMessage : "";
	}
	
	public Converter createVendorConverter(){
		return new SelectItemsConverter<Vendor>(getVendors());
	}
	
	public Collection<Vendor> getVendors(){
		// Necessary to store vendors temporarily, otherwise selection will not validate 
		// (EJB is not available during internal JSF validation phase)
		if(vendors == null) vendors = vendorEjb.getAll();
		return vendors;
	}
	
	public Converter createProductConverter(){
		return new SelectItemsConverter<Product>(this.vendor.getProducts());
	}
	
	public Converter createUserConverter(){
		return new SelectItemsConverter<User>(getUsers());
	}
	
	public Collection<User> getUsers(){
		// Necessary to store users temporarily, otherwise selection will not validate 
		// (EJB is not available during internal JSF validation phase)
		if(users == null) users = userEjb.getAll();
		return users;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	
	public OrderPosition getOrderPosition() {
		if (orderPosition == null)
			orderPosition = new OrderPosition();
		return orderPosition;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
