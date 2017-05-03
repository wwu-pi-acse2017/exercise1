package de.wwu.pi.fooddelivery.beans;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.convert.Converter;
import javax.validation.ConstraintViolationException;

import de.wwu.pi.fooddelivery.ejb.OrderService;
import de.wwu.pi.fooddelivery.ejb.VendorService;
import de.wwu.pi.fooddelivery.jpa.Order;
import de.wwu.pi.fooddelivery.jpa.OrderPosition;
import de.wwu.pi.fooddelivery.jpa.Vendor;
import de.wwu.pi.fooddelivery.web.SelectItemsConverter;
import de.wwu.pi.fooddelivery.web.Util;

/**
 * Backing bean for the create order page.
 */

@ManagedBean
@SessionScoped
public class ProcessSendOrder {
	//private int orderId;
	private Order order;
	private String errorMessage;
	private Vendor vendor;
	private OrderPosition orderPosition;
	private Collection<Vendor> vendors;
	
	@EJB
	private OrderService orderEjb;
	
	@EJB
	private VendorService vendorEjb;

//	public void ensureInitialized() {
//		try{
//			if(orderEjb.getOrder(orderId) != null)
//				return; // Success
//		} catch(EJBException e) {
//			e.printStackTrace();
//		}
//		Util.redirectToRoot();
//	}
	
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
	
	public String submit_step3_addPosition(){
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
			return "sendOrder_step4_ask";
	}
	
	public String submit_step4_ask(){
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
			return "sendOrder_step5_selectUser";
	}
	
	public String submit_step5_selectUser(){
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
			return "index";
	}
	
	public void cancel() {
		reset();
		
		Util.redirectToRoot();
	}
	
	public void reset() {
		order = null;
		vendor = null;
		orderPosition = null;
		//orderId = 0;
		vendors = null;
		errorMessage = null;
	}
	
	public String getError() {
		return errorMessage != null ? errorMessage : "";
	}
	
//	public int getOrderId() {
//		return orderId;
//	}
//
//	public void setOrderId(int orderId) {
//		this.orderId = orderId;
//	}
	
	public Converter createVendorConverter(){
		return new SelectItemsConverter<Vendor>(getVendors());
	}
	
	public Collection<Vendor> getVendors(){
		// Necessary to store vendors temporarily, otherwise selection will not validate 
		// (EJB is not available during internal JSF validation phase)
		if(vendors == null) vendors = vendorEjb.getAllVendors();
		return vendors;
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
}
